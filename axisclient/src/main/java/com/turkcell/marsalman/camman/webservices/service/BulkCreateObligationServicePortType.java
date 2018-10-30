/**
 * BulkCreateObligationServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcell.marsalman.camman.webservices.service;

public interface BulkCreateObligationServicePortType extends java.rmi.Remote {
    public com.turkcell.marsalman.camman.webservices.data.model.IsOsyValidResult isOsyValid(long oblgId, long osyId) throws java.rmi.RemoteException;
    public com.turkcell.marsalman.camman.webservices.data.model.QueryPendingApprovalResult queryPendingApprovalCampaign(long osyId, java.lang.String securityKey) throws java.rmi.RemoteException;
    public com.turkcell.marsalman.camman.webservices.data.model.CCSIResult responsePendingApprovalCampaign(long groupId, long ccsiResponse, long osyId, java.lang.String securityKey) throws java.rmi.RemoteException;
}
