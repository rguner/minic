
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankDelayInterestDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankDelayInterestDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delayDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="delayInterestCoefficient" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="delayInterestPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankDelayInterestDefinition", propOrder = {
    "cardName",
    "delayDuration",
    "delayInterestCoefficient",
    "delayInterestPercentage"
})
public class BankDelayInterestDefinition {

    @XmlElementRef(name = "cardName", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardName;
    @XmlElementRef(name = "delayDuration", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> delayDuration;
    @XmlElementRef(name = "delayInterestCoefficient", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> delayInterestCoefficient;
    @XmlElementRef(name = "delayInterestPercentage", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> delayInterestPercentage;

    /**
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardName(JAXBElement<String> value) {
        this.cardName = value;
    }

    /**
     * Gets the value of the delayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDelayDuration() {
        return delayDuration;
    }

    /**
     * Sets the value of the delayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDelayDuration(JAXBElement<Long> value) {
        this.delayDuration = value;
    }

    /**
     * Gets the value of the delayInterestCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDelayInterestCoefficient() {
        return delayInterestCoefficient;
    }

    /**
     * Sets the value of the delayInterestCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDelayInterestCoefficient(JAXBElement<Double> value) {
        this.delayInterestCoefficient = value;
    }

    /**
     * Gets the value of the delayInterestPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getDelayInterestPercentage() {
        return delayInterestPercentage;
    }

    /**
     * Sets the value of the delayInterestPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setDelayInterestPercentage(JAXBElement<Double> value) {
        this.delayInterestPercentage = value;
    }

}
