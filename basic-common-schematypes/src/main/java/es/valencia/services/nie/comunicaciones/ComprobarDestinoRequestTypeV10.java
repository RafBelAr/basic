
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComprobarDestinoRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComprobarDestinoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UidUnidad" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobarDestinoRequestType_v1.0", propOrder = {
    "uidUnidad"
})
public class ComprobarDestinoRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "UidUnidad", required = true)
    protected String uidUnidad;

    /**
     * Obtiene el valor de la propiedad uidUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidad() {
        return uidUnidad;
    }

    /**
     * Define el valor de la propiedad uidUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidad(String value) {
        this.uidUnidad = value;
    }

}
