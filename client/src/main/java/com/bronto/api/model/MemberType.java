
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memberType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="memberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELIVERIES"/>
 *     &lt;enumeration value="AUTOMATORS"/>
 *     &lt;enumeration value="MESSAGEGROUPS"/>
 *     &lt;enumeration value="DELIVERYGROUPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "memberType")
@XmlEnum
public enum MemberType {

    DELIVERIES,
    AUTOMATORS,
    MESSAGEGROUPS,
    DELIVERYGROUPS;

    public String value() {
        return name();
    }

    public static MemberType fromValue(String v) {
        return valueOf(v);
    }

}
