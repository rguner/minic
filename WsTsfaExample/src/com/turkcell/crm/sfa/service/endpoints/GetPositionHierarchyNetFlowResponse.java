
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionHierarchyNetFlowResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionHierarchyNetFlowResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="dealer_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealer_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager1_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager1_fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager1_organization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager1_position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager1_positiontype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager1_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manager2_fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="position_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultcode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionHierarchyNetFlowResponse", propOrder = {
    "dealerCode",
    "dealerName",
    "employeeEmail",
    "employeeFullname",
    "employeeUsername",
    "manager1Email",
    "manager1Fullname",
    "manager1Organization",
    "manager1Position",
    "manager1Positiontype",
    "manager1Username",
    "manager2Fullname",
    "ncst",
    "positionName",
    "positionType",
    "primary",
    "resultcode"
})
public class GetPositionHierarchyNetFlowResponse
    extends BaseWsResponse
{

    @XmlElement(name = "dealer_code")
    protected String dealerCode;
    @XmlElement(name = "dealer_name")
    protected String dealerName;
    @XmlElement(name = "employee_email")
    protected String employeeEmail;
    @XmlElement(name = "employee_fullname")
    protected String employeeFullname;
    @XmlElement(name = "employee_username")
    protected String employeeUsername;
    @XmlElement(name = "manager1_email")
    protected String manager1Email;
    @XmlElement(name = "manager1_fullname")
    protected String manager1Fullname;
    @XmlElement(name = "manager1_organization")
    protected String manager1Organization;
    @XmlElement(name = "manager1_position")
    protected String manager1Position;
    @XmlElement(name = "manager1_positiontype")
    protected String manager1Positiontype;
    @XmlElement(name = "manager1_username")
    protected String manager1Username;
    @XmlElement(name = "manager2_fullname")
    protected String manager2Fullname;
    protected Integer ncst;
    @XmlElement(name = "position_name")
    protected String positionName;
    @XmlElement(name = "position_type")
    protected String positionType;
    protected Integer primary;
    protected Integer resultcode;

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the dealerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * Sets the value of the dealerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * Gets the value of the employeeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    /**
     * Sets the value of the employeeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeEmail(String value) {
        this.employeeEmail = value;
    }

    /**
     * Gets the value of the employeeFullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeFullname() {
        return employeeFullname;
    }

    /**
     * Sets the value of the employeeFullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeFullname(String value) {
        this.employeeFullname = value;
    }

    /**
     * Gets the value of the employeeUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeUsername() {
        return employeeUsername;
    }

    /**
     * Sets the value of the employeeUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeUsername(String value) {
        this.employeeUsername = value;
    }

    /**
     * Gets the value of the manager1Email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager1Email() {
        return manager1Email;
    }

    /**
     * Sets the value of the manager1Email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager1Email(String value) {
        this.manager1Email = value;
    }

    /**
     * Gets the value of the manager1Fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager1Fullname() {
        return manager1Fullname;
    }

    /**
     * Sets the value of the manager1Fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager1Fullname(String value) {
        this.manager1Fullname = value;
    }

    /**
     * Gets the value of the manager1Organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager1Organization() {
        return manager1Organization;
    }

    /**
     * Sets the value of the manager1Organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager1Organization(String value) {
        this.manager1Organization = value;
    }

    /**
     * Gets the value of the manager1Position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager1Position() {
        return manager1Position;
    }

    /**
     * Sets the value of the manager1Position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager1Position(String value) {
        this.manager1Position = value;
    }

    /**
     * Gets the value of the manager1Positiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager1Positiontype() {
        return manager1Positiontype;
    }

    /**
     * Sets the value of the manager1Positiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager1Positiontype(String value) {
        this.manager1Positiontype = value;
    }

    /**
     * Gets the value of the manager1Username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager1Username() {
        return manager1Username;
    }

    /**
     * Sets the value of the manager1Username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager1Username(String value) {
        this.manager1Username = value;
    }

    /**
     * Gets the value of the manager2Fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManager2Fullname() {
        return manager2Fullname;
    }

    /**
     * Sets the value of the manager2Fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManager2Fullname(String value) {
        this.manager2Fullname = value;
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

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrimary(Integer value) {
        this.primary = value;
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

}
