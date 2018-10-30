
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignFilterDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignFilterDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignFilterDefinition" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}CampaignFilterDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignFilterDefinition", propOrder = {
    "campaignFilterDefinition"
})
public class ArrayOfCampaignFilterDefinition {

    @XmlElement(name = "CampaignFilterDefinition", nillable = true)
    protected List<CampaignFilterDefinition> campaignFilterDefinition;

    /**
     * Gets the value of the campaignFilterDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignFilterDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignFilterDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignFilterDefinition }
     * 
     * 
     */
    public List<CampaignFilterDefinition> getCampaignFilterDefinition() {
        if (campaignFilterDefinition == null) {
            campaignFilterDefinition = new ArrayList<CampaignFilterDefinition>();
        }
        return this.campaignFilterDefinition;
    }

}
