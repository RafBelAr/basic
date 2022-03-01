
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.comunicacion.NotaInteriorTypeV12;


/**
 * <p>Clase Java para NIResponseType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NIResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="NotaInterior" type="{http://www.valencia.es/schema/nie/Comunicacion}NotaInteriorType_v1.2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NIResponseType_v1.2", propOrder = {
    "notaInterior"
})
public class NIResponseTypeV12
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "NotaInterior", required = true)
    protected NotaInteriorTypeV12 notaInterior;

    /**
     * Obtiene el valor de la propiedad notaInterior.
     * 
     * @return
     *     possible object is
     *     {@link NotaInteriorTypeV12 }
     *     
     */
    public NotaInteriorTypeV12 getNotaInterior() {
        return notaInterior;
    }

    /**
     * Define el valor de la propiedad notaInterior.
     * 
     * @param value
     *     allowed object is
     *     {@link NotaInteriorTypeV12 }
     *     
     */
    public void setNotaInterior(NotaInteriorTypeV12 value) {
        this.notaInterior = value;
    }

}
