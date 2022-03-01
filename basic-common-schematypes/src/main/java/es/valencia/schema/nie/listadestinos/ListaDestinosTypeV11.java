
package es.valencia.schema.nie.listadestinos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListaDestinosType_v1.1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ListaDestinosType_v1.1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/ListaDestinos}ListaDestinosBaseType_v1.1">
 *       &lt;sequence>
 *         &lt;element name="Unidades" type="{http://www.valencia.es/schema/nie/ListaDestinos}UnidadesType_v1.1"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDestinosType_v1.1", propOrder = {
    "unidades"
})
public class ListaDestinosTypeV11
    extends ListaDestinosBaseTypeV11
{

    @XmlElement(name = "Unidades", required = true)
    protected UnidadesTypeV11 unidades;

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     * @return
     *     possible object is
     *     {@link UnidadesTypeV11 }
     *     
     */
    public UnidadesTypeV11 getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadesTypeV11 }
     *     
     */
    public void setUnidades(UnidadesTypeV11 value) {
        this.unidades = value;
    }

}
