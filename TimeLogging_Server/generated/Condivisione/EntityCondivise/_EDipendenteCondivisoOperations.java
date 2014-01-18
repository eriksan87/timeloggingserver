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

public interface _EDipendenteCondivisoOperations
{
    void setId(int id, Ice.Current __current);

    void setNome(String nome, Ice.Current __current);

    void setCognome(String cognome, Ice.Current __current);

    void setIndirizzo(String indirizzo, Ice.Current __current);

    void setPagaBase(double pagaBase, Ice.Current __current);

    void setFigProfessionale(String figProfessionale, Ice.Current __current);

    void setAnzianita(int anzianita, Ice.Current __current);

    void setUsername(String username, Ice.Current __current);

    void setPassword(String password, Ice.Current __current);

    int getId(Ice.Current __current);

    String getNome(Ice.Current __current);

    String getCognome(Ice.Current __current);

    String getIndirizzo(Ice.Current __current);

    double getPagaBase(Ice.Current __current);

    String getFigProfessionale(Ice.Current __current);

    int getAnzianita(Ice.Current __current);

    String getTag(Ice.Current __current);

    String getUsername(Ice.Current __current);

    String getPassword(Ice.Current __current);
}