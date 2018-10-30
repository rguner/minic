
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for personalUsageThreshold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="personalUsageThreshold">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultUtVolume" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="digitCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="inquiryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryUnitCoefficient" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalUsageThreshold", propOrder = {
    "defaultUtVolume",
    "digitCount",
    "end",
    "id",
    "inquiryUnit",
    "inquiryUnitCoefficient",
    "start"
})
public class PersonalUsageThreshold
    implements Serializable
{

    protected BigDecimal defaultUtVolume;
    protected Integer digitCount;
    protected BigDecimal end;
    protected Long id;
    protected String inquiryUnit;
    protected BigDecimal inquiryUnitCoefficient;
    protected BigDecimal start;

    /**
     * Gets the value of the defaultUtVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultUtVolume() {
        return defaultUtVolume;
    }

    /**
     * Sets the value of the defaultUtVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultUtVolume(BigDecimal value) {
        this.defaultUtVolume = value;
    }

    /**
     * Gets the value of the digitCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDigitCount() {
        return digitCount;
    }

    /**
     * Sets the value of the digitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDigitCount(Integer value) {
        this.digitCount = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnd(BigDecimal value) {
        this.end = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the inquiryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryUnit() {
        return inquiryUnit;
    }

    /**
     * Sets the value of the inquiryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryUnit(String value) {
        this.inquiryUnit = value;
    }

    /**
     * Gets the value of the inquiryUnitCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInquiryUnitCoefficient() {
        return inquiryUnitCoefficient;
    }

    /**
     * Sets the value of the inquiryUnitCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInquiryUnitCoefficient(BigDecimal value) {
        this.inquiryUnitCoefficient = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStart(BigDecimal value) {
        this.start = value;
    }

}
