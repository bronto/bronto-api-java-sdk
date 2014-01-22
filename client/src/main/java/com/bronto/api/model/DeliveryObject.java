
package com.bronto.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for deliveryObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authentication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="replyTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="messageRuleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="throttle" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fatigueOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="content" type="{http://api.bronto.com/v4}messageContentObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="recipients" type="{http://api.bronto.com/v4}deliveryRecipientObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://api.bronto.com/v4}messageFieldObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remail" type="{http://api.bronto.com/v4}remailObject" minOccurs="0"/>
 *         &lt;element name="numSends" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numDeliveries" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numHardBadEmail" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numHardDestUnreach" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numHardMessageContent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numHardBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSoftBadEmail" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSoftDestUnreach" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSoftMessageContent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSoftBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numOtherBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="uniqOpens" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numOpens" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="avgOpens" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="uniqClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="avgClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="uniqConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="avgConversions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numSurveyResponses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numFriendForwards" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numContactUpdates" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numUnsubscribesByPrefs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numUnsubscribesByComplaint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numContactLoss" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numContactLossBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="openRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clickRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clickThroughRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bounceRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="complaintRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="contactLossRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numSocialShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSharesFacebook" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSharesTwitter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSharesLinkedIn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSharesDigg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSharesMySpace" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numViewsFacebook" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numViewsTwitter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numViewsLinkedIn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numViewsDigg" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numViewsMySpace" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numSocialViews" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryObject", propOrder = {
    "id",
    "start",
    "messageId",
    "status",
    "type",
    "fromEmail",
    "fromName",
    "replyEmail",
    "authentication",
    "replyTracking",
    "messageRuleId",
    "optin",
    "throttle",
    "fatigueOverride",
    "content",
    "recipients",
    "fields",
    "remail",
    "numSends",
    "numDeliveries",
    "numHardBadEmail",
    "numHardDestUnreach",
    "numHardMessageContent",
    "numHardBounces",
    "numSoftBadEmail",
    "numSoftDestUnreach",
    "numSoftMessageContent",
    "numSoftBounces",
    "numOtherBounces",
    "numBounces",
    "uniqOpens",
    "numOpens",
    "avgOpens",
    "uniqClicks",
    "numClicks",
    "avgClicks",
    "uniqConversions",
    "numConversions",
    "avgConversions",
    "revenue",
    "numSurveyResponses",
    "numFriendForwards",
    "numContactUpdates",
    "numUnsubscribesByPrefs",
    "numUnsubscribesByComplaint",
    "numContactLoss",
    "numContactLossBounces",
    "deliveryRate",
    "openRate",
    "clickRate",
    "clickThroughRate",
    "conversionRate",
    "bounceRate",
    "complaintRate",
    "contactLossRate",
    "numSocialShares",
    "numSharesFacebook",
    "numSharesTwitter",
    "numSharesLinkedIn",
    "numSharesDigg",
    "numSharesMySpace",
    "numViewsFacebook",
    "numViewsTwitter",
    "numViewsLinkedIn",
    "numViewsDigg",
    "numViewsMySpace",
    "numSocialViews"
})
public class DeliveryObject {

    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    protected String messageId;
    protected String status;
    protected String type;
    protected String fromEmail;
    protected String fromName;
    protected String replyEmail;
    protected Boolean authentication;
    protected Boolean replyTracking;
    protected String messageRuleId;
    protected Boolean optin;
    protected Long throttle;
    protected Boolean fatigueOverride;
    @XmlElement(nillable = true)
    protected List<MessageContentObject> content;
    @XmlElement(nillable = true)
    protected List<DeliveryRecipientObject> recipients;
    @XmlElement(nillable = true)
    protected List<MessageFieldObject> fields;
    protected RemailObject remail;
    protected Long numSends;
    protected Long numDeliveries;
    protected Long numHardBadEmail;
    protected Long numHardDestUnreach;
    protected Long numHardMessageContent;
    protected Long numHardBounces;
    protected Long numSoftBadEmail;
    protected Long numSoftDestUnreach;
    protected Long numSoftMessageContent;
    protected Long numSoftBounces;
    protected Long numOtherBounces;
    protected Long numBounces;
    protected Long uniqOpens;
    protected Long numOpens;
    protected Double avgOpens;
    protected Long uniqClicks;
    protected Long numClicks;
    protected Double avgClicks;
    protected Long uniqConversions;
    protected Long numConversions;
    protected Double avgConversions;
    protected BigDecimal revenue;
    protected Long numSurveyResponses;
    protected Long numFriendForwards;
    protected Long numContactUpdates;
    protected Long numUnsubscribesByPrefs;
    protected Long numUnsubscribesByComplaint;
    protected Long numContactLoss;
    protected Long numContactLossBounces;
    protected Double deliveryRate;
    protected Double openRate;
    protected Double clickRate;
    protected Double clickThroughRate;
    protected Double conversionRate;
    protected Double bounceRate;
    protected Double complaintRate;
    protected Double contactLossRate;
    protected Long numSocialShares;
    protected Long numSharesFacebook;
    protected Long numSharesTwitter;
    protected Long numSharesLinkedIn;
    protected Long numSharesDigg;
    protected Long numSharesMySpace;
    protected Long numViewsFacebook;
    protected Long numViewsTwitter;
    protected Long numViewsLinkedIn;
    protected Long numViewsDigg;
    protected Long numViewsMySpace;
    protected Long numSocialViews;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the fromEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEmail() {
        return fromEmail;
    }

