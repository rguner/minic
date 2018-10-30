
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
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectVariables" type="{http://ws.euromsg.com/post}ArrayOfEmKeyValue" minOccurs="0"/>
 *         &lt;element name="BodyVariables" type="{http://ws.euromsg.com/post}ArrayOfEmKeyValue" minOccurs="0"/>
 *         &lt;element name="Charset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://ws.euromsg.com/post}ArrayOfEmAttachment" minOccurs="0"/>
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
    "templateName",
    "subjectVariables",
    "bodyVariables",
    "charset",
    "toName",
    "toEmailAddress",
    "attachments"
})
@XmlRootElement(name = "PostTransactionalEmailWithHtmlTemplate")
public class PostTransactionalEmailWithHtmlTemplate
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
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "SubjectVariables")
    protected ArrayOfEmKeyValue subjectVariables;
    @XmlElement(name = "BodyVariables")
    protected ArrayOfEmKeyValue bodyVariables;
    @XmlElement(name = "Charset")
    protected String charset;
    @XmlElement(name = "ToName")
    protected String toName;
    @XmlElement(name = "ToEmailAddress")
    protected String toEmailAddress;
    @XmlElement(name = "Attachments")
    protected ArrayOfEmAttachment attachments;

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
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the subjectVariables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmKeyValue }
     *     
     */
    public ArrayOfEmKeyValue getSubjectVariables() {
        return subjectVariables;
    }

    /**
     * Sets the value of the subjectVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmKeyValue }
     *     
     */
    public void setSubjectVariables(ArrayOfEmKeyValue value) {
        this.subjectVariables = value;
    }

    /**
     * Gets the value of the bodyVariables property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmKeyValue }
     *     
     */
    public ArrayOfEmKeyValue getBodyVariables() {
        return bodyVariables;
    }

    /**
     * Sets the value of the bodyVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmKeyValue }
     *     
     */
    public void setBodyVariables(ArrayOfEmKeyValue value) {
        this.bodyVariables = value;
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

}
