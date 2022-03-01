
package es.valencia.schema.nie.unidadorganizativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para CapacidadUOType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CapacidadUOType_v1.0">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>boolean">
 *       &lt;attribute name="ambitoRestringido" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapacidadUOType_v1.0", propOrder = {
    "value"
})
@XmlSeeAlso({
    CapacidadUOReceptoraTypeV10 .class
})
public class CapacidadUOTypeV10 {

    @XmlValue
    protected boolean value;
    @XmlAttribute(name = "ambitoRestringido")
    protected Boolean ambitoRestringido;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad ambitoRestringido.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAmbitoRestringido() {
        if (ambitoRestringido == null) {
            return false;
        } else {
            return ambitoRestringido;
        }
    }

    /**
     * Define el valor de la propiedad ambitoRestringido.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAmbitoRestringido(Boolean value) {
        this.ambitoRestringido = value;
    }

}
