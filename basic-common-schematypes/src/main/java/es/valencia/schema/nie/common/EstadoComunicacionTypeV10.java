
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoComunicacionType_v1.0.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoComunicacionType_v1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="En Redaccion"/>
 *     &lt;enumeration value="Redactada"/>
 *     &lt;enumeration value="Pendiente de Firma"/>
 *     &lt;enumeration value="Firmada"/>
 *     &lt;enumeration value="Fallo de Firma"/>
 *     &lt;enumeration value="Cancelada"/>
 *     &lt;enumeration value="Rechazada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoComunicacionType_v1.0")
@XmlEnum
public enum EstadoComunicacionTypeV10 {

    @XmlEnumValue("En Redaccion")
    EN_REDACCION("En Redaccion"),
    @XmlEnumValue("Redactada")
    REDACTADA("Redactada"),
    @XmlEnumValue("Pendiente de Firma")
    PENDIENTE_DE_FIRMA("Pendiente de Firma"),
    @XmlEnumValue("Firmada")
    FIRMADA("Firmada"),
    @XmlEnumValue("Fallo de Firma")
    FALLO_DE_FIRMA("Fallo de Firma"),
    @XmlEnumValue("Cancelada")
    CANCELADA("Cancelada"),
    @XmlEnumValue("Rechazada")
    RECHAZADA("Rechazada");
    private final String value;

    EstadoComunicacionTypeV10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoComunicacionTypeV10 fromValue(String v) {
        for (EstadoComunicacionTypeV10 c: EstadoComunicacionTypeV10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
