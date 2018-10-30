
package com.turkcell.marsalman.camman.webservices.data.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.turkcell.marsalman.camman.common.data.model.ArrayOfOfferSimplified;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.turkcell.marsalman.camman.webservices.data.model package. 
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

    private final static QName _GetInboundOffersResultResultDesc_QNAME = new QName("http://model.data.webservices.camman.marsalman.turkcell.com", "resultDesc");
    private final static QName _GetInboundOffersResultResultCode_QNAME = new QName("http://model.data.webservices.camman.marsalman.turkcell.com", "resultCode");
    private final static QName _GetInboundOffersResultOfferList_QNAME = new QName("http://model.data.webservices.camman.marsalman.turkcell.com", "offerList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.turkcell.marsalman.camman.webservices.data.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInboundOffersResult }
     * 
     */
    public GetInboundOffersResult createGetInboundOffersResult() {
        return new GetInboundOffersResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.webservices.camman.marsalman.turkcell.com", name = "resultDesc", scope = GetInboundOffersResult.class)
    public JAXBElement<String> createGetInboundOffersResultResultDesc(String value) {
        return new JAXBElement<String>(_GetInboundOffersResultResultDesc_QNAME, String.class, GetInboundOffersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.webservices.camman.marsalman.turkcell.com", name = "resultCode", scope = GetInboundOffersResult.class)
    public JAXBElement<String> createGetInboundOffersResultResultCode(String value) {
        return new JAXBElement<String>(_GetInboundOffersResultResultCode_QNAME, String.class, GetInboundOffersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOfferSimplified }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.webservices.camman.marsalman.turkcell.com", name = "offerList", scope = GetInboundOffersResult.class)
    public JAXBElement<ArrayOfOfferSimplified> createGetInboundOffersResultOfferList(ArrayOfOfferSimplified value) {
        return new JAXBElement<ArrayOfOfferSimplified>(_GetInboundOffersResultOfferList_QNAME, ArrayOfOfferSimplified.class, GetInboundOffersResult.class, value);
    }

}
