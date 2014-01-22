
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeFromSMSKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeFromSMSKeyword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyword" type="{http://api.bronto.com/v4}smsKeywordObject" minOccurs="0"/>
 *         &lt;element name="contacts" type="{http://api.bronto.com/v4}contactObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeFromSMSKeyword", propOrder = {
    "keyword",
    "contacts"
})
public class RemoveFromSMSKeyword {

    protected SmsKeywordObject keyword;
    protected List<ContactObject> contacts;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link SmsKeywordObject }
     *     
     */
    public SmsKeywordObject getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsKeywordObject }
     *     
     */
    public void setKeyword(SmsKeywordObject value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactObject }
     * 
     * 
     */
    public List<ContactObject> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactObject>();
        }
        return this.contacts;
    }

}
