/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.pinpad;
// Declare any non-default types here with import statements
/** @deprecated */
public interface PinPadOpt extends android.os.IInterface
{
  /** Default implementation for PinPadOpt. */
  public static class Default implements com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
  {
    /**
         * 初始化PinPad
         * @param config: 密码键盘配置
         * @param listerner 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
         * @return 乱序键值
         * @deprecated
         */
    @Override public java.lang.String initPinPad(com.sunmi.pay.hardware.aidl.bean.PinPadConfig config, com.sunmi.pay.hardware.aidl.pinpad.PinPadListener listerner) throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 输入pinpad 坐标参数 实现TP接管
         * @param data: 自实现的密码键盘需要传入坐标
         * @deprecated
         */
    @Override public void importPinPadData(com.sunmi.pay.hardware.aidl.bean.PinPadData data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt))) {
        return ((com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt)iin);
      }
      return new com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt.Stub.Proxy(obj);
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
        case TRANSACTION_initPinPad:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.bean.PinPadConfig _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidl.bean.PinPadConfig.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidl.pinpad.PinPadListener _arg1;
          _arg1 = com.sunmi.pay.hardware.aidl.pinpad.PinPadListener.Stub.asInterface(data.readStrongBinder());
          java.lang.String _result = this.initPinPad(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_importPinPadData:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.bean.PinPadData _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidl.bean.PinPadData.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.importPinPadData(_arg0);
          reply.writeNoException();
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt
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
           * 初始化PinPad
           * @param config: 密码键盘配置
           * @param listerner 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
           * @return 乱序键值
           * @deprecated
           */
      @Override public java.lang.String initPinPad(com.sunmi.pay.hardware.aidl.bean.PinPadConfig config, com.sunmi.pay.hardware.aidl.pinpad.PinPadListener listerner) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((config!=null)) {
            _data.writeInt(1);
            config.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((listerner!=null))?(listerner.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_initPinPad, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initPinPad(config, listerner);
          }
          _reply.readException();
          _result = _reply.readString();
          if ((0!=_reply.readInt())) {
            config.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 输入pinpad 坐标参数 实现TP接管
           * @param data: 自实现的密码键盘需要传入坐标
           * @deprecated
           */
      @Override public void importPinPadData(com.sunmi.pay.hardware.aidl.bean.PinPadData data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((data!=null)) {
            _data.writeInt(1);
            data.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPinPadData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importPinPadData(data);
            return;
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            data.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt sDefaultImpl;
    }
    static final int TRANSACTION_initPinPad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_importPinPadData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt impl) {
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
    public static com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 初始化PinPad
       * @param config: 密码键盘配置
       * @param listerner 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
       * @return 乱序键值
       * @deprecated
       */
  public java.lang.String initPinPad(com.sunmi.pay.hardware.aidl.bean.PinPadConfig config, com.sunmi.pay.hardware.aidl.pinpad.PinPadListener listerner) throws android.os.RemoteException;
  /**
       * 输入pinpad 坐标参数 实现TP接管
       * @param data: 自实现的密码键盘需要传入坐标
       * @deprecated
       */
  public void importPinPadData(com.sunmi.pay.hardware.aidl.bean.PinPadData data) throws android.os.RemoteException;
}
