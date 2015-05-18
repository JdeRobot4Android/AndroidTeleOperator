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
// Generated from file `ptmotors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Gazebo PTMotors Actuators interaction.
 **/
public final class PTMotorsPrxHelper extends Ice.ObjectPrxHelperBase implements PTMotorsPrx
{
    private static final String __setPTMotorsData_name = "setPTMotorsData";

    public int setPTMotorsData(PTMotorsData data)
    {
        return setPTMotorsData(data, null, false);
    }

    public int setPTMotorsData(PTMotorsData data, java.util.Map<String, String> __ctx)
    {
        return setPTMotorsData(data, __ctx, true);
    }

    private int setPTMotorsData(PTMotorsData data, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setPTMotorsData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setPTMotorsData");
                    __delBase = __getDelegate(false);
                    _PTMotorsDel __del = (_PTMotorsDel)__delBase;
                    return __del.setPTMotorsData(data, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data)
    {
        return begin_setPTMotorsData(data, null, false, null);
    }

    public Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data, java.util.Map<String, String> __ctx)
    {
        return begin_setPTMotorsData(data, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data, Ice.Callback __cb)
    {
        return begin_setPTMotorsData(data, null, false, __cb);
    }

    public Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setPTMotorsData(data, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data, Callback_PTMotors_setPTMotorsData __cb)
    {
        return begin_setPTMotorsData(data, null, false, __cb);
    }

    public Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data, java.util.Map<String, String> __ctx, Callback_PTMotors_setPTMotorsData __cb)
    {
        return begin_setPTMotorsData(data, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setPTMotorsData(PTMotorsData data, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setPTMotorsData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setPTMotorsData_name, __cb);
        try
        {
            __result.__prepare(__setPTMotorsData_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeObject(data);
            __os.writePendingObjects();
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setPTMotorsData(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setPTMotorsData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static PTMotorsPrx checkedCast(Ice.ObjectPrx __obj)
    {
        PTMotorsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsPrx)
            {
                __d = (PTMotorsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    PTMotorsPrxHelper __h = new PTMotorsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTMotorsPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PTMotorsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsPrx)
            {
                __d = (PTMotorsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    PTMotorsPrxHelper __h = new PTMotorsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTMotorsPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTMotorsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    PTMotorsPrxHelper __h = new PTMotorsPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PTMotorsPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PTMotorsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    PTMotorsPrxHelper __h = new PTMotorsPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PTMotorsPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        PTMotorsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsPrx)
            {
                __d = (PTMotorsPrx)__obj;
            }
            else
            {
                PTMotorsPrxHelper __h = new PTMotorsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PTMotorsPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTMotorsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PTMotorsPrxHelper __h = new PTMotorsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::PTMotors"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _PTMotorsDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _PTMotorsDelD();
    }

    public static void __write(IceInternal.BasicStream __os, PTMotorsPrx v)
    {
        __os.writeProxy(v);
    }

    public static PTMotorsPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PTMotorsPrxHelper result = new PTMotorsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
