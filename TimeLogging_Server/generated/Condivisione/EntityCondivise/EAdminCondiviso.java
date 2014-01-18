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

public abstract class EAdminCondiviso extends EDipendenteCondiviso
                                      implements _EAdminCondivisoOperations,
                                                 _EAdminCondivisoOperationsNC
{
    public EAdminCondiviso()
    {
        super();
    }

    public EAdminCondiviso(int id, String nome, String cognome, String indirizzo, double pagaBase, String figProfessionale, int anzianita, String username, String password)
    {
        super(id, nome, cognome, indirizzo, pagaBase, figProfessionale, anzianita, username, password);
    }

    public static final String[] __ids =
    {
        "::Condivisione::EntityCondivise::EAdminCondiviso",
        "::Condivisione::EntityCondivise::EDipendenteCondiviso",
        "::Condivisione::EntityCondivise::EntityCondivisa",
        "::Ice::Object"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[0];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[0];
    }

    public static String ice_staticId()
    {
        return __ids[0];
    }

    private final static String[] __all =
    {
        "getAnzianita",
        "getCognome",
        "getFigProfessionale",
        "getId",
        "getIndirizzo",
        "getNome",
        "getPagaBase",
        "getPassword",
        "getTag",
        "getUsername",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "setAnzianita",
        "setCognome",
        "setFigProfessionale",
        "setId",
        "setIndirizzo",
        "setNome",
        "setPagaBase",
        "setPassword",
        "setUsername"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return EDipendenteCondiviso.___getAnzianita(this, in, __current);
            }
            case 1:
            {
                return EDipendenteCondiviso.___getCognome(this, in, __current);
            }
            case 2:
            {
                return EDipendenteCondiviso.___getFigProfessionale(this, in, __current);
            }
            case 3:
            {
                return EDipendenteCondiviso.___getId(this, in, __current);
            }
            case 4:
            {
                return EDipendenteCondiviso.___getIndirizzo(this, in, __current);
            }
            case 5:
            {
                return EDipendenteCondiviso.___getNome(this, in, __current);
            }
            case 6:
            {
                return EDipendenteCondiviso.___getPagaBase(this, in, __current);
            }
            case 7:
            {
                return EDipendenteCondiviso.___getPassword(this, in, __current);
            }
            case 8:
            {
                return EDipendenteCondiviso.___getTag(this, in, __current);
            }
            case 9:
            {
                return EDipendenteCondiviso.___getUsername(this, in, __current);
            }
            case 10:
            {
                return ___ice_id(this, in, __current);
            }
            case 11:
            {
                return ___ice_ids(this, in, __current);
            }
            case 12:
            {
                return ___ice_isA(this, in, __current);
            }
            case 13:
            {
                return ___ice_ping(this, in, __current);
            }
            case 14:
            {
                return EDipendenteCondiviso.___setAnzianita(this, in, __current);
            }
            case 15:
            {
                return EDipendenteCondiviso.___setCognome(this, in, __current);
            }
            case 16:
            {
                return EDipendenteCondiviso.___setFigProfessionale(this, in, __current);
            }
            case 17:
            {
                return EDipendenteCondiviso.___setId(this, in, __current);
            }
            case 18:
            {
                return EDipendenteCondiviso.___setIndirizzo(this, in, __current);
            }
            case 19:
            {
                return EDipendenteCondiviso.___setNome(this, in, __current);
            }
            case 20:
            {
                return EDipendenteCondiviso.___setPagaBase(this, in, __current);
            }
            case 21:
            {
                return EDipendenteCondiviso.___setPassword(this, in, __current);
            }
            case 22:
            {
                return EDipendenteCondiviso.___setUsername(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, false);
        __os.endWriteSlice();
        super.__writeImpl(__os);
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
        super.__readImpl(__is);
    }

    public static final long serialVersionUID = 871970682L;
}