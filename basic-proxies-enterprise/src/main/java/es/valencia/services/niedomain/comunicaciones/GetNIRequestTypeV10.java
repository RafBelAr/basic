
package es.valencia.services.niedomain.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetNIRequestType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetNIRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}GetNIRequestType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="getBinariosAdjuntos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="getDocumento" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNIRequestType_v1.0", propOrder = {
    "getBinariosAdjuntos",
    "getDocumento"
})
public class GetNIRequestTypeV10
    extends es.valencia.services.nie.comunicaciones.GetNIRequestTypeV10
{

    protected boolean getBinariosAdjuntos;
    protected boolean getDocumento;

    /**
     * Gets the value of the getBinariosAdjuntos property.
     * 
     */
    public boolean isGetBinariosAdjuntos() {
        return getBinariosAdjuntos;
    }

    /**
     * Sets the value of the getBinariosAdjuntos property.
     * 
     */
    public void setGetBinariosAdjuntos(boolean value) {
        this.getBinariosAdjuntos = value;
    }

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
