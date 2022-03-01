package es.valencia.service.basico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.springframework.transaction.annotation.Transactional;

import es.valencia.aytowebfwk.exception.BussinessException;
import es.valencia.aytowebfwk.exception.RuntimeBusinessException;
import es.valencia.entity.ListaDestino;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.ListaDestinoPreconditionRuntimeException;
import es.valencia.exception.ListaDestinoReferenciadaException;
import es.valencia.repository.ListaDestinoRepository;

@Named("listaDestinoService")
public class ListaDestinoServiceImpl implements ListaDestinoService {

	private static final Logger LOG = LogManager.getLogger(ListaDestinoServiceImpl.class.getName());

	@Inject
	private ListaDestinoRepository listaDestinoRepository;
	@Inject
	private @Named("unidadOrganizativaService") UnidadOrganizativaService uoService;


	@Override
	@Transactional(readOnly = false)
	public ListaDestino addOrUpdateListaDestino(Long kidUnidadPropietaria, String nombreCas, String nombreVal, String descripcion, List<String> uidsUnidades) {

		if (StringUtils.isBlank(nombreCas)) {
			throw new ListaDestinoPreconditionRuntimeException("El campo nombre Castellano no puede ser nulo o vacío.");
		}

		if (StringUtils.length(nombreCas) < 5) {
			throw new ListaDestinoPreconditionRuntimeException("El campo nombre Castellano debe contener 5 caracteres mínimo.");
		}

		if (StringUtils.isBlank(nombreVal)) {
			throw new ListaDestinoPreconditionRuntimeException("El campo nombre Valenciano no puede ser nulo o vacío.");
		}

		if (StringUtils.length(nombreVal) < 5) {
			throw new ListaDestinoPreconditionRuntimeException("El campo nombre Valenciano debe contener 5 caracteres mínimo.");
		}

		ListaDestino listaDestino = listaDestinoRepository.findListaByNombreAndKid(nombreCas, kidUnidadPropietaria);

		if (listaDestino == null) {
			// Se crea la lista
			listaDestino = new ListaDestino();
		}

		listaDestino.setNombreCas(nombreCas);
		listaDestino.setNombreVal(nombreVal);
		listaDestino.setDescripcion(descripcion);

		if (kidUnidadPropietaria != null) {

			try {

				UnidadOrganizativaBDO unidad = uoService.getUnidadValida(kidUnidadPropietaria);
				listaDestino.setUnidadPropietaria(unidad);
			} catch (BussinessException ex) {
				throw new ListaDestinoPreconditionRuntimeException("El uid de la unidad propietaria debe existir en el sistema.");
			}
		}

		// Lista destino unidades
		if (CollectionUtils.isNotEmpty(uidsUnidades)) {
			// busco las uids
			Set<String> uids = new HashSet<>(uidsUnidades);

			List<UnidadOrganizativaBDO> listUids = uoService.getByUid(uids);

			if (listUids.size() != uidsUnidades.size()) {

				throw new ListaDestinoPreconditionRuntimeException("Las uids de la lista deben existir en el sistema.");
			}

			listaDestino.setUnidadesDestino(listUids);
		}

		listaDestinoRepository.save(listaDestino);

		return listaDestino;
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteListaDestino(Long kidUnidadPropietaria, String nombreCas) throws ListaDestinoReferenciadaException {

		try {

			ListaDestino listaDestino = listaDestinoRepository.findListaByNombreAndKid(nombreCas, kidUnidadPropietaria);

			if (listaDestino != null) {

				// Compruebo que la lista no tenga comunicaciones con notas interiores
				// referenciadas por alguna comunicación que no esté entregada
				// tiene comunicaciones pendientes?

				listaDestino.setNombreCas(nombreCas);

				if (kidUnidadPropietaria != null) {

					UnidadOrganizativaBDO unidad = uoService.getUnidadExistente(kidUnidadPropietaria);

					if (unidad != null) {

						listaDestino.setUnidadPropietaria(unidad);
					}
				}

				listaDestinoRepository.delete(listaDestino);

			}

		} catch (HibernateException e) {

			LOG.info("Se ha intentado borrar una lista destino que no existe: " + "nombreCas: " + nombreCas + " kidUnidadPropietaria: " + kidUnidadPropietaria, e);
		} catch (BussinessException be) {

			throw new RuntimeBusinessException(be);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public ListaDestino getListaDestino(String uidUnidadPropietaria, String nombreCas) {

		return listaDestinoRepository.findByNombreAndUid(nombreCas, uidUnidadPropietaria);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ListaDestino> getListasDestino(String unidadPropietaria, String uidVisibleUnidad) {

		List<ListaDestino> listaListasDestino = new ArrayList<>();
		UnidadOrganizativaBDO unidad = new UnidadOrganizativaBDO();
		try {
			if (StringUtils.isBlank(uidVisibleUnidad)) {
				if (StringUtils.isNotBlank(unidadPropietaria)) {
					unidad = uoService.getUnidadExistente(unidadPropietaria);
					// buscar listas destino para esa unidad
					if (unidad != null) {
						listaListasDestino = listaDestinoRepository.findByUidUnidadPropietaria(unidadPropietaria);
					}
				} else {
					// buscar listas globales
					listaListasDestino = listaDestinoRepository.findListasDestinoGlobales();
				}
			} else {
				unidad = uoService.getUnidadValida(uidVisibleUnidad);
				// busca listas destino suyas
				// listas destino del padre
				// listas destino globales
				String uidPadre = "";
				if (unidad.getUnidadPadre() != null) {
					uidPadre = unidad.getUnidadPadre().getUid();
				}
				listaListasDestino = listaDestinoRepository.findListasDestinoUidVisibleUnidad(uidVisibleUnidad, uidPadre);
			}
		} catch (BussinessException ex) {
			throw new ListaDestinoPreconditionRuntimeException("El uid de la unidad debe existir en el sistema.");
		}
		return listaListasDestino;

	}

	@Override
	@Transactional(readOnly = true)
	public List<ListaDestino> getGestionadasLikeNombreOrNombreUnidad(String nombre, boolean valenciano) {

		return listaDestinoRepository.findAllLikeNombreOrNombreUnidad(nombre, valenciano);
	}

	@Override
	@Transactional(readOnly = true)
	public List<ListaDestino> getListasUO(String uidUnidad, Boolean soloGlobales) {

		if (StringUtils.isBlank(uidUnidad)) {
			throw new ListaDestinoPreconditionRuntimeException("El uidUnidadOrganizativa no puede ser nulo o vacío.");
		}

		List<ListaDestino> listaListasUO = new ArrayList<>();

		try {
			// Si la unidad no existe lanza excepción
			uoService.getUnidadExistente(uidUnidad);

			if (soloGlobales) {
				// buscar listas globales
				listaListasUO = listaDestinoRepository.findListasDestinoGlobales();
			} else {
				// busca listas destino suyas
				// listas destino globales
				listaListasUO = listaDestinoRepository.findListasUOGobales(uidUnidad);
			}
		} catch (BussinessException ex) {
			throw new ListaDestinoPreconditionRuntimeException("El uid de la unidad debe existir en el sistema.");
		}
		return listaListasUO;

	}

	@Override
	@Transactional(readOnly = false)
	public ListaDestino updateMiembrosListaDestino(Long kidUnidadPropietaria, String nombreCas, List<String> deleteMiembros, List<String> addMiembros) {

		if (kidUnidadPropietaria != null) {
			try {
				// Si no existe lanza excepción
				uoService.getUnidadValida(kidUnidadPropietaria);
			} catch (BussinessException ex) {
				throw new ListaDestinoPreconditionRuntimeException("El uid de la unidad propietaria debe existir en el sistema o estar vigente.");
			}
		}

		if (StringUtils.isBlank(nombreCas)) {
			throw new ListaDestinoPreconditionRuntimeException("El campo nombre Castellano no puede ser nulo o vacío.");
		}

		if (StringUtils.length(nombreCas) < 5) {
			throw new ListaDestinoPreconditionRuntimeException("El campo nombre Castellano debe contener 5 caracteres mínimo.");
		}

		ListaDestino listaDestino = listaDestinoRepository.findListaByNombreAndKid(nombreCas, kidUnidadPropietaria);
		if (listaDestino == null) {
			throw new ListaDestinoPreconditionRuntimeException("La Lista solicitada no existe en el sistema.");
		}

		// Lista uids delete
		if (CollectionUtils.isNotEmpty(deleteMiembros)) {
			// busco las uids
			Set<String> uidsDelete = new HashSet<>(deleteMiembros);

			List<UnidadOrganizativaBDO> listUidsDelete = uoService.getByUid(uidsDelete);

			if (listUidsDelete.size() != deleteMiembros.size()) {
				throw new ListaDestinoPreconditionRuntimeException("Las uids de deleteMiembros deben existir en el sistema.");
			} else {
				for (UnidadOrganizativaBDO unidad : listUidsDelete) {
					listaDestino.removeUnidadDestino(unidad);
				}
			}
		}

		// Lista uids add
		if (CollectionUtils.isNotEmpty(addMiembros)) {
			// busco las uids
			Set<String> uidsAdd = new HashSet<>(addMiembros);
			List<UnidadOrganizativaBDO> listUidsAdd = uoService.getByUid(uidsAdd);
			if (listUidsAdd.size() != addMiembros.size()) {
				throw new ListaDestinoPreconditionRuntimeException("Las uids de addMiembros deben existir en el sistema.");
			} else {
				for (UnidadOrganizativaBDO unidad : listUidsAdd) {
					listaDestino.addUnidadDestino(unidad);
				}
			}
		}

		listaDestinoRepository.save(listaDestino);
		return listaDestino;
	}

}