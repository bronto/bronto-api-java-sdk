
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for contactObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://api.bronto.com/v4}contactField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SMSKeywordIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numSends" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numBounces" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numOpens" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="conversionAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="readOnlyContactData" type="{http://api.bronto.com/v4}readOnlyContactData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactObject", propOrder = {
    "id",
    "email",
    "mobileNumber",
    "status",
    "msgPref",
    "source",
    "customSource",
    "created",
    "modified",
    "deleted",
    "listIds",
    "fields",
    "smsKeywordIDs",
    "numSends",
    "numBounces",
    "numOpens",
    "numClicks",
    "numConversions",
    "conversionAmount",
    "readOnlyContactData"
})
public class ContactObject {

    protected String id;
    protected String email;
    protected String mobileNumber;
    protected String status;
    protected String msgPref;
    protected String source;
    protected String customSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    protected Boolean deleted;
    @XmlElement(nillable = true)
    protected List<String> listIds;
    @XmlElement(nillable = true)
    protected List<ContactField> fields;
    @XmlElement(name = "SMSKeywordIDs", nillable = true)
    protected List<String> smsKeywordIDs;
    protected Long numSends;
    protected Long numBounces;
    protected Long numOpens;
    protected Long numClicks;
    protected Long numConversions;
    protected Float conversionAmount;
    protected ReadOnlyContactData readOnlyContactData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the msgPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPref() {
        return msgPref;
    }

    /**
     * Sets the value of the msgPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPref(String value) {
        this.msgPref = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the customSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomSource() {
        return customSource;
    }

    /**
     * Sets the value of the customSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomSource(String value) {
        this.customSource = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleted(Boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the listIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListIds() {
        if (listIds == null) {
            listIds = new ArrayList<String>();
        }
        return this.listIds;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactField }
     * 
     * 
     */
    public List<ContactField> getFields() {
        if (fields == null) {
            fields = new ArrayList<ContactField>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the smsKeywordIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsKeywordIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMSKeywordIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSMSKeywordIDs() {
        if (smsKeywordIDs == null) {
            smsKeywordIDs = new ArrayList<String>();
        }
        return this.smsKeywordIDs;
    }

    /**
     * Gets the value of the numSends property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumSends() {
        return numSends;
    }

    /**
     * Sets the value of the numSends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumSends(Long value) {
        this.numSends = value;
    }

    /**
     * Gets the value of the numBounces property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumBounces() {
        return numBounces;
    }

    /**
     * Sets the value of the numBounces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumBounces(Long value) {
        this.numBounces = value;
    }

    /**
     * Gets the value of the numOpens property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumOpens() {
        return numOpens;
    }

    /**
     * Sets the value of the numOpens property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumOpens(Long value) {
        this.numOpens = value;
    }

    /**
     * Gets the value of the numClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumClicks() {
        return numClicks;
    }

    /**
     * Sets the value of the numClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumClicks(Long value) {
        this.numClicks = value;
    }

    /**
     * Gets the value of the numConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumConversions() {
        return numConversions;
    }

    /**
     * Sets the value of the numConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumConversions(Long value) {
        this.numConversions = value;
    }

    /**
     * Gets the value of the conversionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConversionAmount() {
        return conversionAmount;
    }

    /**
     * Sets the value of the conversionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConversionAmount(Float value) {
        this.conversionAmount = value;
    }

    /**
     * Gets the value of the readOnlyContactData property.
     * 
     * @return
     *     possible object is
     *     {@link ReadOnlyContactData }
     *     
     */
    public ReadOnlyContactData getReadOnlyContactData() {
        return readOnlyContactData;
    }

    /**
     * Sets the value of the readOnlyContactData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadOnlyContactData }
     *     
     */
    public void setReadOnlyContactData(ReadOnlyContactData value) {
        this.readOnlyContactData = value;
    }

}
