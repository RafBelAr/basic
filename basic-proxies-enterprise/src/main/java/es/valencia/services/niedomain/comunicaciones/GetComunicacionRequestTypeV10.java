
package es.valencia.services.niedomain.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetComunicacionRequestType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetComunicacionRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}GetComunicacionRequestType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="GetDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetComunicacionRequestType_v1.0", propOrder = {
    "getDocumento"
})
public class GetComunicacionRequestTypeV10
    extends es.valencia.services.nie.comunicaciones.GetComunicacionRequestTypeV10
{

    @XmlElement(name = "GetDocumento")
    protected boolean getDocumento;

    /**
     * Gets the value of the getDocumento property.
     * 
     */
    public boolean isGetDocumento() {
        return getDocumento;
    }

    /**
     * Sets the value of the getDocumento property.
     * 
     */
    public void setGetDocumento(boolean value) {
        this.getDocumento = value;
    }

}
