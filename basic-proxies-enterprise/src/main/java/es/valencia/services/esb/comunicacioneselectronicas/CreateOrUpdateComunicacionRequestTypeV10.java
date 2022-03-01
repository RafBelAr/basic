
package es.valencia.services.esb.comunicacioneselectronicas;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.TipoComunicacionTypeV10;
import es.valencia.schema.tiposbase.LangTypeV10;
import es.valencia.services.nie.comunicaciones.DestinosTypeV10;
import es.valencia.services.nie.comunicaciones.RequestMessageBaseTypeV10;


/**
 * <p>Java class for CreateOrUpdateComunicacionRequestType_v1.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrUpdateComunicacionRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.valencia.es/schema/nie/Common}CodigoComunicacionType_v1.0"/>
 *         &lt;element name="Asunto" type="{http://www.valencia.es/schema/nie/Common}AsuntoType_v1.0"/>
 *         &lt;element name="Tipo" type="{http://www.valencia.es/schema/nie/Common}TipoComunicacionType_v1.0"/>
 *         &lt;element name="Idioma" type="{http://www.valencia.es/schema/tiposbase}LangType_v1.0"/>
 *         &lt;element name="Referencia" type="{http://www.valencia.es/schema/nie/Common}ReferenciaStringType_v1.0" minOccurs="0"/>
 *         &lt;element name="Texto" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="NIFRedactor" type="{http://www.valencia.es/schema/tiposbase}NIFType_v1.0"/>
 *         &lt;element name="UidUnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *         &lt;element name="NIFResponsableFirma" type="{http://www.valencia.es/schema/tiposbase}NIFType_v1.0"/>
 *         &lt;element name="Antefirma" type="{http://www.valencia.es/schema/nie/Common}AntefirmaType_v1.0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="RespondeA" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *           &lt;element name="ReenvioDe" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="UidUnidadPropietariaListaDestino" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *             &lt;element name="NombreListaDestino" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *           &lt;/sequence>
 *           &lt;element name="Destinos" type="{http://www.valencia.es/services/nie/Comunicaciones}DestinosType_v1.0"/>
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
@XmlType(name = "CreateOrUpdateComunicacionRequestType_v1.0", propOrder = {
    "codigo",
    "asunto",
    "tipo",
    "idioma",
    "referencia",
    "texto",
    "nifRedactor",
    "uidUnidadPropietaria",
    "nifResponsableFirma",
    "antefirma",
    "respondeA",
    "reenvioDe",
    "uidUnidadPropietariaListaDestino",
    "nombreListaDestino",
    "destinos"
})
public class CreateOrUpdateComunicacionRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Asunto", required = true)
    protected String asunto;
    @XmlElement(name = "Tipo", required = true)
    protected TipoComunicacionTypeV10 tipo;
    @XmlElement(name = "Idioma", required = true)
    protected LangTypeV10 idioma;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "Texto", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler texto;
    @XmlElement(name = "NIFRedactor", required = true)
    protected String nifRedactor;
    @XmlElement(name = "UidUnidadPropietaria", required = true)
    protected String uidUnidadPropietaria;
    @XmlElement(name = "NIFResponsableFirma", required = true)
    protected String nifResponsableFirma;
    @XmlElement(name = "Antefirma", required = true)
    protected String antefirma;
    @XmlElement(name = "RespondeA")
    protected String respondeA;
    @XmlElement(name = "ReenvioDe")
    protected String reenvioDe;
    @XmlElement(name = "UidUnidadPropietariaListaDestino")
    protected String uidUnidadPropietariaListaDestino;
    @XmlElement(name = "NombreListaDestino")
    protected String nombreListaDestino;
    @XmlElement(name = "Destinos")
    protected DestinosTypeV10 destinos;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the asunto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * Sets the value of the asunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsunto(String value) {
        this.asunto = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoComunicacionTypeV10 }
     *     
     */
    public TipoComunicacionTypeV10 getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoComunicacionTypeV10 }
     *     
     */
    public void setTipo(TipoComunicacionTypeV10 value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the idioma property.
     * 
     * @return
     *     possible object is
     *     {@link LangTypeV10 }
     *     
     */
    public LangTypeV10 getIdioma() {
        return idioma;
    }

    /**
     * Sets the value of the idioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangTypeV10 }
     *     
     */
    public void setIdioma(LangTypeV10 value) {
        this.idioma = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the texto property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getTexto() {
        return texto;
    }

    /**
     * Sets the value of the texto property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setTexto(DataHandler value) {
        this.texto = value;
    }

    /**
     * Gets the value of the nifRedactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFRedactor() {
        return nifRedactor;
    }

    /**
     * Sets the value of the nifRedactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFRedactor(String value) {
        this.nifRedactor = value;
    }

    /**
     * Gets the value of the uidUnidadPropietaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidadPropietaria() {
        return uidUnidadPropietaria;
    }

    /**
     * Sets the value of the uidUnidadPropietaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidadPropietaria(String value) {
        this.uidUnidadPropietaria = value;
    }

    /**
     * Gets the value of the nifResponsableFirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFResponsableFirma() {
        return nifResponsableFirma;
    }

    /**
     * Sets the value of the nifResponsableFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFResponsableFirma(String value) {
        this.nifResponsableFirma = value;
    }

    /**
     * Gets the value of the antefirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntefirma() {
        return antefirma;
    }

    /**
     * Sets the value of the antefirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntefirma(String value) {
        this.antefirma = value;
    }

    /**
     * Gets the value of the respondeA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespondeA() {
        return respondeA;
    }

    /**
     * Sets the value of the respondeA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespondeA(String value) {
        this.respondeA = value;
    }

    /**
     * Gets the value of the reenvioDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReenvioDe() {
        return reenvioDe;
    }

    /**
     * Sets the value of the reenvioDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReenvioDe(String value) {
        this.reenvioDe = value;
    }

    /**
     * Gets the value of the uidUnidadPropietariaListaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidadPropietariaListaDestino() {
        return uidUnidadPropietariaListaDestino;
    }

    /**
     * Sets the value of the uidUnidadPropietariaListaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidadPropietariaListaDestino(String value) {
        this.uidUnidadPropietariaListaDestino = value;
    }

    /**
     * Gets the value of the nombreListaDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreListaDestino() {
        return nombreListaDestino;
    }

    /**
     * Sets the value of the nombreListaDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreListaDestino(String value) {
        this.nombreListaDestino = value;
    }

    /**
     * Gets the value of the destinos property.
     * 
     * @return
     *     possible object is
     *     {@link DestinosTypeV10 }
     *     
     */
    public DestinosTypeV10 getDestinos() {
        return destinos;
    }

    /**
     * Sets the value of the destinos property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinosTypeV10 }
     *     
     */
    public void setDestinos(DestinosTypeV10 value) {
        this.destinos = value;
    }

}
