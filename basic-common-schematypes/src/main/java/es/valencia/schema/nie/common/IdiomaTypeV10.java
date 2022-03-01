
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IdiomaType_v1.0.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="IdiomaType_v1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Castellano"/>
 *     &lt;enumeration value="Valenciano"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdiomaType_v1.0")
@XmlEnum
public enum IdiomaTypeV10 {

    @XmlEnumValue("Castellano")
    CASTELLANO("Castellano"),
    @XmlEnumValue("Valenciano")
    VALENCIANO("Valenciano");
    private final String value;

    IdiomaTypeV10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdiomaTypeV10 fromValue(String v) {
        for (IdiomaTypeV10 c: IdiomaTypeV10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
