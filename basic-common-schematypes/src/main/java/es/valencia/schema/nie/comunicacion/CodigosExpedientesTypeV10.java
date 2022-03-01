
package es.valencia.schema.nie.comunicacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.CodigoExpedienteTypeV10;


/**
 * <p>Clase Java para CodigosExpedientesType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CodigosExpedientesType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoExpediente" type="{http://www.valencia.es/schema/nie/Common}CodigoExpedienteType_v1.0" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigosExpedientesType_v1.0", propOrder = {
    "codigoExpediente"
})
public class CodigosExpedientesTypeV10 {

    @XmlElement(name = "CodigoExpediente")
    protected List<CodigoExpedienteTypeV10> codigoExpediente;

    /**
     * Gets the value of the codigoExpediente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codigoExpediente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodigoExpediente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodigoExpedienteTypeV10 }
     * 
     * 
     */
    public List<CodigoExpedienteTypeV10> getCodigoExpediente() {
        if (codigoExpediente == null) {
            codigoExpediente = new ArrayList<CodigoExpedienteTypeV10>();
        }
        return this.codigoExpediente;
    }

}
