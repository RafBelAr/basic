
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindListasDestinoRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindListasDestinoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}FindRequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="UidUnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *           &lt;element name="UidVisibleUnidad" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindListasDestinoRequestType_v1.0", propOrder = {
    "uidUnidadPropietaria",
    "uidVisibleUnidad"
})
public class FindListasDestinoRequestTypeV10
    extends FindRequestMessageBaseTypeV10
{

    @XmlElementRef(name = "UidUnidadPropietaria", namespace = "http://www.valencia.es/services/nie/Comunicaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidUnidadPropietaria;
    @XmlElement(name = "UidVisibleUnidad")
    protected String uidVisibleUnidad;

    /**
     * Obtiene el valor de la propiedad uidUnidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUidUnidadPropietaria() {
        return uidUnidadPropietaria;
    }

    /**
     * Define el valor de la propiedad uidUnidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUidUnidadPropietaria(JAXBElement<String> value) {
        this.uidUnidadPropietaria = value;
    }

    /**
     * Obtiene el valor de la propiedad uidVisibleUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidVisibleUnidad() {
        return uidVisibleUnidad;
    }

    /**
     * Define el valor de la propiedad uidVisibleUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidVisibleUnidad(String value) {
        this.uidVisibleUnidad = value;
    }

}
