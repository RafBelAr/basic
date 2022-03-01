
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV12;
import es.valencia.schema.nie.unidadorganizativa.UnidadOrganizativaTypeV20;


/**
 * <p>Clase Java para EntidadBaseType_v1.0 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntidadBaseType_v1.0">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.valencia.es/schema/SerTICEntidadBase}EntidadBaseType_v1.0">
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="occ-version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntidadBaseType_v1.0")
@XmlSeeAlso({
    UnidadOrganizativaTypeV20 .class,
    UnidadOrganizativaTypeV12 .class
})
public class EntidadBaseTypeV10 {

    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "occ-version", required = true)
    protected int occVersion;

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad occVersion.
     * 
     */
    public int getOccVersion() {
        return occVersion;
    }

    /**
     * Define el valor de la propiedad occVersion.
     * 
     */
    public void setOccVersion(int value) {
        this.occVersion = value;
    }

}
