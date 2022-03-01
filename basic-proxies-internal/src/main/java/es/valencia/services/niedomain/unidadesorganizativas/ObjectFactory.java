
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import es.valencia.schema.nie.common.ResponsableTypeV10;
import es.valencia.schema.nie.common.UsuarioTypeV10;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.valencia.services.niedomain.unidadesorganizativas package. 
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

    private final static QName _AddOrUpdateUnidadRequestTypeV20UidPadre_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", "UidPadre");
    private final static QName _AddOrUpdateUnidadRequestTypeV20Responsable_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", "Responsable");
    private final static QName _AddOrUpdateUnidadRequestTypeV20NombreCargoCas_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", "NombreCargoCas");
    private final static QName _AddOrUpdateUnidadRequestTypeV20NombreCargoVal_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", "NombreCargoVal");
    private final static QName _AddOrUpdateUnidadRequestTypeV12Sustituto_QNAME = new QName("http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", "Sustituto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.valencia.services.niedomain.unidadesorganizativas
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
     * Create an instance of {@link UnidadResponseTypeV20 }
     * 
     */
    public UnidadResponseTypeV20 createUnidadResponseTypeV20() {
        return new UnidadResponseTypeV20();
    }

    /**
     * Create an instance of {@link GetUnidadRequestTypeV12 }
     * 
     */
    public GetUnidadRequestTypeV12 createGetUnidadRequestTypeV12() {
        return new GetUnidadRequestTypeV12();
    }

    /**
     * Create an instance of {@link RedactoresDeshabilitadosTypeV20 }
     * 
     */
    public RedactoresDeshabilitadosTypeV20 createRedactoresDeshabilitadosTypeV20() {
        return new RedactoresDeshabilitadosTypeV20();
    }

    /**
     * Create an instance of {@link UnidadResponseTypeV12 }
     * 
     */
    public UnidadResponseTypeV12 createUnidadResponseTypeV12() {
        return new UnidadResponseTypeV12();
    }

    /**
     * Create an instance of {@link GestoresTypeV10 }
     * 
     */
    public GestoresTypeV10 createGestoresTypeV10() {
        return new GestoresTypeV10();
    }

    /**
     * Create an instance of {@link AddOrUpdateUnidadRequestTypeV12 }
     * 
     */
    public AddOrUpdateUnidadRequestTypeV12 createAddOrUpdateUnidadRequestTypeV12() {
        return new AddOrUpdateUnidadRequestTypeV12();
    }

    /**
     * Create an instance of {@link SustitutoTypeV10 }
     * 
     */
    public SustitutoTypeV10 createSustitutoTypeV10() {
        return new SustitutoTypeV10();
    }

    /**
     * Create an instance of {@link SustitutosTypeV20 }
     * 
     */
    public SustitutosTypeV20 createSustitutosTypeV20() {
        return new SustitutosTypeV20();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "UidPadre", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV20UidPadre(String value) {
        return new JAXBElement<String>(_AddOrUpdateUnidadRequestTypeV20UidPadre_QNAME, String.class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsuarioTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "Responsable", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<UsuarioTypeV10> createAddOrUpdateUnidadRequestTypeV20Responsable(UsuarioTypeV10 value) {
        return new JAXBElement<UsuarioTypeV10>(_AddOrUpdateUnidadRequestTypeV20Responsable_QNAME, UsuarioTypeV10 .class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "NombreCargoCas", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV20NombreCargoCas(String value) {
        return new JAXBElement<String>(_AddOrUpdateUnidadRequestTypeV20NombreCargoCas_QNAME, String.class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "NombreCargoVal", scope = AddOrUpdateUnidadRequestTypeV20 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV20NombreCargoVal(String value) {
        return new JAXBElement<String>(_AddOrUpdateUnidadRequestTypeV20NombreCargoVal_QNAME, String.class, AddOrUpdateUnidadRequestTypeV20 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "UidPadre", scope = AddOrUpdateUnidadRequestTypeV12 .class)
    public JAXBElement<String> createAddOrUpdateUnidadRequestTypeV12UidPadre(String value) {
        return new JAXBElement<String>(_AddOrUpdateUnidadRequestTypeV20UidPadre_QNAME, String.class, AddOrUpdateUnidadRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponsableTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "Responsable", scope = AddOrUpdateUnidadRequestTypeV12 .class)
    public JAXBElement<ResponsableTypeV10> createAddOrUpdateUnidadRequestTypeV12Responsable(ResponsableTypeV10 value) {
        return new JAXBElement<ResponsableTypeV10>(_AddOrUpdateUnidadRequestTypeV20Responsable_QNAME, ResponsableTypeV10 .class, AddOrUpdateUnidadRequestTypeV12 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SustitutoTypeV10 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", name = "Sustituto", scope = AddOrUpdateUnidadRequestTypeV12 .class)
    public JAXBElement<SustitutoTypeV10> createAddOrUpdateUnidadRequestTypeV12Sustituto(SustitutoTypeV10 value) {
        return new JAXBElement<SustitutoTypeV10>(_AddOrUpdateUnidadRequestTypeV12Sustituto_QNAME, SustitutoTypeV10 .class, AddOrUpdateUnidadRequestTypeV12 .class, value);
    }

}
