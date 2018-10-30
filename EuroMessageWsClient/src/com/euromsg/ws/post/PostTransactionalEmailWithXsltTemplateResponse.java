
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
 *         &lt;element name="PostTransactionalEmailWithXsltTemplateResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
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
    "postTransactionalEmailWithXsltTemplateResult"
})
@XmlRootElement(name = "PostTransactionalEmailWithXsltTemplateResponse")
public class PostTransactionalEmailWithXsltTemplateResponse
    implements Serializable
{

    @XmlElement(name = "PostTransactionalEmailWithXsltTemplateResult")
    protected EmPostResult postTransactionalEmailWithXsltTemplateResult;

    /**
     * Gets the value of the postTransactionalEmailWithXsltTemplateResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getPostTransactionalEmailWithXsltTemplateResult() {
        return postTransactionalEmailWithXsltTemplateResult;
    }

    /**
     * Sets the value of the postTransactionalEmailWithXsltTemplateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setPostTransactionalEmailWithXsltTemplateResult(EmPostResult value) {
        this.postTransactionalEmailWithXsltTemplateResult = value;
    }

}
