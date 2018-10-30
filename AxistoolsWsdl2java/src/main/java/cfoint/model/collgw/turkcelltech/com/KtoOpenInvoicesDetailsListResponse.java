/**
 * KtoOpenInvoicesDetailsListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class KtoOpenInvoicesDetailsListResponse  implements java.io.Serializable {
    private java.lang.Object[] invoiceList;

    private java.lang.String resultCode;

    private java.lang.String resultDesc;

    public KtoOpenInvoicesDetailsListResponse() {
    }

    public KtoOpenInvoicesDetailsListResponse(
           java.lang.Object[] invoiceList,
           java.lang.String resultCode,
           java.lang.String resultDesc) {
           this.invoiceList = invoiceList;
           this.resultCode = resultCode;
           this.resultDesc = resultDesc;
    }


    /**
     * Gets the invoiceList value for this KtoOpenInvoicesDetailsListResponse.
     * 
     * @return invoiceList
     */
    public java.lang.Object[] getInvoiceList() {
        return invoiceList;
    }


    /**
     * Sets the invoiceList value for this KtoOpenInvoicesDetailsListResponse.
     * 
     * @param invoiceList
     */
    public void setInvoiceList(java.lang.Object[] invoiceList) {
        this.invoiceList = invoiceList;
    }


    /**
     * Gets the resultCode value for this KtoOpenInvoicesDetailsListResponse.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this KtoOpenInvoicesDetailsListResponse.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDesc value for this KtoOpenInvoicesDetailsListResponse.
     * 
     * @return resultDesc
     */
    public java.lang.String getResultDesc() {
        return resultDesc;
    }


    /**
     * Sets the resultDesc value for this KtoOpenInvoicesDetailsListResponse.
     * 
     * @param resultDesc
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KtoOpenInvoicesDetailsListResponse)) return false;
        KtoOpenInvoicesDetailsListResponse other = (KtoOpenInvoicesDetailsListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceList==null && other.getInvoiceList()==null) || 
             (this.invoiceList!=null &&
              java.util.Arrays.equals(this.invoiceList, other.getInvoiceList()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.resultDesc==null && other.getResultDesc()==null) || 
             (this.resultDesc!=null &&
              this.resultDesc.equals(other.getResultDesc())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getResultDesc() != null) {
            _hashCode += getResultDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KtoOpenInvoicesDetailsListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invoiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "resultDesc"));
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
