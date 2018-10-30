
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DecoupleOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecoupleOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerTypeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecoupleOfferType", propOrder = {
    "aeOfferId",
    "offerTypeDescription",
    "offerTypeId"
})
public class DecoupleOfferType {

    @XmlElementRef(name = "aeOfferId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> aeOfferId;
    @XmlElementRef(name = "offerTypeDescription", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offerTypeDescription;
    @XmlElementRef(name = "offerTypeId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> offerTypeId;

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
     * Gets the value of the offerTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfferTypeDescription() {
        return offerTypeDescription;
    }

    /**
     * Sets the value of the offerTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfferTypeDescription(JAXBElement<String> value) {
        this.offerTypeDescription = value;
    }

    /**
     * Gets the value of the offerTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOfferTypeId() {
        return offerTypeId;
    }

    /**
     * Sets the value of the offerTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOfferTypeId(JAXBElement<Long> value) {
        this.offerTypeId = value;
    }

}
