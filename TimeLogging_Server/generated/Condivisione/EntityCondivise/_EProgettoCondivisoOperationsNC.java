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

public interface _EProgettoCondivisoOperationsNC extends _EAttivitaCondivisaOperationsNC
{
    java.sql.Timestamp[] getProroghe();

    void setProroghe(java.sql.Timestamp[] p);

    void setEClienteCondiviso(EClienteCondiviso cliente);

    ESottoprogettoCondiviso aggiungiSottoprogetto(String titolo, String descrizione, double budget, java.sql.Timestamp inizio, java.sql.Timestamp scadenza, EDipendenteCondiviso manager);

    EClienteCondiviso getEClienteCondiviso();

    void setlistSp(java.util.ArrayList<Condivisione.EntityCondivise.ESottoprogettoCondiviso> listSp);

    java.util.ArrayList<Condivisione.EntityCondivise.ESottoprogettoCondiviso> getlistSp();

    ESottoprogettoCondiviso getSp(String titolo);
}