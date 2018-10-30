
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionLowerHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionLowerHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionLowerHierarchyResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionLowerHierarchyResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionLowerHierarchyResponse", propOrder = {
    "positionLowerHierarchyResponse"
})
public class GetPositionLowerHierarchyResponse {

    protected PositionLowerHierarchyResponse positionLowerHierarchyResponse;

    /**
     * Gets the value of the positionLowerHierarchyResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PositionLowerHierarchyResponse }
     *     
     */
    public PositionLowerHierarchyResponse getPositionLowerHierarchyResponse() {
        return positionLowerHierarchyResponse;
    }

    /**
     * Sets the value of the positionLowerHierarchyResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionLowerHierarchyResponse }
     *     
     */
    public void setPositionLowerHierarchyResponse(PositionLowerHierarchyResponse value) {
        this.positionLowerHierarchyResponse = value;
    }

}
