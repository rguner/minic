
package com.euromsg.ws.auth;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogoutResult" type="{http://ws.euromsg.com/auth}EmAuthResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "logoutResult"
})
@XmlRootElement(name = "LogoutResponse")
public class LogoutResponse
    implements Serializable
{

    @XmlElement(name = "LogoutResult")
    protected EmAuthResult logoutResult;

    /**
     * Gets the value of the logoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmAuthResult }
     *     
     */
    public EmAuthResult getLogoutResult() {
        return logoutResult;
    }

    /**
     * Sets the value of the logoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmAuthResult }
     *     
     */
    public void setLogoutResult(EmAuthResult value) {
        this.logoutResult = value;
    }

}
