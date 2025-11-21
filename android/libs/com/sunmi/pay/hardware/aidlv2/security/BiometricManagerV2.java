/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.security;
// Declare any non-default types here with import statements

public interface BiometricManagerV2 extends android.os.IInterface
{
  /** Default implementation for BiometricManagerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2
  {
    /**
        * 人脸数据注册
        * @param userid 人脸用户ID(32B)
        * @param feature 人脸特征数据(512B)
        * @return =0-成功,<0–错误码
        */
    @Override public int sysFaceRegisterFeature(byte[] userid, float[] feature) throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 人脸数据删除
        * @param userid 人脸用户ID(32B)
        * @return =0-成功,<0–错误码
        */
    @Override public int sysDeleterFeature(byte[] userid) throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 人脸数据匹配
        * @param feature 待匹配人脸特征数据(512字节)
        * @param threshold 计算阈值
        * @param outData 输出数据，存放人脸匹配数据（32B）
        * @return 0>=outdata中有效数据长度,<0–错误码
        */
    @Override public int sysSearchFeature(float[] feature, float threshold, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2.Stub.Proxy(obj);
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
        case TRANSACTION_sysFaceRegisterFeature:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          float[] _arg1;
          _arg1 = data.createFloatArray();
          int _result = this.sysFaceRegisterFeature(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysDeleterFeature:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sysDeleterFeature(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysSearchFeature:
        {
          data.enforceInterface(descriptor);
          float[] _arg0;
          _arg0 = data.createFloatArray();
          float _arg1;
          _arg1 = data.readFloat();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sysSearchFeature(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2
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
          * 人脸数据注册
          * @param userid 人脸用户ID(32B)
          * @param feature 人脸特征数据(512B)
          * @return =0-成功,<0–错误码
          */
      @Override public int sysFaceRegisterFeature(byte[] userid, float[] feature) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(userid);
          _data.writeFloatArray(feature);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysFaceRegisterFeature, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysFaceRegisterFeature(userid, feature);
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
      /**
          * 人脸数据删除
          * @param userid 人脸用户ID(32B)
          * @return =0-成功,<0–错误码
          */
      @Override public int sysDeleterFeature(byte[] userid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(userid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysDeleterFeature, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysDeleterFeature(userid);
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
      /**
          * 人脸数据匹配
          * @param feature 待匹配人脸特征数据(512字节)
          * @param threshold 计算阈值
          * @param outData 输出数据，存放人脸匹配数据（32B）
          * @return 0>=outdata中有效数据长度,<0–错误码
          */
      @Override public int sysSearchFeature(float[] feature, float threshold, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloatArray(feature);
          _data.writeFloat(threshold);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysSearchFeature, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysSearchFeature(feature, threshold, outData);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(outData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2 sDefaultImpl;
    }
    static final int TRANSACTION_sysFaceRegisterFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_sysDeleterFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_sysSearchFeature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
      * 人脸数据注册
      * @param userid 人脸用户ID(32B)
      * @param feature 人脸特征数据(512B)
      * @return =0-成功,<0–错误码
      */
  public int sysFaceRegisterFeature(byte[] userid, float[] feature) throws android.os.RemoteException;
  /**
      * 人脸数据删除
      * @param userid 人脸用户ID(32B)
      * @return =0-成功,<0–错误码
      */
  public int sysDeleterFeature(byte[] userid) throws android.os.RemoteException;
  /**
      * 人脸数据匹配
      * @param feature 待匹配人脸特征数据(512字节)
      * @param threshold 计算阈值
      * @param outData 输出数据，存放人脸匹配数据（32B）
      * @return 0>=outdata中有效数据长度,<0–错误码
      */
  public int sysSearchFeature(float[] feature, float threshold, byte[] outData) throws android.os.RemoteException;
}
