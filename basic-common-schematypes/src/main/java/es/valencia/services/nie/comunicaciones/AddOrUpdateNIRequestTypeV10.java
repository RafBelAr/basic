
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AddOrUpdateNIRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateNIRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CodigoComunicacion" type="{http://www.valencia.es/schema/nie/Common}CodigoComunicacionType_v1.0"/>
 *         &lt;element name="IdDocumentoFirmado" type="{http://www.valencia.es/schema/tiposbase}IdUCMType_v1.0" minOccurs="0"/>
 *         &lt;element name="UidUnidadReceptora" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateNIRequestType_v1.0", propOrder = {
    "codigoComunicacion",
    "idDocumentoFirmado",
    "uidUnidadReceptora"
})
public class AddOrUpdateNIRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "CodigoComunicacion", required = true)
    protected String codigoComunicacion;
    @XmlElement(name = "IdDocumentoFirmado")
    protected String idDocumentoFirmado;
    @XmlElement(name = "UidUnidadReceptora", required = true)
    protected String uidUnidadReceptora;

    /**
     * Obtiene el valor de la propiedad codigoComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoComunicacion() {
        return codigoComunicacion;
    }

    /**
     * Define el valor de la propiedad codigoComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoComunicacion(String value) {
        this.codigoComunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocumentoFirmado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumentoFirmado() {
        return idDocumentoFirmado;
    }

    /**
     * Define el valor de la propiedad idDocumentoFirmado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumentoFirmado(String value) {
        this.idDocumentoFirmado = value;
    }

    /**
     * Obtiene el valor de la propiedad uidUnidadReceptora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidadReceptora() {
        return uidUnidadReceptora;
    }

    /**
     * Define el valor de la propiedad uidUnidadReceptora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidadReceptora(String value) {
        this.uidUnidadReceptora = value;
    }

}
