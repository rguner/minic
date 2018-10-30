/**
 * PendingGroupInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcell.marsalman.camman.webservices.data.model;

public class PendingGroupInfo  implements java.io.Serializable {
    private java.lang.String barcode;

    private java.lang.String campaignDesc;

    private java.util.Calendar entryDate;

    private java.lang.Long groupId;

    private java.lang.Boolean isEquipmentCampaign;

    private java.util.Calendar modifyDate;

    private java.lang.String rejectMethod;

    private java.lang.Long status;

    private java.lang.String statusDesc;

    private java.lang.String user;

    public PendingGroupInfo() {
    }

    public PendingGroupInfo(
           java.lang.String barcode,
           java.lang.String campaignDesc,
           java.util.Calendar entryDate,
           java.lang.Long groupId,
           java.lang.Boolean isEquipmentCampaign,
           java.util.Calendar modifyDate,
           java.lang.String rejectMethod,
           java.lang.Long status,
           java.lang.String statusDesc,
           java.lang.String user) {
           this.barcode = barcode;
           this.campaignDesc = campaignDesc;
           this.entryDate = entryDate;
           this.groupId = groupId;
           this.isEquipmentCampaign = isEquipmentCampaign;
           this.modifyDate = modifyDate;
           this.rejectMethod = rejectMethod;
           this.status = status;
           this.statusDesc = statusDesc;
           this.user = user;
    }


    /**
     * Gets the barcode value for this PendingGroupInfo.
     * 
     * @return barcode
     */
    public java.lang.String getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this PendingGroupInfo.
     * 
     * @param barcode
     */
    public void setBarcode(java.lang.String barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the campaignDesc value for this PendingGroupInfo.
     * 
     * @return campaignDesc
     */
    public java.lang.String getCampaignDesc() {
        return campaignDesc;
    }


    /**
     * Sets the campaignDesc value for this PendingGroupInfo.
     * 
     * @param campaignDesc
     */
    public void setCampaignDesc(java.lang.String campaignDesc) {
        this.campaignDesc = campaignDesc;
    }


    /**
     * Gets the entryDate value for this PendingGroupInfo.
     * 
     * @return entryDate
     */
    public java.util.Calendar getEntryDate() {
        return entryDate;
    }


    /**
     * Sets the entryDate value for this PendingGroupInfo.
     * 
     * @param entryDate
     */
    public void setEntryDate(java.util.Calendar entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * Gets the groupId value for this PendingGroupInfo.
     * 
     * @return groupId
     */
    public java.lang.Long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this PendingGroupInfo.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the isEquipmentCampaign value for this PendingGroupInfo.
     * 
     * @return isEquipmentCampaign
     */
    public java.lang.Boolean getIsEquipmentCampaign() {
        return isEquipmentCampaign;
    }


    /**
     * Sets the isEquipmentCampaign value for this PendingGroupInfo.
     * 
     * @param isEquipmentCampaign
     */
    public void setIsEquipmentCampaign(java.lang.Boolean isEquipmentCampaign) {
        this.isEquipmentCampaign = isEquipmentCampaign;
    }


    /**
     * Gets the modifyDate value for this PendingGroupInfo.
     * 
     * @return modifyDate
     */
    public java.util.Calendar getModifyDate() {
        return modifyDate;
    }


    /**
     * Sets the modifyDate value for this PendingGroupInfo.
     * 
     * @param modifyDate
     */
    public void setModifyDate(java.util.Calendar modifyDate) {
        this.modifyDate = modifyDate;
    }


    /**
     * Gets the rejectMethod value for this PendingGroupInfo.
     * 
     * @return rejectMethod
     */
    public java.lang.String getRejectMethod() {
        return rejectMethod;
    }


    /**
     * Sets the rejectMethod value for this PendingGroupInfo.
     * 
     * @param rejectMethod
     */
    public void setRejectMethod(java.lang.String rejectMethod) {
        this.rejectMethod = rejectMethod;
    }


    /**
     * Gets the status value for this PendingGroupInfo.
     * 
     * @return status
     */
    public java.lang.Long getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PendingGroupInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.Long status) {
        this.status = status;
    }


    /**
     * Gets the statusDesc value for this PendingGroupInfo.
     * 
     * @return statusDesc
     */
    public java.lang.String getStatusDesc() {
        return statusDesc;
    }


    /**
     * Sets the statusDesc value for this PendingGroupInfo.
     * 
     * @param statusDesc
     */
    public void setStatusDesc(java.lang.String statusDesc) {
        this.statusDesc = statusDesc;
    }


    /**
     * Gets the user value for this PendingGroupInfo.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this PendingGroupInfo.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingGroupInfo)) return false;
        PendingGroupInfo other = (PendingGroupInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.barcode==null && other.getBarcode()==null) || 
             (this.barcode!=null &&
              this.barcode.equals(other.getBarcode()))) &&
            ((this.campaignDesc==null && other.getCampaignDesc()==null) || 
             (this.campaignDesc!=null &&
              this.campaignDesc.equals(other.getCampaignDesc()))) &&
            ((this.entryDate==null && other.getEntryDate()==null) || 
             (this.entryDate!=null &&
              this.entryDate.equals(other.getEntryDate()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.isEquipmentCampaign==null && other.getIsEquipmentCampaign()==null) || 
             (this.isEquipmentCampaign!=null &&
              this.isEquipmentCampaign.equals(other.getIsEquipmentCampaign()))) &&
            ((this.modifyDate==null && other.getModifyDate()==null) || 
             (this.modifyDate!=null &&
              this.modifyDate.equals(other.getModifyDate()))) &&
            ((this.rejectMethod==null && other.getRejectMethod()==null) || 
             (this.rejectMethod!=null &&
              this.rejectMethod.equals(other.getRejectMethod()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDesc==null && other.getStatusDesc()==null) || 
             (this.statusDesc!=null &&
              this.statusDesc.equals(other.getStatusDesc()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getBarcode() != null) {
            _hashCode += getBarcode().hashCode();
        }
        if (getCampaignDesc() != null) {
            _hashCode += getCampaignDesc().hashCode();
        }
        if (getEntryDate() != null) {
            _hashCode += getEntryDate().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getIsEquipmentCampaign() != null) {
            _hashCode += getIsEquipmentCampaign().hashCode();
        }
        if (getModifyDate() != null) {
            _hashCode += getModifyDate().hashCode();
        }
        if (getRejectMethod() != null) {
            _hashCode += getRejectMethod().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDesc() != null) {
            _hashCode += getStatusDesc().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PendingGroupInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "PendingGroupInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "barcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "campaignDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "entryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEquipmentCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "isEquipmentCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "modifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "rejectMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "statusDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.data.webservices.camman.marsalman.turkcell.com", "user"));
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
