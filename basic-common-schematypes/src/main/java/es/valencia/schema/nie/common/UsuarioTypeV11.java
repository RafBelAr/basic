
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UsuarioType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UsuarioType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Common}UsuarioType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Email" type="{http://www.valencia.es/schema/tiposbase}EmailAddressType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioType_v1.1", propOrder = {
    "email"
})
public class UsuarioTypeV11
    extends UsuarioTypeV10
{

    @XmlElement(name = "Email")
    protected String email;

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
