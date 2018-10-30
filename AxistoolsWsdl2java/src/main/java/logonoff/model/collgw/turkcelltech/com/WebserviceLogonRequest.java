/**
 * WebserviceLogonRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package logonoff.model.collgw.turkcelltech.com;

public class WebserviceLogonRequest  implements java.io.Serializable {
    private int bankId;

    private java.lang.String msgDate;

    private java.lang.String password;

    private long stan;

    public WebserviceLogonRequest() {
    }

    public WebserviceLogonRequest(
           int bankId,
           java.lang.String msgDate,
           java.lang.String password,
           long stan) {
           this.bankId = bankId;
           this.msgDate = msgDate;
           this.password = password;
           this.stan = stan;
    }


    /**
     * Gets the bankId value for this WebserviceLogonRequest.
     * 
     * @return bankId
     */
    public int getBankId() {
        return bankId;
    }


    /**
     * Sets the bankId value for this WebserviceLogonRequest.
     * 
     * @param bankId
     */
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    /**
     * Gets the msgDate value for this WebserviceLogonRequest.
     * 
     * @return msgDate
     */
    public java.lang.String getMsgDate() {
        return msgDate;
    }


    /**
     * Sets the msgDate value for this WebserviceLogonRequest.
     * 
     * @param msgDate
     */
    public void setMsgDate(java.lang.String msgDate) {
        this.msgDate = msgDate;
    }


    /**
     * Gets the password value for this WebserviceLogonRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this WebserviceLogonRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the stan value for this WebserviceLogonRequest.
     * 
     * @return stan
     */
    public long getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this WebserviceLogonRequest.
     * 
     * @param stan
     */
    public void setStan(long stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebserviceLogonRequest)) return false;
        WebserviceLogonRequest other = (WebserviceLogonRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bankId == other.getBankId() &&
            ((this.msgDate==null && other.getMsgDate()==null) || 
             (this.msgDate!=null &&
              this.msgDate.equals(other.getMsgDate()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
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
        _hashCode += getBankId();
        if (getMsgDate() != null) {
            _hashCode += getMsgDate().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += new Long(getStan()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebserviceLogonRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogonRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "bankId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "msgDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "stan"));
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
