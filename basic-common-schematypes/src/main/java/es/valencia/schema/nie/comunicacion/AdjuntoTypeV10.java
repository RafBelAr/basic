
package es.valencia.schema.nie.comunicacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjuntoType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjuntoType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nombre" type="{http://www.valencia.es/schema/nie/Common}NombreAdjuntoType_v1.0"/>
 *         &lt;element name="Tipo" type="{http://www.valencia.es/schema/nie/Common}TipoAdjuntoType_v1.0"/>
 *         &lt;element name="ReferenciaCM" type="{http://www.valencia.es/schema/tiposbase}IdUCMType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjuntoType_v1.0", propOrder = {
    "nombre",
    "tipo",
    "referenciaCM"
})
public class AdjuntoTypeV10 {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "ReferenciaCM", required = true)
    protected String referenciaCM;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaCM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCM() {
        return referenciaCM;
    }

    /**
     * Define el valor de la propiedad referenciaCM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCM(String value) {
        this.referenciaCM = value;
    }

}
