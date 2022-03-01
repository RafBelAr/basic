
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemoveAdjuntoResponseType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemoveAdjuntoResponseType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}ComunicacionResponseType_v1.2">
 *       &lt;sequence>
 *         &lt;element name="IdUCMAdjuntoEliminado" type="{http://www.valencia.es/schema/tiposbase}IdUCMType_v1.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAdjuntoResponseType_v1.2", propOrder = {
    "idUCMAdjuntoEliminado"
})
public class RemoveAdjuntoResponseTypeV12
    extends ComunicacionResponseTypeV12
{

    @XmlElement(name = "IdUCMAdjuntoEliminado")
    protected String idUCMAdjuntoEliminado;

    /**
     * Obtiene el valor de la propiedad idUCMAdjuntoEliminado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUCMAdjuntoEliminado() {
        return idUCMAdjuntoEliminado;
    }

    /**
     * Define el valor de la propiedad idUCMAdjuntoEliminado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUCMAdjuntoEliminado(String value) {
        this.idUCMAdjuntoEliminado = value;
    }

}
