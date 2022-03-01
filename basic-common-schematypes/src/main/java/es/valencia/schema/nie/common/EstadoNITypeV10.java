
package es.valencia.schema.nie.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoNIType_v1.0.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoNIType_v1.0">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Destino Validado"/>
 *     &lt;enumeration value="Pendiente de Recepcion"/>
 *     &lt;enumeration value="Entregada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoNIType_v1.0")
@XmlEnum
public enum EstadoNITypeV10 {

    @XmlEnumValue("Destino Validado")
    DESTINO_VALIDADO("Destino Validado"),
    @XmlEnumValue("Pendiente de Recepcion")
    PENDIENTE_DE_RECEPCION("Pendiente de Recepcion"),
    @XmlEnumValue("Entregada")
    ENTREGADA("Entregada");
    private final String value;

    EstadoNITypeV10(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoNITypeV10 fromValue(String v) {
        for (EstadoNITypeV10 c: EstadoNITypeV10 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
