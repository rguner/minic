
package com.euromsg.ws.post;

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
 *         &lt;element name="ServiceTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "serviceTicket",
    "postID"
})
@XmlRootElement(name = "GetPostResult")
public class GetPostResult
    implements Serializable
{

    @XmlElement(name = "ServiceTicket")
    protected String serviceTicket;
    @XmlElement(name = "PostID")
    protected String postID;

    /**
     * Gets the value of the serviceTicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTicket() {
        return serviceTicket;
    }

    /**
     * Sets the value of the serviceTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTicket(String value) {
        this.serviceTicket = value;
    }

    /**
     * Gets the value of the postID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostID() {
        return postID;
    }

    /**
     * Sets the value of the postID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostID(String value) {
        this.postID = value;
    }

}
