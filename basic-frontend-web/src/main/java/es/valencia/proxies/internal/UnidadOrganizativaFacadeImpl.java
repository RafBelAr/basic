package es.valencia.proxies.internal;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.UnidadOrganizativaException;
import es.valencia.exception.UnidadesOrganizativasProxyException;
import es.valencia.proxies.internal.UnidadesOrganizativasSoaProxy.UpdateUnidadParams;
import es.valencia.proxies.internal.dto.UnidadSoaDto;
import es.valencia.service.basico.UnidadOrganizativaService;

@Named("unidadOrganizativaServiceCompuesto")
public class UnidadOrganizativaFacadeImpl implements UnidadOrganizativaFacade {

	@Inject
	private UnidadesOrganizativasSoaProxy unidadesOrganizativasSoaProxy;

	@Inject
	private UnidadOrganizativaService service;

	@Override
	public UnidadSoaDto updateUnidad(Long kid, Map<UpdateUnidadParams, Object> params) throws UnidadesOrganizativasProxyException, UnidadOrganizativaException {

		UnidadOrganizativaBDO unidad = service.getUnidadValida(kid);

		return unidadesOrganizativasSoaProxy.updateUnidad(unidad.getCodigoBDO(), unidad.getCodigoInvariable(), params);
	}

	@Override
	public UnidadSoaDto getByKid(Long kid, boolean candidatosAGestor) throws UnidadesOrganizativasProxyException, UnidadOrganizativaException {

		UnidadOrganizativaBDO unidad = service.getUnidadValida(kid);

		return unidadesOrganizativasSoaProxy.getUnidad(unidad.getUid(), candidatosAGestor);
	}

}
