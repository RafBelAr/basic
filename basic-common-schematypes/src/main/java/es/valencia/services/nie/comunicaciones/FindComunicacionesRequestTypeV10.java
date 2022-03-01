
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import es.valencia.schema.nie.common.TipoComunicacionTypeV10;


/**
 * <p>Clase Java para FindComunicacionesRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindComunicacionesRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}FindRequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Asunto" type="{http://www.valencia.es/schema/nie/Common}AsuntoType_v1.0" minOccurs="0"/>
 *         &lt;element name="Tipo" type="{http://www.valencia.es/schema/nie/Common}TipoComunicacionType_v1.0" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.valencia.es/schema/nie/Common}ReferenciaStringType_v1.0" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="FechaCreacionDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="FechaCreacionHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="FechaModificacionDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="FechaModificacionHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;/sequence>
 *         &lt;element name="Redactor" type="{http://www.valencia.es/schema/nie/Common}CodUsuarioType_v1.0" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="CodOrganicoExternoUdadReceptoraDesde" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *             &lt;element name="CodOrganicoExternoUdadReceptoraHasta" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CodOrganicoExternoUnidadPropietariaDesde" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *             &lt;element name="CodOrganicoExternoUnidadPropietariaHasta" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *           &lt;/sequence>
 *           &lt;element name="CodigoBDOUnidadPropietaria" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *           &lt;element name="CodigoInvariableUnidadPropietaria" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *           &lt;element name="CodigoBDOUnidadReceptora" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *           &lt;element name="CodigoInvariableUnidadReceptora" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="CodOrganicoExternoUdadDestinoDesde" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *             &lt;element name="CodOrganicoExternoUdadDestinoHasta" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="CodOrganicoExternoUdadOrigenDesde" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *             &lt;element name="CodOrganicoExternoUdadOrigenHasta" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *           &lt;/sequence>
 *           &lt;element name="CodigoBDOUnidadOrigen" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *           &lt;element name="CodigoInvariableUnidadOrigen" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *           &lt;element name="CodigoBDOUnidadDestino" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
 *           &lt;element name="CodigoInvariableUnidadDestino" type="{http://www.valencia.es/services/nie/Comunicaciones}BusquedaBDOType_v1.0"/>
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
@XmlType(name = "FindComunicacionesRequestType_v1.0", propOrder = {
    "asunto",
    "tipo",
    "referencia",
    "fechaCreacionDesde",
    "fechaCreacionHasta",
    "fechaModificacionDesde",
    "fechaModificacionHasta",
    "redactor",
    "codOrganicoExternoUdadReceptoraDesde",
    "codOrganicoExternoUdadReceptoraHasta",
    "codOrganicoExternoUnidadPropietariaDesde",
    "codOrganicoExternoUnidadPropietariaHasta",
    "codigoBDOUnidadPropietaria",
    "codigoInvariableUnidadPropietaria",
    "codigoBDOUnidadReceptora",
    "codigoInvariableUnidadReceptora",
    "codOrganicoExternoUdadDestinoDesde",
    "codOrganicoExternoUdadDestinoHasta",
    "codOrganicoExternoUdadOrigenDesde",
    "codOrganicoExternoUdadOrigenHasta",
    "codigoBDOUnidadOrigen",
    "codigoInvariableUnidadOrigen",
    "codigoBDOUnidadDestino",
    "codigoInvariableUnidadDestino"
})
public class FindComunicacionesRequestTypeV10
    extends FindRequestMessageBaseTypeV10
{

    @XmlElement(name = "Asunto")
    protected String asunto;
    @XmlElement(name = "Tipo")
    protected TipoComunicacionTypeV10 tipo;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "FechaCreacionDesde")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacionDesde;
    @XmlElement(name = "FechaCreacionHasta")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacionHasta;
    @XmlElement(name = "FechaModificacionDesde")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacionDesde;
    @XmlElement(name = "FechaModificacionHasta")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacionHasta;
    @XmlElement(name = "Redactor")
    protected String redactor;
    @XmlElement(name = "CodOrganicoExternoUdadReceptoraDesde")
    protected String codOrganicoExternoUdadReceptoraDesde;
    @XmlElement(name = "CodOrganicoExternoUdadReceptoraHasta")
    protected String codOrganicoExternoUdadReceptoraHasta;
    @XmlElement(name = "CodOrganicoExternoUnidadPropietariaDesde")
    protected String codOrganicoExternoUnidadPropietariaDesde;
    @XmlElement(name = "CodOrganicoExternoUnidadPropietariaHasta")
    protected String codOrganicoExternoUnidadPropietariaHasta;
    @XmlElement(name = "CodigoBDOUnidadPropietaria")
    protected BusquedaBDOTypeV10 codigoBDOUnidadPropietaria;
    @XmlElement(name = "CodigoInvariableUnidadPropietaria")
    protected BusquedaBDOTypeV10 codigoInvariableUnidadPropietaria;
    @XmlElement(name = "CodigoBDOUnidadReceptora")
    protected BusquedaBDOTypeV10 codigoBDOUnidadReceptora;
    @XmlElement(name = "CodigoInvariableUnidadReceptora")
    protected BusquedaBDOTypeV10 codigoInvariableUnidadReceptora;
    @XmlElement(name = "CodOrganicoExternoUdadDestinoDesde")
    protected String codOrganicoExternoUdadDestinoDesde;
    @XmlElement(name = "CodOrganicoExternoUdadDestinoHasta")
    protected String codOrganicoExternoUdadDestinoHasta;
    @XmlElement(name = "CodOrganicoExternoUdadOrigenDesde")
    protected String codOrganicoExternoUdadOrigenDesde;
    @XmlElement(name = "CodOrganicoExternoUdadOrigenHasta")
    protected String codOrganicoExternoUdadOrigenHasta;
    @XmlElement(name = "CodigoBDOUnidadOrigen")
    protected BusquedaBDOTypeV10 codigoBDOUnidadOrigen;
    @XmlElement(name = "CodigoInvariableUnidadOrigen")
    protected BusquedaBDOTypeV10 codigoInvariableUnidadOrigen;
    @XmlElement(name = "CodigoBDOUnidadDestino")
    protected BusquedaBDOTypeV10 codigoBDOUnidadDestino;
    @XmlElement(name = "CodigoInvariableUnidadDestino")
    protected BusquedaBDOTypeV10 codigoInvariableUnidadDestino;

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
     * Obtiene el valor de la propiedad fechaCreacionDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacionDesde() {
        return fechaCreacionDesde;
    }

    /**
     * Define el valor de la propiedad fechaCreacionDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacionDesde(XMLGregorianCalendar value) {
        this.fechaCreacionDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacionHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacionHasta() {
        return fechaCreacionHasta;
    }

    /**
     * Define el valor de la propiedad fechaCreacionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacionHasta(XMLGregorianCalendar value) {
        this.fechaCreacionHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacionDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacionDesde() {
        return fechaModificacionDesde;
    }

    /**
     * Define el valor de la propiedad fechaModificacionDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacionDesde(XMLGregorianCalendar value) {
        this.fechaModificacionDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacionHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaModificacionHasta() {
        return fechaModificacionHasta;
    }

    /**
     * Define el valor de la propiedad fechaModificacionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaModificacionHasta(XMLGregorianCalendar value) {
        this.fechaModificacionHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad redactor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedactor() {
        return redactor;
    }

    /**
     * Define el valor de la propiedad redactor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedactor(String value) {
        this.redactor = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUdadReceptoraDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUdadReceptoraDesde() {
        return codOrganicoExternoUdadReceptoraDesde;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUdadReceptoraDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUdadReceptoraDesde(String value) {
        this.codOrganicoExternoUdadReceptoraDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUdadReceptoraHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUdadReceptoraHasta() {
        return codOrganicoExternoUdadReceptoraHasta;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUdadReceptoraHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUdadReceptoraHasta(String value) {
        this.codOrganicoExternoUdadReceptoraHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUnidadPropietariaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUnidadPropietariaDesde() {
        return codOrganicoExternoUnidadPropietariaDesde;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUnidadPropietariaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUnidadPropietariaDesde(String value) {
        this.codOrganicoExternoUnidadPropietariaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUnidadPropietariaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUnidadPropietariaHasta() {
        return codOrganicoExternoUnidadPropietariaHasta;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUnidadPropietariaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUnidadPropietariaHasta(String value) {
        this.codOrganicoExternoUnidadPropietariaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBDOUnidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoBDOUnidadPropietaria() {
        return codigoBDOUnidadPropietaria;
    }

    /**
     * Define el valor de la propiedad codigoBDOUnidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoBDOUnidadPropietaria(BusquedaBDOTypeV10 value) {
        this.codigoBDOUnidadPropietaria = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInvariableUnidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoInvariableUnidadPropietaria() {
        return codigoInvariableUnidadPropietaria;
    }

    /**
     * Define el valor de la propiedad codigoInvariableUnidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoInvariableUnidadPropietaria(BusquedaBDOTypeV10 value) {
        this.codigoInvariableUnidadPropietaria = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBDOUnidadReceptora.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoBDOUnidadReceptora() {
        return codigoBDOUnidadReceptora;
    }

    /**
     * Define el valor de la propiedad codigoBDOUnidadReceptora.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoBDOUnidadReceptora(BusquedaBDOTypeV10 value) {
        this.codigoBDOUnidadReceptora = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInvariableUnidadReceptora.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoInvariableUnidadReceptora() {
        return codigoInvariableUnidadReceptora;
    }

    /**
     * Define el valor de la propiedad codigoInvariableUnidadReceptora.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoInvariableUnidadReceptora(BusquedaBDOTypeV10 value) {
        this.codigoInvariableUnidadReceptora = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUdadDestinoDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUdadDestinoDesde() {
        return codOrganicoExternoUdadDestinoDesde;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUdadDestinoDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUdadDestinoDesde(String value) {
        this.codOrganicoExternoUdadDestinoDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUdadDestinoHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUdadDestinoHasta() {
        return codOrganicoExternoUdadDestinoHasta;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUdadDestinoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUdadDestinoHasta(String value) {
        this.codOrganicoExternoUdadDestinoHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUdadOrigenDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUdadOrigenDesde() {
        return codOrganicoExternoUdadOrigenDesde;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUdadOrigenDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUdadOrigenDesde(String value) {
        this.codOrganicoExternoUdadOrigenDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrganicoExternoUdadOrigenHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrganicoExternoUdadOrigenHasta() {
        return codOrganicoExternoUdadOrigenHasta;
    }

    /**
     * Define el valor de la propiedad codOrganicoExternoUdadOrigenHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrganicoExternoUdadOrigenHasta(String value) {
        this.codOrganicoExternoUdadOrigenHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBDOUnidadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoBDOUnidadOrigen() {
        return codigoBDOUnidadOrigen;
    }

    /**
     * Define el valor de la propiedad codigoBDOUnidadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoBDOUnidadOrigen(BusquedaBDOTypeV10 value) {
        this.codigoBDOUnidadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInvariableUnidadOrigen.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoInvariableUnidadOrigen() {
        return codigoInvariableUnidadOrigen;
    }

    /**
     * Define el valor de la propiedad codigoInvariableUnidadOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoInvariableUnidadOrigen(BusquedaBDOTypeV10 value) {
        this.codigoInvariableUnidadOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBDOUnidadDestino.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoBDOUnidadDestino() {
        return codigoBDOUnidadDestino;
    }

    /**
     * Define el valor de la propiedad codigoBDOUnidadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoBDOUnidadDestino(BusquedaBDOTypeV10 value) {
        this.codigoBDOUnidadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInvariableUnidadDestino.
     * 
     * @return
     *     possible object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public BusquedaBDOTypeV10 getCodigoInvariableUnidadDestino() {
        return codigoInvariableUnidadDestino;
    }

    /**
     * Define el valor de la propiedad codigoInvariableUnidadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link BusquedaBDOTypeV10 }
     *     
     */
    public void setCodigoInvariableUnidadDestino(BusquedaBDOTypeV10 value) {
        this.codigoInvariableUnidadDestino = value;
    }

}
