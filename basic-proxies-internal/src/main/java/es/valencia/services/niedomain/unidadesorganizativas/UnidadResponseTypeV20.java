
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.niedomain.unidadorganizativa.UnidadOrganizativaTypeV20;
import es.valencia.services.nie.unidadesorganizativas.ResponseMessageBaseTypeV10;


/**
 * <p>Java class for UnidadResponseType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadResponseType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UnidadOrganizativa" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}UnidadOrganizativaType_v2.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadResponseType_v2.0", propOrder = {
    "unidadOrganizativa"
})
public class UnidadResponseTypeV20
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "UnidadOrganizativa", required = true)
    protected UnidadOrganizativaTypeV20 unidadOrganizativa;

    /**
     * Gets the value of the unidadOrganizativa property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaTypeV20 }
     *     
     */
    public UnidadOrganizativaTypeV20 getUnidadOrganizativa() {
        return unidadOrganizativa;
    }

    /**
     * Sets the value of the unidadOrganizativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaTypeV20 }
     *     
     */
    public void setUnidadOrganizativa(UnidadOrganizativaTypeV20 value) {
        this.unidadOrganizativa = value;
    }

}
