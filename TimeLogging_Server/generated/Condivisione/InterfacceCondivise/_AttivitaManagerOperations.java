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

public interface _AttivitaManagerOperations
{
    void saveAttivita(Condivisione.EntityCondivise.EAttivitaCondivisa e, Ice.Current __current);

    Condivisione.EntityCondivise.EProgettoCondiviso getProgetto(Condivisione.EntityCondivise.EProgettoCondiviso progetto, Ice.Current __current);

    Condivisione.EntityCondivise.ESottoprogettoCondiviso getSottoprogetto(Condivisione.EntityCondivise.ESottoprogettoCondiviso sprogetto, Ice.Current __current);

    Condivisione.EntityCondivise.ETaskCondiviso getTask(Condivisione.EntityCondivise.ETaskCondiviso task, Ice.Current __current);

    java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso> getListProgetti(Condivisione.EntityCondivise.EDipendenteCondiviso dipendente, boolean abilitati, Ice.Current __current);

    java.util.ArrayList<Condivisione.EntityCondivise.ESottoprogettoCondiviso> getListSottoProgetti(int idprogetto, Condivisione.EntityCondivise.EDipendenteCondiviso dipendente, boolean abilitati, Ice.Current __current);

    java.util.ArrayList<Condivisione.EntityCondivise.ETaskCondiviso> getListTask(int idsottoprogetto, boolean abilitati, Condivisione.EntityCondivise.EDipendenteCondiviso dipendente, Ice.Current __current);
}
