
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailByNcstResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailByNcstResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="managerusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryusername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saleschannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsaleschannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailByNcstResponse", propOrder = {
    "managerusername",
    "primaryusername",
    "resultcode",
    "saleschannel",
    "subsaleschannel"
})
public class GetPositionDetailByNcstResponse
    extends BaseWsResponse
{

    protected String managerusername;
    protected String primaryusername;
    protected Integer resultcode;
    protected String saleschannel;
    protected String subsaleschannel;

    /**
     * Gets the value of the managerusername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerusername() {
        return managerusername;
    }

    /**
     * Sets the value of the managerusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerusername(String value) {
        this.managerusername = value;
    }

    /**
     * Gets the value of the primaryusername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryusername() {
        return primaryusername;
    }

    /**
     * Sets the value of the primaryusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryusername(String value) {
        this.primaryusername = value;
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
     * Gets the value of the saleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleschannel() {
        return saleschannel;
    }

    /**
     * Sets the value of the saleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleschannel(String value) {
        this.saleschannel = value;
    }

    /**
     * Gets the value of the subsaleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsaleschannel() {
        return subsaleschannel;
    }

    /**
     * Sets the value of the subsaleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsaleschannel(String value) {
        this.subsaleschannel = value;
    }

}
