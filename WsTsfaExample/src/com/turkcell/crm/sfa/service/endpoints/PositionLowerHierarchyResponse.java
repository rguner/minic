
package com.turkcell.crm.sfa.service.endpoints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionLowerHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionLowerHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="positionLowerHierarchy" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionLowerHierarchy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionLowerHierarchyResponse", propOrder = {
    "positionLowerHierarchy"
})
public class PositionLowerHierarchyResponse
    extends BaseWsResponse
{

    protected List<PositionLowerHierarchy> positionLowerHierarchy;

    /**
     * Gets the value of the positionLowerHierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionLowerHierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionLowerHierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionLowerHierarchy }
     * 
     * 
     */
    public List<PositionLowerHierarchy> getPositionLowerHierarchy() {
        if (positionLowerHierarchy == null) {
            positionLowerHierarchy = new ArrayList<PositionLowerHierarchy>();
        }
        return this.positionLowerHierarchy;
    }

}
