
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
 * <p>Java class for deliveryGroupObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryGroupObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deliveryIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageRuleIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryGroupObject", propOrder = {
    "id",
    "name",
    "visibility",
    "deliveryCount",
    "createdDate",
    "deliveryIds",
    "messageRuleIds",
    "messageIds"
})
public class DeliveryGroupObject {

    protected String id;
    protected String name;
    protected String visibility;
    protected Long deliveryCount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(nillable = true)
    protected List<String> deliveryIds;
    @XmlElement(nillable = true)
    protected List<String> messageRuleIds;
    @XmlElement(nillable = true)
    protected List<String> messageIds;

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
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the deliveryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveryCount() {
        return deliveryCount;
    }

    /**
     * Sets the value of the deliveryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveryCount(Long value) {
        this.deliveryCount = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the deliveryIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryIds() {
        if (deliveryIds == null) {
            deliveryIds = new ArrayList<String>();
        }
        return this.deliveryIds;
    }

    /**
     * Gets the value of the messageRuleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageRuleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRuleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageRuleIds() {
        if (messageRuleIds == null) {
            messageRuleIds = new ArrayList<String>();
        }
        return this.messageRuleIds;
    }

    /**
     * Gets the value of the messageIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageIds() {
        if (messageIds == null) {
            messageIds = new ArrayList<String>();
        }
        return this.messageIds;
    }

}
