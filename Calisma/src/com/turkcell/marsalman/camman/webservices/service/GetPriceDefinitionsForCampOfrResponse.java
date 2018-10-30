
package com.turkcell.marsalman.camman.webservices.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.turkcell.marsalman.camman.common.data.model.campaigndefinition.PriceDefinitionsType;


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
 *         &lt;element name="out" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}PriceDefinitionsType"/>
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
@XmlRootElement(name = "getPriceDefinitionsForCampOfrResponse")
public class GetPriceDefinitionsForCampOfrResponse {

    @XmlElement(required = true, nillable = true)
    protected PriceDefinitionsType out;

    /**
     * Gets the value of the out property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDefinitionsType }
     *     
     */
    public PriceDefinitionsType getOut() {
        return out;
    }

    /**
     * Sets the value of the out property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDefinitionsType }
     *     
     */
    public void setOut(PriceDefinitionsType value) {
        this.out = value;
    }

}
