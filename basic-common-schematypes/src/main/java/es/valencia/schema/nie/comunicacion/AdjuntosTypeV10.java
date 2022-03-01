
package es.valencia.schema.nie.comunicacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjuntosType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjuntosType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adjunto" type="{http://www.valencia.es/schema/nie/Comunicacion}AdjuntoType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjuntosType_v1.0", propOrder = {
    "adjunto"
})
public class AdjuntosTypeV10 {

    @XmlElement(name = "Adjunto")
    protected List<AdjuntoTypeV10> adjunto;

    /**
     * Gets the value of the adjunto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjunto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjunto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjuntoTypeV10 }
     * 
     * 
     */
    public List<AdjuntoTypeV10> getAdjunto() {
        if (adjunto == null) {
            adjunto = new ArrayList<AdjuntoTypeV10>();
        }
        return this.adjunto;
    }

}
