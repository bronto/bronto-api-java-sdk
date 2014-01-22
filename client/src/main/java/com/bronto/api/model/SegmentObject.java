
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for segmentObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchAnyRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rules" type="{http://api.bronto.com/v4}segmentRuleObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activeCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentObject", propOrder = {
    "id",
    "name",
    "matchAnyRule",
    "rules",
    "lastUpdated",
    "activeCount"
})
public class SegmentObject {

    protected String id;
    protected String name;
    protected Boolean matchAnyRule;
    @XmlElement(nillable = true)
    protected List<SegmentRuleObject> rules;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    protected Long activeCount;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the matchAnyRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchAnyRule() {
        return matchAnyRule;
    }

    /**
     * Sets the value of the matchAnyRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchAnyRule(Boolean value) {
        this.matchAnyRule = value;
    }

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentRuleObject }
     * 
     * 
     */
    public List<SegmentRuleObject> getRules() {
        if (rules == null) {
            rules = new ArrayList<SegmentRuleObject>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the activeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActiveCount() {
        return activeCount;
    }

    /**
     * Sets the value of the activeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActiveCount(Long value) {
        this.activeCount = value;
    }

}
