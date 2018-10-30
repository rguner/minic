
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSOLPositionHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSOLPositionHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOLPositionHierarchyResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}solPositionHierarchyResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSOLPositionHierarchyResponse", propOrder = {
    "solPositionHierarchyResponse"
})
public class GetSOLPositionHierarchyResponse {

    @XmlElement(name = "SOLPositionHierarchyResponse")
    protected SolPositionHierarchyResponse solPositionHierarchyResponse;

    /**
     * Gets the value of the solPositionHierarchyResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SolPositionHierarchyResponse }
     *     
     */
    public SolPositionHierarchyResponse getSOLPositionHierarchyResponse() {
        return solPositionHierarchyResponse;
    }

    /**
     * Sets the value of the solPositionHierarchyResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolPositionHierarchyResponse }
     *     
     */
    public void setSOLPositionHierarchyResponse(SolPositionHierarchyResponse value) {
        this.solPositionHierarchyResponse = value;
    }

}
