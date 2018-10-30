
package com.turkcell.crm.sfa.service.endpoints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subOrganizationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subOrganizationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="subOrganizationDto" type="{http://endpoints.service.sfa.crm.turkcell.com/}subOrganizationDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subOrganizationResponse", propOrder = {
    "subOrganizationDto"
})
public class SubOrganizationResponse
    extends BaseWsResponse
{

    @XmlElement(nillable = true)
    protected List<SubOrganizationDto> subOrganizationDto;

    /**
     * Gets the value of the subOrganizationDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subOrganizationDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubOrganizationDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubOrganizationDto }
     * 
     * 
     */
    public List<SubOrganizationDto> getSubOrganizationDto() {
        if (subOrganizationDto == null) {
            subOrganizationDto = new ArrayList<SubOrganizationDto>();
        }
        return this.subOrganizationDto;
    }

}
