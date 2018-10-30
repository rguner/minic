/**
 * AutoPaymentInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class AutoPaymentInfoResponse  implements java.io.Serializable {
    private java.lang.Integer apayStatus;

    private java.lang.String appDate;

    private java.lang.String appOwner;

    private java.lang.Integer bankId;

    private java.lang.String bankName;

    private java.lang.String billCycle;

    private java.lang.String branchId;

    private java.lang.String ccNo;

    private java.lang.String errMsg;

    private java.lang.Integer reasonCode;

    private java.lang.String respCode;

    private java.lang.Integer tcellStatus;

    public AutoPaymentInfoResponse() {
    }

    public AutoPaymentInfoResponse(
           java.lang.Integer apayStatus,
           java.lang.String appDate,
           java.lang.String appOwner,
           java.lang.Integer bankId,
           java.lang.String bankName,
           java.lang.String billCycle,
           java.lang.String branchId,
           java.lang.String ccNo,
           java.lang.String errMsg,
           java.lang.Integer reasonCode,
           java.lang.String respCode,
           java.lang.Integer tcellStatus) {
           this.apayStatus = apayStatus;
           this.appDate = appDate;
           this.appOwner = appOwner;
           this.bankId = bankId;
           this.bankName = bankName;
           this.billCycle = billCycle;
           this.branchId = branchId;
           this.ccNo = ccNo;
           this.errMsg = errMsg;
           this.reasonCode = reasonCode;
           this.respCode = respCode;
           this.tcellStatus = tcellStatus;
    }


    /**
     * Gets the apayStatus value for this AutoPaymentInfoResponse.
     * 
     * @return apayStatus
     */
    public java.lang.Integer getApayStatus() {
        return apayStatus;
    }


    /**
     * Sets the apayStatus value for this AutoPaymentInfoResponse.
     * 
     * @param apayStatus
     */
    public void setApayStatus(java.lang.Integer apayStatus) {
        this.apayStatus = apayStatus;
    }


    /**
     * Gets the appDate value for this AutoPaymentInfoResponse.
     * 
     * @return appDate
     */
    public java.lang.String getAppDate() {
        return appDate;
    }


    /**
     * Sets the appDate value for this AutoPaymentInfoResponse.
     * 
     * @param appDate
     */
    public void setAppDate(java.lang.String appDate) {
        this.appDate = appDate;
    }


    /**
     * Gets the appOwner value for this AutoPaymentInfoResponse.
     * 
     * @return appOwner
     */
    public java.lang.String getAppOwner() {
        return appOwner;
    }


    /**
     * Sets the appOwner value for this AutoPaymentInfoResponse.
     * 
     * @param appOwner
     */
    public void setAppOwner(java.lang.String appOwner) {
        this.appOwner = appOwner;
    }


    /**
     * Gets the bankId value for this AutoPaymentInfoResponse.
     * 
     * @return bankId
     */
    public java.lang.Integer getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this AutoPaymentInfoResponse.
     * 
     * @param bankId
     */
    public void setBankId(java.lang.Integer bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the bankName value for this AutoPaymentInfoResponse.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this AutoPaymentInfoResponse.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the billCycle value for this AutoPaymentInfoResponse.
     * 
     * @return billCycle
     */
    public java.lang.String getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this AutoPaymentInfoResponse.
     * 
     * @param billCycle
     */
    public void setBillCycle(java.lang.String billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the branchId value for this AutoPaymentInfoResponse.
     * 
     * @return branchId
     */
    public java.lang.String getBranchId() {
        return branchId;
    }


    /**
     * Sets the branchId value for this AutoPaymentInfoResponse.
     * 
     * @param branchId
     */
    public void setBranchId(java.lang.String branchId) {
        this.branchId = branchId;
    }


    /**
     * Gets the ccNo value for this AutoPaymentInfoResponse.
     * 
     * @return ccNo
     */
    public java.lang.String getCcNo() {
        return ccNo;
    }


    /**
     * Sets the ccNo value for this AutoPaymentInfoResponse.
     * 
     * @param ccNo
     */
    public void setCcNo(java.lang.String ccNo) {
        this.ccNo = ccNo;
    }


    /**
     * Gets the errMsg value for this AutoPaymentInfoResponse.
     * 
     * @return errMsg
     */
    public java.lang.String getErrMsg() {
        return errMsg;
    }


    /**
     * Sets the errMsg value for this AutoPaymentInfoResponse.
     * 
     * @param errMsg
     */
    public void setErrMsg(java.lang.String errMsg) {
        this.errMsg = errMsg;
    }


    /**
     * Gets the reasonCode value for this AutoPaymentInfoResponse.
     * 
     * @return reasonCode
     */
    public java.lang.Integer getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this AutoPaymentInfoResponse.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.Integer reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the respCode value for this AutoPaymentInfoResponse.
     * 
     * @return respCode
     */
    public java.lang.String getRespCode() {
        return respCode;
    }


    /**
     * Sets the respCode value for this AutoPaymentInfoResponse.
     * 
     * @param respCode
     */
    public void setRespCode(java.lang.String respCode) {
        this.respCode = respCode;
    }


    /**
     * Gets the tcellStatus value for this AutoPaymentInfoResponse.
     * 
     * @return tcellStatus
     */
    public java.lang.Integer getTcellStatus() {
        return tcellStatus;
    }


    /**
     * Sets the tcellStatus value for this AutoPaymentInfoResponse.
     * 
     * @param tcellStatus
     */
    public void setTcellStatus(java.lang.Integer tcellStatus) {
        this.tcellStatus = tcellStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPaymentInfoResponse)) return false;
        AutoPaymentInfoResponse other = (AutoPaymentInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apayStatus==null && other.getApayStatus()==null) || 
             (this.apayStatus!=null &&
              this.apayStatus.equals(other.getApayStatus()))) &&
            ((this.appDate==null && other.getAppDate()==null) || 
             (this.appDate!=null &&
              this.appDate.equals(other.getAppDate()))) &&
            ((this.appOwner==null && other.getAppOwner()==null) || 
             (this.appOwner!=null &&
              this.appOwner.equals(other.getAppOwner()))) &&
            ((this.bankId==null && other.getBankId()==null) || 
             (this.bankId!=null &&
              this.bankId.equals(other.getBankId()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.billCycle==null && other.getBillCycle()==null) || 
             (this.billCycle!=null &&
              this.billCycle.equals(other.getBillCycle()))) &&
            ((this.branchId==null && other.getBranchId()==null) || 
             (this.branchId!=null &&
              this.branchId.equals(other.getBranchId()))) &&
            ((this.ccNo==null && other.getCcNo()==null) || 
             (this.ccNo!=null &&
              this.ccNo.equals(other.getCcNo()))) &&
            ((this.errMsg==null && other.getErrMsg()==null) || 
             (this.errMsg!=null &&
              this.errMsg.equals(other.getErrMsg()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.respCode==null && other.getRespCode()==null) || 
             (this.respCode!=null &&
              this.respCode.equals(other.getRespCode()))) &&
            ((this.tcellStatus==null && other.getTcellStatus()==null) || 
             (this.tcellStatus!=null &&
              this.tcellStatus.equals(other.getTcellStatus())));
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
        if (getApayStatus() != null) {
            _hashCode += getApayStatus().hashCode();
        }
        if (getAppDate() != null) {
            _hashCode += getAppDate().hashCode();
        }
        if (getAppOwner() != null) {
            _hashCode += getAppOwner().hashCode();
        }
        if (getBankId() != null) {
            _hashCode += getBankId().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBillCycle() != null) {
            _hashCode += getBillCycle().hashCode();
        }
        if (getBranchId() != null) {
            _hashCode += getBranchId().hashCode();
        }
        if (getCcNo() != null) {
            _hashCode += getCcNo().hashCode();
        }
        if (getErrMsg() != null) {
            _hashCode += getErrMsg().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getRespCode() != null) {
            _hashCode += getRespCode().hashCode();
        }
        if (getTcellStatus() != null) {
            _hashCode += getTcellStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPaymentInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "AutoPaymentInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apayStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "apayStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "appDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "appOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "billCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "branchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "ccNo"));
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
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "reasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respCode");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "respCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcellStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "tcellStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
