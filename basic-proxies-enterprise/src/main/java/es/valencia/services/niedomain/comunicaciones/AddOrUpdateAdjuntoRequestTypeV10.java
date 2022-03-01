
package es.valencia.services.niedomain.comunicaciones;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import es.valencia.services.nie.comunicaciones.RequestMessageBaseTypeV10;


/**
 * <p>Java class for AddOrUpdateAdjuntoRequestType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateAdjuntoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CodigoComunicacion" type="{http://www.valencia.es/schema/nie/Common}CodigoComunicacionType_v1.0"/>
 *         &lt;element name="Nombre" type="{http://www.valencia.es/schema/nie/Common}NombreAdjuntoType_v1.0"/>
 *         &lt;element name="Tipo" type="{http://www.valencia.es/schema/nie/Common}TipoAdjuntoType_v1.0"/>
 *         &lt;choice>
 *           &lt;element name="ReferenciaCM" type="{http://www.valencia.es/schema/tiposbase}IdUCMType_v1.0"/>
 *           &lt;element name="Contenido" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateAdjuntoRequestType_v1.0", propOrder = {
    "codigoComunicacion",
    "nombre",
    "tipo",
    "referenciaCM",
    "contenido"
})
public class AddOrUpdateAdjuntoRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "CodigoComunicacion", required = true)
    protected String codigoComunicacion;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "ReferenciaCM")
    protected String referenciaCM;
    @XmlElement(name = "Contenido")
    @XmlMimeType("application/octectstream")
    protected DataHandler contenido;

    /**
     * Gets the value of the codigoComunicacion property.
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
     * Sets the value of the codigoComunicacion property.
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
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the referenciaCM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCM() {
        return referenciaCM;
    }

    /**
     * Sets the value of the referenciaCM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCM(String value) {
        this.referenciaCM = value;
    }

    /**
     * Gets the value of the contenido property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getContenido() {
        return contenido;
    }

    /**
     * Sets the value of the contenido property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setContenido(DataHandler value) {
        this.contenido = value;
    }

}
