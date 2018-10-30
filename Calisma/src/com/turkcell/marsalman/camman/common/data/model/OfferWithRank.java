
package com.turkcell.marsalman.camman.common.data.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OfferWithRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferWithRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="aeOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignLongDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cometParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iaImageLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iaNavigationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iaOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="iaScriptid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iaSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iaWebOfferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inboundVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massMarketFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="massViaia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="negativeOffer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerDetailedDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevAcceptance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="promoStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rankId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="responseApi" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="responseSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferWithRank", propOrder = {
    "aeOfferId",
    "aeOfferName",
    "campaignChannel",
    "campaignCode",
    "campaignId",
    "campaignLongDesc",
    "campaignUserCode",
    "cometParameters",
    "externalId",
    "iaImageLocation",
    "iaNavigationLink",
    "iaOfferId",
    "iaScriptid",
    "iaSummaryText",
    "iaWebOfferType",
    "inboundVisible",
    "massMarketFlag",
    "massViaia",
    "negativeOffer",
    "offerDetailedDesc",
    "offerShortName",
    "offerType",
    "prevAcceptance",
    "promoEndDate",
    "promoStartDate",
    "rankId",
    "responseApi",
    "responseSystem",
    "validationKey"
})
public class OfferWithRank {

    protected Long aeOfferId;
    @XmlElementRef(name = "aeOfferName", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aeOfferName;
    @XmlElementRef(name = "campaignChannel", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignChannel;
    @XmlElementRef(name = "campaignCode", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignCode;
    @XmlElementRef(name = "campaignId", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignId;
    @XmlElementRef(name = "campaignLongDesc", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignLongDesc;
    @XmlElementRef(name = "campaignUserCode", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignUserCode;
    @XmlElementRef(name = "cometParameters", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cometParameters;
    @XmlElementRef(name = "externalId", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalId;
    @XmlElementRef(name = "iaImageLocation", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaImageLocation;
    @XmlElementRef(name = "iaNavigationLink", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaNavigationLink;
    protected Long iaOfferId;
    @XmlElementRef(name = "iaScriptid", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaScriptid;
    @XmlElementRef(name = "iaSummaryText", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaSummaryText;
    @XmlElementRef(name = "iaWebOfferType", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iaWebOfferType;
    @XmlElementRef(name = "inboundVisible", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inboundVisible;
    @XmlElementRef(name = "massMarketFlag", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> massMarketFlag;
    @XmlElementRef(name = "massViaia", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> massViaia;
    @XmlElementRef(name = "negativeOffer", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> negativeOffer;
    @XmlElementRef(name = "offerDetailedDesc", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerDetailedDesc;
    @XmlElementRef(name = "offerShortName", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerShortName;
    @XmlElementRef(name = "offerType", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerType;
    @XmlElementRef(name = "prevAcceptance", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prevAcceptance;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar promoEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar promoStartDate;
    @XmlElementRef(name = "rankId", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rankId;
    protected Long responseApi;
    @XmlElementRef(name = "responseSystem", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseSystem;
    @XmlElementRef(name = "validationKey", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validationKey;

    /**
     * Gets the value of the aeOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAeOfferId() {
        return aeOfferId;
    }

    /**
     * Sets the value of the aeOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAeOfferId(Long value) {
        this.aeOfferId = value;
    }

    /**
     * Gets the value of the aeOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAeOfferName() {
        return aeOfferName;
    }

    /**
     * Sets the value of the aeOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAeOfferName(JAXBElement<String> value) {
        this.aeOfferName = value;
    }

    /**
     * Gets the value of the campaignChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignChannel() {
        return campaignChannel;
    }

    /**
     * Sets the value of the campaignChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignChannel(JAXBElement<String> value) {
        this.campaignChannel = value;
    }

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignCode(JAXBElement<String> value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignId(JAXBElement<String> value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignLongDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignLongDesc() {
        return campaignLongDesc;
    }

    /**
     * Sets the value of the campaignLongDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignLongDesc(JAXBElement<String> value) {
        this.campaignLongDesc = value;
    }

    /**
     * Gets the value of the campaignUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignUserCode() {
        return campaignUserCode;
    }

    /**
     * Sets the value of the campaignUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignUserCode(JAXBElement<String> value) {
        this.campaignUserCode = value;
    }

    /**
     * Gets the value of the cometParameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCometParameters() {
        return cometParameters;
    }

    /**
     * Sets the value of the cometParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCometParameters(JAXBElement<String> value) {
        this.cometParameters = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExternalId(JAXBElement<String> value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the iaImageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaImageLocation() {
        return iaImageLocation;
    }

    /**
     * Sets the value of the iaImageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaImageLocation(JAXBElement<String> value) {
        this.iaImageLocation = value;
    }

    /**
     * Gets the value of the iaNavigationLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaNavigationLink() {
        return iaNavigationLink;
    }

    /**
     * Sets the value of the iaNavigationLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaNavigationLink(JAXBElement<String> value) {
        this.iaNavigationLink = value;
    }

    /**
     * Gets the value of the iaOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIaOfferId() {
        return iaOfferId;
    }

    /**
     * Sets the value of the iaOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIaOfferId(Long value) {
        this.iaOfferId = value;
    }

    /**
     * Gets the value of the iaScriptid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaScriptid() {
        return iaScriptid;
    }

    /**
     * Sets the value of the iaScriptid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaScriptid(JAXBElement<String> value) {
        this.iaScriptid = value;
    }

    /**
     * Gets the value of the iaSummaryText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaSummaryText() {
        return iaSummaryText;
    }

    /**
     * Sets the value of the iaSummaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaSummaryText(JAXBElement<String> value) {
        this.iaSummaryText = value;
    }

    /**
     * Gets the value of the iaWebOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIaWebOfferType() {
        return iaWebOfferType;
    }

    /**
     * Sets the value of the iaWebOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIaWebOfferType(JAXBElement<String> value) {
        this.iaWebOfferType = value;
    }

    /**
     * Gets the value of the inboundVisible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInboundVisible() {
        return inboundVisible;
    }

    /**
     * Sets the value of the inboundVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInboundVisible(JAXBElement<String> value) {
        this.inboundVisible = value;
    }

    /**
     * Gets the value of the massMarketFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMassMarketFlag() {
        return massMarketFlag;
    }

    /**
     * Sets the value of the massMarketFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMassMarketFlag(JAXBElement<String> value) {
        this.massMarketFlag = value;
    }

    /**
     * Gets the value of the massViaia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMassViaia() {
        return massViaia;
    }

    /**
     * Sets the value of the massViaia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMassViaia(JAXBElement<String> value) {
        this.massViaia = value;
    }

    /**
     * Gets the value of the negativeOffer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNegativeOffer() {
        return negativeOffer;
    }

    /**
     * Sets the value of the negativeOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNegativeOffer(JAXBElement<String> value) {
        this.negativeOffer = value;
    }

    /**
     * Gets the value of the offerDetailedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferDetailedDesc() {
        return offerDetailedDesc;
    }

    /**
     * Sets the value of the offerDetailedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferDetailedDesc(JAXBElement<String> value) {
        this.offerDetailedDesc = value;
    }

    /**
     * Gets the value of the offerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferShortName() {
        return offerShortName;
    }

    /**
     * Sets the value of the offerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferShortName(JAXBElement<String> value) {
        this.offerShortName = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferType(JAXBElement<String> value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the prevAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrevAcceptance() {
        return prevAcceptance;
    }

    /**
     * Sets the value of the prevAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrevAcceptance(JAXBElement<String> value) {
        this.prevAcceptance = value;
    }

    /**
     * Gets the value of the promoEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromoEndDate() {
        return promoEndDate;
    }

    /**
     * Sets the value of the promoEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromoEndDate(XMLGregorianCalendar value) {
        this.promoEndDate = value;
    }

    /**
     * Gets the value of the promoStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromoStartDate() {
        return promoStartDate;
    }

    /**
     * Sets the value of the promoStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromoStartDate(XMLGregorianCalendar value) {
        this.promoStartDate = value;
    }

    /**
     * Gets the value of the rankId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRankId() {
        return rankId;
    }

    /**
     * Sets the value of the rankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRankId(JAXBElement<Long> value) {
        this.rankId = value;
    }

    /**
     * Gets the value of the responseApi property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponseApi() {
        return responseApi;
    }

    /**
     * Sets the value of the responseApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponseApi(Long value) {
        this.responseApi = value;
    }

    /**
     * Gets the value of the responseSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseSystem() {
        return responseSystem;
    }

    /**
     * Sets the value of the responseSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseSystem(JAXBElement<String> value) {
        this.responseSystem = value;
    }

    /**
     * Gets the value of the validationKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidationKey() {
        return validationKey;
    }

    /**
     * Sets the value of the validationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidationKey(JAXBElement<String> value) {
        this.validationKey = value;
    }

}
