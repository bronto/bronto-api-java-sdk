
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}messageFilter" minOccurs="0"/>
 *         &lt;element name="includeContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "readMessages", propOrder = {
    "filter",
    "includeContent",
    "pageNumber"
})
public class ReadMessages {

    protected MessageFilter filter;
    protected boolean includeContent;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFilter }
     *     
     */
    public MessageFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFilter }
     *     
     */
    public void setFilter(MessageFilter value) {
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
