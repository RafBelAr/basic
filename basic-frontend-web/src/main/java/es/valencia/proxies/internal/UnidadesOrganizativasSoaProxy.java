package es.valencia.proxies.internal;

import java.util.Map;

import es.valencia.exception.UnidadesOrganizativasProxyException;
import es.valencia.proxies.internal.dto.UnidadSoaDto;

public interface UnidadesOrganizativasSoaProxy {

	public enum UpdateUnidadParams {
		EMISORA_NI,
		RECEPTORA_NI,
		AMBITO_RESTRINGIDO_ENVIO,
		AMBITO_RESTRINGIDO_RECEPCION,
		SUSTITUTOS,
		GESTORES,
		REDACTORES_DESHABILITADOS,
		UID_REDIRECCION_BUZON
	}

	UnidadSoaDto updateUnidad(long codigoBDO, String codigoInvariable, Map<UpdateUnidadParams, Object> params)
			throws UnidadesOrganizativasProxyException;

	UnidadSoaDto getUnidad(String uid) throws UnidadesOrganizativasProxyException;

	UnidadSoaDto getUnidad(String uid,boolean candidatosAGestor) throws UnidadesOrganizativasProxyException;
}
