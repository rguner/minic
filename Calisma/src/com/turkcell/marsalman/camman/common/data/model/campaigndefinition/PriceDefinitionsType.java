
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceDefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceDefinitionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceDefinitionList" type="{http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com}ArrayOfPriceDefinition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceDefinitionsType", propOrder = {
    "priceDefinitionList"
})
public class PriceDefinitionsType {

    @XmlElementRef(name = "priceDefinitionList", namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPriceDefinition> priceDefinitionList;

    /**
     * Gets the value of the priceDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceDefinition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPriceDefinition> getPriceDefinitionList() {
        return priceDefinitionList;
    }

    /**
     * Sets the value of the priceDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPriceDefinition }{@code >}
     *     
     */
    public void setPriceDefinitionList(JAXBElement<ArrayOfPriceDefinition> value) {
        this.priceDefinitionList = value;
    }

}
