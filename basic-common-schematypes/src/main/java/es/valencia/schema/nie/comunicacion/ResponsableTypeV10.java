
package es.valencia.schema.nie.comunicacion;

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
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Comunicacion}UsuarioType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CargoCas" type="{http://www.valencia.es/schema/nie/Common}CargoType_v1.0" minOccurs="0"/>
 *         &lt;element name="CargoVa" type="{http://www.valencia.es/schema/nie/Common}CargoType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsableType_v1.0", propOrder = {
    "cargoCas",
    "cargoVa"
})
public class ResponsableTypeV10
    extends UsuarioTypeV10
{

    @XmlElement(name = "CargoCas")
    protected String cargoCas;
    @XmlElement(name = "CargoVa")
    protected String cargoVa;

    /**
     * Obtiene el valor de la propiedad cargoCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoCas() {
        return cargoCas;
    }

    /**
     * Define el valor de la propiedad cargoCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoCas(String value) {
        this.cargoCas = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoVa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoVa() {
        return cargoVa;
    }

    /**
     * Define el valor de la propiedad cargoVa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoVa(String value) {
        this.cargoVa = value;
    }

}
