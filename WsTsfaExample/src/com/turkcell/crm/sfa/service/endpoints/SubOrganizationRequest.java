
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subOrganizationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subOrganizationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsRequest">
 *       &lt;sequence>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subOrganizationRequest", propOrder = {
    "organizationName"
})
public class SubOrganizationRequest
    extends BaseWsRequest
{

    @XmlElement(required = true)
    protected String organizationName;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

}
