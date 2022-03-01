package es.valencia.service.basico;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.UnidadOrganizativaException;

public interface UnidadOrganizativaService {

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public UnidadOrganizativaBDO getByUid(String uid);

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public Long getKid(String uid);

	@PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	// Ejemplo de expresión de seguridad con ACLs
	// @PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') or hasPermission(#kid,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION')")
	UnidadOrganizativaBDO addOrUpdateUnidad(Long kid, Map<String, Object> entidadMap) throws UnidadOrganizativaException;

	@PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') or hasPermission(#kid,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION')")
	void removeUnidad(Long kid);

	/**
	 * Precondiciones:
	 * - El uidUnidad de la unidad debe existir en el sistema. Si no existe lanza excepción
	 * UnidadOrganizativaException.
	 *
	 * @param uidUnidad código UID de la unidad
	 * @return UnidadOrganizativaBDO
	 * @throws UnidadOrganizativaException La unidad no existe
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	UnidadOrganizativaBDO getUnidadExistente(String uidUnidad) throws UnidadOrganizativaException;

	/**
	 * Precondiciones:
	 * - El kid de la unidad debe existir en el sistema. Si no existe lanza excepción
	 * UnidadOrganizativaException.
	 *
	 * @param kid KID de la Unidad
	 * @return UnidadOrganizativaBDO
	 * @throws UnidadOrganizativaException La unidad no existe
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	UnidadOrganizativaBDO getUnidadExistente(Long kid) throws UnidadOrganizativaException;

	/**
	 * Precondiciones:
	 * - El uid de la unidad debe existir en el sistema. Si no existe lanza excepción
	 * UnidadOrganizativaException.
	 *
	 * -La unidad debe estar vigente. Si no está vigente lanza UnidadOrganizativaException.
	 *
	 * @param uidUnidad código UID de la unidad
	 * @return UnidadOrganizativaBDO
	 * @throws UnidadOrganizativaException La unidad no existe
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	UnidadOrganizativaBDO getUnidadValida(String uidUnidad) throws UnidadOrganizativaException;

	/**
	 * Precondiciones:
	 * - El kid de la unidad debe existir en el sistema. Si no existe lanza excepción
	 * UnidadOrganizativaException.
	 *
	 * -La unidad debe estar vigente. Si no está vigente lanza UnidadOrganizativaException.
	 *
	 * @param kidUnidad kid de la unidad
	 * @return UnidadOrganizativaBDO
	 * @throws UnidadOrganizativaException La unidad no existe
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	UnidadOrganizativaBDO getUnidadValida(Long kidUnidad) throws UnidadOrganizativaException;

	/**
	 *
	 * Obtiene todas las unidades vigentes y que son receptoras de notas interiores.
	 *
	 * @return List de UnidadOrganizativaBDO
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	List<UnidadOrganizativaBDO> getReceptorasVigentes();

	/**
	 *
	 * Obtiene las unidades que el usuario puede configurar. Es decir, tiene permisos de gestion o
	 * es Administrador/Operador.
	 *
	 * @return List de UnidadOrganizativaBDO
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	@PostFilter("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	// Ejemplo de expresión de seguridad con ACLs
	// @PostFilter("hasPermission(filterObject, 'GESTION') or hasPermission(filterObject, 'ADMINISTRATION') or hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	List<UnidadOrganizativaBDO> getUnidadesConfiguracion();

	/**
	 * Obtiene las unidades vigentes sobre las que el usuario puede crear listas de destinos.
	 *
	 * @return List de UnidadOrganizativaBDO
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	@PostFilter(" hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	// Ejemplo de expresión de seguridad con ACLs
	// @PostFilter("hasPermission(filterObject, 'GESTION') or hasPermission(filterObject, 'ADMINISTRATION') or hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	List<UnidadOrganizativaBDO> getVigenteGestorListasDestinos();

	/**
	 *
	 * @param uids lista de códigos UID de las unidades a obtener
	 * @return List de UnidadOrganizativaBDO
	 */
	
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	List<UnidadOrganizativaBDO> getByUid(Collection<String> uids);

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	List<UnidadOrganizativaBDO> getAllByProperty(String codigoOrganicoExterno, String codigoOrganicoInterno, String responsableNif, String sustitutoNif,
			String nombreUnidadCas, String nombreUnidadVal, String unidadPadreUid, Boolean emisoraNI, Boolean primerNivel, Boolean receptoraNI, Boolean vigente,
			Integer firstResult, Integer maxResults) throws NoSuchMethodException;

}