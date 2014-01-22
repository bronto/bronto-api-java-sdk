
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateApiTokens complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateApiTokens">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokens" type="{http://api.bronto.com/v4}apiTokenObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateApiTokens", propOrder = {
    "tokens"
})
public class UpdateApiTokens {

    protected List<ApiTokenObject> tokens;

    /**
     * Gets the value of the tokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiTokenObject }
     * 
     * 
     */
    public List<ApiTokenObject> getTokens() {
        if (tokens == null) {
            tokens = new ArrayList<ApiTokenObject>();
        }
        return this.tokens;
    }

}
