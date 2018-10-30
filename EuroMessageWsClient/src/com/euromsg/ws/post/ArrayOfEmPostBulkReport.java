
package com.euromsg.ws.post;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmPostBulkReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmPostBulkReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmPostBulkReport" type="{http://ws.euromsg.com/post}EmPostBulkReport" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmPostBulkReport", propOrder = {
    "emPostBulkReport"
})
public class ArrayOfEmPostBulkReport
    implements Serializable
{

    @XmlElement(name = "EmPostBulkReport", nillable = true)
    protected List<EmPostBulkReport> emPostBulkReport;

    /**
     * Gets the value of the emPostBulkReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emPostBulkReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmPostBulkReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmPostBulkReport }
     * 
     * 
     */
    public List<EmPostBulkReport> getEmPostBulkReport() {
        if (emPostBulkReport == null) {
            emPostBulkReport = new ArrayList<EmPostBulkReport>();
        }
        return this.emPostBulkReport;
    }

}
