
package com.euromsg.ws.auth;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.euromsg.ws.auth package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmAuthResult_QNAME = new QName("http://ws.euromsg.com/auth", "EmAuthResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.euromsg.ws.auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link EmAuthResult }
     * 
     */
    public EmAuthResult createEmAuthResult() {
        return new EmAuthResult();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link EmResult }
     * 
     */
    public EmResult createEmResult() {
        return new EmResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmAuthResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.euromsg.com/auth", name = "EmAuthResult")
    public JAXBElement<EmAuthResult> createEmAuthResult(EmAuthResult value) {
        return new JAXBElement<EmAuthResult>(_EmAuthResult_QNAME, EmAuthResult.class, null, value);
    }

}
