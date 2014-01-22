
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addOrUpdateDeliveryGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addOrUpdateDeliveryGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryGroups" type="{http://api.bronto.com/v4}deliveryGroupObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addOrUpdateDeliveryGroup", propOrder = {
    "deliveryGroups"
})
public class AddOrUpdateDeliveryGroup {

    protected List<DeliveryGroupObject> deliveryGroups;

    /**
     * Gets the value of the deliveryGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryGroupObject }
     * 
     * 
     */
    public List<DeliveryGroupObject> getDeliveryGroups() {
        if (deliveryGroups == null) {
            deliveryGroups = new ArrayList<DeliveryGroupObject>();
        }
        return this.deliveryGroups;
    }

}
