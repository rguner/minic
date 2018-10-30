/**
 * PaymentInfoDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class PaymentInfoDetail  implements java.io.Serializable {
    private java.lang.String bankId;

    private double invAmount;

    private long invNo;

    private java.lang.String invType;

    private java.lang.String logDate;

    private long msisdn;

    private java.lang.String opType;

    private java.lang.String paymSource;

    private java.lang.String period;

    public PaymentInfoDetail() {
    }

    public PaymentInfoDetail(
           java.lang.String bankId,
           double invAmount,
           long invNo,
           java.lang.String invType,
           java.lang.String logDate,
           long msisdn,
           java.lang.String opType,
           java.lang.String paymSource,
           java.lang.String period) {
           this.bankId = bankId;
           this.invAmount = invAmount;
           this.invNo = invNo;
           this.invType = invType;
           this.logDate = logDate;
           this.msisdn = msisdn;
           this.opType = opType;
           this.paymSource = paymSource;
           this.period = period;
    }


    /**
     * Gets the bankId value for this PaymentInfoDetail.
     * 
     * @return bankId
     */
    public java.lang.String getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this PaymentInfoDetail.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.String bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the invAmount value for this PaymentInfoDetail.
     * 
     * @return invAmount
     */
    public double getInvAmount() {
        return invAmount;
    }


    /**
     * Sets the invAmount value for this PaymentInfoDetail.
     * 
     * @param invAmount
     */
    public void setInvAmount(double invAmount) {
        this.invAmount = invAmount;
    }


    /**
     * Gets the invNo value for this PaymentInfoDetail.
     * 
     * @return invNo
     */
    public long getInvNo() {
        return invNo;
    }


    /**
     * Sets the invNo value for this PaymentInfoDetail.
     * 
     * @param invNo
     */
    public void setInvNo(long invNo) {
        this.invNo = invNo;
    }


    /**
     * Gets the invType value for this PaymentInfoDetail.
     * 
     * @return invType
     */
    public java.lang.String getInvType() {
        return invType;
    }


    /**
     * Sets the invType value for this PaymentInfoDetail.
     * 
     * @param invType
     */
    public void setInvType(java.lang.String invType) {
        this.invType = invType;
    }


    /**
     * Gets the logDate value for this PaymentInfoDetail.
     * 
     * @return logDate
     */
    public java.lang.String getLogDate() {
        return logDate;
    }


    /**
     * Sets the logDate value for this PaymentInfoDetail.
     * 
     * @param logDate
     */
    public void setLogDate(java.lang.String logDate) {
        this.logDate = logDate;
    }


    /**
     * Gets the msisdn value for this PaymentInfoDetail.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PaymentInfoDetail.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the opType value for this PaymentInfoDetail.
     * 
     * @return opType
     */
    public java.lang.String getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this PaymentInfoDetail.
     * 
     * @param opType
     */
    public void setOpType(java.lang.String opType) {
        this.opType = opType;
    }


    /**
     * Gets the paymSource value for this PaymentInfoDetail.
     * 
     * @return paymSource
     */
    public java.lang.String getPaymSource() {
        return paymSource;
    }


    /**
     * Sets the paymSource value for this PaymentInfoDetail.
     * 
     * @param paymSource
     */
    public void setPaymSource(java.lang.String paymSource) {
        this.paymSource = paymSource;
    }


    /**
     * Gets the period value for this PaymentInfoDetail.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this PaymentInfoDetail.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInfoDetail)) return false;
        PaymentInfoDetail other = (PaymentInfoDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            this.invAmount == other.getInvAmount() &&
            this.invNo == other.getInvNo() &&
            ((this.invType==null && other.getInvType()==null) || 
             (this.invType!=null &&
              this.invType.equals(other.getInvType()))) &&
            ((this.logDate==null && other.getLogDate()==null) || 
             (this.logDate!=null &&
              this.logDate.equals(other.getLogDate()))) &&
            this.msisdn == other.getMsisdn() &&
            ((this.opType==null && other.getOpType()==null) || 
             (this.opType!=null &&
              this.opType.equals(other.getOpType()))) &&
            ((this.paymSource==null && other.getPaymSource()==null) || 
             (this.paymSource!=null &&
              this.paymSource.equals(other.getPaymSource()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        _hashCode += new Double(getInvAmount()).hashCode();
        _hashCode += new Long(getInvNo()).hashCode();
        if (getInvType() != null) {
            _hashCode += getInvType().hashCode();
        }
        if (getLogDate() != null) {
            _hashCode += getLogDate().hashCode();
        }
        _hashCode += new Long(getMsisdn()).hashCode();
        if (getOpType() != null) {
            _hashCode += getOpType().hashCode();
        }
        if (getPaymSource() != null) {
            _hashCode += getPaymSource().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentInfoDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invType");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "logDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opType");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "opType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymSource");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "paymSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
