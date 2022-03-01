
package es.valencia.services.niedomain.unidadesorganizativas.v20;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import es.valencia.services.nie.unidadesorganizativas.UnidadPreconditionFaultTypeV10;
import es.valencia.services.niedomain.unidadesorganizativas.AddOrUpdateUnidadRequestTypeV20;
import es.valencia.services.niedomain.unidadesorganizativas.GetUnidadRequestTypeV12;
import es.valencia.services.niedomain.unidadesorganizativas.UnidadResponseTypeV20;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.valencia.services.niedomain.unidadesorganizativas.v20 package. 
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

    private final static QName _UnidadPreconditionFault_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", "UnidadPreconditionFault");
    private final static QName _AddOrUpdateUnidadRequest_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", "AddOrUpdateUnidadRequest");
    private final static QName _AddOrUpdateUnidadResponse_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", "AddOrUpdateUnidadResponse");
    private final static QName _GetUnidadRequest_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", "GetUnidadRequest");
    private final static QName _GetUnidadResponse_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", "GetUnidadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.valencia.services.niedomain.unidadesorganizativas.v20
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadPreconditionFaultTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", name = "UnidadPreconditionFault")
    public JAXBElement<UnidadPreconditionFaultTypeV10> createUnidadPreconditionFault(UnidadPreconditionFaultTypeV10 value) {
        return new JAXBElement<UnidadPreconditionFaultTypeV10>(_UnidadPreconditionFault_QNAME, UnidadPreconditionFaultTypeV10 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOrUpdateUnidadRequestTypeV20 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", name = "AddOrUpdateUnidadRequest")
    public JAXBElement<AddOrUpdateUnidadRequestTypeV20> createAddOrUpdateUnidadRequest(AddOrUpdateUnidadRequestTypeV20 value) {
        return new JAXBElement<AddOrUpdateUnidadRequestTypeV20>(_AddOrUpdateUnidadRequest_QNAME, AddOrUpdateUnidadRequestTypeV20 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadResponseTypeV20 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", name = "AddOrUpdateUnidadResponse")
    public JAXBElement<UnidadResponseTypeV20> createAddOrUpdateUnidadResponse(UnidadResponseTypeV20 value) {
        return new JAXBElement<UnidadResponseTypeV20>(_AddOrUpdateUnidadResponse_QNAME, UnidadResponseTypeV20 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnidadRequestTypeV12 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", name = "GetUnidadRequest")
    public JAXBElement<GetUnidadRequestTypeV12> createGetUnidadRequest(GetUnidadRequestTypeV12 value) {
        return new JAXBElement<GetUnidadRequestTypeV12>(_GetUnidadRequest_QNAME, GetUnidadRequestTypeV12 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnidadResponseTypeV20 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas/v20", name = "GetUnidadResponse")
    public JAXBElement<UnidadResponseTypeV20> createGetUnidadResponse(UnidadResponseTypeV20 value) {
        return new JAXBElement<UnidadResponseTypeV20>(_GetUnidadResponse_QNAME, UnidadResponseTypeV20 .class, null, value);
    }

}
