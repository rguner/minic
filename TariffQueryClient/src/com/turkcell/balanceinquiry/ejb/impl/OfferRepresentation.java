
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for offerRepresentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerRepresentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accumulationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountUnitCoefficient" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amountUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="armuParentIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bandWidthLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bundledPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkLimitationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childOfferIdList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constantFee" type="{http://impl.ejb.balanceinquiry.turkcell.com/}fee" minOccurs="0"/>
 *         &lt;element name="daId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ecsOfferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eqosId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryDigitCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="inquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryUnitCoefficient" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="inquiryUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCOfferID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowerBound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="majorPriority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="minorPriority" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="multiplePurchased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerInformationOfferId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="offerInformationOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerDAInquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POOfferName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POParentOfferIdList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="packageBundledPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pamServiceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="parentOfferIdList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalUTInquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personalUsageThresholds" type="{http://impl.ejb.balanceinquiry.turkcell.com/}personalUsageThreshold" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="poOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="policies" type="{http://impl.ejb.balanceinquiry.turkcell.com/}policyElement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="priorityOfferIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productCategories" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sdpaOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharedUcInquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tariffNotificationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upperBound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usagePriceRepresentations" type="{http://impl.ejb.balanceinquiry.turkcell.com/}usagePriceRepresentation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zoneCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="zoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zoneTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerRepresentation", propOrder = {
    "accumulationType",
    "amountUnit",
    "amountUnitCoefficient",
    "amountUnitId",
    "armuParentIdList",
    "bandWidthLimit",
    "bundledPO",
    "checkLimitationType",
    "childOfferIdList",
    "constantFee",
    "daId",
    "daValue",
    "ecsOfferType",
    "endDate",
    "eqosId",
    "inquiryDigitCount",
    "inquiryType",
    "inquiryUnit",
    "inquiryUnitCoefficient",
    "inquiryUnitId",
    "lcOfferID",
    "lcOfferName",
    "limitType",
    "lowerBound",
    "majorPriority",
    "minorPriority",
    "multiplePurchased",
    "notificationSms",
    "offerInformationOfferId",
    "offerInformationOfferName",
    "ownerDAInquiryType",
    "poOfferName",
    "poParentOfferIdList",
    "packageBundledPO",
    "pamServiceType",
    "parentOfferIdList",
    "period",
    "periodId",
    "personalUTInquiryType",
    "personalUsageThresholds",
    "poOfferId",
    "policies",
    "priorityOfferIds",
    "productCategories",
    "productId",
    "productName",
    "productTypeId",
    "sdpaOfferId",
    "sharedUcInquiryType",
    "startDate",
    "tariffNotificationMessage",
    "uaId",
    "ucId",
    "unitCategory",
    "upperBound",
    "usagePriceRepresentations",
    "zoneCategory",
    "zoneSequence",
    "zoneType",
    "zoneTypeDesc",
    "zoneTypeId"
})
public class OfferRepresentation
    implements Serializable
{

    protected String accumulationType;
    protected String amountUnit;
    protected BigDecimal amountUnitCoefficient;
    protected String amountUnitId;
    @XmlElement(nillable = true)
    protected List<String> armuParentIdList;
    protected String bandWidthLimit;
    protected String bundledPO;
    protected String checkLimitationType;
    @XmlElement(nillable = true)
    protected List<Integer> childOfferIdList;
    protected Fee constantFee;
    protected String daId;
    protected String daValue;
    protected String ecsOfferType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected String eqosId;
    protected int inquiryDigitCount;
    protected String inquiryType;
    protected String inquiryUnit;
    protected BigDecimal inquiryUnitCoefficient;
    protected String inquiryUnitId;
    @XmlElement(name = "LCOfferID")
    protected String lcOfferID;
    @XmlElement(name = "LCOfferName")
    protected String lcOfferName;
    protected String limitType;
    protected String lowerBound;
    protected Long majorPriority;
    protected Long minorPriority;
    protected String multiplePurchased;
    protected String notificationSms;
    protected Integer offerInformationOfferId;
    protected String offerInformationOfferName;
    protected String ownerDAInquiryType;
    @XmlElement(name = "POOfferName")
    protected String poOfferName;
    @XmlElement(name = "POParentOfferIdList", nillable = true)
    protected List<Long> poParentOfferIdList;
    protected String packageBundledPO;
    protected Integer pamServiceType;
    @XmlElement(nillable = true)
    protected List<Integer> parentOfferIdList;
    protected String period;
    protected String periodId;
    protected String personalUTInquiryType;
    @XmlElement(nillable = true)
    protected List<PersonalUsageThreshold> personalUsageThresholds;
    protected Long poOfferId;
    @XmlElement(nillable = true)
    protected List<PolicyElement> policies;
    @XmlElement(nillable = true)
    protected List<String> priorityOfferIds;
    @XmlElement(nillable = true)
    protected List<Integer> productCategories;
    protected Integer productId;
    protected String productName;
    protected Integer productTypeId;
    protected String sdpaOfferId;
    protected String sharedUcInquiryType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected String tariffNotificationMessage;
    protected String uaId;
    protected String ucId;
    protected String unitCategory;
    protected String upperBound;
    @XmlElement(nillable = true)
    protected List<UsagePriceRepresentation> usagePriceRepresentations;
    protected String zoneCategory;
    protected Integer zoneSequence;
    protected String zoneType;
    protected String zoneTypeDesc;
    protected String zoneTypeId;

    /**
     * Gets the value of the accumulationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccumulationType() {
        return accumulationType;
    }

    /**
     * Sets the value of the accumulationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccumulationType(String value) {
        this.accumulationType = value;
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
     * Gets the value of the amountUnitCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountUnitCoefficient() {
        return amountUnitCoefficient;
    }

    /**
     * Sets the value of the amountUnitCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountUnitCoefficient(BigDecimal value) {
        this.amountUnitCoefficient = value;
    }

    /**
     * Gets the value of the amountUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountUnitId() {
        return amountUnitId;
    }

    /**
     * Sets the value of the amountUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountUnitId(String value) {
        this.amountUnitId = value;
    }

    /**
     * Gets the value of the armuParentIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the armuParentIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArmuParentIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArmuParentIdList() {
        if (armuParentIdList == null) {
            armuParentIdList = new ArrayList<String>();
        }
        return this.armuParentIdList;
    }

    /**
     * Gets the value of the bandWidthLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandWidthLimit() {
        return bandWidthLimit;
    }

    /**
     * Sets the value of the bandWidthLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandWidthLimit(String value) {
        this.bandWidthLimit = value;
    }

    /**
     * Gets the value of the bundledPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundledPO() {
        return bundledPO;
    }

    /**
     * Sets the value of the bundledPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundledPO(String value) {
        this.bundledPO = value;
    }

    /**
     * Gets the value of the checkLimitationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckLimitationType() {
        return checkLimitationType;
    }

    /**
     * Sets the value of the checkLimitationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckLimitationType(String value) {
        this.checkLimitationType = value;
    }

    /**
     * Gets the value of the childOfferIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childOfferIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildOfferIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getChildOfferIdList() {
        if (childOfferIdList == null) {
            childOfferIdList = new ArrayList<Integer>();
        }
        return this.childOfferIdList;
    }

    /**
     * Gets the value of the constantFee property.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getConstantFee() {
        return constantFee;
    }

    /**
     * Sets the value of the constantFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setConstantFee(Fee value) {
        this.constantFee = value;
    }

    /**
     * Gets the value of the daId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaId() {
        return daId;
    }

    /**
     * Sets the value of the daId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaId(String value) {
        this.daId = value;
    }

    /**
     * Gets the value of the daValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaValue() {
        return daValue;
    }

    /**
     * Sets the value of the daValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaValue(String value) {
        this.daValue = value;
    }

    /**
     * Gets the value of the ecsOfferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcsOfferType() {
        return ecsOfferType;
    }

    /**
     * Sets the value of the ecsOfferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcsOfferType(String value) {
        this.ecsOfferType = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the eqosId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqosId() {
        return eqosId;
    }

    /**
     * Sets the value of the eqosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqosId(String value) {
        this.eqosId = value;
    }

    /**
     * Gets the value of the inquiryDigitCount property.
     * 
     */
    public int getInquiryDigitCount() {
        return inquiryDigitCount;
    }

    /**
     * Sets the value of the inquiryDigitCount property.
     * 
     */
    public void setInquiryDigitCount(int value) {
        this.inquiryDigitCount = value;
    }

    /**
     * Gets the value of the inquiryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryType() {
        return inquiryType;
    }

    /**
     * Sets the value of the inquiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryType(String value) {
        this.inquiryType = value;
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
     * Gets the value of the inquiryUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryUnitId() {
        return inquiryUnitId;
    }

    /**
     * Sets the value of the inquiryUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryUnitId(String value) {
        this.inquiryUnitId = value;
    }

    /**
     * Gets the value of the lcOfferID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCOfferID() {
        return lcOfferID;
    }

    /**
     * Sets the value of the lcOfferID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCOfferID(String value) {
        this.lcOfferID = value;
    }

    /**
     * Gets the value of the lcOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCOfferName() {
        return lcOfferName;
    }

    /**
     * Sets the value of the lcOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCOfferName(String value) {
        this.lcOfferName = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerBound(String value) {
        this.lowerBound = value;
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
     * Gets the value of the multiplePurchased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiplePurchased() {
        return multiplePurchased;
    }

    /**
     * Sets the value of the multiplePurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiplePurchased(String value) {
        this.multiplePurchased = value;
    }

    /**
     * Gets the value of the notificationSms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationSms() {
        return notificationSms;
    }

    /**
     * Sets the value of the notificationSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationSms(String value) {
        this.notificationSms = value;
    }

    /**
     * Gets the value of the offerInformationOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOfferInformationOfferId() {
        return offerInformationOfferId;
    }

    /**
     * Sets the value of the offerInformationOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOfferInformationOfferId(Integer value) {
        this.offerInformationOfferId = value;
    }

    /**
     * Gets the value of the offerInformationOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferInformationOfferName() {
        return offerInformationOfferName;
    }

    /**
     * Sets the value of the offerInformationOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferInformationOfferName(String value) {
        this.offerInformationOfferName = value;
    }

    /**
     * Gets the value of the ownerDAInquiryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerDAInquiryType() {
        return ownerDAInquiryType;
    }

    /**
     * Sets the value of the ownerDAInquiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerDAInquiryType(String value) {
        this.ownerDAInquiryType = value;
    }

    /**
     * Gets the value of the poOfferName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOOfferName() {
        return poOfferName;
    }

    /**
     * Sets the value of the poOfferName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOOfferName(String value) {
        this.poOfferName = value;
    }

    /**
     * Gets the value of the poParentOfferIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poParentOfferIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOParentOfferIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getPOParentOfferIdList() {
        if (poParentOfferIdList == null) {
            poParentOfferIdList = new ArrayList<Long>();
        }
        return this.poParentOfferIdList;
    }

    /**
     * Gets the value of the packageBundledPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageBundledPO() {
        return packageBundledPO;
    }

    /**
     * Sets the value of the packageBundledPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageBundledPO(String value) {
        this.packageBundledPO = value;
    }

    /**
     * Gets the value of the pamServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPamServiceType() {
        return pamServiceType;
    }

    /**
     * Sets the value of the pamServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPamServiceType(Integer value) {
        this.pamServiceType = value;
    }

    /**
     * Gets the value of the parentOfferIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentOfferIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentOfferIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getParentOfferIdList() {
        if (parentOfferIdList == null) {
            parentOfferIdList = new ArrayList<Integer>();
        }
        return this.parentOfferIdList;
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
     * Gets the value of the periodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodId() {
        return periodId;
    }

    /**
     * Sets the value of the periodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodId(String value) {
        this.periodId = value;
    }

    /**
     * Gets the value of the personalUTInquiryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalUTInquiryType() {
        return personalUTInquiryType;
    }

    /**
     * Sets the value of the personalUTInquiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalUTInquiryType(String value) {
        this.personalUTInquiryType = value;
    }

    /**
     * Gets the value of the personalUsageThresholds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalUsageThresholds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalUsageThresholds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalUsageThreshold }
     * 
     * 
     */
    public List<PersonalUsageThreshold> getPersonalUsageThresholds() {
        if (personalUsageThresholds == null) {
            personalUsageThresholds = new ArrayList<PersonalUsageThreshold>();
        }
        return this.personalUsageThresholds;
    }

    /**
     * Gets the value of the poOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoOfferId() {
        return poOfferId;
    }

    /**
     * Sets the value of the poOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoOfferId(Long value) {
        this.poOfferId = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyElement }
     * 
     * 
     */
    public List<PolicyElement> getPolicies() {
        if (policies == null) {
            policies = new ArrayList<PolicyElement>();
        }
        return this.policies;
    }

    /**
     * Gets the value of the priorityOfferIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityOfferIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityOfferIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPriorityOfferIds() {
        if (priorityOfferIds == null) {
            priorityOfferIds = new ArrayList<String>();
        }
        return this.priorityOfferIds;
    }

    /**
     * Gets the value of the productCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getProductCategories() {
        if (productCategories == null) {
            productCategories = new ArrayList<Integer>();
        }
        return this.productCategories;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductId(Integer value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductTypeId() {
        return productTypeId;
    }

    /**
     * Sets the value of the productTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductTypeId(Integer value) {
        this.productTypeId = value;
    }

    /**
     * Gets the value of the sdpaOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdpaOfferId() {
        return sdpaOfferId;
    }

    /**
     * Sets the value of the sdpaOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdpaOfferId(String value) {
        this.sdpaOfferId = value;
    }

    /**
     * Gets the value of the sharedUcInquiryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedUcInquiryType() {
        return sharedUcInquiryType;
    }

    /**
     * Sets the value of the sharedUcInquiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedUcInquiryType(String value) {
        this.sharedUcInquiryType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the tariffNotificationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffNotificationMessage() {
        return tariffNotificationMessage;
    }

    /**
     * Sets the value of the tariffNotificationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffNotificationMessage(String value) {
        this.tariffNotificationMessage = value;
    }

    /**
     * Gets the value of the uaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUaId() {
        return uaId;
    }

    /**
     * Sets the value of the uaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUaId(String value) {
        this.uaId = value;
    }

    /**
     * Gets the value of the ucId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcId() {
        return ucId;
    }

    /**
     * Sets the value of the ucId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcId(String value) {
        this.ucId = value;
    }

    /**
     * Gets the value of the unitCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCategory() {
        return unitCategory;
    }

    /**
     * Sets the value of the unitCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCategory(String value) {
        this.unitCategory = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperBound(String value) {
        this.upperBound = value;
    }

    /**
     * Gets the value of the usagePriceRepresentations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usagePriceRepresentations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsagePriceRepresentations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsagePriceRepresentation }
     * 
     * 
     */
    public List<UsagePriceRepresentation> getUsagePriceRepresentations() {
        if (usagePriceRepresentations == null) {
            usagePriceRepresentations = new ArrayList<UsagePriceRepresentation>();
        }
        return this.usagePriceRepresentations;
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
     * Gets the value of the zoneSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZoneSequence() {
        return zoneSequence;
    }

    /**
     * Sets the value of the zoneSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZoneSequence(Integer value) {
        this.zoneSequence = value;
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

    /**
     * Gets the value of the zoneTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneTypeId() {
        return zoneTypeId;
    }

    /**
     * Sets the value of the zoneTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneTypeId(String value) {
        this.zoneTypeId = value;
    }

}
