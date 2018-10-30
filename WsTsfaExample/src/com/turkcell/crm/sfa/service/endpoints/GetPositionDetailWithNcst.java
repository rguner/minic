
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailWithNcst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailWithNcst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetPositionDetailWithNcstRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}getPositionDetailByNcstRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailWithNcst", propOrder = {
    "getPositionDetailWithNcstRequest"
})
public class GetPositionDetailWithNcst {

    @XmlElement(name = "GetPositionDetailWithNcstRequest")
    protected GetPositionDetailByNcstRequest getPositionDetailWithNcstRequest;

    /**
     * Gets the value of the getPositionDetailWithNcstRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetPositionDetailByNcstRequest }
     *     
     */
    public GetPositionDetailByNcstRequest getGetPositionDetailWithNcstRequest() {
        return getPositionDetailWithNcstRequest;
    }

    /**
     * Sets the value of the getPositionDetailWithNcstRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPositionDetailByNcstRequest }
     *     
     */
    public void setGetPositionDetailWithNcstRequest(GetPositionDetailByNcstRequest value) {
        this.getPositionDetailWithNcstRequest = value;
    }

}
