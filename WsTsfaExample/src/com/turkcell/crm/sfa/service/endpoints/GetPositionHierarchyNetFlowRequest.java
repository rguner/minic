
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionHierarchyNetFlowRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionHierarchyNetFlowRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWebserviceRequest">
 *       &lt;sequence>
 *         &lt;element name="ncst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionHierarchyNetFlowRequest", propOrder = {
    "ncst"
})
public class GetPositionHierarchyNetFlowRequest
    extends BaseWebserviceRequest
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ncst;

    /**
     * Gets the value of the ncst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNcst() {
        return ncst;
    }

    /**
     * Sets the value of the ncst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNcst(Integer value) {
        this.ncst = value;
    }

}
