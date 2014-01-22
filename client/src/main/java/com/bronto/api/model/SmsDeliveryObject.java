
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
 * <p>Java class for smsDeliveryObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="smsDeliveryObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipients" type="{http://api.bronto.com/v4}deliveryRecipientObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactRecipients" type="{http://api.bronto.com/v4}smsDeliveryContactsObject" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://api.bronto.com/v4}smsMessageFieldObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numSends" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numDeliveries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numIncoming" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smsDeliveryObject", propOrder = {
    "id",
    "start",
    "messageId",
    "deliveryType",
    "status",
    "content",
    "recipients",
    "contactRecipients",
    "keywords",
    "fields",
    "numSends",
    "numDeliveries",
    "numIncoming",
    "numBounces",
    "deliveryRate"
})
public class SmsDeliveryObject {

    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    protected String messageId;
    protected String deliveryType;
    protected String status;
    protected String content;
    @XmlElement(nillable = true)
    protected List<DeliveryRecipientObject> recipients;
    protected SmsDeliveryContactsObject contactRecipients;
    @XmlElement(nillable = true)
    protected List<String> keywords;
    @XmlElement(nillable = true)
    protected List<SmsMessageFieldObject> fields;
    protected Long numSends;
    protected Long numDeliveries;
    protected Long numIncoming;
    protected Long numBounces;
    protected Double deliveryRate;

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
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
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
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryType(String value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryRecipientObject }
     * 
     * 
     */
    public List<DeliveryRecipientObject> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<DeliveryRecipientObject>();
        }
        return this.recipients;
    }

    /**
     * Gets the value of the contactRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link SmsDeliveryContactsObject }
     *     
     */
    public SmsDeliveryContactsObject getContactRecipients() {
        return contactRecipients;
    }

    /**
     * Sets the value of the contactRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsDeliveryContactsObject }
     *     
     */
    public void setContactRecipients(SmsDeliveryContactsObject value) {
        this.contactRecipients = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<String>();
        }
        return this.keywords;
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
     * {@link SmsMessageFieldObject }
     * 
     * 
     */
    public List<SmsMessageFieldObject> getFields() {
        if (fields == null) {
            fields = new ArrayList<SmsMessageFieldObject>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the numSends property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSends() {
        return numSends;
    }

    /**
     * Sets the value of the numSends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSends(Long value) {
        this.numSends = value;
    }

    /**
     * Gets the value of the numDeliveries property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDeliveries() {
        return numDeliveries;
    }

    /**
     * Sets the value of the numDeliveries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDeliveries(Long value) {
        this.numDeliveries = value;
    }

    /**
     * Gets the value of the numIncoming property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumIncoming() {
        return numIncoming;
    }

    /**
     * Sets the value of the numIncoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumIncoming(Long value) {
        this.numIncoming = value;
    }

    /**
     * Gets the value of the numBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumBounces() {
        return numBounces;
    }

    /**
     * Sets the value of the numBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumBounces(Long value) {
        this.numBounces = value;
    }

    /**
     * Gets the value of the deliveryRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeliveryRate() {
        return deliveryRate;
    }

    /**
     * Sets the value of the deliveryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeliveryRate(Double value) {
        this.deliveryRate = value;
    }

}
