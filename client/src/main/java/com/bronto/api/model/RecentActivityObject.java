
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for recentActivityObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recentActivityObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keywordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="workflowName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="automatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsKeywordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bounceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bounceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skipReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unsubscribeMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ftafEmails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="socialActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webformType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webformAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webformName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recentActivityObject", propOrder = {
    "createdDate",
    "contactId",
    "listId",
    "segmentId",
    "keywordId",
    "messageId",
    "deliveryId",
    "workflowId",
    "activityType",
    "emailAddress",
    "mobileNumber",
    "contactStatus",
    "messageName",
    "deliveryType",
    "deliveryStart",
    "workflowName",
    "segmentName",
    "listName",
    "listLabel",
    "automatorName",
    "smsKeywordName",
    "bounceType",
    "bounceReason",
    "skipReason",
    "linkName",
    "linkUrl",
    "orderId",
    "unsubscribeMethod",
    "ftafEmails",
    "socialNetwork",
    "socialActivity",
    "webformType",
    "webformAction",
    "webformName"
})
public class RecentActivityObject {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String contactId;
    protected String listId;
    protected String segmentId;
    protected String keywordId;
    protected String messageId;
    protected String deliveryId;
    protected String workflowId;
    protected String activityType;
    protected String emailAddress;
    protected String mobileNumber;
    protected String contactStatus;
    protected String messageName;
    protected String deliveryType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryStart;
    protected String workflowName;
    protected String segmentName;
    protected String listName;
    protected String listLabel;
    protected String automatorName;
    protected String smsKeywordName;
    protected String bounceType;
    protected String bounceReason;
    protected String skipReason;
    protected String linkName;
    protected String linkUrl;
    protected String orderId;
    protected String unsubscribeMethod;
    protected String ftafEmails;
    protected String socialNetwork;
    protected String socialActivity;
    protected String webformType;
    protected String webformAction;
    protected String webformName;

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
     * Gets the value of the keywordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordId() {
        return keywordId;
    }

    /**
     * Sets the value of the keywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordId(String value) {
        this.keywordId = value;
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
     * Gets the value of the workflowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowId(String value) {
        this.workflowId = value;
    }

    /**
     * Gets the value of the activityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityType(String value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the contactStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactStatus() {
        return contactStatus;
    }

    /**
     * Sets the value of the contactStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactStatus(String value) {
        this.contactStatus = value;
    }

    /**
     * Gets the value of the messageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * Sets the value of the messageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageName(String value) {
        this.messageName = value;
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
     * Gets the value of the deliveryStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryStart() {
        return deliveryStart;
    }

    /**
     * Sets the value of the deliveryStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryStart(XMLGregorianCalendar value) {
        this.deliveryStart = value;
    }

    /**
     * Gets the value of the workflowName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /**
     * Sets the value of the workflowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowName(String value) {
        this.workflowName = value;
    }

    /**
     * Gets the value of the segmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * Sets the value of the segmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentName(String value) {
        this.segmentName = value;
    }

    /**
     * Gets the value of the listName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListName() {
        return listName;
    }

    /**
     * Sets the value of the listName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListName(String value) {
        this.listName = value;
    }

    /**
     * Gets the value of the listLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListLabel() {
        return listLabel;
    }

    /**
     * Sets the value of the listLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListLabel(String value) {
        this.listLabel = value;
    }

    /**
     * Gets the value of the automatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomatorName() {
        return automatorName;
    }

    /**
     * Sets the value of the automatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomatorName(String value) {
        this.automatorName = value;
    }

    /**
     * Gets the value of the smsKeywordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsKeywordName() {
        return smsKeywordName;
    }

    /**
     * Sets the value of the smsKeywordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsKeywordName(String value) {
        this.smsKeywordName = value;
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
     * Gets the value of the skipReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkipReason() {
        return skipReason;
    }

    /**
     * Sets the value of the skipReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkipReason(String value) {
        this.skipReason = value;
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
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the unsubscribeMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubscribeMethod() {
        return unsubscribeMethod;
    }

    /**
     * Sets the value of the unsubscribeMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubscribeMethod(String value) {
        this.unsubscribeMethod = value;
    }

    /**
     * Gets the value of the ftafEmails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFtafEmails() {
        return ftafEmails;
    }

    /**
     * Sets the value of the ftafEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFtafEmails(String value) {
        this.ftafEmails = value;
    }

    /**
     * Gets the value of the socialNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * Sets the value of the socialNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialNetwork(String value) {
        this.socialNetwork = value;
    }

    /**
     * Gets the value of the socialActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialActivity() {
        return socialActivity;
    }

    /**
     * Sets the value of the socialActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialActivity(String value) {
        this.socialActivity = value;
    }

    /**
     * Gets the value of the webformType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebformType() {
        return webformType;
    }

    /**
     * Sets the value of the webformType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebformType(String value) {
        this.webformType = value;
    }

    /**
     * Gets the value of the webformAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebformAction() {
        return webformAction;
    }

    /**
     * Sets the value of the webformAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebformAction(String value) {
        this.webformAction = value;
    }

    /**
     * Gets the value of the webformName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebformName() {
        return webformName;
    }

    /**
     * Sets the value of the webformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebformName(String value) {
        this.webformName = value;
    }

}
