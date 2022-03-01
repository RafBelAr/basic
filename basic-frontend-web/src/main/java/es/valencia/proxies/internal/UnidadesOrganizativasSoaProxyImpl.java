package es.valencia.proxies.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import es.valencia.aytowebfwk.utils.dozer.AyFwkBeanMapper;
import es.valencia.exception.UnidadesOrganizativasProxyException;
import es.valencia.proxies.internal.dto.SustitutoDto;
import es.valencia.proxies.internal.dto.UnidadSoaDto;
import es.valencia.schema.nie.unidadorganizativa.CapacidadUOReceptoraTypeV10;
import es.valencia.services.niedomain.unidadesorganizativas.AddOrUpdateUnidadRequestTypeV20;
import es.valencia.services.niedomain.unidadesorganizativas.GestoresTypeV10;
import es.valencia.services.niedomain.unidadesorganizativas.GetUnidadRequestTypeV12;
import es.valencia.services.niedomain.unidadesorganizativas.ObjectFactory;
import es.valencia.services.niedomain.unidadesorganizativas.RedactoresDeshabilitadosTypeV20;
import es.valencia.services.niedomain.unidadesorganizativas.SustitutoTypeV10;
import es.valencia.services.niedomain.unidadesorganizativas.SustitutosTypeV20;
import es.valencia.services.niedomain.unidadesorganizativas.UnidadResponseTypeV20;
import es.valencia.services.niedomain.unidadesorganizativas.v20.UnidadPreconditionFault;
import es.valencia.services.niedomain.unidadesorganizativas.v20.UnidadesOrganizativasPortType;

@Named("unidadesOrganizativasSoaProxy")
public class UnidadesOrganizativasSoaProxyImpl implements UnidadesOrganizativasSoaProxy {

	@Value("${aywebfwk.proxies.unidadesorganizativas.version}")
	private String version;

	@Autowired
	private JaxWsProxyFactoryBean proxyFactoryUnidadesOrganizativasSoa;

	private UnidadesOrganizativasPortType unidadesSoa;

	private ObjectFactory objectFactory;

	@Inject
	private AyFwkBeanMapper viewMapper;

	@PostConstruct
	public void init() {

		unidadesSoa = (UnidadesOrganizativasPortType) proxyFactoryUnidadesOrganizativasSoa.create();
		objectFactory = new ObjectFactory();

		final Client client = ClientProxy.getClient(unidadesSoa);
		final HTTPConduit http = (HTTPConduit) client.getConduit();
		http.getClient().setReceiveTimeout(300000);

	}

	@Override
	public UnidadSoaDto updateUnidad(long codigoBDO, String codigoInvariable, Map<UpdateUnidadParams, Object> params)
			throws UnidadesOrganizativasProxyException {

		try {

			Boolean emisoraNI = (Boolean) params.get(UpdateUnidadParams.EMISORA_NI);
			Boolean ambitoRestringidoEnvio = (Boolean) params.get(UpdateUnidadParams.AMBITO_RESTRINGIDO_ENVIO);
			Boolean receptoraNI = (Boolean) params.get(UpdateUnidadParams.RECEPTORA_NI);
			Boolean ambitoRestringidoRecepcion = (Boolean) params.get(UpdateUnidadParams.AMBITO_RESTRINGIDO_RECEPCION);
			String uidRedireccion = (String) params.get(UpdateUnidadParams.UID_REDIRECCION_BUZON);

			AddOrUpdateUnidadRequestTypeV20 request = new AddOrUpdateUnidadRequestTypeV20();

			request.setVersion(version);

			request.setCodigoBDO(codigoBDO);
			request.setCodigoInvariable(codigoInvariable);
			request.setEmisoraNI(createCapacidadUOTypeV10(emisoraNI, ambitoRestringidoEnvio, null));
			request.setReceptoraNI(createCapacidadUOTypeV10(receptoraNI, ambitoRestringidoRecepcion, uidRedireccion));

			request.setSustitutos(createSustitutos(params));

			request.setGestores(createGestores(params));

			request.setRedactoresDeshabilitados(createRedactoresDeshabilitados(params));

			UnidadResponseTypeV20 response = unidadesSoa.addOrUpdateUnidad(request);

			return viewMapper.map(response.getUnidadOrganizativa(), UnidadSoaDto.class);

		} catch (UnidadPreconditionFault e) {
			throw new UnidadesOrganizativasProxyException(e);
		}
	}

	private CapacidadUOReceptoraTypeV10 createCapacidadUOTypeV10(Boolean value, Boolean ambitoRestringido,
			String uidRedireccion) {

		if (value != null) {

			CapacidadUOReceptoraTypeV10 capacidad = new CapacidadUOReceptoraTypeV10();

			capacidad.setValue(value);
			capacidad.setAmbitoRestringido(ambitoRestringido);
			capacidad.setRedireccionBuzon(uidRedireccion);

			return capacidad;

		}

		return null;

	}

	@Override
	public UnidadSoaDto getUnidad(String uid) throws UnidadesOrganizativasProxyException {

		return getUnidad(uid, false);
	}

	@Override
	public UnidadSoaDto getUnidad(String uid, boolean candidatosAGestor) throws UnidadesOrganizativasProxyException {

		try {

			GetUnidadRequestTypeV12 request = new GetUnidadRequestTypeV12();
			request.setVersion(version);
			request.setUid(uid);
			request.setGetCandidatosAGestor(candidatosAGestor);

			UnidadResponseTypeV20 response = unidadesSoa.getUnidad(request);

			return viewMapper.map(response.getUnidadOrganizativa(), UnidadSoaDto.class);

		} catch (UnidadPreconditionFault e) {
			throw new UnidadesOrganizativasProxyException(e);
		}
	}

	private SustitutosTypeV20 createSustitutos(Map<UpdateUnidadParams, Object> params) {

		@SuppressWarnings("unchecked")
		List<SustitutoDto> listSustitutos = (List<SustitutoDto>) params.get(UpdateUnidadParams.SUSTITUTOS);

		if (listSustitutos == null) {
			return null;
		} else {
			SustitutosTypeV20 sustitutos = objectFactory.createSustitutosTypeV20();
			sustitutos.getSustituto().addAll(viewMapper.mapList(listSustitutos, SustitutoTypeV10.class));

			return sustitutos;

		}

	}

	@SuppressWarnings("unchecked")
	private GestoresTypeV10 createGestores(Map<UpdateUnidadParams, Object> params) {

		if (params.get(UpdateUnidadParams.GESTORES) == null) {

			return null;
		} else {

			GestoresTypeV10 gestoresType = new GestoresTypeV10();
			gestoresType.getGestor().addAll(((Collection<? extends String>) params.get(UpdateUnidadParams.GESTORES)));

			return gestoresType;

		}

	}

	@SuppressWarnings("unchecked")
	private RedactoresDeshabilitadosTypeV20 createRedactoresDeshabilitados(Map<UpdateUnidadParams, Object> params) {

		if (params.get(UpdateUnidadParams.REDACTORES_DESHABILITADOS) == null) {

			return null;
		} else {

			RedactoresDeshabilitadosTypeV20 redactoresType = new RedactoresDeshabilitadosTypeV20();
			redactoresType.getRedactor().addAll(
					((Collection<? extends String>) params.get(UpdateUnidadParams.REDACTORES_DESHABILITADOS)));

			return redactoresType;

		}

	}
}
