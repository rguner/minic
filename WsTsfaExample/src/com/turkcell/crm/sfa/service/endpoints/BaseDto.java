
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for baseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dgenerate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dmodify" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tgenerate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tmodify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseDto", propOrder = {
    "dgenerate",
    "dmodify",
    "tgenerate",
    "tmodify"
})
@XmlSeeAlso({
    PositionDetailDto.class,
    SubOrganizationDto.class
})
public abstract class BaseDto {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dgenerate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dmodify;
    protected String tgenerate;
    protected String tmodify;

    /**
     * Gets the value of the dgenerate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDgenerate() {
        return dgenerate;
    }

    /**
     * Sets the value of the dgenerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDgenerate(XMLGregorianCalendar value) {
        this.dgenerate = value;
    }

    /**
     * Gets the value of the dmodify property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDmodify() {
        return dmodify;
    }

    /**
     * Sets the value of the dmodify property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDmodify(XMLGregorianCalendar value) {
        this.dmodify = value;
    }

    /**
     * Gets the value of the tgenerate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTgenerate() {
        return tgenerate;
    }

    /**
     * Sets the value of the tgenerate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTgenerate(String value) {
        this.tgenerate = value;
    }

    /**
     * Gets the value of the tmodify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmodify() {
        return tmodify;
    }

    /**
     * Sets the value of the tmodify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmodify(String value) {
        this.tmodify = value;
    }

}
