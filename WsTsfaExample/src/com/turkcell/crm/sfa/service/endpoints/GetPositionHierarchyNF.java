
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionHierarchyNF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionHierarchyNF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPositionHierarchyNFRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}getPositionHierarchyNetFlowRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionHierarchyNF", propOrder = {
    "getPositionHierarchyNFRequest"
})
public class GetPositionHierarchyNF {

    @XmlElement(name = "GetPositionHierarchyNFRequest")
    protected GetPositionHierarchyNetFlowRequest getPositionHierarchyNFRequest;

    /**
     * Gets the value of the getPositionHierarchyNFRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionHierarchyNetFlowRequest }
     *     
     */
    public GetPositionHierarchyNetFlowRequest getGetPositionHierarchyNFRequest() {
        return getPositionHierarchyNFRequest;
    }

    /**
     * Sets the value of the getPositionHierarchyNFRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionHierarchyNetFlowRequest }
     *     
     */
    public void setGetPositionHierarchyNFRequest(GetPositionHierarchyNetFlowRequest value) {
        this.getPositionHierarchyNFRequest = value;
    }

}
