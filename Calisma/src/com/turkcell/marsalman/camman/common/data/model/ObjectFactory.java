
package com.turkcell.marsalman.camman.common.data.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.turkcell.marsalman.camman.common.data.model package. 
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

    private final static QName _PaymentPlanTypePaymentPlanList_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "paymentPlanList");
    private final static QName _PaymentPlanAmount_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "amount");
    private final static QName _PaymentPlanOfferId_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "offerId");
    private final static QName _PaymentPlanOfferTypeId_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "offerTypeId");
    private final static QName _PaymentPlanInstalment_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "instalment");
    private final static QName _OfferCampaignChannel_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "campaignChannel");
    private final static QName _OfferIaNavigationLink_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "iaNavigationLink");
    private final static QName _OfferIaScriptid_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "iaScriptid");
    private final static QName _OfferIaWebOfferType_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "iaWebOfferType");
    private final static QName _OfferCampaignId_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "campaignId");
    private final static QName _OfferOfferShortName_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "offerShortName");
    private final static QName _OfferAeOfferName_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "aeOfferName");
    private final static QName _OfferExternalId_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "externalId");
    private final static QName _OfferMassMarketFlag_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "massMarketFlag");
    private final static QName _OfferValidationKey_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "validationKey");
    private final static QName _OfferMassViaia_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "massViaia");
    private final static QName _OfferCometParameters_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "cometParameters");
    private final static QName _OfferIaImageLocation_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "iaImageLocation");
    private final static QName _OfferCampaignLongDesc_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "campaignLongDesc");
    private final static QName _OfferOfferType_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "offerType");
    private final static QName _OfferPrevAcceptance_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "prevAcceptance");
    private final static QName _OfferOfferDetailedDesc_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "offerDetailedDesc");
    private final static QName _OfferIaSummaryText_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "iaSummaryText");
    private final static QName _OfferCampaignCode_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "campaignCode");
    private final static QName _OfferNegativeOffer_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "negativeOffer");
    private final static QName _OfferCampaignUserCode_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "campaignUserCode");
    private final static QName _OfferResponseSystem_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "responseSystem");
    private final static QName _OfferInboundVisible_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "inboundVisible");
    private final static QName _OfferWithRankRankId_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "rankId");
    private final static QName _WriteXResponseResultOutputParams_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "outputParams");
    private final static QName _WriteXResponseResultResult_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "result");
    private final static QName _WriteXResponseResultFkSeqType_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "fkSeqType");
    private final static QName _WriteXResponseResultFkSeq_QNAME = new QName("http://model.data.common.camman.marsalman.turkcell.com", "fkSeq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.turkcell.marsalman.camman.common.data.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WriteXResponseResult }
     * 
     */
    public WriteXResponseResult createWriteXResponseResult() {
        return new WriteXResponseResult();
    }

    /**
     * Create an instance of {@link ArrayOfOfferSimplified }
     * 
     */
    public ArrayOfOfferSimplified createArrayOfOfferSimplified() {
        return new ArrayOfOfferSimplified();
    }

    /**
     * Create an instance of {@link PaymentPlanType }
     * 
     */
    public PaymentPlanType createPaymentPlanType() {
        return new PaymentPlanType();
    }

    /**
     * Create an instance of {@link OfferSimplified }
     * 
     */
    public OfferSimplified createOfferSimplified() {
        return new OfferSimplified();
    }

    /**
     * Create an instance of {@link OfferWithRank }
     * 
     */
    public OfferWithRank createOfferWithRank() {
        return new OfferWithRank();
    }

    /**
     * Create an instance of {@link ArrayOfOfferWithRank }
     * 
     */
    public ArrayOfOfferWithRank createArrayOfOfferWithRank() {
        return new ArrayOfOfferWithRank();
    }

    /**
     * Create an instance of {@link PaymentPlan }
     * 
     */
    public PaymentPlan createPaymentPlan() {
        return new PaymentPlan();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentPlan }
     * 
     */
    public ArrayOfPaymentPlan createArrayOfPaymentPlan() {
        return new ArrayOfPaymentPlan();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link ArrayOfOffer }
     * 
     */
    public ArrayOfOffer createArrayOfOffer() {
        return new ArrayOfOffer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentPlan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "paymentPlanList", scope = PaymentPlanType.class)
    public JAXBElement<ArrayOfPaymentPlan> createPaymentPlanTypePaymentPlanList(ArrayOfPaymentPlan value) {
        return new JAXBElement<ArrayOfPaymentPlan>(_PaymentPlanTypePaymentPlanList_QNAME, ArrayOfPaymentPlan.class, PaymentPlanType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "amount", scope = PaymentPlan.class)
    public JAXBElement<Double> createPaymentPlanAmount(Double value) {
        return new JAXBElement<Double>(_PaymentPlanAmount_QNAME, Double.class, PaymentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerId", scope = PaymentPlan.class)
    public JAXBElement<Long> createPaymentPlanOfferId(Long value) {
        return new JAXBElement<Long>(_PaymentPlanOfferId_QNAME, Long.class, PaymentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerTypeId", scope = PaymentPlan.class)
    public JAXBElement<Long> createPaymentPlanOfferTypeId(Long value) {
        return new JAXBElement<Long>(_PaymentPlanOfferTypeId_QNAME, Long.class, PaymentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "instalment", scope = PaymentPlan.class)
    public JAXBElement<Long> createPaymentPlanInstalment(Long value) {
        return new JAXBElement<Long>(_PaymentPlanInstalment_QNAME, Long.class, PaymentPlan.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignChannel", scope = Offer.class)
    public JAXBElement<String> createOfferCampaignChannel(String value) {
        return new JAXBElement<String>(_OfferCampaignChannel_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaNavigationLink", scope = Offer.class)
    public JAXBElement<String> createOfferIaNavigationLink(String value) {
        return new JAXBElement<String>(_OfferIaNavigationLink_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaScriptid", scope = Offer.class)
    public JAXBElement<String> createOfferIaScriptid(String value) {
        return new JAXBElement<String>(_OfferIaScriptid_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaWebOfferType", scope = Offer.class)
    public JAXBElement<String> createOfferIaWebOfferType(String value) {
        return new JAXBElement<String>(_OfferIaWebOfferType_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = Offer.class)
    public JAXBElement<String> createOfferCampaignId(String value) {
        return new JAXBElement<String>(_OfferCampaignId_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerShortName", scope = Offer.class)
    public JAXBElement<String> createOfferOfferShortName(String value) {
        return new JAXBElement<String>(_OfferOfferShortName_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "aeOfferName", scope = Offer.class)
    public JAXBElement<String> createOfferAeOfferName(String value) {
        return new JAXBElement<String>(_OfferAeOfferName_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "externalId", scope = Offer.class)
    public JAXBElement<String> createOfferExternalId(String value) {
        return new JAXBElement<String>(_OfferExternalId_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "massMarketFlag", scope = Offer.class)
    public JAXBElement<String> createOfferMassMarketFlag(String value) {
        return new JAXBElement<String>(_OfferMassMarketFlag_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "validationKey", scope = Offer.class)
    public JAXBElement<String> createOfferValidationKey(String value) {
        return new JAXBElement<String>(_OfferValidationKey_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "massViaia", scope = Offer.class)
    public JAXBElement<String> createOfferMassViaia(String value) {
        return new JAXBElement<String>(_OfferMassViaia_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "cometParameters", scope = Offer.class)
    public JAXBElement<String> createOfferCometParameters(String value) {
        return new JAXBElement<String>(_OfferCometParameters_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaImageLocation", scope = Offer.class)
    public JAXBElement<String> createOfferIaImageLocation(String value) {
        return new JAXBElement<String>(_OfferIaImageLocation_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignLongDesc", scope = Offer.class)
    public JAXBElement<String> createOfferCampaignLongDesc(String value) {
        return new JAXBElement<String>(_OfferCampaignLongDesc_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerType", scope = Offer.class)
    public JAXBElement<String> createOfferOfferType(String value) {
        return new JAXBElement<String>(_OfferOfferType_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "prevAcceptance", scope = Offer.class)
    public JAXBElement<String> createOfferPrevAcceptance(String value) {
        return new JAXBElement<String>(_OfferPrevAcceptance_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerDetailedDesc", scope = Offer.class)
    public JAXBElement<String> createOfferOfferDetailedDesc(String value) {
        return new JAXBElement<String>(_OfferOfferDetailedDesc_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaSummaryText", scope = Offer.class)
    public JAXBElement<String> createOfferIaSummaryText(String value) {
        return new JAXBElement<String>(_OfferIaSummaryText_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignCode", scope = Offer.class)
    public JAXBElement<String> createOfferCampaignCode(String value) {
        return new JAXBElement<String>(_OfferCampaignCode_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "negativeOffer", scope = Offer.class)
    public JAXBElement<String> createOfferNegativeOffer(String value) {
        return new JAXBElement<String>(_OfferNegativeOffer_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignUserCode", scope = Offer.class)
    public JAXBElement<String> createOfferCampaignUserCode(String value) {
        return new JAXBElement<String>(_OfferCampaignUserCode_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "responseSystem", scope = Offer.class)
    public JAXBElement<String> createOfferResponseSystem(String value) {
        return new JAXBElement<String>(_OfferResponseSystem_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "inboundVisible", scope = Offer.class)
    public JAXBElement<String> createOfferInboundVisible(String value) {
        return new JAXBElement<String>(_OfferInboundVisible_QNAME, String.class, Offer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignChannel", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankCampaignChannel(String value) {
        return new JAXBElement<String>(_OfferCampaignChannel_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaNavigationLink", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankIaNavigationLink(String value) {
        return new JAXBElement<String>(_OfferIaNavigationLink_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaScriptid", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankIaScriptid(String value) {
        return new JAXBElement<String>(_OfferIaScriptid_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaWebOfferType", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankIaWebOfferType(String value) {
        return new JAXBElement<String>(_OfferIaWebOfferType_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankCampaignId(String value) {
        return new JAXBElement<String>(_OfferCampaignId_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerShortName", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankOfferShortName(String value) {
        return new JAXBElement<String>(_OfferOfferShortName_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "aeOfferName", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankAeOfferName(String value) {
        return new JAXBElement<String>(_OfferAeOfferName_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "externalId", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankExternalId(String value) {
        return new JAXBElement<String>(_OfferExternalId_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "massMarketFlag", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankMassMarketFlag(String value) {
        return new JAXBElement<String>(_OfferMassMarketFlag_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "validationKey", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankValidationKey(String value) {
        return new JAXBElement<String>(_OfferValidationKey_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "massViaia", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankMassViaia(String value) {
        return new JAXBElement<String>(_OfferMassViaia_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "cometParameters", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankCometParameters(String value) {
        return new JAXBElement<String>(_OfferCometParameters_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaImageLocation", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankIaImageLocation(String value) {
        return new JAXBElement<String>(_OfferIaImageLocation_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignLongDesc", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankCampaignLongDesc(String value) {
        return new JAXBElement<String>(_OfferCampaignLongDesc_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerType", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankOfferType(String value) {
        return new JAXBElement<String>(_OfferOfferType_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "prevAcceptance", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankPrevAcceptance(String value) {
        return new JAXBElement<String>(_OfferPrevAcceptance_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerDetailedDesc", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankOfferDetailedDesc(String value) {
        return new JAXBElement<String>(_OfferOfferDetailedDesc_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "iaSummaryText", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankIaSummaryText(String value) {
        return new JAXBElement<String>(_OfferIaSummaryText_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignCode", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankCampaignCode(String value) {
        return new JAXBElement<String>(_OfferCampaignCode_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "negativeOffer", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankNegativeOffer(String value) {
        return new JAXBElement<String>(_OfferNegativeOffer_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignUserCode", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankCampaignUserCode(String value) {
        return new JAXBElement<String>(_OfferCampaignUserCode_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "rankId", scope = OfferWithRank.class)
    public JAXBElement<Long> createOfferWithRankRankId(Long value) {
        return new JAXBElement<Long>(_OfferWithRankRankId_QNAME, Long.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "responseSystem", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankResponseSystem(String value) {
        return new JAXBElement<String>(_OfferResponseSystem_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "inboundVisible", scope = OfferWithRank.class)
    public JAXBElement<String> createOfferWithRankInboundVisible(String value) {
        return new JAXBElement<String>(_OfferInboundVisible_QNAME, String.class, OfferWithRank.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "cometParameters", scope = OfferSimplified.class)
    public JAXBElement<String> createOfferSimplifiedCometParameters(String value) {
        return new JAXBElement<String>(_OfferCometParameters_QNAME, String.class, OfferSimplified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignLongDesc", scope = OfferSimplified.class)
    public JAXBElement<String> createOfferSimplifiedCampaignLongDesc(String value) {
        return new JAXBElement<String>(_OfferCampaignLongDesc_QNAME, String.class, OfferSimplified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = OfferSimplified.class)
    public JAXBElement<String> createOfferSimplifiedCampaignId(String value) {
        return new JAXBElement<String>(_OfferCampaignId_QNAME, String.class, OfferSimplified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerDetailedDesc", scope = OfferSimplified.class)
    public JAXBElement<String> createOfferSimplifiedOfferDetailedDesc(String value) {
        return new JAXBElement<String>(_OfferOfferDetailedDesc_QNAME, String.class, OfferSimplified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "offerShortName", scope = OfferSimplified.class)
    public JAXBElement<String> createOfferSimplifiedOfferShortName(String value) {
        return new JAXBElement<String>(_OfferOfferShortName_QNAME, String.class, OfferSimplified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "aeOfferName", scope = OfferSimplified.class)
    public JAXBElement<String> createOfferSimplifiedAeOfferName(String value) {
        return new JAXBElement<String>(_OfferAeOfferName_QNAME, String.class, OfferSimplified.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "outputParams", scope = WriteXResponseResult.class)
    public JAXBElement<String> createWriteXResponseResultOutputParams(String value) {
        return new JAXBElement<String>(_WriteXResponseResultOutputParams_QNAME, String.class, WriteXResponseResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "result", scope = WriteXResponseResult.class)
    public JAXBElement<String> createWriteXResponseResultResult(String value) {
        return new JAXBElement<String>(_WriteXResponseResultResult_QNAME, String.class, WriteXResponseResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "fkSeqType", scope = WriteXResponseResult.class)
    public JAXBElement<String> createWriteXResponseResultFkSeqType(String value) {
        return new JAXBElement<String>(_WriteXResponseResultFkSeqType_QNAME, String.class, WriteXResponseResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.data.common.camman.marsalman.turkcell.com", name = "fkSeq", scope = WriteXResponseResult.class)
    public JAXBElement<BigDecimal> createWriteXResponseResultFkSeq(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WriteXResponseResultFkSeq_QNAME, BigDecimal.class, WriteXResponseResult.class, value);
    }

}
