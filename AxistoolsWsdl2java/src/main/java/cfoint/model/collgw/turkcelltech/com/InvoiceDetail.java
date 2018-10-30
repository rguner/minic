/**
 * InvoiceDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class InvoiceDetail  implements java.io.Serializable {
    private java.lang.String controlId;

    private java.lang.String duedate;

    private double invAmount;

    private long invNo;

    private int invType;

    private java.lang.String nameSurname;

    private int orderNo;

    private java.lang.String period;

    private long prevMsisdn;

    private java.lang.String remark;

    public InvoiceDetail() {
    }

    public InvoiceDetail(
           java.lang.String controlId,
           java.lang.String duedate,
           double invAmount,
           long invNo,
           int invType,
           java.lang.String nameSurname,
           int orderNo,
           java.lang.String period,
           long prevMsisdn,
           java.lang.String remark) {
           this.controlId = controlId;
           this.duedate = duedate;
           this.invAmount = invAmount;
           this.invNo = invNo;
           this.invType = invType;
           this.nameSurname = nameSurname;
           this.orderNo = orderNo;
           this.period = period;
           this.prevMsisdn = prevMsisdn;
           this.remark = remark;
    }


    /**
     * Gets the controlId value for this InvoiceDetail.
     * 
     * @return controlId
     */
    public java.lang.String getControlId() {
        return controlId;
    }


    /**
     * Sets the controlId value for this InvoiceDetail.
     * 
     * @param controlId
     */
    public void setControlId(java.lang.String controlId) {
        this.controlId = controlId;
    }


    /**
     * Gets the duedate value for this InvoiceDetail.
     * 
     * @return duedate
     */
    public java.lang.String getDuedate() {
        return duedate;
    }


    /**
     * Sets the duedate value for this InvoiceDetail.
     * 
     * @param duedate
     */
    public void setDuedate(java.lang.String duedate) {
        this.duedate = duedate;
    }


    /**
     * Gets the invAmount value for this InvoiceDetail.
     * 
     * @return invAmount
     */
    public double getInvAmount() {
        return invAmount;
    }


    /**
     * Sets the invAmount value for this InvoiceDetail.
     * 
     * @param invAmount
     */
    public void setInvAmount(double invAmount) {
        this.invAmount = invAmount;
    }


    /**
     * Gets the invNo value for this InvoiceDetail.
     * 
     * @return invNo
     */
    public long getInvNo() {
        return invNo;
    }


    /**
     * Sets the invNo value for this InvoiceDetail.
     * 
     * @param invNo
     */
    public void setInvNo(long invNo) {
        this.invNo = invNo;
    }


    /**
     * Gets the invType value for this InvoiceDetail.
     * 
     * @return invType
     */
    public int getInvType() {
        return invType;
    }


    /**
     * Sets the invType value for this InvoiceDetail.
     * 
     * @param invType
     */
    public void setInvType(int invType) {
        this.invType = invType;
    }


    /**
     * Gets the nameSurname value for this InvoiceDetail.
     * 
     * @return nameSurname
     */
    public java.lang.String getNameSurname() {
        return nameSurname;
    }


    /**
     * Sets the nameSurname value for this InvoiceDetail.
     * 
     * @param nameSurname
     */
    public void setNameSurname(java.lang.String nameSurname) {
        this.nameSurname = nameSurname;
    }


    /**
     * Gets the orderNo value for this InvoiceDetail.
     * 
     * @return orderNo
     */
    public int getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this InvoiceDetail.
     * 
     * @param orderNo
     */
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Gets the period value for this InvoiceDetail.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this InvoiceDetail.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }


    /**
     * Gets the prevMsisdn value for this InvoiceDetail.
     * 
     * @return prevMsisdn
     */
    public long getPrevMsisdn() {
        return prevMsisdn;
    }


    /**
     * Sets the prevMsisdn value for this InvoiceDetail.
     * 
     * @param prevMsisdn
     */
    public void setPrevMsisdn(long prevMsisdn) {
        this.prevMsisdn = prevMsisdn;
    }


    /**
     * Gets the remark value for this InvoiceDetail.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this InvoiceDetail.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceDetail)) return false;
        InvoiceDetail other = (InvoiceDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controlId==null && other.getControlId()==null) || 
             (this.controlId!=null &&
              this.controlId.equals(other.getControlId()))) &&
            ((this.duedate==null && other.getDuedate()==null) || 
             (this.duedate!=null &&
              this.duedate.equals(other.getDuedate()))) &&
            this.invAmount == other.getInvAmount() &&
            this.invNo == other.getInvNo() &&
            this.invType == other.getInvType() &&
            ((this.nameSurname==null && other.getNameSurname()==null) || 
             (this.nameSurname!=null &&
              this.nameSurname.equals(other.getNameSurname()))) &&
            this.orderNo == other.getOrderNo() &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
            this.prevMsisdn == other.getPrevMsisdn() &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark())));
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
        if (getControlId() != null) {
            _hashCode += getControlId().hashCode();
        }
        if (getDuedate() != null) {
            _hashCode += getDuedate().hashCode();
        }
        _hashCode += new Double(getInvAmount()).hashCode();
        _hashCode += new Long(getInvNo()).hashCode();
        _hashCode += getInvType();
        if (getNameSurname() != null) {
            _hashCode += getNameSurname().hashCode();
        }
        _hashCode += getOrderNo();
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        _hashCode += new Long(getPrevMsisdn()).hashCode();
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "controlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duedate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "duedate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invType");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSurname");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "nameSurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "orderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevMsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "prevMsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "remark"));
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
