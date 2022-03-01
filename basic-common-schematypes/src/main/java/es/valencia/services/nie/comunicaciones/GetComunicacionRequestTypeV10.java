
package es.valencia.services.nie.comunicaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetComunicacionRequestType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetComunicacionRequestType_v1.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/services/nie/Comunicaciones}CodigoComunicacionRequestType_v1.0">
 *       &lt;sequence>
 *         &lt;element name="GetHitos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GetAdjuntos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GetNIs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GetDestinos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetComunicacionRequestType_v1.0", propOrder = {
    "getHitos",
    "getAdjuntos",
    "getNIs",
    "getDestinos"
})
public class GetComunicacionRequestTypeV10
    extends CodigoComunicacionRequestTypeV10
{

    @XmlElement(name = "GetHitos")
    protected boolean getHitos;
    @XmlElement(name = "GetAdjuntos")
    protected boolean getAdjuntos;
    @XmlElement(name = "GetNIs")
    protected boolean getNIs;
    @XmlElement(name = "GetDestinos")
    protected boolean getDestinos;

    /**
     * Obtiene el valor de la propiedad getHitos.
     * 
     */
    public boolean isGetHitos() {
        return getHitos;
    }

    /**
     * Define el valor de la propiedad getHitos.
     * 
     */
    public void setGetHitos(boolean value) {
        this.getHitos = value;
    }

    /**
     * Obtiene el valor de la propiedad getAdjuntos.
     * 
     */
    public boolean isGetAdjuntos() {
        return getAdjuntos;
    }

    /**
     * Define el valor de la propiedad getAdjuntos.
     * 
     */
    public void setGetAdjuntos(boolean value) {
        this.getAdjuntos = value;
    }

    /**
     * Obtiene el valor de la propiedad getNIs.
     * 
     */
    public boolean isGetNIs() {
        return getNIs;
    }

    /**
     * Define el valor de la propiedad getNIs.
     * 
     */
    public void setGetNIs(boolean value) {
        this.getNIs = value;
    }

    /**
     * Obtiene el valor de la propiedad getDestinos.
     * 
     */
    public boolean isGetDestinos() {
        return getDestinos;
    }

    /**
     * Define el valor de la propiedad getDestinos.
     * 
     */
    public void setGetDestinos(boolean value) {
        this.getDestinos = value;
    }

}
