
package com.bronto.api.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteWorkflows complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteWorkflows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workflows" type="{http://api.bronto.com/v4}workflowObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteWorkflows", propOrder = {
    "workflows"
})
public class DeleteWorkflows {

    protected List<WorkflowObject> workflows;

    /**
     * Gets the value of the workflows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowObject }
     * 
     * 
     */
    public List<WorkflowObject> getWorkflows() {
        if (workflows == null) {
            workflows = new ArrayList<WorkflowObject>();
        }
        return this.workflows;
    }

}
