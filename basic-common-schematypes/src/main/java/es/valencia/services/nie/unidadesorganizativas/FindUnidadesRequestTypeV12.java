
package es.valencia.services.nie.unidadesorganizativas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindUnidadesRequestType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindUnidadesRequestType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/UnidadesOrganizativas}FindRequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="CodigoOrganicoExterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0" minOccurs="0"/>
 *         &lt;element name="CodigoOrganicoInterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreUnidadCas" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreUnidadVal" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="EmisoraNI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceptoraNI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimerNivel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Vigente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UidPadre" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NifResponsable" type="{http://www.valencia.es/schema/tiposbase}NIFPersonaFisicaType_v1.0" minOccurs="0"/>
 *         &lt;element name="NifSustituto" type="{http://www.valencia.es/schema/tiposbase}NIFPersonaFisicaType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindUnidadesRequestType_v1.2", propOrder = {
    "codigoOrganicoExterno",
    "codigoOrganicoInterno",
    "nombreUnidadCas",
    "nombreUnidadVal",
    "emisoraNI",
    "receptoraNI",
    "primerNivel",
    "vigente",
    "uidPadre",
    "nifResponsable",
    "nifSustituto"
})
public class FindUnidadesRequestTypeV12
    extends FindRequestMessageBaseTypeV10
{

    @XmlElement(name = "CodigoOrganicoExterno")
    protected String codigoOrganicoExterno;
    @XmlElement(name = "CodigoOrganicoInterno")
    protected String codigoOrganicoInterno;
    @XmlElement(name = "NombreUnidadCas")
    protected String nombreUnidadCas;
    @XmlElement(name = "NombreUnidadVal")
    protected String nombreUnidadVal;
    @XmlElement(name = "EmisoraNI")
    protected Boolean emisoraNI;
    @XmlElement(name = "ReceptoraNI")
    protected Boolean receptoraNI;
    @XmlElement(name = "PrimerNivel")
    protected Boolean primerNivel;
    @XmlElement(name = "Vigente")
    protected Boolean vigente;
    @XmlElementRef(name = "UidPadre", namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uidPadre;
    @XmlElementRef(name = "NifResponsable", namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifResponsable;
    @XmlElementRef(name = "NifSustituto", namespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nifSustituto;

    /**
     * Obtiene el valor de la propiedad codigoOrganicoExterno.
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
     * Define el valor de la propiedad codigoOrganicoExterno.
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
     * Obtiene el valor de la propiedad codigoOrganicoInterno.
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
     * Define el valor de la propiedad codigoOrganicoInterno.
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
     * Obtiene el valor de la propiedad nombreUnidadCas.
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
     * Define el valor de la propiedad nombreUnidadCas.
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
     * Obtiene el valor de la propiedad nombreUnidadVal.
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
     * Define el valor de la propiedad nombreUnidadVal.
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
     * Obtiene el valor de la propiedad emisoraNI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmisoraNI() {
        return emisoraNI;
    }

    /**
     * Define el valor de la propiedad emisoraNI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmisoraNI(Boolean value) {
        this.emisoraNI = value;
    }

    /**
     * Obtiene el valor de la propiedad receptoraNI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceptoraNI() {
        return receptoraNI;
    }

    /**
     * Define el valor de la propiedad receptoraNI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceptoraNI(Boolean value) {
        this.receptoraNI = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNivel.
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
     * Define el valor de la propiedad primerNivel.
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
     * Obtiene el valor de la propiedad vigente.
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
     * Define el valor de la propiedad vigente.
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
     * Obtiene el valor de la propiedad uidPadre.
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
     * Define el valor de la propiedad uidPadre.
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
     * Obtiene el valor de la propiedad nifResponsable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifResponsable() {
        return nifResponsable;
    }

    /**
     * Define el valor de la propiedad nifResponsable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifResponsable(JAXBElement<String> value) {
        this.nifResponsable = value;
    }

    /**
     * Obtiene el valor de la propiedad nifSustituto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNifSustituto() {
        return nifSustituto;
    }

    /**
     * Define el valor de la propiedad nifSustituto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNifSustituto(JAXBElement<String> value) {
        this.nifSustituto = value;
    }

}
