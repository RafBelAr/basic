
package es.valencia.schema.niedomain.unidadorganizativa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GestoresType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GestoresType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gestor" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}UsuarioType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestoresType_v1.0", propOrder = {
    "gestor"
})
public class GestoresTypeV10 {

    @XmlElement(name = "Gestor")
    protected List<UsuarioTypeV10> gestor;

    /**
     * Gets the value of the gestor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gestor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGestor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioTypeV10 }
     * 
     * 
     */
    public List<UsuarioTypeV10> getGestor() {
        if (gestor == null) {
            gestor = new ArrayList<UsuarioTypeV10>();
        }
        return this.gestor;
    }

}
