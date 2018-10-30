package com.turkcell.balanceinquiry.ejb.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * Java class for fee complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monetaryUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fee", propOrder = {
		"monetaryUnit",
		"priceValue",
		"value",
		"valueUnit"
})
public class Fee
		implements Serializable
{

	private static final long serialVersionUID = 1L;
	protected String monetaryUnit;
	protected BigDecimal priceValue;
	protected String value;
	protected String valueUnit;

	/**
	 * Gets the value of the monetaryUnit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMonetaryUnit() {
		return monetaryUnit;
	}

	/**
	 * Sets the value of the monetaryUnit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setMonetaryUnit(String value) {
		this.monetaryUnit = value;
	}

	/**
	 * Gets the value of the priceValue property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getPriceValue() {
		return priceValue;
	}

	/**
	 * Sets the value of the priceValue property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setPriceValue(BigDecimal value) {
		this.priceValue = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the valueUnit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValueUnit() {
		return valueUnit;
	}

	/**
	 * Sets the value of the valueUnit property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setValueUnit(String value) {
		this.valueUnit = value;
	}
}
