
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sessionHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sessionHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disableHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessionHeader", propOrder = {
    "sessionId",
    "disableHistory"
})
public class SessionHeader {

    protected String sessionId;
    protected Boolean disableHistory;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the disableHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableHistory() {
        return disableHistory;
    }

    /**
     * Sets the value of the disableHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableHistory(Boolean value) {
        this.disableHistory = value;
    }

}
