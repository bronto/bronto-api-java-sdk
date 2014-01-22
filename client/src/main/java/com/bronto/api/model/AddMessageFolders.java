
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMessageFolders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMessageFolders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageFolders" type="{http://api.bronto.com/v4}messageFolderObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMessageFolders", propOrder = {
    "messageFolders"
})
public class AddMessageFolders {

    protected List<MessageFolderObject> messageFolders;

    /**
     * Gets the value of the messageFolders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFolders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFolders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFolderObject }
     * 
     * 
     */
    public List<MessageFolderObject> getMessageFolders() {
        if (messageFolders == null) {
            messageFolders = new ArrayList<MessageFolderObject>();
        }
        return this.messageFolders;
    }

}
