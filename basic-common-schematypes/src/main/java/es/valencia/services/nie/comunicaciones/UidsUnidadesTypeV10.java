
package es.valencia.services.nie.comunicaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UidsUnidadesType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UidsUnidadesType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UidUnidad" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UidsUnidadesType_v1.0", propOrder = {
    "uidUnidad"
})
public class UidsUnidadesTypeV10 {

    @XmlElement(name = "UidUnidad")
    protected List<String> uidUnidad;

    /**
     * Gets the value of the uidUnidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uidUnidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUidUnidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUidUnidad() {
        if (uidUnidad == null) {
            uidUnidad = new ArrayList<String>();
        }
        return this.uidUnidad;
    }

}
