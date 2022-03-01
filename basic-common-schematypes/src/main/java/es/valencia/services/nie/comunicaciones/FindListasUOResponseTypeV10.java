
package es.valencia.services.nie.comunicaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindListasUOResponseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindListasUOResponseType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="ListasListasPertenece" type="{http://www.valencia.es/services/nie/Comunicaciones}ListaPerteneceType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindListasUOResponseType_v1.0", propOrder = {
    "listasListasPertenece"
})
public class FindListasUOResponseTypeV10
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "ListasListasPertenece")
    protected List<ListaPerteneceTypeV10> listasListasPertenece;

    /**
     * Gets the value of the listasListasPertenece property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listasListasPertenece property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListasListasPertenece().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaPerteneceTypeV10 }
     * 
     * 
     */
    public List<ListaPerteneceTypeV10> getListasListasPertenece() {
        if (listasListasPertenece == null) {
            listasListasPertenece = new ArrayList<ListaPerteneceTypeV10>();
        }
        return this.listasListasPertenece;
    }

}
