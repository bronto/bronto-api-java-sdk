
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for smsKeywordObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="smsKeywordObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="frequencyCap" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="scheduledDeleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="confirmationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smsKeywordObject", propOrder = {
    "id",
    "name",
    "description",
    "subscriberCount",
    "frequencyCap",
    "dateCreated",
    "scheduledDeleteDate",
    "confirmationMessage",
    "messageContent",
    "keywordType"
})
public class SmsKeywordObject {

    protected String id;
    protected String name;
    protected String description;
    protected Long subscriberCount;
    protected Long frequencyCap;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledDeleteDate;
    protected String confirmationMessage;
    protected String messageContent;
    protected String keywordType;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the subscriberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriberCount() {
        return subscriberCount;
    }

    /**
     * Sets the value of the subscriberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriberCount(Long value) {
        this.subscriberCount = value;
    }

    /**
     * Gets the value of the frequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFrequencyCap() {
        return frequencyCap;
    }

    /**
     * Sets the value of the frequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFrequencyCap(Long value) {
        this.frequencyCap = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the scheduledDeleteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeleteDate() {
        return scheduledDeleteDate;
    }

    /**
     * Sets the value of the scheduledDeleteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeleteDate(XMLGregorianCalendar value) {
        this.scheduledDeleteDate = value;
    }

    /**
     * Gets the value of the confirmationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    /**
     * Sets the value of the confirmationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationMessage(String value) {
        this.confirmationMessage = value;
    }

    /**
     * Gets the value of the messageContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * Sets the value of the messageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContent(String value) {
        this.messageContent = value;
    }

    /**
     * Gets the value of the keywordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordType() {
        return keywordType;
    }

    /**
     * Sets the value of the keywordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordType(String value) {
        this.keywordType = value;
    }

}
