
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSOLPositionHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSOLPositionHierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOLPositionHierarchyRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}solPositionHierarchyRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSOLPositionHierarchy", propOrder = {
    "solPositionHierarchyRequest"
})
public class GetSOLPositionHierarchy {

    @XmlElement(name = "SOLPositionHierarchyRequest")
    protected SolPositionHierarchyRequest solPositionHierarchyRequest;

    /**
     * Gets the value of the solPositionHierarchyRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SolPositionHierarchyRequest }
     *     
     */
    public SolPositionHierarchyRequest getSOLPositionHierarchyRequest() {
        return solPositionHierarchyRequest;
    }

    /**
     * Sets the value of the solPositionHierarchyRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolPositionHierarchyRequest }
     *     
     */
    public void setSOLPositionHierarchyRequest(SolPositionHierarchyRequest value) {
        this.solPositionHierarchyRequest = value;
    }

}
