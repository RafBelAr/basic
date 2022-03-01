
package es.valencia.services.nie.comunicaciones.v20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import es.valencia.services.nie.comunicaciones.AddOrUpdateAdjuntoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.AddOrUpdateListaDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.AddOrUpdateNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionResponseTypeV10;
import es.valencia.services.nie.comunicaciones.ComprobarDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ComprobarDestinoResponseTypeV10;
import es.valencia.services.nie.comunicaciones.ComunicacionPostconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.ComunicacionPreconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12;
import es.valencia.services.nie.comunicaciones.CreateOrUpdateComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.DeleteListaDestinoResponseTypeV10;
import es.valencia.services.nie.comunicaciones.EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10;
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
import es.valencia.services.nie.comunicaciones.ListaReferenciadaPostconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.NIResponseTypeV12;
import es.valencia.services.nie.comunicaciones.RecepcionarNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.RegNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.RegNIResponseTypeV10;
import es.valencia.services.nie.comunicaciones.RemoveAdjuntoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.RemoveAdjuntoResponseTypeV12;
import es.valencia.services.nie.comunicaciones.ToCanceladaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToFalloEnFirmaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToFirmadaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToRechazadaRequestTypeV10;
import es.valencia.services.nie.comunicaciones.ToRedactadaResponseTypeV12;
import es.valencia.services.nie.comunicaciones.UidNoExistePreconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.UpdateMiembrosListaDestinoRequestTypeV10;
import es.valencia.services.nie.comunicaciones.UpdateMiembrosListaDestinoResponseTypeV11;
import es.valencia.services.nie.comunicaciones.UpdateNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.UpdateNIResponseTypeV10;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.valencia.services.nie.comunicaciones.v20 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteListaDestinoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "DeleteListaDestinoRequest");
    private final static QName _ToRechazadaRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToRechazadaRequest");
    private final static QName _UidNoExistePreconditionFault_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "UidNoExistePreconditionFault");
    private final static QName _ToCanceladaRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToCanceladaRequest");
    private final static QName _AddOrUpdateNIRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "AddOrUpdateNIRequest");
    private final static QName _DeleteComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "DeleteComunicacionResponse");
    private final static QName _ToCanceladaResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToCanceladaResponse");
    private final static QName _ToRedactadaRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToRedactadaRequest");
    private final static QName _ToPendienteFirmaResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToPendienteFirmaResponse");
    private final static QName _RemoveAdjuntoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "RemoveAdjuntoResponse");
    private final static QName _UpdateNIResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "UpdateNIResponse");
    private final static QName _GetListaDestinoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "GetListaDestinoRequest");
    private final static QName _RecepcionarNIRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "RecepcionarNIRequest");
    private final static QName _ToRedactadaResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToRedactadaResponse");
    private final static QName _GetListaDestinoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "GetListaDestinoResponse");
    private final static QName _FindComunicacionesRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "FindComunicacionesRequest");
    private final static QName _GetComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "GetComunicacionResponse");
    private final static QName _FindListasUOResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "FindListasUOResponse");
    private final static QName _FindListasDestinoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "FindListasDestinoRequest");
    private final static QName _ToFirmadaRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToFirmadaRequest");
    private final static QName _GetNIRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "GetNIRequest");
    private final static QName _ComprobarDestinoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ComprobarDestinoResponse");
    private final static QName _CreateOrUpdateComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "CreateOrUpdateComunicacionResponse");
    private final static QName _UpdateMiembrosListaDestinoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "UpdateMiembrosListaDestinoRequest");
    private final static QName _AddOrUpdateNIResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "AddOrUpdateNIResponse");
    private final static QName _ToFirmadaResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToFirmadaResponse");
    private final static QName _FindListasDestinoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "FindListasDestinoResponse");
    private final static QName _ToFalloEnFirmaRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToFalloEnFirmaRequest");
    private final static QName _GetNIResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "GetNIResponse");
    private final static QName _ToFalloEnFirmaResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToFalloEnFirmaResponse");
    private final static QName _DeleteComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "DeleteComunicacionRequest");
    private final static QName _DeleteListaDestinoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "DeleteListaDestinoResponse");
    private final static QName _AddOrUpdateAdjuntoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "AddOrUpdateAdjuntoResponse");
    private final static QName _ToEnRedaccionRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToEnRedaccionRequest");
    private final static QName _AddOrUpdateListaDestinoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "AddOrUpdateListaDestinoRequest");
    private final static QName _UpdateMiembrosListaDestinoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "UpdateMiembrosListaDestinoResponse");
    private final static QName _ToEnRedaccionResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToEnRedaccionResponse");
    private final static QName _AddOrUpdateListaDestinoResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "AddOrUpdateListaDestinoResponse");
    private final static QName _ToRechazadaResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToRechazadaResponse");
    private final static QName _FindListasUORequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "FindListasUORequest");
    private final static QName _RecepcionarNIResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "RecepcionarNIResponse");
    private final static QName _ComunicacionPreconditionFault_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ComunicacionPreconditionFault");
    private final static QName _RemoveNIResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "RemoveNIResponse");
    private final static QName _UpdateNIRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "UpdateNIRequest");
    private final static QName _EstadoIncorrectoComunicacionPostconditionFault_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "EstadoIncorrectoComunicacionPostconditionFault");
    private final static QName _GetComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "GetComunicacionRequest");
    private final static QName _FindComunicacionesResponse_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "FindComunicacionesResponse");
    private final static QName _AddOrUpdateAdjuntoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "AddOrUpdateAdjuntoRequest");
    private final static QName _RemoveAdjuntoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "RemoveAdjuntoRequest");
    private final static QName _ComprobarDestinoRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ComprobarDestinoRequest");
    private final static QName _RemoveNIRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "RemoveNIRequest");
    private final static QName _ListaReferenciadaPostconditionFault_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ListaReferenciadaPostconditionFault");
    private final static QName _ToPendienteFirmaRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ToPendienteFirmaRequest");
    private final static QName _ComunicacionPostconditionFault_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ComunicacionPostconditionFault");
    private final static QName _CreateOrUpdateComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "CreateOrUpdateComunicacionRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.valencia.services.nie.comunicaciones.v20
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDestinoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "DeleteListaDestinoRequest")
    public JAXBElement<ListaDestinoRequestTypeV10> createDeleteListaDestinoRequest(ListaDestinoRequestTypeV10 value) {
        return new JAXBElement<ListaDestinoRequestTypeV10>(_DeleteListaDestinoRequest_QNAME, ListaDestinoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToRechazadaRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToRechazadaRequest")
    public JAXBElement<ToRechazadaRequestTypeV10> createToRechazadaRequest(ToRechazadaRequestTypeV10 value) {
        return new JAXBElement<ToRechazadaRequestTypeV10>(_ToRechazadaRequest_QNAME, ToRechazadaRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UidNoExistePreconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "UidNoExistePreconditionFault")
    public JAXBElement<UidNoExistePreconditionFaultMessageTypeV10> createUidNoExistePreconditionFault(UidNoExistePreconditionFaultMessageTypeV10 value) {
        return new JAXBElement<UidNoExistePreconditionFaultMessageTypeV10>(_UidNoExistePreconditionFault_QNAME, UidNoExistePreconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToCanceladaRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToCanceladaRequest")
    public JAXBElement<ToCanceladaRequestTypeV10> createToCanceladaRequest(ToCanceladaRequestTypeV10 value) {
        return new JAXBElement<ToCanceladaRequestTypeV10>(_ToCanceladaRequest_QNAME, ToCanceladaRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "AddOrUpdateNIRequest")
    public JAXBElement<AddOrUpdateNIRequestTypeV10> createAddOrUpdateNIRequest(AddOrUpdateNIRequestTypeV10 value) {
        return new JAXBElement<AddOrUpdateNIRequestTypeV10>(_AddOrUpdateNIRequest_QNAME, AddOrUpdateNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "DeleteComunicacionResponse")
    public JAXBElement<CodigoComunicacionResponseTypeV10> createDeleteComunicacionResponse(CodigoComunicacionResponseTypeV10 value) {
        return new JAXBElement<CodigoComunicacionResponseTypeV10>(_DeleteComunicacionResponse_QNAME, CodigoComunicacionResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToCanceladaResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createToCanceladaResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_ToCanceladaResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToRedactadaRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createToRedactadaRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_ToRedactadaRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToPendienteFirmaResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createToPendienteFirmaResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_ToPendienteFirmaResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdjuntoResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "RemoveAdjuntoResponse")
    public JAXBElement<RemoveAdjuntoResponseTypeV12> createRemoveAdjuntoResponse(RemoveAdjuntoResponseTypeV12 value) {
        return new JAXBElement<RemoveAdjuntoResponseTypeV12>(_RemoveAdjuntoResponse_QNAME, RemoveAdjuntoResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNIResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "UpdateNIResponse")
    public JAXBElement<UpdateNIResponseTypeV10> createUpdateNIResponse(UpdateNIResponseTypeV10 value) {
        return new JAXBElement<UpdateNIResponseTypeV10>(_UpdateNIResponse_QNAME, UpdateNIResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDestinoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "GetListaDestinoRequest")
    public JAXBElement<ListaDestinoRequestTypeV10> createGetListaDestinoRequest(ListaDestinoRequestTypeV10 value) {
        return new JAXBElement<ListaDestinoRequestTypeV10>(_GetListaDestinoRequest_QNAME, ListaDestinoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionarNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "RecepcionarNIRequest")
    public JAXBElement<RecepcionarNIRequestTypeV10> createRecepcionarNIRequest(RecepcionarNIRequestTypeV10 value) {
        return new JAXBElement<RecepcionarNIRequestTypeV10>(_RecepcionarNIRequest_QNAME, RecepcionarNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToRedactadaResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToRedactadaResponse")
    public JAXBElement<ToRedactadaResponseTypeV12> createToRedactadaResponse(ToRedactadaResponseTypeV12 value) {
        return new JAXBElement<ToRedactadaResponseTypeV12>(_ToRedactadaResponse_QNAME, ToRedactadaResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDestinoResponseTypeV11 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "GetListaDestinoResponse")
    public JAXBElement<ListaDestinoResponseTypeV11> createGetListaDestinoResponse(ListaDestinoResponseTypeV11 value) {
        return new JAXBElement<ListaDestinoResponseTypeV11>(_GetListaDestinoResponse_QNAME, ListaDestinoResponseTypeV11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindComunicacionesRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "FindComunicacionesRequest")
    public JAXBElement<FindComunicacionesRequestTypeV10> createFindComunicacionesRequest(FindComunicacionesRequestTypeV10 value) {
        return new JAXBElement<FindComunicacionesRequestTypeV10>(_FindComunicacionesRequest_QNAME, FindComunicacionesRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "GetComunicacionResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createGetComunicacionResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_GetComunicacionResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindListasUOResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "FindListasUOResponse")
    public JAXBElement<FindListasUOResponseTypeV10> createFindListasUOResponse(FindListasUOResponseTypeV10 value) {
        return new JAXBElement<FindListasUOResponseTypeV10>(_FindListasUOResponse_QNAME, FindListasUOResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindListasDestinoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "FindListasDestinoRequest")
    public JAXBElement<FindListasDestinoRequestTypeV10> createFindListasDestinoRequest(FindListasDestinoRequestTypeV10 value) {
        return new JAXBElement<FindListasDestinoRequestTypeV10>(_FindListasDestinoRequest_QNAME, FindListasDestinoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToFirmadaRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToFirmadaRequest")
    public JAXBElement<ToFirmadaRequestTypeV10> createToFirmadaRequest(ToFirmadaRequestTypeV10 value) {
        return new JAXBElement<ToFirmadaRequestTypeV10>(_ToFirmadaRequest_QNAME, ToFirmadaRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "GetNIRequest")
    public JAXBElement<GetNIRequestTypeV10> createGetNIRequest(GetNIRequestTypeV10 value) {
        return new JAXBElement<GetNIRequestTypeV10>(_GetNIRequest_QNAME, GetNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarDestinoResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ComprobarDestinoResponse")
    public JAXBElement<ComprobarDestinoResponseTypeV10> createComprobarDestinoResponse(ComprobarDestinoResponseTypeV10 value) {
        return new JAXBElement<ComprobarDestinoResponseTypeV10>(_ComprobarDestinoResponse_QNAME, ComprobarDestinoResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "CreateOrUpdateComunicacionResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createCreateOrUpdateComunicacionResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_CreateOrUpdateComunicacionResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMiembrosListaDestinoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "UpdateMiembrosListaDestinoRequest")
    public JAXBElement<UpdateMiembrosListaDestinoRequestTypeV10> createUpdateMiembrosListaDestinoRequest(UpdateMiembrosListaDestinoRequestTypeV10 value) {
        return new JAXBElement<UpdateMiembrosListaDestinoRequestTypeV10>(_UpdateMiembrosListaDestinoRequest_QNAME, UpdateMiembrosListaDestinoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NIResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "AddOrUpdateNIResponse")
    public JAXBElement<NIResponseTypeV12> createAddOrUpdateNIResponse(NIResponseTypeV12 value) {
        return new JAXBElement<NIResponseTypeV12>(_AddOrUpdateNIResponse_QNAME, NIResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToFirmadaResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createToFirmadaResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_ToFirmadaResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindListasDestinoResponseTypeV11 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "FindListasDestinoResponse")
    public JAXBElement<FindListasDestinoResponseTypeV11> createFindListasDestinoResponse(FindListasDestinoResponseTypeV11 value) {
        return new JAXBElement<FindListasDestinoResponseTypeV11>(_FindListasDestinoResponse_QNAME, FindListasDestinoResponseTypeV11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToFalloEnFirmaRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToFalloEnFirmaRequest")
    public JAXBElement<ToFalloEnFirmaRequestTypeV10> createToFalloEnFirmaRequest(ToFalloEnFirmaRequestTypeV10 value) {
        return new JAXBElement<ToFalloEnFirmaRequestTypeV10>(_ToFalloEnFirmaRequest_QNAME, ToFalloEnFirmaRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "GetNIResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createGetNIResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_GetNIResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToFalloEnFirmaResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createToFalloEnFirmaResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_ToFalloEnFirmaResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "DeleteComunicacionRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createDeleteComunicacionRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_DeleteComunicacionRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteListaDestinoResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "DeleteListaDestinoResponse")
    public JAXBElement<DeleteListaDestinoResponseTypeV10> createDeleteListaDestinoResponse(DeleteListaDestinoResponseTypeV10 value) {
        return new JAXBElement<DeleteListaDestinoResponseTypeV10>(_DeleteListaDestinoResponse_QNAME, DeleteListaDestinoResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "AddOrUpdateAdjuntoResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createAddOrUpdateAdjuntoResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_AddOrUpdateAdjuntoResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToEnRedaccionRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createToEnRedaccionRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_ToEnRedaccionRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateListaDestinoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "AddOrUpdateListaDestinoRequest")
    public JAXBElement<AddOrUpdateListaDestinoRequestTypeV10> createAddOrUpdateListaDestinoRequest(AddOrUpdateListaDestinoRequestTypeV10 value) {
        return new JAXBElement<AddOrUpdateListaDestinoRequestTypeV10>(_AddOrUpdateListaDestinoRequest_QNAME, AddOrUpdateListaDestinoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMiembrosListaDestinoResponseTypeV11 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "UpdateMiembrosListaDestinoResponse")
    public JAXBElement<UpdateMiembrosListaDestinoResponseTypeV11> createUpdateMiembrosListaDestinoResponse(UpdateMiembrosListaDestinoResponseTypeV11 value) {
        return new JAXBElement<UpdateMiembrosListaDestinoResponseTypeV11>(_UpdateMiembrosListaDestinoResponse_QNAME, UpdateMiembrosListaDestinoResponseTypeV11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToEnRedaccionResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createToEnRedaccionResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_ToEnRedaccionResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaDestinoResponseTypeV11 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "AddOrUpdateListaDestinoResponse")
    public JAXBElement<ListaDestinoResponseTypeV11> createAddOrUpdateListaDestinoResponse(ListaDestinoResponseTypeV11 value) {
        return new JAXBElement<ListaDestinoResponseTypeV11>(_AddOrUpdateListaDestinoResponse_QNAME, ListaDestinoResponseTypeV11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToRechazadaResponse")
    public JAXBElement<ComunicacionResponseTypeV12> createToRechazadaResponse(ComunicacionResponseTypeV12 value) {
        return new JAXBElement<ComunicacionResponseTypeV12>(_ToRechazadaResponse_QNAME, ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindListasUORequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "FindListasUORequest")
    public JAXBElement<FindListasUORequestTypeV10> createFindListasUORequest(FindListasUORequestTypeV10 value) {
        return new JAXBElement<FindListasUORequestTypeV10>(_FindListasUORequest_QNAME, FindListasUORequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NIResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "RecepcionarNIResponse")
    public JAXBElement<NIResponseTypeV12> createRecepcionarNIResponse(NIResponseTypeV12 value) {
        return new JAXBElement<NIResponseTypeV12>(_RecepcionarNIResponse_QNAME, NIResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionPreconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ComunicacionPreconditionFault")
    public JAXBElement<ComunicacionPreconditionFaultMessageTypeV10> createComunicacionPreconditionFault(ComunicacionPreconditionFaultMessageTypeV10 value) {
        return new JAXBElement<ComunicacionPreconditionFaultMessageTypeV10>(_ComunicacionPreconditionFault_QNAME, ComunicacionPreconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegNIResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "RemoveNIResponse")
    public JAXBElement<RegNIResponseTypeV10> createRemoveNIResponse(RegNIResponseTypeV10 value) {
        return new JAXBElement<RegNIResponseTypeV10>(_RemoveNIResponse_QNAME, RegNIResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "UpdateNIRequest")
    public JAXBElement<UpdateNIRequestTypeV10> createUpdateNIRequest(UpdateNIRequestTypeV10 value) {
        return new JAXBElement<UpdateNIRequestTypeV10>(_UpdateNIRequest_QNAME, UpdateNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "EstadoIncorrectoComunicacionPostconditionFault")
    public JAXBElement<EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10> createEstadoIncorrectoComunicacionPostconditionFault(EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 value) {
        return new JAXBElement<EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10>(_EstadoIncorrectoComunicacionPostconditionFault_QNAME, EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "GetComunicacionRequest")
    public JAXBElement<GetComunicacionRequestTypeV10> createGetComunicacionRequest(GetComunicacionRequestTypeV10 value) {
        return new JAXBElement<GetComunicacionRequestTypeV10>(_GetComunicacionRequest_QNAME, GetComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindComunicacionesResponseTypeV11 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "FindComunicacionesResponse")
    public JAXBElement<FindComunicacionesResponseTypeV11> createFindComunicacionesResponse(FindComunicacionesResponseTypeV11 value) {
        return new JAXBElement<FindComunicacionesResponseTypeV11>(_FindComunicacionesResponse_QNAME, FindComunicacionesResponseTypeV11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateAdjuntoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "AddOrUpdateAdjuntoRequest")
    public JAXBElement<AddOrUpdateAdjuntoRequestTypeV10> createAddOrUpdateAdjuntoRequest(AddOrUpdateAdjuntoRequestTypeV10 value) {
        return new JAXBElement<AddOrUpdateAdjuntoRequestTypeV10>(_AddOrUpdateAdjuntoRequest_QNAME, AddOrUpdateAdjuntoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdjuntoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "RemoveAdjuntoRequest")
    public JAXBElement<RemoveAdjuntoRequestTypeV10> createRemoveAdjuntoRequest(RemoveAdjuntoRequestTypeV10 value) {
        return new JAXBElement<RemoveAdjuntoRequestTypeV10>(_RemoveAdjuntoRequest_QNAME, RemoveAdjuntoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarDestinoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ComprobarDestinoRequest")
    public JAXBElement<ComprobarDestinoRequestTypeV10> createComprobarDestinoRequest(ComprobarDestinoRequestTypeV10 value) {
        return new JAXBElement<ComprobarDestinoRequestTypeV10>(_ComprobarDestinoRequest_QNAME, ComprobarDestinoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "RemoveNIRequest")
    public JAXBElement<RegNIRequestTypeV10> createRemoveNIRequest(RegNIRequestTypeV10 value) {
        return new JAXBElement<RegNIRequestTypeV10>(_RemoveNIRequest_QNAME, RegNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaReferenciadaPostconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ListaReferenciadaPostconditionFault")
    public JAXBElement<ListaReferenciadaPostconditionFaultMessageTypeV10> createListaReferenciadaPostconditionFault(ListaReferenciadaPostconditionFaultMessageTypeV10 value) {
        return new JAXBElement<ListaReferenciadaPostconditionFaultMessageTypeV10>(_ListaReferenciadaPostconditionFault_QNAME, ListaReferenciadaPostconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ToPendienteFirmaRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createToPendienteFirmaRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_ToPendienteFirmaRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionPostconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "ComunicacionPostconditionFault")
    public JAXBElement<ComunicacionPostconditionFaultMessageTypeV10> createComunicacionPostconditionFault(ComunicacionPostconditionFaultMessageTypeV10 value) {
        return new JAXBElement<ComunicacionPostconditionFaultMessageTypeV10>(_ComunicacionPostconditionFault_QNAME, ComunicacionPostconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/Comunicaciones/v20", name = "CreateOrUpdateComunicacionRequest")
    public JAXBElement<CreateOrUpdateComunicacionRequestTypeV10> createCreateOrUpdateComunicacionRequest(CreateOrUpdateComunicacionRequestTypeV10 value) {
        return new JAXBElement<CreateOrUpdateComunicacionRequestTypeV10>(_CreateOrUpdateComunicacionRequest_QNAME, CreateOrUpdateComunicacionRequestTypeV10 .class, null, value);
    }

}
