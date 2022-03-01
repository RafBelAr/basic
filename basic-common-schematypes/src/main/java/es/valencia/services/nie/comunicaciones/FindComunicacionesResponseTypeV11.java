
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.comunicacion.ComunicacionesBaseTypeV11;


/**
 * <p>Clase Java para FindComunicacionesResponseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindComunicacionesResponseType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}FindResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Comunicaciones" type="{http://www.valencia.es/schema/nie/Comunicacion}ComunicacionesBaseType_v1.1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindComunicacionesResponseType_v1.1", propOrder = {
    "comunicaciones"
})
public class FindComunicacionesResponseTypeV11
    extends FindResponseMessageBaseTypeV10
{

    @XmlElement(name = "Comunicaciones", required = true)
    protected ComunicacionesBaseTypeV11 comunicaciones;

    /**
     * Obtiene el valor de la propiedad comunicaciones.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionesBaseTypeV11 }
     *     
     */
    public ComunicacionesBaseTypeV11 getComunicaciones() {
        return comunicaciones;
    }

    /**
     * Define el valor de la propiedad comunicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionesBaseTypeV11 }
     *     
     */
    public void setComunicaciones(ComunicacionesBaseTypeV11 value) {
        this.comunicaciones = value;
    }

}
