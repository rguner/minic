
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAccSalesTeamResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAccSalesTeamResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://endpoints.service.sfa.crm.turkcell.com/}baseWsResponse">
 *       &lt;sequence>
 *         &lt;element name="checkAccSalesTeamResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAccSalesTeamResponse", propOrder = {
    "checkAccSalesTeamResult"
})
public class CheckAccSalesTeamResponse
    extends BaseWsResponse
{

    protected String checkAccSalesTeamResult;

    /**
     * Gets the value of the checkAccSalesTeamResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckAccSalesTeamResult() {
        return checkAccSalesTeamResult;
    }

    /**
     * Sets the value of the checkAccSalesTeamResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckAccSalesTeamResult(String value) {
        this.checkAccSalesTeamResult = value;
    }

}
