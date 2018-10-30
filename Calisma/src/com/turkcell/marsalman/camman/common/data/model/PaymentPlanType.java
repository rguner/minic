
package com.turkcell.marsalman.camman.common.data.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentPlanList" type="{http://model.data.common.camman.marsalman.turkcell.com}ArrayOfPaymentPlan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPlanType", propOrder = {
    "paymentPlanList"
})
public class PaymentPlanType {

    @XmlElementRef(name = "paymentPlanList", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPaymentPlan> paymentPlanList;

    /**
     * Gets the value of the paymentPlanList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentPlan }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPaymentPlan> getPaymentPlanList() {
        return paymentPlanList;
    }

    /**
     * Sets the value of the paymentPlanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPaymentPlan }{@code >}
     *     
     */
    public void setPaymentPlanList(JAXBElement<ArrayOfPaymentPlan> value) {
        this.paymentPlanList = value;
    }

}
