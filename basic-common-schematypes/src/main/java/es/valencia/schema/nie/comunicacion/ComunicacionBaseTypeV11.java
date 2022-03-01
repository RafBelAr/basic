
package es.valencia.schema.nie.comunicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import es.valencia.schema.nie.common.EntidadBaseTypeV10;
import es.valencia.schema.nie.common.EstadoComunicacionTypeV10;
import es.valencia.schema.nie.common.TipoComunicacionTypeV10;
import es.valencia.schema.tiposbase.LangTypeV10;


/**
 * <p>Clase Java para ComunicacionBaseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComunicacionBaseType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Common}EntidadBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.valencia.es/schema/nie/Common}CodigoComunicacionType_v1.0"/>
 *         &lt;element name="Tipo" type="{http://www.valencia.es/schema/nie/Common}TipoComunicacionType_v1.0"/>
 *         &lt;element name="Idioma" type="{http://www.valencia.es/schema/tiposbase}LangType_v1.0"/>
 *         &lt;element name="Estado" type="{http://www.valencia.es/schema/nie/Common}EstadoComunicacionType_v1.0"/>
 *         &lt;element name="Asunto" type="{http://www.valencia.es/schema/nie/Common}AsuntoType_v1.0"/>
 *         &lt;element name="Referencia" type="{http://www.valencia.es/schema/nie/Common}ReferenciaStringType_v1.0" minOccurs="0"/>
 *         &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Redactor" type="{http://www.valencia.es/schema/nie/Comunicacion}UsuarioType_v1.0"/>
 *         &lt;element name="Firmante" type="{http://www.valencia.es/schema/nie/Comunicacion}UsuarioType_v1.0"/>
 *         &lt;element name="Antefirma" type="{http://www.valencia.es/schema/nie/Common}AntefirmaType_v1.0"/>
 *         &lt;element name="UnidadOrigen" type="{http://www.valencia.es/schema/nie/Comunicacion}UnidadOrganizativaBaseType_v1.1" minOccurs="0"/>
 *         &lt;element name="UnidadPropietaria" type="{http://www.valencia.es/schema/nie/Comunicacion}UnidadOrganizativaBaseType_v1.1"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="RespondeA" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *           &lt;element name="ReenvioDe" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ListaDestinos" type="{http://www.valencia.es/schema/nie/Comunicacion}ListaDestinoBaseType_v1.0"/>
 *           &lt;element name="Destinos" type="{http://www.valencia.es/schema/nie/Comunicacion}DestinosType_v1.1"/>
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
@XmlType(name = "ComunicacionBaseType_v1.1", propOrder = {
    "codigo",
    "tipo",
    "idioma",
    "estado",
    "asunto",
    "referencia",
    "fechaCreacion",
    "fechaModificacion",
    "redactor",
    "firmante",
    "antefirma",
    "unidadOrigen",
    "unidadPropietaria",
    "respondeA",
    "reenvioDe",
    "listaDestinos",
    "destinos"
})
@XmlSeeAlso({
    ComunicacionTypeV12 .class
})
public class ComunicacionBaseTypeV11
    extends EntidadBaseTypeV10
{

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Tipo", required = true)
    protected TipoComunicacionTypeV10 tipo;
    @XmlElement(name = "Idioma", required = true)
    protected LangTypeV10 idioma;
    @XmlElement(name = "Estado", required = true)
    protected EstadoComunicacionTypeV10 estado;
    @XmlElement(name = "Asunto", required = true)
    protected String asunto;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "FechaCreacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(name = "FechaModificacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;
    @XmlElement(name = "Redactor", required = true)
    protected UsuarioTypeV10 redactor;
    @XmlElement(name = "Firmante", required = true)
    protected UsuarioTypeV10 firmante;
    @XmlElement(name = "Antefirma", required = true)
    protected String antefirma;
    @XmlElement(name = "UnidadOrigen")
    protected UnidadOrganizativaBaseTypeV11 unidadOrigen;
    @XmlElement(name = "UnidadPropietaria", required = true)
    protected UnidadOrganizativaBaseTypeV11 unidadPropietaria;
    @XmlElement(name = "RespondeA")
    protected String respondeA;
    @XmlElement(name = "ReenvioDe")
    protected String reenvioDe;
    @XmlElement(name = "ListaDestinos")
    protected ListaDestinoBaseTypeV10 listaDestinos;
    @XmlElement(name = "Destinos")
    protected DestinosTypeV11 destinos;

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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoComunicacionTypeV10 }
     *     
     */
    public EstadoComunicacionTypeV10 getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoComunicacionTypeV10 }
     *     
     */
    public void setEstado(EstadoComunicacionTypeV10 value) {
        this.estado = value;
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
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacion(XMLGregorianCalendar value) {
        this.fechaModificacion = value;
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
     * Obtiene el valor de la propiedad firmante.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioTypeV10 }
     *     
     */
    public UsuarioTypeV10 getFirmante() {
        return firmante;
    }

    /**
     * Define el valor de la propiedad firmante.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioTypeV10 }
     *     
     */
    public void setFirmante(UsuarioTypeV10 value) {
        this.firmante = value;
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
     * Obtiene el valor de la propiedad unidadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public UnidadOrganizativaBaseTypeV11 getUnidadOrigen() {
        return unidadOrigen;
    }

    /**
     * Define el valor de la propiedad unidadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public void setUnidadOrigen(UnidadOrganizativaBaseTypeV11 value) {
        this.unidadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public UnidadOrganizativaBaseTypeV11 getUnidadPropietaria() {
        return unidadPropietaria;
    }

    /**
     * Define el valor de la propiedad unidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public void setUnidadPropietaria(UnidadOrganizativaBaseTypeV11 value) {
        this.unidadPropietaria = value;
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
     * Obtiene el valor de la propiedad listaDestinos.
     * 
     * @return
     *     possible object is
     *     {@link ListaDestinoBaseTypeV10 }
     *     
     */
    public ListaDestinoBaseTypeV10 getListaDestinos() {
        return listaDestinos;
    }

    /**
     * Define el valor de la propiedad listaDestinos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDestinoBaseTypeV10 }
     *     
     */
    public void setListaDestinos(ListaDestinoBaseTypeV10 value) {
        this.listaDestinos = value;
    }

    /**
     * Obtiene el valor de la propiedad destinos.
     * 
     * @return
     *     possible object is
     *     {@link DestinosTypeV11 }
     *     
     */
    public DestinosTypeV11 getDestinos() {
        return destinos;
    }

    /**
     * Define el valor de la propiedad destinos.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinosTypeV11 }
     *     
     */
    public void setDestinos(DestinosTypeV11 value) {
        this.destinos = value;
    }

}
