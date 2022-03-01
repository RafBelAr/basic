
package es.valencia.schema.nie.comunicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import es.valencia.schema.nie.common.EntidadBaseTypeV10;
import es.valencia.schema.nie.common.EstadoNITypeV10;


/**
 * <p>Clase Java para NotaInteriorType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotaInteriorType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Common}EntidadBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="NumeroRegistro" type="{http://www.valencia.es/schema/nie/Common}NumeroRegistroType_v1.0"/>
 *         &lt;element name="IdDocumentoFirmado" type="{http://www.valencia.es/schema/tiposbase}IdUCMType_v1.0" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.valencia.es/schema/nie/Common}EstadoNIType_v1.0"/>
 *         &lt;element name="UnidadDestino" type="{http://www.valencia.es/schema/nie/Comunicacion}UnidadOrganizativaBaseType_v1.1"/>
 *         &lt;element name="UnidadReceptora" type="{http://www.valencia.es/schema/nie/Comunicacion}UnidadOrganizativaBaseType_v1.1"/>
 *         &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Hitos" type="{http://www.valencia.es/schema/nie/Comunicacion}HitosType_v1.0"/>
 *         &lt;element name="FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodigosExpedientes" type="{http://www.valencia.es/schema/nie/Comunicacion}CodigosExpedientesType_v1.0" minOccurs="0"/>
 *         &lt;element name="Respuestas" type="{http://www.valencia.es/schema/nie/Comunicacion}CodsComunicacionType_v1.0" minOccurs="0"/>
 *         &lt;element name="Reenvios" type="{http://www.valencia.es/schema/nie/Comunicacion}CodsComunicacionType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaInteriorType_v1.2", propOrder = {
    "numeroRegistro",
    "idDocumentoFirmado",
    "estado",
    "unidadDestino",
    "unidadReceptora",
    "fechaCreacion",
    "hitos",
    "fechaModificacion",
    "codigosExpedientes",
    "respuestas",
    "reenvios"
})
public class NotaInteriorTypeV12
    extends EntidadBaseTypeV10
{

    @XmlElement(name = "NumeroRegistro", required = true)
    protected String numeroRegistro;
    @XmlElement(name = "IdDocumentoFirmado")
    protected String idDocumentoFirmado;
    @XmlElement(name = "Estado", required = true)
    protected EstadoNITypeV10 estado;
    @XmlElement(name = "UnidadDestino", required = true)
    protected UnidadOrganizativaBaseTypeV11 unidadDestino;
    @XmlElement(name = "UnidadReceptora", required = true)
    protected UnidadOrganizativaBaseTypeV11 unidadReceptora;
    @XmlElement(name = "FechaCreacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(name = "Hitos", required = true)
    protected HitosTypeV10 hitos;
    @XmlElement(name = "FechaModificacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;
    @XmlElement(name = "CodigosExpedientes")
    protected CodigosExpedientesTypeV10 codigosExpedientes;
    @XmlElement(name = "Respuestas")
    protected CodsComunicacionTypeV10 respuestas;
    @XmlElement(name = "Reenvios")
    protected CodsComunicacionTypeV10 reenvios;

    /**
     * Obtiene el valor de la propiedad numeroRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Define el valor de la propiedad numeroRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRegistro(String value) {
        this.numeroRegistro = value;
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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoNITypeV10 }
     *     
     */
    public EstadoNITypeV10 getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoNITypeV10 }
     *     
     */
    public void setEstado(EstadoNITypeV10 value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadDestino.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public UnidadOrganizativaBaseTypeV11 getUnidadDestino() {
        return unidadDestino;
    }

    /**
     * Define el valor de la propiedad unidadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public void setUnidadDestino(UnidadOrganizativaBaseTypeV11 value) {
        this.unidadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadReceptora.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public UnidadOrganizativaBaseTypeV11 getUnidadReceptora() {
        return unidadReceptora;
    }

    /**
     * Define el valor de la propiedad unidadReceptora.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaBaseTypeV11 }
     *     
     */
    public void setUnidadReceptora(UnidadOrganizativaBaseTypeV11 value) {
        this.unidadReceptora = value;
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
     * Obtiene el valor de la propiedad hitos.
     * 
     * @return
     *     possible object is
     *     {@link HitosTypeV10 }
     *     
     */
    public HitosTypeV10 getHitos() {
        return hitos;
    }

    /**
     * Define el valor de la propiedad hitos.
     * 
     * @param value
     *     allowed object is
     *     {@link HitosTypeV10 }
     *     
     */
    public void setHitos(HitosTypeV10 value) {
        this.hitos = value;
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
     * Obtiene el valor de la propiedad codigosExpedientes.
     * 
     * @return
     *     possible object is
     *     {@link CodigosExpedientesTypeV10 }
     *     
     */
    public CodigosExpedientesTypeV10 getCodigosExpedientes() {
        return codigosExpedientes;
    }

    /**
     * Define el valor de la propiedad codigosExpedientes.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigosExpedientesTypeV10 }
     *     
     */
    public void setCodigosExpedientes(CodigosExpedientesTypeV10 value) {
        this.codigosExpedientes = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestas.
     * 
     * @return
     *     possible object is
     *     {@link CodsComunicacionTypeV10 }
     *     
     */
    public CodsComunicacionTypeV10 getRespuestas() {
        return respuestas;
    }

    /**
     * Define el valor de la propiedad respuestas.
     * 
     * @param value
     *     allowed object is
     *     {@link CodsComunicacionTypeV10 }
     *     
     */
    public void setRespuestas(CodsComunicacionTypeV10 value) {
        this.respuestas = value;
    }

    /**
     * Obtiene el valor de la propiedad reenvios.
     * 
     * @return
     *     possible object is
     *     {@link CodsComunicacionTypeV10 }
     *     
     */
    public CodsComunicacionTypeV10 getReenvios() {
        return reenvios;
    }

    /**
     * Define el valor de la propiedad reenvios.
     * 
     * @param value
     *     allowed object is
     *     {@link CodsComunicacionTypeV10 }
     *     
     */
    public void setReenvios(CodsComunicacionTypeV10 value) {
        this.reenvios = value;
    }

}
