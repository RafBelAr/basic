
package es.valencia.services.niedomain.unidadesorganizativas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SustitutosType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SustitutosType_v2.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sustituto" type="{http://www.valencia.es/services/nieDomain/UnidadesOrganizativas}SustitutoType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
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
    protected List<SustitutoTypeV10> sustituto;

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
     * {@link SustitutoTypeV10 }
     * 
     * 
     */
    public List<SustitutoTypeV10> getSustituto() {
        if (sustituto == null) {
            sustituto = new ArrayList<SustitutoTypeV10>();
        }
        return this.sustituto;
    }

}
