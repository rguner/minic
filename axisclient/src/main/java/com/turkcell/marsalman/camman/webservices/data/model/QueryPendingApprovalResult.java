/**
 * QueryPendingApprovalResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcell.marsalman.camman.webservices.data.model;

public class QueryPendingApprovalResult  implements java.io.Serializable {
    private com.turkcell.marsalman.camman.webservices.data.model.PendingGroupInfo[] pendingGroupInfoList;

    private java.lang.Long resultCode;

    private java.lang.String resultDesc;

    public QueryPendingApprovalResult() {
    }

    public QueryPendingApprovalResult(
           com.turkcell.marsalman.camman.webservices.data.model.PendingGroupInfo[] pendingGroupInfoList,
           java.lang.Long resultCode,
           java.lang.String resultDesc) {
           this.pendingGroupInfoList = pendingGroupInfoList;
           this.resultCode = resultCode;
           this.resultDesc = resultDesc;
    }


    /**
     * Gets the pendingGroupInfoList value for this QueryPendingApprovalResult.
     * 
     * @return pendingGroupInfoList
     */
    public com.turkcell.marsalman.camman.webservices.data.model.PendingGroupInfo[] getPendingGroupInfoList() {
        return pendingGroupInfoList;
    }


    /**
     * Sets the pendingGroupInfoList value for this QueryPendingApprovalResult.
     * 
     * @param pendingGroupInfoList
     */
    public void setPendingGroupInfoList(com.turkcell.marsalman.camman.webservices.data.model.PendingGroupInfo[] pendingGroupInfoList) {
        this.pendingGroupInfoList = pendingGroupInfoList;
    }


    /**
     * Gets the resultCode value for this QueryPendingApprovalResult.
     * 
     * @return resultCode
     */
    public java.lang.Long getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this QueryPendingApprovalResult.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.Long resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultDesc value for this QueryPendingApprovalResult.
     * 
     * @return resultDesc
     */
    public java.lang.String getResultDesc() {
        return resultDesc;
    }


    /**
     * Sets the resultDesc value for this QueryPendingApprovalResult.
     * 
     * @param resultDesc
     */
    public void setResultDesc(java.lang.String resultDesc) {
        this.resultDesc = resultDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPendingApprovalResult)) return false;
        QueryPendingApprovalResult other = (QueryPendingApprovalResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pendingGroupInfoList==null && other.getPendingGroupInfoList()==null) || 
             (this.pendingGroupInfoList!=null &&
              java.util.Arrays.equals(this.pendingGroupInfoList, other.getPendingGroupInfoList()))) &&
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
        if (getPendingGroupInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendingGroupInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPendingGroupInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryPendingApprovalResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "QueryPendingApprovalResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingGroupInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "pendingGroupInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "PendingGroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "PendingGroupInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "resultDesc"));
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
