
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="employeeStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tstatemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ttypeemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registryNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gsmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ldapName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="functionalGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="team" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="titleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="divisionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unitCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="funcGrCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teamCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="managerLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "employeeStatus",
    "tstatemp",
    "employeeType",
    "ttypeemp",
    "registryNumber",
    "email",
    "firstName",
    "gsmNo",
    "lastName",
    "ldapName",
    "location",
    "telNo",
    "title",
    "division",
    "unit",
    "functionalGroup",
    "team",
    "titleCode",
    "divisionCode",
    "unitCode",
    "funcGrCode",
    "teamCode",
    "managerLogin"
})
public class Employee
    extends BaseEntity
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer employeeStatus;
    protected String tstatemp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer employeeType;
    protected String ttypeemp;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer registryNumber;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String firstName;
    protected String gsmNo;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String ldapName;
    protected String location;
    protected String telNo;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String division;
    @XmlElement(required = true)
    protected String unit;
    @XmlElement(required = true)
    protected String functionalGroup;
    @XmlElement(required = true)
    protected String team;
    @XmlElement(required = true)
    protected String titleCode;
    @XmlElement(required = true)
    protected String divisionCode;
    @XmlElement(required = true)
    protected String unitCode;
    @XmlElement(required = true)
    protected String funcGrCode;
    @XmlElement(required = true)
    protected String teamCode;
    protected String managerLogin;

    /**
     * Gets the value of the employeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * Sets the value of the employeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeStatus(Integer value) {
        this.employeeStatus = value;
    }

    /**
     * Gets the value of the tstatemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstatemp() {
        return tstatemp;
    }

    /**
     * Sets the value of the tstatemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstatemp(String value) {
        this.tstatemp = value;
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeType(Integer value) {
        this.employeeType = value;
    }

    /**
     * Gets the value of the ttypeemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtypeemp() {
        return ttypeemp;
    }

    /**
     * Sets the value of the ttypeemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtypeemp(String value) {
        this.ttypeemp = value;
    }

    /**
     * Gets the value of the registryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistryNumber(Integer value) {
        this.registryNumber = value;
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the gsmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmNo() {
        return gsmNo;
    }

    /**
     * Sets the value of the gsmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmNo(String value) {
        this.gsmNo = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the telNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * Sets the value of the telNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelNo(String value) {
        this.telNo = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the functionalGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalGroup() {
        return functionalGroup;
    }

    /**
     * Sets the value of the functionalGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalGroup(String value) {
        this.functionalGroup = value;
    }

    /**
     * Gets the value of the team property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeam() {
        return team;
    }

    /**
     * Sets the value of the team property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeam(String value) {
        this.team = value;
    }

    /**
     * Gets the value of the titleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * Sets the value of the titleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleCode(String value) {
        this.titleCode = value;
    }

    /**
     * Gets the value of the divisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionCode() {
        return divisionCode;
    }

    /**
     * Sets the value of the divisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionCode(String value) {
        this.divisionCode = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the funcGrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncGrCode() {
        return funcGrCode;
    }

    /**
     * Sets the value of the funcGrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncGrCode(String value) {
        this.funcGrCode = value;
    }

    /**
     * Gets the value of the teamCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamCode() {
        return teamCode;
    }

    /**
     * Sets the value of the teamCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamCode(String value) {
        this.teamCode = value;
    }

    /**
     * Gets the value of the managerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLogin() {
        return managerLogin;
    }

    /**
     * Sets the value of the managerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLogin(String value) {
        this.managerLogin = value;
    }

}
