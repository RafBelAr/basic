
package es.valencia.services.niedomain.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10;


/**
 * <p>Java class for CancelarComunicacionRequestType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelarComunicacionRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}CodigoComunicacionRequestType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Motivo" type="{http://www.valencia.es/schema/nie/Common}MotivoType_v1.0" minOccurs="0"/>
 *         &lt;element name="NIFCancelador" type="{http://www.valencia.es/schema/tiposbase}NIFPersonaFisicaType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelarComunicacionRequestType_v1.0", propOrder = {
    "motivo",
    "nifCancelador"
})
public class CancelarComunicacionRequestTypeV10
    extends CodigoComunicacionRequestTypeV10
{

    @XmlElement(name = "Motivo")
    protected String motivo;
    @XmlElement(name = "NIFCancelador", required = true)
    protected String nifCancelador;

    /**
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the nifCancelador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFCancelador() {
        return nifCancelador;
    }

    /**
     * Sets the value of the nifCancelador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFCancelador(String value) {
        this.nifCancelador = value;
    }

}
