/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.pinpad;
// Declare any non-default types here with import statements
/** @deprecated */
public interface PinPadListener extends android.os.IInterface
{
  /** Default implementation for PinPadListener. */
  public static class Default implements com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
  {
    /**
         * 回调当前输密位数，如果按退格，返回length为0
         * @param length 输PIN的长度
         * @deprecated
         */
    @Override public void onPinLength(int length) throws android.os.RemoteException
    {
    }
    /**
         * 按下确认检，返回PinBlock
         * @param type pin类型，0-联机PIN，1-脱机PIN
         * @param pinBlock pinBlock，当type=1时，为长度为1的数组，无意义
         * @deprecated
         */
    @Override public void onConfirm(int type, byte[] pinBlock) throws android.os.RemoteException
    {
    }
    /**
         * 取消输PIN
         * @deprecated
         */
    @Override public void onCancel() throws android.os.RemoteException
    {
    }
    /**
         * 输PIN出错
         * @deprecated
         */
    @Override public void onError(int errorCode) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.pinpad.PinPadListener";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.pinpad.PinPadListener interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.pinpad.PinPadListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.pinpad.PinPadListener))) {
        return ((com.sunmi.pay.hardware.aidl.pinpad.PinPadListener)iin);
      }
      return new com.sunmi.pay.hardware.aidl.pinpad.PinPadListener.Stub.Proxy(obj);
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
        case TRANSACTION_onPinLength:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onPinLength(_arg0);
          return true;
        }
        case TRANSACTION_onConfirm:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          this.onConfirm(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onCancel:
        {
          data.enforceInterface(descriptor);
          this.onCancel();
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
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.pinpad.PinPadListener
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
           * 回调当前输密位数，如果按退格，返回length为0
           * @param length 输PIN的长度
           * @deprecated
           */
      @Override public void onPinLength(int length) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPinLength, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPinLength(length);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 按下确认检，返回PinBlock
           * @param type pin类型，0-联机PIN，1-脱机PIN
           * @param pinBlock pinBlock，当type=1时，为长度为1的数组，无意义
           * @deprecated
           */
      @Override public void onConfirm(int type, byte[] pinBlock) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeByteArray(pinBlock);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConfirm, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onConfirm(type, pinBlock);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 取消输PIN
           * @deprecated
           */
      @Override public void onCancel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCancel, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCancel();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 输PIN出错
           * @deprecated
           */
      @Override public void onError(int errorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onError(errorCode);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidl.pinpad.PinPadListener sDefaultImpl;
    }
    static final int TRANSACTION_onPinLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onConfirm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.pinpad.PinPadListener impl) {
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
    public static com.sunmi.pay.hardware.aidl.pinpad.PinPadListener getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 回调当前输密位数，如果按退格，返回length为0
       * @param length 输PIN的长度
       * @deprecated
       */
  public void onPinLength(int length) throws android.os.RemoteException;
  /**
       * 按下确认检，返回PinBlock
       * @param type pin类型，0-联机PIN，1-脱机PIN
       * @param pinBlock pinBlock，当type=1时，为长度为1的数组，无意义
       * @deprecated
       */
  public void onConfirm(int type, byte[] pinBlock) throws android.os.RemoteException;
  /**
       * 取消输PIN
       * @deprecated
       */
  public void onCancel() throws android.os.RemoteException;
  /**
       * 输PIN出错
       * @deprecated
       */
  public void onError(int errorCode) throws android.os.RemoteException;
}
