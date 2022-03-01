
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindListasUORequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindListasUORequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UidUnidadOrganizativa" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *         &lt;element name="SoloListasGlobales" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindListasUORequestType_v1.0", propOrder = {
    "uidUnidadOrganizativa",
    "soloListasGlobales"
})
public class FindListasUORequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "UidUnidadOrganizativa", required = true)
    protected String uidUnidadOrganizativa;
    @XmlElement(name = "SoloListasGlobales", defaultValue = "false")
    protected boolean soloListasGlobales;

    /**
     * Obtiene el valor de la propiedad uidUnidadOrganizativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidadOrganizativa() {
        return uidUnidadOrganizativa;
    }

    /**
     * Define el valor de la propiedad uidUnidadOrganizativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidadOrganizativa(String value) {
        this.uidUnidadOrganizativa = value;
    }

    /**
     * Obtiene el valor de la propiedad soloListasGlobales.
     * 
     */
    public boolean isSoloListasGlobales() {
        return soloListasGlobales;
    }

    /**
     * Define el valor de la propiedad soloListasGlobales.
     * 
     */
    public void setSoloListasGlobales(boolean value) {
        this.soloListasGlobales = value;
    }

}
