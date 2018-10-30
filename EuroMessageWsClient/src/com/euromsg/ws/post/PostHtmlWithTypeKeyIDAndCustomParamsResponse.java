
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
 *         &lt;element name="PostHtmlWithTypeKeyIDAndCustomParamsResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
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
    "postHtmlWithTypeKeyIDAndCustomParamsResult"
})
@XmlRootElement(name = "PostHtmlWithTypeKeyIDAndCustomParamsResponse")
public class PostHtmlWithTypeKeyIDAndCustomParamsResponse
    implements Serializable
{

    @XmlElement(name = "PostHtmlWithTypeKeyIDAndCustomParamsResult")
    protected EmPostResult postHtmlWithTypeKeyIDAndCustomParamsResult;

    /**
     * Gets the value of the postHtmlWithTypeKeyIDAndCustomParamsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getPostHtmlWithTypeKeyIDAndCustomParamsResult() {
        return postHtmlWithTypeKeyIDAndCustomParamsResult;
    }

    /**
     * Sets the value of the postHtmlWithTypeKeyIDAndCustomParamsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setPostHtmlWithTypeKeyIDAndCustomParamsResult(EmPostResult value) {
        this.postHtmlWithTypeKeyIDAndCustomParamsResult = value;
    }

}
