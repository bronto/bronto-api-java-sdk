
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteSMSDeliveries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSMSDeliveries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsdeliveries" type="{http://api.bronto.com/v4}smsDeliveryObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSMSDeliveries", propOrder = {
    "smsdeliveries"
})
public class DeleteSMSDeliveries {

    protected List<SmsDeliveryObject> smsdeliveries;

    /**
     * Gets the value of the smsdeliveries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsdeliveries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsdeliveries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsDeliveryObject }
     * 
     * 
     */
    public List<SmsDeliveryObject> getSmsdeliveries() {
        if (smsdeliveries == null) {
            smsdeliveries = new ArrayList<SmsDeliveryObject>();
        }
        return this.smsdeliveries;
    }

}
