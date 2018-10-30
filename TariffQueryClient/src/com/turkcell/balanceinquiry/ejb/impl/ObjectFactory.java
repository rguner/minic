
package com.turkcell.balanceinquiry.ejb.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.turkcell.balanceinquiry.ejb.impl package. 
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

    private final static QName _GetCacheResponse_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "getCacheResponse");
    private final static QName _ClearCacheForResponse_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "clearCacheForResponse");
    private final static QName _ClearCacheFor_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "clearCacheFor");
    private final static QName _ClearAllCache_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "clearAllCache");
    private final static QName _GetCache_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "getCache");
    private final static QName _ClearAllCacheResponse_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "clearAllCacheResponse");
    private final static QName _GetCustomerBalancesWithHistoryResponse_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "getCustomerBalancesWithHistoryResponse");
    private final static QName _GetCustomerBalancesResponse_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "getCustomerBalancesResponse");
    private final static QName _GetCustomerBalancesWithHistory_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "getCustomerBalancesWithHistory");
    private final static QName _GetCustomerBalances_QNAME = new QName("http://impl.ejb.balanceinquiry.turkcell.com/", "getCustomerBalances");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.turkcell.balanceinquiry.ejb.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomerBalancesWithHistoryResponse }
     * 
     */
    public GetCustomerBalancesWithHistoryResponse createGetCustomerBalancesWithHistoryResponse() {
        return new GetCustomerBalancesWithHistoryResponse();
    }

    /**
     * Create an instance of {@link ClearAllCacheResponse }
     * 
     */
    public ClearAllCacheResponse createClearAllCacheResponse() {
        return new ClearAllCacheResponse();
    }

    /**
     * Create an instance of {@link GetCustomerBalancesWithHistory }
     * 
     */
    public GetCustomerBalancesWithHistory createGetCustomerBalancesWithHistory() {
        return new GetCustomerBalancesWithHistory();
    }

    /**
     * Create an instance of {@link GetCustomerBalancesResponse }
     * 
     */
    public GetCustomerBalancesResponse createGetCustomerBalancesResponse() {
        return new GetCustomerBalancesResponse();
    }

    /**
     * Create an instance of {@link GetCustomerBalances }
     * 
     */
    public GetCustomerBalances createGetCustomerBalances() {
        return new GetCustomerBalances();
    }

    /**
     * Create an instance of {@link GetCacheResponse }
     * 
     */
    public GetCacheResponse createGetCacheResponse() {
        return new GetCacheResponse();
    }

    /**
     * Create an instance of {@link ClearCacheForResponse }
     * 
     */
    public ClearCacheForResponse createClearCacheForResponse() {
        return new ClearCacheForResponse();
    }

    /**
     * Create an instance of {@link ClearCacheFor }
     * 
     */
    public ClearCacheFor createClearCacheFor() {
        return new ClearCacheFor();
    }

    /**
     * Create an instance of {@link GetCache }
     * 
     */
    public GetCache createGetCache() {
        return new GetCache();
    }

    /**
     * Create an instance of {@link ClearAllCache }
     * 
     */
    public ClearAllCache createClearAllCache() {
        return new ClearAllCache();
    }

    /**
     * Create an instance of {@link GetBalancesResponse }
     * 
     */
    public GetBalancesResponse createGetBalancesResponse() {
        return new GetBalancesResponse();
    }

    /**
     * Create an instance of {@link EcsOffer }
     * 
     */
    public EcsOffer createEcsOffer() {
        return new EcsOffer();
    }

    /**
     * Create an instance of {@link UsagePriceRepresentation }
     * 
     */
    public UsagePriceRepresentation createUsagePriceRepresentation() {
        return new UsagePriceRepresentation();
    }

    /**
     * Create an instance of {@link OfferRepresentation }
     * 
     */
    public OfferRepresentation createOfferRepresentation() {
        return new OfferRepresentation();
    }

    /**
     * Create an instance of {@link LifeCycleOffer }
     * 
     */
    public LifeCycleOffer createLifeCycleOffer() {
        return new LifeCycleOffer();
    }

    /**
     * Create an instance of {@link OfferInformation }
     * 
     */
    public OfferInformation createOfferInformation() {
        return new OfferInformation();
    }

    /**
     * Create an instance of {@link PriorityOffer }
     * 
     */
    public PriorityOffer createPriorityOffer() {
        return new PriorityOffer();
    }

    /**
     * Create an instance of {@link Fee }
     * 
     */
    public Fee createFee() {
        return new Fee();
    }

    /**
     * Create an instance of {@link PolicyElement }
     * 
     */
    public PolicyElement createPolicyElement() {
        return new PolicyElement();
    }

    /**
     * Create an instance of {@link PersonalUsageThreshold }
     * 
     */
    public PersonalUsageThreshold createPersonalUsageThreshold() {
        return new PersonalUsageThreshold();
    }

    /**
     * Create an instance of {@link TechnicalComponent }
     * 
     */
    public TechnicalComponent createTechnicalComponent() {
        return new TechnicalComponent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "getCacheResponse")
    public JAXBElement<GetCacheResponse> createGetCacheResponse(GetCacheResponse value) {
        return new JAXBElement<GetCacheResponse>(_GetCacheResponse_QNAME, GetCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearCacheForResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "clearCacheForResponse")
    public JAXBElement<ClearCacheForResponse> createClearCacheForResponse(ClearCacheForResponse value) {
        return new JAXBElement<ClearCacheForResponse>(_ClearCacheForResponse_QNAME, ClearCacheForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearCacheFor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "clearCacheFor")
    public JAXBElement<ClearCacheFor> createClearCacheFor(ClearCacheFor value) {
        return new JAXBElement<ClearCacheFor>(_ClearCacheFor_QNAME, ClearCacheFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearAllCache }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "clearAllCache")
    public JAXBElement<ClearAllCache> createClearAllCache(ClearAllCache value) {
        return new JAXBElement<ClearAllCache>(_ClearAllCache_QNAME, ClearAllCache.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCache }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "getCache")
    public JAXBElement<GetCache> createGetCache(GetCache value) {
        return new JAXBElement<GetCache>(_GetCache_QNAME, GetCache.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearAllCacheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "clearAllCacheResponse")
    public JAXBElement<ClearAllCacheResponse> createClearAllCacheResponse(ClearAllCacheResponse value) {
        return new JAXBElement<ClearAllCacheResponse>(_ClearAllCacheResponse_QNAME, ClearAllCacheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerBalancesWithHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "getCustomerBalancesWithHistoryResponse")
    public JAXBElement<GetCustomerBalancesWithHistoryResponse> createGetCustomerBalancesWithHistoryResponse(GetCustomerBalancesWithHistoryResponse value) {
        return new JAXBElement<GetCustomerBalancesWithHistoryResponse>(_GetCustomerBalancesWithHistoryResponse_QNAME, GetCustomerBalancesWithHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerBalancesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "getCustomerBalancesResponse")
    public JAXBElement<GetCustomerBalancesResponse> createGetCustomerBalancesResponse(GetCustomerBalancesResponse value) {
        return new JAXBElement<GetCustomerBalancesResponse>(_GetCustomerBalancesResponse_QNAME, GetCustomerBalancesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerBalancesWithHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "getCustomerBalancesWithHistory")
    public JAXBElement<GetCustomerBalancesWithHistory> createGetCustomerBalancesWithHistory(GetCustomerBalancesWithHistory value) {
        return new JAXBElement<GetCustomerBalancesWithHistory>(_GetCustomerBalancesWithHistory_QNAME, GetCustomerBalancesWithHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerBalances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ejb.balanceinquiry.turkcell.com/", name = "getCustomerBalances")
    public JAXBElement<GetCustomerBalances> createGetCustomerBalances(GetCustomerBalances value) {
        return new JAXBElement<GetCustomerBalances>(_GetCustomerBalances_QNAME, GetCustomerBalances.class, null, value);
    }

}
