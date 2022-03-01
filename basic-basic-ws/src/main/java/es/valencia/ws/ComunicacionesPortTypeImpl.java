package es.valencia.ws;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.datatype.DatatypeFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.valencia.aytowebfwk.utils.dozer.AyFwkBeanMapper;
import es.valencia.entity.ListaDestino;
import es.valencia.exception.ListaDestinoPreconditionRuntimeException;
import es.valencia.exception.ListaDestinoReferenciadaException;
import es.valencia.exception.UnidadOrganizativaException;
import es.valencia.service.basico.ListaDestinoService;
import es.valencia.service.basico.UnidadOrganizativaService;
import es.valencia.ws.dozer.VersionV20BeanFactory;
import es.valencia.schema.nie.listadestinos.ListaDestinosBaseTypeV11;
import es.valencia.schema.nie.listadestinos.ListaDestinosTypeV11;
import es.valencia.services.nie.comunicaciones.AddOrUpdateAdjuntoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.AddOrUpdateListaDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionResponseTypeV10;
import es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12;
import es.valencia.services.nie.comunicaciones.CreateOrUpdateComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.DeleteListaDestinoResponseTypeV10;
import es.valencia.services.nie.comunicaciones.FindComunicacionesRequestTypeV10;
import es.valencia.services.nie.comunicaciones.FindComunicacionesResponseTypeV11;
import es.valencia.services.nie.comunicaciones.FindListasDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.FindListasDestinoResponseTypeV11;
import es.valencia.services.nie.comunicaciones.FindListasUORequestTypeV10;
import es.valencia.services.nie.comunicaciones.FindListasUOResponseTypeV10;
import es.valencia.services.nie.comunicaciones.GetComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.GetNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ListaDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ListaDestinoResponseTypeV11;
import es.valencia.services.nie.comunicaciones.ListaListasDestinosTypeV11;
import es.valencia.services.nie.comunicaciones.ListaPerteneceTypeV10;
import es.valencia.services.nie.comunicaciones.NIResponseTypeV12;
import es.valencia.services.nie.comunicaciones.RecepcionarNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.RemoveAdjuntoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.RemoveAdjuntoResponseTypeV12;
import es.valencia.services.nie.comunicaciones.ToCanceladaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToFalloEnFirmaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToFirmadaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToRechazadaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToRedactadaResponseTypeV12;
import es.valencia.services.nie.comunicaciones.UpdateMiembrosListaDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.UpdateMiembrosListaDestinoResponseTypeV11;
import es.valencia.services.nie.comunicaciones.UpdateNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.UpdateNIResponseTypeV10;
import es.valencia.services.nie.comunicaciones.v20.ComunicacionPostconditionFault;
import es.valencia.services.nie.comunicaciones.v20.ComunicacionPreconditionFault;
import es.valencia.services.nie.comunicaciones.v20.ComunicacionesPortType;
import es.valencia.services.nie.comunicaciones.v20.EstadoIncorrectoComunicacionPostconditionFault;
import es.valencia.services.nie.comunicaciones.v20.ListaReferenciadaPostconditionFault;
import es.valencia.services.nie.comunicaciones.v20.UidNoExistePreconditionFault;

/**
 * 
 * Clase que implementa las operaciones definidas por el servicio de comunicaciones en la interfaz
 * {@link es.valencia.services.nie.comunicaciones.v20.ComunicacionesPortType}.
 * 
 * Para empezar a implementar un servicio creado con CXF, copiaremos, fuera de la estructura de
 * paquetes generada por CXF, la clase xxxxPorTypeImpl del servicio.
 * En este caso hemos copiado la clase
 * {@link es.valencia.services.nie.comunicaciones.v20.ComunicacionesPortTypeImpl} al paquete
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
 * - Llamada a la operación de negocio del backend.
 * - Mapeo, mediante dozer, de la respuesta de negocio a clases response del servicio.
 * 
 * 
 * @author LSG13
 * 
 */
