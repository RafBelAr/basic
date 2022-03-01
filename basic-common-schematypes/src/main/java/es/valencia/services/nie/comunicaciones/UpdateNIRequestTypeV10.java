
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.CodigoExpedienteTypeV10;


/**
 * <p>Clase Java para UpdateNIRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateNIRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RegNIRequestType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="NumeroExpediente" type="{http://www.valencia.es/schema/nie/Common}CodigoExpedienteType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateNIRequestType_v1.0", propOrder = {
    "numeroExpediente"
})
public class UpdateNIRequestTypeV10
    extends RegNIRequestTypeV10
{

    @XmlElement(name = "NumeroExpediente", required = true)
    protected CodigoExpedienteTypeV10 numeroExpediente;

    /**
     * Obtiene el valor de la propiedad numeroExpediente.
     * 
     * @return
     *     possible object is
     *     {@link CodigoExpedienteTypeV10 }
     *     
     */
    public CodigoExpedienteTypeV10 getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * Define el valor de la propiedad numeroExpediente.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoExpedienteTypeV10 }
     *     
     */
    public void setNumeroExpediente(CodigoExpedienteTypeV10 value) {
        this.numeroExpediente = value;
    }

}
