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

public interface TimeRecordManagerPrx extends Ice.ObjectPrx
{
    public int save(Condivisione.EntityCondivise.ETimeRecordCondiviso e);

    public int save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_save(Condivisione.EntityCondivise.ETimeRecordCondiviso e);

    public Ice.AsyncResult begin_save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, Ice.Callback __cb);

    public Ice.AsyncResult begin_save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, Callback_TimeRecordManager_save __cb);

    public Ice.AsyncResult begin_save(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx, Callback_TimeRecordManager_save __cb);

    public int end_save(Ice.AsyncResult __result);

    public void elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e);

    public void elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e);

    public Ice.AsyncResult begin_elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, Ice.Callback __cb);

    public Ice.AsyncResult begin_elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, Callback_TimeRecordManager_elimina __cb);

    public Ice.AsyncResult begin_elimina(Condivisione.EntityCondivise.ETimeRecordCondiviso e, java.util.Map<String, String> __ctx, Callback_TimeRecordManager_elimina __cb);

    public void end_elimina(Ice.AsyncResult __result);

    public java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso> getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip);

    public java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso> getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip);

    public Ice.AsyncResult begin_getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, Ice.Callback __cb);

    public Ice.AsyncResult begin_getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, Callback_TimeRecordManager_getListTR __cb);

    public Ice.AsyncResult begin_getListTR(int idprogetto, int idsottoprogetto, int idtask, String dal, String al, String ultimi, boolean lavorativo, boolean nonlavorativo, String categoria, Condivisione.EntityCondivise.EDipendenteCondiviso dip, java.util.Map<String, String> __ctx, Callback_TimeRecordManager_getListTR __cb);

    public java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso> end_getListTR(Ice.AsyncResult __result);
}
