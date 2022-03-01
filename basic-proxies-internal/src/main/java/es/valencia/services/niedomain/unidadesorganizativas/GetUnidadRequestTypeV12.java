
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.services.nie.unidadesorganizativas.UidRequestTypeV10;


/**
 * <p>Java class for GetUnidadRequestType_v1.2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetUnidadRequestType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}UidRequestType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="GetCandidatosAGestor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUnidadRequestType_v1.2", propOrder = {
    "getCandidatosAGestor"
})
public class GetUnidadRequestTypeV12
    extends UidRequestTypeV10
{

    @XmlElement(name = "GetCandidatosAGestor")
    protected Boolean getCandidatosAGestor;

    /**
     * Gets the value of the getCandidatosAGestor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetCandidatosAGestor() {
        return getCandidatosAGestor;
    }

    /**
     * Sets the value of the getCandidatosAGestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetCandidatosAGestor(Boolean value) {
        this.getCandidatosAGestor = value;
    }

}
