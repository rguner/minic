
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.turkcell.marsalman.camman.webservices.service.ArrayOfLong;


/**
 * <p>Java class for MandatoryDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MandatoryDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerTypeIds" type="{http://service.webservices.camman.marsalman.turkcell.com}ArrayOfLong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandatoryDefinition", propOrder = {
    "maxLimit",
    "minLimit",
    "offerTypeIds"
})
public class MandatoryDefinition {

    @XmlElementRef(name = "maxLimit", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> maxLimit;
    @XmlElementRef(name = "minLimit", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> minLimit;
    @XmlElementRef(name = "offerTypeIds", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLong> offerTypeIds;

    /**
     * Gets the value of the maxLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaxLimit() {
        return maxLimit;
    }

    /**
     * Sets the value of the maxLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaxLimit(JAXBElement<Long> value) {
        this.maxLimit = value;
    }

    /**
     * Gets the value of the minLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMinLimit() {
        return minLimit;
    }

    /**
     * Sets the value of the minLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMinLimit(JAXBElement<Long> value) {
        this.minLimit = value;
    }

    /**
     * Gets the value of the offerTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLong> getOfferTypeIds() {
        return offerTypeIds;
    }

    /**
     * Sets the value of the offerTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}
     *     
     */
    public void setOfferTypeIds(JAXBElement<ArrayOfLong> value) {
        this.offerTypeIds = value;
    }

}
