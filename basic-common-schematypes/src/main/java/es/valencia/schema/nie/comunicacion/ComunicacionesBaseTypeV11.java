
package es.valencia.schema.nie.comunicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComunicacionesBaseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComunicacionesBaseType_v1.1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comunicacion" type="{http://www.valencia.es/schema/nie/Comunicacion}ComunicacionBaseType_v1.1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComunicacionesBaseType_v1.1", propOrder = {
    "comunicacion"
})
public class ComunicacionesBaseTypeV11 {

    @XmlElement(name = "Comunicacion", required = true)
    protected ComunicacionBaseTypeV11 comunicacion;

    /**
     * Obtiene el valor de la propiedad comunicacion.
     * 
     * @return
     *     possible object is
     *     {@link ComunicacionBaseTypeV11 }
     *     
     */
    public ComunicacionBaseTypeV11 getComunicacion() {
        return comunicacion;
    }

    /**
     * Define el valor de la propiedad comunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicacionBaseTypeV11 }
     *     
     */
    public void setComunicacion(ComunicacionBaseTypeV11 value) {
        this.comunicacion = value;
    }

}
