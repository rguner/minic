
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerUkstOrTeleSalesUpperHierarchyGetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerUkstOrTeleSalesUpperHierarchyGetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}customerUpperHierarchyGetResponse">
 *       &lt;sequence>
 *         &lt;element name="positionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerUkstOrTeleSalesUpperHierarchyGetResponse", propOrder = {
    "positionType"
})
public class CustomerUkstOrTeleSalesUpperHierarchyGetResponse
    extends CustomerUpperHierarchyGetResponse
{

    protected Integer positionType;

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionType(Integer value) {
        this.positionType = value;
    }

}
