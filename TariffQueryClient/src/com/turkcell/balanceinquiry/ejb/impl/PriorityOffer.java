
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for priorityOffer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priorityOffer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://impl.ejb.balanceinquiry.turkcell.com/}ecsOffer">
 *       &lt;sequence>
 *         &lt;element name="accountValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amountUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorPriority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minorPriority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageLimited" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resourceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="resourceType" type="{http://impl.ejb.balanceinquiry.turkcell.com/}resourceType" minOccurs="0"/>
 *         &lt;element name="stoppableOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="upperLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="usageValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="utIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zoneCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priorityOffer", propOrder = {
    "accountValue",
    "amountUnit",
    "inquiryUnit",
    "majorPriority",
    "minorPriority",
    "packageLimited",
    "period",
    "productId",
    "resourceId",
    "resourceType",
    "stoppableOffer",
    "upperLimit",
    "usageValue",
    "utIndex",
    "zoneCategory",
    "zoneType",
    "zoneTypeDesc"
})
public class PriorityOffer
    extends EcsOffer
    implements Serializable
{

    protected BigDecimal accountValue;
    protected String amountUnit;
    protected String inquiryUnit;
    protected Long majorPriority;
    protected Long minorPriority;
    protected boolean packageLimited;
    protected String period;
    protected Long productId;
    protected Long resourceId;
    protected ResourceType resourceType;
    protected boolean stoppableOffer;
    protected BigDecimal upperLimit;
    protected BigDecimal usageValue;
    protected Integer utIndex;
    protected String zoneCategory;
    protected String zoneType;
    protected String zoneTypeDesc;

    /**
     * Gets the value of the accountValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountValue() {
        return accountValue;
    }

    /**
     * Sets the value of the accountValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountValue(BigDecimal value) {
        this.accountValue = value;
    }

    /**
     * Gets the value of the amountUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountUnit() {
        return amountUnit;
    }

    /**
     * Sets the value of the amountUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountUnit(String value) {
        this.amountUnit = value;
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
     * Gets the value of the majorPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMajorPriority() {
        return majorPriority;
    }

    /**
     * Sets the value of the majorPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMajorPriority(Long value) {
        this.majorPriority = value;
    }

    /**
     * Gets the value of the minorPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinorPriority() {
        return minorPriority;
    }

    /**
     * Sets the value of the minorPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinorPriority(Long value) {
        this.minorPriority = value;
    }

    /**
     * Gets the value of the packageLimited property.
     * 
     */
    public boolean isPackageLimited() {
        return packageLimited;
    }

    /**
     * Sets the value of the packageLimited property.
     * 
     */
    public void setPackageLimited(boolean value) {
        this.packageLimited = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the resourceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResourceId(Long value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceType }
     *     
     */
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceType }
     *     
     */
    public void setResourceType(ResourceType value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the stoppableOffer property.
     * 
     */
    public boolean isStoppableOffer() {
        return stoppableOffer;
    }

    /**
     * Sets the value of the stoppableOffer property.
     * 
     */
    public void setStoppableOffer(boolean value) {
        this.stoppableOffer = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperLimit(BigDecimal value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the usageValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsageValue() {
        return usageValue;
    }

    /**
     * Sets the value of the usageValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsageValue(BigDecimal value) {
        this.usageValue = value;
    }

    /**
     * Gets the value of the utIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUtIndex() {
        return utIndex;
    }

    /**
     * Sets the value of the utIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUtIndex(Integer value) {
        this.utIndex = value;
    }

    /**
     * Gets the value of the zoneCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneCategory() {
        return zoneCategory;
    }

    /**
     * Sets the value of the zoneCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneCategory(String value) {
        this.zoneCategory = value;
    }

    /**
     * Gets the value of the zoneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneType() {
        return zoneType;
    }

    /**
     * Sets the value of the zoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneType(String value) {
        this.zoneType = value;
    }

    /**
     * Gets the value of the zoneTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneTypeDesc() {
        return zoneTypeDesc;
    }

    /**
     * Sets the value of the zoneTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneTypeDesc(String value) {
        this.zoneTypeDesc = value;
    }

}
