
package com.turkcell.crm.sfa.service.endpoints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerUpperHierarchyGetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerUpperHierarchyGetResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="positionHierarchy" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionHierarchy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerUpperHierarchyGetResponse", propOrder = {
    "positionHierarchy"
})
@XmlSeeAlso({
    CustomerUkstOrTeleSalesUpperHierarchyGetResponse.class,
    CustomerPrimaryUpperHierarchyGetResponse.class
})
public abstract class CustomerUpperHierarchyGetResponse
    extends BaseWsResponse
{

    protected List<PositionHierarchy> positionHierarchy;

    /**
     * Gets the value of the positionHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionHierarchy }
     * 
     * 
     */
    public List<PositionHierarchy> getPositionHierarchy() {
        if (positionHierarchy == null) {
            positionHierarchy = new ArrayList<PositionHierarchy>();
        }
        return this.positionHierarchy;
    }

}
