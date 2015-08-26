
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deliveryGroupFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryGroupFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryGroupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listByType" type="{http://api.bronto.com/v4}memberType" minOccurs="0"/>
 *         &lt;element name="automatorId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="messageGroupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://api.bronto.com/v4}stringValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryGroupFilter", propOrder = {
    "deliveryGroupId",
    "listByType",
    "automatorId",
    "messageGroupId",
    "deliveryId",
    "name"
})
public class DeliveryGroupFilter {

    @XmlElement(nillable = true)
    protected List<String> deliveryGroupId;
    @XmlSchemaType(name = "string")
    protected MemberType listByType;
    @XmlElement(nillable = true)
    protected List<String> automatorId;
    @XmlElement(nillable = true)
    protected List<String> messageGroupId;
    @XmlElement(nillable = true)
    protected List<String> deliveryId;
    @XmlElement(nillable = true)
    protected List<StringValue> name;

    /**
     * Gets the value of the deliveryGroupId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryGroupId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryGroupId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryGroupId() {
        if (deliveryGroupId == null) {
            deliveryGroupId = new ArrayList<String>();
        }
        return this.deliveryGroupId;
    }

    /**
     * Gets the value of the listByType property.
     * 
     * @return
     *     possible object is
     *     {@link MemberType }
     *     
     */
    public MemberType getListByType() {
        return listByType;
    }

    /**
     * Sets the value of the listByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberType }
     *     
     */
    public void setListByType(MemberType value) {
        this.listByType = value;
    }

    /**
     * Gets the value of the automatorId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the automatorId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutomatorId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAutomatorId() {
        if (automatorId == null) {
            automatorId = new ArrayList<String>();
        }
        return this.automatorId;
    }

    /**
     * Gets the value of the messageGroupId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageGroupId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageGroupId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMessageGroupId() {
        if (messageGroupId == null) {
            messageGroupId = new ArrayList<String>();
        }
        return this.messageGroupId;
    }

    /**
     * Gets the value of the deliveryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeliveryId() {
        if (deliveryId == null) {
            deliveryId = new ArrayList<String>();
        }
        return this.deliveryId;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringValue }
     * 
     * 
     */
    public List<StringValue> getName() {
        if (name == null) {
            name = new ArrayList<StringValue>();
        }
        return this.name;
    }

}
