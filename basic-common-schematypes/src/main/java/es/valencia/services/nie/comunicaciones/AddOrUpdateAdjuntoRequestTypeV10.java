
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.comunicacion.AdjuntoTypeV10;


/**
 * <p>Clase Java para AddOrUpdateAdjuntoRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateAdjuntoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CodigoComunicacion" type="{http://www.valencia.es/schema/nie/Common}CodigoComunicacionType_v1.0"/>
 *         &lt;element name="Adjunto" type="{http://www.valencia.es/schema/nie/Comunicacion}AdjuntoType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateAdjuntoRequestType_v1.0", propOrder = {
    "codigoComunicacion",
    "adjunto"
})
public class AddOrUpdateAdjuntoRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "CodigoComunicacion", required = true)
    protected String codigoComunicacion;
    @XmlElement(name = "Adjunto", required = true)
    protected AdjuntoTypeV10 adjunto;

    /**
     * Obtiene el valor de la propiedad codigoComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComunicacion() {
        return codigoComunicacion;
    }

    /**
     * Define el valor de la propiedad codigoComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComunicacion(String value) {
        this.codigoComunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad adjunto.
     * 
     * @return
     *     possible object is
     *     {@link AdjuntoTypeV10 }
     *     
     */
    public AdjuntoTypeV10 getAdjunto() {
        return adjunto;
    }

    /**
     * Define el valor de la propiedad adjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjuntoTypeV10 }
     *     
     */
    public void setAdjunto(AdjuntoTypeV10 value) {
        this.adjunto = value;
    }

}
