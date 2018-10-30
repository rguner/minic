
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="position">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="chierarchypostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cregionpostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="csaleschannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cstatpostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="csubregionpostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="csubsaleschannel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cterritory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ctypepostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nemployeecount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="norganization" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nparentpostn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nposition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="primaryFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thierarchypostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tkcmcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tpositionname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tregionpostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tsaleschannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tstatpostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tsubregionpostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tsubsaleschannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tterritory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttypepostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "position", propOrder = {
    "chierarchypostn",
    "cregionpostn",
    "csaleschannel",
    "cstatpostn",
    "csubregionpostn",
    "csubsaleschannel",
    "cterritory",
    "ctypepostn",
    "nemployeecount",
    "norganization",
    "nparentpostn",
    "nposition",
    "primaryFirstName",
    "primaryLastName",
    "thierarchypostn",
    "tkcmcode",
    "tpositionname",
    "tregionpostn",
    "tsaleschannel",
    "tstatpostn",
    "tsubregionpostn",
    "tsubsaleschannel",
    "tterritory",
    "ttypepostn"
})
public class Position
    extends BaseEntity
{

    protected Integer chierarchypostn;
    protected Integer cregionpostn;
    protected Integer csaleschannel;
    protected Integer cstatpostn;
    protected Integer csubregionpostn;
    protected Integer csubsaleschannel;
    protected Integer cterritory;
    protected Integer ctypepostn;
    protected Integer nemployeecount;
    protected Integer norganization;
    protected Integer nparentpostn;
    protected Integer nposition;
    protected String primaryFirstName;
    protected String primaryLastName;
    protected String thierarchypostn;
    protected String tkcmcode;
    protected String tpositionname;
    protected String tregionpostn;
    protected String tsaleschannel;
    protected String tstatpostn;
    protected String tsubregionpostn;
    protected String tsubsaleschannel;
    protected String tterritory;
    protected String ttypepostn;

    /**
     * Gets the value of the chierarchypostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChierarchypostn() {
        return chierarchypostn;
    }

    /**
     * Sets the value of the chierarchypostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChierarchypostn(Integer value) {
        this.chierarchypostn = value;
    }

    /**
     * Gets the value of the cregionpostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCregionpostn() {
        return cregionpostn;
    }

    /**
     * Sets the value of the cregionpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCregionpostn(Integer value) {
        this.cregionpostn = value;
    }

    /**
     * Gets the value of the csaleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCsaleschannel() {
        return csaleschannel;
    }

    /**
     * Sets the value of the csaleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCsaleschannel(Integer value) {
        this.csaleschannel = value;
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
     * Gets the value of the csubregionpostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCsubregionpostn() {
        return csubregionpostn;
    }

    /**
     * Sets the value of the csubregionpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCsubregionpostn(Integer value) {
        this.csubregionpostn = value;
    }

    /**
     * Gets the value of the csubsaleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCsubsaleschannel() {
        return csubsaleschannel;
    }

    /**
     * Sets the value of the csubsaleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCsubsaleschannel(Integer value) {
        this.csubsaleschannel = value;
    }

    /**
     * Gets the value of the cterritory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCterritory() {
        return cterritory;
    }

    /**
     * Sets the value of the cterritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCterritory(Integer value) {
        this.cterritory = value;
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
     * Gets the value of the nemployeecount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNemployeecount() {
        return nemployeecount;
    }

    /**
     * Sets the value of the nemployeecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNemployeecount(Integer value) {
        this.nemployeecount = value;
    }

    /**
     * Gets the value of the norganization property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNorganization() {
        return norganization;
    }

    /**
     * Sets the value of the norganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNorganization(Integer value) {
        this.norganization = value;
    }

    /**
     * Gets the value of the nparentpostn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNparentpostn() {
        return nparentpostn;
    }

    /**
     * Sets the value of the nparentpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNparentpostn(Integer value) {
        this.nparentpostn = value;
    }

    /**
     * Gets the value of the nposition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNposition() {
        return nposition;
    }

    /**
     * Sets the value of the nposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNposition(Integer value) {
        this.nposition = value;
    }

    /**
     * Gets the value of the primaryFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFirstName() {
        return primaryFirstName;
    }

    /**
     * Sets the value of the primaryFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFirstName(String value) {
        this.primaryFirstName = value;
    }

    /**
     * Gets the value of the primaryLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLastName() {
        return primaryLastName;
    }

    /**
     * Sets the value of the primaryLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLastName(String value) {
        this.primaryLastName = value;
    }

    /**
     * Gets the value of the thierarchypostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThierarchypostn() {
        return thierarchypostn;
    }

    /**
     * Sets the value of the thierarchypostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThierarchypostn(String value) {
        this.thierarchypostn = value;
    }

    /**
     * Gets the value of the tkcmcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkcmcode() {
        return tkcmcode;
    }

    /**
     * Sets the value of the tkcmcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkcmcode(String value) {
        this.tkcmcode = value;
    }

    /**
     * Gets the value of the tpositionname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpositionname() {
        return tpositionname;
    }

    /**
     * Sets the value of the tpositionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpositionname(String value) {
        this.tpositionname = value;
    }

    /**
     * Gets the value of the tregionpostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTregionpostn() {
        return tregionpostn;
    }

    /**
     * Sets the value of the tregionpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTregionpostn(String value) {
        this.tregionpostn = value;
    }

    /**
     * Gets the value of the tsaleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsaleschannel() {
        return tsaleschannel;
    }

    /**
     * Sets the value of the tsaleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsaleschannel(String value) {
        this.tsaleschannel = value;
    }

    /**
     * Gets the value of the tstatpostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstatpostn() {
        return tstatpostn;
    }

    /**
     * Sets the value of the tstatpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstatpostn(String value) {
        this.tstatpostn = value;
    }

    /**
     * Gets the value of the tsubregionpostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsubregionpostn() {
        return tsubregionpostn;
    }

    /**
     * Sets the value of the tsubregionpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsubregionpostn(String value) {
        this.tsubregionpostn = value;
    }

    /**
     * Gets the value of the tsubsaleschannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsubsaleschannel() {
        return tsubsaleschannel;
    }

    /**
     * Sets the value of the tsubsaleschannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsubsaleschannel(String value) {
        this.tsubsaleschannel = value;
    }

    /**
     * Gets the value of the tterritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTterritory() {
        return tterritory;
    }

    /**
     * Sets the value of the tterritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTterritory(String value) {
        this.tterritory = value;
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

}
