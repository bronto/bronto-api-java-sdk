
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for activityObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activityObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trackingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bounceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bounceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activityObject", propOrder = {
    "activityDate",
    "contactId",
    "deliveryId",
    "messageId",
    "listId",
    "segmentId",
    "trackingType",
    "bounceReason",
    "bounceType",
    "linkName",
    "linkUrl",
    "url",
    "quantity",
    "amount"
})
public class ActivityObject {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activityDate;
    protected String contactId;
    protected String deliveryId;
    protected String messageId;
    protected String listId;
    protected String segmentId;
    protected String trackingType;
    protected String bounceReason;
    protected String bounceType;
    protected String linkName;
    protected String linkUrl;
    protected String url;
    protected Integer quantity;
    protected String amount;

    /**
     * Gets the value of the activityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityDate() {
        return activityDate;
    }

    /**
     * Sets the value of the activityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityDate(XMLGregorianCalendar value) {
        this.activityDate = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
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
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListId(String value) {
        this.listId = value;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * Sets the value of the segmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentId(String value) {
        this.segmentId = value;
    }

    /**
     * Gets the value of the trackingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingType() {
        return trackingType;
    }

    /**
     * Sets the value of the trackingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingType(String value) {
        this.trackingType = value;
    }

    /**
     * Gets the value of the bounceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBounceReason() {
        return bounceReason;
    }

    /**
     * Sets the value of the bounceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBounceReason(String value) {
        this.bounceReason = value;
    }

    /**
     * Gets the value of the bounceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBounceType() {
        return bounceType;
    }

    /**
     * Sets the value of the bounceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBounceType(String value) {
        this.bounceType = value;
    }

    /**
     * Gets the value of the linkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets the value of the linkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     * Gets the value of the linkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * Sets the value of the linkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkUrl(String value) {
        this.linkUrl = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

}
