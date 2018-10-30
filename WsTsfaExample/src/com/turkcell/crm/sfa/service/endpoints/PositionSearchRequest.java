
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionSearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWebserviceRequest">
 *       &lt;sequence>
 *         &lt;element name="positionSearch" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionSearch"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionSearchRequest", propOrder = {
    "positionSearch"
})
public class PositionSearchRequest
    extends BaseWebserviceRequest
{

    @XmlElement(required = true)
    protected PositionSearch positionSearch;

    /**
     * Gets the value of the positionSearch property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSearch }
     *     
     */
    public PositionSearch getPositionSearch() {
        return positionSearch;
    }

    /**
     * Sets the value of the positionSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSearch }
     *     
     */
    public void setPositionSearch(PositionSearch value) {
        this.positionSearch = value;
    }

}
