/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.test;
// Declare any non-default types here with import statements

public interface TestOptV2 extends android.os.IInterface
{
  /** Default implementation for TestOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.test.TestOptV2
  {
    /**
         * 通讯测试
         * @param dataIn 输入数据
         * @param dataOut buffer，存放输出数据
         * @return >=0-dataOunt中有效数据的长度，<0-错误码
         */
    @Override public int testTransmission(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置参数
         * @param bundle 参数
         * @return 0-成功，<0-错误码
         */
    @Override public int setParam(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.test.TestOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.test.TestOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.test.TestOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.test.TestOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.test.TestOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.test.TestOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.test.TestOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_testTransmission:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.testTransmission(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_setParam:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setParam(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.test.TestOptV2
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
           * 通讯测试
           * @param dataIn 输入数据
           * @param dataOut buffer，存放输出数据
           * @return >=0-dataOunt中有效数据的长度，<0-错误码
           */
      @Override public int testTransmission(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_testTransmission, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().testTransmission(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 设置参数
           * @param bundle 参数
           * @return 0-成功，<0-错误码
           */
      @Override public int setParam(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setParam(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidlv2.test.TestOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_testTransmission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.test.TestOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.test.TestOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 通讯测试
       * @param dataIn 输入数据
       * @param dataOut buffer，存放输出数据
       * @return >=0-dataOunt中有效数据的长度，<0-错误码
       */
  public int testTransmission(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 设置参数
       * @param bundle 参数
       * @return 0-成功，<0-错误码
       */
  public int setParam(android.os.Bundle bundle) throws android.os.RemoteException;
}
