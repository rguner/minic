
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subOrganizationDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subOrganizationDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseDto">
 *       &lt;sequence>
 *         &lt;element name="mainOrganizationId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="subOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subOrganizationDto", propOrder = {
    "mainOrganizationId",
    "subOrganizationName"
})
public class SubOrganizationDto
    extends BaseDto
{

    protected Integer mainOrganizationId;
    protected String subOrganizationName;

    /**
     * Gets the value of the mainOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainOrganizationId() {
        return mainOrganizationId;
    }

    /**
     * Sets the value of the mainOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainOrganizationId(Integer value) {
        this.mainOrganizationId = value;
    }

    /**
     * Gets the value of the subOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOrganizationName() {
        return subOrganizationName;
    }

    /**
     * Sets the value of the subOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOrganizationName(String value) {
        this.subOrganizationName = value;
    }

}
