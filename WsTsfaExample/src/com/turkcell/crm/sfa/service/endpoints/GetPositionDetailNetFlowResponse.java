
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionDetailNetFlowResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionDetailNetFlowResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="cprpostnflag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ncst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tlastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tldapname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionDetailNetFlowResponse", propOrder = {
    "cprpostnflag",
    "ncst",
    "resultcode",
    "temail",
    "tfirstname",
    "tlastname",
    "tldapname"
})
public class GetPositionDetailNetFlowResponse
    extends BaseWsResponse
{

    protected Integer cprpostnflag;
    protected Integer ncst;
    protected Integer resultcode;
    protected String temail;
    protected String tfirstname;
    protected String tlastname;
    protected String tldapname;

    /**
     * Gets the value of the cprpostnflag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCprpostnflag() {
        return cprpostnflag;
    }

    /**
     * Sets the value of the cprpostnflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCprpostnflag(Integer value) {
        this.cprpostnflag = value;
    }

    /**
     * Gets the value of the ncst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNcst() {
        return ncst;
    }

    /**
     * Sets the value of the ncst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNcst(Integer value) {
        this.ncst = value;
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
     * Gets the value of the temail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemail() {
        return temail;
    }

    /**
     * Sets the value of the temail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemail(String value) {
        this.temail = value;
    }

    /**
     * Gets the value of the tfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfirstname() {
        return tfirstname;
    }

    /**
     * Sets the value of the tfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfirstname(String value) {
        this.tfirstname = value;
    }

    /**
     * Gets the value of the tlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlastname() {
        return tlastname;
    }

    /**
     * Sets the value of the tlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlastname(String value) {
        this.tlastname = value;
    }

    /**
     * Gets the value of the tldapname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTldapname() {
        return tldapname;
    }

    /**
     * Sets the value of the tldapname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTldapname(String value) {
        this.tldapname = value;
    }

}
