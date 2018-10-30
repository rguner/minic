/**
 * CustomerInvoiceInfo2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package invoice.model.collgw.turkcelltech.com;

public class CustomerInvoiceInfo2  implements java.io.Serializable {
    private common.model.collgw.turkcelltech.com.CustomerInformation customerInformation;

    private java.lang.Object[] invoiceList;

    private java.lang.String queryKeyValue;

    public CustomerInvoiceInfo2() {
    }

    public CustomerInvoiceInfo2(
           common.model.collgw.turkcelltech.com.CustomerInformation customerInformation,
           java.lang.Object[] invoiceList,
           java.lang.String queryKeyValue) {
           this.customerInformation = customerInformation;
           this.invoiceList = invoiceList;
           this.queryKeyValue = queryKeyValue;
    }


    /**
     * Gets the customerInformation value for this CustomerInvoiceInfo2.
     * 
     * @return customerInformation
     */
    public common.model.collgw.turkcelltech.com.CustomerInformation getCustomerInformation() {
        return customerInformation;
    }


    /**
     * Sets the customerInformation value for this CustomerInvoiceInfo2.
     * 
     * @param customerInformation
     */
    public void setCustomerInformation(common.model.collgw.turkcelltech.com.CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
    }


    /**
     * Gets the invoiceList value for this CustomerInvoiceInfo2.
     * 
     * @return invoiceList
     */
    public java.lang.Object[] getInvoiceList() {
        return invoiceList;
    }


    /**
     * Sets the invoiceList value for this CustomerInvoiceInfo2.
     * 
     * @param invoiceList
     */
    public void setInvoiceList(java.lang.Object[] invoiceList) {
        this.invoiceList = invoiceList;
    }


    /**
     * Gets the queryKeyValue value for this CustomerInvoiceInfo2.
     * 
     * @return queryKeyValue
     */
    public java.lang.String getQueryKeyValue() {
        return queryKeyValue;
    }


    /**
     * Sets the queryKeyValue value for this CustomerInvoiceInfo2.
     * 
     * @param queryKeyValue
     */
    public void setQueryKeyValue(java.lang.String queryKeyValue) {
        this.queryKeyValue = queryKeyValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerInvoiceInfo2)) return false;
        CustomerInvoiceInfo2 other = (CustomerInvoiceInfo2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerInformation==null && other.getCustomerInformation()==null) || 
             (this.customerInformation!=null &&
              this.customerInformation.equals(other.getCustomerInformation()))) &&
            ((this.invoiceList==null && other.getInvoiceList()==null) || 
             (this.invoiceList!=null &&
              java.util.Arrays.equals(this.invoiceList, other.getInvoiceList()))) &&
            ((this.queryKeyValue==null && other.getQueryKeyValue()==null) || 
             (this.queryKeyValue!=null &&
              this.queryKeyValue.equals(other.getQueryKeyValue())));
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
        if (getCustomerInformation() != null) {
            _hashCode += getCustomerInformation().hashCode();
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
        if (getQueryKeyValue() != null) {
            _hashCode += getQueryKeyValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerInvoiceInfo2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "CustomerInvoiceInfo2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "customerInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.common", "CustomerInformation"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "invoiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryKeyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "queryKeyValue"));
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
