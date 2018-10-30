/**
 * CCSIResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcell.marsalman.camman.webservices.data.model;

public class CCSIResult  implements java.io.Serializable {
    private java.lang.Long response;

    private java.lang.String responseDesc;

    public CCSIResult() {
    }

    public CCSIResult(
           java.lang.Long response,
           java.lang.String responseDesc) {
           this.response = response;
           this.responseDesc = responseDesc;
    }


    /**
     * Gets the response value for this CCSIResult.
     * 
     * @return response
     */
    public java.lang.Long getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CCSIResult.
     * 
     * @param response
     */
    public void setResponse(java.lang.Long response) {
        this.response = response;
    }


    /**
     * Gets the responseDesc value for this CCSIResult.
     * 
     * @return responseDesc
     */
    public java.lang.String getResponseDesc() {
        return responseDesc;
    }


    /**
     * Sets the responseDesc value for this CCSIResult.
     * 
     * @param responseDesc
     */
    public void setResponseDesc(java.lang.String responseDesc) {
        this.responseDesc = responseDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CCSIResult)) return false;
        CCSIResult other = (CCSIResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.responseDesc==null && other.getResponseDesc()==null) || 
             (this.responseDesc!=null &&
              this.responseDesc.equals(other.getResponseDesc())));
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
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getResponseDesc() != null) {
            _hashCode += getResponseDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CCSIResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "CCSIResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "responseDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
