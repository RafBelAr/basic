package es.valencia.ws;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.datatype.DatatypeFactory;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.valencia.aytowebfwk.security.utils.SecurityUtil;
import es.valencia.aytowebfwk.utils.dozer.AyFwkBeanMapper;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.UnidadOrganizativaException;
import es.valencia.service.basico.UnidadOrganizativaService;
import es.valencia.ws.dozer.VersionV20BeanFactory;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV20;
import es.valencia.services.nie.unidadesorganizativas.AddOrUpdateUnidadRequestTypeV20;
import es.valencia.services.nie.unidadesorganizativas.FindUnidadesResponseTypeV20;
import es.valencia.services.nie.unidadesorganizativas.RemoveUnidadResponseTypeV10;
import es.valencia.services.nie.unidadesorganizativas.UnidadPreconditionFaultTypeV10;
import es.valencia.services.nie.unidadesorganizativas.UnidadResponseTypeV20;
import es.valencia.services.nie.unidadesorganizativas.UnidadesOrganizativasTypeV20;
import es.valencia.services.nie.unidadesorganizativas.v20.UnidadPreconditionFault;
import es.valencia.services.nie.unidadesorganizativas.v20.UnidadesOrganizativasPortType;

/**
 * 
 * Clase que implementa las operaciones definidas por el servicio de unidades organizativas en la
 * interfaz {@link es.valencia.services.nie.unidadesorganizativas.v20.UnidadesOrganizativasPortType}
 * .
 * 
 * Para empezar a implementar un servicio creado con CXF, copiaremos, fuera de la estructura de
 * paquetes generada por CXF, la clase xxxxPorTypeImpl del servicio.
 * En este caso hemos copiado la clase
 * {@link es.valencia.services.nie.unidadesorganizativas.v20.UnidadesOrganizativasPortTypeImpl} al
 * paquete
 * es.valencia.ws ( es.valencia.NOMBRE_APP.ws).
 * 
 * Como norma no se deben modificar las clases ni los paquetes generados por CXF.
 * 
 * En esta clase no se debe implementar lógica de negocio. Únicamente se debe hacer el
 * mapeo/transformación de datos necesario para llamar a los servicios del backend y/o construir el
 * mensaje de respuesta. El proceso sería el siguiente:
 * 
 * - Mapeo del objecto request a tipos básicos. La capa de negocio solo admite como parámetros de
 * entrada tipos básicos o colecciones de tipos básicos.
 * 
 * - Llamada a la operación de negocio del backend.
 * 
 * - Mapeo, mediante dozer, de la respuesta de negocio a clases response del servicio.
 * 
 * 
 * @author LSG13
 * 
 */
