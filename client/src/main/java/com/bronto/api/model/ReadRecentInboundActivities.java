
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readRecentInboundActivities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readRecentInboundActivities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}recentInboundActivitySearchRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readRecentInboundActivities", propOrder = {
    "filter"
})
public class ReadRecentInboundActivities {

    protected RecentInboundActivitySearchRequest filter;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link RecentInboundActivitySearchRequest }
     *     
     */
    public RecentInboundActivitySearchRequest getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecentInboundActivitySearchRequest }
     *     
     */
    public void setFilter(RecentInboundActivitySearchRequest value) {
        this.filter = value;
    }

}
