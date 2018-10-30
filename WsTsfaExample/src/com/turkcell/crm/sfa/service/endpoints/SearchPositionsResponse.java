
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchPositionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchPositionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionSearchResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionSearchResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPositionsResponse", propOrder = {
    "positionSearchResponse"
})
public class SearchPositionsResponse {

    protected PositionSearchResponse positionSearchResponse;

    /**
     * Gets the value of the positionSearchResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSearchResponse }
     *     
     */
    public PositionSearchResponse getPositionSearchResponse() {
        return positionSearchResponse;
    }

    /**
     * Sets the value of the positionSearchResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSearchResponse }
     *     
     */
    public void setPositionSearchResponse(PositionSearchResponse value) {
        this.positionSearchResponse = value;
    }

}
