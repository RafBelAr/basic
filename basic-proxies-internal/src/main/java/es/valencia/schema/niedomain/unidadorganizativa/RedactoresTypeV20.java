
package es.valencia.schema.niedomain.unidadorganizativa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedactoresType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedactoresType_v2.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Redactor" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}UsuarioType_v2.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedactoresType_v2.0", propOrder = {
    "redactor"
})
public class RedactoresTypeV20 {

    @XmlElement(name = "Redactor")
    protected List<UsuarioTypeV20> redactor;

    /**
     * Gets the value of the redactor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redactor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedactor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioTypeV20 }
     * 
     * 
     */
    public List<UsuarioTypeV20> getRedactor() {
        if (redactor == null) {
            redactor = new ArrayList<UsuarioTypeV20>();
        }
        return this.redactor;
    }

}
