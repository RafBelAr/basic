
package es.valencia.schema.nie.unidadorganizativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CapacidadUOReceptoraType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CapacidadUOReceptoraType_v1.0">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.valencia.es/schema/nie/UnidadOrganizativa>CapacidadUOType_v1.0">
 *       &lt;attribute name="redireccionBuzon" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapacidadUOReceptoraType_v1.0")
public class CapacidadUOReceptoraTypeV10
    extends CapacidadUOTypeV10
{

    @XmlAttribute(name = "redireccionBuzon")
    protected String redireccionBuzon;

    /**
     * Obtiene el valor de la propiedad redireccionBuzon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedireccionBuzon() {
        return redireccionBuzon;
    }

    /**
     * Define el valor de la propiedad redireccionBuzon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedireccionBuzon(String value) {
        this.redireccionBuzon = value;
    }

}
