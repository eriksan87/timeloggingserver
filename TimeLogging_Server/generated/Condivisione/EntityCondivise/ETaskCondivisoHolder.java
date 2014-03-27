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

public final class ETaskCondivisoHolder extends Ice.ObjectHolderBase<ETaskCondiviso>
{
    public
    ETaskCondivisoHolder()
    {
    }

    public
    ETaskCondivisoHolder(ETaskCondiviso value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof ETaskCondiviso)
        {
            value = (ETaskCondiviso)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return ETaskCondiviso.ice_staticId();
    }
}
