
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentRuleObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentRuleObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canMatchAny" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://api.bronto.com/v4}segmentCriteriaObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentRuleObject", propOrder = {
    "canMatchAny",
    "criteria"
})
public class SegmentRuleObject {

    protected Boolean canMatchAny;
    @XmlElement(nillable = true)
    protected List<SegmentCriteriaObject> criteria;

    /**
     * Gets the value of the canMatchAny property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanMatchAny() {
        return canMatchAny;
    }

    /**
     * Sets the value of the canMatchAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanMatchAny(Boolean value) {
        this.canMatchAny = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentCriteriaObject }
     * 
     * 
     */
    public List<SegmentCriteriaObject> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<SegmentCriteriaObject>();
        }
        return this.criteria;
    }

}
