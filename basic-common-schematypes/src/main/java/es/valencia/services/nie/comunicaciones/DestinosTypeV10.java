
package es.valencia.services.nie.comunicaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DestinosType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DestinosType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UidUnidadDestino" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinosType_v1.0", propOrder = {
    "uidUnidadDestino"
})
public class DestinosTypeV10 {

    @XmlElement(name = "UidUnidadDestino", required = true)
    protected List<String> uidUnidadDestino;

    /**
     * Gets the value of the uidUnidadDestino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uidUnidadDestino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUidUnidadDestino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUidUnidadDestino() {
        if (uidUnidadDestino == null) {
            uidUnidadDestino = new ArrayList<String>();
        }
        return this.uidUnidadDestino;
    }

}
