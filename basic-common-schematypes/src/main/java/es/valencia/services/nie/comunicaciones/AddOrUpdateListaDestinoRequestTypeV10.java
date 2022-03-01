
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddOrUpdateListaDestinoRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateListaDestinoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UidUnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreListaCas" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *         &lt;element name="NombreListaVal" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *         &lt;element name="Descripcion" type="{http://www.valencia.es/schema/nie/Common}AsuntoType_v1.0" minOccurs="0"/>
 *         &lt;element name="UidsUnidades" type="{http://www.valencia.es/services/nie/Comunicaciones}UidsUnidadesType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateListaDestinoRequestType_v1.0", propOrder = {
    "uidUnidadPropietaria",
    "nombreListaCas",
    "nombreListaVal",
    "descripcion",
    "uidsUnidades"
})
public class AddOrUpdateListaDestinoRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "UidUnidadPropietaria")
    protected String uidUnidadPropietaria;
    @XmlElement(name = "NombreListaCas", required = true)
    protected String nombreListaCas;
    @XmlElement(name = "NombreListaVal", required = true)
    protected String nombreListaVal;
    @XmlElementRef(name = "Descripcion", namespace = "http://www.valencia.es/services/nie/Comunicaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElement(name = "UidsUnidades")
    protected UidsUnidadesTypeV10 uidsUnidades;

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

    /**
     * Obtiene el valor de la propiedad nombreListaVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreListaVal() {
        return nombreListaVal;
    }

    /**
     * Define el valor de la propiedad nombreListaVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreListaVal(String value) {
        this.nombreListaVal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad uidsUnidades.
     * 
     * @return
     *     possible object is
     *     {@link UidsUnidadesTypeV10 }
     *     
     */
    public UidsUnidadesTypeV10 getUidsUnidades() {
        return uidsUnidades;
    }

    /**
     * Define el valor de la propiedad uidsUnidades.
     * 
     * @param value
     *     allowed object is
     *     {@link UidsUnidadesTypeV10 }
     *     
     */
    public void setUidsUnidades(UidsUnidadesTypeV10 value) {
        this.uidsUnidades = value;
    }

}
