
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAccountsPortfolioByNcst complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAccountsPortfolioByNcst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountsPortfolioRequest" type="{http://endpoints.service.sfa.crm.turkcell.com/}accountsPortfolioRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountsPortfolioByNcst", propOrder = {
    "accountsPortfolioRequest"
})
public class GetAccountsPortfolioByNcst {

    protected AccountsPortfolioRequest accountsPortfolioRequest;

    /**
     * Gets the value of the accountsPortfolioRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AccountsPortfolioRequest }
     *     
     */
    public AccountsPortfolioRequest getAccountsPortfolioRequest() {
        return accountsPortfolioRequest;
    }

    /**
     * Sets the value of the accountsPortfolioRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsPortfolioRequest }
     *     
     */
    public void setAccountsPortfolioRequest(AccountsPortfolioRequest value) {
        this.accountsPortfolioRequest = value;
    }

}
