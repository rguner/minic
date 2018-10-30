
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSubOrganizationsByOrganizationName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubOrganizationsByOrganizationName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subOrganizationRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}subOrganizationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubOrganizationsByOrganizationName", propOrder = {
    "subOrganizationRequest"
})
public class GetSubOrganizationsByOrganizationName {

    protected SubOrganizationRequest subOrganizationRequest;

    /**
     * Gets the value of the subOrganizationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SubOrganizationRequest }
     *     
     */
    public SubOrganizationRequest getSubOrganizationRequest() {
        return subOrganizationRequest;
    }

    /**
     * Sets the value of the subOrganizationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubOrganizationRequest }
     *     
     */
    public void setSubOrganizationRequest(SubOrganizationRequest value) {
        this.subOrganizationRequest = value;
    }

}
