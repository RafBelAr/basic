
package es.valencia.schema.niedomain.unidadorganizativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.UsuarioTypeV11;


/**
 * <p>Java class for UsuarioType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsuarioType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Common}UsuarioType_v1.1">
 *       &lt;attribute name="deshabilitado" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioType_v2.0")
public class UsuarioTypeV20
    extends UsuarioTypeV11
{

    @XmlAttribute(name = "deshabilitado")
    protected Boolean deshabilitado;

    /**
     * Gets the value of the deshabilitado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeshabilitado() {
        if (deshabilitado == null) {
            return false;
        } else {
            return deshabilitado;
        }
    }

    /**
     * Sets the value of the deshabilitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeshabilitado(Boolean value) {
        this.deshabilitado = value;
    }

}
