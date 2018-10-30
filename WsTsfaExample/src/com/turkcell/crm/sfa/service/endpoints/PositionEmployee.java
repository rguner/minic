
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionEmployee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionEmployee">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="npostnemployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cstatpostnemployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tstatpostnemployee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctypepostnemployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ttypepostnemployee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nemployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="employee" type="{http://endpoints.service.sfa.crm.turkcell.com/}employee" minOccurs="0"/>
 *         &lt;element name="nposition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="position" type="{http://endpoints.service.sfa.crm.turkcell.com/}position" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionEmployee", propOrder = {
    "npostnemployee",
    "cstatpostnemployee",
    "tstatpostnemployee",
    "ctypepostnemployee",
    "ttypepostnemployee",
    "nemployee",
    "employee",
    "nposition",
    "position"
})
public class PositionEmployee
    extends BaseEntity
{

    protected Integer npostnemployee;
    protected Integer cstatpostnemployee;
    protected String tstatpostnemployee;
    protected Integer ctypepostnemployee;
    protected String ttypepostnemployee;
    protected Integer nemployee;
    protected Employee employee;
    protected Integer nposition;
    protected Position position;

    /**
     * Gets the value of the npostnemployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNpostnemployee() {
        return npostnemployee;
    }

    /**
     * Sets the value of the npostnemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNpostnemployee(Integer value) {
        this.npostnemployee = value;
    }

    /**
     * Gets the value of the cstatpostnemployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCstatpostnemployee() {
        return cstatpostnemployee;
    }

    /**
     * Sets the value of the cstatpostnemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCstatpostnemployee(Integer value) {
        this.cstatpostnemployee = value;
    }

    /**
     * Gets the value of the tstatpostnemployee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstatpostnemployee() {
        return tstatpostnemployee;
    }

    /**
     * Sets the value of the tstatpostnemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstatpostnemployee(String value) {
        this.tstatpostnemployee = value;
    }

    /**
     * Gets the value of the ctypepostnemployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCtypepostnemployee() {
        return ctypepostnemployee;
    }

    /**
     * Sets the value of the ctypepostnemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCtypepostnemployee(Integer value) {
        this.ctypepostnemployee = value;
    }

    /**
     * Gets the value of the ttypepostnemployee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtypepostnemployee() {
        return ttypepostnemployee;
    }

    /**
     * Sets the value of the ttypepostnemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtypepostnemployee(String value) {
        this.ttypepostnemployee = value;
    }

    /**
     * Gets the value of the nemployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNemployee() {
        return nemployee;
    }

    /**
     * Sets the value of the nemployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNemployee(Integer value) {
        this.nemployee = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

}
