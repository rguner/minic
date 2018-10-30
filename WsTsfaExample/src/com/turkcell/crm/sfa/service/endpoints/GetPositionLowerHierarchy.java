
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionLowerHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionLowerHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionLowerHierarchyRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionLowerHierarchyRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionLowerHierarchy", propOrder = {
    "positionLowerHierarchyRequest"
})
public class GetPositionLowerHierarchy {

    protected PositionLowerHierarchyRequest positionLowerHierarchyRequest;

    /**
     * Gets the value of the positionLowerHierarchyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PositionLowerHierarchyRequest }
     *     
     */
    public PositionLowerHierarchyRequest getPositionLowerHierarchyRequest() {
        return positionLowerHierarchyRequest;
    }

    /**
     * Sets the value of the positionLowerHierarchyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionLowerHierarchyRequest }
     *     
     */
    public void setPositionLowerHierarchyRequest(PositionLowerHierarchyRequest value) {
        this.positionLowerHierarchyRequest = value;
    }

}
