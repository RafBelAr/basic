
package es.valencia.services.niedomain.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.niedomain.comunicacion.ComunicacionTypeV12;
import es.valencia.services.nie.comunicaciones.ResponseMessageBaseTypeV10;


/**
 * <p>Java class for ComunicacionResponseType_v1.2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComunicacionResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Comunicacion" type="{http://www.valencia.es/schema/nieDomain/Comunicacion}ComunicacionType_v1.2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComunicacionResponseType_v1.2", propOrder = {
    "comunicacion"
})
public class ComunicacionResponseTypeV12
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "Comunicacion", required = true)
    protected ComunicacionTypeV12 comunicacion;

    /**
     * Gets the value of the comunicacion property.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionTypeV12 }
     *     
     */
    public ComunicacionTypeV12 getComunicacion() {
        return comunicacion;
    }

    /**
     * Sets the value of the comunicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionTypeV12 }
     *     
     */
    public void setComunicacion(ComunicacionTypeV12 value) {
        this.comunicacion = value;
    }

}
