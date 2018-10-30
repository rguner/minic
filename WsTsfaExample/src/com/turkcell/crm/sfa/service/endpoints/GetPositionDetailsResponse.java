
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionDetailsResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailsResponse", propOrder = {
    "positionDetailsResponse"
})
public class GetPositionDetailsResponse {

    protected PositionDetailsResponse positionDetailsResponse;

    /**
     * Gets the value of the positionDetailsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDetailsResponse }
     *     
     */
    public PositionDetailsResponse getPositionDetailsResponse() {
        return positionDetailsResponse;
    }

    /**
     * Sets the value of the positionDetailsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDetailsResponse }
     *     
     */
    public void setPositionDetailsResponse(PositionDetailsResponse value) {
        this.positionDetailsResponse = value;
    }

}
