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

public abstract class Callback_TimeRecordManager_getListTR extends Ice.TwowayCallback
{
    public abstract void response(java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso> __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        TimeRecordManagerPrx __proxy = (TimeRecordManagerPrx)__result.getProxy();
        java.util.ArrayList<Condivisione.EntityCondivise.ETimeRecordCondiviso> __ret = null;
        try
        {
            __ret = __proxy.end_getListTR(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
