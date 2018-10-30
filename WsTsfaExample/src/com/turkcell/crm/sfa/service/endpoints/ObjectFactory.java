
package com.turkcell.crm.sfa.service.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.turkcell.crm.sfa.service.endpoints package. 
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

    private final static QName _Exception_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "Exception");
    private final static QName _GetAccountsPortfolioByNcst_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getAccountsPortfolioByNcst");
    private final static QName _SearchPositionsResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "searchPositionsResponse");
    private final static QName _CheckAccSalesTeamByNcstByLdapNameResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "checkAccSalesTeamByNcstByLdapNameResponse");
    private final static QName _GetCustomerUkstOrTeleSalesUpperHierarchy_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getCustomerUkstOrTeleSalesUpperHierarchy");
    private final static QName _GetPositionDetailNFResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionDetailNFResponse");
    private final static QName _GetSOLPositionHierarchyResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getSOLPositionHierarchyResponse");
    private final static QName _GetSOLPositionHierarchy_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getSOLPositionHierarchy");
    private final static QName _GetAccountsPortfolioByNcstResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getAccountsPortfolioByNcstResponse");
    private final static QName _GetDealerInfoNFResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getDealerInfoNFResponse");
    private final static QName _GetDealerInfoNF_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getDealerInfoNF");
    private final static QName _SearchPositions_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "searchPositions");
    private final static QName _GetPositionDetailWithNcstResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionDetailWithNcstResponse");
    private final static QName _GetCustomerUkstOrTeleSalesUpperHierarchyResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getCustomerUkstOrTeleSalesUpperHierarchyResponse");
    private final static QName _GetPositionDetails_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionDetails");
    private final static QName _GetPositionDetailNF_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionDetailNF");
    private final static QName _GetPositionLowerHierarchy_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionLowerHierarchy");
    private final static QName _GetSubOrganizationsByOrganizationNameResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getSubOrganizationsByOrganizationNameResponse");
    private final static QName _GetPositionDetailWithNcst_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionDetailWithNcst");
    private final static QName _GetSubOrganizationsByOrganizationName_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getSubOrganizationsByOrganizationName");
    private final static QName _GetPositionLowerHierarchyResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionLowerHierarchyResponse");
    private final static QName _GetPositionHierarchyNF_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionHierarchyNF");
    private final static QName _GetCustomerPrimaryUpperHierarchy_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getCustomerPrimaryUpperHierarchy");
    private final static QName _GetCustomerPrimaryUpperHierarchyResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getCustomerPrimaryUpperHierarchyResponse");
    private final static QName _CheckAccSalesTeamByNcstByLdapName_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "checkAccSalesTeamByNcstByLdapName");
    private final static QName _GetPositionHierarchyNFResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionHierarchyNFResponse");
    private final static QName _GetPositionDetailsResponse_QNAME = new QName("http://endpoints.service.sfa.crm.turkcell.com/", "getPositionDetailsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.turkcell.crm.sfa.service.endpoints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPositionDetailByNcstResponse }
     * 
     */
    public GetPositionDetailByNcstResponse createGetPositionDetailByNcstResponse() {
        return new GetPositionDetailByNcstResponse();
    }

    /**
     * Create an instance of {@link PositionEmployee }
     * 
     */
    public PositionEmployee createPositionEmployee() {
        return new PositionEmployee();
    }

    /**
     * Create an instance of {@link CustomerUkstOrTeleSalesUpperHierarchyGetResponse }
     * 
     */
    public CustomerUkstOrTeleSalesUpperHierarchyGetResponse createCustomerUkstOrTeleSalesUpperHierarchyGetResponse() {
        return new CustomerUkstOrTeleSalesUpperHierarchyGetResponse();
    }

    /**
     * Create an instance of {@link PositionDetailDto }
     * 
     */
    public PositionDetailDto createPositionDetailDto() {
        return new PositionDetailDto();
    }

    /**
     * Create an instance of {@link CustomerUkstOrTeleSalesUpperHierarchyGetRequest }
     * 
     */
    public CustomerUkstOrTeleSalesUpperHierarchyGetRequest createCustomerUkstOrTeleSalesUpperHierarchyGetRequest() {
        return new CustomerUkstOrTeleSalesUpperHierarchyGetRequest();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link GetSOLPositionHierarchyResponse }
     * 
     */
    public GetSOLPositionHierarchyResponse createGetSOLPositionHierarchyResponse() {
        return new GetSOLPositionHierarchyResponse();
    }

    /**
     * Create an instance of {@link GetSubOrganizationsByOrganizationName }
     * 
     */
    public GetSubOrganizationsByOrganizationName createGetSubOrganizationsByOrganizationName() {
        return new GetSubOrganizationsByOrganizationName();
    }

    /**
     * Create an instance of {@link CheckAccSalesTeamByNcstByLdapName }
     * 
     */
    public CheckAccSalesTeamByNcstByLdapName createCheckAccSalesTeamByNcstByLdapName() {
        return new CheckAccSalesTeamByNcstByLdapName();
    }

    /**
     * Create an instance of {@link PositionLowerHierarchy }
     * 
     */
    public PositionLowerHierarchy createPositionLowerHierarchy() {
        return new PositionLowerHierarchy();
    }

    /**
     * Create an instance of {@link GetCustomerUkstOrTeleSalesUpperHierarchy }
     * 
     */
    public GetCustomerUkstOrTeleSalesUpperHierarchy createGetCustomerUkstOrTeleSalesUpperHierarchy() {
        return new GetCustomerUkstOrTeleSalesUpperHierarchy();
    }

    /**
     * Create an instance of {@link GetPositionDetailNFResponse }
     * 
     */
    public GetPositionDetailNFResponse createGetPositionDetailNFResponse() {
        return new GetPositionDetailNFResponse();
    }

    /**
     * Create an instance of {@link GetPositionDetailWithNcst }
     * 
     */
    public GetPositionDetailWithNcst createGetPositionDetailWithNcst() {
        return new GetPositionDetailWithNcst();
    }

    /**
     * Create an instance of {@link BaseWebserviceRequest }
     * 
     */
    public BaseWebserviceRequest createBaseWebserviceRequest() {
        return new BaseWebserviceRequest();
    }

    /**
     * Create an instance of {@link SearchPositions }
     * 
     */
    public SearchPositions createSearchPositions() {
        return new SearchPositions();
    }

    /**
     * Create an instance of {@link PositionLowerHierarchyRequest }
     * 
     */
    public PositionLowerHierarchyRequest createPositionLowerHierarchyRequest() {
        return new PositionLowerHierarchyRequest();
    }

    /**
     * Create an instance of {@link GetPositionHierarchyNFResponse }
     * 
     */
    public GetPositionHierarchyNFResponse createGetPositionHierarchyNFResponse() {
        return new GetPositionHierarchyNFResponse();
    }

    /**
     * Create an instance of {@link SearchPositionsResponse }
     * 
     */
    public SearchPositionsResponse createSearchPositionsResponse() {
        return new SearchPositionsResponse();
    }

    /**
     * Create an instance of {@link GetCustomerUkstOrTeleSalesUpperHierarchyResponse }
     * 
     */
    public GetCustomerUkstOrTeleSalesUpperHierarchyResponse createGetCustomerUkstOrTeleSalesUpperHierarchyResponse() {
        return new GetCustomerUkstOrTeleSalesUpperHierarchyResponse();
    }

    /**
     * Create an instance of {@link GetPositionDetailsResponse }
     * 
     */
    public GetPositionDetailsResponse createGetPositionDetailsResponse() {
        return new GetPositionDetailsResponse();
    }

    /**
     * Create an instance of {@link PositionLowerHierarchyResponse }
     * 
     */
    public PositionLowerHierarchyResponse createPositionLowerHierarchyResponse() {
        return new PositionLowerHierarchyResponse();
    }

    /**
     * Create an instance of {@link PositionSearchRequest }
     * 
     */
    public PositionSearchRequest createPositionSearchRequest() {
        return new PositionSearchRequest();
    }

    /**
     * Create an instance of {@link GetPositionHierarchyNetFlowResponse }
     * 
     */
    public GetPositionHierarchyNetFlowResponse createGetPositionHierarchyNetFlowResponse() {
        return new GetPositionHierarchyNetFlowResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link BaseWsRequest }
     * 
     */
    public BaseWsRequest createBaseWsRequest() {
        return new BaseWsRequest();
    }

    /**
     * Create an instance of {@link SubOrganizationDto }
     * 
     */
    public SubOrganizationDto createSubOrganizationDto() {
        return new SubOrganizationDto();
    }

    /**
     * Create an instance of {@link PositionHierarchy }
     * 
     */
    public PositionHierarchy createPositionHierarchy() {
        return new PositionHierarchy();
    }

    /**
     * Create an instance of {@link GetPositionHierarchyNetFlowRequest }
     * 
     */
    public GetPositionHierarchyNetFlowRequest createGetPositionHierarchyNetFlowRequest() {
        return new GetPositionHierarchyNetFlowRequest();
    }

    /**
     * Create an instance of {@link PositionSearch }
     * 
     */
    public PositionSearch createPositionSearch() {
        return new PositionSearch();
    }

    /**
     * Create an instance of {@link CustomerPrimaryUpperHierarchyGetResponse }
     * 
     */
    public CustomerPrimaryUpperHierarchyGetResponse createCustomerPrimaryUpperHierarchyGetResponse() {
        return new CustomerPrimaryUpperHierarchyGetResponse();
    }

    /**
     * Create an instance of {@link AccountsPortfolioResponse }
     * 
     */
    public AccountsPortfolioResponse createAccountsPortfolioResponse() {
        return new AccountsPortfolioResponse();
    }

    /**
     * Create an instance of {@link GetPositionHierarchyNF }
     * 
     */
    public GetPositionHierarchyNF createGetPositionHierarchyNF() {
        return new GetPositionHierarchyNF();
    }

    /**
     * Create an instance of {@link GetDealerInfoNFResponse }
     * 
     */
    public GetDealerInfoNFResponse createGetDealerInfoNFResponse() {
        return new GetDealerInfoNFResponse();
    }

    /**
     * Create an instance of {@link SolPositionHierarchyResponse }
     * 
     */
    public SolPositionHierarchyResponse createSolPositionHierarchyResponse() {
        return new SolPositionHierarchyResponse();
    }

    /**
     * Create an instance of {@link SubOrganizationRequest }
     * 
     */
    public SubOrganizationRequest createSubOrganizationRequest() {
        return new SubOrganizationRequest();
    }

    /**
     * Create an instance of {@link GetPositionDetailNetFlowResponse }
     * 
     */
    public GetPositionDetailNetFlowResponse createGetPositionDetailNetFlowResponse() {
        return new GetPositionDetailNetFlowResponse();
    }

    /**
     * Create an instance of {@link SubOrganizationResponse }
     * 
     */
    public SubOrganizationResponse createSubOrganizationResponse() {
        return new SubOrganizationResponse();
    }

    /**
     * Create an instance of {@link CustomerPrimaryUpperHierarchyGetRequest }
     * 
     */
    public CustomerPrimaryUpperHierarchyGetRequest createCustomerPrimaryUpperHierarchyGetRequest() {
        return new CustomerPrimaryUpperHierarchyGetRequest();
    }

    /**
     * Create an instance of {@link GetCustomerPrimaryUpperHierarchyResponse }
     * 
     */
    public GetCustomerPrimaryUpperHierarchyResponse createGetCustomerPrimaryUpperHierarchyResponse() {
        return new GetCustomerPrimaryUpperHierarchyResponse();
    }

    /**
     * Create an instance of {@link PositionInformation }
     * 
     */
    public PositionInformation createPositionInformation() {
        return new PositionInformation();
    }

    /**
     * Create an instance of {@link PositionSearchResponse }
     * 
     */
    public PositionSearchResponse createPositionSearchResponse() {
        return new PositionSearchResponse();
    }

    /**
     * Create an instance of {@link BaseEntity }
     * 
     */
    public BaseEntity createBaseEntity() {
        return new BaseEntity();
    }

    /**
     * Create an instance of {@link GetDealerInfoNetFlowResponse }
     * 
     */
    public GetDealerInfoNetFlowResponse createGetDealerInfoNetFlowResponse() {
        return new GetDealerInfoNetFlowResponse();
    }

    /**
     * Create an instance of {@link GetPositionLowerHierarchyResponse }
     * 
     */
    public GetPositionLowerHierarchyResponse createGetPositionLowerHierarchyResponse() {
        return new GetPositionLowerHierarchyResponse();
    }

    /**
     * Create an instance of {@link GetSubOrganizationsByOrganizationNameResponse }
     * 
     */
    public GetSubOrganizationsByOrganizationNameResponse createGetSubOrganizationsByOrganizationNameResponse() {
        return new GetSubOrganizationsByOrganizationNameResponse();
    }

    /**
     * Create an instance of {@link AccountsPortfolioRequest }
     * 
     */
    public AccountsPortfolioRequest createAccountsPortfolioRequest() {
        return new AccountsPortfolioRequest();
    }

    /**
     * Create an instance of {@link GetPositionDetails }
     * 
     */
    public GetPositionDetails createGetPositionDetails() {
        return new GetPositionDetails();
    }

    /**
     * Create an instance of {@link SolPositionHierarchyRequest }
     * 
     */
    public SolPositionHierarchyRequest createSolPositionHierarchyRequest() {
        return new SolPositionHierarchyRequest();
    }

    /**
     * Create an instance of {@link CheckAccSalesTeamRequest }
     * 
     */
    public CheckAccSalesTeamRequest createCheckAccSalesTeamRequest() {
        return new CheckAccSalesTeamRequest();
    }

    /**
     * Create an instance of {@link GetSOLPositionHierarchy }
     * 
     */
    public GetSOLPositionHierarchy createGetSOLPositionHierarchy() {
        return new GetSOLPositionHierarchy();
    }

    /**
     * Create an instance of {@link GetPositionDetailWithNcstResponse }
     * 
     */
    public GetPositionDetailWithNcstResponse createGetPositionDetailWithNcstResponse() {
        return new GetPositionDetailWithNcstResponse();
    }

    /**
     * Create an instance of {@link GetPositionDetailNetFlowRequest }
     * 
     */
    public GetPositionDetailNetFlowRequest createGetPositionDetailNetFlowRequest() {
        return new GetPositionDetailNetFlowRequest();
    }

    /**
     * Create an instance of {@link GetAccountsPortfolioByNcstResponse }
     * 
     */
    public GetAccountsPortfolioByNcstResponse createGetAccountsPortfolioByNcstResponse() {
        return new GetAccountsPortfolioByNcstResponse();
    }

    /**
     * Create an instance of {@link CheckAccSalesTeamResponse }
     * 
     */
    public CheckAccSalesTeamResponse createCheckAccSalesTeamResponse() {
        return new CheckAccSalesTeamResponse();
    }

    /**
     * Create an instance of {@link GetDealerInfoNF }
     * 
     */
    public GetDealerInfoNF createGetDealerInfoNF() {
        return new GetDealerInfoNF();
    }

    /**
     * Create an instance of {@link GetPositionDetailNF }
     * 
     */
    public GetPositionDetailNF createGetPositionDetailNF() {
        return new GetPositionDetailNF();
    }

    /**
     * Create an instance of {@link PositionDetailsRequest }
     * 
     */
    public PositionDetailsRequest createPositionDetailsRequest() {
        return new PositionDetailsRequest();
    }

    /**
     * Create an instance of {@link PositionDetailsResponse }
     * 
     */
    public PositionDetailsResponse createPositionDetailsResponse() {
        return new PositionDetailsResponse();
    }

    /**
     * Create an instance of {@link GetPositionDetailByNcstRequest }
     * 
     */
    public GetPositionDetailByNcstRequest createGetPositionDetailByNcstRequest() {
        return new GetPositionDetailByNcstRequest();
    }

    /**
     * Create an instance of {@link GetCustomerPrimaryUpperHierarchy }
     * 
     */
    public GetCustomerPrimaryUpperHierarchy createGetCustomerPrimaryUpperHierarchy() {
        return new GetCustomerPrimaryUpperHierarchy();
    }

    /**
     * Create an instance of {@link GetDealerInfoNetFlowRequest }
     * 
     */
    public GetDealerInfoNetFlowRequest createGetDealerInfoNetFlowRequest() {
        return new GetDealerInfoNetFlowRequest();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link BaseWsResponse }
     * 
     */
    public BaseWsResponse createBaseWsResponse() {
        return new BaseWsResponse();
    }

    /**
     * Create an instance of {@link CheckAccSalesTeamByNcstByLdapNameResponse }
     * 
     */
    public CheckAccSalesTeamByNcstByLdapNameResponse createCheckAccSalesTeamByNcstByLdapNameResponse() {
        return new CheckAccSalesTeamByNcstByLdapNameResponse();
    }

    /**
     * Create an instance of {@link GetPositionLowerHierarchy }
     * 
     */
    public GetPositionLowerHierarchy createGetPositionLowerHierarchy() {
        return new GetPositionLowerHierarchy();
    }

    /**
     * Create an instance of {@link GetAccountsPortfolioByNcst }
     * 
     */
    public GetAccountsPortfolioByNcst createGetAccountsPortfolioByNcst() {
        return new GetAccountsPortfolioByNcst();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsPortfolioByNcst }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getAccountsPortfolioByNcst")
    public JAXBElement<GetAccountsPortfolioByNcst> createGetAccountsPortfolioByNcst(GetAccountsPortfolioByNcst value) {
        return new JAXBElement<GetAccountsPortfolioByNcst>(_GetAccountsPortfolioByNcst_QNAME, GetAccountsPortfolioByNcst.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "searchPositionsResponse")
    public JAXBElement<SearchPositionsResponse> createSearchPositionsResponse(SearchPositionsResponse value) {
        return new JAXBElement<SearchPositionsResponse>(_SearchPositionsResponse_QNAME, SearchPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccSalesTeamByNcstByLdapNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "checkAccSalesTeamByNcstByLdapNameResponse")
    public JAXBElement<CheckAccSalesTeamByNcstByLdapNameResponse> createCheckAccSalesTeamByNcstByLdapNameResponse(CheckAccSalesTeamByNcstByLdapNameResponse value) {
        return new JAXBElement<CheckAccSalesTeamByNcstByLdapNameResponse>(_CheckAccSalesTeamByNcstByLdapNameResponse_QNAME, CheckAccSalesTeamByNcstByLdapNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerUkstOrTeleSalesUpperHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getCustomerUkstOrTeleSalesUpperHierarchy")
    public JAXBElement<GetCustomerUkstOrTeleSalesUpperHierarchy> createGetCustomerUkstOrTeleSalesUpperHierarchy(GetCustomerUkstOrTeleSalesUpperHierarchy value) {
        return new JAXBElement<GetCustomerUkstOrTeleSalesUpperHierarchy>(_GetCustomerUkstOrTeleSalesUpperHierarchy_QNAME, GetCustomerUkstOrTeleSalesUpperHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionDetailNFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionDetailNFResponse")
    public JAXBElement<GetPositionDetailNFResponse> createGetPositionDetailNFResponse(GetPositionDetailNFResponse value) {
        return new JAXBElement<GetPositionDetailNFResponse>(_GetPositionDetailNFResponse_QNAME, GetPositionDetailNFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSOLPositionHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getSOLPositionHierarchyResponse")
    public JAXBElement<GetSOLPositionHierarchyResponse> createGetSOLPositionHierarchyResponse(GetSOLPositionHierarchyResponse value) {
        return new JAXBElement<GetSOLPositionHierarchyResponse>(_GetSOLPositionHierarchyResponse_QNAME, GetSOLPositionHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSOLPositionHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getSOLPositionHierarchy")
    public JAXBElement<GetSOLPositionHierarchy> createGetSOLPositionHierarchy(GetSOLPositionHierarchy value) {
        return new JAXBElement<GetSOLPositionHierarchy>(_GetSOLPositionHierarchy_QNAME, GetSOLPositionHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsPortfolioByNcstResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getAccountsPortfolioByNcstResponse")
    public JAXBElement<GetAccountsPortfolioByNcstResponse> createGetAccountsPortfolioByNcstResponse(GetAccountsPortfolioByNcstResponse value) {
        return new JAXBElement<GetAccountsPortfolioByNcstResponse>(_GetAccountsPortfolioByNcstResponse_QNAME, GetAccountsPortfolioByNcstResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealerInfoNFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getDealerInfoNFResponse")
    public JAXBElement<GetDealerInfoNFResponse> createGetDealerInfoNFResponse(GetDealerInfoNFResponse value) {
        return new JAXBElement<GetDealerInfoNFResponse>(_GetDealerInfoNFResponse_QNAME, GetDealerInfoNFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDealerInfoNF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getDealerInfoNF")
    public JAXBElement<GetDealerInfoNF> createGetDealerInfoNF(GetDealerInfoNF value) {
        return new JAXBElement<GetDealerInfoNF>(_GetDealerInfoNF_QNAME, GetDealerInfoNF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "searchPositions")
    public JAXBElement<SearchPositions> createSearchPositions(SearchPositions value) {
        return new JAXBElement<SearchPositions>(_SearchPositions_QNAME, SearchPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionDetailWithNcstResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionDetailWithNcstResponse")
    public JAXBElement<GetPositionDetailWithNcstResponse> createGetPositionDetailWithNcstResponse(GetPositionDetailWithNcstResponse value) {
        return new JAXBElement<GetPositionDetailWithNcstResponse>(_GetPositionDetailWithNcstResponse_QNAME, GetPositionDetailWithNcstResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerUkstOrTeleSalesUpperHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getCustomerUkstOrTeleSalesUpperHierarchyResponse")
    public JAXBElement<GetCustomerUkstOrTeleSalesUpperHierarchyResponse> createGetCustomerUkstOrTeleSalesUpperHierarchyResponse(GetCustomerUkstOrTeleSalesUpperHierarchyResponse value) {
        return new JAXBElement<GetCustomerUkstOrTeleSalesUpperHierarchyResponse>(_GetCustomerUkstOrTeleSalesUpperHierarchyResponse_QNAME, GetCustomerUkstOrTeleSalesUpperHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionDetails")
    public JAXBElement<GetPositionDetails> createGetPositionDetails(GetPositionDetails value) {
        return new JAXBElement<GetPositionDetails>(_GetPositionDetails_QNAME, GetPositionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionDetailNF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionDetailNF")
    public JAXBElement<GetPositionDetailNF> createGetPositionDetailNF(GetPositionDetailNF value) {
        return new JAXBElement<GetPositionDetailNF>(_GetPositionDetailNF_QNAME, GetPositionDetailNF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionLowerHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionLowerHierarchy")
    public JAXBElement<GetPositionLowerHierarchy> createGetPositionLowerHierarchy(GetPositionLowerHierarchy value) {
        return new JAXBElement<GetPositionLowerHierarchy>(_GetPositionLowerHierarchy_QNAME, GetPositionLowerHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubOrganizationsByOrganizationNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getSubOrganizationsByOrganizationNameResponse")
    public JAXBElement<GetSubOrganizationsByOrganizationNameResponse> createGetSubOrganizationsByOrganizationNameResponse(GetSubOrganizationsByOrganizationNameResponse value) {
        return new JAXBElement<GetSubOrganizationsByOrganizationNameResponse>(_GetSubOrganizationsByOrganizationNameResponse_QNAME, GetSubOrganizationsByOrganizationNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionDetailWithNcst }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionDetailWithNcst")
    public JAXBElement<GetPositionDetailWithNcst> createGetPositionDetailWithNcst(GetPositionDetailWithNcst value) {
        return new JAXBElement<GetPositionDetailWithNcst>(_GetPositionDetailWithNcst_QNAME, GetPositionDetailWithNcst.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubOrganizationsByOrganizationName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getSubOrganizationsByOrganizationName")
    public JAXBElement<GetSubOrganizationsByOrganizationName> createGetSubOrganizationsByOrganizationName(GetSubOrganizationsByOrganizationName value) {
        return new JAXBElement<GetSubOrganizationsByOrganizationName>(_GetSubOrganizationsByOrganizationName_QNAME, GetSubOrganizationsByOrganizationName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionLowerHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionLowerHierarchyResponse")
    public JAXBElement<GetPositionLowerHierarchyResponse> createGetPositionLowerHierarchyResponse(GetPositionLowerHierarchyResponse value) {
        return new JAXBElement<GetPositionLowerHierarchyResponse>(_GetPositionLowerHierarchyResponse_QNAME, GetPositionLowerHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionHierarchyNF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionHierarchyNF")
    public JAXBElement<GetPositionHierarchyNF> createGetPositionHierarchyNF(GetPositionHierarchyNF value) {
        return new JAXBElement<GetPositionHierarchyNF>(_GetPositionHierarchyNF_QNAME, GetPositionHierarchyNF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerPrimaryUpperHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getCustomerPrimaryUpperHierarchy")
    public JAXBElement<GetCustomerPrimaryUpperHierarchy> createGetCustomerPrimaryUpperHierarchy(GetCustomerPrimaryUpperHierarchy value) {
        return new JAXBElement<GetCustomerPrimaryUpperHierarchy>(_GetCustomerPrimaryUpperHierarchy_QNAME, GetCustomerPrimaryUpperHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerPrimaryUpperHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getCustomerPrimaryUpperHierarchyResponse")
    public JAXBElement<GetCustomerPrimaryUpperHierarchyResponse> createGetCustomerPrimaryUpperHierarchyResponse(GetCustomerPrimaryUpperHierarchyResponse value) {
        return new JAXBElement<GetCustomerPrimaryUpperHierarchyResponse>(_GetCustomerPrimaryUpperHierarchyResponse_QNAME, GetCustomerPrimaryUpperHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccSalesTeamByNcstByLdapName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "checkAccSalesTeamByNcstByLdapName")
    public JAXBElement<CheckAccSalesTeamByNcstByLdapName> createCheckAccSalesTeamByNcstByLdapName(CheckAccSalesTeamByNcstByLdapName value) {
        return new JAXBElement<CheckAccSalesTeamByNcstByLdapName>(_CheckAccSalesTeamByNcstByLdapName_QNAME, CheckAccSalesTeamByNcstByLdapName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionHierarchyNFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionHierarchyNFResponse")
    public JAXBElement<GetPositionHierarchyNFResponse> createGetPositionHierarchyNFResponse(GetPositionHierarchyNFResponse value) {
        return new JAXBElement<GetPositionHierarchyNFResponse>(_GetPositionHierarchyNFResponse_QNAME, GetPositionHierarchyNFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.service.sfa.crm.turkcell.com/", name = "getPositionDetailsResponse")
    public JAXBElement<GetPositionDetailsResponse> createGetPositionDetailsResponse(GetPositionDetailsResponse value) {
        return new JAXBElement<GetPositionDetailsResponse>(_GetPositionDetailsResponse_QNAME, GetPositionDetailsResponse.class, null, value);
    }

}
