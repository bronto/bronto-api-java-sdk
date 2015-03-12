
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readContacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readContacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://api.bronto.com/v4}contactFilter" minOccurs="0"/>
 *         &lt;element name="includeLists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeSMSKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeGeoIPData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeTechnologyData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeRFMData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeEngagementData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readContacts", propOrder = {
    "filter",
    "includeLists",
    "fields",
    "pageNumber",
    "includeSMSKeywords",
    "includeGeoIPData",
    "includeTechnologyData",
    "includeRFMData",
    "includeEngagementData",
    "includeSegments"
})
public class ReadContacts {

    protected ContactFilter filter;
    protected Boolean includeLists;
    protected List<String> fields;
    protected int pageNumber;
    protected Boolean includeSMSKeywords;
    protected Boolean includeGeoIPData;
    protected Boolean includeTechnologyData;
    protected Boolean includeRFMData;
    protected Boolean includeEngagementData;
    protected Boolean includeSegments;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ContactFilter }
     *     
     */
    public ContactFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactFilter }
     *     
     */
    public void setFilter(ContactFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the includeLists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLists() {
        return includeLists;
    }

    /**
     * Sets the value of the includeLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLists(Boolean value) {
        this.includeLists = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFields() {
        if (fields == null) {
            fields = new ArrayList<String>();
        }
        return this.fields;
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
     * Gets the value of the includeSMSKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSMSKeywords() {
        return includeSMSKeywords;
    }

    /**
     * Sets the value of the includeSMSKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSMSKeywords(Boolean value) {
        this.includeSMSKeywords = value;
    }

    /**
     * Gets the value of the includeGeoIPData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeGeoIPData() {
        return includeGeoIPData;
    }

    /**
     * Sets the value of the includeGeoIPData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeGeoIPData(Boolean value) {
        this.includeGeoIPData = value;
    }

    /**
     * Gets the value of the includeTechnologyData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTechnologyData() {
        return includeTechnologyData;
    }

    /**
     * Sets the value of the includeTechnologyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTechnologyData(Boolean value) {
        this.includeTechnologyData = value;
    }

    /**
     * Gets the value of the includeRFMData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeRFMData() {
        return includeRFMData;
    }

    /**
     * Sets the value of the includeRFMData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeRFMData(Boolean value) {
        this.includeRFMData = value;
    }

    /**
     * Gets the value of the includeEngagementData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEngagementData() {
        return includeEngagementData;
    }

    /**
     * Sets the value of the includeEngagementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEngagementData(Boolean value) {
        this.includeEngagementData = value;
    }

    /**
     * Gets the value of the includeSegments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSegments() {
        return includeSegments;
    }

    /**
     * Sets the value of the includeSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSegments(Boolean value) {
        this.includeSegments = value;
    }

}
