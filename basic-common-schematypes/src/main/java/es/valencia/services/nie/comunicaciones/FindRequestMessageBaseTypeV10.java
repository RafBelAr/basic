
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindRequestMessageBaseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindRequestMessageBaseType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.valencia.es/schema/SerTICEntidadBase}FindRequestMessageBaseType_v1.3">
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="callConstraint" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstResult" type="{http://www.valencia.es/schema/SerTICEntidadBase}FirstResultType_v1.1" />
 *       &lt;attribute name="maxResults" type="{http://www.valencia.es/schema/SerTICEntidadBase}MaxResultType_v1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindRequestMessageBaseType_v1.0")
@XmlSeeAlso({
    FindComunicacionesRequestTypeV10 .class,
    FindListasDestinoRequestTypeV10 .class
})
public class FindRequestMessageBaseTypeV10 {

    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "callConstraint")
    protected String callConstraint;
    @XmlAttribute(name = "firstResult")
    protected Integer firstResult;
    @XmlAttribute(name = "maxResults")
    protected Integer maxResults;

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

    /**
     * Obtiene el valor de la propiedad firstResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFirstResult() {
        return firstResult;
    }

    /**
     * Define el valor de la propiedad firstResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFirstResult(Integer value) {
        this.firstResult = value;
    }

    /**
     * Obtiene el valor de la propiedad maxResults.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Define el valor de la propiedad maxResults.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

}
