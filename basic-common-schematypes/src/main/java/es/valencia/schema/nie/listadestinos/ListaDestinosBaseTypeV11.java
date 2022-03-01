
package es.valencia.schema.nie.listadestinos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.common.EntidadBaseTypeV10;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV12;


/**
 * <p>Clase Java para ListaDestinosBaseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaDestinosBaseType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Common}EntidadBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UnidadPropietaria" type="{http://www.valencia.es/schema/nie/UnidadOrganizativa}UnidadOrganizativaType_v1.2" minOccurs="0"/>
 *         &lt;element name="NombreListaCas" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *         &lt;element name="NombreListaVal" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *         &lt;element name="Descripcion" type="{http://www.valencia.es/schema/nie/Common}AsuntoType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDestinosBaseType_v1.1", propOrder = {
    "unidadPropietaria",
    "nombreListaCas",
    "nombreListaVal",
    "descripcion"
})
@XmlSeeAlso({
    ListaDestinosTypeV11 .class
})
public class ListaDestinosBaseTypeV11
    extends EntidadBaseTypeV10
{

    @XmlElement(name = "UnidadPropietaria")
    protected UnidadOrganizativaTypeV12 unidadPropietaria;
    @XmlElement(name = "NombreListaCas", required = true)
    protected String nombreListaCas;
    @XmlElement(name = "NombreListaVal", required = true)
    protected String nombreListaVal;
    @XmlElement(name = "Descripcion")
    protected String descripcion;

    /**
     * Obtiene el valor de la propiedad unidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link UnidadOrganizativaTypeV12 }
     *     
     */
    public UnidadOrganizativaTypeV12 getUnidadPropietaria() {
        return unidadPropietaria;
    }

    /**
     * Define el valor de la propiedad unidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadOrganizativaTypeV12 }
     *     
     */
    public void setUnidadPropietaria(UnidadOrganizativaTypeV12 value) {
        this.unidadPropietaria = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreListaCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreListaCas() {
        return nombreListaCas;
    }

    /**
     * Define el valor de la propiedad nombreListaCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreListaCas(String value) {
        this.nombreListaCas = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreListaVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreListaVal() {
        return nombreListaVal;
    }

    /**
     * Define el valor de la propiedad nombreListaVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreListaVal(String value) {
        this.nombreListaVal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
