
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDealerInfoNFResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDealerInfoNFResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getDealerInfoNFResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}getDealerInfoNetFlowResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDealerInfoNFResponse", propOrder = {
    "getDealerInfoNFResponse"
})
public class GetDealerInfoNFResponse {

    protected GetDealerInfoNetFlowResponse getDealerInfoNFResponse;

    /**
     * Gets the value of the getDealerInfoNFResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetDealerInfoNetFlowResponse }
     *     
     */
    public GetDealerInfoNetFlowResponse getGetDealerInfoNFResponse() {
        return getDealerInfoNFResponse;
    }

    /**
     * Sets the value of the getDealerInfoNFResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDealerInfoNetFlowResponse }
     *     
     */
    public void setGetDealerInfoNFResponse(GetDealerInfoNetFlowResponse value) {
        this.getDealerInfoNFResponse = value;
    }

}
