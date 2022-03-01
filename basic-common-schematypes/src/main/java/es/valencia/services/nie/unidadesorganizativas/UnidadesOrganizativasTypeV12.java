
package es.valencia.services.nie.unidadesorganizativas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV12;


/**
 * <p>Clase Java para UnidadesOrganizativasType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadesOrganizativasType_v1.2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadOrganizativa" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}UnidadOrganizativaType_v1.2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadesOrganizativasType_v1.2", propOrder = {
    "unidadOrganizativa"
})
public class UnidadesOrganizativasTypeV12 {

    @XmlElement(name = "UnidadOrganizativa")
    protected List<UnidadOrganizativaTypeV12> unidadOrganizativa;

    /**
     * Gets the value of the unidadOrganizativa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadOrganizativa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadOrganizativa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadOrganizativaTypeV12 }
     * 
     * 
     */
    public List<UnidadOrganizativaTypeV12> getUnidadOrganizativa() {
        if (unidadOrganizativa == null) {
            unidadOrganizativa = new ArrayList<UnidadOrganizativaTypeV12>();
        }
        return this.unidadOrganizativa;
    }

}
