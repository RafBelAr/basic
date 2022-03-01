
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustitutoType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SustitutoType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Usuario" type="{http://www.valencia.es/schema/nie/Common}CodUsuarioType_v1.0"/>
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
@XmlType(name = "SustitutoType_v1.0", propOrder = {
    "usuario",
    "nombreCargoCas",
    "nombreCargoVal"
})
public class SustitutoTypeV10 {

    @XmlElement(name = "Usuario", required = true)
    protected String usuario;
    @XmlElement(name = "NombreCargoCas", required = true)
    protected String nombreCargoCas;
    @XmlElement(name = "NombreCargoVal", required = true)
    protected String nombreCargoVal;

    /**
     * Gets the value of the usuario property.
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
     * Sets the value of the usuario property.
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
     * Gets the value of the nombreCargoCas property.
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
     * Sets the value of the nombreCargoCas property.
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
     * Gets the value of the nombreCargoVal property.
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
     * Sets the value of the nombreCargoVal property.
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
