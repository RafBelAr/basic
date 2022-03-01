
package es.valencia.schema.nie.comunicacion;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ComunicacionType_v1.2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ComunicacionType_v1.2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/Comunicacion}ComunicacionBaseType_v1.1">
 *       &lt;sequence>
 *         &lt;element name="Texto" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Adjuntos" type="{http://www.valencia.es/schema/nie/Comunicacion}AdjuntosType_v1.0"/>
 *         &lt;element name="NotasInteriores" type="{http://www.valencia.es/schema/nie/Comunicacion}NotasInterioresType_v1.2"/>
 *         &lt;element name="Hitos" type="{http://www.valencia.es/schema/nie/Comunicacion}HitosType_v1.0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComunicacionType_v1.2", propOrder = {
    "texto",
    "adjuntos",
    "notasInteriores",
    "hitos"
})
public class ComunicacionTypeV12
    extends ComunicacionBaseTypeV11
{

    @XmlElement(name = "Texto")
    @XmlMimeType("application/octet-stream")
    protected DataHandler texto;
    @XmlElement(name = "Adjuntos", required = true)
    protected AdjuntosTypeV10 adjuntos;
    @XmlElement(name = "NotasInteriores", required = true)
    protected NotasInterioresTypeV12 notasInteriores;
    @XmlElement(name = "Hitos", required = true)
    protected HitosTypeV10 hitos;

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setTexto(DataHandler value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad adjuntos.
     * 
     * @return
     *     possible object is
     *     {@link AdjuntosTypeV10 }
     *     
     */
    public AdjuntosTypeV10 getAdjuntos() {
        return adjuntos;
    }

    /**
     * Define el valor de la propiedad adjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjuntosTypeV10 }
     *     
     */
    public void setAdjuntos(AdjuntosTypeV10 value) {
        this.adjuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad notasInteriores.
     * 
     * @return
     *     possible object is
     *     {@link NotasInterioresTypeV12 }
     *     
     */
    public NotasInterioresTypeV12 getNotasInteriores() {
        return notasInteriores;
    }

    /**
     * Define el valor de la propiedad notasInteriores.
     * 
     * @param value
     *     allowed object is
     *     {@link NotasInterioresTypeV12 }
     *     
     */
    public void setNotasInteriores(NotasInterioresTypeV12 value) {
        this.notasInteriores = value;
    }

    /**
     * Obtiene el valor de la propiedad hitos.
     * 
     * @return
     *     possible object is
     *     {@link HitosTypeV10 }
     *     
     */
    public HitosTypeV10 getHitos() {
        return hitos;
    }

    /**
     * Define el valor de la propiedad hitos.
     * 
     * @param value
     *     allowed object is
     *     {@link HitosTypeV10 }
     *     
     */
    public void setHitos(HitosTypeV10 value) {
        this.hitos = value;
    }

}
