
package com.euromsg.ws.post;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="serviceTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postIds" type="{http://ws.euromsg.com/post}ArrayOfString" minOccurs="0"/>
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
    "postIds"
})
@XmlRootElement(name = "GetPostBulkResultByPostId")
public class GetPostBulkResultByPostId
    implements Serializable
{

    protected String serviceTicket;
    protected ArrayOfString postIds;

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
     * Gets the value of the postIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPostIds() {
        return postIds;
    }

    /**
     * Sets the value of the postIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPostIds(ArrayOfString value) {
        this.postIds = value;
    }

}
