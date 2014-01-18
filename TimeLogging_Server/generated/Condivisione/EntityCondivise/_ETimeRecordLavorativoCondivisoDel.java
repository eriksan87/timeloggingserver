// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `Condivisione.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Condivisione.EntityCondivise;

public interface _ETimeRecordLavorativoCondivisoDel extends _ETimeRecordCondivisoDel
{
    void setCosto(double costo, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    double getCosto(java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    void setETaskCondiviso(ETaskCondiviso task, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    ETaskCondiviso getETaskCondiviso(java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    double calcolaCosto(java.util.ArrayList<ETariffaCondivisa> tariffe, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;
}