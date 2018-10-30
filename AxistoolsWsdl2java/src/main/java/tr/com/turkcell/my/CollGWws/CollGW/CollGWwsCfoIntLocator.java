/**
 * CollGWwsCfoIntLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.turkcell.my.CollGWws.CollGW;

public class CollGWwsCfoIntLocator extends org.apache.axis.client.Service implements tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoInt {

    public CollGWwsCfoIntLocator() {
    }


    public CollGWwsCfoIntLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CollGWwsCfoIntLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CollGWwsCfoIntPort
    private java.lang.String CollGWwsCfoIntPort_address = "http://10.200.62.39:7033/CollGWws/CollGWCfoInt";

    public java.lang.String getCollGWwsCfoIntPortAddress() {
        return CollGWwsCfoIntPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CollGWwsCfoIntPortWSDDServiceName = "CollGWwsCfoIntPort";

    public java.lang.String getCollGWwsCfoIntPortWSDDServiceName() {
        return CollGWwsCfoIntPortWSDDServiceName;
    }

    public void setCollGWwsCfoIntPortWSDDServiceName(java.lang.String name) {
        CollGWwsCfoIntPortWSDDServiceName = name;
    }

    public tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPort getCollGWwsCfoIntPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CollGWwsCfoIntPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCollGWwsCfoIntPort(endpoint);
    }

    public tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPort getCollGWwsCfoIntPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPortStub _stub = new tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPortStub(portAddress, this);
            _stub.setPortName(getCollGWwsCfoIntPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCollGWwsCfoIntPortEndpointAddress(java.lang.String address) {
        CollGWwsCfoIntPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPort.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPortStub _stub = new tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPortStub(new java.net.URL(CollGWwsCfoIntPort_address), this);
                _stub.setPortName(getCollGWwsCfoIntPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CollGWwsCfoIntPort".equals(inputPortName)) {
            return getCollGWwsCfoIntPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "CollGWwsCfoInt");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "CollGWwsCfoIntPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CollGWwsCfoIntPort".equals(portName)) {
            setCollGWwsCfoIntPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