    /**
     * Sets the value of the fromEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEmail(String value) {
        this.fromEmail = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the replyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyEmail() {
        return replyEmail;
    }

    /**
     * Sets the value of the replyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyEmail(String value) {
        this.replyEmail = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthentication(Boolean value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the replyTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplyTracking() {
        return replyTracking;
    }

    /**
     * Sets the value of the replyTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyTracking(Boolean value) {
        this.replyTracking = value;
    }

    /**
     * Gets the value of the messageRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageRuleId() {
        return messageRuleId;
    }

    /**
     * Sets the value of the messageRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageRuleId(String value) {
        this.messageRuleId = value;
    }

    /**
     * Gets the value of the optin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptin() {
        return optin;
    }

    /**
     * Sets the value of the optin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptin(Boolean value) {
        this.optin = value;
    }

    /**
     * Gets the value of the throttle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThrottle() {
        return throttle;
    }

    /**
     * Sets the value of the throttle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThrottle(Long value) {
        this.throttle = value;
    }

    /**
     * Gets the value of the fatigueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFatigueOverride() {
        return fatigueOverride;
    }

    /**
     * Sets the value of the fatigueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFatigueOverride(Boolean value) {
        this.fatigueOverride = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageContentObject }
     * 
     * 
     */
    public List<MessageContentObject> getContent() {
        if (content == null) {
            content = new ArrayList<MessageContentObject>();
        }
        return this.content;
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
     * {@link MessageFieldObject }
     * 
     * 
     */
    public List<MessageFieldObject> getFields() {
        if (fields == null) {
            fields = new ArrayList<MessageFieldObject>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the remail property.
     * 
     * @return
     *     possible object is
     *     {@link RemailObject }
     *     
     */
    public RemailObject getRemail() {
        return remail;
    }

    /**
     * Sets the value of the remail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemailObject }
     *     
     */
    public void setRemail(RemailObject value) {
        this.remail = value;
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
     * Gets the value of the numHardBadEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHardBadEmail() {
        return numHardBadEmail;
    }

    /**
     * Sets the value of the numHardBadEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHardBadEmail(Long value) {
        this.numHardBadEmail = value;
    }

    /**
     * Gets the value of the numHardDestUnreach property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHardDestUnreach() {
        return numHardDestUnreach;
    }

    /**
     * Sets the value of the numHardDestUnreach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHardDestUnreach(Long value) {
        this.numHardDestUnreach = value;
    }

    /**
     * Gets the value of the numHardMessageContent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHardMessageContent() {
        return numHardMessageContent;
    }

    /**
     * Sets the value of the numHardMessageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHardMessageContent(Long value) {
        this.numHardMessageContent = value;
    }

    /**
     * Gets the value of the numHardBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumHardBounces() {
        return numHardBounces;
    }

    /**
     * Sets the value of the numHardBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumHardBounces(Long value) {
        this.numHardBounces = value;
    }

    /**
     * Gets the value of the numSoftBadEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSoftBadEmail() {
        return numSoftBadEmail;
    }

    /**
     * Sets the value of the numSoftBadEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSoftBadEmail(Long value) {
        this.numSoftBadEmail = value;
    }

    /**
     * Gets the value of the numSoftDestUnreach property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSoftDestUnreach() {
        return numSoftDestUnreach;
    }

    /**
     * Sets the value of the numSoftDestUnreach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSoftDestUnreach(Long value) {
        this.numSoftDestUnreach = value;
    }

    /**
     * Gets the value of the numSoftMessageContent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSoftMessageContent() {
        return numSoftMessageContent;
    }

    /**
     * Sets the value of the numSoftMessageContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSoftMessageContent(Long value) {
        this.numSoftMessageContent = value;
    }

    /**
     * Gets the value of the numSoftBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSoftBounces() {
        return numSoftBounces;
    }

    /**
     * Sets the value of the numSoftBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSoftBounces(Long value) {
        this.numSoftBounces = value;
    }

    /**
     * Gets the value of the numOtherBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOtherBounces() {
        return numOtherBounces;
    }

    /**
     * Sets the value of the numOtherBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOtherBounces(Long value) {
        this.numOtherBounces = value;
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
     * Gets the value of the uniqOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqOpens() {
        return uniqOpens;
    }

    /**
     * Sets the value of the uniqOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqOpens(Long value) {
        this.uniqOpens = value;
    }

    /**
     * Gets the value of the numOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOpens() {
        return numOpens;
    }

    /**
     * Sets the value of the numOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOpens(Long value) {
        this.numOpens = value;
    }

    /**
     * Gets the value of the avgOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgOpens() {
        return avgOpens;
    }

    /**
     * Sets the value of the avgOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgOpens(Double value) {
        this.avgOpens = value;
    }

    /**
     * Gets the value of the uniqClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqClicks() {
        return uniqClicks;
    }

    /**
     * Sets the value of the uniqClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqClicks(Long value) {
        this.uniqClicks = value;
    }

    /**
     * Gets the value of the numClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumClicks() {
        return numClicks;
    }

    /**
     * Sets the value of the numClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumClicks(Long value) {
        this.numClicks = value;
    }

    /**
     * Gets the value of the avgClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgClicks() {
        return avgClicks;
    }

    /**
     * Sets the value of the avgClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgClicks(Double value) {
        this.avgClicks = value;
    }

    /**
     * Gets the value of the uniqConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqConversions() {
        return uniqConversions;
    }

    /**
     * Sets the value of the uniqConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqConversions(Long value) {
        this.uniqConversions = value;
    }

    /**
     * Gets the value of the numConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumConversions() {
        return numConversions;
    }

    /**
     * Sets the value of the numConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumConversions(Long value) {
        this.numConversions = value;
    }

    /**
     * Gets the value of the avgConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAvgConversions() {
        return avgConversions;
    }

    /**
     * Sets the value of the avgConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAvgConversions(Double value) {
        this.avgConversions = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenue(BigDecimal value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the numSurveyResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSurveyResponses() {
        return numSurveyResponses;
    }

    /**
     * Sets the value of the numSurveyResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSurveyResponses(Long value) {
        this.numSurveyResponses = value;
    }

    /**
     * Gets the value of the numFriendForwards property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumFriendForwards() {
        return numFriendForwards;
    }

    /**
     * Sets the value of the numFriendForwards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumFriendForwards(Long value) {
        this.numFriendForwards = value;
    }

    /**
     * Gets the value of the numContactUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumContactUpdates() {
        return numContactUpdates;
    }

    /**
     * Sets the value of the numContactUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumContactUpdates(Long value) {
        this.numContactUpdates = value;
    }

    /**
     * Gets the value of the numUnsubscribesByPrefs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumUnsubscribesByPrefs() {
        return numUnsubscribesByPrefs;
    }

    /**
     * Sets the value of the numUnsubscribesByPrefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumUnsubscribesByPrefs(Long value) {
        this.numUnsubscribesByPrefs = value;
    }

    /**
     * Gets the value of the numUnsubscribesByComplaint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumUnsubscribesByComplaint() {
        return numUnsubscribesByComplaint;
    }

    /**
     * Sets the value of the numUnsubscribesByComplaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumUnsubscribesByComplaint(Long value) {
        this.numUnsubscribesByComplaint = value;
    }

    /**
     * Gets the value of the numContactLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumContactLoss() {
        return numContactLoss;
    }

    /**
     * Sets the value of the numContactLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumContactLoss(Long value) {
        this.numContactLoss = value;
    }

    /**
     * Gets the value of the numContactLossBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumContactLossBounces() {
        return numContactLossBounces;
    }

    /**
     * Sets the value of the numContactLossBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumContactLossBounces(Long value) {
        this.numContactLossBounces = value;
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

    /**
     * Gets the value of the openRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOpenRate() {
        return openRate;
    }

    /**
     * Sets the value of the openRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpenRate(Double value) {
        this.openRate = value;
    }

    /**
     * Gets the value of the clickRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * Sets the value of the clickRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickRate(Double value) {
        this.clickRate = value;
    }

    /**
     * Gets the value of the clickThroughRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickThroughRate() {
        return clickThroughRate;
    }

    /**
     * Sets the value of the clickThroughRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickThroughRate(Double value) {
        this.clickThroughRate = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionRate(Double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the bounceRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBounceRate() {
        return bounceRate;
    }

    /**
     * Sets the value of the bounceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBounceRate(Double value) {
        this.bounceRate = value;
    }

    /**
     * Gets the value of the complaintRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComplaintRate() {
        return complaintRate;
    }

    /**
     * Sets the value of the complaintRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComplaintRate(Double value) {
        this.complaintRate = value;
    }

    /**
     * Gets the value of the contactLossRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContactLossRate() {
        return contactLossRate;
    }

    /**
     * Sets the value of the contactLossRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContactLossRate(Double value) {
        this.contactLossRate = value;
    }

    /**
     * Gets the value of the numSocialShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSocialShares() {
        return numSocialShares;
    }

    /**
     * Sets the value of the numSocialShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSocialShares(Long value) {
        this.numSocialShares = value;
    }

    /**
     * Gets the value of the numSharesFacebook property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSharesFacebook() {
        return numSharesFacebook;
    }

    /**
     * Sets the value of the numSharesFacebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSharesFacebook(Long value) {
        this.numSharesFacebook = value;
    }

    /**
     * Gets the value of the numSharesTwitter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSharesTwitter() {
        return numSharesTwitter;
    }

    /**
     * Sets the value of the numSharesTwitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSharesTwitter(Long value) {
        this.numSharesTwitter = value;
    }

    /**
     * Gets the value of the numSharesLinkedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSharesLinkedIn() {
        return numSharesLinkedIn;
    }

    /**
     * Sets the value of the numSharesLinkedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSharesLinkedIn(Long value) {
        this.numSharesLinkedIn = value;
    }

    /**
     * Gets the value of the numSharesDigg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSharesDigg() {
        return numSharesDigg;
    }

    /**
     * Sets the value of the numSharesDigg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSharesDigg(Long value) {
        this.numSharesDigg = value;
    }

    /**
     * Gets the value of the numSharesMySpace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSharesMySpace() {
        return numSharesMySpace;
    }

    /**
     * Sets the value of the numSharesMySpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSharesMySpace(Long value) {
        this.numSharesMySpace = value;
    }

    /**
     * Gets the value of the numViewsFacebook property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumViewsFacebook() {
        return numViewsFacebook;
    }

    /**
     * Sets the value of the numViewsFacebook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumViewsFacebook(Long value) {
        this.numViewsFacebook = value;
    }

    /**
     * Gets the value of the numViewsTwitter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumViewsTwitter() {
        return numViewsTwitter;
    }

    /**
     * Sets the value of the numViewsTwitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumViewsTwitter(Long value) {
        this.numViewsTwitter = value;
    }

    /**
     * Gets the value of the numViewsLinkedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumViewsLinkedIn() {
        return numViewsLinkedIn;
    }

    /**
     * Sets the value of the numViewsLinkedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumViewsLinkedIn(Long value) {
        this.numViewsLinkedIn = value;
    }

    /**
     * Gets the value of the numViewsDigg property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumViewsDigg() {
        return numViewsDigg;
    }

    /**
     * Sets the value of the numViewsDigg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumViewsDigg(Long value) {
        this.numViewsDigg = value;
    }

    /**
     * Gets the value of the numViewsMySpace property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumViewsMySpace() {
        return numViewsMySpace;
    }

    /**
     * Sets the value of the numViewsMySpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumViewsMySpace(Long value) {
        this.numViewsMySpace = value;
    }

    /**
     * Gets the value of the numSocialViews property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSocialViews() {
        return numSocialViews;
    }

    /**
     * Sets the value of the numSocialViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSocialViews(Long value) {
        this.numSocialViews = value;
    }

}
