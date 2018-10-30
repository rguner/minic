
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFilterDefinitionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFilterDefinitionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilterDefinitionGroup" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}FilterDefinitionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFilterDefinitionGroup", propOrder = {
    "filterDefinitionGroup"
})
public class ArrayOfFilterDefinitionGroup {

    @XmlElement(name = "FilterDefinitionGroup", nillable = true)
    protected List<FilterDefinitionGroup> filterDefinitionGroup;

    /**
     * Gets the value of the filterDefinitionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterDefinitionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterDefinitionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterDefinitionGroup }
     * 
     * 
     */
    public List<FilterDefinitionGroup> getFilterDefinitionGroup() {
        if (filterDefinitionGroup == null) {
            filterDefinitionGroup = new ArrayList<FilterDefinitionGroup>();
        }
        return this.filterDefinitionGroup;
    }

}
