
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignFilterDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignFilterDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="filterDefinitionGroups" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfFilterDefinitionGroup" minOccurs="0"/>
 *         &lt;element name="filterType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignFilterDefinition", propOrder = {
    "campaignId",
    "filterDefinitionGroups",
    "filterType"
})
public class CampaignFilterDefinition {

    @XmlElementRef(name = "campaignId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> campaignId;
    @XmlElementRef(name = "filterDefinitionGroups", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFilterDefinitionGroup> filterDefinitionGroups;
    @XmlElementRef(name = "filterType", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> filterType;

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
     * Gets the value of the filterDefinitionGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFilterDefinitionGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFilterDefinitionGroup> getFilterDefinitionGroups() {
        return filterDefinitionGroups;
    }

    /**
     * Sets the value of the filterDefinitionGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFilterDefinitionGroup }{@code >}
     *     
     */
    public void setFilterDefinitionGroups(JAXBElement<ArrayOfFilterDefinitionGroup> value) {
        this.filterDefinitionGroups = value;
    }

    /**
     * Gets the value of the filterType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFilterType() {
        return filterType;
    }

    /**
     * Sets the value of the filterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFilterType(JAXBElement<Long> value) {
        this.filterType = value;
    }

}
