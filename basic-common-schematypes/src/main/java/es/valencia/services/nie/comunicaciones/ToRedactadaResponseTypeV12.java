
package es.valencia.services.nie.comunicaciones;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.comunicacion.ComunicacionTypeV12;


/**
 * <p>Clase Java para ToRedactadaResponseType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ToRedactadaResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Comunicacion" type="{http://www.valencia.es/schema/nie/Comunicacion}ComunicacionType_v1.2"/>
 *         &lt;element name="Documento" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToRedactadaResponseType_v1.2", propOrder = {
    "comunicacion",
    "documento"
})
public class ToRedactadaResponseTypeV12
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "Comunicacion", required = true)
    protected ComunicacionTypeV12 comunicacion;
    @XmlElement(name = "Documento", required = true)
    @XmlMimeType("application/pdf")
    protected DataHandler documento;

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

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setDocumento(DataHandler value) {
        this.documento = value;
    }

}
