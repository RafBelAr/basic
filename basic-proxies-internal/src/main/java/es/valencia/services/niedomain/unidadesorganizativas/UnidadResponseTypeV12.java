
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.niedomain.unidadorganizativa.UnidadOrganizativaTypeV12;
import es.valencia.services.nie.unidadesorganizativas.ResponseMessageBaseTypeV10;


/**
 * <p>Java class for UnidadResponseType_v1.2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UnidadOrganizativa" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}UnidadOrganizativaType_v1.2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadResponseType_v1.2", propOrder = {
    "unidadOrganizativa"
})
public class UnidadResponseTypeV12
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "UnidadOrganizativa", required = true)
    protected UnidadOrganizativaTypeV12 unidadOrganizativa;

    /**
     * Gets the value of the unidadOrganizativa property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaTypeV12 }
     *     
     */
    public UnidadOrganizativaTypeV12 getUnidadOrganizativa() {
        return unidadOrganizativa;
    }

    /**
     * Sets the value of the unidadOrganizativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaTypeV12 }
     *     
     */
    public void setUnidadOrganizativa(UnidadOrganizativaTypeV12 value) {
        this.unidadOrganizativa = value;
    }

}
