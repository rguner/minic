
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionHierarchyNFResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionHierarchyNFResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPositionHierarchyNFResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}getPositionHierarchyNetFlowResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionHierarchyNFResponse", propOrder = {
    "getPositionHierarchyNFResponse"
})
public class GetPositionHierarchyNFResponse {

    protected GetPositionHierarchyNetFlowResponse getPositionHierarchyNFResponse;

    /**
     * Gets the value of the getPositionHierarchyNFResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionHierarchyNetFlowResponse }
     *     
     */
    public GetPositionHierarchyNetFlowResponse getGetPositionHierarchyNFResponse() {
        return getPositionHierarchyNFResponse;
    }

    /**
     * Sets the value of the getPositionHierarchyNFResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionHierarchyNetFlowResponse }
     *     
     */
    public void setGetPositionHierarchyNFResponse(GetPositionHierarchyNetFlowResponse value) {
        this.getPositionHierarchyNFResponse = value;
    }

}
