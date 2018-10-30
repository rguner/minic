
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
 *         &lt;element name="PostHtmlWithTypeResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
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
    "postHtmlWithTypeResult"
})
@XmlRootElement(name = "PostHtmlWithTypeResponse")
public class PostHtmlWithTypeResponse
    implements Serializable
{

    @XmlElement(name = "PostHtmlWithTypeResult")
    protected EmPostResult postHtmlWithTypeResult;

    /**
     * Gets the value of the postHtmlWithTypeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getPostHtmlWithTypeResult() {
        return postHtmlWithTypeResult;
    }

    /**
     * Sets the value of the postHtmlWithTypeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setPostHtmlWithTypeResult(EmPostResult value) {
        this.postHtmlWithTypeResult = value;
    }

}
