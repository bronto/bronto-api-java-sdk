
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readDeliveryRecipients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readDeliveryRecipients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}deliveryRecipientFilter" minOccurs="0"/>
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
@XmlType(name = "readDeliveryRecipients", propOrder = {
    "filter",
    "pageNumber"
})
public class ReadDeliveryRecipients {

    protected DeliveryRecipientFilter filter;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRecipientFilter }
     *     
     */
    public DeliveryRecipientFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRecipientFilter }
     *     
     */
    public void setFilter(DeliveryRecipientFilter value) {
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
