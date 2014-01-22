
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readContentTags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readContentTags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}contentTagFilter" minOccurs="0"/>
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
@XmlType(name = "readContentTags", propOrder = {
    "filter",
    "includeContent",
    "pageNumber"
})
public class ReadContentTags {

    protected ContentTagFilter filter;
    protected boolean includeContent;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ContentTagFilter }
     *     
     */
    public ContentTagFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTagFilter }
     *     
     */
    public void setFilter(ContentTagFilter value) {
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
