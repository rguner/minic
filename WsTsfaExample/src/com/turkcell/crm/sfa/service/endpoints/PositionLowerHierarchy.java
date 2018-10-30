
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionLowerHierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionLowerHierarchy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}positionHierarchy">
 *       &lt;sequence>
 *         &lt;element name="parentPostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ctypepostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ttypepostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cstatpostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cstatemp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionLowerHierarchy", propOrder = {
    "parentPostn",
    "ctypepostn",
    "ttypepostn",
    "cstatpostn",
    "cstatemp"
})
public class PositionLowerHierarchy
    extends PositionHierarchy
{

    protected Integer parentPostn;
    protected Integer ctypepostn;
    protected String ttypepostn;
    protected Integer cstatpostn;
    protected Integer cstatemp;

    /**
     * Gets the value of the parentPostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentPostn() {
        return parentPostn;
    }

    /**
     * Sets the value of the parentPostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentPostn(Integer value) {
        this.parentPostn = value;
    }

    /**
     * Gets the value of the ctypepostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCtypepostn() {
        return ctypepostn;
    }

    /**
     * Sets the value of the ctypepostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCtypepostn(Integer value) {
        this.ctypepostn = value;
    }

    /**
     * Gets the value of the ttypepostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtypepostn() {
        return ttypepostn;
    }

    /**
     * Sets the value of the ttypepostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtypepostn(String value) {
        this.ttypepostn = value;
    }

    /**
     * Gets the value of the cstatpostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCstatpostn() {
        return cstatpostn;
    }

    /**
     * Sets the value of the cstatpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCstatpostn(Integer value) {
        this.cstatpostn = value;
    }

    /**
     * Gets the value of the cstatemp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCstatemp() {
        return cstatemp;
    }

    /**
     * Sets the value of the cstatemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCstatemp(Integer value) {
        this.cstatemp = value;
    }

}
