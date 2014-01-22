
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filterOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="filterOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EqualTo"/>
 *     &lt;enumeration value="NotEqualTo"/>
 *     &lt;enumeration value="StartsWith"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="DoesNotStartWith"/>
 *     &lt;enumeration value="DoesNotEndWith"/>
 *     &lt;enumeration value="GreaterThan"/>
 *     &lt;enumeration value="LessThan"/>
 *     &lt;enumeration value="GreaterThanEqualTo"/>
 *     &lt;enumeration value="LessThanEqualTo"/>
 *     &lt;enumeration value="Contains"/>
 *     &lt;enumeration value="DoesNotContain"/>
 *     &lt;enumeration value="SameYear"/>
 *     &lt;enumeration value="NotSameYear"/>
 *     &lt;enumeration value="SameDay"/>
 *     &lt;enumeration value="NotSameDay"/>
 *     &lt;enumeration value="Before"/>
 *     &lt;enumeration value="After"/>
 *     &lt;enumeration value="BeforeOrSameDay"/>
 *     &lt;enumeration value="AfterOrSameDay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "filterOperator")
@XmlEnum
public enum FilterOperator {

    @XmlEnumValue("EqualTo")
    EQUAL_TO("EqualTo"),
    @XmlEnumValue("NotEqualTo")
    NOT_EQUAL_TO("NotEqualTo"),
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("DoesNotStartWith")
    DOES_NOT_START_WITH("DoesNotStartWith"),
    @XmlEnumValue("DoesNotEndWith")
    DOES_NOT_END_WITH("DoesNotEndWith"),
    @XmlEnumValue("GreaterThan")
    GREATER_THAN("GreaterThan"),
    @XmlEnumValue("LessThan")
    LESS_THAN("LessThan"),
    @XmlEnumValue("GreaterThanEqualTo")
    GREATER_THAN_EQUAL_TO("GreaterThanEqualTo"),
    @XmlEnumValue("LessThanEqualTo")
    LESS_THAN_EQUAL_TO("LessThanEqualTo"),
    @XmlEnumValue("Contains")
    CONTAINS("Contains"),
    @XmlEnumValue("DoesNotContain")
    DOES_NOT_CONTAIN("DoesNotContain"),
    @XmlEnumValue("SameYear")
    SAME_YEAR("SameYear"),
    @XmlEnumValue("NotSameYear")
    NOT_SAME_YEAR("NotSameYear"),
    @XmlEnumValue("SameDay")
    SAME_DAY("SameDay"),
    @XmlEnumValue("NotSameDay")
    NOT_SAME_DAY("NotSameDay"),
    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("After")
    AFTER("After"),
    @XmlEnumValue("BeforeOrSameDay")
    BEFORE_OR_SAME_DAY("BeforeOrSameDay"),
    @XmlEnumValue("AfterOrSameDay")
    AFTER_OR_SAME_DAY("AfterOrSameDay");
    private final String value;

    FilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterOperator fromValue(String v) {
        for (FilterOperator c: FilterOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
