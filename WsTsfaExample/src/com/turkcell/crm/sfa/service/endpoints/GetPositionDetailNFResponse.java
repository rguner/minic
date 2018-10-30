
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailNFResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailNFResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPositionDetailNFResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}getPositionDetailNetFlowResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailNFResponse", propOrder = {
    "getPositionDetailNFResponse"
})
public class GetPositionDetailNFResponse {

    protected GetPositionDetailNetFlowResponse getPositionDetailNFResponse;

    /**
     * Gets the value of the getPositionDetailNFResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionDetailNetFlowResponse }
     *     
     */
    public GetPositionDetailNetFlowResponse getGetPositionDetailNFResponse() {
        return getPositionDetailNFResponse;
    }

    /**
     * Sets the value of the getPositionDetailNFResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionDetailNetFlowResponse }
     *     
     */
    public void setGetPositionDetailNFResponse(GetPositionDetailNetFlowResponse value) {
        this.getPositionDetailNFResponse = value;
    }

}
