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

public final class EProgettoCondivisoHolder extends Ice.ObjectHolderBase<EProgettoCondiviso>
{
    public
    EProgettoCondivisoHolder()
    {
    }

    public
    EProgettoCondivisoHolder(EProgettoCondiviso value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof EProgettoCondiviso)
        {
            value = (EProgettoCondiviso)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return EProgettoCondiviso.ice_staticId();
    }
}
