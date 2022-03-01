
package es.valencia.schema.nie.comunicacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotasInterioresType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotasInterioresType_v1.2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotaInterior" type="{http://www.valencia.es/schema/nie/Comunicacion}NotaInteriorType_v1.2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotasInterioresType_v1.2", propOrder = {
    "notaInterior"
})
public class NotasInterioresTypeV12 {

    @XmlElement(name = "NotaInterior")
    protected List<NotaInteriorTypeV12> notaInterior;

    /**
     * Gets the value of the notaInterior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notaInterior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotaInterior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaInteriorTypeV12 }
     * 
     * 
     */
    public List<NotaInteriorTypeV12> getNotaInterior() {
        if (notaInterior == null) {
            notaInterior = new ArrayList<NotaInteriorTypeV12>();
        }
        return this.notaInterior;
    }

}
