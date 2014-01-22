
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addToDeliveryGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addToDeliveryGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryGroup" type="{http://api.bronto.com/v4}deliveryGroupObject" minOccurs="0"/>
 *         &lt;element name="deliveryIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageRuleIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addToDeliveryGroup", propOrder = {
    "deliveryGroup",
    "deliveryIds",
    "messageIds",
    "messageRuleIds"
})
public class AddToDeliveryGroup {

    protected DeliveryGroupObject deliveryGroup;
    protected List<String> deliveryIds;
    protected List<String> messageIds;
    protected List<String> messageRuleIds;

    /**
     * Gets the value of the deliveryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryGroupObject }
     *     
     */
    public DeliveryGroupObject getDeliveryGroup() {
        return deliveryGroup;
    }

    /**
     * Sets the value of the deliveryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryGroupObject }
     *     
     */
    public void setDeliveryGroup(DeliveryGroupObject value) {
        this.deliveryGroup = value;
    }

    /**
     * Gets the value of the deliveryIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryIds() {
        if (deliveryIds == null) {
            deliveryIds = new ArrayList<String>();
        }
        return this.deliveryIds;
    }

    /**
     * Gets the value of the messageIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageIds() {
        if (messageIds == null) {
            messageIds = new ArrayList<String>();
        }
        return this.messageIds;
    }

    /**
     * Gets the value of the messageRuleIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageRuleIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageRuleIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageRuleIds() {
        if (messageRuleIds == null) {
            messageRuleIds = new ArrayList<String>();
        }
        return this.messageRuleIds;
    }

}
