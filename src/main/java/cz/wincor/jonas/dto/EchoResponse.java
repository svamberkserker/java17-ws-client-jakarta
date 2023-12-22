
package cz.wincor.jonas.dto;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EchoResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EchoResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="DB_CONNECT_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EchoResponse", namespace = "dto.jonas.wincor.cz")
@XmlEnum
public enum EchoResponse {

    OK,
    DB_CONNECT_FAILED;

    public String value() {
        return name();
    }

    public static EchoResponse fromValue(String v) {
        return valueOf(v);
    }

}
