
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getCache complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCache">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cacheDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCache", propOrder = {
    "poOfferId",
    "cacheDate"
})
public class GetCache
    implements Serializable
{

    protected String poOfferId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cacheDate;

    /**
     * Gets the value of the poOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoOfferId() {
        return poOfferId;
    }

    /**
     * Sets the value of the poOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoOfferId(String value) {
        this.poOfferId = value;
    }

    /**
     * Gets the value of the cacheDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCacheDate() {
        return cacheDate;
    }

    /**
     * Sets the value of the cacheDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCacheDate(XMLGregorianCalendar value) {
        this.cacheDate = value;
    }

}
