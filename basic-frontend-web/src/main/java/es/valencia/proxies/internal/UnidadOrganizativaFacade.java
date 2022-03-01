package es.valencia.proxies.internal;

import java.util.Map;

import org.springframework.security.access.prepost.PreAuthorize;

import es.valencia.exception.UnidadOrganizativaException;
import es.valencia.exception.UnidadesOrganizativasProxyException;
import es.valencia.proxies.internal.UnidadesOrganizativasSoaProxy.UpdateUnidadParams;
import es.valencia.proxies.internal.dto.UnidadSoaDto;

public interface UnidadOrganizativaFacade {

	/**
	 *
	 * Actualiza la unidad con kid pasado como parámetro.
	 *
	 *
	 * @param kid
	 * identificador hibernate de la unidad
	 * @param params
	 * Map con los parámetros a actualizar de la unidad.
	 * @see UpdateUnidadParams
	 * @see UnidadSoaDto
	 * @return UnidadSoaDto
	 * @throws UnidadesOrganizativasProxyException
	 * @throws UnidadOrganizativaException
	 */
	@PreAuthorize("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') or hasPermission(#kid,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION')")
	UnidadSoaDto updateUnidad(Long kid, Map<UpdateUnidadParams, Object> params) throws UnidadesOrganizativasProxyException, UnidadOrganizativaException;

	/**
	 *
	 * Obtiene datos de la unidad a partir de su UID.
	 *
	 *
	 * @param kid
	 * Identificador de negocio de la unidad
	 *
	 * @param candidatosAGestor
	 * Indica si se quiere obtener la lista de candidatos a gestor de la unidad.
	 * @return UnidadSoaDto
	 * @throws UnidadesOrganizativasProxyException
	 * @throws UnidadOrganizativaException
	 */
	@PreAuthorize("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR') or hasPermission(#kid,'es.valencia.entity.UnidadOrganizativaBDO' ,'GESTION') or hasPermission(#kid,'es.valencia.entity.UnidadOrganizativaBDO' ,'REDACCION')")
	UnidadSoaDto getByKid(Long kid, boolean candidatosAGestor) throws UnidadesOrganizativasProxyException, UnidadOrganizativaException;

}