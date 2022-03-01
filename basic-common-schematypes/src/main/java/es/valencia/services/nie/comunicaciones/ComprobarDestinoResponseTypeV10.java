
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComprobarDestinoResponseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComprobarDestinoResponseType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="IsVigente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComprobarDestinoResponseType_v1.0", propOrder = {
    "isVigente"
})
public class ComprobarDestinoResponseTypeV10
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "IsVigente")
    protected boolean isVigente;

    /**
     * Obtiene el valor de la propiedad isVigente.
     * 
     */
    public boolean isIsVigente() {
        return isVigente;
    }

    /**
     * Define el valor de la propiedad isVigente.
     * 
     */
    public void setIsVigente(boolean value) {
        this.isVigente = value;
    }

}
