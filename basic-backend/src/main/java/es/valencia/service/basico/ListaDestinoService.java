package es.valencia.service.basico;

import java.util.List;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;

import es.valencia.entity.ListaDestino;
import es.valencia.exception.ListaDestinoReferenciadaException;

public interface ListaDestinoService {

	/**
	 * Precondiciones:
	 * - El uid debe existir.
	 *
	 * Postcondicion:
	 * - Si el uid no existe devuelve null.
	 *
	 * @param uidUnidadPropietaria UID de la unidad propietaria
	 * @param nombreCas Nombre en castellano de la unidad
	 * @return ListaDestino
	 */

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	ListaDestino getListaDestino(String uidUnidadPropietaria, String nombreCas);

	/**
	 * Precondiciones:
	 * - El uid debe existir.
	 *
	 * @param unidadPropietaria UID unidad propietaria de la lista
	 * @param uidVisibleUnidad UID unidad que va a hacer uso de la lista
	 * @return ListaDestino
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	List<ListaDestino> getListasDestino(String unidadPropietaria, String uidVisibleUnidad);

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	@PostFilter("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	// Ejemplo de expresión de seguridad con ACLs
	// @PostFilter("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') or ( filterObject.unidadPropietaria!=null and hasPermission(filterObject, 'GESTION')
	// )")
	List<ListaDestino> getGestionadasLikeNombreOrNombreUnidad(String nombre, boolean valenciano);

	/**
	 *
	 * Precondiciones:
	 * - El uid debe existir en el sistema
	 *
	 * @param uidUnidad UID de la unidad
	 * @param soloGlobales Indica si obtiene solo listas globales
	 * @return ListaDestino
	 */
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	List<ListaDestino> getListasUO(String uidUnidad, Boolean soloGlobales);

	/**
	 * Precondiciones:
	 * - El uid de la unidad propietaria debe existir en el sistema
	 * - Las uids de la lista deben existir en el sistema
	 * - La unidad propietaria no puede estar incluida como destino.
	 *
	 * Postcondiciones(Idempotencia):
	 * - Si la lista no existe:
	 * - Se crea.
	 * - Se establece la fecha de creación y modificación.
	 * - Si la lista existe (se identica por uidUnidadPropietaria + nombreCastellano), y los datos
	 * cambian:
	 * - Se actualizan los datos.
	 * - Se establece la fecha de modificación
	 *
	 * @param kidUnidadPropietaria kid de la unidad propietaria
	 * @param nombreCas Nombre castellano de la unidad
	 * @param nombreVal Nombre valenciano de la unidad
	 * @param descripcion Descripción de la unidad
	 * @param uidsUnidades Lista de uids de las unidades que forman parte de la lista de destinos.
	 * @return ListaDestino
	 */
	@PreAuthorize("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') ")
	// Ejemplo de expresión de seguridad con ACLs
	// @PreAuthorize("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') or
	// hasPermission(#kidUnidadPropietaria,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION')")
	ListaDestino addOrUpdateListaDestino(Long kidUnidadPropietaria, String nombreCas, String nombreVal, String descripcion, List<String> uidsUnidades);

	/**
	 * Postcondiciones(Idempotencia):
	 * - Si la lista existe:
	 * - Si la lista de destino está referenciada por alguna comunicación que no esté entregada: se
	 * devuelve fallo.
	 * - Sino: Se elimina y devuelve respuesta de éxito.
	 * - Si la lista no existe: se devuelve respuesta de éxito (idempotencia).
	 *
	 * @param kidUnidadPropietaria kid de la unidad propietaria
	 * @param nombreCas Nombre castellano de la unidad
	 *
	 * @throws ListaDestinoReferenciadaException La lista destino está siendo usada por alguna nota interior
	 */
	
	 @PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")
	// Ejemplo de expresión de seguridad con ACLs
	// @PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') or hasPermission(#kidUnidadPropietaria,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION')")
	void deleteListaDestino(Long kidUnidadPropietaria, String nombreCas) throws ListaDestinoReferenciadaException;

	/**
	 * Precondiciones:
	 * - El kid de la unidad propietaria debe existir en el sistema
	 * - Las uids de la listas (delete/add) deben existir en el sistema
	 * - La lista debe existir.
	 *
	 * Postcondiciones(Idempotencia):
	 * - Se cumplen todas las solicitudes de delete y add dentro del mensaje o no se cumple ninguna
	 *
	 * @param kidUnidadPropietaria kid de la unidad propietaria
	 * @param nombreCas Nombre castellano de la unidad
	 * @param deleteMiembros UIDS de las unidades a borrar de la lista
	 * @param addMiembros UIDs de las unidades a añadir en la lista
	 * @return ListaDestino
	 */
	 
	 @PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') ")
	// Ejemplo de expresión de seguridad con ACLs
	// @PreAuthorize(" hasRole('ROLE_ADMINISTRADOR') or hasPermission(#kidUnidadPropietaria,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION')")
	ListaDestino updateMiembrosListaDestino(Long kidUnidadPropietaria, String nombreCas, List<String> deleteMiembros, List<String> addMiembros);

}