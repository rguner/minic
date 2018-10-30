
package com.euromsg.ws.post;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmKeyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmKeyValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmKeyValue" type="{http://ws.euromsg.com/post}EmKeyValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmKeyValue", propOrder = {
    "emKeyValue"
})
public class ArrayOfEmKeyValue
    implements Serializable
{

    @XmlElement(name = "EmKeyValue", nillable = true)
    protected List<EmKeyValue> emKeyValue;

    /**
     * Gets the value of the emKeyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emKeyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmKeyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmKeyValue }
     * 
     * 
     */
    public List<EmKeyValue> getEmKeyValue() {
        if (emKeyValue == null) {
            emKeyValue = new ArrayList<EmKeyValue>();
        }
        return this.emKeyValue;
    }

}
