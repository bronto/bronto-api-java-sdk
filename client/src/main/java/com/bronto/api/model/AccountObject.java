
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="generalSettings" type="{http://api.bronto.com/v4}generalSettings" minOccurs="0"/>
 *         &lt;element name="contactInformation" type="{http://api.bronto.com/v4}contactInformation" minOccurs="0"/>
 *         &lt;element name="formatSettings" type="{http://api.bronto.com/v4}formatSettings" minOccurs="0"/>
 *         &lt;element name="brandingSettings" type="{http://api.bronto.com/v4}brandingSettings" minOccurs="0"/>
 *         &lt;element name="repliesSettings" type="{http://api.bronto.com/v4}repliesSettings" minOccurs="0"/>
 *         &lt;element name="allocations" type="{http://api.bronto.com/v4}accountAllocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountObject", propOrder = {
    "id",
    "name",
    "status",
    "generalSettings",
    "contactInformation",
    "formatSettings",
    "brandingSettings",
    "repliesSettings",
    "allocations"
})
public class AccountObject {

    protected String id;
    protected String name;
    protected String status;
    protected GeneralSettings generalSettings;
    protected ContactInformation contactInformation;
    protected FormatSettings formatSettings;
    protected BrandingSettings brandingSettings;
    protected RepliesSettings repliesSettings;
    protected AccountAllocations allocations;

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
     * Gets the value of the generalSettings property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSettings }
     *     
     */
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    /**
     * Sets the value of the generalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSettings }
     *     
     */
    public void setGeneralSettings(GeneralSettings value) {
        this.generalSettings = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the formatSettings property.
     * 
     * @return
     *     possible object is
     *     {@link FormatSettings }
     *     
     */
    public FormatSettings getFormatSettings() {
        return formatSettings;
    }

    /**
     * Sets the value of the formatSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatSettings }
     *     
     */
    public void setFormatSettings(FormatSettings value) {
        this.formatSettings = value;
    }

    /**
     * Gets the value of the brandingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link BrandingSettings }
     *     
     */
    public BrandingSettings getBrandingSettings() {
        return brandingSettings;
    }

    /**
     * Sets the value of the brandingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingSettings }
     *     
     */
    public void setBrandingSettings(BrandingSettings value) {
        this.brandingSettings = value;
    }

    /**
     * Gets the value of the repliesSettings property.
     * 
     * @return
     *     possible object is
     *     {@link RepliesSettings }
     *     
     */
    public RepliesSettings getRepliesSettings() {
        return repliesSettings;
    }

    /**
     * Sets the value of the repliesSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepliesSettings }
     *     
     */
    public void setRepliesSettings(RepliesSettings value) {
        this.repliesSettings = value;
    }

    /**
     * Gets the value of the allocations property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAllocations }
     *     
     */
    public AccountAllocations getAllocations() {
        return allocations;
    }

    /**
     * Sets the value of the allocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAllocations }
     *     
     */
    public void setAllocations(AccountAllocations value) {
        this.allocations = value;
    }

}
