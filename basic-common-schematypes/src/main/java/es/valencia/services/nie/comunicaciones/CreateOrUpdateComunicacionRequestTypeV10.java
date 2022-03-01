
package es.valencia.services.nie.comunicaciones;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.TipoComunicacionTypeV10;
import es.valencia.schema.nie.comunicacion.UsuarioTypeV10;
import es.valencia.schema.tiposbase.LangTypeV10;


/**
 * <p>Clase Java para CreateOrUpdateComunicacionRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
 *         &lt;element name="Redactor" type="{http://www.valencia.es/schema/nie/Comunicacion}UsuarioType_v1.0"/>
 *         &lt;element name="UidUnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *         &lt;element name="ResponsableFirma" type="{http://www.valencia.es/schema/nie/Comunicacion}UsuarioType_v1.0"/>
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
    "redactor",
    "uidUnidadPropietaria",
    "responsableFirma",
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
    @XmlElement(name = "Redactor", required = true)
    protected UsuarioTypeV10 redactor;
    @XmlElement(name = "UidUnidadPropietaria", required = true)
    protected String uidUnidadPropietaria;
    @XmlElement(name = "ResponsableFirma", required = true)
    protected UsuarioTypeV10 responsableFirma;
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
     * Obtiene el valor de la propiedad codigo.
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
     * Define el valor de la propiedad codigo.
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
     * Obtiene el valor de la propiedad asunto.
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
     * Define el valor de la propiedad asunto.
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
     * Obtiene el valor de la propiedad tipo.
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
     * Define el valor de la propiedad tipo.
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
     * Obtiene el valor de la propiedad idioma.
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
     * Define el valor de la propiedad idioma.
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
     * Obtiene el valor de la propiedad referencia.
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
     * Define el valor de la propiedad referencia.
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
     * Obtiene el valor de la propiedad texto.
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
     * Define el valor de la propiedad texto.
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
     * Obtiene el valor de la propiedad redactor.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioTypeV10 }
     *     
     */
    public UsuarioTypeV10 getRedactor() {
        return redactor;
    }

    /**
     * Define el valor de la propiedad redactor.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioTypeV10 }
     *     
     */
    public void setRedactor(UsuarioTypeV10 value) {
        this.redactor = value;
    }

    /**
     * Obtiene el valor de la propiedad uidUnidadPropietaria.
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
     * Define el valor de la propiedad uidUnidadPropietaria.
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
     * Obtiene el valor de la propiedad responsableFirma.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioTypeV10 }
     *     
     */
    public UsuarioTypeV10 getResponsableFirma() {
        return responsableFirma;
    }

    /**
     * Define el valor de la propiedad responsableFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioTypeV10 }
     *     
     */
    public void setResponsableFirma(UsuarioTypeV10 value) {
        this.responsableFirma = value;
    }

    /**
     * Obtiene el valor de la propiedad antefirma.
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
     * Define el valor de la propiedad antefirma.
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
     * Obtiene el valor de la propiedad respondeA.
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
     * Define el valor de la propiedad respondeA.
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
     * Obtiene el valor de la propiedad reenvioDe.
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
     * Define el valor de la propiedad reenvioDe.
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
     * Obtiene el valor de la propiedad uidUnidadPropietariaListaDestino.
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
     * Define el valor de la propiedad uidUnidadPropietariaListaDestino.
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
     * Obtiene el valor de la propiedad nombreListaDestino.
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
     * Define el valor de la propiedad nombreListaDestino.
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
     * Obtiene el valor de la propiedad destinos.
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
     * Define el valor de la propiedad destinos.
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
