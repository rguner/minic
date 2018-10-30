
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignMandatoryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignMandatoryDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mandatoryDefinitions" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfMandatoryDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignMandatoryDefinition", propOrder = {
    "campaignId",
    "mandatoryDefinitions"
})
public class CampaignMandatoryDefinition {

    @XmlElementRef(name = "campaignId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> campaignId;
    @XmlElementRef(name = "mandatoryDefinitions", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMandatoryDefinition> mandatoryDefinitions;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCampaignId(JAXBElement<Long> value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the mandatoryDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMandatoryDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMandatoryDefinition> getMandatoryDefinitions() {
        return mandatoryDefinitions;
    }

    /**
     * Sets the value of the mandatoryDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMandatoryDefinition }{@code >}
     *     
     */
    public void setMandatoryDefinitions(JAXBElement<ArrayOfMandatoryDefinition> value) {
        this.mandatoryDefinitions = value;
    }

}
