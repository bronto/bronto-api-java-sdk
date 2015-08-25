
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://api.bronto.com/v4}filterType" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://api.bronto.com/v4}stringValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://api.bronto.com/v4}stringValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="created" type="{http://api.bronto.com/v4}dateValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://api.bronto.com/v4}dateValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segmentId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SMSKeywordID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="msgPref" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customSource" type="{http://api.bronto.com/v4}stringValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactFilter", propOrder = {
    "type",
    "id",
    "email",
    "mobileNumber",
    "status",
    "created",
    "modified",
    "listId",
    "segmentId",
    "smsKeywordID",
    "msgPref",
    "source",
    "customSource"
})
public class ContactFilter {

    @XmlSchemaType(name = "string")
    protected FilterType type;
    @XmlElement(nillable = true)
    protected List<String> id;
    @XmlElement(nillable = true)
    protected List<StringValue> email;
    @XmlElement(nillable = true)
    protected List<StringValue> mobileNumber;
    @XmlElement(nillable = true)
    protected List<String> status;
    @XmlElement(nillable = true)
    protected List<DateValue> created;
    @XmlElement(nillable = true)
    protected List<DateValue> modified;
    @XmlElement(nillable = true)
    protected List<String> listId;
    @XmlElement(nillable = true)
    protected List<String> segmentId;
    @XmlElement(name = "SMSKeywordID", nillable = true)
    protected List<String> smsKeywordID;
    @XmlElement(nillable = true)
    protected List<String> msgPref;
    @XmlElement(nillable = true)
    protected List<String> source;
    @XmlElement(nillable = true)
    protected List<StringValue> customSource;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setType(FilterType value) {
        this.type = value;
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
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringValue }
     * 
     * 
     */
    public List<StringValue> getEmail() {
        if (email == null) {
            email = new ArrayList<StringValue>();
        }
        return this.email;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringValue }
     * 
     * 
     */
    public List<StringValue> getMobileNumber() {
        if (mobileNumber == null) {
            mobileNumber = new ArrayList<StringValue>();
        }
        return this.mobileNumber;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatus() {
        if (status == null) {
            status = new ArrayList<String>();
        }
        return this.status;
    }

    /**
     * Gets the value of the created property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the created property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateValue }
     * 
     * 
     */
    public List<DateValue> getCreated() {
        if (created == null) {
            created = new ArrayList<DateValue>();
        }
        return this.created;
    }

    /**
     * Gets the value of the modified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateValue }
     * 
     * 
     */
    public List<DateValue> getModified() {
        if (modified == null) {
            modified = new ArrayList<DateValue>();
        }
        return this.modified;
    }

    /**
     * Gets the value of the listId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListId() {
        if (listId == null) {
            listId = new ArrayList<String>();
        }
        return this.listId;
    }

    /**
     * Gets the value of the segmentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSegmentId() {
        if (segmentId == null) {
            segmentId = new ArrayList<String>();
        }
        return this.segmentId;
    }

    /**
     * Gets the value of the smsKeywordID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsKeywordID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMSKeywordID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSMSKeywordID() {
        if (smsKeywordID == null) {
            smsKeywordID = new ArrayList<String>();
        }
        return this.smsKeywordID;
    }

    /**
     * Gets the value of the msgPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMsgPref() {
        if (msgPref == null) {
            msgPref = new ArrayList<String>();
        }
        return this.msgPref;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSource() {
        if (source == null) {
            source = new ArrayList<String>();
        }
        return this.source;
    }

    /**
     * Gets the value of the customSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringValue }
     * 
     * 
     */
    public List<StringValue> getCustomSource() {
        if (customSource == null) {
            customSource = new ArrayList<StringValue>();
        }
        return this.customSource;
    }

}
