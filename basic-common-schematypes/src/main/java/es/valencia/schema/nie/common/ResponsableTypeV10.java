
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponsableType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponsableType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="Nif" type="{http://www.valencia.es/schema/tiposbase}NIFPersonaFisicaType_v1.0"/>
 *           &lt;element name="Apellido1" type="{http://www.valencia.es/schema/nie/Common}ApellidoType_v1.0"/>
 *           &lt;element name="Apellido2" type="{http://www.valencia.es/schema/nie/Common}ApellidoType_v1.0" minOccurs="0"/>
 *           &lt;element name="Nombre" type="{http://www.valencia.es/schema/nie/Common}NombreType_v1.0"/>
 *           &lt;element name="Usuario" type="{http://www.valencia.es/schema/nie/Common}CodUsuarioType_v1.0"/>
 *         &lt;/sequence>
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
@XmlType(name = "ResponsableType_v1.0", propOrder = {
    "nif",
    "apellido1",
    "apellido2",
    "nombre",
    "usuario",
    "nombreCargoCas",
    "nombreCargoVal"
})
public class ResponsableTypeV10 {

    @XmlElement(name = "Nif")
    protected String nif;
    @XmlElement(name = "Apellido1")
    protected String apellido1;
    @XmlElement(name = "Apellido2")
    protected String apellido2;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Usuario")
    protected String usuario;
    @XmlElement(name = "NombreCargoCas", required = true)
    protected String nombreCargoCas;
    @XmlElement(name = "NombreCargoVal", required = true)
    protected String nombreCargoVal;

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNif() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNif(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
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
