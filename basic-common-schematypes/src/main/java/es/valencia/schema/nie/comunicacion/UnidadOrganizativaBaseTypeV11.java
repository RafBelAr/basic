
package es.valencia.schema.nie.comunicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnidadOrganizativaBaseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadOrganizativaBaseType_v1.1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreCas" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0"/>
 *         &lt;element name="NombreVal" type="{http://www.valencia.es/schema/nie/Common}NombreUnidadType_v1.0"/>
 *         &lt;element name="Responsable" type="{http://www.valencia.es/schema/nie/Comunicacion}ResponsableType_v1.0" minOccurs="0"/>
 *         &lt;element name="CodigoBDO" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CodigoInvariable" type="{http://www.valencia.es/schema/nie/Common}CodInvariableType_v1.0" minOccurs="0"/>
 *         &lt;element name="CodigoOrganicoExterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0" minOccurs="0"/>
 *         &lt;element name="CodigoOrganicoInterno" type="{http://www.valencia.es/schema/nie/Common}CodOrganicoType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadOrganizativaBaseType_v1.1", propOrder = {
    "nombreCas",
    "nombreVal",
    "responsable",
    "codigoBDO",
    "codigoInvariable",
    "codigoOrganicoExterno",
    "codigoOrganicoInterno"
})
public class UnidadOrganizativaBaseTypeV11 {

    @XmlElement(name = "NombreCas", required = true)
    protected String nombreCas;
    @XmlElement(name = "NombreVal", required = true)
    protected String nombreVal;
    @XmlElement(name = "Responsable")
    protected ResponsableTypeV10 responsable;
    @XmlElement(name = "CodigoBDO")
    protected long codigoBDO;
    @XmlElement(name = "CodigoInvariable")
    protected String codigoInvariable;
    @XmlElement(name = "CodigoOrganicoExterno")
    protected String codigoOrganicoExterno;
    @XmlElement(name = "CodigoOrganicoInterno")
    protected String codigoOrganicoInterno;

    /**
     * Obtiene el valor de la propiedad nombreCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCas() {
        return nombreCas;
    }

    /**
     * Define el valor de la propiedad nombreCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCas(String value) {
        this.nombreCas = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreVal() {
        return nombreVal;
    }

    /**
     * Define el valor de la propiedad nombreVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreVal(String value) {
        this.nombreVal = value;
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

}
