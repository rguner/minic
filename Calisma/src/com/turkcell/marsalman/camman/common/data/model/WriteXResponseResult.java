
package com.turkcell.marsalman.camman.common.data.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WriteXResponseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriteXResponseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fkSeq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="fkSeqType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteXResponseResult", propOrder = {
    "fkSeq",
    "fkSeqType",
    "outputParams",
    "result"
})
public class WriteXResponseResult {

    @XmlElementRef(name = "fkSeq", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> fkSeq;
    @XmlElementRef(name = "fkSeqType", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fkSeqType;
    @XmlElementRef(name = "outputParams", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outputParams;
    @XmlElementRef(name = "result", namespace = "http://model.data.common.camman.marsalman.turkcell.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> result;

    /**
     * Gets the value of the fkSeq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFkSeq() {
        return fkSeq;
    }

    /**
     * Sets the value of the fkSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFkSeq(JAXBElement<BigDecimal> value) {
        this.fkSeq = value;
    }

    /**
     * Gets the value of the fkSeqType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFkSeqType() {
        return fkSeqType;
    }

    /**
     * Sets the value of the fkSeqType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFkSeqType(JAXBElement<String> value) {
        this.fkSeqType = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutputParams(JAXBElement<String> value) {
        this.outputParams = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResult(JAXBElement<String> value) {
        this.result = value;
    }

}