@javax.jws.WebService(serviceName = "UnidadesOrganizativasService", portName = "UnidadesOrganizativasSOAP11", targetNamespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas/v20", wsdlLocation = "http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/UnidadesOrganizativas_v2.0_concreto", endpointInterface = "es.valencia.services.nie.unidadesorganizativas.v20.UnidadesOrganizativasPortType")
public class UnidadesOrganizativasPortTypeImpl implements UnidadesOrganizativasPortType {

	private static final Logger logger = LogManager.getLogger(UnidadesOrganizativasPortTypeImpl.class);

	private static final String VERSION = "1.0";

	private static final String CALL_CONSTRAINT_FORCE_UPDATE_PATTERN = "forceUpdate:\\d*$";

	@Inject
	private AyFwkBeanMapper wsMapper;

	@Inject
	private @Named("unidadOrganizativaService") UnidadOrganizativaService uoService;

	private String getUid(AddOrUpdateUnidadRequestTypeV20 request) {

		if (StringUtils.isNotEmpty(request.getCodigoInvariable())) {

			return request.getCodigoInvariable();
		} else {

			return String.valueOf(request.getCodigoBDO());
		}
	}

	@Override
	public UnidadResponseTypeV20 addOrUpdateUnidad(AddOrUpdateUnidadRequestTypeV20 request) throws UnidadPreconditionFault {

		logger.debug("Executing operation addOrUpdateUnidad");
		try {
			// Mapeo del objecto request a tipos básicos
			@SuppressWarnings("unchecked")
			Map<String, Object> map = wsMapper.map(request, HashMap.class, "AddOrUpdateUnidadRequestTypeV20Mapping");

			if (StringUtils.isNotBlank(request.getCallConstraint()) && Pattern.matches(CALL_CONSTRAINT_FORCE_UPDATE_PATTERN, request.getCallConstraint())) {
				Integer forceUpdate = Integer.valueOf(StringUtils.substringAfter(request.getCallConstraint(), ":"));
				map.put("forceUpdate", forceUpdate);
			}

			if (request.getResponsable() != null && request.getResponsable().isNil())
				map.put("responsable", new HashMap<String, Object>());

			if (request.getUidPadre() == null)
				map.remove("uidPadre");

			if (request.getUidPadre() != null && request.getUidPadre().isNil())
				map.put("uidPadre", "");

			if (request.getNombreCargoCas() != null && request.getNombreCargoCas().isNil())
				map.put("nombreCargoCas", "");

			if (request.getNombreCargoCas() == null)
				map.remove("nombreCargoCas");

			if (request.getNombreCargoVal() != null && request.getNombreCargoVal().isNil())
				map.put("nombreCargoVal", "");

			if (request.getNombreCargoVal() == null)
				map.remove("nombreCargoVal");

			// Llamada operación de negocio
			UnidadOrganizativaBDO unidad = uoService.getByUid(getUid(request));
			UnidadOrganizativaBDO unidadResult;

			if (unidad != null)
				unidadResult = uoService.addOrUpdateUnidad(unidad.getKid(), map);
			else
				unidadResult = uoService.addOrUpdateUnidad(null, map);

			// Mapeo a clases Response
			UnidadResponseTypeV20 response = new UnidadResponseTypeV20();

			response.setVersion(VERSION);
			response.setUnidadOrganizativa(wsMapper.map(unidadResult, UnidadOrganizativaTypeV20.class));

			return response;

		} catch (UnidadOrganizativaException ex) {

			UnidadPreconditionFaultTypeV10 unidadPreconditionFault = createUnidadPreconditionFault(ex, ex.getUid());

			throw new UnidadPreconditionFault(ex.getMessage(), unidadPreconditionFault);

		} catch (java.lang.Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public es.valencia.services.nie.unidadesorganizativas.FindUnidadesResponseTypeV20 findUnidades(
			es.valencia.services.nie.unidadesorganizativas.FindUnidadesRequestTypeV12 request) {

		logger.debug("Executing operation findUnidades");
		try {

			// Mapeo del objecto request a tipos básicos
			Integer firstResult = request.getFirstResult();
			Integer maxResults = request.getMaxResults();

			String responsable = request.getNifResponsable() != null ? request.getNifResponsable().getValue() : null;
			String sustituto = request.getNifSustituto() != null ? request.getNifSustituto().getValue() : null;
			String uidPadre = request.getUidPadre() != null ? request.getUidPadre().getValue() : null;

			if (firstResult >= 1)
				firstResult--;

			// Llamada operación de negocio
			List<UnidadOrganizativaBDO> unidadesOrganizativasBDO = uoService.getAllByProperty(request.getCodigoOrganicoExterno(), request.getCodigoOrganicoInterno(),
					responsable, sustituto, request.getNombreUnidadCas(), request.getNombreUnidadCas(), uidPadre, request.isEmisoraNI(), request.isPrimerNivel(),
					request.isReceptoraNI(), request.isVigente(), firstResult, maxResults);

			// Mapeo a clases Response
			FindUnidadesResponseTypeV20 _return = new FindUnidadesResponseTypeV20();
			_return.setFirstResult(firstResult);
			_return.setNumResults(unidadesOrganizativasBDO.size());
			UnidadesOrganizativasTypeV20 unidadesOrganizativasTypeV20 = new UnidadesOrganizativasTypeV20();
			Iterator<UnidadOrganizativaBDO> iUnidadesOrganizativasBDO = unidadesOrganizativasBDO.iterator();
			while (iUnidadesOrganizativasBDO.hasNext()) {
				UnidadOrganizativaBDO unidadOrganizativaBDO = iUnidadesOrganizativasBDO.next();
				UnidadOrganizativaTypeV20 unidadOrganizativaTypeV20 = wsMapper.map(unidadOrganizativaBDO, UnidadOrganizativaTypeV20.class);
				unidadesOrganizativasTypeV20.getUnidadOrganizativa().add(unidadOrganizativaTypeV20);
			}
			_return.setUnidadesOrganizativas(unidadesOrganizativasTypeV20);
			_return.setVersion(VERSION);
			return _return;
		} catch (java.lang.Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public es.valencia.services.nie.unidadesorganizativas.UnidadResponseTypeV20 getUnidad(es.valencia.services.nie.unidadesorganizativas.UidRequestTypeV10 request)
			throws UnidadPreconditionFault {

		logger.debug("Executing operation getUnidad");
		try {

			// Llamada operación de negocio
			UnidadOrganizativaBDO unidadOrganizativaBDO = uoService.getByUid(request.getUid());
			if (unidadOrganizativaBDO == null) {
				String message = "La unidad organizativa con uid='" + request.getUid() + "' no existe en el sistema.";
				throw new UnidadOrganizativaException(message, request.getUid());
			}

			// Mapeo a clases Response
			UnidadResponseTypeV20 _return = new UnidadResponseTypeV20();
			_return.setVersion(VERSION);
			_return.setUnidadOrganizativa(wsMapper.map(unidadOrganizativaBDO, UnidadOrganizativaTypeV20.class));
			return _return;
		} catch (UnidadOrganizativaException ex) {
			UnidadPreconditionFaultTypeV10 unidadPreconditionFault = createUnidadPreconditionFault(ex, ex.getUid());
			throw new UnidadPreconditionFault(ex.getMessage(), unidadPreconditionFault);

		} catch (java.lang.Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public es.valencia.services.nie.unidadesorganizativas.RemoveUnidadResponseTypeV10 removeUnidad(
			es.valencia.services.nie.unidadesorganizativas.UidRequestTypeV10 request) {

		logger.debug("Executing operation removeUnidad");
		try {

			// Llamada operación de negocio
			UnidadOrganizativaBDO unidad = uoService.getByUid(request.getUid());

			uoService.removeUnidad(unidad.getKid());

			// Mapeo a clases Response
			GregorianCalendar timestamp = (GregorianCalendar) Calendar.getInstance();

			RemoveUnidadResponseTypeV10 _return = new RemoveUnidadResponseTypeV10();
			_return.setVersion(VERSION);

			_return.setTimestamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(timestamp));

			return _return;
		} catch (java.lang.Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	private static UnidadPreconditionFaultTypeV10 createUnidadPreconditionFault(Throwable cause, String uid) {

		UnidadPreconditionFaultTypeV10 fault = new UnidadPreconditionFaultTypeV10();
		fault.setUid(uid);
		fault.setAplicacionLlamante(SecurityUtil.getAppNameFromRequestContext());
		fault.setLang("es");
		fault.setMensaje(cause == null ? null : cause.getMessage());
		fault.setVersion(VersionV20BeanFactory.getVersion());
		return fault;

	}
}
