
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readSMSKeywords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readSMSKeywords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}smsKeywordFilter" minOccurs="0"/>
 *         &lt;element name="includeDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "readSMSKeywords", propOrder = {
    "filter",
    "includeDeleted",
    "pageNumber"
})
public class ReadSMSKeywords {

    protected SmsKeywordFilter filter;
    protected boolean includeDeleted;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link SmsKeywordFilter }
     *     
     */
    public SmsKeywordFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsKeywordFilter }
     *     
     */
    public void setFilter(SmsKeywordFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the includeDeleted property.
     * 
     */
    public boolean isIncludeDeleted() {
        return includeDeleted;
    }

    /**
     * Sets the value of the includeDeleted property.
     * 
     */
    public void setIncludeDeleted(boolean value) {
        this.includeDeleted = value;
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
