
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseMessageBaseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessageBaseType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.valencia.es/schema/SerTICEntidadBase}ResponseMessageBaseType_v1.0">
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessageBaseType_v1.0")
@XmlSeeAlso({
    ListaDestinoResponseTypeV11 .class,
    NIResponseTypeV12 .class,
    DeleteListaDestinoResponseTypeV10 .class,
    UpdateMiembrosListaDestinoResponseTypeV11 .class,
    RegNIResponseTypeV10 .class,
    ComunicacionResponseTypeV12 .class,
    UpdateNIResponseTypeV10 .class,
    ToRedactadaResponseTypeV12 .class,
    CodigoComunicacionResponseTypeV10 .class,
    ComprobarDestinoResponseTypeV10 .class,
    FindListasUOResponseTypeV10 .class
})
public class ResponseMessageBaseTypeV10 {

    @XmlAttribute(name = "version", required = true)
    protected String version;

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

}
