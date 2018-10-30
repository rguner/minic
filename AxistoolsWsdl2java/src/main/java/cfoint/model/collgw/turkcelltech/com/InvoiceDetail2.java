/**
 * InvoiceDetail2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class InvoiceDetail2  implements java.io.Serializable {
    private java.lang.String dueDate;

    private double invAmount;

    private long invNo;

    private int invType;

    private long msisdn;

    private java.lang.String period;

    public InvoiceDetail2() {
    }

    public InvoiceDetail2(
           java.lang.String dueDate,
           double invAmount,
           long invNo,
           int invType,
           long msisdn,
           java.lang.String period) {
           this.dueDate = dueDate;
           this.invAmount = invAmount;
           this.invNo = invNo;
           this.invType = invType;
           this.msisdn = msisdn;
           this.period = period;
    }


    /**
     * Gets the dueDate value for this InvoiceDetail2.
     * 
     * @return dueDate
     */
    public java.lang.String getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InvoiceDetail2.
     * 
     * @param dueDate
     */
    public void setDueDate(java.lang.String dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the invAmount value for this InvoiceDetail2.
     * 
     * @return invAmount
     */
    public double getInvAmount() {
        return invAmount;
    }


    /**
     * Sets the invAmount value for this InvoiceDetail2.
     * 
     * @param invAmount
     */
    public void setInvAmount(double invAmount) {
        this.invAmount = invAmount;
    }


    /**
     * Gets the invNo value for this InvoiceDetail2.
     * 
     * @return invNo
     */
    public long getInvNo() {
        return invNo;
    }


    /**
     * Sets the invNo value for this InvoiceDetail2.
     * 
     * @param invNo
     */
    public void setInvNo(long invNo) {
        this.invNo = invNo;
    }


    /**
     * Gets the invType value for this InvoiceDetail2.
     * 
     * @return invType
     */
    public int getInvType() {
        return invType;
    }


    /**
     * Sets the invType value for this InvoiceDetail2.
     * 
     * @param invType
     */
    public void setInvType(int invType) {
        this.invType = invType;
    }


    /**
     * Gets the msisdn value for this InvoiceDetail2.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InvoiceDetail2.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the period value for this InvoiceDetail2.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this InvoiceDetail2.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceDetail2)) return false;
        InvoiceDetail2 other = (InvoiceDetail2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            this.invAmount == other.getInvAmount() &&
            this.invNo == other.getInvNo() &&
            this.invType == other.getInvType() &&
            this.msisdn == other.getMsisdn() &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod())));
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
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        _hashCode += new Double(getInvAmount()).hashCode();
        _hashCode += new Long(getInvNo()).hashCode();
        _hashCode += getInvType();
        _hashCode += new Long(getMsisdn()).hashCode();
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceDetail2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "period"));
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
