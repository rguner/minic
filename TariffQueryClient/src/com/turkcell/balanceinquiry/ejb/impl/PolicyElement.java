
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policyElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="policyElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrenceCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utVolume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "policyElement", propOrder = {
    "name",
    "recurrenceCount",
    "utId",
    "utVolume"
})
public class PolicyElement
    implements Serializable
{

    protected String name;
    protected String recurrenceCount;
    protected String utId;
    protected String utVolume;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the recurrenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrenceCount() {
        return recurrenceCount;
    }

    /**
     * Sets the value of the recurrenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrenceCount(String value) {
        this.recurrenceCount = value;
    }

    /**
     * Gets the value of the utId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtId() {
        return utId;
    }

    /**
     * Sets the value of the utId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtId(String value) {
        this.utId = value;
    }

    /**
     * Gets the value of the utVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtVolume() {
        return utVolume;
    }

    /**
     * Sets the value of the utVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtVolume(String value) {
        this.utVolume = value;
    }

}
