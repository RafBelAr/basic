
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.comunicacion.ComunicacionTypeV12;


/**
 * <p>Clase Java para ComunicacionResponseType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComunicacionResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Comunicacion" type="{http://www.valencia.es/schema/nie/Comunicacion}ComunicacionType_v1.2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComunicacionResponseType_v1.2", propOrder = {
    "comunicacion"
})
@XmlSeeAlso({
    RemoveAdjuntoResponseTypeV12 .class
})
public class ComunicacionResponseTypeV12
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "Comunicacion", required = true)
    protected ComunicacionTypeV12 comunicacion;

    /**
     * Obtiene el valor de la propiedad comunicacion.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionTypeV12 }
     *     
     */
    public ComunicacionTypeV12 getComunicacion() {
        return comunicacion;
    }

    /**
     * Define el valor de la propiedad comunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionTypeV12 }
     *     
     */
    public void setComunicacion(ComunicacionTypeV12 value) {
        this.comunicacion = value;
    }

}
