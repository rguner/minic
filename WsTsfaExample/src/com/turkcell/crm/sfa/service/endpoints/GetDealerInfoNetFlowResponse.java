
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDealerInfoNetFlowResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDealerInfoNetFlowResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="cdealer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tdealer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDealerInfoNetFlowResponse", propOrder = {
    "cdealer",
    "resultcode",
    "tdealer"
})
public class GetDealerInfoNetFlowResponse
    extends BaseWsResponse
{

    protected String cdealer;
    protected Integer resultcode;
    protected String tdealer;

    /**
     * Gets the value of the cdealer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdealer() {
        return cdealer;
    }

    /**
     * Sets the value of the cdealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdealer(String value) {
        this.cdealer = value;
    }

    /**
     * Gets the value of the resultcode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultcode() {
        return resultcode;
    }

    /**
     * Sets the value of the resultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultcode(Integer value) {
        this.resultcode = value;
    }

    /**
     * Gets the value of the tdealer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdealer() {
        return tdealer;
    }

    /**
     * Sets the value of the tdealer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdealer(String value) {
        this.tdealer = value;
    }

}
