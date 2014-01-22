
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readDeliveryGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readDeliveryGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}deliveryGroupFilter" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readDeliveryGroups", propOrder = {
    "filter",
    "pageNumber"
})
public class ReadDeliveryGroups {

    protected DeliveryGroupFilter filter;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryGroupFilter }
     *     
     */
    public DeliveryGroupFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryGroupFilter }
     *     
     */
    public void setFilter(DeliveryGroupFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
