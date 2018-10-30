
package com.turkcell.marsalman.camman.common.data.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfferSimplified complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferSimplified">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="aeOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignLongDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cometParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerDetailedDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSimplified", propOrder = {
    "aeOfferId",
    "aeOfferName",
    "campaignId",
    "campaignLongDesc",
    "cometParameters",
    "offerDetailedDesc",
    "offerShortName"
})
public class OfferSimplified {

    protected Long aeOfferId;
    @XmlElementRef(name = "aeOfferName", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aeOfferName;
    @XmlElementRef(name = "campaignId", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignId;
    @XmlElementRef(name = "campaignLongDesc", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignLongDesc;
    @XmlElementRef(name = "cometParameters", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cometParameters;
    @XmlElementRef(name = "offerDetailedDesc", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerDetailedDesc;
    @XmlElementRef(name = "offerShortName", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerShortName;

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

}
