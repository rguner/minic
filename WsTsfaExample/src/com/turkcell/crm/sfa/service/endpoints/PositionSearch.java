
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryLdapName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="positionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organizationType" type="{http://endpoints.service.sfa.crm.turkcell.com/}organizationType"/>
 *         &lt;element name="positionLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionSearch", propOrder = {
    "primaryLdapName",
    "positionId",
    "positionName",
    "positionType",
    "organizationType",
    "positionLevel"
})
public class PositionSearch {

    @XmlElement(required = true, nillable = true)
    protected String primaryLdapName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer positionId;
    @XmlElement(required = true, nillable = true)
    protected String positionName;
    @XmlElement(required = true, nillable = true)
    protected String positionType;
    @XmlElement(required = true, nillable = true)
    protected OrganizationType organizationType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer positionLevel;

    /**
     * Gets the value of the primaryLdapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLdapName() {
        return primaryLdapName;
    }

    /**
     * Sets the value of the primaryLdapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLdapName(String value) {
        this.primaryLdapName = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionId(Integer value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganizationType(OrganizationType value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the positionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionLevel() {
        return positionLevel;
    }

    /**
     * Sets the value of the positionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionLevel(Integer value) {
        this.positionLevel = value;
    }

}
