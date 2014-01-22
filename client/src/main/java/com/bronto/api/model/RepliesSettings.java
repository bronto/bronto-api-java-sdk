
package com.bronto.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repliesSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repliesSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deletedAutomatedReplies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deleteSpam" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deleteUnsubscribeReplies" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="handleUnsubscribes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unsubscribeKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyForwardEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repliesSettings", propOrder = {
    "deletedAutomatedReplies",
    "deleteSpam",
    "deleteUnsubscribeReplies",
    "handleUnsubscribes",
    "unsubscribeKeywords",
    "replyForwardEmail"
})
public class RepliesSettings {

    protected Boolean deletedAutomatedReplies;
    protected Boolean deleteSpam;
    protected Boolean deleteUnsubscribeReplies;
    protected Boolean handleUnsubscribes;
    protected String unsubscribeKeywords;
    protected String replyForwardEmail;

    /**
     * Gets the value of the deletedAutomatedReplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeletedAutomatedReplies() {
        return deletedAutomatedReplies;
    }

    /**
     * Sets the value of the deletedAutomatedReplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeletedAutomatedReplies(Boolean value) {
        this.deletedAutomatedReplies = value;
    }

    /**
     * Gets the value of the deleteSpam property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteSpam() {
        return deleteSpam;
    }

    /**
     * Sets the value of the deleteSpam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteSpam(Boolean value) {
        this.deleteSpam = value;
    }

    /**
     * Gets the value of the deleteUnsubscribeReplies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteUnsubscribeReplies() {
        return deleteUnsubscribeReplies;
    }

    /**
     * Sets the value of the deleteUnsubscribeReplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteUnsubscribeReplies(Boolean value) {
        this.deleteUnsubscribeReplies = value;
    }

    /**
     * Gets the value of the handleUnsubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandleUnsubscribes() {
        return handleUnsubscribes;
    }

    /**
     * Sets the value of the handleUnsubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandleUnsubscribes(Boolean value) {
        this.handleUnsubscribes = value;
    }

    /**
     * Gets the value of the unsubscribeKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubscribeKeywords() {
        return unsubscribeKeywords;
    }

    /**
     * Sets the value of the unsubscribeKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubscribeKeywords(String value) {
        this.unsubscribeKeywords = value;
    }

    /**
     * Gets the value of the replyForwardEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyForwardEmail() {
        return replyForwardEmail;
    }

    /**
     * Sets the value of the replyForwardEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyForwardEmail(String value) {
        this.replyForwardEmail = value;
    }

}
