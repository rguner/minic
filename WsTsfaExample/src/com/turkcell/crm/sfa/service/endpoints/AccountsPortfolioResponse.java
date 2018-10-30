
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountsPortfolioResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountsPortfolioResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialPrivilegeFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsmno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kcmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kcmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ldapLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lnamcst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentEmployeeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentEmployeeFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentEmployeeGsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentEmployeeLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentEmployeeLdapName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionpostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleschannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sradcst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statcst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subregionpostn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsaleschannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradcst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountsPortfolioResponse", propOrder = {
    "city",
    "email",
    "employeeId",
    "financialPrivilegeFlag",
    "firstname",
    "gsmno",
    "kcmCode",
    "kcmName",
    "lastname",
    "ldapLogin",
    "lnamcst",
    "ncst",
    "parentEmployeeEmail",
    "parentEmployeeFirstname",
    "parentEmployeeGsm",
    "parentEmployeeLastname",
    "parentEmployeeLdapName",
    "regionpostn",
    "saleschannel",
    "sradcst",
    "statcst",
    "subregionpostn",
    "subsaleschannel",
    "tradcst"
})
public class AccountsPortfolioResponse
    extends BaseWsResponse
{

    protected String city;
    protected String email;
    protected String employeeId;
    protected Integer financialPrivilegeFlag;
    protected String firstname;
    protected String gsmno;
    protected String kcmCode;
    protected String kcmName;
    protected String lastname;
    protected String ldapLogin;
    protected String lnamcst;
    protected String ncst;
    protected String parentEmployeeEmail;
    protected String parentEmployeeFirstname;
    protected String parentEmployeeGsm;
    protected String parentEmployeeLastname;
    protected String parentEmployeeLdapName;
    protected String regionpostn;
    protected String saleschannel;
    protected String sradcst;
    protected String statcst;
    protected String subregionpostn;
    protected String subsaleschannel;
    protected String tradcst;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the financialPrivilegeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFinancialPrivilegeFlag() {
        return financialPrivilegeFlag;
    }

    /**
     * Sets the value of the financialPrivilegeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFinancialPrivilegeFlag(Integer value) {
        this.financialPrivilegeFlag = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the gsmno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmno() {
        return gsmno;
    }

    /**
     * Sets the value of the gsmno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmno(String value) {
        this.gsmno = value;
    }

    /**
     * Gets the value of the kcmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKcmCode() {
        return kcmCode;
    }

    /**
     * Sets the value of the kcmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKcmCode(String value) {
        this.kcmCode = value;
    }

    /**
     * Gets the value of the kcmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKcmName() {
        return kcmName;
    }

    /**
     * Sets the value of the kcmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKcmName(String value) {
        this.kcmName = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the ldapLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdapLogin() {
        return ldapLogin;
    }

    /**
     * Sets the value of the ldapLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdapLogin(String value) {
        this.ldapLogin = value;
    }

    /**
     * Gets the value of the lnamcst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnamcst() {
        return lnamcst;
    }

    /**
     * Sets the value of the lnamcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnamcst(String value) {
        this.lnamcst = value;
    }

    /**
     * Gets the value of the ncst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcst() {
        return ncst;
    }

    /**
     * Sets the value of the ncst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcst(String value) {
        this.ncst = value;
    }

    /**
     * Gets the value of the parentEmployeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEmployeeEmail() {
        return parentEmployeeEmail;
    }

    /**
     * Sets the value of the parentEmployeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEmployeeEmail(String value) {
        this.parentEmployeeEmail = value;
    }

    /**
     * Gets the value of the parentEmployeeFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEmployeeFirstname() {
        return parentEmployeeFirstname;
    }

    /**
     * Sets the value of the parentEmployeeFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEmployeeFirstname(String value) {
        this.parentEmployeeFirstname = value;
    }

    /**
     * Gets the value of the parentEmployeeGsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEmployeeGsm() {
        return parentEmployeeGsm;
    }

    /**
     * Sets the value of the parentEmployeeGsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEmployeeGsm(String value) {
        this.parentEmployeeGsm = value;
    }

    /**
     * Gets the value of the parentEmployeeLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEmployeeLastname() {
        return parentEmployeeLastname;
    }

    /**
     * Sets the value of the parentEmployeeLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEmployeeLastname(String value) {
        this.parentEmployeeLastname = value;
    }

    /**
     * Gets the value of the parentEmployeeLdapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentEmployeeLdapName() {
        return parentEmployeeLdapName;
    }

    /**
     * Sets the value of the parentEmployeeLdapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentEmployeeLdapName(String value) {
        this.parentEmployeeLdapName = value;
    }

    /**
     * Gets the value of the regionpostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionpostn() {
        return regionpostn;
    }

    /**
     * Sets the value of the regionpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionpostn(String value) {
        this.regionpostn = value;
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
     * Gets the value of the sradcst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSradcst() {
        return sradcst;
    }

    /**
     * Sets the value of the sradcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSradcst(String value) {
        this.sradcst = value;
    }

    /**
     * Gets the value of the statcst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatcst() {
        return statcst;
    }

    /**
     * Sets the value of the statcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatcst(String value) {
        this.statcst = value;
    }

    /**
     * Gets the value of the subregionpostn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubregionpostn() {
        return subregionpostn;
    }

    /**
     * Sets the value of the subregionpostn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubregionpostn(String value) {
        this.subregionpostn = value;
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

    /**
     * Gets the value of the tradcst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradcst() {
        return tradcst;
    }

    /**
     * Sets the value of the tradcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradcst(String value) {
        this.tradcst = value;
    }

}
