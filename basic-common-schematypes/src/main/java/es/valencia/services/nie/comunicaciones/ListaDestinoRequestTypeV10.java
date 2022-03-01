
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaDestinoRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaDestinoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UidUnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreListaCas" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDestinoRequestType_v1.0", propOrder = {
    "uidUnidadPropietaria",
    "nombreListaCas"
})
public class ListaDestinoRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "UidUnidadPropietaria")
    protected String uidUnidadPropietaria;
    @XmlElement(name = "NombreListaCas", required = true)
    protected String nombreListaCas;

    /**
     * Obtiene el valor de la propiedad uidUnidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidadPropietaria() {
        return uidUnidadPropietaria;
    }

    /**
     * Define el valor de la propiedad uidUnidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidadPropietaria(String value) {
        this.uidUnidadPropietaria = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreListaCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreListaCas() {
        return nombreListaCas;
    }

    /**
     * Define el valor de la propiedad nombreListaCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreListaCas(String value) {
        this.nombreListaCas = value;
    }

}
