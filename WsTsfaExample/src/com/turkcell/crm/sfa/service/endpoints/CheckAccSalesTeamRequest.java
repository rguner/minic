
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAccSalesTeamRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAccSalesTeamRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsRequest">
 *       &lt;sequence>
 *         &lt;element name="ncst" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ldapName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAccSalesTeamRequest", propOrder = {
    "ncst",
    "ldapName"
})
public class CheckAccSalesTeamRequest
    extends BaseWsRequest
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer ncst;
    @XmlElement(required = true)
    protected String ldapName;

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
     * Gets the value of the ldapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapName() {
        return ldapName;
    }

    /**
     * Sets the value of the ldapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapName(String value) {
        this.ldapName = value;
    }

}
