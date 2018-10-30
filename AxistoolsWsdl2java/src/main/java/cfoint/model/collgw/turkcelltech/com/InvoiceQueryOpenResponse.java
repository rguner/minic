/**
 * InvoiceQueryOpenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class InvoiceQueryOpenResponse  implements java.io.Serializable {
    private int bankId;

    private int compId;

    private java.lang.String curr;

    private java.lang.String errMsg;

    private int invCount;

    private java.lang.Object[] invoiceList;

    private java.lang.String msgDate;

    private long msisdn;

    private common.model.collgw.turkcelltech.com.OriginatorId orig;

    private java.lang.String respCode;

    private long stan;

    public InvoiceQueryOpenResponse() {
    }

    public InvoiceQueryOpenResponse(
           int bankId,
           int compId,
           java.lang.String curr,
           java.lang.String errMsg,
           int invCount,
           java.lang.Object[] invoiceList,
           java.lang.String msgDate,
           long msisdn,
           common.model.collgw.turkcelltech.com.OriginatorId orig,
           java.lang.String respCode,
           long stan) {
           this.bankId = bankId;
           this.compId = compId;
           this.curr = curr;
           this.errMsg = errMsg;
           this.invCount = invCount;
           this.invoiceList = invoiceList;
           this.msgDate = msgDate;
           this.msisdn = msisdn;
           this.orig = orig;
           this.respCode = respCode;
           this.stan = stan;
    }


    /**
     * Gets the bankId value for this InvoiceQueryOpenResponse.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this InvoiceQueryOpenResponse.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the compId value for this InvoiceQueryOpenResponse.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this InvoiceQueryOpenResponse.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the curr value for this InvoiceQueryOpenResponse.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this InvoiceQueryOpenResponse.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }


    /**
     * Gets the errMsg value for this InvoiceQueryOpenResponse.
     * 
     * @return errMsg
     */
    public java.lang.String getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this InvoiceQueryOpenResponse.
     * 
     * @param errMsg
     */
    public void setErrMsg(java.lang.String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * Gets the invCount value for this InvoiceQueryOpenResponse.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this InvoiceQueryOpenResponse.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }


    /**
     * Gets the invoiceList value for this InvoiceQueryOpenResponse.
     * 
     * @return invoiceList
     */
    public java.lang.Object[] getInvoiceList() {
        return invoiceList;
    }


    /**
     * Sets the invoiceList value for this InvoiceQueryOpenResponse.
     * 
     * @param invoiceList
     */
    public void setInvoiceList(java.lang.Object[] invoiceList) {
        this.invoiceList = invoiceList;
    }


    /**
     * Gets the msgDate value for this InvoiceQueryOpenResponse.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this InvoiceQueryOpenResponse.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the msisdn value for this InvoiceQueryOpenResponse.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InvoiceQueryOpenResponse.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the orig value for this InvoiceQueryOpenResponse.
     * 
     * @return orig
     */
    public common.model.collgw.turkcelltech.com.OriginatorId getOrig() {
        return orig;
    }


    /**
     * Sets the orig value for this InvoiceQueryOpenResponse.
     * 
     * @param orig
     */
    public void setOrig(common.model.collgw.turkcelltech.com.OriginatorId orig) {
        this.orig = orig;
    }


    /**
     * Gets the respCode value for this InvoiceQueryOpenResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this InvoiceQueryOpenResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the stan value for this InvoiceQueryOpenResponse.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this InvoiceQueryOpenResponse.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceQueryOpenResponse)) return false;
        InvoiceQueryOpenResponse other = (InvoiceQueryOpenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bankId == other.getBankId() &&
            this.compId == other.getCompId() &&
            ((this.curr==null && other.getCurr()==null) || 
             (this.curr!=null &&
              this.curr.equals(other.getCurr()))) &&
            ((this.errMsg==null && other.getErrMsg()==null) || 
             (this.errMsg!=null &&
              this.errMsg.equals(other.getErrMsg()))) &&
            this.invCount == other.getInvCount() &&
            ((this.invoiceList==null && other.getInvoiceList()==null) || 
             (this.invoiceList!=null &&
              java.util.Arrays.equals(this.invoiceList, other.getInvoiceList()))) &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            this.msisdn == other.getMsisdn() &&
            ((this.orig==null && other.getOrig()==null) || 
             (this.orig!=null &&
              this.orig.equals(other.getOrig()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
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
        _hashCode += getBankId();
        _hashCode += getCompId();
        if (getCurr() != null) {
            _hashCode += getCurr().hashCode();
        }
        if (getErrMsg() != null) {
            _hashCode += getErrMsg().hashCode();
        }
        _hashCode += getInvCount();
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
        if (getOrig() != null) {
            _hashCode += getOrig().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceQueryOpenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceQueryOpenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("errMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "errMsg"));
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
        elemField.setFieldName("orig");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "orig"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.common", "OriginatorId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "respCode"));
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
