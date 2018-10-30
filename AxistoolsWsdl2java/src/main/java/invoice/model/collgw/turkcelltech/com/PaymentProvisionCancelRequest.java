/**
 * PaymentProvisionCancelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package invoice.model.collgw.turkcelltech.com;

public class PaymentProvisionCancelRequest  implements java.io.Serializable {
    private java.lang.String accDate;

    private int appCode;

    private int bankId;

    private java.lang.String captDate;

    private int compId;

    private java.lang.String curr;

    private java.lang.Object[] invoiceList;

    private java.lang.String msgDate;

    private common.model.collgw.turkcelltech.com.OriginatorId orig;

    private int paymSource;

    private java.lang.String procDate;

    private java.lang.String provisionNo;

    private java.lang.String queryKey;

    private java.lang.String queryKeyValue;

    private java.lang.String reconDate;

    private java.lang.String sessionId;

    private long stan;

    public PaymentProvisionCancelRequest() {
    }

    public PaymentProvisionCancelRequest(
           java.lang.String accDate,
           int appCode,
           int bankId,
           java.lang.String captDate,
           int compId,
           java.lang.String curr,
           java.lang.Object[] invoiceList,
           java.lang.String msgDate,
           common.model.collgw.turkcelltech.com.OriginatorId orig,
           int paymSource,
           java.lang.String procDate,
           java.lang.String provisionNo,
           java.lang.String queryKey,
           java.lang.String queryKeyValue,
           java.lang.String reconDate,
           java.lang.String sessionId,
           long stan) {
           this.accDate = accDate;
           this.appCode = appCode;
           this.bankId = bankId;
           this.captDate = captDate;
           this.compId = compId;
           this.curr = curr;
           this.invoiceList = invoiceList;
           this.msgDate = msgDate;
           this.orig = orig;
           this.paymSource = paymSource;
           this.procDate = procDate;
           this.provisionNo = provisionNo;
           this.queryKey = queryKey;
           this.queryKeyValue = queryKeyValue;
           this.reconDate = reconDate;
           this.sessionId = sessionId;
           this.stan = stan;
    }


    /**
     * Gets the accDate value for this PaymentProvisionCancelRequest.
     * 
     * @return accDate
     */
    public java.lang.String getAccDate() {
        return accDate;
    }


    /**
     * Sets the accDate value for this PaymentProvisionCancelRequest.
     * 
     * @param accDate
     */
    public void setAccDate(java.lang.String accDate) {
        this.accDate = accDate;
    }


    /**
     * Gets the appCode value for this PaymentProvisionCancelRequest.
     * 
     * @return appCode
     */
    public int getAppCode() {
        return appCode;
    }


    /**
     * Sets the appCode value for this PaymentProvisionCancelRequest.
     * 
     * @param appCode
     */
    public void setAppCode(int appCode) {
        this.appCode = appCode;
    }


    /**
     * Gets the bankId value for this PaymentProvisionCancelRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this PaymentProvisionCancelRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the captDate value for this PaymentProvisionCancelRequest.
     * 
     * @return captDate
     */
    public java.lang.String getCaptDate() {
        return captDate;
    }


    /**
     * Sets the captDate value for this PaymentProvisionCancelRequest.
     * 
     * @param captDate
     */
    public void setCaptDate(java.lang.String captDate) {
        this.captDate = captDate;
    }


    /**
     * Gets the compId value for this PaymentProvisionCancelRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this PaymentProvisionCancelRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the curr value for this PaymentProvisionCancelRequest.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this PaymentProvisionCancelRequest.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }


    /**
     * Gets the invoiceList value for this PaymentProvisionCancelRequest.
     * 
     * @return invoiceList
     */
    public java.lang.Object[] getInvoiceList() {
        return invoiceList;
    }


    /**
     * Sets the invoiceList value for this PaymentProvisionCancelRequest.
     * 
     * @param invoiceList
     */
    public void setInvoiceList(java.lang.Object[] invoiceList) {
        this.invoiceList = invoiceList;
    }


    /**
     * Gets the msgDate value for this PaymentProvisionCancelRequest.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this PaymentProvisionCancelRequest.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the orig value for this PaymentProvisionCancelRequest.
     * 
     * @return orig
     */
    public common.model.collgw.turkcelltech.com.OriginatorId getOrig() {
        return orig;
    }


    /**
     * Sets the orig value for this PaymentProvisionCancelRequest.
     * 
     * @param orig
     */
    public void setOrig(common.model.collgw.turkcelltech.com.OriginatorId orig) {
        this.orig = orig;
    }


    /**
     * Gets the paymSource value for this PaymentProvisionCancelRequest.
     * 
     * @return paymSource
     */
    public int getPaymSource() {
        return paymSource;
    }


    /**
     * Sets the paymSource value for this PaymentProvisionCancelRequest.
     * 
     * @param paymSource
     */
    public void setPaymSource(int paymSource) {
        this.paymSource = paymSource;
    }


    /**
     * Gets the procDate value for this PaymentProvisionCancelRequest.
     * 
     * @return procDate
     */
    public java.lang.String getProcDate() {
        return procDate;
    }


    /**
     * Sets the procDate value for this PaymentProvisionCancelRequest.
     * 
     * @param procDate
     */
    public void setProcDate(java.lang.String procDate) {
        this.procDate = procDate;
    }


    /**
     * Gets the provisionNo value for this PaymentProvisionCancelRequest.
     * 
     * @return provisionNo
     */
    public java.lang.String getProvisionNo() {
        return provisionNo;
    }


    /**
     * Sets the provisionNo value for this PaymentProvisionCancelRequest.
     * 
     * @param provisionNo
     */
    public void setProvisionNo(java.lang.String provisionNo) {
        this.provisionNo = provisionNo;
    }


    /**
     * Gets the queryKey value for this PaymentProvisionCancelRequest.
     * 
     * @return queryKey
     */
    public java.lang.String getQueryKey() {
        return queryKey;
    }


    /**
     * Sets the queryKey value for this PaymentProvisionCancelRequest.
     * 
     * @param queryKey
     */
    public void setQueryKey(java.lang.String queryKey) {
        this.queryKey = queryKey;
    }


    /**
     * Gets the queryKeyValue value for this PaymentProvisionCancelRequest.
     * 
     * @return queryKeyValue
     */
    public java.lang.String getQueryKeyValue() {
        return queryKeyValue;
    }


    /**
     * Sets the queryKeyValue value for this PaymentProvisionCancelRequest.
     * 
     * @param queryKeyValue
     */
    public void setQueryKeyValue(java.lang.String queryKeyValue) {
        this.queryKeyValue = queryKeyValue;
    }


    /**
     * Gets the reconDate value for this PaymentProvisionCancelRequest.
     * 
     * @return reconDate
     */
    public java.lang.String getReconDate() {
        return reconDate;
    }


    /**
     * Sets the reconDate value for this PaymentProvisionCancelRequest.
     * 
     * @param reconDate
     */
    public void setReconDate(java.lang.String reconDate) {
        this.reconDate = reconDate;
    }


    /**
     * Gets the sessionId value for this PaymentProvisionCancelRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this PaymentProvisionCancelRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the stan value for this PaymentProvisionCancelRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this PaymentProvisionCancelRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentProvisionCancelRequest)) return false;
        PaymentProvisionCancelRequest other = (PaymentProvisionCancelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accDate==null && other.getAccDate()==null) || 
             (this.accDate!=null &&
              this.accDate.equals(other.getAccDate()))) &&
            this.appCode == other.getAppCode() &&
            this.bankId == other.getBankId() &&
            ((this.captDate==null && other.getCaptDate()==null) || 
             (this.captDate!=null &&
              this.captDate.equals(other.getCaptDate()))) &&
            this.compId == other.getCompId() &&
            ((this.curr==null && other.getCurr()==null) || 
             (this.curr!=null &&
              this.curr.equals(other.getCurr()))) &&
            ((this.invoiceList==null && other.getInvoiceList()==null) || 
             (this.invoiceList!=null &&
              java.util.Arrays.equals(this.invoiceList, other.getInvoiceList()))) &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            ((this.orig==null && other.getOrig()==null) || 
             (this.orig!=null &&
              this.orig.equals(other.getOrig()))) &&
            this.paymSource == other.getPaymSource() &&
            ((this.procDate==null && other.getProcDate()==null) || 
             (this.procDate!=null &&
              this.procDate.equals(other.getProcDate()))) &&
            ((this.provisionNo==null && other.getProvisionNo()==null) || 
             (this.provisionNo!=null &&
              this.provisionNo.equals(other.getProvisionNo()))) &&
            ((this.queryKey==null && other.getQueryKey()==null) || 
             (this.queryKey!=null &&
              this.queryKey.equals(other.getQueryKey()))) &&
            ((this.queryKeyValue==null && other.getQueryKeyValue()==null) || 
             (this.queryKeyValue!=null &&
              this.queryKeyValue.equals(other.getQueryKeyValue()))) &&
            ((this.reconDate==null && other.getReconDate()==null) || 
             (this.reconDate!=null &&
              this.reconDate.equals(other.getReconDate()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.stan == other.getStan();
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
        if (getAccDate() != null) {
            _hashCode += getAccDate().hashCode();
        }
        _hashCode += getAppCode();
        _hashCode += getBankId();
        if (getCaptDate() != null) {
            _hashCode += getCaptDate().hashCode();
        }
        _hashCode += getCompId();
        if (getCurr() != null) {
            _hashCode += getCurr().hashCode();
        }
        if (getInvoiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsgDate() != null) {
            _hashCode += getMsgDate().hashCode();
        }
        if (getOrig() != null) {
            _hashCode += getOrig().hashCode();
        }
        _hashCode += getPaymSource();
        if (getProcDate() != null) {
            _hashCode += getProcDate().hashCode();
        }
        if (getProvisionNo() != null) {
            _hashCode += getProvisionNo().hashCode();
        }
        if (getQueryKey() != null) {
            _hashCode += getQueryKey().hashCode();
        }
        if (getQueryKeyValue() != null) {
            _hashCode += getQueryKeyValue().hashCode();
        }
        if (getReconDate() != null) {
            _hashCode += getReconDate().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentProvisionCancelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "PaymentProvisionCancelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "accDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "appCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "captDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "compId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curr");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "curr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "invoiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "msgDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orig");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "orig"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.common", "OriginatorId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymSource");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "paymSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "procDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "provisionNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "queryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryKeyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "queryKeyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "reconDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "stan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
