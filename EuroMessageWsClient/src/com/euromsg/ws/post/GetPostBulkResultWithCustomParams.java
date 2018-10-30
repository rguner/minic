
package com.euromsg.ws.post;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beginDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceTicket",
    "beginDateStr",
    "endDateStr",
    "customParams"
})
@XmlRootElement(name = "GetPostBulkResultWithCustomParams")
public class GetPostBulkResultWithCustomParams
    implements Serializable
{

    protected String serviceTicket;
    protected String beginDateStr;
    protected String endDateStr;
    protected String customParams;

    /**
     * Gets the value of the serviceTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTicket() {
        return serviceTicket;
    }

    /**
     * Sets the value of the serviceTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTicket(String value) {
        this.serviceTicket = value;
    }

    /**
     * Gets the value of the beginDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDateStr() {
        return beginDateStr;
    }

    /**
     * Sets the value of the beginDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDateStr(String value) {
        this.beginDateStr = value;
    }

    /**
     * Gets the value of the endDateStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateStr() {
        return endDateStr;
    }

    /**
     * Sets the value of the endDateStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateStr(String value) {
        this.endDateStr = value;
    }

    /**
     * Gets the value of the customParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomParams() {
        return customParams;
    }

    /**
     * Sets the value of the customParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomParams(String value) {
        this.customParams = value;
    }

}
