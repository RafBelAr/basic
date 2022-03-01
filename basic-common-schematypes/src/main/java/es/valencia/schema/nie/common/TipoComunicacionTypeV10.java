
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoComunicacionType_v1.0.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoComunicacionType_v1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Electrónica"/>
 *     &lt;enumeration value="Manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoComunicacionType_v1.0")
@XmlEnum
public enum TipoComunicacionTypeV10 {

    @XmlEnumValue("Electr\u00f3nica")
    ELECTRÓNICA("Electr\u00f3nica"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    TipoComunicacionTypeV10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoComunicacionTypeV10 fromValue(String v) {
        for (TipoComunicacionTypeV10 c: TipoComunicacionTypeV10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
