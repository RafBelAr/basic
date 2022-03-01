
package es.valencia.services.nie.unidadesorganizativas;

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
    AddOrUpdateUnidadRequestTypeV20 .class,
    UidRequestTypeV10 .class,
    AddOrUpdateUnidadRequestTypeV12 .class
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
