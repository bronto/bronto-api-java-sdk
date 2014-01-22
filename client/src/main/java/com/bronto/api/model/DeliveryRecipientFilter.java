
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryRecipientFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryRecipientFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.bronto.com/v4}filterType" minOccurs="0"/>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segmentIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryRecipientFilter", propOrder = {
    "type",
    "deliveryId",
    "listIds",
    "segmentIds",
    "contactIds"
})
public class DeliveryRecipientFilter {

    protected FilterType type;
    protected String deliveryId;
    @XmlElement(nillable = true)
    protected List<String> listIds;
    @XmlElement(nillable = true)
    protected List<String> segmentIds;
    @XmlElement(nillable = true)
    protected List<String> contactIds;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setType(FilterType value) {
        this.type = value;
    }

    /**
     * Gets the value of the deliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * Sets the value of the deliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryId(String value) {
        this.deliveryId = value;
    }

    /**
     * Gets the value of the listIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListIds() {
        if (listIds == null) {
            listIds = new ArrayList<String>();
        }
        return this.listIds;
    }

    /**
     * Gets the value of the segmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSegmentIds() {
        if (segmentIds == null) {
            segmentIds = new ArrayList<String>();
        }
        return this.segmentIds;
    }

    /**
     * Gets the value of the contactIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactIds() {
        if (contactIds == null) {
            contactIds = new ArrayList<String>();
        }
        return this.contactIds;
    }

}
