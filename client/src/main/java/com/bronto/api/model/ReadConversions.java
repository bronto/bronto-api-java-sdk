
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readConversions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readConversions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}conversionFilter" minOccurs="0"/>
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
@XmlType(name = "readConversions", propOrder = {
    "filter",
    "pageNumber"
})
public class ReadConversions {

    protected ConversionFilter filter;
    protected int pageNumber;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionFilter }
     *     
     */
    public ConversionFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionFilter }
     *     
     */
    public void setFilter(ConversionFilter value) {
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
