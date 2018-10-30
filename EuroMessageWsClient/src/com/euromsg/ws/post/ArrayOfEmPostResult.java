
package com.euromsg.ws.post;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmPostResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmPostResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmPostResult" type="{http://ws.euromsg.com/post}EmPostResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmPostResult", propOrder = {
    "emPostResult"
})
public class ArrayOfEmPostResult
    implements Serializable
{

    @XmlElement(name = "EmPostResult", nillable = true)
    protected List<EmPostResult> emPostResult;

    /**
     * Gets the value of the emPostResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emPostResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmPostResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmPostResult }
     * 
     * 
     */
    public List<EmPostResult> getEmPostResult() {
        if (emPostResult == null) {
            emPostResult = new ArrayList<EmPostResult>();
        }
        return this.emPostResult;
    }

}
