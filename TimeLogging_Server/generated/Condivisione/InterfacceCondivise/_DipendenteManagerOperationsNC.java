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

public interface _DipendenteManagerOperationsNC
{
    void createDipendente(Condivisione.EntityCondivise.EDipendenteCondiviso dipendente);

    int UpdateDipendente(Condivisione.EntityCondivise.EDipendenteCondiviso dipendente);

    int deleteDipendente(Condivisione.EntityCondivise.EDipendenteCondiviso dipentente);

    java.util.ArrayList<Condivisione.EntityCondivise.EConsulenteCondiviso> getListConsulenti(Condivisione.EntityCondivise.EDipendenteCondiviso dipendente);

    java.util.ArrayList<Condivisione.EntityCondivise.EManagerCondiviso> getListManager();

    java.util.ArrayList<Condivisione.EntityCondivise.EDipendenteCondiviso> getListDipendentiAttivita(Condivisione.EntityCondivise.EAttivitaCondivisa progetto);

    java.util.ArrayList<Condivisione.EntityCondivise.EDipendenteCondiviso> getListAllDipendenti();
}
