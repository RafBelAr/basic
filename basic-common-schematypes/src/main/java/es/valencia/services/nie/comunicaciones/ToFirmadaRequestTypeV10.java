
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ToFirmadaRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ToFirmadaRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CodigoComunicacion" type="{http://www.valencia.es/schema/nie/Common}CodigoComunicacionType_v1.0"/>
 *         &lt;element name="IdCMDocFirmado" type="{http://www.valencia.es/schema/tiposbase}IdUCMType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToFirmadaRequestType_v1.0", propOrder = {
    "codigoComunicacion",
    "idCMDocFirmado"
})
public class ToFirmadaRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "CodigoComunicacion", required = true)
    protected String codigoComunicacion;
    @XmlElement(name = "IdCMDocFirmado", required = true)
    protected String idCMDocFirmado;

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
     * Obtiene el valor de la propiedad idCMDocFirmado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCMDocFirmado() {
        return idCMDocFirmado;
    }

    /**
     * Define el valor de la propiedad idCMDocFirmado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCMDocFirmado(String value) {
        this.idCMDocFirmado = value;
    }

}
