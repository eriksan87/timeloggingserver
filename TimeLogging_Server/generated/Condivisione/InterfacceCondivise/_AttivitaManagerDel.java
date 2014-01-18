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

package Condivisione.InterfacceCondivise;

public interface _AttivitaManagerDel extends Ice._ObjectDel
{
    void saveAttivita(Condivisione.EntityCondivise.EAttivitaCondivisa e, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    Condivisione.EntityCondivise.EProgettoCondiviso getProgetto(Condivisione.EntityCondivise.EProgettoCondiviso progetto, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    Condivisione.EntityCondivise.ESottoprogettoCondiviso getSottoprogetto(Condivisione.EntityCondivise.ESottoprogettoCondiviso sprogetto, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    Condivisione.EntityCondivise.ETaskCondiviso getTask(Condivisione.EntityCondivise.ETaskCondiviso task, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso> getListProgetti(Condivisione.EntityCondivise.EDipendenteCondiviso dipendente, boolean abilitati, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<Condivisione.EntityCondivise.ESottoprogettoCondiviso> getListSottoProgetti(int idprogetto, Condivisione.EntityCondivise.EDipendenteCondiviso dipendente, boolean abilitati, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<Condivisione.EntityCondivise.ETaskCondiviso> getListTask(int idsottoprogetto, boolean abilitati, Condivisione.EntityCondivise.EDipendenteCondiviso dipendente, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;
}