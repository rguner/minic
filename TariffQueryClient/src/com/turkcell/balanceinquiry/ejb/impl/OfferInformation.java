
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for offerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="offerInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="childOfferInformationList" type="{http://impl.ejb.balanceinquiry.turkcell.com/}offerInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="offerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCategories" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sdpaOfferId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://impl.ejb.balanceinquiry.turkcell.com/}statusCodes" minOccurs="0"/>
 *         &lt;element name="technicalComponentList" type="{http://impl.ejb.balanceinquiry.turkcell.com/}technicalComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "offerInformation", propOrder = {
    "childOfferInformationList",
    "offerId",
    "offerName",
    "productCategories",
    "productType",
    "sdpaOfferId",
    "status",
    "technicalComponentList"
})
public class OfferInformation
    implements Serializable
{

    @XmlElement(nillable = true)
    protected List<OfferInformation> childOfferInformationList;
    protected Long offerId;
    protected String offerName;
    @XmlElement(nillable = true)
    protected List<Integer> productCategories;
    protected Integer productType;
    protected Long sdpaOfferId;
    protected StatusCodes status;
    @XmlElement(nillable = true)
    protected List<TechnicalComponent> technicalComponentList;

    /**
     * Gets the value of the childOfferInformationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childOfferInformationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildOfferInformationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferInformation }
     * 
     * 
     */
    public List<OfferInformation> getChildOfferInformationList() {
        if (childOfferInformationList == null) {
            childOfferInformationList = new ArrayList<OfferInformation>();
        }
        return this.childOfferInformationList;
    }

    /**
     * Gets the value of the offerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferId() {
        return offerId;
    }

    /**
     * Sets the value of the offerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferId(Long value) {
        this.offerId = value;
    }

    /**
     * Gets the value of the offerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Sets the value of the offerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferName(String value) {
        this.offerName = value;
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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductType(Integer value) {
        this.productType = value;
    }

    /**
     * Gets the value of the sdpaOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSdpaOfferId() {
        return sdpaOfferId;
    }

    /**
     * Sets the value of the sdpaOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSdpaOfferId(Long value) {
        this.sdpaOfferId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodes }
     *     
     */
    public StatusCodes getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodes }
     *     
     */
    public void setStatus(StatusCodes value) {
        this.status = value;
    }

    /**
     * Gets the value of the technicalComponentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalComponentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalComponentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalComponent }
     * 
     * 
     */
    public List<TechnicalComponent> getTechnicalComponentList() {
        if (technicalComponentList == null) {
            technicalComponentList = new ArrayList<TechnicalComponent>();
        }
        return this.technicalComponentList;
    }

}
