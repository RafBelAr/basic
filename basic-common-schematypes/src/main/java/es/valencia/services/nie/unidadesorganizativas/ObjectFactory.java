
package es.valencia.services.nie.unidadesorganizativas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import es.valencia.schema.nie.common.ResponsableTypeV10;
import es.valencia.schema.nie.common.UsuarioTypeV10;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.valencia.services.nie.unidadesorganizativas package. 
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

    private final static QName _FindUnidadesRequestTypeV12NifSustituto_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "NifSustituto");
    private final static QName _FindUnidadesRequestTypeV12UidPadre_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "UidPadre");
    private final static QName _FindUnidadesRequestTypeV12NifResponsable_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "NifResponsable");
    private final static QName _AddOrUpdateUnidadRequestTypeV20NombreCargoVal_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "NombreCargoVal");
    private final static QName _AddOrUpdateUnidadRequestTypeV20NombreCargoCas_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "NombreCargoCas");
    private final static QName _AddOrUpdateUnidadRequestTypeV20Responsable_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "Responsable");
    private final static QName _AddOrUpdateUnidadRequestTypeV12Sustituto_QNAME = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas", "Sustituto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.valencia.services.nie.unidadesorganizativas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddOrUpdateUnidadRequestTypeV20 }
     * 
     */
    public AddOrUpdateUnidadRequestTypeV20 createAddOrUpdateUnidadRequestTypeV20() {
        return new AddOrUpdateUnidadRequestTypeV20();
    }

    /**
     * Create an instance of {@link RemoveUnidadResponseTypeV10 }
     * 
     */
    public RemoveUnidadResponseTypeV10 createRemoveUnidadResponseTypeV10() {
        return new RemoveUnidadResponseTypeV10();
    }

    /**
     * Create an instance of {@link FindUnidadesRequestTypeV12 }
     * 
     */
    public FindUnidadesRequestTypeV12 createFindUnidadesRequestTypeV12() {
        return new FindUnidadesRequestTypeV12();
    }

    /**
     * Create an instance of {@link UnidadResponseTypeV20 }
     * 
     */
    public UnidadResponseTypeV20 createUnidadResponseTypeV20() {
        return new UnidadResponseTypeV20();
    }

    /**
     * Create an instance of {@link UnidadPreconditionFaultTypeV10 }
     * 
     */
    public UnidadPreconditionFaultTypeV10 createUnidadPreconditionFaultTypeV10() {
        return new UnidadPreconditionFaultTypeV10();
    }

    /**
     * Create an instance of {@link UidRequestTypeV10 }
     * 
     */
    public UidRequestTypeV10 createUidRequestTypeV10() {
        return new UidRequestTypeV10();
    }

    /**
     * Create an instance of {@link FindUnidadesResponseTypeV20 }
     * 
     */
    public FindUnidadesResponseTypeV20 createFindUnidadesResponseTypeV20() {
        return new FindUnidadesResponseTypeV20();
    }

    /**
     * Create an instance of {@link UnidadesOrganizativasTypeV20 }
     * 
     */
    public UnidadesOrganizativasTypeV20 createUnidadesOrganizativasTypeV20() {
        return new UnidadesOrganizativasTypeV20();
    }

    /**
     * Create an instance of {@link RequestMessageBaseTypeV10 }
     * 
     */
    public RequestMessageBaseTypeV10 createRequestMessageBaseTypeV10() {
        return new RequestMessageBaseTypeV10();
    }

    /**
     * Create an instance of {@link FindResponseMessageBaseTypeV10 }
     * 
     */
    public FindResponseMessageBaseTypeV10 createFindResponseMessageBaseTypeV10() {
        return new FindResponseMessageBaseTypeV10();
    }

    /**
     * Create an instance of {@link UnidadResponseTypeV12 }
     * 
     */
    public UnidadResponseTypeV12 createUnidadResponseTypeV12() {
        return new UnidadResponseTypeV12();
    }

    /**
     * Create an instance of {@link AddOrUpdateUnidadRequestTypeV12 }
     * 
     */
    public AddOrUpdateUnidadRequestTypeV12 createAddOrUpdateUnidadRequestTypeV12() {
        return new AddOrUpdateUnidadRequestTypeV12();
    }

    /**
     * Create an instance of {@link ResponseMessageBaseTypeV10 }
     * 
     */
    public ResponseMessageBaseTypeV10 createResponseMessageBaseTypeV10() {
        return new ResponseMessageBaseTypeV10();
    }

    /**
     * Create an instance of {@link FindUnidadesResponseTypeV12 }
     * 
     */
    public FindUnidadesResponseTypeV12 createFindUnidadesResponseTypeV12() {
        return new FindUnidadesResponseTypeV12();
    }

    /**
     * Create an instance of {@link FindRequestMessageBaseTypeV10 }
     * 
     */
    public FindRequestMessageBaseTypeV10 createFindRequestMessageBaseTypeV10() {
        return new FindRequestMessageBaseTypeV10();
    }

    /**
     * Create an instance of {@link UnidadesOrganizativasTypeV12 }
     * 
     */
    public UnidadesOrganizativasTypeV12 createUnidadesOrganizativasTypeV12() {
        return new UnidadesOrganizativasTypeV12();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "NifSustituto", scope = FindUnidadesRequestTypeV12 .class)
    public JAXBElement<String> createFindUnidadesRequestTypeV12NifSustituto(String value) {
        return new JAXBElement<String>(_FindUnidadesRequestTypeV12NifSustituto_QNAME, String.class, FindUnidadesRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "UidPadre", scope = FindUnidadesRequestTypeV12 .class)
    public JAXBElement<String> createFindUnidadesRequestTypeV12UidPadre(String value) {
        return new JAXBElement<String>(_FindUnidadesRequestTypeV12UidPadre_QNAME, String.class, FindUnidadesRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "NifResponsable", scope = FindUnidadesRequestTypeV12 .class)
    public JAXBElement<String> createFindUnidadesRequestTypeV12NifResponsable(String value) {
        return new JAXBElement<String>(_FindUnidadesRequestTypeV12NifResponsable_QNAME, String.class, FindUnidadesRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "NombreCargoVal", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV20NombreCargoVal(String value) {
        return new JAXBElement<String>(_AddOrUpdateUnidadRequestTypeV20NombreCargoVal_QNAME, String.class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "NombreCargoCas", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV20NombreCargoCas(String value) {
        return new JAXBElement<String>(_AddOrUpdateUnidadRequestTypeV20NombreCargoCas_QNAME, String.class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "Responsable", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<UsuarioTypeV10> createAddOrUpdateUnidadRequestTypeV20Responsable(UsuarioTypeV10 value) {
        return new JAXBElement<UsuarioTypeV10>(_AddOrUpdateUnidadRequestTypeV20Responsable_QNAME, UsuarioTypeV10 .class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "UidPadre", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV20UidPadre(String value) {
        return new JAXBElement<String>(_FindUnidadesRequestTypeV12UidPadre_QNAME, String.class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsableTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "Responsable", scope = AddOrUpdateUnidadRequestTypeV12 .class)
    public JAXBElement<ResponsableTypeV10> createAddOrUpdateUnidadRequestTypeV12Responsable(ResponsableTypeV10 value) {
        return new JAXBElement<ResponsableTypeV10>(_AddOrUpdateUnidadRequestTypeV20Responsable_QNAME, ResponsableTypeV10 .class, AddOrUpdateUnidadRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsableTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "Sustituto", scope = AddOrUpdateUnidadRequestTypeV12 .class)
    public JAXBElement<ResponsableTypeV10> createAddOrUpdateUnidadRequestTypeV12Sustituto(ResponsableTypeV10 value) {
        return new JAXBElement<ResponsableTypeV10>(_AddOrUpdateUnidadRequestTypeV12Sustituto_QNAME, ResponsableTypeV10 .class, AddOrUpdateUnidadRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", name = "UidPadre", scope = AddOrUpdateUnidadRequestTypeV12 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV12UidPadre(String value) {
        return new JAXBElement<String>(_FindUnidadesRequestTypeV12UidPadre_QNAME, String.class, AddOrUpdateUnidadRequestTypeV12 .class, value);
    }

}
