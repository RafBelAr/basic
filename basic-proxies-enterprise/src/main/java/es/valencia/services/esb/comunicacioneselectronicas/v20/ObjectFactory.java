
package es.valencia.services.esb.comunicacioneselectronicas.v20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import es.valencia.services.esb.comunicacioneselectronicas.AportarAExpedienteRequestTypeV20;
import es.valencia.services.esb.comunicacioneselectronicas.AportarAExpedienteResponseTypeV20;
import es.valencia.services.esb.comunicacioneselectronicas.CreateOrUpdateComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionResponseTypeV10;
import es.valencia.services.nie.comunicaciones.ComunicacionPostconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.ComunicacionPreconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10;
import es.valencia.services.nie.comunicaciones.FindComunicacionesRequestTypeV10;
import es.valencia.services.nie.comunicaciones.FindComunicacionesResponseTypeV11;
import es.valencia.services.nie.comunicaciones.NIResponseTypeV12;
import es.valencia.services.nie.comunicaciones.RecepcionarNIRequestTypeV10;
import es.valencia.services.nie.comunicaciones.RemoveAdjuntoRequestTypeV10;
import es.valencia.services.niedomain.comunicaciones.AddOrUpdateAdjuntoRequestTypeV10;
import es.valencia.services.niedomain.comunicaciones.CancelarComunicacionRequestTypeV10;
import es.valencia.services.niedomain.comunicaciones.GetComunicacionRequestTypeV10;
import es.valencia.services.niedomain.comunicaciones.GetNIRequestTypeV10;
import es.valencia.services.niedomain.comunicaciones.RecepcionadaRequestTypeV12;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.valencia.services.esb.comunicacioneselectronicas.v20 package. 
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

    private final static QName _FinalizarComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "FinalizarComunicacionRequest");
    private final static QName _DeleteComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "DeleteComunicacionResponse");
    private final static QName _AddOrUpdateAdjuntoResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "AddOrUpdateAdjuntoResponse");
    private final static QName _DeleteComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "DeleteComunicacionRequest");
    private final static QName _ToEnRedaccionRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "ToEnRedaccionRequest");
    private final static QName _FalloEnFirmaRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "FalloEnFirmaRequest");
    private final static QName _GetNIResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "GetNIResponse");
    private final static QName _ToEnRedaccionResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "ToEnRedaccionResponse");
    private final static QName _FinalizarComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "FinalizarComunicacionResponse");
    private final static QName _RechazadaRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "RechazadaRequest");
    private final static QName _GetComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "GetComunicacionResponse");
    private final static QName _RecepcionarNIResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "RecepcionarNIResponse");
    private final static QName _CanceladaRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "CanceladaRequest");
    private final static QName _FindComunicacionesRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "FindComunicacionesRequest");
    private final static QName _RecepcionadaRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "RecepcionadaRequest");
    private final static QName _RemoveAdjuntoResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "RemoveAdjuntoResponse");
    private final static QName _RecepcionarNIRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "RecepcionarNIRequest");
    private final static QName _PendienteFirmaRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "PendienteFirmaRequest");
    private final static QName _CancelarComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "CancelarComunicacionRequest");
    private final static QName _CancelarComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "CancelarComunicacionResponse");
    private final static QName _GetNIRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "GetNIRequest");
    private final static QName _GetComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "GetComunicacionRequest");
    private final static QName _FindComunicacionesResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "FindComunicacionesResponse");
    private final static QName _AddOrUpdateAdjuntoRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "AddOrUpdateAdjuntoRequest");
    private final static QName _RemoveAdjuntoRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "RemoveAdjuntoRequest");
    private final static QName _ComunicacionPreconditionFault_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "ComunicacionPreconditionFault");
    private final static QName _EstadoIncorrectoComunicacionPostconditionFault_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "EstadoIncorrectoComunicacionPostconditionFault");
    private final static QName _AportarAExpedienteResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "AportarAExpedienteResponse");
    private final static QName _ComunicacionPostconditionFault_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "ComunicacionPostconditionFault");
    private final static QName _AportarAExpedienteRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "AportarAExpedienteRequest");
    private final static QName _CreateOrUpdateComunicacionRequest_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "CreateOrUpdateComunicacionRequest");
    private final static QName _CreateOrUpdateComunicacionResponse_QNAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "CreateOrUpdateComunicacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.valencia.services.esb.comunicacioneselectronicas.v20
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "FinalizarComunicacionRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createFinalizarComunicacionRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_FinalizarComunicacionRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "DeleteComunicacionResponse")
    public JAXBElement<CodigoComunicacionResponseTypeV10> createDeleteComunicacionResponse(CodigoComunicacionResponseTypeV10 value) {
        return new JAXBElement<CodigoComunicacionResponseTypeV10>(_DeleteComunicacionResponse_QNAME, CodigoComunicacionResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "AddOrUpdateAdjuntoResponse")
    public JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12> createAddOrUpdateAdjuntoResponse(es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12>(_AddOrUpdateAdjuntoResponse_QNAME, es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "DeleteComunicacionRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createDeleteComunicacionRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_DeleteComunicacionRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "ToEnRedaccionRequest")
    public JAXBElement<CodigoComunicacionRequestTypeV10> createToEnRedaccionRequest(CodigoComunicacionRequestTypeV10 value) {
        return new JAXBElement<CodigoComunicacionRequestTypeV10>(_ToEnRedaccionRequest_QNAME, CodigoComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "FalloEnFirmaRequest")
    public JAXBElement<CodigoComunicacionResponseTypeV10> createFalloEnFirmaRequest(CodigoComunicacionResponseTypeV10 value) {
        return new JAXBElement<CodigoComunicacionResponseTypeV10>(_FalloEnFirmaRequest_QNAME, CodigoComunicacionResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "GetNIResponse")
    public JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12> createGetNIResponse(es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12>(_GetNIResponse_QNAME, es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "ToEnRedaccionResponse")
    public JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12> createToEnRedaccionResponse(es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12>(_ToEnRedaccionResponse_QNAME, es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "FinalizarComunicacionResponse")
    public JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12> createFinalizarComunicacionResponse(es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12>(_FinalizarComunicacionResponse_QNAME, es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "RechazadaRequest")
    public JAXBElement<CodigoComunicacionResponseTypeV10> createRechazadaRequest(CodigoComunicacionResponseTypeV10 value) {
        return new JAXBElement<CodigoComunicacionResponseTypeV10>(_RechazadaRequest_QNAME, CodigoComunicacionResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "GetComunicacionResponse")
    public JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12> createGetComunicacionResponse(es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12>(_GetComunicacionResponse_QNAME, es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NIResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "RecepcionarNIResponse")
    public JAXBElement<NIResponseTypeV12> createRecepcionarNIResponse(NIResponseTypeV12 value) {
        return new JAXBElement<NIResponseTypeV12>(_RecepcionarNIResponse_QNAME, NIResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoComunicacionResponseTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "CanceladaRequest")
    public JAXBElement<CodigoComunicacionResponseTypeV10> createCanceladaRequest(CodigoComunicacionResponseTypeV10 value) {
        return new JAXBElement<CodigoComunicacionResponseTypeV10>(_CanceladaRequest_QNAME, CodigoComunicacionResponseTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindComunicacionesRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "FindComunicacionesRequest")
    public JAXBElement<FindComunicacionesRequestTypeV10> createFindComunicacionesRequest(FindComunicacionesRequestTypeV10 value) {
        return new JAXBElement<FindComunicacionesRequestTypeV10>(_FindComunicacionesRequest_QNAME, FindComunicacionesRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionadaRequestTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "RecepcionadaRequest")
    public JAXBElement<RecepcionadaRequestTypeV12> createRecepcionadaRequest(RecepcionadaRequestTypeV12 value) {
        return new JAXBElement<RecepcionadaRequestTypeV12>(_RecepcionadaRequest_QNAME, RecepcionadaRequestTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "RemoveAdjuntoResponse")
    public JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12> createRemoveAdjuntoResponse(es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12>(_RemoveAdjuntoResponse_QNAME, es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecepcionarNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "RecepcionarNIRequest")
    public JAXBElement<RecepcionarNIRequestTypeV10> createRecepcionarNIRequest(RecepcionarNIRequestTypeV10 value) {
        return new JAXBElement<RecepcionarNIRequestTypeV10>(_RecepcionarNIRequest_QNAME, RecepcionarNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "PendienteFirmaRequest")
    public JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12> createPendienteFirmaRequest(es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12>(_PendienteFirmaRequest_QNAME, es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "CancelarComunicacionRequest")
    public JAXBElement<CancelarComunicacionRequestTypeV10> createCancelarComunicacionRequest(CancelarComunicacionRequestTypeV10 value) {
        return new JAXBElement<CancelarComunicacionRequestTypeV10>(_CancelarComunicacionRequest_QNAME, CancelarComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "CancelarComunicacionResponse")
    public JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12> createCancelarComunicacionResponse(es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12>(_CancelarComunicacionResponse_QNAME, es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNIRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "GetNIRequest")
    public JAXBElement<GetNIRequestTypeV10> createGetNIRequest(GetNIRequestTypeV10 value) {
        return new JAXBElement<GetNIRequestTypeV10>(_GetNIRequest_QNAME, GetNIRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "GetComunicacionRequest")
    public JAXBElement<GetComunicacionRequestTypeV10> createGetComunicacionRequest(GetComunicacionRequestTypeV10 value) {
        return new JAXBElement<GetComunicacionRequestTypeV10>(_GetComunicacionRequest_QNAME, GetComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindComunicacionesResponseTypeV11 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "FindComunicacionesResponse")
    public JAXBElement<FindComunicacionesResponseTypeV11> createFindComunicacionesResponse(FindComunicacionesResponseTypeV11 value) {
        return new JAXBElement<FindComunicacionesResponseTypeV11>(_FindComunicacionesResponse_QNAME, FindComunicacionesResponseTypeV11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateAdjuntoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "AddOrUpdateAdjuntoRequest")
    public JAXBElement<AddOrUpdateAdjuntoRequestTypeV10> createAddOrUpdateAdjuntoRequest(AddOrUpdateAdjuntoRequestTypeV10 value) {
        return new JAXBElement<AddOrUpdateAdjuntoRequestTypeV10>(_AddOrUpdateAdjuntoRequest_QNAME, AddOrUpdateAdjuntoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdjuntoRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "RemoveAdjuntoRequest")
    public JAXBElement<RemoveAdjuntoRequestTypeV10> createRemoveAdjuntoRequest(RemoveAdjuntoRequestTypeV10 value) {
        return new JAXBElement<RemoveAdjuntoRequestTypeV10>(_RemoveAdjuntoRequest_QNAME, RemoveAdjuntoRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionPreconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "ComunicacionPreconditionFault")
    public JAXBElement<ComunicacionPreconditionFaultMessageTypeV10> createComunicacionPreconditionFault(ComunicacionPreconditionFaultMessageTypeV10 value) {
        return new JAXBElement<ComunicacionPreconditionFaultMessageTypeV10>(_ComunicacionPreconditionFault_QNAME, ComunicacionPreconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "EstadoIncorrectoComunicacionPostconditionFault")
    public JAXBElement<EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10> createEstadoIncorrectoComunicacionPostconditionFault(EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 value) {
        return new JAXBElement<EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10>(_EstadoIncorrectoComunicacionPostconditionFault_QNAME, EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AportarAExpedienteResponseTypeV20 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "AportarAExpedienteResponse")
    public JAXBElement<AportarAExpedienteResponseTypeV20> createAportarAExpedienteResponse(AportarAExpedienteResponseTypeV20 value) {
        return new JAXBElement<AportarAExpedienteResponseTypeV20>(_AportarAExpedienteResponse_QNAME, AportarAExpedienteResponseTypeV20 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComunicacionPostconditionFaultMessageTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "ComunicacionPostconditionFault")
    public JAXBElement<ComunicacionPostconditionFaultMessageTypeV10> createComunicacionPostconditionFault(ComunicacionPostconditionFaultMessageTypeV10 value) {
        return new JAXBElement<ComunicacionPostconditionFaultMessageTypeV10>(_ComunicacionPostconditionFault_QNAME, ComunicacionPostconditionFaultMessageTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AportarAExpedienteRequestTypeV20 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "AportarAExpedienteRequest")
    public JAXBElement<AportarAExpedienteRequestTypeV20> createAportarAExpedienteRequest(AportarAExpedienteRequestTypeV20 value) {
        return new JAXBElement<AportarAExpedienteRequestTypeV20>(_AportarAExpedienteRequest_QNAME, AportarAExpedienteRequestTypeV20 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrUpdateComunicacionRequestTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "CreateOrUpdateComunicacionRequest")
    public JAXBElement<CreateOrUpdateComunicacionRequestTypeV10> createCreateOrUpdateComunicacionRequest(CreateOrUpdateComunicacionRequestTypeV10 value) {
        return new JAXBElement<CreateOrUpdateComunicacionRequestTypeV10>(_CreateOrUpdateComunicacionRequest_QNAME, CreateOrUpdateComunicacionRequestTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", name = "CreateOrUpdateComunicacionResponse")
    public JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12> createCreateOrUpdateComunicacionResponse(es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 value) {
        return new JAXBElement<es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12>(_CreateOrUpdateComunicacionResponse_QNAME, es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 .class, null, value);
    }

}
