
package es.valencia.schema.nie.comunicacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DestinosType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DestinosType_v1.1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destino" type="{http://www.valencia.es/schema/nie/Comunicacion}UnidadOrganizativaBaseType_v1.1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinosType_v1.1", propOrder = {
    "destino"
})
public class DestinosTypeV11 {

    @XmlElement(name = "Destino")
    protected List<UnidadOrganizativaBaseTypeV11> destino;

    /**
     * Gets the value of the destino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadOrganizativaBaseTypeV11 }
     * 
     * 
     */
    public List<UnidadOrganizativaBaseTypeV11> getDestino() {
        if (destino == null) {
            destino = new ArrayList<UnidadOrganizativaBaseTypeV11>();
        }
        return this.destino;
    }

}
