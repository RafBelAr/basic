
package es.valencia.schema.nie.unidadorganizativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.EntidadBaseTypeV10;
import es.valencia.schema.nie.common.ResponsableTypeV10;


/**
 * <p>Clase Java para UnidadOrganizativaType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadOrganizativaType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Common}EntidadBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="Uid" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0"/>
 *         &lt;element name="CodigoBDO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="CodigoInvariable" type="{http://www.valencia.es/schema/nie/Common}CodInvariableType_v1.0"/>
 *           &lt;element name="CodigoOrganicoExterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *           &lt;element name="CodigoOrganicoInterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0"/>
 *         &lt;/sequence>
 *         &lt;element name="NombreUnidadCas" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0"/>
 *         &lt;element name="NombreUnidadVal" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="EmisoraNI" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}CapacidadUOType_v1.0"/>
 *         &lt;element name="ReceptoraNI" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}CapacidadUOType_v1.0"/>
 *         &lt;element name="PrimerNivel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Vigente" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UidPadre" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="Responsable" type="{http://www.valencia.es/schema/nie/Common}ResponsableType_v1.0" minOccurs="0"/>
 *         &lt;element name="Sustituto" type="{http://www.valencia.es/schema/nie/Common}ResponsableType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadOrganizativaType_v1.2", propOrder = {
    "uid",
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
    "sustituto"
})
public class UnidadOrganizativaTypeV12
    extends EntidadBaseTypeV10
{

    @XmlElement(name = "Uid", required = true)
    protected String uid;
    @XmlElement(name = "CodigoBDO")
    protected long codigoBDO;
    @XmlElement(name = "CodigoInvariable")
    protected String codigoInvariable;
    @XmlElement(name = "CodigoOrganicoExterno")
    protected String codigoOrganicoExterno;
    @XmlElement(name = "CodigoOrganicoInterno")
    protected String codigoOrganicoInterno;
    @XmlElement(name = "NombreUnidadCas", required = true)
    protected String nombreUnidadCas;
    @XmlElement(name = "NombreUnidadVal")
    protected String nombreUnidadVal;
    @XmlElement(name = "EmisoraNI", required = true)
    protected CapacidadUOTypeV10 emisoraNI;
    @XmlElement(name = "ReceptoraNI", required = true)
    protected CapacidadUOTypeV10 receptoraNI;
    @XmlElement(name = "PrimerNivel")
    protected boolean primerNivel;
    @XmlElement(name = "Vigente")
    protected boolean vigente;
    @XmlElement(name = "UidPadre")
    protected String uidPadre;
    @XmlElement(name = "Responsable")
    protected ResponsableTypeV10 responsable;
    @XmlElement(name = "Sustituto")
    protected ResponsableTypeV10 sustituto;

    /**
     * Obtiene el valor de la propiedad uid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Define el valor de la propiedad uid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBDO.
     * 
     */
    public long getCodigoBDO() {
        return codigoBDO;
    }

    /**
     * Define el valor de la propiedad codigoBDO.
     * 
     */
    public void setCodigoBDO(long value) {
        this.codigoBDO = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInvariable.
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
     * Define el valor de la propiedad codigoInvariable.
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
     *     {@link CapacidadUOTypeV10 }
     *     
     */
    public CapacidadUOTypeV10 getEmisoraNI() {
        return emisoraNI;
    }

    /**
     * Define el valor de la propiedad emisoraNI.
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
     * Obtiene el valor de la propiedad receptoraNI.
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
     * Define el valor de la propiedad receptoraNI.
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
     * Obtiene el valor de la propiedad primerNivel.
     * 
     */
    public boolean isPrimerNivel() {
        return primerNivel;
    }

    /**
     * Define el valor de la propiedad primerNivel.
     * 
     */
    public void setPrimerNivel(boolean value) {
        this.primerNivel = value;
    }

    /**
     * Obtiene el valor de la propiedad vigente.
     * 
     */
    public boolean isVigente() {
        return vigente;
    }

    /**
     * Define el valor de la propiedad vigente.
     * 
     */
    public void setVigente(boolean value) {
        this.vigente = value;
    }

    /**
     * Obtiene el valor de la propiedad uidPadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidPadre() {
        return uidPadre;
    }

    /**
     * Define el valor de la propiedad uidPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidPadre(String value) {
        this.uidPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad responsable.
     * 
     * @return
     *     possible object is
     *     {@link ResponsableTypeV10 }
     *     
     */
    public ResponsableTypeV10 getResponsable() {
        return responsable;
    }

    /**
     * Define el valor de la propiedad responsable.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsableTypeV10 }
     *     
     */
    public void setResponsable(ResponsableTypeV10 value) {
        this.responsable = value;
    }

    /**
     * Obtiene el valor de la propiedad sustituto.
     * 
     * @return
     *     possible object is
     *     {@link ResponsableTypeV10 }
     *     
     */
    public ResponsableTypeV10 getSustituto() {
        return sustituto;
    }

    /**
     * Define el valor de la propiedad sustituto.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsableTypeV10 }
     *     
     */
    public void setSustituto(ResponsableTypeV10 value) {
        this.sustituto = value;
    }

}
