
package com.bronto.api.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for readOnlyContactData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readOnlyContactData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoIPCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoIPStateRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoIPZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoIPCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geoIPCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryBrowser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileBrowser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryEmailClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileEmailClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastOrderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastOrderTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="totalOrders" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="averageOrderValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lastDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastClickDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readOnlyContactData", propOrder = {
    "geoIPCity",
    "geoIPStateRegion",
    "geoIPZip",
    "geoIPCountry",
    "geoIPCountryCode",
    "primaryBrowser",
    "mobileBrowser",
    "primaryEmailClient",
    "mobileEmailClient",
    "operatingSystem",
    "firstOrderDate",
    "lastOrderDate",
    "lastOrderTotal",
    "totalOrders",
    "totalRevenue",
    "averageOrderValue",
    "lastDeliveryDate",
    "lastOpenDate",
    "lastClickDate"
})
public class ReadOnlyContactData {

    protected String geoIPCity;
    protected String geoIPStateRegion;
    protected String geoIPZip;
    protected String geoIPCountry;
    protected String geoIPCountryCode;
    protected String primaryBrowser;
    protected String mobileBrowser;
    protected String primaryEmailClient;
    protected String mobileEmailClient;
    protected String operatingSystem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstOrderDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOrderDate;
    protected BigDecimal lastOrderTotal;
    protected Long totalOrders;
    protected BigDecimal totalRevenue;
    protected BigDecimal averageOrderValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastDeliveryDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastOpenDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastClickDate;

    /**
     * Gets the value of the geoIPCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIPCity() {
        return geoIPCity;
    }

    /**
     * Sets the value of the geoIPCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIPCity(String value) {
        this.geoIPCity = value;
    }

    /**
     * Gets the value of the geoIPStateRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIPStateRegion() {
        return geoIPStateRegion;
    }

    /**
     * Sets the value of the geoIPStateRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIPStateRegion(String value) {
        this.geoIPStateRegion = value;
    }

    /**
     * Gets the value of the geoIPZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIPZip() {
        return geoIPZip;
    }

    /**
     * Sets the value of the geoIPZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIPZip(String value) {
        this.geoIPZip = value;
    }

    /**
     * Gets the value of the geoIPCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIPCountry() {
        return geoIPCountry;
    }

    /**
     * Sets the value of the geoIPCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIPCountry(String value) {
        this.geoIPCountry = value;
    }

    /**
     * Gets the value of the geoIPCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoIPCountryCode() {
        return geoIPCountryCode;
    }

    /**
     * Sets the value of the geoIPCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoIPCountryCode(String value) {
        this.geoIPCountryCode = value;
    }

    /**
     * Gets the value of the primaryBrowser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryBrowser() {
        return primaryBrowser;
    }

    /**
     * Sets the value of the primaryBrowser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryBrowser(String value) {
        this.primaryBrowser = value;
    }

    /**
     * Gets the value of the mobileBrowser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileBrowser() {
        return mobileBrowser;
    }

    /**
     * Sets the value of the mobileBrowser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileBrowser(String value) {
        this.mobileBrowser = value;
    }

    /**
     * Gets the value of the primaryEmailClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryEmailClient() {
        return primaryEmailClient;
    }

    /**
     * Sets the value of the primaryEmailClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryEmailClient(String value) {
        this.primaryEmailClient = value;
    }

    /**
     * Gets the value of the mobileEmailClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileEmailClient() {
        return mobileEmailClient;
    }

    /**
     * Sets the value of the mobileEmailClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileEmailClient(String value) {
        this.mobileEmailClient = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the firstOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstOrderDate() {
        return firstOrderDate;
    }

    /**
     * Sets the value of the firstOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstOrderDate(XMLGregorianCalendar value) {
        this.firstOrderDate = value;
    }

    /**
     * Gets the value of the lastOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOrderDate() {
        return lastOrderDate;
    }

    /**
     * Sets the value of the lastOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOrderDate(XMLGregorianCalendar value) {
        this.lastOrderDate = value;
    }

    /**
     * Gets the value of the lastOrderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastOrderTotal() {
        return lastOrderTotal;
    }

    /**
     * Sets the value of the lastOrderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastOrderTotal(BigDecimal value) {
        this.lastOrderTotal = value;
    }

    /**
     * Gets the value of the totalOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalOrders() {
        return totalOrders;
    }

    /**
     * Sets the value of the totalOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalOrders(Long value) {
        this.totalOrders = value;
    }

    /**
     * Gets the value of the totalRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Sets the value of the totalRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRevenue(BigDecimal value) {
        this.totalRevenue = value;
    }

    /**
     * Gets the value of the averageOrderValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageOrderValue() {
        return averageOrderValue;
    }

    /**
     * Sets the value of the averageOrderValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageOrderValue(BigDecimal value) {
        this.averageOrderValue = value;
    }

    /**
     * Gets the value of the lastDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastDeliveryDate() {
        return lastDeliveryDate;
    }

    /**
     * Sets the value of the lastDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastDeliveryDate(XMLGregorianCalendar value) {
        this.lastDeliveryDate = value;
    }

    /**
     * Gets the value of the lastOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastOpenDate() {
        return lastOpenDate;
    }

    /**
     * Sets the value of the lastOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastOpenDate(XMLGregorianCalendar value) {
        this.lastOpenDate = value;
    }

    /**
     * Gets the value of the lastClickDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastClickDate() {
        return lastClickDate;
    }

    /**
     * Sets the value of the lastClickDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastClickDate(XMLGregorianCalendar value) {
        this.lastClickDate = value;
    }

}
