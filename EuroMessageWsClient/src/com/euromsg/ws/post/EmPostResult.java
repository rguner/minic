
package com.euromsg.ws.post;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmPostResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmPostResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.euromsg.com/post}EmResult">
 *       &lt;sequence>
 *         &lt;element name="PostID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UndeliveryReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarkedSpam" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="KeyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelayBounceTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplyAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmPostResult", propOrder = {
    "postID",
    "relayStatus",
    "deliveryStatus",
    "undeliveryReason",
    "markedSpam",
    "keyID",
    "customParams",
    "postType",
    "readTime",
    "relayBounceTime",
    "lastUpdateTime",
    "fromAdress",
    "replyAdress",
    "subject",
    "toAddress"
})
public class EmPostResult
    extends EmResult
    implements Serializable
{

    @XmlElement(name = "PostID")
    protected String postID;
    @XmlElement(name = "RelayStatus")
    protected String relayStatus;
    @XmlElement(name = "DeliveryStatus")
    protected String deliveryStatus;
    @XmlElement(name = "UndeliveryReason")
    protected String undeliveryReason;
    @XmlElement(name = "MarkedSpam")
    protected boolean markedSpam;
    @XmlElement(name = "KeyID")
    protected String keyID;
    @XmlElement(name = "CustomParams")
    protected String customParams;
    @XmlElement(name = "PostType")
    protected String postType;
    @XmlElement(name = "ReadTime")
    protected String readTime;
    @XmlElement(name = "RelayBounceTime")
    protected String relayBounceTime;
    @XmlElement(name = "LastUpdateTime")
    protected String lastUpdateTime;
    @XmlElement(name = "FromAdress")
    protected String fromAdress;
    @XmlElement(name = "ReplyAdress")
    protected String replyAdress;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "ToAddress")
    protected String toAddress;

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

    /**
     * Gets the value of the relayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayStatus() {
        return relayStatus;
    }

    /**
     * Sets the value of the relayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayStatus(String value) {
        this.relayStatus = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the undeliveryReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndeliveryReason() {
        return undeliveryReason;
    }

    /**
     * Sets the value of the undeliveryReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndeliveryReason(String value) {
        this.undeliveryReason = value;
    }

    /**
     * Gets the value of the markedSpam property.
     * 
     */
    public boolean isMarkedSpam() {
        return markedSpam;
    }

    /**
     * Sets the value of the markedSpam property.
     * 
     */
    public void setMarkedSpam(boolean value) {
        this.markedSpam = value;
    }

    /**
     * Gets the value of the keyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyID() {
        return keyID;
    }

    /**
     * Sets the value of the keyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyID(String value) {
        this.keyID = value;
    }

    /**
     * Gets the value of the customParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomParams() {
        return customParams;
    }

    /**
     * Sets the value of the customParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomParams(String value) {
        this.customParams = value;
    }

    /**
     * Gets the value of the postType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostType() {
        return postType;
    }

    /**
     * Sets the value of the postType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostType(String value) {
        this.postType = value;
    }

    /**
     * Gets the value of the readTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadTime() {
        return readTime;
    }

    /**
     * Sets the value of the readTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadTime(String value) {
        this.readTime = value;
    }

    /**
     * Gets the value of the relayBounceTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelayBounceTime() {
        return relayBounceTime;
    }

    /**
     * Sets the value of the relayBounceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelayBounceTime(String value) {
        this.relayBounceTime = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateTime(String value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the fromAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAdress() {
        return fromAdress;
    }

    /**
     * Sets the value of the fromAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAdress(String value) {
        this.fromAdress = value;
    }

    /**
     * Gets the value of the replyAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAdress() {
        return replyAdress;
    }

    /**
     * Sets the value of the replyAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAdress(String value) {
        this.replyAdress = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the toAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * Sets the value of the toAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToAddress(String value) {
        this.toAddress = value;
    }

}
