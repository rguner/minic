
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.turkcell.marsalman.camman.webservices.service.ArrayOfLong;


/**
 * <p>Java class for FilterDefinitionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterDefinitionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obligationDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offers" type="{http://service.webservices.camman.marsalman.turkcell.com}ArrayOfLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterDefinitionGroup", propOrder = {
    "obligationDuration",
    "offers"
})
public class FilterDefinitionGroup {

    @XmlElementRef(name = "obligationDuration", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> obligationDuration;
    @XmlElementRef(name = "offers", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLong> offers;

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
     * Gets the value of the offers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLong> getOffers() {
        return offers;
    }

    /**
     * Sets the value of the offers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}
     *     
     */
    public void setOffers(JAXBElement<ArrayOfLong> value) {
        this.offers = value;
    }

}
