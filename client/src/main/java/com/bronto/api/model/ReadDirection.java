
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="readDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEXT"/>
 *     &lt;enumeration value="FIRST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "readDirection")
@XmlEnum
public enum ReadDirection {

    NEXT,
    FIRST;

    public String value() {
        return name();
    }

    public static ReadDirection fromValue(String v) {
        return valueOf(v);
    }

}
