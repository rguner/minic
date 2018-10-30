
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="instalment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", propOrder = {
    "aeOfferId",
    "instalment",
    "paymentType"
})
public class PaymentDetail {

    @XmlElementRef(name = "aeOfferId", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> aeOfferId;
    @XmlElementRef(name = "instalment", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> instalment;
    @XmlElementRef(name = "paymentType", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentType;

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
     * Gets the value of the instalment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInstalment() {
        return instalment;
    }

    /**
     * Sets the value of the instalment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInstalment(JAXBElement<Long> value) {
        this.instalment = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentType(JAXBElement<String> value) {
        this.paymentType = value;
    }

}
