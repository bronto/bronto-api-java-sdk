
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="filterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "filterType")
@XmlEnum
public enum FilterType {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static FilterType fromValue(String v) {
        return valueOf(v);
    }

}
