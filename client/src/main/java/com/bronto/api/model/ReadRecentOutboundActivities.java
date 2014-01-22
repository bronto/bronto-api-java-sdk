
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readRecentOutboundActivities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readRecentOutboundActivities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}recentOutboundActivitySearchRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRecentOutboundActivities", propOrder = {
    "filter"
})
public class ReadRecentOutboundActivities {

    protected RecentOutboundActivitySearchRequest filter;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link RecentOutboundActivitySearchRequest }
     *     
     */
    public RecentOutboundActivitySearchRequest getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecentOutboundActivitySearchRequest }
     *     
     */
    public void setFilter(RecentOutboundActivitySearchRequest value) {
        this.filter = value;
    }

}
