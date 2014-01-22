
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emergencyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyFrequencyCap" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="weeklyFrequencyCap" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="monthlyFrequencyCap" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="textDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="textPreference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useSSL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendUsageAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usageAlertEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentContacts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxContacts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currentMonthlyEmails" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currentHostingSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxHostingSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="agencyTemplateuploadPerm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableInboxPreviews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowCustomizedBranding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bounceLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalSettings", propOrder = {
    "emergencyEmail",
    "dailyFrequencyCap",
    "weeklyFrequencyCap",
    "monthlyFrequencyCap",
    "textDelivery",
    "textPreference",
    "useSSL",
    "sendUsageAlerts",
    "usageAlertEmail",
    "currentContacts",
    "maxContacts",
    "currentMonthlyEmails",
    "currentHostingSize",
    "maxHostingSize",
    "agencyTemplateuploadPerm",
    "defaultTemplates",
    "enableInboxPreviews",
    "allowCustomizedBranding",
    "bounceLimit"
})
public class GeneralSettings {

    protected String emergencyEmail;
    protected Long dailyFrequencyCap;
    protected Long weeklyFrequencyCap;
    protected Long monthlyFrequencyCap;
    protected Boolean textDelivery;
    protected Boolean textPreference;
    protected Boolean useSSL;
    protected Boolean sendUsageAlerts;
    protected String usageAlertEmail;
    protected Long currentContacts;
    protected Long maxContacts;
    protected Long currentMonthlyEmails;
    protected Long currentHostingSize;
    protected Long maxHostingSize;
    protected Boolean agencyTemplateuploadPerm;
    protected Boolean defaultTemplates;
    protected Boolean enableInboxPreviews;
    protected Boolean allowCustomizedBranding;
    protected Long bounceLimit;

    /**
     * Gets the value of the emergencyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyEmail() {
        return emergencyEmail;
    }

    /**
     * Sets the value of the emergencyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyEmail(String value) {
        this.emergencyEmail = value;
    }

    /**
     * Gets the value of the dailyFrequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDailyFrequencyCap() {
        return dailyFrequencyCap;
    }

    /**
     * Sets the value of the dailyFrequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDailyFrequencyCap(Long value) {
        this.dailyFrequencyCap = value;
    }

    /**
     * Gets the value of the weeklyFrequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeeklyFrequencyCap() {
        return weeklyFrequencyCap;
    }

    /**
     * Sets the value of the weeklyFrequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeeklyFrequencyCap(Long value) {
        this.weeklyFrequencyCap = value;
    }

    /**
     * Gets the value of the monthlyFrequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthlyFrequencyCap() {
        return monthlyFrequencyCap;
    }

    /**
     * Sets the value of the monthlyFrequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthlyFrequencyCap(Long value) {
        this.monthlyFrequencyCap = value;
    }

    /**
     * Gets the value of the textDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextDelivery() {
        return textDelivery;
    }

    /**
     * Sets the value of the textDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextDelivery(Boolean value) {
        this.textDelivery = value;
    }

    /**
     * Gets the value of the textPreference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTextPreference() {
        return textPreference;
    }

    /**
     * Sets the value of the textPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTextPreference(Boolean value) {
        this.textPreference = value;
    }

    /**
     * Gets the value of the useSSL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSSL() {
        return useSSL;
    }

    /**
     * Sets the value of the useSSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSSL(Boolean value) {
        this.useSSL = value;
    }

    /**
     * Gets the value of the sendUsageAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendUsageAlerts() {
        return sendUsageAlerts;
    }

    /**
     * Sets the value of the sendUsageAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendUsageAlerts(Boolean value) {
        this.sendUsageAlerts = value;
    }

    /**
     * Gets the value of the usageAlertEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageAlertEmail() {
        return usageAlertEmail;
    }

    /**
     * Sets the value of the usageAlertEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageAlertEmail(String value) {
        this.usageAlertEmail = value;
    }

    /**
     * Gets the value of the currentContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentContacts() {
        return currentContacts;
    }

    /**
     * Sets the value of the currentContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentContacts(Long value) {
        this.currentContacts = value;
    }

    /**
     * Gets the value of the maxContacts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxContacts() {
        return maxContacts;
    }

    /**
     * Sets the value of the maxContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxContacts(Long value) {
        this.maxContacts = value;
    }

    /**
     * Gets the value of the currentMonthlyEmails property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentMonthlyEmails() {
        return currentMonthlyEmails;
    }

    /**
     * Sets the value of the currentMonthlyEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentMonthlyEmails(Long value) {
        this.currentMonthlyEmails = value;
    }

    /**
     * Gets the value of the currentHostingSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentHostingSize() {
        return currentHostingSize;
    }

    /**
     * Sets the value of the currentHostingSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentHostingSize(Long value) {
        this.currentHostingSize = value;
    }

    /**
     * Gets the value of the maxHostingSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxHostingSize() {
        return maxHostingSize;
    }

    /**
     * Sets the value of the maxHostingSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxHostingSize(Long value) {
        this.maxHostingSize = value;
    }

    /**
     * Gets the value of the agencyTemplateuploadPerm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgencyTemplateuploadPerm() {
        return agencyTemplateuploadPerm;
    }

    /**
     * Sets the value of the agencyTemplateuploadPerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgencyTemplateuploadPerm(Boolean value) {
        this.agencyTemplateuploadPerm = value;
    }

    /**
     * Gets the value of the defaultTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultTemplates() {
        return defaultTemplates;
    }

    /**
     * Sets the value of the defaultTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultTemplates(Boolean value) {
        this.defaultTemplates = value;
    }

    /**
     * Gets the value of the enableInboxPreviews property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableInboxPreviews() {
        return enableInboxPreviews;
    }

    /**
     * Sets the value of the enableInboxPreviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableInboxPreviews(Boolean value) {
        this.enableInboxPreviews = value;
    }

    /**
     * Gets the value of the allowCustomizedBranding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCustomizedBranding() {
        return allowCustomizedBranding;
    }

    /**
     * Sets the value of the allowCustomizedBranding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCustomizedBranding(Boolean value) {
        this.allowCustomizedBranding = value;
    }

    /**
     * Gets the value of the bounceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBounceLimit() {
        return bounceLimit;
    }

    /**
     * Sets the value of the bounceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBounceLimit(Long value) {
        this.bounceLimit = value;
    }

}
