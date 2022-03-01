
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestMessageBaseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageBaseType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.valencia.es/schema/SerTICEntidadBase}RequestMessageBaseType_v1.2">
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callConstraint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageBaseType_v1.0")
@XmlSeeAlso({
    FindListasUORequestTypeV10 .class,
    AddOrUpdateListaDestinoRequestTypeV10 .class,
    CreateOrUpdateComunicacionRequestTypeV10 .class,
    ComprobarDestinoRequestTypeV10 .class,
    AddOrUpdateAdjuntoRequestTypeV10 .class,
    RemoveAdjuntoRequestTypeV10 .class,
    ListaDestinoRequestTypeV10 .class,
    RecepcionarNIRequestTypeV10 .class,
    AddOrUpdateNIRequestTypeV10 .class,
    CodigoComunicacionRequestTypeV10 .class,
    UpdateMiembrosListaDestinoRequestTypeV10 .class,
    ToFirmadaRequestTypeV10 .class,
    RegNIRequestTypeV10 .class
})
public class RequestMessageBaseTypeV10 {

    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "callConstraint")
    protected String callConstraint;

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad callConstraint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallConstraint() {
        return callConstraint;
    }

    /**
     * Define el valor de la propiedad callConstraint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallConstraint(String value) {
        this.callConstraint = value;
    }

}
