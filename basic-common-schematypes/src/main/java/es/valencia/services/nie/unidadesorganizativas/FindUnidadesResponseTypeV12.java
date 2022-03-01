
package es.valencia.services.nie.unidadesorganizativas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindUnidadesResponseType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindUnidadesResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}FindResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UnidadesOrganizativas" type="{http://www.valencia.es/services/nie/UnidadesOrganizativas}UnidadesOrganizativasType_v1.2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindUnidadesResponseType_v1.2", propOrder = {
    "unidadesOrganizativas"
})
public class FindUnidadesResponseTypeV12
    extends FindResponseMessageBaseTypeV10
{

    @XmlElement(name = "UnidadesOrganizativas", required = true)
    protected UnidadesOrganizativasTypeV12 unidadesOrganizativas;

    /**
     * Obtiene el valor de la propiedad unidadesOrganizativas.
     * 
     * @return
     *     possible object is
     *     {@link UnidadesOrganizativasTypeV12 }
     *     
     */
    public UnidadesOrganizativasTypeV12 getUnidadesOrganizativas() {
        return unidadesOrganizativas;
    }

    /**
     * Define el valor de la propiedad unidadesOrganizativas.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadesOrganizativasTypeV12 }
     *     
     */
    public void setUnidadesOrganizativas(UnidadesOrganizativasTypeV12 value) {
        this.unidadesOrganizativas = value;
    }

}
