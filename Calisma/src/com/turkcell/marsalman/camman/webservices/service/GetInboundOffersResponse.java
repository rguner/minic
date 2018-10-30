
package com.turkcell.marsalman.camman.webservices.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.turkcell.marsalman.camman.common.data.model.ArrayOfOfferSimplified;


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
 *         &lt;element name="out" type="{http://model.data.common.camman.marsalman.turkcell.com}ArrayOfOfferSimplified"/>
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
    "out"
})
@XmlRootElement(name = "getInboundOffersResponse")
public class GetInboundOffersResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfOfferSimplified out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOfferSimplified }
     *     
     */
    public ArrayOfOfferSimplified getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOfferSimplified }
     *     
     */
    public void setOut(ArrayOfOfferSimplified value) {
        this.out = value;
    }

}
