
package com.turkcell.balanceinquiry.ejb.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for technicalComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="technicalComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lifeCycleOffer" type="{http://impl.ejb.balanceinquiry.turkcell.com/}lifeCycleOffer" minOccurs="0"/>
 *         &lt;element name="priorityOffers" type="{http://impl.ejb.balanceinquiry.turkcell.com/}priorityOffer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "technicalComponent", propOrder = {
    "lifeCycleOffer",
    "priorityOffers"
})
public class TechnicalComponent
    implements Serializable
{

    protected LifeCycleOffer lifeCycleOffer;
    @XmlElement(nillable = true)
    protected List<PriorityOffer> priorityOffers;

    /**
     * Gets the value of the lifeCycleOffer property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleOffer }
     *     
     */
    public LifeCycleOffer getLifeCycleOffer() {
        return lifeCycleOffer;
    }

    /**
     * Sets the value of the lifeCycleOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleOffer }
     *     
     */
    public void setLifeCycleOffer(LifeCycleOffer value) {
        this.lifeCycleOffer = value;
    }

    /**
     * Gets the value of the priorityOffers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityOffers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityOffer }
     * 
     * 
     */
    public List<PriorityOffer> getPriorityOffers() {
        if (priorityOffers == null) {
            priorityOffers = new ArrayList<PriorityOffer>();
        }
        return this.priorityOffers;
    }

}
