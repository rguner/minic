/**
 * InvoiceQueryByKeyOpenBulkRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package invoice.model.collgw.turkcelltech.com;

public class InvoiceQueryByKeyOpenBulkRequest  implements java.io.Serializable {
    private int bankId;

    private int compId;

    private java.lang.String curr;

    private int invCount;

    private java.lang.String msgDate;

    private common.model.collgw.turkcelltech.com.OriginatorId orig;

    private java.lang.String period;

    private java.lang.String procDate;

    private java.lang.String procTime;

    private java.lang.String queryKey;

    private java.lang.String[] queryKeyValueList;

    private java.lang.String sessionId;

    private long stan;

    public InvoiceQueryByKeyOpenBulkRequest() {
    }

    public InvoiceQueryByKeyOpenBulkRequest(
           int bankId,
           int compId,
           java.lang.String curr,
           int invCount,
           java.lang.String msgDate,
           common.model.collgw.turkcelltech.com.OriginatorId orig,
           java.lang.String period,
           java.lang.String procDate,
           java.lang.String procTime,
           java.lang.String queryKey,
           java.lang.String[] queryKeyValueList,
           java.lang.String sessionId,
           long stan) {
           this.bankId = bankId;
           this.compId = compId;
           this.curr = curr;
           this.invCount = invCount;
           this.msgDate = msgDate;
           this.orig = orig;
           this.period = period;
           this.procDate = procDate;
           this.procTime = procTime;
           this.queryKey = queryKey;
           this.queryKeyValueList = queryKeyValueList;
           this.sessionId = sessionId;
           this.stan = stan;
    }


    /**
     * Gets the bankId value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the compId value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the curr value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return curr
     */
    public java.lang.String getCurr() {
        return curr;
    }


    /**
     * Sets the curr value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param curr
     */
    public void setCurr(java.lang.String curr) {
        this.curr = curr;
    }


    /**
     * Gets the invCount value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return invCount
     */
    public int getInvCount() {
        return invCount;
    }


    /**
     * Sets the invCount value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param invCount
     */
    public void setInvCount(int invCount) {
        this.invCount = invCount;
    }


    /**
     * Gets the msgDate value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the orig value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return orig
     */
    public common.model.collgw.turkcelltech.com.OriginatorId getOrig() {
        return orig;
    }


    /**
     * Sets the orig value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param orig
     */
    public void setOrig(common.model.collgw.turkcelltech.com.OriginatorId orig) {
        this.orig = orig;
    }


    /**
     * Gets the period value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }


    /**
     * Gets the procDate value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return procDate
     */
    public java.lang.String getProcDate() {
        return procDate;
    }


    /**
     * Sets the procDate value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param procDate
     */
    public void setProcDate(java.lang.String procDate) {
        this.procDate = procDate;
    }


    /**
     * Gets the procTime value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return procTime
     */
    public java.lang.String getProcTime() {
        return procTime;
    }


    /**
     * Sets the procTime value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param procTime
     */
    public void setProcTime(java.lang.String procTime) {
        this.procTime = procTime;
    }


    /**
     * Gets the queryKey value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return queryKey
     */
    public java.lang.String getQueryKey() {
        return queryKey;
    }


    /**
     * Sets the queryKey value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param queryKey
     */
    public void setQueryKey(java.lang.String queryKey) {
        this.queryKey = queryKey;
    }


    /**
     * Gets the queryKeyValueList value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return queryKeyValueList
     */
    public java.lang.String[] getQueryKeyValueList() {
        return queryKeyValueList;
    }


    /**
     * Sets the queryKeyValueList value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param queryKeyValueList
     */
    public void setQueryKeyValueList(java.lang.String[] queryKeyValueList) {
        this.queryKeyValueList = queryKeyValueList;
    }


    /**
     * Gets the sessionId value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the stan value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this InvoiceQueryByKeyOpenBulkRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceQueryByKeyOpenBulkRequest)) return false;
        InvoiceQueryByKeyOpenBulkRequest other = (InvoiceQueryByKeyOpenBulkRequest) obj;
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
            this.invCount == other.getInvCount() &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            ((this.orig==null && other.getOrig()==null) || 
             (this.orig!=null &&
              this.orig.equals(other.getOrig()))) &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            ((this.procDate==null && other.getProcDate()==null) || 
             (this.procDate!=null &&
              this.procDate.equals(other.getProcDate()))) &&
            ((this.procTime==null && other.getProcTime()==null) || 
             (this.procTime!=null &&
              this.procTime.equals(other.getProcTime()))) &&
            ((this.queryKey==null && other.getQueryKey()==null) || 
             (this.queryKey!=null &&
              this.queryKey.equals(other.getQueryKey()))) &&
            ((this.queryKeyValueList==null && other.getQueryKeyValueList()==null) || 
             (this.queryKeyValueList!=null &&
              java.util.Arrays.equals(this.queryKeyValueList, other.getQueryKeyValueList()))) &&
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
        _hashCode += getBankId();
        _hashCode += getCompId();
        if (getCurr() != null) {
            _hashCode += getCurr().hashCode();
        }
        _hashCode += getInvCount();
        if (getMsgDate() != null) {
            _hashCode += getMsgDate().hashCode();
        }
        if (getOrig() != null) {
            _hashCode += getOrig().hashCode();
        }
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getProcDate() != null) {
            _hashCode += getProcDate().hashCode();
        }
        if (getProcTime() != null) {
            _hashCode += getProcTime().hashCode();
        }
        if (getQueryKey() != null) {
            _hashCode += getQueryKey().hashCode();
        }
        if (getQueryKeyValueList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryKeyValueList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryKeyValueList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(InvoiceQueryByKeyOpenBulkRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryByKeyOpenBulkRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("invCount");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "invCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "procDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procTime");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "procTime"));
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
        elemField.setFieldName("queryKeyValueList");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "queryKeyValueList"));
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
