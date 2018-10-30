
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
 *         &lt;element name="PostHtmlWithCCandBCCResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
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
    "postHtmlWithCCandBCCResult"
})
@XmlRootElement(name = "PostHtmlWithCCandBCCResponse")
public class PostHtmlWithCCandBCCResponse
    implements Serializable
{

    @XmlElement(name = "PostHtmlWithCCandBCCResult")
    protected EmPostResult postHtmlWithCCandBCCResult;

    /**
     * Gets the value of the postHtmlWithCCandBCCResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getPostHtmlWithCCandBCCResult() {
        return postHtmlWithCCandBCCResult;
    }

    /**
     * Sets the value of the postHtmlWithCCandBCCResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setPostHtmlWithCCandBCCResult(EmPostResult value) {
        this.postHtmlWithCCandBCCResult = value;
    }

}
