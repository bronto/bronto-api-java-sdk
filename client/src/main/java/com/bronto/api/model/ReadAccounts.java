
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAccounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}accountFilter" minOccurs="0"/>
 *         &lt;element name="includeInfo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "readAccounts", propOrder = {
    "filter",
    "includeInfo",
    "pageNumber"
})
public class ReadAccounts {

    protected AccountFilter filter;
    protected boolean includeInfo;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link AccountFilter }
     *     
     */
    public AccountFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountFilter }
     *     
     */
    public void setFilter(AccountFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the includeInfo property.
     * 
     */
    public boolean isIncludeInfo() {
        return includeInfo;
    }

    /**
     * Sets the value of the includeInfo property.
     * 
     */
    public void setIncludeInfo(boolean value) {
        this.includeInfo = value;
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
