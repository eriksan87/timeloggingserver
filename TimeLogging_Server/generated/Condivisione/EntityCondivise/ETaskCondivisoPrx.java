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

public interface ETaskCondivisoPrx extends EAttivitaCondivisaPrx
{
    public void setAbilitato(boolean abilitato);

    public void setAbilitato(boolean abilitato, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setAbilitato(boolean abilitato);

    public Ice.AsyncResult begin_setAbilitato(boolean abilitato, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setAbilitato(boolean abilitato, Ice.Callback __cb);

    public Ice.AsyncResult begin_setAbilitato(boolean abilitato, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setAbilitato(boolean abilitato, Callback_ETaskCondiviso_setAbilitato __cb);

    public Ice.AsyncResult begin_setAbilitato(boolean abilitato, java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_setAbilitato __cb);

    public void end_setAbilitato(Ice.AsyncResult __result);

    public void setAssegnato(java.sql.Timestamp assegnatoIl);

    public void setAssegnato(java.sql.Timestamp assegnatoIl, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setAssegnato(java.sql.Timestamp assegnatoIl);

    public Ice.AsyncResult begin_setAssegnato(java.sql.Timestamp assegnatoIl, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setAssegnato(java.sql.Timestamp assegnatoIl, Ice.Callback __cb);

    public Ice.AsyncResult begin_setAssegnato(java.sql.Timestamp assegnatoIl, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setAssegnato(java.sql.Timestamp assegnatoIl, Callback_ETaskCondiviso_setAssegnato __cb);

    public Ice.AsyncResult begin_setAssegnato(java.sql.Timestamp assegnatoIl, java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_setAssegnato __cb);

    public void end_setAssegnato(Ice.AsyncResult __result);

    public void setRevocato(java.sql.Timestamp revocatoIl);

    public void setRevocato(java.sql.Timestamp revocatoIl, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setRevocato(java.sql.Timestamp revocatoIl);

    public Ice.AsyncResult begin_setRevocato(java.sql.Timestamp revocatoIl, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setRevocato(java.sql.Timestamp revocatoIl, Ice.Callback __cb);

    public Ice.AsyncResult begin_setRevocato(java.sql.Timestamp revocatoIl, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setRevocato(java.sql.Timestamp revocatoIl, Callback_ETaskCondiviso_setRevocato __cb);

    public Ice.AsyncResult begin_setRevocato(java.sql.Timestamp revocatoIl, java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_setRevocato __cb);

    public void end_setRevocato(Ice.AsyncResult __result);

    public void setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL);

    public void setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL);

    public Ice.AsyncResult begin_setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL, Ice.Callback __cb);

    public Ice.AsyncResult begin_setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL, Callback_ETaskCondiviso_setlistTRL __cb);

    public Ice.AsyncResult begin_setlistTRL(java.util.ArrayList<ETimeRecordCondiviso> listTRL, java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_setlistTRL __cb);

    public void end_setlistTRL(Ice.AsyncResult __result);

    public boolean getAbilitato();

    public boolean getAbilitato(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAbilitato();

    public Ice.AsyncResult begin_getAbilitato(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAbilitato(Ice.Callback __cb);

    public Ice.AsyncResult begin_getAbilitato(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAbilitato(Callback_ETaskCondiviso_getAbilitato __cb);

    public Ice.AsyncResult begin_getAbilitato(java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_getAbilitato __cb);

    public boolean end_getAbilitato(Ice.AsyncResult __result);

    public java.sql.Timestamp getAssegnato();

    public java.sql.Timestamp getAssegnato(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAssegnato();

    public Ice.AsyncResult begin_getAssegnato(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getAssegnato(Ice.Callback __cb);

    public Ice.AsyncResult begin_getAssegnato(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getAssegnato(Callback_ETaskCondiviso_getAssegnato __cb);

    public Ice.AsyncResult begin_getAssegnato(java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_getAssegnato __cb);

    public java.sql.Timestamp end_getAssegnato(Ice.AsyncResult __result);

    public java.sql.Timestamp getRevocato();

    public java.sql.Timestamp getRevocato(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getRevocato();

    public Ice.AsyncResult begin_getRevocato(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getRevocato(Ice.Callback __cb);

    public Ice.AsyncResult begin_getRevocato(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getRevocato(Callback_ETaskCondiviso_getRevocato __cb);

    public Ice.AsyncResult begin_getRevocato(java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_getRevocato __cb);

    public java.sql.Timestamp end_getRevocato(Ice.AsyncResult __result);

    public java.util.ArrayList<ETimeRecordCondiviso> getListTRL();

    public java.util.ArrayList<ETimeRecordCondiviso> getListTRL(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getListTRL();

    public Ice.AsyncResult begin_getListTRL(java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_getListTRL(Ice.Callback __cb);

    public Ice.AsyncResult begin_getListTRL(java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_getListTRL(Callback_ETaskCondiviso_getListTRL __cb);

    public Ice.AsyncResult begin_getListTRL(java.util.Map<String, String> __ctx, Callback_ETaskCondiviso_getListTRL __cb);

    public java.util.ArrayList<ETimeRecordCondiviso> end_getListTRL(Ice.AsyncResult __result);
}