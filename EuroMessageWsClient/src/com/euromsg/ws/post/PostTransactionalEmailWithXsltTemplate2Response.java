
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
 *         &lt;element name="PostTransactionalEmailWithXsltTemplate2Result" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
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
    "postTransactionalEmailWithXsltTemplate2Result"
})
@XmlRootElement(name = "PostTransactionalEmailWithXsltTemplate2Response")
public class PostTransactionalEmailWithXsltTemplate2Response
    implements Serializable
{

    @XmlElement(name = "PostTransactionalEmailWithXsltTemplate2Result")
    protected EmPostResult postTransactionalEmailWithXsltTemplate2Result;

    /**
     * Gets the value of the postTransactionalEmailWithXsltTemplate2Result property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getPostTransactionalEmailWithXsltTemplate2Result() {
        return postTransactionalEmailWithXsltTemplate2Result;
    }

    /**
     * Sets the value of the postTransactionalEmailWithXsltTemplate2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setPostTransactionalEmailWithXsltTemplate2Result(EmPostResult value) {
        this.postTransactionalEmailWithXsltTemplate2Result = value;
    }

}
