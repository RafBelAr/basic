
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindResponseMessageBaseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindResponseMessageBaseType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.valencia.es/schema/SerTICEntidadBase}FindResponseMessageBaseType_v2.1">
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstResult" use="required" type="{http://www.valencia.es/schema/SerTICEntidadBase}FirstResultType_v1.1" />
 *       &lt;attribute name="numResults" use="required" type="{http://www.valencia.es/schema/SerTICEntidadBase}NumResultsType_v1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindResponseMessageBaseType_v1.0")
@XmlSeeAlso({
    FindListasDestinoResponseTypeV11 .class,
    FindComunicacionesResponseTypeV11 .class
})
public class FindResponseMessageBaseTypeV10 {

    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "firstResult", required = true)
    protected int firstResult;
    @XmlAttribute(name = "numResults", required = true)
    protected int numResults;

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
     * Obtiene el valor de la propiedad firstResult.
     * 
     */
    public int getFirstResult() {
        return firstResult;
    }

    /**
     * Define el valor de la propiedad firstResult.
     * 
     */
    public void setFirstResult(int value) {
        this.firstResult = value;
    }

    /**
     * Obtiene el valor de la propiedad numResults.
     * 
     */
    public int getNumResults() {
        return numResults;
    }

    /**
     * Define el valor de la propiedad numResults.
     * 
     */
    public void setNumResults(int value) {
        this.numResults = value;
    }

}
