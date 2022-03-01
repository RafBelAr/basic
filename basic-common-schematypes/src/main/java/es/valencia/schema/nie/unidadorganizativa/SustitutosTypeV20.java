
package es.valencia.schema.nie.unidadorganizativa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.ResponsableTypeV20;


/**
 * <p>Clase Java para SustitutosType_v2.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SustitutosType_v2.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sustituto" type="{http://www.valencia.es/schema/nie/Common}ResponsableType_v2.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SustitutosType_v2.0", propOrder = {
    "sustituto"
})
public class SustitutosTypeV20 {

    @XmlElement(name = "Sustituto")
    protected List<ResponsableTypeV20> sustituto;

    /**
     * Gets the value of the sustituto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sustituto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSustituto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsableTypeV20 }
     * 
     * 
     */
    public List<ResponsableTypeV20> getSustituto() {
        if (sustituto == null) {
            sustituto = new ArrayList<ResponsableTypeV20>();
        }
        return this.sustituto;
    }

}
