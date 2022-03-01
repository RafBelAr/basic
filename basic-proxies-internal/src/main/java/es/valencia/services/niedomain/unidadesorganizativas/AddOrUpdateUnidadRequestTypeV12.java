
package es.valencia.services.niedomain.unidadesorganizativas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.ResponsableTypeV10;
import es.valencia.schema.nie.unidadorganizativa.CapacidadUOTypeV10;
import es.valencia.services.nie.unidadesorganizativas.RequestMessageBaseTypeV10;


/**
 * <p>Java class for AddOrUpdateUnidadRequestType_v1.2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateUnidadRequestType_v1.2">
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
 *         &lt;element name="ReceptoraNI" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}CapacidadUOType_v1.0" minOccurs="0"/>
 *         &lt;element name="PrimerNivel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Vigente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UidPadre" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="Responsable" type="{http://www.valencia.es/schema/nie/Common}ResponsableType_v1.0" minOccurs="0"/>
 *         &lt;element name="Sustituto" type="{http://www.valencia.es/services/nieDomain/UnidadesOrganizativas}SustitutoType_v1.0" minOccurs="0"/>
 *         &lt;element name="Gestores" type="{http://www.valencia.es/services/nieDomain/UnidadesOrganizativas}GestoresType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateUnidadRequestType_v1.2", propOrder = {
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
    "sustituto",
    "gestores"
})
public class AddOrUpdateUnidadRequestTypeV12
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
    protected CapacidadUOTypeV10 receptoraNI;
    @XmlElement(name = "PrimerNivel")
    protected Boolean primerNivel;
    @XmlElement(name = "Vigente")
    protected Boolean vigente;
    @XmlElementRef(name = "UidPadre", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidPadre;
    @XmlElementRef(name = "Responsable", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponsableTypeV10> responsable;
    @XmlElementRef(name = "Sustituto", namespace = "http://www.valencia.es/services/nieDomain/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<SustitutoTypeV10> sustituto;
    @XmlElement(name = "Gestores")
    protected GestoresTypeV10 gestores;

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
     *     {@link CapacidadUOTypeV10 }
     *     
     */
    public CapacidadUOTypeV10 getReceptoraNI() {
        return receptoraNI;
    }

    /**
     * Sets the value of the receptoraNI property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapacidadUOTypeV10 }
     *     
     */
    public void setReceptoraNI(CapacidadUOTypeV10 value) {
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
     *     {@link JAXBElement }{@code <}{@link ResponsableTypeV10 }{@code >}
     *     
     */
    public JAXBElement<ResponsableTypeV10> getResponsable() {
        return responsable;
    }

    /**
     * Sets the value of the responsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponsableTypeV10 }{@code >}
     *     
     */
    public void setResponsable(JAXBElement<ResponsableTypeV10> value) {
        this.responsable = value;
    }

    /**
     * Gets the value of the sustituto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SustitutoTypeV10 }{@code >}
     *     
     */
    public JAXBElement<SustitutoTypeV10> getSustituto() {
        return sustituto;
    }

    /**
     * Sets the value of the sustituto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SustitutoTypeV10 }{@code >}
     *     
     */
    public void setSustituto(JAXBElement<SustitutoTypeV10> value) {
        this.sustituto = value;
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

}
