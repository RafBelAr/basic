
package es.valencia.services.esb.comunicacioneselectronicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.CodigoExpedienteTypeV10;
import es.valencia.services.nie.comunicaciones.ResponseMessageBaseTypeV10;


/**
 * <p>Java class for AportarAExpedienteResponseType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AportarAExpedienteResponseType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="NumeroRegistro" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *         &lt;element name="NumeroExpediente" type="{http://www.valencia.es/schema/nie/Common}CodigoExpedienteType_v1.0"/>
 *         &lt;element name="NombreDocumento" type="{http://www.valencia.es/schema/nie/Common}NombreAdjuntoType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AportarAExpedienteResponseType_v2.0", propOrder = {
    "numeroRegistro",
    "numeroExpediente",
    "nombreDocumento"
})
public class AportarAExpedienteResponseTypeV20
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "NumeroRegistro", required = true)
    protected String numeroRegistro;
    @XmlElement(name = "NumeroExpediente", required = true)
    protected CodigoExpedienteTypeV10 numeroExpediente;
    @XmlElement(name = "NombreDocumento")
    protected String nombreDocumento;

    /**
     * Gets the value of the numeroRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Sets the value of the numeroRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistro(String value) {
        this.numeroRegistro = value;
    }

    /**
     * Gets the value of the numeroExpediente property.
     * 
     * @return
     *     possible object is
     *     {@link CodigoExpedienteTypeV10 }
     *     
     */
    public CodigoExpedienteTypeV10 getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Sets the value of the numeroExpediente property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoExpedienteTypeV10 }
     *     
     */
    public void setNumeroExpediente(CodigoExpedienteTypeV10 value) {
        this.numeroExpediente = value;
    }

    /**
     * Gets the value of the nombreDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    /**
     * Sets the value of the nombreDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDocumento(String value) {
        this.nombreDocumento = value;
    }

}
