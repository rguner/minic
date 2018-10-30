
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailNF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailNF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPositionDetailNFRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}getPositionDetailNetFlowRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailNF", propOrder = {
    "getPositionDetailNFRequest"
})
public class GetPositionDetailNF {

    @XmlElement(name = "GetPositionDetailNFRequest")
    protected GetPositionDetailNetFlowRequest getPositionDetailNFRequest;

    /**
     * Gets the value of the getPositionDetailNFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionDetailNetFlowRequest }
     *     
     */
    public GetPositionDetailNetFlowRequest getGetPositionDetailNFRequest() {
        return getPositionDetailNFRequest;
    }

    /**
     * Sets the value of the getPositionDetailNFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionDetailNetFlowRequest }
     *     
     */
    public void setGetPositionDetailNFRequest(GetPositionDetailNetFlowRequest value) {
        this.getPositionDetailNFRequest = value;
    }

}
