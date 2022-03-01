
package es.valencia.schema.niedomain.unidadorganizativa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadOrganizativaType_v2.0 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadOrganizativaType_v2.0">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.valencia.es/schema/nie/UnidadOrganizativa}UnidadOrganizativaType_v2.0">
 *       &lt;sequence>
 *         &lt;element name="Gestores" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}GestoresType_v2.0"/>
 *         &lt;element name="Redactores" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}RedactoresType_v2.0"/>
 *         &lt;element name="CandidatosAGestor" type="{http://www.valencia.es/schema/nieDomain/UnidadOrganizativa}RedactoresType_v2.0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadOrganizativaType_v2.0", propOrder = {
    "gestores",
    "redactores",
    "candidatosAGestor"
})
public class UnidadOrganizativaTypeV20
    extends es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV20
{

    @XmlElement(name = "Gestores", required = true)
    protected GestoresTypeV20 gestores;
    @XmlElement(name = "Redactores", required = true)
    protected RedactoresTypeV20 redactores;
    @XmlElement(name = "CandidatosAGestor")
    protected RedactoresTypeV20 candidatosAGestor;

    /**
     * Gets the value of the gestores property.
     * 
     * @return
     *     possible object is
     *     {@link GestoresTypeV20 }
     *     
     */
    public GestoresTypeV20 getGestores() {
        return gestores;
    }

    /**
     * Sets the value of the gestores property.
     * 
     * @param value
     *     allowed object is
     *     {@link GestoresTypeV20 }
     *     
     */
    public void setGestores(GestoresTypeV20 value) {
        this.gestores = value;
    }

    /**
     * Gets the value of the redactores property.
     * 
     * @return
     *     possible object is
     *     {@link RedactoresTypeV20 }
     *     
     */
    public RedactoresTypeV20 getRedactores() {
        return redactores;
    }

    /**
     * Sets the value of the redactores property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedactoresTypeV20 }
     *     
     */
    public void setRedactores(RedactoresTypeV20 value) {
        this.redactores = value;
    }

    /**
     * Gets the value of the candidatosAGestor property.
     * 
     * @return
     *     possible object is
     *     {@link RedactoresTypeV20 }
     *     
     */
    public RedactoresTypeV20 getCandidatosAGestor() {
        return candidatosAGestor;
    }

    /**
     * Sets the value of the candidatosAGestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedactoresTypeV20 }
     *     
     */
    public void setCandidatosAGestor(RedactoresTypeV20 value) {
        this.candidatosAGestor = value;
    }

}
