
package es.valencia.services.nie.comunicaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.listadestinos.ListaDestinosBaseTypeV11;


/**
 * <p>Clase Java para ListaListasDestinosType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaListasDestinosType_v1.1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaDestinos" type="{http://www.valencia.es/schema/nie/ListaDestinos}ListaDestinosBaseType_v1.1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaListasDestinosType_v1.1", propOrder = {
    "listaDestinos"
})
public class ListaListasDestinosTypeV11 {

    @XmlElement(name = "ListaDestinos")
    protected List<ListaDestinosBaseTypeV11> listaDestinos;

    /**
     * Gets the value of the listaDestinos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDestinos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDestinos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaDestinosBaseTypeV11 }
     * 
     * 
     */
    public List<ListaDestinosBaseTypeV11> getListaDestinos() {
        if (listaDestinos == null) {
            listaDestinos = new ArrayList<ListaDestinosBaseTypeV11>();
        }
        return this.listaDestinos;
    }

}
