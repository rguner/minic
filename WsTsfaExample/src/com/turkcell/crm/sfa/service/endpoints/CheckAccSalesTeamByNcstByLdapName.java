
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkAccSalesTeamByNcstByLdapName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAccSalesTeamByNcstByLdapName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkAccSalesTeamRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}checkAccSalesTeamRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAccSalesTeamByNcstByLdapName", propOrder = {
    "checkAccSalesTeamRequest"
})
public class CheckAccSalesTeamByNcstByLdapName {

    protected CheckAccSalesTeamRequest checkAccSalesTeamRequest;

    /**
     * Gets the value of the checkAccSalesTeamRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CheckAccSalesTeamRequest }
     *     
     */
    public CheckAccSalesTeamRequest getCheckAccSalesTeamRequest() {
        return checkAccSalesTeamRequest;
    }

    /**
     * Sets the value of the checkAccSalesTeamRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckAccSalesTeamRequest }
     *     
     */
    public void setCheckAccSalesTeamRequest(CheckAccSalesTeamRequest value) {
        this.checkAccSalesTeamRequest = value;
    }

}
