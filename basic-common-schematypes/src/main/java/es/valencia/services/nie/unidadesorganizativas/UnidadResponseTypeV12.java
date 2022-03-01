
package es.valencia.services.nie.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV12;


/**
 * <p>Clase Java para UnidadResponseType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UnidadOrganizativa" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}UnidadOrganizativaType_v1.2"/>
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
     * Obtiene el valor de la propiedad unidadOrganizativa.
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
     * Define el valor de la propiedad unidadOrganizativa.
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
