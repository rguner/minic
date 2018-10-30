
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for usagePriceRepresentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="usagePriceRepresentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monetaryUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="piCataLogId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="piName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usagePriceRepresentation", propOrder = {
    "monetaryUnit",
    "monetaryUnitId",
    "piCataLogId",
    "piName",
    "priceValue",
    "sequence",
    "value",
    "valueUnit",
    "valueUnitId",
    "zoneDescription",
    "zoneId",
    "zoneLabel"
})
public class UsagePriceRepresentation
    implements Serializable
{

    protected String monetaryUnit;
    protected Integer monetaryUnitId;
    protected Integer piCataLogId;
    protected String piName;
    protected BigDecimal priceValue;
    protected Integer sequence;
    protected String value;
    protected String valueUnit;
    protected Integer valueUnitId;
    protected String zoneDescription;
    protected String zoneId;
    protected String zoneLabel;

    /**
     * Gets the value of the monetaryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonetaryUnit() {
        return monetaryUnit;
    }

    /**
     * Sets the value of the monetaryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonetaryUnit(String value) {
        this.monetaryUnit = value;
    }

    /**
     * Gets the value of the monetaryUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonetaryUnitId() {
        return monetaryUnitId;
    }

    /**
     * Sets the value of the monetaryUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonetaryUnitId(Integer value) {
        this.monetaryUnitId = value;
    }

    /**
     * Gets the value of the piCataLogId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPiCataLogId() {
        return piCataLogId;
    }

    /**
     * Sets the value of the piCataLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPiCataLogId(Integer value) {
        this.piCataLogId = value;
    }

    /**
     * Gets the value of the piName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiName() {
        return piName;
    }

    /**
     * Sets the value of the piName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiName(String value) {
        this.piName = value;
    }

    /**
     * Gets the value of the priceValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceValue() {
        return priceValue;
    }

    /**
     * Sets the value of the priceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceValue(BigDecimal value) {
        this.priceValue = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueUnit() {
        return valueUnit;
    }

    /**
     * Sets the value of the valueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueUnit(String value) {
        this.valueUnit = value;
    }

    /**
     * Gets the value of the valueUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueUnitId() {
        return valueUnitId;
    }

    /**
     * Sets the value of the valueUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueUnitId(Integer value) {
        this.valueUnitId = value;
    }

    /**
     * Gets the value of the zoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneDescription() {
        return zoneDescription;
    }

    /**
     * Sets the value of the zoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneDescription(String value) {
        this.zoneDescription = value;
    }

    /**
     * Gets the value of the zoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Sets the value of the zoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneId(String value) {
        this.zoneId = value;
    }

    /**
     * Gets the value of the zoneLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneLabel() {
        return zoneLabel;
    }

    /**
     * Sets the value of the zoneLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneLabel(String value) {
        this.zoneLabel = value;
    }

}
