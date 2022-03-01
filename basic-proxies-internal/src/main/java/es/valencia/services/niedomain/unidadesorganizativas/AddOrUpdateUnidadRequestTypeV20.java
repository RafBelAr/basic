
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.UsuarioTypeV10;
import es.valencia.schema.nie.unidadorganizativa.CapacidadUOReceptoraTypeV10;
import es.valencia.schema.nie.unidadorganizativa.CapacidadUOTypeV10;
import es.valencia.services.nie.unidadesorganizativas.RequestMessageBaseTypeV10;


/**
 * <p>Java class for AddOrUpdateUnidadRequestType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateUnidadRequestType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CodigoBDO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="CodigoInvariable" type="{http://www.valencia.es/schema/nie/Common}CodInvariableType_v1.0"/>
 *           &lt;element name="CodigoOrganicoExterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0" minOccurs="0"/>
 *           &lt;element name="CodigoOrganicoInterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="NombreUnidadCas" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreUnidadVal" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="EmisoraNI" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}CapacidadUOType_v1.0" minOccurs="0"/>
 *         &lt;element name="ReceptoraNI" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}CapacidadUOReceptoraType_v1.0" minOccurs="0"/>
 *         &lt;element name="PrimerNivel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Vigente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UidPadre" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="Responsable" type="{http://www.valencia.es/schema/nie/Common}UsuarioType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreCargoCas" type="{http://www.valencia.es/schema/nie/Common}CargoType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreCargoVal" type="{http://www.valencia.es/schema/nie/Common}CargoType_v1.0" minOccurs="0"/>
 *         &lt;element name="Sustitutos" type="{http://www.valencia.es/services/nieDomain/UnidadesOrganizativas}SustitutosType_v2.0" minOccurs="0"/>
 *         &lt;element name="Gestores" type="{http://www.valencia.es/services/nieDomain/UnidadesOrganizativas}GestoresType_v1.0" minOccurs="0"/>
 *         &lt;element name="RedactoresDeshabilitados" type="{http://www.valencia.es/services/nieDomain/UnidadesOrganizativas}RedactoresDeshabilitadosType_v2.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateUnidadRequestType_v2.0", propOrder = {
    "codigoBDO",
    "codigoInvariable",
    "codigoOrganicoExterno",
    "codigoOrganicoInterno",
    "nombreUnidadCas",
    "nombreUnidadVal",
    "emisoraNI",
    "receptoraNI",
    "primerNivel",
    "vigente",
    "uidPadre",
    "responsable",
    "nombreCargoCas",
    "nombreCargoVal",
    "sustitutos",
    "gestores",
    "redactoresDeshabilitados"
})
public class AddOrUpdateUnidadRequestTypeV20
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "CodigoBDO")
    protected long codigoBDO;
    @XmlElement(name = "CodigoInvariable")
    protected String codigoInvariable;
    @XmlElement(name = "CodigoOrganicoExterno")
    protected String codigoOrganicoExterno;
    @XmlElement(name = "CodigoOrganicoInterno")
    protected String codigoOrganicoInterno;
    @XmlElement(name = "NombreUnidadCas")
    protected String nombreUnidadCas;
    @XmlElement(name = "NombreUnidadVal")
    protected String nombreUnidadVal;
    @XmlElement(name = "EmisoraNI")
    protected CapacidadUOTypeV10 emisoraNI;
    @XmlElement(name = "ReceptoraNI")
    protected CapacidadUOReceptoraTypeV10 receptoraNI;
    @XmlElement(name = "PrimerNivel")
    protected Boolean primerNivel;
    @XmlElement(name = "Vigente")
    protected Boolean vigente;
    @XmlElementRef(name = "UidPadre", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidPadre;
    @XmlElementRef(name = "Responsable", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<UsuarioTypeV10> responsable;
    @XmlElementRef(name = "NombreCargoCas", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCargoCas;
    @XmlElementRef(name = "NombreCargoVal", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCargoVal;
    @XmlElement(name = "Sustitutos")
    protected SustitutosTypeV20 sustitutos;
    @XmlElement(name = "Gestores")
    protected GestoresTypeV10 gestores;
    @XmlElement(name = "RedactoresDeshabilitados")
    protected RedactoresDeshabilitadosTypeV20 redactoresDeshabilitados;

    /**
     * Gets the value of the codigoBDO property.
     * 
     */
    public long getCodigoBDO() {
        return codigoBDO;
    }

    /**
     * Sets the value of the codigoBDO property.
     * 
     */
    public void setCodigoBDO(long value) {
        this.codigoBDO = value;
    }

    /**
     * Gets the value of the codigoInvariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInvariable() {
        return codigoInvariable;
    }

    /**
     * Sets the value of the codigoInvariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInvariable(String value) {
        this.codigoInvariable = value;
    }

    /**
     * Gets the value of the codigoOrganicoExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrganicoExterno() {
        return codigoOrganicoExterno;
    }

    /**
     * Sets the value of the codigoOrganicoExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrganicoExterno(String value) {
        this.codigoOrganicoExterno = value;
    }

    /**
     * Gets the value of the codigoOrganicoInterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOrganicoInterno() {
        return codigoOrganicoInterno;
    }

    /**
     * Sets the value of the codigoOrganicoInterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOrganicoInterno(String value) {
        this.codigoOrganicoInterno = value;
    }

    /**
     * Gets the value of the nombreUnidadCas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUnidadCas() {
        return nombreUnidadCas;
    }

    /**
     * Sets the value of the nombreUnidadCas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUnidadCas(String value) {
        this.nombreUnidadCas = value;
    }

    /**
     * Gets the value of the nombreUnidadVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUnidadVal() {
        return nombreUnidadVal;
    }

    /**
     * Sets the value of the nombreUnidadVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUnidadVal(String value) {
        this.nombreUnidadVal = value;
    }

    /**
     * Gets the value of the emisoraNI property.
     * 
     * @return
     *     possible object is
     *     {@link CapacidadUOTypeV10 }
     *     
     */
    public CapacidadUOTypeV10 getEmisoraNI() {
        return emisoraNI;
    }

    /**
     * Sets the value of the emisoraNI property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacidadUOTypeV10 }
     *     
     */
    public void setEmisoraNI(CapacidadUOTypeV10 value) {
        this.emisoraNI = value;
    }

    /**
     * Gets the value of the receptoraNI property.
     * 
     * @return
     *     possible object is
     *     {@link CapacidadUOReceptoraTypeV10 }
     *     
     */
    public CapacidadUOReceptoraTypeV10 getReceptoraNI() {
        return receptoraNI;
    }

    /**
     * Sets the value of the receptoraNI property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacidadUOReceptoraTypeV10 }
     *     
     */
    public void setReceptoraNI(CapacidadUOReceptoraTypeV10 value) {
        this.receptoraNI = value;
    }

    /**
     * Gets the value of the primerNivel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimerNivel() {
        return primerNivel;
    }

    /**
     * Sets the value of the primerNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimerNivel(Boolean value) {
        this.primerNivel = value;
    }

    /**
     * Gets the value of the vigente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVigente() {
        return vigente;
    }

    /**
     * Sets the value of the vigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVigente(Boolean value) {
        this.vigente = value;
    }

    /**
     * Gets the value of the uidPadre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUidPadre() {
        return uidPadre;
    }

    /**
     * Sets the value of the uidPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUidPadre(JAXBElement<String> value) {
        this.uidPadre = value;
    }

    /**
     * Gets the value of the responsable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsuarioTypeV10 }{@code >}
     *     
     */
    public JAXBElement<UsuarioTypeV10> getResponsable() {
        return responsable;
    }

    /**
     * Sets the value of the responsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsuarioTypeV10 }{@code >}
     *     
     */
    public void setResponsable(JAXBElement<UsuarioTypeV10> value) {
        this.responsable = value;
    }

    /**
     * Gets the value of the nombreCargoCas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCargoCas() {
        return nombreCargoCas;
    }

    /**
     * Sets the value of the nombreCargoCas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCargoCas(JAXBElement<String> value) {
        this.nombreCargoCas = value;
    }

    /**
     * Gets the value of the nombreCargoVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCargoVal() {
        return nombreCargoVal;
    }

    /**
     * Sets the value of the nombreCargoVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCargoVal(JAXBElement<String> value) {
        this.nombreCargoVal = value;
    }

    /**
     * Gets the value of the sustitutos property.
     * 
     * @return
     *     possible object is
     *     {@link SustitutosTypeV20 }
     *     
     */
    public SustitutosTypeV20 getSustitutos() {
        return sustitutos;
    }

    /**
     * Sets the value of the sustitutos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SustitutosTypeV20 }
     *     
     */
    public void setSustitutos(SustitutosTypeV20 value) {
        this.sustitutos = value;
    }

    /**
     * Gets the value of the gestores property.
     * 
     * @return
     *     possible object is
     *     {@link GestoresTypeV10 }
     *     
     */
    public GestoresTypeV10 getGestores() {
        return gestores;
    }

    /**
     * Sets the value of the gestores property.
     * 
     * @param value
     *     allowed object is
     *     {@link GestoresTypeV10 }
     *     
     */
    public void setGestores(GestoresTypeV10 value) {
        this.gestores = value;
    }

    /**
     * Gets the value of the redactoresDeshabilitados property.
     * 
     * @return
     *     possible object is
     *     {@link RedactoresDeshabilitadosTypeV20 }
     *     
     */
    public RedactoresDeshabilitadosTypeV20 getRedactoresDeshabilitados() {
        return redactoresDeshabilitados;
    }

    /**
     * Sets the value of the redactoresDeshabilitados property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedactoresDeshabilitadosTypeV20 }
     *     
     */
    public void setRedactoresDeshabilitados(RedactoresDeshabilitadosTypeV20 value) {
        this.redactoresDeshabilitados = value;
    }

}
