
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCampaignMandatoryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCampaignMandatoryDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignMandatoryDefinition" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}CampaignMandatoryDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCampaignMandatoryDefinition", propOrder = {
    "campaignMandatoryDefinition"
})
public class ArrayOfCampaignMandatoryDefinition {

    @XmlElement(name = "CampaignMandatoryDefinition", nillable = true)
    protected List<CampaignMandatoryDefinition> campaignMandatoryDefinition;

    /**
     * Gets the value of the campaignMandatoryDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignMandatoryDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignMandatoryDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignMandatoryDefinition }
     * 
     * 
     */
    public List<CampaignMandatoryDefinition> getCampaignMandatoryDefinition() {
        if (campaignMandatoryDefinition == null) {
            campaignMandatoryDefinition = new ArrayList<CampaignMandatoryDefinition>();
        }
        return this.campaignMandatoryDefinition;
    }

}
