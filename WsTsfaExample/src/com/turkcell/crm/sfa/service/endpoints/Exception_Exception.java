
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://endpoints.service.sfa.crm.turkcell.com/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.turkcell.crm.sfa.service.endpoints.Exception faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public Exception_Exception(String message, com.turkcell.crm.sfa.service.endpoints.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public Exception_Exception(String message, com.turkcell.crm.sfa.service.endpoints.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.turkcell.crm.sfa.service.endpoints.Exception
     */
    public com.turkcell.crm.sfa.service.endpoints.Exception getFaultInfo() {
        return faultInfo;
    }

}
