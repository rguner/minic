/**
 * AutoPaymentInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cfoint.model.collgw.turkcelltech.com;

public class AutoPaymentInfoRequest  implements java.io.Serializable {
    private java.lang.Long contractIdentifier;

    private java.lang.String opDate;

    private java.lang.String stan;

    public AutoPaymentInfoRequest() {
    }

    public AutoPaymentInfoRequest(
           java.lang.Long contractIdentifier,
           java.lang.String opDate,
           java.lang.String stan) {
           this.contractIdentifier = contractIdentifier;
           this.opDate = opDate;
           this.stan = stan;
    }


    /**
     * Gets the contractIdentifier value for this AutoPaymentInfoRequest.
     * 
     * @return contractIdentifier
     */
    public java.lang.Long getContractIdentifier() {
        return contractIdentifier;
    }


    /**
     * Sets the contractIdentifier value for this AutoPaymentInfoRequest.
     * 
     * @param contractIdentifier
     */
    public void setContractIdentifier(java.lang.Long contractIdentifier) {
        this.contractIdentifier = contractIdentifier;
    }


    /**
     * Gets the opDate value for this AutoPaymentInfoRequest.
     * 
     * @return opDate
     */
    public java.lang.String getOpDate() {
        return opDate;
    }


    /**
     * Sets the opDate value for this AutoPaymentInfoRequest.
     * 
     * @param opDate
     */
    public void setOpDate(java.lang.String opDate) {
        this.opDate = opDate;
    }


    /**
     * Gets the stan value for this AutoPaymentInfoRequest.
     * 
     * @return stan
     */
    public java.lang.String getStan() {
        return stan;
    }


    /**
     * Sets the stan value for this AutoPaymentInfoRequest.
     * 
     * @param stan
     */
    public void setStan(java.lang.String stan) {
        this.stan = stan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPaymentInfoRequest)) return false;
        AutoPaymentInfoRequest other = (AutoPaymentInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contractIdentifier==null && other.getContractIdentifier()==null) || 
             (this.contractIdentifier!=null &&
              this.contractIdentifier.equals(other.getContractIdentifier()))) &&
            ((this.opDate==null && other.getOpDate()==null) || 
             (this.opDate!=null &&
              this.opDate.equals(other.getOpDate()))) &&
            ((this.stan==null && other.getStan()==null) || 
             (this.stan!=null &&
              this.stan.equals(other.getStan())));
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
        if (getContractIdentifier() != null) {
            _hashCode += getContractIdentifier().hashCode();
        }
        if (getOpDate() != null) {
            _hashCode += getOpDate().hashCode();
        }
        if (getStan() != null) {
            _hashCode += getStan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPaymentInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "AutoPaymentInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "contractIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opDate");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "opDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stan");
        elemField.setXmlName(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "stan"));
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
