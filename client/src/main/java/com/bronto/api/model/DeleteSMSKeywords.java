
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteSMSKeywords complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteSMSKeywords">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyword" type="{http://api.bronto.com/v4}smsKeywordObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteSMSKeywords", propOrder = {
    "keyword"
})
public class DeleteSMSKeywords {

    protected List<SmsKeywordObject> keyword;

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmsKeywordObject }
     * 
     * 
     */
    public List<SmsKeywordObject> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<SmsKeywordObject>();
        }
        return this.keyword;
    }

}
