
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMandatoryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMandatoryDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MandatoryDefinition" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}MandatoryDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMandatoryDefinition", propOrder = {
    "mandatoryDefinition"
})
public class ArrayOfMandatoryDefinition {

    @XmlElement(name = "MandatoryDefinition", nillable = true)
    protected List<MandatoryDefinition> mandatoryDefinition;

    /**
     * Gets the value of the mandatoryDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mandatoryDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMandatoryDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandatoryDefinition }
     * 
     * 
     */
    public List<MandatoryDefinition> getMandatoryDefinition() {
        if (mandatoryDefinition == null) {
            mandatoryDefinition = new ArrayList<MandatoryDefinition>();
        }
        return this.mandatoryDefinition;
    }

}
