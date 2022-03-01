
package es.valencia.services.niedomain.comunicaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.comunicacion.NotaInteriorTypeV12;
import es.valencia.services.nie.comunicaciones.RequestMessageBaseTypeV10;


/**
 * <p>Java class for RecepcionadaRequestType_v1.2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecepcionadaRequestType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="NotasInteriores" type="{http://www.valencia.es/schema/nie/Comunicacion}NotaInteriorType_v1.2" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecepcionadaRequestType_v1.2", propOrder = {
    "notasInteriores"
})
public class RecepcionadaRequestTypeV12
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "NotasInteriores", required = true)
    protected List<NotaInteriorTypeV12> notasInteriores;

    /**
     * Gets the value of the notasInteriores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notasInteriores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotasInteriores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaInteriorTypeV12 }
     * 
     * 
     */
    public List<NotaInteriorTypeV12> getNotasInteriores() {
        if (notasInteriores == null) {
            notasInteriores = new ArrayList<NotaInteriorTypeV12>();
        }
        return this.notasInteriores;
    }

}
