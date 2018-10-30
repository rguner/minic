/**
 * BulkCreateObligationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcell.marsalman.camman.webservices.service;

public class BulkCreateObligationServiceLocator extends org.apache.axis.client.Service implements com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationService {

    public BulkCreateObligationServiceLocator() {
    }


    public BulkCreateObligationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BulkCreateObligationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BulkCreateObligationServiceHttpPort
    private java.lang.String BulkCreateObligationServiceHttpPort_address = "http://extstable.sd.turkcell.com.tr/camman/camman/ws/bulkcreateobligationservice";

    public java.lang.String getBulkCreateObligationServiceHttpPortAddress() {
        return BulkCreateObligationServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BulkCreateObligationServiceHttpPortWSDDServiceName = "BulkCreateObligationServiceHttpPort";

    public java.lang.String getBulkCreateObligationServiceHttpPortWSDDServiceName() {
        return BulkCreateObligationServiceHttpPortWSDDServiceName;
    }

    public void setBulkCreateObligationServiceHttpPortWSDDServiceName(java.lang.String name) {
        BulkCreateObligationServiceHttpPortWSDDServiceName = name;
    }

    public com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServicePortType getBulkCreateObligationServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BulkCreateObligationServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBulkCreateObligationServiceHttpPort(endpoint);
    }

    public com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServicePortType getBulkCreateObligationServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServiceHttpBindingStub _stub = new com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getBulkCreateObligationServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBulkCreateObligationServiceHttpPortEndpointAddress(java.lang.String address) {
        BulkCreateObligationServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServiceHttpBindingStub _stub = new com.turkcell.marsalman.camman.webservices.service.BulkCreateObligationServiceHttpBindingStub(new java.net.URL(BulkCreateObligationServiceHttpPort_address), this);
                _stub.setPortName(getBulkCreateObligationServiceHttpPortWSDDServiceName());
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
        if ("BulkCreateObligationServiceHttpPort".equals(inputPortName)) {
            return getBulkCreateObligationServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.webservices.camman.marsalman.turkcell.com", "BulkCreateObligationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.webservices.camman.marsalman.turkcell.com", "BulkCreateObligationServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BulkCreateObligationServiceHttpPort".equals(portName)) {
            setBulkCreateObligationServiceHttpPortEndpointAddress(address);
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
