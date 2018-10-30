
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSubOrganizationsByOrganizationNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubOrganizationsByOrganizationNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subOrganizationResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}subOrganizationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubOrganizationsByOrganizationNameResponse", propOrder = {
    "subOrganizationResponse"
})
public class GetSubOrganizationsByOrganizationNameResponse {

    protected SubOrganizationResponse subOrganizationResponse;

    /**
     * Gets the value of the subOrganizationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubOrganizationResponse }
     *     
     */
    public SubOrganizationResponse getSubOrganizationResponse() {
        return subOrganizationResponse;
    }

    /**
     * Sets the value of the subOrganizationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubOrganizationResponse }
     *     
     */
    public void setSubOrganizationResponse(SubOrganizationResponse value) {
        this.subOrganizationResponse = value;
    }

}
