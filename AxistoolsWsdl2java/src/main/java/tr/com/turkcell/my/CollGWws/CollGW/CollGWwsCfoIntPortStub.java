/**
 * CollGWwsCfoIntPortStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.turkcell.my.CollGWws.CollGW;

public class CollGWwsCfoIntPortStub extends org.apache.axis.client.Stub implements tr.com.turkcell.my.CollGWws.CollGW.CollGWwsCfoIntPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAutoPaymentInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoPaymentInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "AutoPaymentInfoRequest"), cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "AutoPaymentInfoResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("insertInvoiceDelay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceDelayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDelayRequest"), cfoint.model.collgw.turkcelltech.com.InvoiceDelayRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDelayResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelInvoicePayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoicePaymentCancelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentCancelRequest"), cfoint.model.collgw.turkcelltech.com.InvoicePaymentCancelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelInvoicePaymentByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paymentProvisionCancelRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "PaymentProvisionCancelRequest"), invoice.model.collgw.turkcelltech.com.PaymentProvisionCancelRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("payInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoicePaymentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentRequest"), cfoint.model.collgw.turkcelltech.com.InvoicePaymentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("payInvoiceByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paymentProvisionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "PaymentProvisionRequest"), invoice.model.collgw.turkcelltech.com.PaymentProvisionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getOpenInvoices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceQueryOpenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryOpenRequest"), invoice.model.collgw.turkcelltech.com.InvoiceQueryOpenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceQueryOpenResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKtoOpenInvoicesDetailsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ktoOpenInvoicesDetailsListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsListRequest"), cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsListResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKtoOpenInvoicesDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ktoOpenInvoicesDetailsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsRequest"), cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentInfoByMsisdn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paymentInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoRequest"), cfoint.model.collgw.turkcelltech.com.PaymentInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transactionCheckRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "TransactionCheckRequest"), cfoint.model.collgw.turkcelltech.com.TransactionCheckRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "TransactionCheckResponse"));
        oper.setReturnClass(cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceAddRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceAddRequest"), cfoint.model.collgw.turkcelltech.com.InvoiceAddRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceAddResponse"));
        oper.setReturnClass(invoice.model.collgw.turkcelltech.com.InvoiceAddResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBulkOpenInvoicesByKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "header"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header"), cfoint.model.collgw.turkcelltech.com.Header.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceQueryByKeyOpenBulkRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryByKeyOpenBulkRequest"), invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryByKeyOpenBulkResponse"));
        oper.setReturnClass(invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fieldInvoiceDetail2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceDetail2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail2"), cfoint.model.collgw.turkcelltech.com.InvoiceDetail2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fieldInvoiceDetail4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceDetail4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceDetail4"), invoice.model.collgw.turkcelltech.com.InvoiceDetail4.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fieldInvoiceDetail5");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceDetail5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail5"), cfoint.model.collgw.turkcelltech.com.InvoiceDetail5.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("fieldPaymentInfoDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "paymentInfoDetail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoDetail"), cfoint.model.collgw.turkcelltech.com.PaymentInfoDetail.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("webserviceLogoff");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webserviceLogoffRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogoffRequest"), logonoff.model.collgw.turkcelltech.com.WebserviceLogoffRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogoffResponse"));
        oper.setReturnClass(logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("webserviceLogon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webserviceLogonRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogonRequest"), logonoff.model.collgw.turkcelltech.com.WebserviceLogonRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogonResponse"));
        oper.setReturnClass(logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

    }

    public CollGWwsCfoIntPortStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CollGWwsCfoIntPortStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CollGWwsCfoIntPortStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "AutoPaymentInfoRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "AutoPaymentInfoResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "Header");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.Header.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceAddRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceAddRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDelayRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceDelayRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDelayResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail2");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceDetail2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceDetail5");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceDetail5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentCancelRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoicePaymentCancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoicePaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoicePaymentResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "InvoiceQueryOpenResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsListRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsListResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "KtoOpenInvoicesDetailsResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoDetail");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.PaymentInfoDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.PaymentInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "PaymentInfoResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "TransactionCheckRequest");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.TransactionCheckRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.cfoint", "TransactionCheckResponse");
            cachedSerQNames.add(qName);
            cls = cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.common", "CustomerInformation");
            cachedSerQNames.add(qName);
            cls = common.model.collgw.turkcelltech.com.CustomerInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.common", "OriginatorId");
            cachedSerQNames.add(qName);
            cls = common.model.collgw.turkcelltech.com.OriginatorId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "ArrayOfCustomerInvoiceInfo2");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.CustomerInvoiceInfo2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "CustomerInvoiceInfo2");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "CustomerInvoiceInfo2");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.CustomerInvoiceInfo2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceAddResponse");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.InvoiceAddResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceDetail4");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.InvoiceDetail4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryByKeyOpenBulkRequest");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryByKeyOpenBulkResponse");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "InvoiceQueryOpenRequest");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.InvoiceQueryOpenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "PaymentProvisionCancelRequest");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.PaymentProvisionCancelRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.invoice", "PaymentProvisionRequest");
            cachedSerQNames.add(qName);
            cls = invoice.model.collgw.turkcelltech.com.PaymentProvisionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogoffRequest");
            cachedSerQNames.add(qName);
            cls = logonoff.model.collgw.turkcelltech.com.WebserviceLogoffRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogoffResponse");
            cachedSerQNames.add(qName);
            cls = logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogonRequest");
            cachedSerQNames.add(qName);
            cls = logonoff.model.collgw.turkcelltech.com.WebserviceLogonRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:com.turkcelltech.collgw.model.logonoff", "WebserviceLogonResponse");
            cachedSerQNames.add(qName);
            cls = logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("java:language_builtins.lang", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("java:language_builtins.util", "ArrayList");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("java:language_builtins.util", "List");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse getAutoPaymentInfo(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoRequest autoPaymentInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "getAutoPaymentInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, autoPaymentInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse insertInvoiceDelay(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoiceDelayRequest invoiceDelayRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "insertInvoiceDelay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, invoiceDelayRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse cancelInvoicePayment(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoicePaymentCancelRequest invoicePaymentCancelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "cancelInvoicePayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, invoicePaymentCancelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse cancelInvoicePaymentByKey(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.PaymentProvisionCancelRequest paymentProvisionCancelRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "cancelInvoicePaymentByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, paymentProvisionCancelRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse payInvoice(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoicePaymentRequest invoicePaymentRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "payInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, invoicePaymentRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse payInvoiceByKey(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.PaymentProvisionRequest paymentProvisionRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "payInvoiceByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, paymentProvisionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse getOpenInvoices(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.InvoiceQueryOpenRequest invoiceQueryOpenRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "getOpenInvoices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, invoiceQueryOpenRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse getKtoOpenInvoicesDetailsList(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListRequest ktoOpenInvoicesDetailsListRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "getKtoOpenInvoicesDetailsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, ktoOpenInvoicesDetailsListRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse getKtoOpenInvoicesDetails(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsRequest ktoOpenInvoicesDetailsRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "getKtoOpenInvoicesDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, ktoOpenInvoicesDetailsRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse getPaymentInfoByMsisdn(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.PaymentInfoRequest paymentInfoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "getPaymentInfoByMsisdn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, paymentInfoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse checkTransaction(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.TransactionCheckRequest transactionCheckRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "checkTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, transactionCheckRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse) org.apache.axis.utils.JavaUtils.convert(_resp, cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public invoice.model.collgw.turkcelltech.com.InvoiceAddResponse addInvoice(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoiceAddRequest invoiceAddRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "addInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, invoiceAddRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (invoice.model.collgw.turkcelltech.com.InvoiceAddResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (invoice.model.collgw.turkcelltech.com.InvoiceAddResponse) org.apache.axis.utils.JavaUtils.convert(_resp, invoice.model.collgw.turkcelltech.com.InvoiceAddResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse getBulkOpenInvoicesByKey(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkRequest invoiceQueryByKeyOpenBulkRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "getBulkOpenInvoicesByKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {header, invoiceQueryByKeyOpenBulkRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse) org.apache.axis.utils.JavaUtils.convert(_resp, invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void fieldInvoiceDetail2(cfoint.model.collgw.turkcelltech.com.InvoiceDetail2 invoiceDetail2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "fieldInvoiceDetail2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoiceDetail2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void fieldInvoiceDetail4(invoice.model.collgw.turkcelltech.com.InvoiceDetail4 invoiceDetail4) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "fieldInvoiceDetail4"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoiceDetail4});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void fieldInvoiceDetail5(cfoint.model.collgw.turkcelltech.com.InvoiceDetail5 invoiceDetail5) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "fieldInvoiceDetail5"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoiceDetail5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void fieldPaymentInfoDetail(cfoint.model.collgw.turkcelltech.com.PaymentInfoDetail paymentInfoDetail) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "fieldPaymentInfoDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {paymentInfoDetail});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse webserviceLogoff(logonoff.model.collgw.turkcelltech.com.WebserviceLogoffRequest webserviceLogoffRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "webserviceLogoff"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webserviceLogoffRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse) org.apache.axis.utils.JavaUtils.convert(_resp, logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse webserviceLogon(logonoff.model.collgw.turkcelltech.com.WebserviceLogonRequest webserviceLogonRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://my.turkcell.com.tr:7001/CollGWws/CollGW", "webserviceLogon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {webserviceLogonRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse) org.apache.axis.utils.JavaUtils.convert(_resp, logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
