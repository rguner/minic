
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerUkstOrTeleSalesUpperHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerUkstOrTeleSalesUpperHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerUkstOrTeleSalesUpperHierarchyGetResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}customerUkstOrTeleSalesUpperHierarchyGetResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerUkstOrTeleSalesUpperHierarchyResponse", propOrder = {
    "customerUkstOrTeleSalesUpperHierarchyGetResponse"
})
public class GetCustomerUkstOrTeleSalesUpperHierarchyResponse {

    protected CustomerUkstOrTeleSalesUpperHierarchyGetResponse customerUkstOrTeleSalesUpperHierarchyGetResponse;

    /**
     * Gets the value of the customerUkstOrTeleSalesUpperHierarchyGetResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerUkstOrTeleSalesUpperHierarchyGetResponse }
     *     
     */
    public CustomerUkstOrTeleSalesUpperHierarchyGetResponse getCustomerUkstOrTeleSalesUpperHierarchyGetResponse() {
        return customerUkstOrTeleSalesUpperHierarchyGetResponse;
    }

    /**
     * Sets the value of the customerUkstOrTeleSalesUpperHierarchyGetResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerUkstOrTeleSalesUpperHierarchyGetResponse }
     *     
     */
    public void setCustomerUkstOrTeleSalesUpperHierarchyGetResponse(CustomerUkstOrTeleSalesUpperHierarchyGetResponse value) {
        this.customerUkstOrTeleSalesUpperHierarchyGetResponse = value;
    }

}
