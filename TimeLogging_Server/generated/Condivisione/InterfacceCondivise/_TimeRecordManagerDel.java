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

public interface _TimeRecordManagerDel extends Ice._ObjectDel
{
    int save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    void elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso> getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;
}
