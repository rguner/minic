
package com.turkcell.crm.sfa.service.endpoints;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for positionDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionDetailsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="positionDetailDto" type="{http://endpoints.service.sfa.crm.turkcell.com/}positionDetailDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "positionDetailsResponse", propOrder = {
    "positionDetailDto"
})
public class PositionDetailsResponse
    extends BaseWsResponse
{

    @XmlElement(nillable = true)
    protected List<PositionDetailDto> positionDetailDto;

    /**
     * Gets the value of the positionDetailDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionDetailDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionDetailDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionDetailDto }
     * 
     * 
     */
    public List<PositionDetailDto> getPositionDetailDto() {
        if (positionDetailDto == null) {
            positionDetailDto = new ArrayList<PositionDetailDto>();
        }
        return this.positionDetailDto;
    }

}
