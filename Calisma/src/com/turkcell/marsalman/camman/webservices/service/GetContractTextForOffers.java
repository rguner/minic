
package com.turkcell.marsalman.camman.webservices.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mainOfferId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="detailOfferIdList" type="{http://service.webservices.camman.marsalman.turkcell.com}ArrayOfLong"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignId",
    "mainOfferId",
    "detailOfferIdList",
    "channel",
    "transactionType"
})
@XmlRootElement(name = "getContractTextForOffers")
public class GetContractTextForOffers {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long campaignId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long mainOfferId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLong detailOfferIdList;
    protected int channel;
    @XmlElement(required = true, nillable = true)
    protected String transactionType;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the mainOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainOfferId() {
        return mainOfferId;
    }

    /**
     * Sets the value of the mainOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainOfferId(Long value) {
        this.mainOfferId = value;
    }

    /**
     * Gets the value of the detailOfferIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getDetailOfferIdList() {
        return detailOfferIdList;
    }

    /**
     * Sets the value of the detailOfferIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setDetailOfferIdList(ArrayOfLong value) {
        this.detailOfferIdList = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     */
    public void setChannel(int value) {
        this.channel = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

}
