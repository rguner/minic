
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAccountsPortfolioByNcstResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAccountsPortfolioByNcstResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountsPortfolioResponse" type="{http://endpoints.service.sfa.crm.turkcell.com/}accountsPortfolioResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountsPortfolioByNcstResponse", propOrder = {
    "accountsPortfolioResponse"
})
public class GetAccountsPortfolioByNcstResponse {

    protected AccountsPortfolioResponse accountsPortfolioResponse;

    /**
     * Gets the value of the accountsPortfolioResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AccountsPortfolioResponse }
     *     
     */
    public AccountsPortfolioResponse getAccountsPortfolioResponse() {
        return accountsPortfolioResponse;
    }

    /**
     * Sets the value of the accountsPortfolioResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsPortfolioResponse }
     *     
     */
    public void setAccountsPortfolioResponse(AccountsPortfolioResponse value) {
        this.accountsPortfolioResponse = value;
    }

}
