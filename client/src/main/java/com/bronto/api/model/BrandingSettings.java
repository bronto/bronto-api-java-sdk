
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for brandingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="brandingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandingImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandingImageLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandingImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "brandingSettings", propOrder = {
    "brandingImage",
    "brandingImageLink",
    "brandingImageUrl"
})
public class BrandingSettings {

    protected String brandingImage;
    protected String brandingImageLink;
    protected String brandingImageUrl;

    /**
     * Gets the value of the brandingImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingImage() {
        return brandingImage;
    }

    /**
     * Sets the value of the brandingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingImage(String value) {
        this.brandingImage = value;
    }

    /**
     * Gets the value of the brandingImageLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingImageLink() {
        return brandingImageLink;
    }

    /**
     * Sets the value of the brandingImageLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingImageLink(String value) {
        this.brandingImageLink = value;
    }

    /**
     * Gets the value of the brandingImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandingImageUrl() {
        return brandingImageUrl;
    }

    /**
     * Sets the value of the brandingImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandingImageUrl(String value) {
        this.brandingImageUrl = value;
    }

}
