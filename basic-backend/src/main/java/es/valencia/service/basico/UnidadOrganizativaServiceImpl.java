package es.valencia.service.basico;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.transaction.annotation.Transactional;

import es.valencia.entity.Responsable;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.UnidadOrganizativaException;
import es.valencia.repository.UnidadOrganizativaBDORepository;

@Named("unidadOrganizativaService")
public class UnidadOrganizativaServiceImpl implements UnidadOrganizativaService {

	private static final Logger LOG = LogManager.getLogger(UnidadOrganizativaServiceImpl.class.getName());

	public enum SustitutosGestoresResult {
		GESTORES, POSIBLES_SUSTITUTOS
	}

	@Inject
	private UnidadOrganizativaBDORepository repository;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = false, rollbackFor = UnidadOrganizativaException.class)
	public UnidadOrganizativaBDO addOrUpdateUnidad(Long kid, Map<String, Object> entidadMap) throws UnidadOrganizativaException {

		String uid = (String) entidadMap.get("codigoInvariable");
		if (StringUtils.isEmpty(uid))
			uid = ((Long) entidadMap.get("codigoBDO")).toString();
		if (StringUtils.isEmpty(uid))
			throw new RuntimeException("No existe valor con clave 'uid' en entidadMap");

		Long codigoBDO = (Long) entidadMap.remove("codigoBDO");
		String codigoOrganicoExterno = (String) entidadMap.remove("codigoOrganicoExterno");
		String codigoOrganicoInterno = (String) entidadMap.remove("codigoOrganicoInterno");
		String codigoInvariable = (String) entidadMap.remove("codigoInvariable");
		Boolean emisoraNI = (Boolean) entidadMap.remove("emisoraNI");
		Boolean receptoraNI = (Boolean) entidadMap.remove("receptoraNI");
		Boolean ambitoRestringidoEnvio = (Boolean) entidadMap.remove("ambitoRestringidoEnvio");
		Boolean ambitoRestringidoRecepcion = (Boolean) entidadMap.remove("ambitoRestringidoRecepcion");
		String nombreUnidadCas = (String) entidadMap.remove("nombreUnidadCas");
		String nombreUnidadVal = (String) entidadMap.remove("nombreUnidadVal");
		String nombreCargoCas = (String) entidadMap.remove("nombreCargoCas");
		String nombreCargoVal = (String) entidadMap.remove("nombreCargoVal");
		Boolean primerNivel = (Boolean) entidadMap.remove("primerNivel");
		Boolean vigente = (Boolean) entidadMap.remove("vigente");

		Integer forceUpdate = (Integer) entidadMap.remove("forceUpdate");
		UnidadOrganizativaBDO unidadOrganizativaBDO = null;

		unidadOrganizativaBDO = repository.findByUid(uid);
		if (unidadOrganizativaBDO == null) {
			if (emisoraNI == null || receptoraNI == null) {
				throw new RuntimeException("No existe valor con clave 'emisoraNI' o 'receptoraNI' en entidadMap. Estos valores se requieren para una unidad nueva.");
			} else {
				unidadOrganizativaBDO = new UnidadOrganizativaBDO(uid, codigoBDO, codigoOrganicoExterno, codigoOrganicoInterno, codigoInvariable,
						(emisoraNI == null) ? false : emisoraNI, (receptoraNI == null) ? false : receptoraNI, nombreUnidadCas, nombreUnidadVal,
						(primerNivel == null) ? false : primerNivel, (vigente == null) ? false : vigente,
						(ambitoRestringidoEnvio == null) ? false : ambitoRestringidoEnvio, (ambitoRestringidoRecepcion == null) ? false : ambitoRestringidoRecepcion);

			}
		} else {
			if (codigoBDO != null)
				unidadOrganizativaBDO.setCodigoBDO(codigoBDO);
			if (codigoOrganicoExterno != null)
				unidadOrganizativaBDO.setCodigoOrganicoExterno(codigoOrganicoExterno);
			if (codigoOrganicoInterno != null)
				unidadOrganizativaBDO.setCodigoOrganicoInterno(codigoOrganicoInterno);
			if (codigoInvariable != null)
				unidadOrganizativaBDO.setCodigoInvariable(codigoInvariable);
			if (emisoraNI != null)
				unidadOrganizativaBDO.setEmisoraNI(emisoraNI);
			if (receptoraNI != null)
				unidadOrganizativaBDO.setReceptoraNI(receptoraNI);
			if (ambitoRestringidoEnvio != null)
				unidadOrganizativaBDO.setAmbitoRestringidoEnvio(ambitoRestringidoEnvio);
			if (ambitoRestringidoRecepcion != null)
				unidadOrganizativaBDO.setAmbitoRestringidoRecepcion(ambitoRestringidoRecepcion);
			if (nombreUnidadCas != null)
				unidadOrganizativaBDO.setNombreUnidadCas(nombreUnidadCas);
			if (nombreUnidadVal != null)
				unidadOrganizativaBDO.setNombreUnidadVal(nombreUnidadVal);
			if (primerNivel != null)
				unidadOrganizativaBDO.setPrimerNivel(primerNivel);
			if (vigente != null)
				unidadOrganizativaBDO.setVigente(vigente);
			if (forceUpdate != null) 
				unidadOrganizativaBDO.setForceUpdate(forceUpdate);
			
		}

		Map<String, Object> responsableMap = (Map<String, Object>) entidadMap.get("responsable");
		if (responsableMap != null) {
			if (responsableMap.isEmpty()) {
				unidadOrganizativaBDO.setResponsable(null);
			} else {
				Responsable responsable = unidadOrganizativaBDO.getResponsable();
				unidadOrganizativaBDO.setResponsable(mapearUsuario(responsable, responsableMap));
				unidadOrganizativaBDO.getResponsable().setNombreCargoCas(nombreCargoCas);
				unidadOrganizativaBDO.getResponsable().setNombreCargoVal(nombreCargoVal);
			}
		}

		List<Responsable> sustitutos = mapearSustitutos((List<Map<String, Object>>) entidadMap.get("sustitutos"));

		if (sustitutos != null) {
			if (sustitutos.isEmpty()) {

				unidadOrganizativaBDO.clearSustitutos();
			} else {

				unidadOrganizativaBDO.actualizarSustitutos(sustitutos);
			}
		}

		String uidRedireccionBuzon = (String) entidadMap.get("redireccionBuzon");
		if (uidRedireccionBuzon != null) {
			if (StringUtils.isBlank(uidRedireccionBuzon)) {
				unidadOrganizativaBDO.setRedireccionBuzon(null);
			} else {
				UnidadOrganizativaBDO uoRedireccionBuzon = null;
				uoRedireccionBuzon = repository.findByUid(uidRedireccionBuzon);

				if (uoRedireccionBuzon == null)
					throw new UnidadOrganizativaException("La unidad organizativa a la que se quiere redireccionar el buzón no existe.", uidRedireccionBuzon);
				if (!uoRedireccionBuzon.isVigente())
					throw new UnidadOrganizativaException("La unidad organizativa a la que se quiere redireccionar el buzón no está vigente.", uidRedireccionBuzon);
				if (!uoRedireccionBuzon.isReceptoraNI())
					throw new UnidadOrganizativaException("La unidad organizativa a la que se quiere redireccionar el buzón no está vigente.", uidRedireccionBuzon);
				if (uoRedireccionBuzon.isAmbitoRestringidoRecepcion())
					throw new UnidadOrganizativaException("La unidad organizativa a la que se quiere redireccionar el buzón tiene el ámbito de recepción restringido.",
							uidRedireccionBuzon);

				unidadOrganizativaBDO.setRedireccionBuzon(uoRedireccionBuzon);
			}
		}

		String uidPadre = (String) entidadMap.get("uidPadre");
		if (uidPadre != null) {
			if (uidPadre.isEmpty()) {
				unidadOrganizativaBDO.setUnidadPadre(null);
			} else {
				UnidadOrganizativaBDO unidadOrganizativaBDOPadre = null;
				unidadOrganizativaBDOPadre = repository.findByUid(uidPadre);

				if (unidadOrganizativaBDOPadre == null)
					throw new UnidadOrganizativaException("La unidad organizativa padre no existe.", uidPadre);
				if (!unidadOrganizativaBDOPadre.isVigente())
					throw new UnidadOrganizativaException("La unidad organizativa padre no está vigente.", uidPadre);

				unidadOrganizativaBDO.setUnidadPadre(unidadOrganizativaBDOPadre);
			}
		}

		repository.save(unidadOrganizativaBDO);

		return unidadOrganizativaBDO;
	}

	private List<Responsable> mapearSustitutos(List<Map<String, Object>> listMaps) {

		if (listMaps == null)
			return null;

		List<Responsable> sustitutos = new ArrayList<>();

		for (Map<String, Object> map : listMaps) {

			if (map != null && !map.isEmpty()) {

				Responsable responsable = new Responsable();
				responsable.setNombreCargoCas((String) map.get("nombreCargoCas"));
				responsable.setNombreCargoVal((String) map.get("nombreCargoVal"));
				responsable.setApellido1((String) map.get("apellido1"));
				responsable.setApellido2((String) map.get("apellido2"));
				responsable.setNif((String) map.get("nif"));
				responsable.setNombre((String) map.get("nombre"));
				responsable.setUsuario((String) map.get("usuario"));
				sustitutos.add(responsable);
			}
		}

		return sustitutos;

	}

	private Responsable mapearUsuario(Responsable usuarioComplex, Map<String, Object> attMap) {

		if (attMap != null && !attMap.isEmpty()) {
			String nombre = (String) attMap.get("nombre");
			String apellido1 = (String) attMap.get("apellido1");
			String apellido2 = (String) attMap.get("apellido2");
			String nif = (String) attMap.get("nif");
			String usuario = (String) attMap.get("usuario");
			String nombreCargoCas = (String) attMap.get("nombreCargoCas");
			String nombreCargoVal = (String) attMap.get("nombreCargoVal");
			if (usuarioComplex == null)
				usuarioComplex = new Responsable(nombre, apellido1, apellido2, usuario, nombreCargoCas, nombreCargoVal, nif);
			else {
				if (nombre != null)
					usuarioComplex.setNombre(nombre);
				if (apellido1 != null)
					usuarioComplex.setApellido1(apellido1);
				if (apellido2 != null)
					usuarioComplex.setApellido2(apellido2);
				if (nif != null)
					usuarioComplex.setNif(nif);
				if (usuario != null)
					usuarioComplex.setUsuario(usuario);
				if (nombreCargoCas != null)
					usuarioComplex.setNombreCargoCas(nombreCargoCas);
				if (nombreCargoVal != null)
					usuarioComplex.setNombreCargoVal(nombreCargoVal);
			}
		}
		return usuarioComplex;

	}

	@Override
	@Transactional(readOnly = false)
	public void removeUnidad(Long kid) {

		try {

			UnidadOrganizativaBDO unidadOrganizativaBDO = repository.findById(kid).orElse(null);

			if (unidadOrganizativaBDO != null)
				repository.delete(unidadOrganizativaBDO);

		} catch (HibernateException e) {

			LOG.info("Se ha intentado borrar una unidad organizativa que no existe: " + kid, e);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public UnidadOrganizativaBDO getUnidadExistente(String uidUnidad) throws UnidadOrganizativaException {

		UnidadOrganizativaBDO unidad = repository.findByUid(uidUnidad);

		if (unidad == null)
			throw new UnidadOrganizativaException("Unidad propietaria no existe.", uidUnidad);

		return unidad;

	}

	@Override
	@Transactional(readOnly = true)
	public UnidadOrganizativaBDO getUnidadExistente(Long kidUnidad) throws UnidadOrganizativaException {

		UnidadOrganizativaBDO unidad = repository.findById(kidUnidad).orElse(null);

		if (unidad == null)
			throw new UnidadOrganizativaException("Unidad propietaria no existe.", String.valueOf(kidUnidad));

		return unidad;

	}

	@Override
	@Transactional(readOnly = true)
	public UnidadOrganizativaBDO getUnidadValida(String uidUnidad) throws UnidadOrganizativaException {

		UnidadOrganizativaBDO unidad = getUnidadExistente(uidUnidad);

		if (!unidad.isVigente())
			throw new UnidadOrganizativaException("Unidad propietaria no válida.", uidUnidad);

		return unidad;

	}

	@Override
	@Transactional(readOnly = true)
	public UnidadOrganizativaBDO getUnidadValida(Long kidUnidad) throws UnidadOrganizativaException {

		UnidadOrganizativaBDO unidad = getUnidadExistente(kidUnidad);

		if (!unidad.isVigente())
			throw new UnidadOrganizativaException("Unidad propietaria no válida.", String.valueOf(kidUnidad));

		return unidad;

	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadOrganizativaBDO> getReceptorasVigentes() {

		return repository.findAll(null, Boolean.TRUE, Boolean.TRUE);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadOrganizativaBDO> getUnidadesConfiguracion() {

		return repository.findAllByOrderByCodigoOrganicoExternoAscNombreUnidadCasAsc();
	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadOrganizativaBDO> getVigenteGestorListasDestinos() {

		return repository.findAll(null, null, true);
	}

	@Override
	@Transactional(readOnly = true)
	public UnidadOrganizativaBDO getByUid(String uid) {

		return repository.findByUid(uid);
	}

	@Override
	@Transactional(readOnly = true)
	public Long getKid(String uid) {

		return repository.findKidByUid(uid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadOrganizativaBDO> getByUid(Collection<String> uids) {

		return repository.findByUidIn(uids);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UnidadOrganizativaBDO> getAllByProperty(String codigoOrganicoExterno, String codigoOrganicoInterno, String responsableNif, String sustitutoNif,
			String nombreUnidadCas, String nombreUnidadVal, String unidadPadreUid, Boolean emisoraNI, Boolean primerNivel, Boolean receptoraNI, Boolean vigente,
			Integer firstResult, Integer maxResults) throws NoSuchMethodException {

		return repository.findAllByProperty(codigoOrganicoExterno, codigoOrganicoInterno, responsableNif, sustitutoNif, nombreUnidadCas, nombreUnidadVal, unidadPadreUid, emisoraNI, primerNivel, receptoraNI, vigente, firstResult, maxResults);

	}

}
