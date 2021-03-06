
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
 *         &lt;element name="ServiceTicket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FromAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HtmlBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BCCEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://ws.euromsg.com/post}ArrayOfEmAttachment" minOccurs="0"/>
 *         &lt;element name="PostType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fromName",
    "fromAddress",
    "replyAddress",
    "subject",
    "htmlBody",
    "charset",
    "toName",
    "toEmailAddress",
    "ccEmailAddress",
    "bccEmailAddress",
    "attachments",
    "postType"
})
@XmlRootElement(name = "PostHtmlWithTypeCCandBCC")
public class PostHtmlWithTypeCCandBCC
    implements Serializable
{

    @XmlElement(name = "ServiceTicket")
    protected String serviceTicket;
    @XmlElement(name = "FromName")
    protected String fromName;
    @XmlElement(name = "FromAddress")
    protected String fromAddress;
    @XmlElement(name = "ReplyAddress")
    protected String replyAddress;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "HtmlBody")
    protected String htmlBody;
    @XmlElement(name = "Charset")
    protected String charset;
    @XmlElement(name = "ToName")
    protected String toName;
    @XmlElement(name = "ToEmailAddress")
    protected String toEmailAddress;
    @XmlElement(name = "CCEmailAddress")
    protected String ccEmailAddress;
    @XmlElement(name = "BCCEmailAddress")
    protected String bccEmailAddress;
    @XmlElement(name = "Attachments")
    protected ArrayOfEmAttachment attachments;
    @XmlElement(name = "PostType")
    protected String postType;

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
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the fromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * Sets the value of the fromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromAddress(String value) {
        this.fromAddress = value;
    }

    /**
     * Gets the value of the replyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAddress() {
        return replyAddress;
    }

    /**
     * Sets the value of the replyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAddress(String value) {
        this.replyAddress = value;
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
     * Gets the value of the htmlBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * Sets the value of the htmlBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlBody(String value) {
        this.htmlBody = value;
    }

    /**
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        return charset;
    }

    /**
     * Sets the value of the charset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * Gets the value of the toName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToName() {
        return toName;
    }

    /**
     * Sets the value of the toName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToName(String value) {
        this.toName = value;
    }

    /**
     * Gets the value of the toEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEmailAddress() {
        return toEmailAddress;
    }

    /**
     * Sets the value of the toEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEmailAddress(String value) {
        this.toEmailAddress = value;
    }

    /**
     * Gets the value of the ccEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCEmailAddress() {
        return ccEmailAddress;
    }

    /**
     * Sets the value of the ccEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCEmailAddress(String value) {
        this.ccEmailAddress = value;
    }

    /**
     * Gets the value of the bccEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCCEmailAddress() {
        return bccEmailAddress;
    }

    /**
     * Sets the value of the bccEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCCEmailAddress(String value) {
        this.bccEmailAddress = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmAttachment }
     *     
     */
    public ArrayOfEmAttachment getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmAttachment }
     *     
     */
    public void setAttachments(ArrayOfEmAttachment value) {
        this.attachments = value;
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

}
