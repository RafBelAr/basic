
package es.valencia.schema.niedomain.comunicacion;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjuntoType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjuntoType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Comunicacion}AdjuntoType_v1.0">
 *       &lt;sequence>
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
@XmlType(name = "AdjuntoType_v1.0", propOrder = {
    "documento"
})
public class AdjuntoTypeV10
    extends es.valencia.schema.nie.comunicacion.AdjuntoTypeV10
{

    @XmlElement(name = "Documento", required = true)
    @XmlMimeType("application/octectstream")
    protected DataHandler documento;

    /**
     * Gets the value of the documento property.
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
     * Sets the value of the documento property.
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
