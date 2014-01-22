
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readSMSDeliveries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readSMSDeliveries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}smsDeliveryFilter" minOccurs="0"/>
 *         &lt;element name="includeContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeRecipients" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "readSMSDeliveries", propOrder = {
    "filter",
    "includeContent",
    "includeRecipients",
    "pageNumber"
})
public class ReadSMSDeliveries {

    protected SmsDeliveryFilter filter;
    protected boolean includeContent;
    protected boolean includeRecipients;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDeliveryFilter }
     *     
     */
    public SmsDeliveryFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDeliveryFilter }
     *     
     */
    public void setFilter(SmsDeliveryFilter value) {
        this.filter = value;
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
