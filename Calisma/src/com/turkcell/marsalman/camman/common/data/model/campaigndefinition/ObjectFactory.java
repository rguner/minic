
package com.turkcell.marsalman.camman.common.data.model.campaigndefinition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.turkcell.marsalman.camman.webservices.service.ArrayOfLong;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.turkcell.marsalman.camman.common.data.model.campaigndefinition package. 
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

    private final static QName _FilterDefinitionGroupOffers_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "offers");
    private final static QName _FilterDefinitionGroupObligationDuration_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "obligationDuration");
    private final static QName _PriceDefinitionShelfPrice_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "shelfPrice");
    private final static QName _PriceDefinitionSncode_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "sncode");
    private final static QName _PriceDefinitionReferenceOfferId_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "referenceOfferId");
    private final static QName _PriceDefinitionStampTax_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "stampTax");
    private final static QName _PriceDefinitionOfferPrice_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "offerPrice");
    private final static QName _PriceDefinitionAeOfferId_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "aeOfferId");
    private final static QName _PriceDefinitionOnlineFlag_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "onlineFlag");
    private final static QName _PriceDefinitionCampaignId_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "campaignId");
    private final static QName _MandatoryDefinitionMinLimit_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "minLimit");
    private final static QName _MandatoryDefinitionMaxLimit_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "maxLimit");
    private final static QName _MandatoryDefinitionOfferTypeIds_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "offerTypeIds");
    private final static QName _BankDelayInterestDefinitionDelayDuration_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "delayDuration");
    private final static QName _BankDelayInterestDefinitionDelayInterestPercentage_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "delayInterestPercentage");
    private final static QName _BankDelayInterestDefinitionDelayInterestCoefficient_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "delayInterestCoefficient");
    private final static QName _BankDelayInterestDefinitionCardName_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "cardName");
    private final static QName _CampaignMandatoryDefinitionMandatoryDefinitions_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "mandatoryDefinitions");
    private final static QName _CampaignFilterDefinitionFilterType_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "filterType");
    private final static QName _CampaignFilterDefinitionFilterDefinitionGroups_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "filterDefinitionGroups");
    private final static QName _PriceDefinitionsTypePriceDefinitionList_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "priceDefinitionList");
    private final static QName _PaymentDetailInstalment_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "instalment");
    private final static QName _PaymentDetailPaymentType_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "paymentType");
    private final static QName _DecoupleOfferTypeOfferTypeId_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "offerTypeId");
    private final static QName _DecoupleOfferTypeOfferTypeDescription_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "offerTypeDescription");
    private final static QName _CampaignsDefinitionTypeCampaignFilterDefinitions_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "campaignFilterDefinitions");
    private final static QName _CampaignsDefinitionTypeCampaignMandatoryDefinitions_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "campaignMandatoryDefinitions");
    private final static QName _CampaignsDefinitionTypeBankDelayInterestDefinitionList_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "bankDelayInterestDefinitionList");
    private final static QName _CampaignsDefinitionTypeDecoupleOfferTypeList_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "decoupleOfferTypeList");
    private final static QName _CampaignsDefinitionTypeDecoupleCampaignList_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "decoupleCampaignList");
    private final static QName _CampaignsDefinitionTypePaymentDetailList_QNAME = new QName("http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", "paymentDetailList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.turkcell.marsalman.camman.common.data.model.campaigndefinition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceDefinitionsType }
     * 
     */
    public PriceDefinitionsType createPriceDefinitionsType() {
        return new PriceDefinitionsType();
    }

    /**
     * Create an instance of {@link CampaignsDefinitionType }
     * 
     */
    public CampaignsDefinitionType createCampaignsDefinitionType() {
        return new CampaignsDefinitionType();
    }

    /**
     * Create an instance of {@link PaymentDetail }
     * 
     */
    public PaymentDetail createPaymentDetail() {
        return new PaymentDetail();
    }

    /**
     * Create an instance of {@link CampaignFilterDefinition }
     * 
     */
    public CampaignFilterDefinition createCampaignFilterDefinition() {
        return new CampaignFilterDefinition();
    }

    /**
     * Create an instance of {@link ArrayOfFilterDefinitionGroup }
     * 
     */
    public ArrayOfFilterDefinitionGroup createArrayOfFilterDefinitionGroup() {
        return new ArrayOfFilterDefinitionGroup();
    }

    /**
     * Create an instance of {@link CampaignMandatoryDefinition }
     * 
     */
    public CampaignMandatoryDefinition createCampaignMandatoryDefinition() {
        return new CampaignMandatoryDefinition();
    }

    /**
     * Create an instance of {@link FilterDefinitionGroup }
     * 
     */
    public FilterDefinitionGroup createFilterDefinitionGroup() {
        return new FilterDefinitionGroup();
    }

    /**
     * Create an instance of {@link ArrayOfDecoupleCampaign }
     * 
     */
    public ArrayOfDecoupleCampaign createArrayOfDecoupleCampaign() {
        return new ArrayOfDecoupleCampaign();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignFilterDefinition }
     * 
     */
    public ArrayOfCampaignFilterDefinition createArrayOfCampaignFilterDefinition() {
        return new ArrayOfCampaignFilterDefinition();
    }

    /**
     * Create an instance of {@link ArrayOfMandatoryDefinition }
     * 
     */
    public ArrayOfMandatoryDefinition createArrayOfMandatoryDefinition() {
        return new ArrayOfMandatoryDefinition();
    }

    /**
     * Create an instance of {@link ArrayOfBankDelayInterestDefinition }
     * 
     */
    public ArrayOfBankDelayInterestDefinition createArrayOfBankDelayInterestDefinition() {
        return new ArrayOfBankDelayInterestDefinition();
    }

    /**
     * Create an instance of {@link BankDelayInterestDefinition }
     * 
     */
    public BankDelayInterestDefinition createBankDelayInterestDefinition() {
        return new BankDelayInterestDefinition();
    }

    /**
     * Create an instance of {@link DecoupleCampaign }
     * 
     */
    public DecoupleCampaign createDecoupleCampaign() {
        return new DecoupleCampaign();
    }

    /**
     * Create an instance of {@link ArrayOfPriceDefinition }
     * 
     */
    public ArrayOfPriceDefinition createArrayOfPriceDefinition() {
        return new ArrayOfPriceDefinition();
    }

    /**
     * Create an instance of {@link DecoupleOfferType }
     * 
     */
    public DecoupleOfferType createDecoupleOfferType() {
        return new DecoupleOfferType();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignMandatoryDefinition }
     * 
     */
    public ArrayOfCampaignMandatoryDefinition createArrayOfCampaignMandatoryDefinition() {
        return new ArrayOfCampaignMandatoryDefinition();
    }

    /**
     * Create an instance of {@link PriceDefinition }
     * 
     */
    public PriceDefinition createPriceDefinition() {
        return new PriceDefinition();
    }

    /**
     * Create an instance of {@link MandatoryDefinition }
     * 
     */
    public MandatoryDefinition createMandatoryDefinition() {
        return new MandatoryDefinition();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentDetail }
     * 
     */
    public ArrayOfPaymentDetail createArrayOfPaymentDetail() {
        return new ArrayOfPaymentDetail();
    }

    /**
     * Create an instance of {@link ArrayOfDecoupleOfferType }
     * 
     */
    public ArrayOfDecoupleOfferType createArrayOfDecoupleOfferType() {
        return new ArrayOfDecoupleOfferType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "offers", scope = FilterDefinitionGroup.class)
    public JAXBElement<ArrayOfLong> createFilterDefinitionGroupOffers(ArrayOfLong value) {
        return new JAXBElement<ArrayOfLong>(_FilterDefinitionGroupOffers_QNAME, ArrayOfLong.class, FilterDefinitionGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "obligationDuration", scope = FilterDefinitionGroup.class)
    public JAXBElement<Long> createFilterDefinitionGroupObligationDuration(Long value) {
        return new JAXBElement<Long>(_FilterDefinitionGroupObligationDuration_QNAME, Long.class, FilterDefinitionGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "shelfPrice", scope = PriceDefinition.class)
    public JAXBElement<Double> createPriceDefinitionShelfPrice(Double value) {
        return new JAXBElement<Double>(_PriceDefinitionShelfPrice_QNAME, Double.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "sncode", scope = PriceDefinition.class)
    public JAXBElement<String> createPriceDefinitionSncode(String value) {
        return new JAXBElement<String>(_PriceDefinitionSncode_QNAME, String.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "referenceOfferId", scope = PriceDefinition.class)
    public JAXBElement<Long> createPriceDefinitionReferenceOfferId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionReferenceOfferId_QNAME, Long.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "stampTax", scope = PriceDefinition.class)
    public JAXBElement<Double> createPriceDefinitionStampTax(Double value) {
        return new JAXBElement<Double>(_PriceDefinitionStampTax_QNAME, Double.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "offerPrice", scope = PriceDefinition.class)
    public JAXBElement<Double> createPriceDefinitionOfferPrice(Double value) {
        return new JAXBElement<Double>(_PriceDefinitionOfferPrice_QNAME, Double.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "aeOfferId", scope = PriceDefinition.class)
    public JAXBElement<Long> createPriceDefinitionAeOfferId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionAeOfferId_QNAME, Long.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "obligationDuration", scope = PriceDefinition.class)
    public JAXBElement<Long> createPriceDefinitionObligationDuration(Long value) {
        return new JAXBElement<Long>(_FilterDefinitionGroupObligationDuration_QNAME, Long.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "onlineFlag", scope = PriceDefinition.class)
    public JAXBElement<String> createPriceDefinitionOnlineFlag(String value) {
        return new JAXBElement<String>(_PriceDefinitionOnlineFlag_QNAME, String.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = PriceDefinition.class)
    public JAXBElement<Long> createPriceDefinitionCampaignId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionCampaignId_QNAME, Long.class, PriceDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "minLimit", scope = MandatoryDefinition.class)
    public JAXBElement<Long> createMandatoryDefinitionMinLimit(Long value) {
        return new JAXBElement<Long>(_MandatoryDefinitionMinLimit_QNAME, Long.class, MandatoryDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "maxLimit", scope = MandatoryDefinition.class)
    public JAXBElement<Long> createMandatoryDefinitionMaxLimit(Long value) {
        return new JAXBElement<Long>(_MandatoryDefinitionMaxLimit_QNAME, Long.class, MandatoryDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "offerTypeIds", scope = MandatoryDefinition.class)
    public JAXBElement<ArrayOfLong> createMandatoryDefinitionOfferTypeIds(ArrayOfLong value) {
        return new JAXBElement<ArrayOfLong>(_MandatoryDefinitionOfferTypeIds_QNAME, ArrayOfLong.class, MandatoryDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = DecoupleCampaign.class)
    public JAXBElement<Long> createDecoupleCampaignCampaignId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionCampaignId_QNAME, Long.class, DecoupleCampaign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "delayDuration", scope = BankDelayInterestDefinition.class)
    public JAXBElement<Long> createBankDelayInterestDefinitionDelayDuration(Long value) {
        return new JAXBElement<Long>(_BankDelayInterestDefinitionDelayDuration_QNAME, Long.class, BankDelayInterestDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "delayInterestPercentage", scope = BankDelayInterestDefinition.class)
    public JAXBElement<Double> createBankDelayInterestDefinitionDelayInterestPercentage(Double value) {
        return new JAXBElement<Double>(_BankDelayInterestDefinitionDelayInterestPercentage_QNAME, Double.class, BankDelayInterestDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "delayInterestCoefficient", scope = BankDelayInterestDefinition.class)
    public JAXBElement<Double> createBankDelayInterestDefinitionDelayInterestCoefficient(Double value) {
        return new JAXBElement<Double>(_BankDelayInterestDefinitionDelayInterestCoefficient_QNAME, Double.class, BankDelayInterestDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "cardName", scope = BankDelayInterestDefinition.class)
    public JAXBElement<String> createBankDelayInterestDefinitionCardName(String value) {
        return new JAXBElement<String>(_BankDelayInterestDefinitionCardName_QNAME, String.class, BankDelayInterestDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMandatoryDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "mandatoryDefinitions", scope = CampaignMandatoryDefinition.class)
    public JAXBElement<ArrayOfMandatoryDefinition> createCampaignMandatoryDefinitionMandatoryDefinitions(ArrayOfMandatoryDefinition value) {
        return new JAXBElement<ArrayOfMandatoryDefinition>(_CampaignMandatoryDefinitionMandatoryDefinitions_QNAME, ArrayOfMandatoryDefinition.class, CampaignMandatoryDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = CampaignMandatoryDefinition.class)
    public JAXBElement<Long> createCampaignMandatoryDefinitionCampaignId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionCampaignId_QNAME, Long.class, CampaignMandatoryDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "filterType", scope = CampaignFilterDefinition.class)
    public JAXBElement<Long> createCampaignFilterDefinitionFilterType(Long value) {
        return new JAXBElement<Long>(_CampaignFilterDefinitionFilterType_QNAME, Long.class, CampaignFilterDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterDefinitionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "filterDefinitionGroups", scope = CampaignFilterDefinition.class)
    public JAXBElement<ArrayOfFilterDefinitionGroup> createCampaignFilterDefinitionFilterDefinitionGroups(ArrayOfFilterDefinitionGroup value) {
        return new JAXBElement<ArrayOfFilterDefinitionGroup>(_CampaignFilterDefinitionFilterDefinitionGroups_QNAME, ArrayOfFilterDefinitionGroup.class, CampaignFilterDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "campaignId", scope = CampaignFilterDefinition.class)
    public JAXBElement<Long> createCampaignFilterDefinitionCampaignId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionCampaignId_QNAME, Long.class, CampaignFilterDefinition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPriceDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "priceDefinitionList", scope = PriceDefinitionsType.class)
    public JAXBElement<ArrayOfPriceDefinition> createPriceDefinitionsTypePriceDefinitionList(ArrayOfPriceDefinition value) {
        return new JAXBElement<ArrayOfPriceDefinition>(_PriceDefinitionsTypePriceDefinitionList_QNAME, ArrayOfPriceDefinition.class, PriceDefinitionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "instalment", scope = PaymentDetail.class)
    public JAXBElement<Long> createPaymentDetailInstalment(Long value) {
        return new JAXBElement<Long>(_PaymentDetailInstalment_QNAME, Long.class, PaymentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "paymentType", scope = PaymentDetail.class)
    public JAXBElement<String> createPaymentDetailPaymentType(String value) {
        return new JAXBElement<String>(_PaymentDetailPaymentType_QNAME, String.class, PaymentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "aeOfferId", scope = PaymentDetail.class)
    public JAXBElement<Long> createPaymentDetailAeOfferId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionAeOfferId_QNAME, Long.class, PaymentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "offerTypeId", scope = DecoupleOfferType.class)
    public JAXBElement<Long> createDecoupleOfferTypeOfferTypeId(Long value) {
        return new JAXBElement<Long>(_DecoupleOfferTypeOfferTypeId_QNAME, Long.class, DecoupleOfferType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "offerTypeDescription", scope = DecoupleOfferType.class)
    public JAXBElement<String> createDecoupleOfferTypeOfferTypeDescription(String value) {
        return new JAXBElement<String>(_DecoupleOfferTypeOfferTypeDescription_QNAME, String.class, DecoupleOfferType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "aeOfferId", scope = DecoupleOfferType.class)
    public JAXBElement<Long> createDecoupleOfferTypeAeOfferId(Long value) {
        return new JAXBElement<Long>(_PriceDefinitionAeOfferId_QNAME, Long.class, DecoupleOfferType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignFilterDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "campaignFilterDefinitions", scope = CampaignsDefinitionType.class)
    public JAXBElement<ArrayOfCampaignFilterDefinition> createCampaignsDefinitionTypeCampaignFilterDefinitions(ArrayOfCampaignFilterDefinition value) {
        return new JAXBElement<ArrayOfCampaignFilterDefinition>(_CampaignsDefinitionTypeCampaignFilterDefinitions_QNAME, ArrayOfCampaignFilterDefinition.class, CampaignsDefinitionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCampaignMandatoryDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "campaignMandatoryDefinitions", scope = CampaignsDefinitionType.class)
    public JAXBElement<ArrayOfCampaignMandatoryDefinition> createCampaignsDefinitionTypeCampaignMandatoryDefinitions(ArrayOfCampaignMandatoryDefinition value) {
        return new JAXBElement<ArrayOfCampaignMandatoryDefinition>(_CampaignsDefinitionTypeCampaignMandatoryDefinitions_QNAME, ArrayOfCampaignMandatoryDefinition.class, CampaignsDefinitionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBankDelayInterestDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "bankDelayInterestDefinitionList", scope = CampaignsDefinitionType.class)
    public JAXBElement<ArrayOfBankDelayInterestDefinition> createCampaignsDefinitionTypeBankDelayInterestDefinitionList(ArrayOfBankDelayInterestDefinition value) {
        return new JAXBElement<ArrayOfBankDelayInterestDefinition>(_CampaignsDefinitionTypeBankDelayInterestDefinitionList_QNAME, ArrayOfBankDelayInterestDefinition.class, CampaignsDefinitionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDecoupleOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "decoupleOfferTypeList", scope = CampaignsDefinitionType.class)
    public JAXBElement<ArrayOfDecoupleOfferType> createCampaignsDefinitionTypeDecoupleOfferTypeList(ArrayOfDecoupleOfferType value) {
        return new JAXBElement<ArrayOfDecoupleOfferType>(_CampaignsDefinitionTypeDecoupleOfferTypeList_QNAME, ArrayOfDecoupleOfferType.class, CampaignsDefinitionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDecoupleCampaign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "decoupleCampaignList", scope = CampaignsDefinitionType.class)
    public JAXBElement<ArrayOfDecoupleCampaign> createCampaignsDefinitionTypeDecoupleCampaignList(ArrayOfDecoupleCampaign value) {
        return new JAXBElement<ArrayOfDecoupleCampaign>(_CampaignsDefinitionTypeDecoupleCampaignList_QNAME, ArrayOfDecoupleCampaign.class, CampaignsDefinitionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://campaigndefinition.model.data.common.camman.marsalman.turkcell.com", name = "paymentDetailList", scope = CampaignsDefinitionType.class)
    public JAXBElement<ArrayOfPaymentDetail> createCampaignsDefinitionTypePaymentDetailList(ArrayOfPaymentDetail value) {
        return new JAXBElement<ArrayOfPaymentDetail>(_CampaignsDefinitionTypePaymentDetailList_QNAME, ArrayOfPaymentDetail.class, CampaignsDefinitionType.class, value);
    }

}
