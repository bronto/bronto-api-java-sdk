
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateHeaderFooters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateHeaderFooters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="footers" type="{http://api.bronto.com/v4}headerFooterObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateHeaderFooters", propOrder = {
    "footers"
})
public class UpdateHeaderFooters {

    protected List<HeaderFooterObject> footers;

    /**
     * Gets the value of the footers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFooters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderFooterObject }
     * 
     * 
     */
    public List<HeaderFooterObject> getFooters() {
        if (footers == null) {
            footers = new ArrayList<HeaderFooterObject>();
        }
        return this.footers;
    }

}
