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

public abstract class Callback_AttivitaManager_getListProgettiClienti extends Ice.TwowayCallback
{
    public abstract void response(java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso> __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        AttivitaManagerPrx __proxy = (AttivitaManagerPrx)__result.getProxy();
        java.util.ArrayList<Condivisione.EntityCondivise.EProgettoCondiviso> __ret = null;
        try
        {
            __ret = __proxy.end_getListProgettiClienti(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
