
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignsDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignsDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankDelayInterestDefinitionList" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfBankDelayInterestDefinition" minOccurs="0"/>
 *         &lt;element name="campaignFilterDefinitions" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfCampaignFilterDefinition" minOccurs="0"/>
 *         &lt;element name="campaignMandatoryDefinitions" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfCampaignMandatoryDefinition" minOccurs="0"/>
 *         &lt;element name="decoupleCampaignList" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfDecoupleCampaign" minOccurs="0"/>
 *         &lt;element name="decoupleOfferTypeList" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfDecoupleOfferType" minOccurs="0"/>
 *         &lt;element name="paymentDetailList" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfPaymentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignsDefinitionType", propOrder = {
    "bankDelayInterestDefinitionList",
    "campaignFilterDefinitions",
    "campaignMandatoryDefinitions",
    "decoupleCampaignList",
    "decoupleOfferTypeList",
    "paymentDetailList"
})
public class CampaignsDefinitionType {

    @XmlElementRef(name = "bankDelayInterestDefinitionList", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBankDelayInterestDefinition> bankDelayInterestDefinitionList;
    @XmlElementRef(name = "campaignFilterDefinitions", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCampaignFilterDefinition> campaignFilterDefinitions;
    @XmlElementRef(name = "campaignMandatoryDefinitions", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCampaignMandatoryDefinition> campaignMandatoryDefinitions;
    @XmlElementRef(name = "decoupleCampaignList", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDecoupleCampaign> decoupleCampaignList;
    @XmlElementRef(name = "decoupleOfferTypeList", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDecoupleOfferType> decoupleOfferTypeList;
    @XmlElementRef(name = "paymentDetailList", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaymentDetail> paymentDetailList;

    /**
     * Gets the value of the bankDelayInterestDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBankDelayInterestDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBankDelayInterestDefinition> getBankDelayInterestDefinitionList() {
        return bankDelayInterestDefinitionList;
    }

    /**
     * Sets the value of the bankDelayInterestDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBankDelayInterestDefinition }{@code >}
     *     
     */
    public void setBankDelayInterestDefinitionList(JAXBElement<ArrayOfBankDelayInterestDefinition> value) {
        this.bankDelayInterestDefinitionList = value;
    }

    /**
     * Gets the value of the campaignFilterDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampaignFilterDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCampaignFilterDefinition> getCampaignFilterDefinitions() {
        return campaignFilterDefinitions;
    }

    /**
     * Sets the value of the campaignFilterDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampaignFilterDefinition }{@code >}
     *     
     */
    public void setCampaignFilterDefinitions(JAXBElement<ArrayOfCampaignFilterDefinition> value) {
        this.campaignFilterDefinitions = value;
    }

    /**
     * Gets the value of the campaignMandatoryDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampaignMandatoryDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCampaignMandatoryDefinition> getCampaignMandatoryDefinitions() {
        return campaignMandatoryDefinitions;
    }

    /**
     * Sets the value of the campaignMandatoryDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCampaignMandatoryDefinition }{@code >}
     *     
     */
    public void setCampaignMandatoryDefinitions(JAXBElement<ArrayOfCampaignMandatoryDefinition> value) {
        this.campaignMandatoryDefinitions = value;
    }

    /**
     * Gets the value of the decoupleCampaignList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDecoupleCampaign }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDecoupleCampaign> getDecoupleCampaignList() {
        return decoupleCampaignList;
    }

    /**
     * Sets the value of the decoupleCampaignList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDecoupleCampaign }{@code >}
     *     
     */
    public void setDecoupleCampaignList(JAXBElement<ArrayOfDecoupleCampaign> value) {
        this.decoupleCampaignList = value;
    }

    /**
     * Gets the value of the decoupleOfferTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDecoupleOfferType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDecoupleOfferType> getDecoupleOfferTypeList() {
        return decoupleOfferTypeList;
    }

    /**
     * Sets the value of the decoupleOfferTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDecoupleOfferType }{@code >}
     *     
     */
    public void setDecoupleOfferTypeList(JAXBElement<ArrayOfDecoupleOfferType> value) {
        this.decoupleOfferTypeList = value;
    }

    /**
     * Gets the value of the paymentDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaymentDetail> getPaymentDetailList() {
        return paymentDetailList;
    }

    /**
     * Sets the value of the paymentDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentDetail }{@code >}
     *     
     */
    public void setPaymentDetailList(JAXBElement<ArrayOfPaymentDetail> value) {
        this.paymentDetailList = value;
    }

}
