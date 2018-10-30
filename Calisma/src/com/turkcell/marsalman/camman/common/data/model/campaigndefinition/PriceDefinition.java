
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="obligationDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="onlineFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="shelfPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sncode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stampTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDefinition", propOrder = {
    "aeOfferId",
    "campaignId",
    "obligationDuration",
    "offerPrice",
    "onlineFlag",
    "referenceOfferId",
    "shelfPrice",
    "sncode",
    "stampTax"
})
public class PriceDefinition {

    @XmlElementRef(name = "aeOfferId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> aeOfferId;
    @XmlElementRef(name = "campaignId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> campaignId;
    @XmlElementRef(name = "obligationDuration", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> obligationDuration;
    @XmlElementRef(name = "offerPrice", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> offerPrice;
    @XmlElementRef(name = "onlineFlag", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> onlineFlag;
    @XmlElementRef(name = "referenceOfferId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> referenceOfferId;
    @XmlElementRef(name = "shelfPrice", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> shelfPrice;
    @XmlElementRef(name = "sncode", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sncode;
    @XmlElementRef(name = "stampTax", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> stampTax;

    /**
     * Gets the value of the aeOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAeOfferId() {
        return aeOfferId;
    }

    /**
     * Sets the value of the aeOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAeOfferId(JAXBElement<Long> value) {
        this.aeOfferId = value;
    }

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
     * Gets the value of the obligationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getObligationDuration() {
        return obligationDuration;
    }

    /**
     * Sets the value of the obligationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setObligationDuration(JAXBElement<Long> value) {
        this.obligationDuration = value;
    }

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setOfferPrice(JAXBElement<Double> value) {
        this.offerPrice = value;
    }

    /**
     * Gets the value of the onlineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOnlineFlag() {
        return onlineFlag;
    }

    /**
     * Sets the value of the onlineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOnlineFlag(JAXBElement<String> value) {
        this.onlineFlag = value;
    }

    /**
     * Gets the value of the referenceOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReferenceOfferId() {
        return referenceOfferId;
    }

    /**
     * Sets the value of the referenceOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReferenceOfferId(JAXBElement<Long> value) {
        this.referenceOfferId = value;
    }

    /**
     * Gets the value of the shelfPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getShelfPrice() {
        return shelfPrice;
    }

    /**
     * Sets the value of the shelfPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setShelfPrice(JAXBElement<Double> value) {
        this.shelfPrice = value;
    }

    /**
     * Gets the value of the sncode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSncode() {
        return sncode;
    }

    /**
     * Sets the value of the sncode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSncode(JAXBElement<String> value) {
        this.sncode = value;
    }

    /**
     * Gets the value of the stampTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getStampTax() {
        return stampTax;
    }

    /**
     * Sets the value of the stampTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setStampTax(JAXBElement<Double> value) {
        this.stampTax = value;
    }

}
