
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readDeliveries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readDeliveries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}deliveryFilter" minOccurs="0"/>
 *         &lt;element name="includeRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeOrderIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readDeliveries", propOrder = {
    "filter",
    "includeRecipients",
    "includeContent",
    "pageNumber",
    "includeOrderIds"
})
public class ReadDeliveries {

    protected DeliveryFilter filter;
    protected boolean includeRecipients;
    protected boolean includeContent;
    protected int pageNumber;
    protected Boolean includeOrderIds;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryFilter }
     *     
     */
    public DeliveryFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryFilter }
     *     
     */
    public void setFilter(DeliveryFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the includeRecipients property.
     * 
     */
    public boolean isIncludeRecipients() {
        return includeRecipients;
    }

    /**
     * Sets the value of the includeRecipients property.
     * 
     */
    public void setIncludeRecipients(boolean value) {
        this.includeRecipients = value;
    }

    /**
     * Gets the value of the includeContent property.
     * 
     */
    public boolean isIncludeContent() {
        return includeContent;
    }

    /**
     * Sets the value of the includeContent property.
     * 
     */
    public void setIncludeContent(boolean value) {
        this.includeContent = value;
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

    /**
     * Gets the value of the includeOrderIds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOrderIds() {
        return includeOrderIds;
    }

    /**
     * Sets the value of the includeOrderIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOrderIds(Boolean value) {
        this.includeOrderIds = value;
    }

}
