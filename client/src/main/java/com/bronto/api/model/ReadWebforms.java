
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readWebforms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readWebforms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}webformFilter" minOccurs="0"/>
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
@XmlType(name = "readWebforms", propOrder = {
    "filter",
    "pageNumber"
})
public class ReadWebforms {

    protected WebformFilter filter;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link WebformFilter }
     *     
     */
    public WebformFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebformFilter }
     *     
     */
    public void setFilter(WebformFilter value) {
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
