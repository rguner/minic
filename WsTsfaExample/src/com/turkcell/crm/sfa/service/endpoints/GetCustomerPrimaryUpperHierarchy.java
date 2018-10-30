
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerPrimaryUpperHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerPrimaryUpperHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerPrimaryUpperHierarchyGetRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}customerPrimaryUpperHierarchyGetRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerPrimaryUpperHierarchy", propOrder = {
    "customerPrimaryUpperHierarchyGetRequest"
})
public class GetCustomerPrimaryUpperHierarchy {

    protected CustomerPrimaryUpperHierarchyGetRequest customerPrimaryUpperHierarchyGetRequest;

    /**
     * Gets the value of the customerPrimaryUpperHierarchyGetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrimaryUpperHierarchyGetRequest }
     *     
     */
    public CustomerPrimaryUpperHierarchyGetRequest getCustomerPrimaryUpperHierarchyGetRequest() {
        return customerPrimaryUpperHierarchyGetRequest;
    }

    /**
     * Sets the value of the customerPrimaryUpperHierarchyGetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrimaryUpperHierarchyGetRequest }
     *     
     */
    public void setCustomerPrimaryUpperHierarchyGetRequest(CustomerPrimaryUpperHierarchyGetRequest value) {
        this.customerPrimaryUpperHierarchyGetRequest = value;
    }

}
