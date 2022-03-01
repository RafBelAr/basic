
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.EstadoComunicacionTypeV10;
import es.valencia.schema.serticfaultmessage.PreconditionFaultMessageTypeV30;


/**
 * <p>Clase Java para EstadoIncorrectoComunicacionPostconditionFaultMessageType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstadoIncorrectoComunicacionPostconditionFaultMessageType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/SerTICFaultMessage}PreconditionFaultMessageType_v3.0">
 *       &lt;sequence>
 *         &lt;element name="Estado" type="{http://www.valencia.es/schema/nie/Common}EstadoComunicacionType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoIncorrectoComunicacionPostconditionFaultMessageType_v1.0", propOrder = {
    "estado"
})
public class EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10
    extends PreconditionFaultMessageTypeV30
{

    @XmlElement(name = "Estado", required = true)
    protected EstadoComunicacionTypeV10 estado;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoComunicacionTypeV10 }
     *     
     */
    public EstadoComunicacionTypeV10 getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoComunicacionTypeV10 }
     *     
     */
    public void setEstado(EstadoComunicacionTypeV10 value) {
        this.estado = value;
    }

}
