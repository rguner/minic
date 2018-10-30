
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
 *         &lt;element name="GetPostBulkResultByPostIdResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
 *         &lt;element name="bulkResult" type="{http://ws.euromsg.com/post}ArrayOfEmPostResult" minOccurs="0"/>
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
    "getPostBulkResultByPostIdResult",
    "bulkResult"
})
@XmlRootElement(name = "GetPostBulkResultByPostIdResponse")
public class GetPostBulkResultByPostIdResponse
    implements Serializable
{

    @XmlElement(name = "GetPostBulkResultByPostIdResult")
    protected EmPostResult getPostBulkResultByPostIdResult;
    protected ArrayOfEmPostResult bulkResult;

    /**
     * Gets the value of the getPostBulkResultByPostIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getGetPostBulkResultByPostIdResult() {
        return getPostBulkResultByPostIdResult;
    }

    /**
     * Sets the value of the getPostBulkResultByPostIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setGetPostBulkResultByPostIdResult(EmPostResult value) {
        this.getPostBulkResultByPostIdResult = value;
    }

    /**
     * Gets the value of the bulkResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmPostResult }
     *     
     */
    public ArrayOfEmPostResult getBulkResult() {
        return bulkResult;
    }

    /**
     * Sets the value of the bulkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmPostResult }
     *     
     */
    public void setBulkResult(ArrayOfEmPostResult value) {
        this.bulkResult = value;
    }

}