@javax.jws.WebService(serviceName = "ComunicacionesService", portName = "ComunicacionesSOAP11", targetNamespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", wsdlLocation = "http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/Comunicaciones_v2.0_concreto", endpointInterface = "es.valencia.services.nie.comunicaciones.v20.ComunicacionesPortType")
public class ComunicacionesPortTypeImpl implements ComunicacionesPortType {

	private static final Logger logger = LogManager.getLogger(ComunicacionesPortTypeImpl.class);

	@Inject
	private AyFwkBeanMapper wsMapper;

	@Inject
	private ListaDestinoService listaDestinoService;

	@Inject
	private @Named("unidadOrganizativaService")
	UnidadOrganizativaService uoService;

	@Override
	public ListaDestinoResponseTypeV11 getListaDestino(ListaDestinoRequestTypeV10 request)
			throws UidNoExistePreconditionFault {

		logger.info("Executing operation getListaDestino");

		try {

			// Mapeo del objecto request a tipos básicos
			String unidadPropietaria = request.getUidUnidadPropietaria();
			String nombreCas = request.getNombreListaCas();

			// Llamada operación de negocio
			ListaDestino listaDestino = listaDestinoService.getListaDestino(unidadPropietaria, nombreCas);

			// Mapeo a clases Response
			return wsMapper.map(listaDestino, ListaDestinoResponseTypeV11.class);

		} catch (ListaDestinoPreconditionRuntimeException ex) {
			logger.error("", ex);
			throw new UidNoExistePreconditionFault(ex.getMessage());
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public ListaDestinoResponseTypeV11 addOrUpdateListaDestino(AddOrUpdateListaDestinoRequestTypeV10 request)
			throws UidNoExistePreconditionFault {

		logger.info("Executing operation addOrUpdateListaDestino");

		try {

			// Mapeo del objecto request a tipos básicos
			String nombreCas = request.getNombreListaCas();
			String nombreVal = request.getNombreListaVal();
			String descripcion = request.getDescripcion().getValue();
			List<String> uidsUnidades = request.getUidsUnidades() == null ? null : request.getUidsUnidades()
					.getUidUnidad();

			// Llamada operación de negocio
			Long kidUnidadPropietaria = null;
			if (request.getUidUnidadPropietaria() != null)
				kidUnidadPropietaria = uoService.getUnidadExistente(request.getUidUnidadPropietaria()).getKid();

			ListaDestino listaDestino = listaDestinoService.addOrUpdateListaDestino(kidUnidadPropietaria, nombreCas,
					nombreVal, descripcion, uidsUnidades);

			// Mapeo a clases Response
			return wsMapper.map(listaDestino, ListaDestinoResponseTypeV11.class);

		} catch (ListaDestinoPreconditionRuntimeException | UnidadOrganizativaException ex) {
			logger.error("", ex);
			throw new UidNoExistePreconditionFault(ex.getMessage());
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public DeleteListaDestinoResponseTypeV10 deleteListaDestino(ListaDestinoRequestTypeV10 request)
			throws ListaReferenciadaPostconditionFault {

		logger.info("Executing operation deleteListaDestino");

		try {
			// Mapeo del objecto request a tipos básicos
			Long kidUnidadPropietaria = null;
			String nombreCas = request.getNombreListaCas();

			// Llamada operación de negocio
			if (request.getUidUnidadPropietaria() != null)
				kidUnidadPropietaria = uoService.getUnidadExistente(request.getUidUnidadPropietaria()).getKid();
			listaDestinoService.deleteListaDestino(kidUnidadPropietaria, nombreCas);

			// Mapeo a clases Response
			DeleteListaDestinoResponseTypeV10 _return = new DeleteListaDestinoResponseTypeV10();
			_return.setVersion(VersionV20BeanFactory.getVersion());
			GregorianCalendar timestamp = (GregorianCalendar) Calendar.getInstance();
			_return.setTimestamp(DatatypeFactory.newInstance().newXMLGregorianCalendar(timestamp));
			return _return;

		} catch (ListaDestinoReferenciadaException | UnidadOrganizativaException ex) {
			logger.error("", ex);
			throw new ListaReferenciadaPostconditionFault(ex.getMessage());
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public FindListasDestinoResponseTypeV11 findListasDestino(FindListasDestinoRequestTypeV10 request)
			throws UidNoExistePreconditionFault {

		logger.info("Executing operation findListasDestino");

		try {
			// Mapeo del objecto request a tipos básicos
			String uidUnidadPropietaria = "";
			if (request.getUidUnidadPropietaria() != null && !request.getUidUnidadPropietaria().isNil()) {
				uidUnidadPropietaria = request.getUidUnidadPropietaria().getValue();
			}

			// Llamada operación de negocio
			String uidVisibleUnidad = request.getUidVisibleUnidad();
			List<ListaDestino> listasDestino = listaDestinoService.getListasDestino(uidUnidadPropietaria,
					uidVisibleUnidad);

			// Mapeo a clases Response
			List<ListaDestinosBaseTypeV11> listaRespuesta = wsMapper.mapList(listasDestino,
					ListaDestinosBaseTypeV11.class);

			FindListasDestinoResponseTypeV11 response = new FindListasDestinoResponseTypeV11();
			response.setListaListasDestinos(new ListaListasDestinosTypeV11());
			response.getListaListasDestinos().getListaDestinos().addAll(listaRespuesta);

			return response;
		} catch (ListaDestinoPreconditionRuntimeException ex) {
			logger.error("", ex);
			throw new UidNoExistePreconditionFault(ex.getMessage());
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public FindListasUOResponseTypeV10 findListasUO(FindListasUORequestTypeV10 request)
			throws UidNoExistePreconditionFault {

		logger.info("Executing operation findListasDestino");

		try {
			// Mapeo del objecto request a tipos básicos
			String uidUnidad = request.getUidUnidadOrganizativa();
			Boolean soloGlobales = request.isSoloListasGlobales();

			// Llamada operación de negocio
			List<ListaDestino> listasDestino = listaDestinoService.getListasUO(uidUnidad, soloGlobales);

			// Mapeo a clases Response
			List<ListaPerteneceTypeV10> listaRespuesta = wsMapper.mapList(listasDestino, ListaPerteneceTypeV10.class);

			FindListasUOResponseTypeV10 response = new FindListasUOResponseTypeV10();
			response.setVersion(VersionV20BeanFactory.getVersion());
			response.getListasListasPertenece().addAll(listaRespuesta);

			return response;
		} catch (ListaDestinoPreconditionRuntimeException ex) {
			logger.error("", ex);
			throw new UidNoExistePreconditionFault(ex.getMessage());
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public UpdateMiembrosListaDestinoResponseTypeV11 updateMiembrosListaDestino(
			UpdateMiembrosListaDestinoRequestTypeV10 request) throws UidNoExistePreconditionFault {

		logger.info("Executing operation addOrUpdateListaDestino");

		try {

			// Mapeo del objecto request a tipos básicos
			String nombreCas = request.getNombreListaCas();
			List<String> deleteMiembros = request.getDeleteMiembros() == null ? null : request.getDeleteMiembros()
					.getUidUnidad();
			List<String> addMiembros = request.getAddMiembros() == null ? null : request.getAddMiembros()
					.getUidUnidad();
			Boolean respuesta = request.isIncluirDetalleEnRespuesta();

			// Llamada operación de negocio
			Long kidUnidadPropietaria = null;
			if (request.getUidUnidadPropietaria() != null)
				kidUnidadPropietaria = uoService.getUnidadExistente(request.getUidUnidadPropietaria()).getKid();

			ListaDestino listaMiembros = listaDestinoService.updateMiembrosListaDestino(kidUnidadPropietaria,
					nombreCas, deleteMiembros, addMiembros);

			// Mapeo a clases Response
			UpdateMiembrosListaDestinoResponseTypeV11 response = new UpdateMiembrosListaDestinoResponseTypeV11();
			if (respuesta) {
				response.setVersion(VersionV20BeanFactory.getVersion());
				response.setDetalleLista(wsMapper.map(listaMiembros, ListaDestinosTypeV11.class));
			}
			GregorianCalendar timestamp = (GregorianCalendar) Calendar.getInstance();
			response.setFechaModificacion(DatatypeFactory.newInstance().newXMLGregorianCalendar(timestamp));
			return response;

		} catch (ListaDestinoPreconditionRuntimeException | UnidadOrganizativaException ex) {
			logger.error("", ex);
			throw new UidNoExistePreconditionFault(ex.getMessage());
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public NIResponseTypeV12 recepcionarNI(RecepcionarNIRequestTypeV10 request) throws ComunicacionPreconditionFault {

		logger.info("Executing operation recepcionarNI");
		try {
			NIResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 addOrUpdateAdjunto(AddOrUpdateAdjuntoRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation addOrUpdateAdjunto");

		try {
			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public ComunicacionResponseTypeV12 toRechazada(ToRechazadaRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation toRechazada");

		try {
			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}
	}

	@Override
	public RemoveAdjuntoResponseTypeV12 removeAdjunto(RemoveAdjuntoRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation removeAdjunto");

		try {

			RemoveAdjuntoResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 createOrUpdateComunicacion(CreateOrUpdateComunicacionRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation createOrUpdateComunicacion");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 toFalloEnFirma(ToFalloEnFirmaRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation toFalloEnFirma");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ToRedactadaResponseTypeV12 toRedactada(CodigoComunicacionRequestTypeV10 request)
			throws ComunicacionPostconditionFault, ComunicacionPreconditionFault {

		logger.info("Executing operation toRedactada");

		try {

			ToRedactadaResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public UpdateNIResponseTypeV10 updateNI(UpdateNIRequestTypeV10 request) throws ComunicacionPreconditionFault {

		logger.info("Executing operation updateNI");

		try {

			UpdateNIResponseTypeV10 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public CodigoComunicacionResponseTypeV10 deleteComunicacion(CodigoComunicacionRequestTypeV10 request)
			throws EstadoIncorrectoComunicacionPostconditionFault {

		logger.info("Executing operation deleteComunicacion");

		try {

			CodigoComunicacionResponseTypeV10 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public FindComunicacionesResponseTypeV11 findComunicaciones(FindComunicacionesRequestTypeV10 request) {

		logger.info("Executing operation findComunicaciones");

		try {

			FindComunicacionesResponseTypeV11 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 getComunicacion(GetComunicacionRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation getComunicacion");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 toFirmada(ToFirmadaRequestTypeV10 request) throws ComunicacionPreconditionFault {

		logger.info("Executing operation toFirmada");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 toCancelada(ToCanceladaRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation toCancelada");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 toEnRedaccion(CodigoComunicacionRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation toEnRedaccion");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 getNI(GetNIRequestTypeV10 request) throws ComunicacionPreconditionFault {

		logger.info("Executing operation getNI");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

	@Override
	public ComunicacionResponseTypeV12 toPendienteFirma(CodigoComunicacionRequestTypeV10 request)
			throws ComunicacionPreconditionFault {

		logger.info("Executing operation toPendienteFirma");

		try {

			ComunicacionResponseTypeV12 result = null;
			return result;
		} catch (Exception ex) {
			logger.error("", ex);
			throw new RuntimeException(ex);
		}

	}

}
