/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.emv;
// Declare any non-default types here with import statements
/** @deprecated */
public interface EMVListener extends android.os.IInterface
{
  /** Default implementation for EMVListener. */
  public static class Default implements com.sunmi.pay.hardware.aidl.emv.EMVListener
  {
    /**
         * 请求显示密码键盘，仅在用户自己实现密码键盘时候会回调
         * @param pinType 0 联机PIN  1 脱机PIN
         * @deprecated
         */
    @Override public void requestShowPinPad(int pinType) throws android.os.RemoteException
    {
    }
    /**
         * 交易处理流程结束，取得是否联机以及脱机交易结果。
         * 55域数据需要用ReadKernelData取得
         * @deprecated
         */
    @Override public void onProcessEnd() throws android.os.RemoteException
    {
    }
    /**
         * EMV流程中出现的错误回调该函数
         * @param erroCode 错误码，详见AidlErrorCode.EMV
         * @deprecated
         */
    @Override public void onError(int erroCode) throws android.os.RemoteException
    {
    }
    /**
         * 交易处理流程结束，脱机批准
         * @deprecated
         */
    @Override public void offlineApproval() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.emv.EMVListener
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.emv.EMVListener";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.emv.EMVListener interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.emv.EMVListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.emv.EMVListener))) {
        return ((com.sunmi.pay.hardware.aidl.emv.EMVListener)iin);
      }
      return new com.sunmi.pay.hardware.aidl.emv.EMVListener.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_requestShowPinPad:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.requestShowPinPad(_arg0);
          return true;
        }
        case TRANSACTION_onProcessEnd:
        {
          data.enforceInterface(descriptor);
          this.onProcessEnd();
          return true;
        }
        case TRANSACTION_onError:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onError(_arg0);
          return true;
        }
        case TRANSACTION_offlineApproval:
        {
          data.enforceInterface(descriptor);
          this.offlineApproval();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.emv.EMVListener
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
           * 请求显示密码键盘，仅在用户自己实现密码键盘时候会回调
           * @param pinType 0 联机PIN  1 脱机PIN
           * @deprecated
           */
      @Override public void requestShowPinPad(int pinType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pinType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestShowPinPad, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().requestShowPinPad(pinType);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 交易处理流程结束，取得是否联机以及脱机交易结果。
           * 55域数据需要用ReadKernelData取得
           * @deprecated
           */
      @Override public void onProcessEnd() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProcessEnd, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onProcessEnd();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * EMV流程中出现的错误回调该函数
           * @param erroCode 错误码，详见AidlErrorCode.EMV
           * @deprecated
           */
      @Override public void onError(int erroCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(erroCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onError(erroCode);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 交易处理流程结束，脱机批准
           * @deprecated
           */
      @Override public void offlineApproval() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_offlineApproval, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().offlineApproval();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidl.emv.EMVListener sDefaultImpl;
    }
    static final int TRANSACTION_requestShowPinPad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onProcessEnd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_offlineApproval = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.emv.EMVListener impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.sunmi.pay.hardware.aidl.emv.EMVListener getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 请求显示密码键盘，仅在用户自己实现密码键盘时候会回调
       * @param pinType 0 联机PIN  1 脱机PIN
       * @deprecated
       */
  public void requestShowPinPad(int pinType) throws android.os.RemoteException;
  /**
       * 交易处理流程结束，取得是否联机以及脱机交易结果。
       * 55域数据需要用ReadKernelData取得
       * @deprecated
       */
  public void onProcessEnd() throws android.os.RemoteException;
  /**
       * EMV流程中出现的错误回调该函数
       * @param erroCode 错误码，详见AidlErrorCode.EMV
       * @deprecated
       */
  public void onError(int erroCode) throws android.os.RemoteException;
  /**
       * 交易处理流程结束，脱机批准
       * @deprecated
       */
  public void offlineApproval() throws android.os.RemoteException;
}
