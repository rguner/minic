
package com.turkcell.marsalman.camman.webservices.data.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.turkcell.marsalman.camman.common.data.model.ArrayOfOfferSimplified;


/**
 * <p>Java class for GetInboundOffersResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetInboundOffersResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerList" type="{http://model.data.common.camman.marsalman.turkcell.com}ArrayOfOfferSimplified" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetInboundOffersResult", propOrder = {
    "offerList",
    "resultCode",
    "resultDesc"
})
public class GetInboundOffersResult {

    @XmlElementRef(name = "offerList", namespace = "http://model.data.webservices.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOfferSimplified> offerList;
    @XmlElementRef(name = "resultCode", namespace = "http://model.data.webservices.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultCode;
    @XmlElementRef(name = "resultDesc", namespace = "http://model.data.webservices.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultDesc;

    /**
     * Gets the value of the offerList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOfferSimplified }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOfferSimplified> getOfferList() {
        return offerList;
    }

    /**
     * Sets the value of the offerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOfferSimplified }{@code >}
     *     
     */
    public void setOfferList(JAXBElement<ArrayOfOfferSimplified> value) {
        this.offerList = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultCode(JAXBElement<String> value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultDesc() {
        return resultDesc;
    }

    /**
     * Sets the value of the resultDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultDesc(JAXBElement<String> value) {
        this.resultDesc = value;
    }

}
