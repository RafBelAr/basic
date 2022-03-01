
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FindListasDestinoResponseType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FindListasDestinoResponseType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}FindResponseMessageBaseType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="ListaListasDestinos" type="{http://www.valencia.es/services/nie/Comunicaciones}ListaListasDestinosType_v1.1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindListasDestinoResponseType_v1.1", propOrder = {
    "listaListasDestinos"
})
public class FindListasDestinoResponseTypeV11
    extends FindResponseMessageBaseTypeV10
{

    @XmlElement(name = "ListaListasDestinos", required = true)
    protected ListaListasDestinosTypeV11 listaListasDestinos;

    /**
     * Obtiene el valor de la propiedad listaListasDestinos.
     * 
     * @return
     *     possible object is
     *     {@link ListaListasDestinosTypeV11 }
     *     
     */
    public ListaListasDestinosTypeV11 getListaListasDestinos() {
        return listaListasDestinos;
    }

    /**
     * Define el valor de la propiedad listaListasDestinos.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaListasDestinosTypeV11 }
     *     
     */
    public void setListaListasDestinos(ListaListasDestinosTypeV11 value) {
        this.listaListasDestinos = value;
    }

}
