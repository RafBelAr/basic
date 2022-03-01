
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponsableType_v2.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponsableType_v2.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Usuario" type="{http://www.valencia.es/schema/nie/Common}UsuarioType_v1.1"/>
 *         &lt;element name="NombreCargoCas" type="{http://www.valencia.es/schema/nie/Common}CargoType_v1.0"/>
 *         &lt;element name="NombreCargoVal" type="{http://www.valencia.es/schema/nie/Common}CargoType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsableType_v2.0", propOrder = {
    "usuario",
    "nombreCargoCas",
    "nombreCargoVal"
})
public class ResponsableTypeV20 {

    @XmlElement(name = "Usuario", required = true)
    protected UsuarioTypeV11 usuario;
    @XmlElement(name = "NombreCargoCas", required = true)
    protected String nombreCargoCas;
    @XmlElement(name = "NombreCargoVal", required = true)
    protected String nombreCargoVal;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioTypeV11 }
     *     
     */
    public UsuarioTypeV11 getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioTypeV11 }
     *     
     */
    public void setUsuario(UsuarioTypeV11 value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCargoCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCargoCas() {
        return nombreCargoCas;
    }

    /**
     * Define el valor de la propiedad nombreCargoCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCargoCas(String value) {
        this.nombreCargoCas = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCargoVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCargoVal() {
        return nombreCargoVal;
    }

    /**
     * Define el valor de la propiedad nombreCargoVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCargoVal(String value) {
        this.nombreCargoVal = value;
    }

}
