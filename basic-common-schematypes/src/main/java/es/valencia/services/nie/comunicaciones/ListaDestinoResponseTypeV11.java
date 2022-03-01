
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.listadestinos.ListaDestinosTypeV11;


/**
 * <p>Clase Java para ListaDestinoResponseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaDestinoResponseType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="ListaDestino" type="{http://www.valencia.es/schema/nie/ListaDestinos}ListaDestinosType_v1.1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDestinoResponseType_v1.1", propOrder = {
    "listaDestino"
})
public class ListaDestinoResponseTypeV11
    extends ResponseMessageBaseTypeV10
{

    @XmlElement(name = "ListaDestino", required = true)
    protected ListaDestinosTypeV11 listaDestino;

    /**
     * Obtiene el valor de la propiedad listaDestino.
     * 
     * @return
     *     possible object is
     *     {@link ListaDestinosTypeV11 }
     *     
     */
    public ListaDestinosTypeV11 getListaDestino() {
        return listaDestino;
    }

    /**
     * Define el valor de la propiedad listaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDestinosTypeV11 }
     *     
     */
    public void setListaDestino(ListaDestinosTypeV11 value) {
        this.listaDestino = value;
    }

}
