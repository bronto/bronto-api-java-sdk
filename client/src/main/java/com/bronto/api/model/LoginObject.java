
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loginObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactInformation" type="{http://api.bronto.com/v4}contactInformation" minOccurs="0"/>
 *         &lt;element name="permissionAgencyAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionAdmin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionFatigueOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionMessageCompose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionMessageApprove" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionMessageDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionAutomatorCompose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionListCreateSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionListCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionSegmentCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionFieldCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionFieldReorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionSubscriberCreate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="permissionSubscriberView" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginObject", propOrder = {
    "username",
    "password",
    "contactInformation",
    "permissionAgencyAdmin",
    "permissionAdmin",
    "permissionApi",
    "permissionUpgrade",
    "permissionFatigueOverride",
    "permissionMessageCompose",
    "permissionMessageApprove",
    "permissionMessageDelete",
    "permissionAutomatorCompose",
    "permissionListCreateSend",
    "permissionListCreate",
    "permissionSegmentCreate",
    "permissionFieldCreate",
    "permissionFieldReorder",
    "permissionSubscriberCreate",
    "permissionSubscriberView"
})
public class LoginObject {

    protected String username;
    protected String password;
    protected ContactInformation contactInformation;
    protected Boolean permissionAgencyAdmin;
    protected Boolean permissionAdmin;
    protected Boolean permissionApi;
    protected Boolean permissionUpgrade;
    protected Boolean permissionFatigueOverride;
    protected Boolean permissionMessageCompose;
    protected Boolean permissionMessageApprove;
    protected Boolean permissionMessageDelete;
    protected Boolean permissionAutomatorCompose;
    protected Boolean permissionListCreateSend;
    protected Boolean permissionListCreate;
    protected Boolean permissionSegmentCreate;
    protected Boolean permissionFieldCreate;
    protected Boolean permissionFieldReorder;
    protected Boolean permissionSubscriberCreate;
    protected Boolean permissionSubscriberView;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the permissionAgencyAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionAgencyAdmin() {
        return permissionAgencyAdmin;
    }

    /**
     * Sets the value of the permissionAgencyAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionAgencyAdmin(Boolean value) {
        this.permissionAgencyAdmin = value;
    }

    /**
     * Gets the value of the permissionAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionAdmin() {
        return permissionAdmin;
    }

    /**
     * Sets the value of the permissionAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionAdmin(Boolean value) {
        this.permissionAdmin = value;
    }

    /**
     * Gets the value of the permissionApi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionApi() {
        return permissionApi;
    }

    /**
     * Sets the value of the permissionApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionApi(Boolean value) {
        this.permissionApi = value;
    }

    /**
     * Gets the value of the permissionUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionUpgrade() {
        return permissionUpgrade;
    }

    /**
     * Sets the value of the permissionUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionUpgrade(Boolean value) {
        this.permissionUpgrade = value;
    }

    /**
     * Gets the value of the permissionFatigueOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionFatigueOverride() {
        return permissionFatigueOverride;
    }

    /**
     * Sets the value of the permissionFatigueOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionFatigueOverride(Boolean value) {
        this.permissionFatigueOverride = value;
    }

    /**
     * Gets the value of the permissionMessageCompose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionMessageCompose() {
        return permissionMessageCompose;
    }

    /**
     * Sets the value of the permissionMessageCompose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionMessageCompose(Boolean value) {
        this.permissionMessageCompose = value;
    }

    /**
     * Gets the value of the permissionMessageApprove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionMessageApprove() {
        return permissionMessageApprove;
    }

    /**
     * Sets the value of the permissionMessageApprove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionMessageApprove(Boolean value) {
        this.permissionMessageApprove = value;
    }

    /**
     * Gets the value of the permissionMessageDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionMessageDelete() {
        return permissionMessageDelete;
    }

    /**
     * Sets the value of the permissionMessageDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionMessageDelete(Boolean value) {
        this.permissionMessageDelete = value;
    }

    /**
     * Gets the value of the permissionAutomatorCompose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionAutomatorCompose() {
        return permissionAutomatorCompose;
    }

    /**
     * Sets the value of the permissionAutomatorCompose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionAutomatorCompose(Boolean value) {
        this.permissionAutomatorCompose = value;
    }

    /**
     * Gets the value of the permissionListCreateSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionListCreateSend() {
        return permissionListCreateSend;
    }

    /**
     * Sets the value of the permissionListCreateSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionListCreateSend(Boolean value) {
        this.permissionListCreateSend = value;
    }

    /**
     * Gets the value of the permissionListCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionListCreate() {
        return permissionListCreate;
    }

    /**
     * Sets the value of the permissionListCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionListCreate(Boolean value) {
        this.permissionListCreate = value;
    }

    /**
     * Gets the value of the permissionSegmentCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionSegmentCreate() {
        return permissionSegmentCreate;
    }

    /**
     * Sets the value of the permissionSegmentCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionSegmentCreate(Boolean value) {
        this.permissionSegmentCreate = value;
    }

    /**
     * Gets the value of the permissionFieldCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionFieldCreate() {
        return permissionFieldCreate;
    }

    /**
     * Sets the value of the permissionFieldCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionFieldCreate(Boolean value) {
        this.permissionFieldCreate = value;
    }

    /**
     * Gets the value of the permissionFieldReorder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionFieldReorder() {
        return permissionFieldReorder;
    }

    /**
     * Sets the value of the permissionFieldReorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionFieldReorder(Boolean value) {
        this.permissionFieldReorder = value;
    }

    /**
     * Gets the value of the permissionSubscriberCreate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionSubscriberCreate() {
        return permissionSubscriberCreate;
    }

    /**
     * Sets the value of the permissionSubscriberCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionSubscriberCreate(Boolean value) {
        this.permissionSubscriberCreate = value;
    }

    /**
     * Gets the value of the permissionSubscriberView property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermissionSubscriberView() {
        return permissionSubscriberView;
    }

    /**
     * Sets the value of the permissionSubscriberView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermissionSubscriberView(Boolean value) {
        this.permissionSubscriberView = value;
    }

}
