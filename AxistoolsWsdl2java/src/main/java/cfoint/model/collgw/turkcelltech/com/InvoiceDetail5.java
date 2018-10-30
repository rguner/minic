/**
 * InvoiceDetail5.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class InvoiceDetail5  implements java.io.Serializable {
    private java.lang.String controlId;

    private java.lang.String dueDate;

    private double invAmount;

    private java.lang.String invDate;

    private long invNo;

    private int invType;

    private long msisdn;

    private java.lang.String nameSurname;

    private int orderNo;

    private double payAmount;

    private java.lang.String period;

    private java.lang.String remark;

    public InvoiceDetail5() {
    }

    public InvoiceDetail5(
           java.lang.String controlId,
           java.lang.String dueDate,
           double invAmount,
           java.lang.String invDate,
           long invNo,
           int invType,
           long msisdn,
           java.lang.String nameSurname,
           int orderNo,
           double payAmount,
           java.lang.String period,
           java.lang.String remark) {
           this.controlId = controlId;
           this.dueDate = dueDate;
           this.invAmount = invAmount;
           this.invDate = invDate;
           this.invNo = invNo;
           this.invType = invType;
           this.msisdn = msisdn;
           this.nameSurname = nameSurname;
           this.orderNo = orderNo;
           this.payAmount = payAmount;
           this.period = period;
           this.remark = remark;
    }


    /**
     * Gets the controlId value for this InvoiceDetail5.
     * 
     * @return controlId
     */
    public java.lang.String getControlId() {
        return controlId;
    }


    /**
     * Sets the controlId value for this InvoiceDetail5.
     * 
     * @param controlId
     */
    public void setControlId(java.lang.String controlId) {
        this.controlId = controlId;
    }


    /**
     * Gets the dueDate value for this InvoiceDetail5.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InvoiceDetail5.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the invAmount value for this InvoiceDetail5.
     * 
     * @return invAmount
     */
    public double getInvAmount() {
        return invAmount;
    }


    /**
     * Sets the invAmount value for this InvoiceDetail5.
     * 
     * @param invAmount
     */
    public void setInvAmount(double invAmount) {
        this.invAmount = invAmount;
    }


    /**
     * Gets the invDate value for this InvoiceDetail5.
     * 
     * @return invDate
     */
    public java.lang.String getInvDate() {
        return invDate;
    }


    /**
     * Sets the invDate value for this InvoiceDetail5.
     * 
     * @param invDate
     */
    public void setInvDate(java.lang.String invDate) {
        this.invDate = invDate;
    }


    /**
     * Gets the invNo value for this InvoiceDetail5.
     * 
     * @return invNo
     */
    public long getInvNo() {
        return invNo;
    }


    /**
     * Sets the invNo value for this InvoiceDetail5.
     * 
     * @param invNo
     */
    public void setInvNo(long invNo) {
        this.invNo = invNo;
    }


    /**
     * Gets the invType value for this InvoiceDetail5.
     * 
     * @return invType
     */
    public int getInvType() {
        return invType;
    }


    /**
     * Sets the invType value for this InvoiceDetail5.
     * 
     * @param invType
     */
    public void setInvType(int invType) {
        this.invType = invType;
    }


    /**
     * Gets the msisdn value for this InvoiceDetail5.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InvoiceDetail5.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the nameSurname value for this InvoiceDetail5.
     * 
     * @return nameSurname
     */
    public java.lang.String getNameSurname() {
        return nameSurname;
    }


    /**
     * Sets the nameSurname value for this InvoiceDetail5.
     * 
     * @param nameSurname
     */
    public void setNameSurname(java.lang.String nameSurname) {
        this.nameSurname = nameSurname;
    }


    /**
     * Gets the orderNo value for this InvoiceDetail5.
     * 
     * @return orderNo
     */
    public int getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this InvoiceDetail5.
     * 
     * @param orderNo
     */
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Gets the payAmount value for this InvoiceDetail5.
     * 
     * @return payAmount
     */
    public double getPayAmount() {
        return payAmount;
    }


    /**
     * Sets the payAmount value for this InvoiceDetail5.
     * 
     * @param payAmount
     */
    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }


    /**
     * Gets the period value for this InvoiceDetail5.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this InvoiceDetail5.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }


    /**
     * Gets the remark value for this InvoiceDetail5.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this InvoiceDetail5.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceDetail5)) return false;
        InvoiceDetail5 other = (InvoiceDetail5) obj;
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
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            this.invAmount == other.getInvAmount() &&
            ((this.invDate==null && other.getInvDate()==null) || 
             (this.invDate!=null &&
              this.invDate.equals(other.getInvDate()))) &&
            this.invNo == other.getInvNo() &&
            this.invType == other.getInvType() &&
            this.msisdn == other.getMsisdn() &&
            ((this.nameSurname==null && other.getNameSurname()==null) || 
             (this.nameSurname!=null &&
              this.nameSurname.equals(other.getNameSurname()))) &&
            this.orderNo == other.getOrderNo() &&
            this.payAmount == other.getPayAmount() &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod()))) &&
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
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        _hashCode += new Double(getInvAmount()).hashCode();
        if (getInvDate() != null) {
            _hashCode += getInvDate().hashCode();
        }
        _hashCode += new Long(getInvNo()).hashCode();
        _hashCode += getInvType();
        _hashCode += new Long(getMsisdn()).hashCode();
        if (getNameSurname() != null) {
            _hashCode += getNameSurname().hashCode();
        }
        _hashCode += getOrderNo();
        _hashCode += new Double(getPayAmount()).hashCode();
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetail5.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail5"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "controlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "dueDate"));
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
        elemField.setFieldName("invDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("payAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "payAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
