
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				What: Copiado del esquema codigo expediente PIAE
 * 				/piae/xsd/expediente/CodigoExpediente.xsd
 * 				Who:
 * 			
 * 
 * <p>Clase Java para CodigoExpedienteType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CodigoExpedienteType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clasificacionExpediente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="O"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoUnidadAdministrativa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="anyoCreacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroExpediente">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroCopia">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoExpedienteType_v1.0", propOrder = {
    "clasificacionExpediente",
    "codigoUnidadAdministrativa",
    "anyoCreacion",
    "numeroExpediente",
    "numeroCopia"
})
public class CodigoExpedienteTypeV10 {

    @XmlElement(required = true)
    protected String clasificacionExpediente;
    @XmlElement(required = true)
    protected String codigoUnidadAdministrativa;
    @XmlElement(required = true)
    protected String anyoCreacion;
    @XmlElement(required = true)
    protected String numeroExpediente;
    @XmlElement(required = true)
    protected String numeroCopia;

    /**
     * Obtiene el valor de la propiedad clasificacionExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasificacionExpediente() {
        return clasificacionExpediente;
    }

    /**
     * Define el valor de la propiedad clasificacionExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasificacionExpediente(String value) {
        this.clasificacionExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUnidadAdministrativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidadAdministrativa() {
        return codigoUnidadAdministrativa;
    }

    /**
     * Define el valor de la propiedad codigoUnidadAdministrativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidadAdministrativa(String value) {
        this.codigoUnidadAdministrativa = value;
    }

    /**
     * Obtiene el valor de la propiedad anyoCreacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyoCreacion() {
        return anyoCreacion;
    }

    /**
     * Define el valor de la propiedad anyoCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyoCreacion(String value) {
        this.anyoCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroExpediente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Define el valor de la propiedad numeroExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroExpediente(String value) {
        this.numeroExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCopia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCopia() {
        return numeroCopia;
    }

    /**
     * Define el valor de la propiedad numeroCopia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCopia(String value) {
        this.numeroCopia = value;
    }

}
