
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
 *         &lt;element name="GetPostBulkBounceResultResult" type="{http://ws.euromsg.com/post}EmPostResult" minOccurs="0"/>
 *         &lt;element name="BulkReport" type="{http://ws.euromsg.com/post}ArrayOfEmPostBulkReport" minOccurs="0"/>
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
    "getPostBulkBounceResultResult",
    "bulkReport"
})
@XmlRootElement(name = "GetPostBulkBounceResultResponse")
public class GetPostBulkBounceResultResponse
    implements Serializable
{

    @XmlElement(name = "GetPostBulkBounceResultResult")
    protected EmPostResult getPostBulkBounceResultResult;
    @XmlElement(name = "BulkReport")
    protected ArrayOfEmPostBulkReport bulkReport;

    /**
     * Gets the value of the getPostBulkBounceResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmPostResult }
     *     
     */
    public EmPostResult getGetPostBulkBounceResultResult() {
        return getPostBulkBounceResultResult;
    }

    /**
     * Sets the value of the getPostBulkBounceResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmPostResult }
     *     
     */
    public void setGetPostBulkBounceResultResult(EmPostResult value) {
        this.getPostBulkBounceResultResult = value;
    }

    /**
     * Gets the value of the bulkReport property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmPostBulkReport }
     *     
     */
    public ArrayOfEmPostBulkReport getBulkReport() {
        return bulkReport;
    }

    /**
     * Sets the value of the bulkReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmPostBulkReport }
     *     
     */
    public void setBulkReport(ArrayOfEmPostBulkReport value) {
        this.bulkReport = value;
    }

}
