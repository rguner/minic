
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPositions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionSearchRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionSearchRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPositions", propOrder = {
    "positionSearchRequest"
})
public class SearchPositions {

    protected PositionSearchRequest positionSearchRequest;

    /**
     * Gets the value of the positionSearchRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSearchRequest }
     *     
     */
    public PositionSearchRequest getPositionSearchRequest() {
        return positionSearchRequest;
    }

    /**
     * Sets the value of the positionSearchRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSearchRequest }
     *     
     */
    public void setPositionSearchRequest(PositionSearchRequest value) {
        this.positionSearchRequest = value;
    }

}
