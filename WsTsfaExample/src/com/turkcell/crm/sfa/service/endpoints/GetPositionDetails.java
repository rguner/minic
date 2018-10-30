
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionDetailsRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionDetailsRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetails", propOrder = {
    "positionDetailsRequest"
})
public class GetPositionDetails {

    protected PositionDetailsRequest positionDetailsRequest;

    /**
     * Gets the value of the positionDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDetailsRequest }
     *     
     */
    public PositionDetailsRequest getPositionDetailsRequest() {
        return positionDetailsRequest;
    }

    /**
     * Sets the value of the positionDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDetailsRequest }
     *     
     */
    public void setPositionDetailsRequest(PositionDetailsRequest value) {
        this.positionDetailsRequest = value;
    }

}
