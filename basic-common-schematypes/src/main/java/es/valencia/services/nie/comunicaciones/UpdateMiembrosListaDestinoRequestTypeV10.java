
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UpdateMiembrosListaDestinoRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateMiembrosListaDestinoRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}RequestMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="UidUnidadPropietaria" type="{http://www.valencia.es/schema/nie/Common}UidUnidadType_v1.0" minOccurs="0"/>
 *         &lt;element name="NombreListaCas" type="{http://www.valencia.es/schema/nie/Common}NombreListaDestinoType_v1.0"/>
 *         &lt;element name="deleteMiembros" type="{http://www.valencia.es/services/nie/Comunicaciones}UidsUnidadesType_v1.0" minOccurs="0"/>
 *         &lt;element name="addMiembros" type="{http://www.valencia.es/services/nie/Comunicaciones}UidsUnidadesType_v1.0" minOccurs="0"/>
 *         &lt;element name="IncluirDetalleEnRespuesta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMiembrosListaDestinoRequestType_v1.0", propOrder = {
    "uidUnidadPropietaria",
    "nombreListaCas",
    "deleteMiembros",
    "addMiembros",
    "incluirDetalleEnRespuesta"
})
public class UpdateMiembrosListaDestinoRequestTypeV10
    extends RequestMessageBaseTypeV10
{

    @XmlElement(name = "UidUnidadPropietaria")
    protected String uidUnidadPropietaria;
    @XmlElement(name = "NombreListaCas", required = true)
    protected String nombreListaCas;
    protected UidsUnidadesTypeV10 deleteMiembros;
    protected UidsUnidadesTypeV10 addMiembros;
    @XmlElement(name = "IncluirDetalleEnRespuesta", defaultValue = "false")
    protected boolean incluirDetalleEnRespuesta;

    /**
     * Obtiene el valor de la propiedad uidUnidadPropietaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUidUnidadPropietaria() {
        return uidUnidadPropietaria;
    }

    /**
     * Define el valor de la propiedad uidUnidadPropietaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUidUnidadPropietaria(String value) {
        this.uidUnidadPropietaria = value;
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
     * Obtiene el valor de la propiedad deleteMiembros.
     * 
     * @return
     *     possible object is
     *     {@link UidsUnidadesTypeV10 }
     *     
     */
    public UidsUnidadesTypeV10 getDeleteMiembros() {
        return deleteMiembros;
    }

    /**
     * Define el valor de la propiedad deleteMiembros.
     * 
     * @param value
     *     allowed object is
     *     {@link UidsUnidadesTypeV10 }
     *     
     */
    public void setDeleteMiembros(UidsUnidadesTypeV10 value) {
        this.deleteMiembros = value;
    }

    /**
     * Obtiene el valor de la propiedad addMiembros.
     * 
     * @return
     *     possible object is
     *     {@link UidsUnidadesTypeV10 }
     *     
     */
    public UidsUnidadesTypeV10 getAddMiembros() {
        return addMiembros;
    }

    /**
     * Define el valor de la propiedad addMiembros.
     * 
     * @param value
     *     allowed object is
     *     {@link UidsUnidadesTypeV10 }
     *     
     */
    public void setAddMiembros(UidsUnidadesTypeV10 value) {
        this.addMiembros = value;
    }

    /**
     * Obtiene el valor de la propiedad incluirDetalleEnRespuesta.
     * 
     */
    public boolean isIncluirDetalleEnRespuesta() {
        return incluirDetalleEnRespuesta;
    }

    /**
     * Define el valor de la propiedad incluirDetalleEnRespuesta.
     * 
     */
    public void setIncluirDetalleEnRespuesta(boolean value) {
        this.incluirDetalleEnRespuesta = value;
    }

}
