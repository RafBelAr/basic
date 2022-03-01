
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.serticfaultmessage.PreconditionFaultMessageTypeV30;


/**
 * <p>Clase Java para UidNoExistePreconditionFaultMessageType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UidNoExistePreconditionFaultMessageType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/SerTICFaultMessage}PreconditionFaultMessageType_v3.0">
 *       &lt;sequence>
 *         &lt;element name="Uid" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UidNoExistePreconditionFaultMessageType_v1.0", propOrder = {
    "uid"
})
public class UidNoExistePreconditionFaultMessageTypeV10
    extends PreconditionFaultMessageTypeV30
{

    @XmlElement(name = "Uid", required = true)
    protected String uid;

    /**
     * Obtiene el valor de la propiedad uid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Define el valor de la propiedad uid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

}
