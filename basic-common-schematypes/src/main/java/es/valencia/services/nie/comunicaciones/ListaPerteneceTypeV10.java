
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaPerteneceType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaPerteneceType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreListaCas" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *         &lt;element name="NombreListaVal" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaPerteneceType_v1.0", propOrder = {
    "unidadPropietaria",
    "nombreListaCas",
    "nombreListaVal"
})
public class ListaPerteneceTypeV10 {

    @XmlElement(name = "UnidadPropietaria")
    protected String unidadPropietaria;
    @XmlElement(name = "NombreListaCas", required = true)
    protected String nombreListaCas;
    @XmlElement(name = "NombreListaVal")
    protected String nombreListaVal;

    /**
     * Obtiene el valor de la propiedad unidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadPropietaria() {
        return unidadPropietaria;
    }

    /**
     * Define el valor de la propiedad unidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadPropietaria(String value) {
        this.unidadPropietaria = value;
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

}
