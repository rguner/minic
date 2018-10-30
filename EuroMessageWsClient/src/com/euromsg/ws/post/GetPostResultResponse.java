
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
 *         &lt;element name="GetPostResultResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
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
    "getPostResultResult"
})
@XmlRootElement(name = "GetPostResultResponse")
public class GetPostResultResponse
    implements Serializable
{

    @XmlElement(name = "GetPostResultResult")
    protected EmPostResult getPostResultResult;

    /**
     * Gets the value of the getPostResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getGetPostResultResult() {
        return getPostResultResult;
    }

    /**
     * Sets the value of the getPostResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setGetPostResultResult(EmPostResult value) {
        this.getPostResultResult = value;
    }

}
