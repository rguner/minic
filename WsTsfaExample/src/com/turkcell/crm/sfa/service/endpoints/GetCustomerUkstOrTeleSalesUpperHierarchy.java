
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCustomerUkstOrTeleSalesUpperHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCustomerUkstOrTeleSalesUpperHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerUkstOrTeleSalesUpperHierarchyGetRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}customerUkstOrTeleSalesUpperHierarchyGetRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerUkstOrTeleSalesUpperHierarchy", propOrder = {
    "customerUkstOrTeleSalesUpperHierarchyGetRequest"
})
public class GetCustomerUkstOrTeleSalesUpperHierarchy {

    protected CustomerUkstOrTeleSalesUpperHierarchyGetRequest customerUkstOrTeleSalesUpperHierarchyGetRequest;

    /**
     * Gets the value of the customerUkstOrTeleSalesUpperHierarchyGetRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerUkstOrTeleSalesUpperHierarchyGetRequest }
     *     
     */
    public CustomerUkstOrTeleSalesUpperHierarchyGetRequest getCustomerUkstOrTeleSalesUpperHierarchyGetRequest() {
        return customerUkstOrTeleSalesUpperHierarchyGetRequest;
    }

    /**
     * Sets the value of the customerUkstOrTeleSalesUpperHierarchyGetRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerUkstOrTeleSalesUpperHierarchyGetRequest }
     *     
     */
    public void setCustomerUkstOrTeleSalesUpperHierarchyGetRequest(CustomerUkstOrTeleSalesUpperHierarchyGetRequest value) {
        this.customerUkstOrTeleSalesUpperHierarchyGetRequest = value;
    }

}
