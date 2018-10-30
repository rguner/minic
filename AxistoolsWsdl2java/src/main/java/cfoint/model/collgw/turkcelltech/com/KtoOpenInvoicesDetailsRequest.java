/**
 * KtoOpenInvoicesDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class KtoOpenInvoicesDetailsRequest  implements java.io.Serializable {
    private int bankId;

    private int compId;

    private long invoiceNo;

    private long ktoMsisdn;

    public KtoOpenInvoicesDetailsRequest() {
    }

    public KtoOpenInvoicesDetailsRequest(
           int bankId,
           int compId,
           long invoiceNo,
           long ktoMsisdn) {
           this.bankId = bankId;
           this.compId = compId;
           this.invoiceNo = invoiceNo;
           this.ktoMsisdn = ktoMsisdn;
    }


    /**
     * Gets the bankId value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the compId value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the invoiceNo value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @return invoiceNo
     */
    public long getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the ktoMsisdn value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @return ktoMsisdn
     */
    public long getKtoMsisdn() {
        return ktoMsisdn;
    }


    /**
     * Sets the ktoMsisdn value for this KtoOpenInvoicesDetailsRequest.
     * 
     * @param ktoMsisdn
     */
    public void setKtoMsisdn(long ktoMsisdn) {
        this.ktoMsisdn = ktoMsisdn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KtoOpenInvoicesDetailsRequest)) return false;
        KtoOpenInvoicesDetailsRequest other = (KtoOpenInvoicesDetailsRequest) obj;
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
            this.invoiceNo == other.getInvoiceNo() &&
            this.ktoMsisdn == other.getKtoMsisdn();
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
        _hashCode += new Long(getInvoiceNo()).hashCode();
        _hashCode += new Long(getKtoMsisdn()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KtoOpenInvoicesDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsRequest"));
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
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ktoMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "ktoMsisdn"));
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
