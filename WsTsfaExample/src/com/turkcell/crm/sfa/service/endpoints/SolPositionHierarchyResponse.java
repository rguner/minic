
package com.turkcell.crm.sfa.service.endpoints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solPositionHierarchyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solPositionHierarchyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="solPositionHierarchyList" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionEmployee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solPositionHierarchyResponse", propOrder = {
    "solPositionHierarchyList"
})
public class SolPositionHierarchyResponse
    extends BaseWsResponse
{

    @XmlElement(nillable = true)
    protected List<PositionEmployee> solPositionHierarchyList;

    /**
     * Gets the value of the solPositionHierarchyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solPositionHierarchyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolPositionHierarchyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionEmployee }
     * 
     * 
     */
    public List<PositionEmployee> getSolPositionHierarchyList() {
        if (solPositionHierarchyList == null) {
            solPositionHierarchyList = new ArrayList<PositionEmployee>();
        }
        return this.solPositionHierarchyList;
    }

}
