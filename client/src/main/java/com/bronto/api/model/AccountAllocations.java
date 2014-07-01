
package com.bronto.api.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for accountAllocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountAllocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canExceedAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canExceedSmsAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="emails" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="contacts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hosting" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="logins" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="api" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="periodFrequency" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bundle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultTemplates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="branding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountAllocations", propOrder = {
    "canExceedAllocation",
    "canExceedSmsAllocation",
    "emails",
    "contacts",
    "hosting",
    "logins",
    "api",
    "fields",
    "startDate",
    "periodFrequency",
    "bundle",
    "defaultTemplates",
    "branding"
})
public class AccountAllocations {

    protected Boolean canExceedAllocation;
    protected Boolean canExceedSmsAllocation;
    protected BigInteger emails;
    protected Long contacts;
    protected Long hosting;
    protected Long logins;
    protected Boolean api;
    protected Long fields;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected Long periodFrequency;
    protected String bundle;
    protected Boolean defaultTemplates;
    protected Boolean branding;

    /**
     * Gets the value of the canExceedAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanExceedAllocation() {
        return canExceedAllocation;
    }

    /**
     * Sets the value of the canExceedAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanExceedAllocation(Boolean value) {
        this.canExceedAllocation = value;
    }

    /**
     * Gets the value of the canExceedSmsAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanExceedSmsAllocation() {
        return canExceedSmsAllocation;
    }

    /**
     * Sets the value of the canExceedSmsAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanExceedSmsAllocation(Boolean value) {
        this.canExceedSmsAllocation = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmails(BigInteger value) {
        this.emails = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContacts(Long value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the hosting property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHosting() {
        return hosting;
    }

    /**
     * Sets the value of the hosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHosting(Long value) {
        this.hosting = value;
    }

    /**
     * Gets the value of the logins property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLogins() {
        return logins;
    }

    /**
     * Sets the value of the logins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLogins(Long value) {
        this.logins = value;
    }

    /**
     * Gets the value of the api property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApi() {
        return api;
    }

    /**
     * Sets the value of the api property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApi(Boolean value) {
        this.api = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFields(Long value) {
        this.fields = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the periodFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodFrequency() {
        return periodFrequency;
    }

    /**
     * Sets the value of the periodFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodFrequency(Long value) {
        this.periodFrequency = value;
    }

    /**
     * Gets the value of the bundle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundle() {
        return bundle;
    }

    /**
     * Sets the value of the bundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundle(String value) {
        this.bundle = value;
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
     * Gets the value of the branding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBranding() {
        return branding;
    }

    /**
     * Sets the value of the branding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBranding(Boolean value) {
        this.branding = value;
    }

}
