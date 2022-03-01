
package es.valencia.schema.nie.comunicacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HitosType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HitosType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hito" type="{http://www.valencia.es/schema/nie/Comunicacion}HitoType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HitosType_v1.0", propOrder = {
    "hito"
})
public class HitosTypeV10 {

    @XmlElement(name = "Hito")
    protected List<HitoTypeV10> hito;

    /**
     * Gets the value of the hito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HitoTypeV10 }
     * 
     * 
     */
    public List<HitoTypeV10> getHito() {
        if (hito == null) {
            hito = new ArrayList<HitoTypeV10>();
        }
        return this.hito;
    }

}
