/**
 * CollGWwsCfoIntPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.turkcell.my.CollGWws.CollGW;

public interface CollGWwsCfoIntPort extends java.rmi.Remote {
    public cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoResponse getAutoPaymentInfo(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.AutoPaymentInfoRequest autoPaymentInfoRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.InvoiceDelayResponse insertInvoiceDelay(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoiceDelayRequest invoiceDelayRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse cancelInvoicePayment(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoicePaymentCancelRequest invoicePaymentCancelRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse cancelInvoicePaymentByKey(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.PaymentProvisionCancelRequest paymentProvisionCancelRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse payInvoice(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoicePaymentRequest invoicePaymentRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.InvoicePaymentResponse payInvoiceByKey(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.PaymentProvisionRequest paymentProvisionRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.InvoiceQueryOpenResponse getOpenInvoices(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.InvoiceQueryOpenRequest invoiceQueryOpenRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListResponse getKtoOpenInvoicesDetailsList(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsListRequest ktoOpenInvoicesDetailsListRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsResponse getKtoOpenInvoicesDetails(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.KtoOpenInvoicesDetailsRequest ktoOpenInvoicesDetailsRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.PaymentInfoResponse getPaymentInfoByMsisdn(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.PaymentInfoRequest paymentInfoRequest) throws java.rmi.RemoteException;
    public cfoint.model.collgw.turkcelltech.com.TransactionCheckResponse checkTransaction(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.TransactionCheckRequest transactionCheckRequest) throws java.rmi.RemoteException;
    public invoice.model.collgw.turkcelltech.com.InvoiceAddResponse addInvoice(cfoint.model.collgw.turkcelltech.com.Header header, cfoint.model.collgw.turkcelltech.com.InvoiceAddRequest invoiceAddRequest) throws java.rmi.RemoteException;
    public invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkResponse getBulkOpenInvoicesByKey(cfoint.model.collgw.turkcelltech.com.Header header, invoice.model.collgw.turkcelltech.com.InvoiceQueryByKeyOpenBulkRequest invoiceQueryByKeyOpenBulkRequest) throws java.rmi.RemoteException;
    public void fieldInvoiceDetail2(cfoint.model.collgw.turkcelltech.com.InvoiceDetail2 invoiceDetail2) throws java.rmi.RemoteException;
    public void fieldInvoiceDetail4(invoice.model.collgw.turkcelltech.com.InvoiceDetail4 invoiceDetail4) throws java.rmi.RemoteException;
    public void fieldInvoiceDetail5(cfoint.model.collgw.turkcelltech.com.InvoiceDetail5 invoiceDetail5) throws java.rmi.RemoteException;
    public void fieldPaymentInfoDetail(cfoint.model.collgw.turkcelltech.com.PaymentInfoDetail paymentInfoDetail) throws java.rmi.RemoteException;
    public logonoff.model.collgw.turkcelltech.com.WebserviceLogoffResponse webserviceLogoff(logonoff.model.collgw.turkcelltech.com.WebserviceLogoffRequest webserviceLogoffRequest) throws java.rmi.RemoteException;
    public logonoff.model.collgw.turkcelltech.com.WebserviceLogonResponse webserviceLogon(logonoff.model.collgw.turkcelltech.com.WebserviceLogonRequest webserviceLogonRequest) throws java.rmi.RemoteException;
}
