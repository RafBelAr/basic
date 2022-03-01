
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import es.valencia.schema.nie.listadestinos.ListaDestinosTypeV11;


/**
 * <p>Clase Java para UpdateMiembrosListaDestinoResponseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UpdateMiembrosListaDestinoResponseType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DetalleLista" type="{http://www.valencia.es/schema/nie/ListaDestinos}ListaDestinosType_v1.1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateMiembrosListaDestinoResponseType_v1.1", propOrder = {
    "fechaModificacion",
    "detalleLista"
})
public class UpdateMiembrosListaDestinoResponseTypeV11
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "FechaModificacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaModificacion;
    @XmlElement(name = "DetalleLista")
    protected ListaDestinosTypeV11 detalleLista;

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
     * Obtiene el valor de la propiedad detalleLista.
     * 
     * @return
     *     possible object is
     *     {@link ListaDestinosTypeV11 }
     *     
     */
    public ListaDestinosTypeV11 getDetalleLista() {
        return detalleLista;
    }

    /**
     * Define el valor de la propiedad detalleLista.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDestinosTypeV11 }
     *     
     */
    public void setDetalleLista(ListaDestinosTypeV11 value) {
        this.detalleLista = value;
    }

}
