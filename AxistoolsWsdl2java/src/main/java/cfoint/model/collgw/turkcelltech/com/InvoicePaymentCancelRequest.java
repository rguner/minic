/**
 * InvoicePaymentCancelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class InvoicePaymentCancelRequest  implements java.io.Serializable {
    private java.lang.String accDate;

    private int appCode;

    private int bankId;

    private java.lang.String captDate;

    private int compId;

    private java.lang.String curr;

    private int invCount;

    private java.lang.String invData;

    private java.lang.Object[] invoiceList;

    private java.lang.String msgDate;

    private long msisdn;

    private int opType;

    private int paymSource;

    private java.lang.String procDate;

    private java.lang.String sessionId;

    private long stan;

    public InvoicePaymentCancelRequest() {
    }

    public InvoicePaymentCancelRequest(
           java.lang.String accDate,
           int appCode,
           int bankId,
           java.lang.String captDate,
           int compId,
           java.lang.String curr,
           int invCount,
           java.lang.String invData,
           java.lang.Object[] invoiceList,
           java.lang.String msgDate,
           long msisdn,
           int opType,
           int paymSource,
           java.lang.String procDate,
           java.lang.String sessionId,
           long stan) {
           this.accDate = accDate;
           this.appCode = appCode;
           this.bankId = bankId;
           this.captDate = captDate;
           this.compId = compId;
           this.curr = curr;
           this.invCount = invCount;
           this.invData = invData;
           this.invoiceList = invoiceList;
           this.msgDate = msgDate;
           this.msisdn = msisdn;
           this.opType = opType;
           this.paymSource = paymSource;
           this.procDate = procDate;
           this.sessionId = sessionId;
           this.stan = stan;
    }


    /**
     * Gets the accDate value for this InvoicePaymentCancelRequest.
     * 
     * @return accDate
     */
    public java.lang.String getAccDate() {
        return accDate;
    }


    /**
     * Sets the accDate value for this InvoicePaymentCancelRequest.
     * 
     * @param accDate
     */
    public void setAccDate(java.lang.String accDate) {
        this.accDate = accDate;
    }


    /**
     * Gets the appCode value for this InvoicePaymentCancelRequest.
     * 
     * @return appCode
     */
    public int getAppCode() {
        return appCode;
    }


    /**
     * Sets the appCode value for this InvoicePaymentCancelRequest.
     * 
     * @param appCode
     */
    public void setAppCode(int appCode) {
        this.appCode = appCode;
    }


    /**
     * Gets the bankId value for this InvoicePaymentCancelRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this InvoicePaymentCancelRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the captDate value for this InvoicePaymentCancelRequest.
     * 
     * @return captDate
     */
    public java.lang.String getCaptDate() {
        return captDate;
    }


    /**
     * Sets the captDate value for this InvoicePaymentCancelRequest.
     * 
     * @param captDate
     */
    public void setCaptDate(java.lang.String captDate) {
        this.captDate = captDate;
    }


    /**
     * Gets the compId value for this InvoicePaymentCancelRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this InvoicePaymentCancelRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the curr value for this InvoicePaymentCancelRequest.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this InvoicePaymentCancelRequest.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }


    /**
     * Gets the invCount value for this InvoicePaymentCancelRequest.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this InvoicePaymentCancelRequest.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }


    /**
     * Gets the invData value for this InvoicePaymentCancelRequest.
     * 
     * @return invData
     */
    public java.lang.String getInvData() {
        return invData;
    }


    /**
     * Sets the invData value for this InvoicePaymentCancelRequest.
     * 
     * @param invData
     */
    public void setInvData(java.lang.String invData) {
        this.invData = invData;
    }


    /**
     * Gets the invoiceList value for this InvoicePaymentCancelRequest.
     * 
     * @return invoiceList
     */
    public java.lang.Object[] getInvoiceList() {
        return invoiceList;
    }


    /**
     * Sets the invoiceList value for this InvoicePaymentCancelRequest.
     * 
     * @param invoiceList
     */
    public void setInvoiceList(java.lang.Object[] invoiceList) {
        this.invoiceList = invoiceList;
    }


    /**
     * Gets the msgDate value for this InvoicePaymentCancelRequest.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this InvoicePaymentCancelRequest.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the msisdn value for this InvoicePaymentCancelRequest.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InvoicePaymentCancelRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the opType value for this InvoicePaymentCancelRequest.
     * 
     * @return opType
     */
    public int getOpType() {
        return opType;
    }


    /**
     * Sets the opType value for this InvoicePaymentCancelRequest.
     * 
     * @param opType
     */
    public void setOpType(int opType) {
        this.opType = opType;
    }


    /**
     * Gets the paymSource value for this InvoicePaymentCancelRequest.
     * 
     * @return paymSource
     */
    public int getPaymSource() {
        return paymSource;
    }


    /**
     * Sets the paymSource value for this InvoicePaymentCancelRequest.
     * 
     * @param paymSource
     */
    public void setPaymSource(int paymSource) {
        this.paymSource = paymSource;
    }


    /**
     * Gets the procDate value for this InvoicePaymentCancelRequest.
     * 
     * @return procDate
     */
    public java.lang.String getProcDate() {
        return procDate;
    }


    /**
     * Sets the procDate value for this InvoicePaymentCancelRequest.
     * 
     * @param procDate
     */
    public void setProcDate(java.lang.String procDate) {
        this.procDate = procDate;
    }


    /**
     * Gets the sessionId value for this InvoicePaymentCancelRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this InvoicePaymentCancelRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the stan value for this InvoicePaymentCancelRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this InvoicePaymentCancelRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoicePaymentCancelRequest)) return false;
        InvoicePaymentCancelRequest other = (InvoicePaymentCancelRequest) obj;
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
            this.invCount == other.getInvCount() &&
            ((this.invData==null && other.getInvData()==null) || 
             (this.invData!=null &&
              this.invData.equals(other.getInvData()))) &&
            ((this.invoiceList==null && other.getInvoiceList()==null) || 
             (this.invoiceList!=null &&
              java.util.Arrays.equals(this.invoiceList, other.getInvoiceList()))) &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            this.msisdn == other.getMsisdn() &&
            this.opType == other.getOpType() &&
            this.paymSource == other.getPaymSource() &&
            ((this.procDate==null && other.getProcDate()==null) || 
             (this.procDate!=null &&
              this.procDate.equals(other.getProcDate()))) &&
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
        _hashCode += getInvCount();
        if (getInvData() != null) {
            _hashCode += getInvData().hashCode();
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
        _hashCode += new Long(getMsisdn()).hashCode();
        _hashCode += getOpType();
        _hashCode += getPaymSource();
        if (getProcDate() != null) {
            _hashCode += getProcDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(InvoicePaymentCancelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentCancelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "accDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "appCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "captDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "compId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curr");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "curr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invCount");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invData");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invoiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "msgDate"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymSource");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "paymSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "procDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "stan"));
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
