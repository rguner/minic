
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailWithNcstResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailWithNcstResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPositionDetailWithNcstResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}getPositionDetailByNcstResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailWithNcstResponse", propOrder = {
    "getPositionDetailWithNcstResponse"
})
public class GetPositionDetailWithNcstResponse {

    protected GetPositionDetailByNcstResponse getPositionDetailWithNcstResponse;

    /**
     * Gets the value of the getPositionDetailWithNcstResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionDetailByNcstResponse }
     *     
     */
    public GetPositionDetailByNcstResponse getGetPositionDetailWithNcstResponse() {
        return getPositionDetailWithNcstResponse;
    }

    /**
     * Sets the value of the getPositionDetailWithNcstResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionDetailByNcstResponse }
     *     
     */
    public void setGetPositionDetailWithNcstResponse(GetPositionDetailByNcstResponse value) {
        this.getPositionDetailWithNcstResponse = value;
    }

}
