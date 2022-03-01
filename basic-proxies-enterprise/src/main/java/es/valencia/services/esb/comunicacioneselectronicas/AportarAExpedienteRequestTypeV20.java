
package es.valencia.services.esb.comunicacioneselectronicas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.CodigoExpedienteTypeV10;
import es.valencia.services.nie.comunicaciones.RequestMessageBaseTypeV10;


/**
 * <p>Java class for AportarAExpedienteRequestType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AportarAExpedienteRequestType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="NumeroRegistro" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *         &lt;element name="IdNombreDocumento" type="{http://www.valencia.es/schema/nie/Common}NombreAdjuntoType_v1.0" minOccurs="0"/>
 *         &lt;element name="NumeroExpediente" type="{http://www.valencia.es/schema/nie/Common}CodigoExpedienteType_v1.0"/>
 *         &lt;element name="NombreDocumento" type="{http://www.valencia.es/schema/nie/Common}NombreAdjuntoType_v1.0" minOccurs="0"/>
 *         &lt;element name="DescripcionDocumento" type="{http://www.valencia.es/schema/nie/Common}NombreAdjuntoType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AportarAExpedienteRequestType_v2.0", propOrder = {
    "numeroRegistro",
    "idNombreDocumento",
    "numeroExpediente",
    "nombreDocumento",
    "descripcionDocumento"
})
public class AportarAExpedienteRequestTypeV20
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "NumeroRegistro", required = true)
    protected String numeroRegistro;
    @XmlElement(name = "IdNombreDocumento")
    protected String idNombreDocumento;
    @XmlElement(name = "NumeroExpediente", required = true)
    protected CodigoExpedienteTypeV10 numeroExpediente;
    @XmlElement(name = "NombreDocumento")
    protected String nombreDocumento;
    @XmlElement(name = "DescripcionDocumento")
    protected String descripcionDocumento;

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
     * Gets the value of the idNombreDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNombreDocumento() {
        return idNombreDocumento;
    }

    /**
     * Sets the value of the idNombreDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNombreDocumento(String value) {
        this.idNombreDocumento = value;
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

    /**
     * Gets the value of the descripcionDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionDocumento() {
        return descripcionDocumento;
    }

    /**
     * Sets the value of the descripcionDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionDocumento(String value) {
        this.descripcionDocumento = value;
    }

}
