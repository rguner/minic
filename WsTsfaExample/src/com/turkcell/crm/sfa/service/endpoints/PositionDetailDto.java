
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionDetailDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionDetailDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseDto">
 *       &lt;sequence>
 *         &lt;element name="empEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empGSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empLDAPLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="empSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionEmpName_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionEmpName_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionEmpName_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionEmpSurname_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionEmpSurname_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionEmpSurname_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionLdapName_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionLdapName_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionLdapName_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionName_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionName_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionName_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionType_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionType_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentPositionType_3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionSubRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionDetailDto", propOrder = {
    "empEmail",
    "empGSM",
    "empId",
    "empLDAPLogin",
    "empName",
    "empOrganizationName",
    "empSurname",
    "parentPositionEmpName1",
    "parentPositionEmpName2",
    "parentPositionEmpName3",
    "parentPositionEmpSurname1",
    "parentPositionEmpSurname2",
    "parentPositionEmpSurname3",
    "parentPositionLdapName1",
    "parentPositionLdapName2",
    "parentPositionLdapName3",
    "parentPositionName1",
    "parentPositionName2",
    "parentPositionName3",
    "parentPositionType1",
    "parentPositionType2",
    "parentPositionType3",
    "positionName",
    "positionRegion",
    "positionSubRegion",
    "positionType"
})
public class PositionDetailDto
    extends BaseDto
{

    protected String empEmail;
    protected String empGSM;
    protected String empId;
    protected String empLDAPLogin;
    protected String empName;
    protected String empOrganizationName;
    protected String empSurname;
    @XmlElement(name = "parentPositionEmpName_1")
    protected String parentPositionEmpName1;
    @XmlElement(name = "parentPositionEmpName_2")
    protected String parentPositionEmpName2;
    @XmlElement(name = "parentPositionEmpName_3")
    protected String parentPositionEmpName3;
    @XmlElement(name = "parentPositionEmpSurname_1")
    protected String parentPositionEmpSurname1;
    @XmlElement(name = "parentPositionEmpSurname_2")
    protected String parentPositionEmpSurname2;
    @XmlElement(name = "parentPositionEmpSurname_3")
    protected String parentPositionEmpSurname3;
    @XmlElement(name = "parentPositionLdapName_1")
    protected String parentPositionLdapName1;
    @XmlElement(name = "parentPositionLdapName_2")
    protected String parentPositionLdapName2;
    @XmlElement(name = "parentPositionLdapName_3")
    protected String parentPositionLdapName3;
    @XmlElement(name = "parentPositionName_1")
    protected String parentPositionName1;
    @XmlElement(name = "parentPositionName_2")
    protected String parentPositionName2;
    @XmlElement(name = "parentPositionName_3")
    protected String parentPositionName3;
    @XmlElement(name = "parentPositionType_1")
    protected String parentPositionType1;
    @XmlElement(name = "parentPositionType_2")
    protected String parentPositionType2;
    @XmlElement(name = "parentPositionType_3")
    protected String parentPositionType3;
    protected String positionName;
    protected String positionRegion;
    protected String positionSubRegion;
    protected String positionType;

    /**
     * Gets the value of the empEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpEmail() {
        return empEmail;
    }

    /**
     * Sets the value of the empEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpEmail(String value) {
        this.empEmail = value;
    }

    /**
     * Gets the value of the empGSM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpGSM() {
        return empGSM;
    }

    /**
     * Sets the value of the empGSM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpGSM(String value) {
        this.empGSM = value;
    }

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

    /**
     * Gets the value of the empLDAPLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpLDAPLogin() {
        return empLDAPLogin;
    }

    /**
     * Sets the value of the empLDAPLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpLDAPLogin(String value) {
        this.empLDAPLogin = value;
    }

    /**
     * Gets the value of the empName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the value of the empName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpName(String value) {
        this.empName = value;
    }

    /**
     * Gets the value of the empOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpOrganizationName() {
        return empOrganizationName;
    }

    /**
     * Sets the value of the empOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpOrganizationName(String value) {
        this.empOrganizationName = value;
    }

    /**
     * Gets the value of the empSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpSurname() {
        return empSurname;
    }

    /**
     * Sets the value of the empSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpSurname(String value) {
        this.empSurname = value;
    }

    /**
     * Gets the value of the parentPositionEmpName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionEmpName1() {
        return parentPositionEmpName1;
    }

    /**
     * Sets the value of the parentPositionEmpName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionEmpName1(String value) {
        this.parentPositionEmpName1 = value;
    }

    /**
     * Gets the value of the parentPositionEmpName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionEmpName2() {
        return parentPositionEmpName2;
    }

    /**
     * Sets the value of the parentPositionEmpName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionEmpName2(String value) {
        this.parentPositionEmpName2 = value;
    }

    /**
     * Gets the value of the parentPositionEmpName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionEmpName3() {
        return parentPositionEmpName3;
    }

    /**
     * Sets the value of the parentPositionEmpName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionEmpName3(String value) {
        this.parentPositionEmpName3 = value;
    }

    /**
     * Gets the value of the parentPositionEmpSurname1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionEmpSurname1() {
        return parentPositionEmpSurname1;
    }

    /**
     * Sets the value of the parentPositionEmpSurname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionEmpSurname1(String value) {
        this.parentPositionEmpSurname1 = value;
    }

    /**
     * Gets the value of the parentPositionEmpSurname2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionEmpSurname2() {
        return parentPositionEmpSurname2;
    }

    /**
     * Sets the value of the parentPositionEmpSurname2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionEmpSurname2(String value) {
        this.parentPositionEmpSurname2 = value;
    }

    /**
     * Gets the value of the parentPositionEmpSurname3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionEmpSurname3() {
        return parentPositionEmpSurname3;
    }

    /**
     * Sets the value of the parentPositionEmpSurname3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionEmpSurname3(String value) {
        this.parentPositionEmpSurname3 = value;
    }

    /**
     * Gets the value of the parentPositionLdapName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionLdapName1() {
        return parentPositionLdapName1;
    }

    /**
     * Sets the value of the parentPositionLdapName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionLdapName1(String value) {
        this.parentPositionLdapName1 = value;
    }

    /**
     * Gets the value of the parentPositionLdapName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionLdapName2() {
        return parentPositionLdapName2;
    }

    /**
     * Sets the value of the parentPositionLdapName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionLdapName2(String value) {
        this.parentPositionLdapName2 = value;
    }

    /**
     * Gets the value of the parentPositionLdapName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionLdapName3() {
        return parentPositionLdapName3;
    }

    /**
     * Sets the value of the parentPositionLdapName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionLdapName3(String value) {
        this.parentPositionLdapName3 = value;
    }

    /**
     * Gets the value of the parentPositionName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionName1() {
        return parentPositionName1;
    }

    /**
     * Sets the value of the parentPositionName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionName1(String value) {
        this.parentPositionName1 = value;
    }

    /**
     * Gets the value of the parentPositionName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionName2() {
        return parentPositionName2;
    }

    /**
     * Sets the value of the parentPositionName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionName2(String value) {
        this.parentPositionName2 = value;
    }

    /**
     * Gets the value of the parentPositionName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionName3() {
        return parentPositionName3;
    }

    /**
     * Sets the value of the parentPositionName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionName3(String value) {
        this.parentPositionName3 = value;
    }

    /**
     * Gets the value of the parentPositionType1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionType1() {
        return parentPositionType1;
    }

    /**
     * Sets the value of the parentPositionType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionType1(String value) {
        this.parentPositionType1 = value;
    }

    /**
     * Gets the value of the parentPositionType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionType2() {
        return parentPositionType2;
    }

    /**
     * Sets the value of the parentPositionType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionType2(String value) {
        this.parentPositionType2 = value;
    }

    /**
     * Gets the value of the parentPositionType3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentPositionType3() {
        return parentPositionType3;
    }

    /**
     * Sets the value of the parentPositionType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentPositionType3(String value) {
        this.parentPositionType3 = value;
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    /**
     * Gets the value of the positionRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionRegion() {
        return positionRegion;
    }

    /**
     * Sets the value of the positionRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionRegion(String value) {
        this.positionRegion = value;
    }

    /**
     * Gets the value of the positionSubRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionSubRegion() {
        return positionSubRegion;
    }

    /**
     * Sets the value of the positionSubRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionSubRegion(String value) {
        this.positionSubRegion = value;
    }

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionType(String value) {
        this.positionType = value;
    }

}
