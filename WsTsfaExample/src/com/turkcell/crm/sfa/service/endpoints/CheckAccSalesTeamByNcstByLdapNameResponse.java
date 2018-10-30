
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAccSalesTeamByNcstByLdapNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAccSalesTeamByNcstByLdapNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkAccSalesTeamResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}checkAccSalesTeamResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAccSalesTeamByNcstByLdapNameResponse", propOrder = {
    "checkAccSalesTeamResponse"
})
public class CheckAccSalesTeamByNcstByLdapNameResponse {

    protected CheckAccSalesTeamResponse checkAccSalesTeamResponse;

    /**
     * Gets the value of the checkAccSalesTeamResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CheckAccSalesTeamResponse }
     *     
     */
    public CheckAccSalesTeamResponse getCheckAccSalesTeamResponse() {
        return checkAccSalesTeamResponse;
    }

    /**
     * Sets the value of the checkAccSalesTeamResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckAccSalesTeamResponse }
     *     
     */
    public void setCheckAccSalesTeamResponse(CheckAccSalesTeamResponse value) {
        this.checkAccSalesTeamResponse = value;
    }

}
