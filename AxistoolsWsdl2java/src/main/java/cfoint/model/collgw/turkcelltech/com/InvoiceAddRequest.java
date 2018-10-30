/**
 * InvoiceAddRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class InvoiceAddRequest  implements java.io.Serializable {
    private java.lang.String accDate;

    private int bankId;

    private int billCycle;

    private int compId;

    private java.lang.String customerId;

    private cfoint.model.collgw.turkcelltech.com.InvoiceDetail invDet;

    private long msisdn;

    private common.model.collgw.turkcelltech.com.OriginatorId orig;

    private java.lang.String sessionId;

    private long stan;

    public InvoiceAddRequest() {
    }

    public InvoiceAddRequest(
           java.lang.String accDate,
           int bankId,
           int billCycle,
           int compId,
           java.lang.String customerId,
           cfoint.model.collgw.turkcelltech.com.InvoiceDetail invDet,
           long msisdn,
           common.model.collgw.turkcelltech.com.OriginatorId orig,
           java.lang.String sessionId,
           long stan) {
           this.accDate = accDate;
           this.bankId = bankId;
           this.billCycle = billCycle;
           this.compId = compId;
           this.customerId = customerId;
           this.invDet = invDet;
           this.msisdn = msisdn;
           this.orig = orig;
           this.sessionId = sessionId;
           this.stan = stan;
    }


    /**
     * Gets the accDate value for this InvoiceAddRequest.
     * 
     * @return accDate
     */
    public java.lang.String getAccDate() {
        return accDate;
    }


    /**
     * Sets the accDate value for this InvoiceAddRequest.
     * 
     * @param accDate
     */
    public void setAccDate(java.lang.String accDate) {
        this.accDate = accDate;
    }


    /**
     * Gets the bankId value for this InvoiceAddRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this InvoiceAddRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the billCycle value for this InvoiceAddRequest.
     * 
     * @return billCycle
     */
    public int getBillCycle() {
        return billCycle;
    }


    /**
     * Sets the billCycle value for this InvoiceAddRequest.
     * 
     * @param billCycle
     */
    public void setBillCycle(int billCycle) {
        this.billCycle = billCycle;
    }


    /**
     * Gets the compId value for this InvoiceAddRequest.
     * 
     * @return compId
     */
    public int getCompId() {
        return compId;
    }


    /**
     * Sets the compId value for this InvoiceAddRequest.
     * 
     * @param compId
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }


    /**
     * Gets the customerId value for this InvoiceAddRequest.
     * 
     * @return customerId
     */
    public java.lang.String getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this InvoiceAddRequest.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.String customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the invDet value for this InvoiceAddRequest.
     * 
     * @return invDet
     */
    public cfoint.model.collgw.turkcelltech.com.InvoiceDetail getInvDet() {
        return invDet;
    }


    /**
     * Sets the invDet value for this InvoiceAddRequest.
     * 
     * @param invDet
     */
    public void setInvDet(cfoint.model.collgw.turkcelltech.com.InvoiceDetail invDet) {
        this.invDet = invDet;
    }


    /**
     * Gets the msisdn value for this InvoiceAddRequest.
     * 
     * @return msisdn
     */
    public long getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this InvoiceAddRequest.
     * 
     * @param msisdn
     */
    public void setMsisdn(long msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the orig value for this InvoiceAddRequest.
     * 
     * @return orig
     */
    public common.model.collgw.turkcelltech.com.OriginatorId getOrig() {
        return orig;
    }


    /**
     * Sets the orig value for this InvoiceAddRequest.
     * 
     * @param orig
     */
    public void setOrig(common.model.collgw.turkcelltech.com.OriginatorId orig) {
        this.orig = orig;
    }


    /**
     * Gets the sessionId value for this InvoiceAddRequest.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this InvoiceAddRequest.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the stan value for this InvoiceAddRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this InvoiceAddRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceAddRequest)) return false;
        InvoiceAddRequest other = (InvoiceAddRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accDate==null && other.getAccDate()==null) || 
             (this.accDate!=null &&
              this.accDate.equals(other.getAccDate()))) &&
            this.bankId == other.getBankId() &&
            this.billCycle == other.getBillCycle() &&
            this.compId == other.getCompId() &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.invDet==null && other.getInvDet()==null) || 
             (this.invDet!=null &&
              this.invDet.equals(other.getInvDet()))) &&
            this.msisdn == other.getMsisdn() &&
            ((this.orig==null && other.getOrig()==null) || 
             (this.orig!=null &&
              this.orig.equals(other.getOrig()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            this.stan == other.getStan();
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
        if (getAccDate() != null) {
            _hashCode += getAccDate().hashCode();
        }
        _hashCode += getBankId();
        _hashCode += getBillCycle();
        _hashCode += getCompId();
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getInvDet() != null) {
            _hashCode += getInvDet().hashCode();
        }
        _hashCode += new Long(getMsisdn()).hashCode();
        if (getOrig() != null) {
            _hashCode += getOrig().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceAddRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceAddRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "accDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "billCycle"));
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
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invDet");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "invDet"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orig");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "orig"));
        elemField.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.common", "OriginatorId"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "stan"));
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
