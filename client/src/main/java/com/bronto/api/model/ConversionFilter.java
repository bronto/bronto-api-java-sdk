
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conversionFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conversionFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deliveryId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversionFilter", propOrder = {
    "contactId",
    "deliveryId",
    "id",
    "orderId"
})
public class ConversionFilter {

    @XmlElement(nillable = true)
    protected List<String> contactId;
    @XmlElement(nillable = true)
    protected List<String> deliveryId;
    @XmlElement(nillable = true)
    protected List<String> id;
    @XmlElement(nillable = true)
    protected List<String> orderId;

    /**
     * Gets the value of the contactId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactId() {
        if (contactId == null) {
            contactId = new ArrayList<String>();
        }
        return this.contactId;
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
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getId() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderId() {
        if (orderId == null) {
            orderId = new ArrayList<String>();
        }
        return this.orderId;
    }

}
