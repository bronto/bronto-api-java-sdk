
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryRecipientStatObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryRecipientStatObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="revenue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryRecipientStatObject", propOrder = {
    "deliveryId",
    "listId",
    "segmentId",
    "contactId",
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
    "contactLossRate"
})
public class DeliveryRecipientStatObject {

    protected String deliveryId;
    protected String listId;
    protected String segmentId;
    protected String contactId;
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
    protected Double revenue;
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
     *     {@link Double }
     *     
     */
    public Double getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRevenue(Double value) {
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

}
