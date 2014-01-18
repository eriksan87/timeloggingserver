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

public abstract class Callback_ETimeRecordCondiviso_getConsulente extends Ice.TwowayCallback
{
    public abstract void response(EConsulenteCondiviso __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        ETimeRecordCondivisoPrx __proxy = (ETimeRecordCondivisoPrx)__result.getProxy();
        EConsulenteCondiviso __ret = null;
        try
        {
            __ret = __proxy.end_getConsulente(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
