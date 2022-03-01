
package es.valencia.services.nie.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV20;


/**
 * <p>Clase Java para UnidadResponseType_v2.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadResponseType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UnidadOrganizativa" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}UnidadOrganizativaType_v2.0"/>
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
     * Obtiene el valor de la propiedad unidadOrganizativa.
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
     * Define el valor de la propiedad unidadOrganizativa.
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
