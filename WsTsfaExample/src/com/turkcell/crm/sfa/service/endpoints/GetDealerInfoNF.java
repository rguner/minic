
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDealerInfoNF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDealerInfoNF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetDealerInfoNFRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}getDealerInfoNetFlowRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDealerInfoNF", propOrder = {
    "getDealerInfoNFRequest"
})
public class GetDealerInfoNF {

    @XmlElement(name = "GetDealerInfoNFRequest")
    protected GetDealerInfoNetFlowRequest getDealerInfoNFRequest;

    /**
     * Gets the value of the getDealerInfoNFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetDealerInfoNetFlowRequest }
     *     
     */
    public GetDealerInfoNetFlowRequest getGetDealerInfoNFRequest() {
        return getDealerInfoNFRequest;
    }

    /**
     * Sets the value of the getDealerInfoNFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDealerInfoNetFlowRequest }
     *     
     */
    public void setGetDealerInfoNFRequest(GetDealerInfoNetFlowRequest value) {
        this.getDealerInfoNFRequest = value;
    }

}
