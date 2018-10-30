
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerPrimaryUpperHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerPrimaryUpperHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerPrimaryUpperHierarchyGetResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}customerPrimaryUpperHierarchyGetResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerPrimaryUpperHierarchyResponse", propOrder = {
    "customerPrimaryUpperHierarchyGetResponse"
})
public class GetCustomerPrimaryUpperHierarchyResponse {

    protected CustomerPrimaryUpperHierarchyGetResponse customerPrimaryUpperHierarchyGetResponse;

    /**
     * Gets the value of the customerPrimaryUpperHierarchyGetResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryUpperHierarchyGetResponse }
     *     
     */
    public CustomerPrimaryUpperHierarchyGetResponse getCustomerPrimaryUpperHierarchyGetResponse() {
        return customerPrimaryUpperHierarchyGetResponse;
    }

    /**
     * Sets the value of the customerPrimaryUpperHierarchyGetResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryUpperHierarchyGetResponse }
     *     
     */
    public void setCustomerPrimaryUpperHierarchyGetResponse(CustomerPrimaryUpperHierarchyGetResponse value) {
        this.customerPrimaryUpperHierarchyGetResponse = value;
    }

}
