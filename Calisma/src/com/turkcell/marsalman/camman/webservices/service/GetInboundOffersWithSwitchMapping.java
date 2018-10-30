
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
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxOfferCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="obligatoryFilter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oldObligationIdList" type="{http://service.webservices.camman.marsalman.turkcell.com}ArrayOfLong"/>
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
    "msisdn",
    "channel",
    "maxOfferCount",
    "obligatoryFilter",
    "transactionType",
    "oldObligationIdList"
})
@XmlRootElement(name = "getInboundOffersWithSwitchMapping")
public class GetInboundOffersWithSwitchMapping {

    @XmlElement(required = true, nillable = true)
    protected String msisdn;
    @XmlElement(required = true, nillable = true)
    protected String channel;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxOfferCount;
    protected int obligatoryFilter;
    @XmlElement(required = true, nillable = true)
    protected String transactionType;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLong oldObligationIdList;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the maxOfferCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOfferCount() {
        return maxOfferCount;
    }

    /**
     * Sets the value of the maxOfferCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOfferCount(Integer value) {
        this.maxOfferCount = value;
    }

    /**
     * Gets the value of the obligatoryFilter property.
     * 
     */
    public int getObligatoryFilter() {
        return obligatoryFilter;
    }

    /**
     * Sets the value of the obligatoryFilter property.
     * 
     */
    public void setObligatoryFilter(int value) {
        this.obligatoryFilter = value;
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

    /**
     * Gets the value of the oldObligationIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getOldObligationIdList() {
        return oldObligationIdList;
    }

    /**
     * Sets the value of the oldObligationIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setOldObligationIdList(ArrayOfLong value) {
        this.oldObligationIdList = value;
    }

}
