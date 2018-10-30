/**
 * KtoOpenInvoicesDetailsListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class KtoOpenInvoicesDetailsListRequest  implements java.io.Serializable {
    private int bankId;

    private int compId;

    private int count;

    private long invoiceNo;

    private int pageNum;

    private java.lang.String queryNo;

    public KtoOpenInvoicesDetailsListRequest() {
    }

    public KtoOpenInvoicesDetailsListRequest(
           int bankId,
           int compId,
           int count,
           long invoiceNo,
           int pageNum,
           java.lang.String queryNo) {
           this.bankId = bankId;
           this.compId = compId;
           this.count = count;
           this.invoiceNo = invoiceNo;
           this.pageNum = pageNum;
           this.queryNo = queryNo;
    }


    /**
     * Gets the bankId value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the compId value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the count value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the invoiceNo value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @return invoiceNo
     */
    public long getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the pageNum value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @return pageNum
     */
    public int getPageNum() {
        return pageNum;
    }


    /**
     * Sets the pageNum value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @param pageNum
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * Gets the queryNo value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @return queryNo
     */
    public java.lang.String getQueryNo() {
        return queryNo;
    }


    /**
     * Sets the queryNo value for this KtoOpenInvoicesDetailsListRequest.
     * 
     * @param queryNo
     */
    public void setQueryNo(java.lang.String queryNo) {
        this.queryNo = queryNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KtoOpenInvoicesDetailsListRequest)) return false;
        KtoOpenInvoicesDetailsListRequest other = (KtoOpenInvoicesDetailsListRequest) obj;
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
            this.count == other.getCount() &&
            this.invoiceNo == other.getInvoiceNo() &&
            this.pageNum == other.getPageNum() &&
            ((this.queryNo==null && other.getQueryNo()==null) || 
             (this.queryNo!=null &&
              this.queryNo.equals(other.getQueryNo())));
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
        _hashCode += getCount();
        _hashCode += new Long(getInvoiceNo()).hashCode();
        _hashCode += getPageNum();
        if (getQueryNo() != null) {
            _hashCode += getQueryNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KtoOpenInvoicesDetailsListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsListRequest"));
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
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNum");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "pageNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "queryNo"));
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
