/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.rfid;
// Declare any non-default types here with import statements

public interface RFIDOptV2 extends android.os.IInterface
{
  /** Default implementation for RFIDOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2
  {
    /**
         * 复位系统
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @return 0-成功，<0-错误码
         */
    @Override public int m112Reset(int srcAddress, int destAddress) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取版本
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @param outData 版本信息
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int m112GetVersion(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取CPU唯一ID号
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @param outData CPU唯一ID数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int m112GetCPUId(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 查询场内标签
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @param outData 标签的UID数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int m112QueryTagInField(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 开启自动盘点模式
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @param freq 自动盘点频率（如5表示每500ms读取一次）
         * @return 0-成功，<0-错误码
         */
    @Override public int m112EnableAutoDetectMode(int srcAddress, int destAddress, int freq) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 停止自动盘点模式
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @return 0-成功，<0-错误码
         */
    @Override public int m112DisableAutoDetectMode(int srcAddress, int destAddress) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 写T5557数据块
         * @param srcAddress 源地址
         * @param destAddress 目标地址
         * @param page 页地址
         * @param block 块地址
         * @param lockFlag 锁定标志，0-不锁定，1-锁定块
         * @param data 块数据(4B)
         * @param pwdFlag 密码标志，0-无密码写，1-有密码写
         * @param pwd 密码(4B)
         * @return 0-成功，<0-错误码
         */
    @Override public int m112WriteT557Block(int srcAddress, int destAddress, int page, int block, int lockFlag, byte[] data, int pwdFlag, byte[] pwd) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_m112Reset:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.m112Reset(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_m112GetVersion:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.m112GetVersion(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_m112GetCPUId:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.m112GetCPUId(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_m112QueryTagInField:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.m112QueryTagInField(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_m112EnableAutoDetectMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.m112EnableAutoDetectMode(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_m112DisableAutoDetectMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.m112DisableAutoDetectMode(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_m112WriteT557Block:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          int _arg6;
          _arg6 = data.readInt();
          byte[] _arg7;
          _arg7 = data.createByteArray();
          int _result = this.m112WriteT557Block(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2
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
           * 复位系统
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @return 0-成功，<0-错误码
           */
      @Override public int m112Reset(int srcAddress, int destAddress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112Reset, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112Reset(srcAddress, destAddress);
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
           * 获取版本
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @param outData 版本信息
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int m112GetVersion(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112GetVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112GetVersion(srcAddress, destAddress, outData);
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
      /**
           * 获取CPU唯一ID号
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @param outData CPU唯一ID数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int m112GetCPUId(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112GetCPUId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112GetCPUId(srcAddress, destAddress, outData);
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
      /**
           * 查询场内标签
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @param outData 标签的UID数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int m112QueryTagInField(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112QueryTagInField, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112QueryTagInField(srcAddress, destAddress, outData);
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
      /**
           * 开启自动盘点模式
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @param freq 自动盘点频率（如5表示每500ms读取一次）
           * @return 0-成功，<0-错误码
           */
      @Override public int m112EnableAutoDetectMode(int srcAddress, int destAddress, int freq) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          _data.writeInt(freq);
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112EnableAutoDetectMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112EnableAutoDetectMode(srcAddress, destAddress, freq);
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
           * 停止自动盘点模式
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @return 0-成功，<0-错误码
           */
      @Override public int m112DisableAutoDetectMode(int srcAddress, int destAddress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112DisableAutoDetectMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112DisableAutoDetectMode(srcAddress, destAddress);
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
           * 写T5557数据块
           * @param srcAddress 源地址
           * @param destAddress 目标地址
           * @param page 页地址
           * @param block 块地址
           * @param lockFlag 锁定标志，0-不锁定，1-锁定块
           * @param data 块数据(4B)
           * @param pwdFlag 密码标志，0-无密码写，1-有密码写
           * @param pwd 密码(4B)
           * @return 0-成功，<0-错误码
           */
      @Override public int m112WriteT557Block(int srcAddress, int destAddress, int page, int block, int lockFlag, byte[] data, int pwdFlag, byte[] pwd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcAddress);
          _data.writeInt(destAddress);
          _data.writeInt(page);
          _data.writeInt(block);
          _data.writeInt(lockFlag);
          _data.writeByteArray(data);
          _data.writeInt(pwdFlag);
          _data.writeByteArray(pwd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_m112WriteT557Block, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().m112WriteT557Block(srcAddress, destAddress, page, block, lockFlag, data, pwdFlag, pwd);
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
      public static com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_m112Reset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_m112GetVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_m112GetCPUId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_m112QueryTagInField = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_m112EnableAutoDetectMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_m112DisableAutoDetectMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_m112WriteT557Block = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 复位系统
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @return 0-成功，<0-错误码
       */
  public int m112Reset(int srcAddress, int destAddress) throws android.os.RemoteException;
  /**
       * 获取版本
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @param outData 版本信息
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int m112GetVersion(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException;
  /**
       * 获取CPU唯一ID号
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @param outData CPU唯一ID数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int m112GetCPUId(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException;
  /**
       * 查询场内标签
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @param outData 标签的UID数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int m112QueryTagInField(int srcAddress, int destAddress, byte[] outData) throws android.os.RemoteException;
  /**
       * 开启自动盘点模式
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @param freq 自动盘点频率（如5表示每500ms读取一次）
       * @return 0-成功，<0-错误码
       */
  public int m112EnableAutoDetectMode(int srcAddress, int destAddress, int freq) throws android.os.RemoteException;
  /**
       * 停止自动盘点模式
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @return 0-成功，<0-错误码
       */
  public int m112DisableAutoDetectMode(int srcAddress, int destAddress) throws android.os.RemoteException;
  /**
       * 写T5557数据块
       * @param srcAddress 源地址
       * @param destAddress 目标地址
       * @param page 页地址
       * @param block 块地址
       * @param lockFlag 锁定标志，0-不锁定，1-锁定块
       * @param data 块数据(4B)
       * @param pwdFlag 密码标志，0-无密码写，1-有密码写
       * @param pwd 密码(4B)
       * @return 0-成功，<0-错误码
       */
  public int m112WriteT557Block(int srcAddress, int destAddress, int page, int block, int lockFlag, byte[] data, int pwdFlag, byte[] pwd) throws android.os.RemoteException;
}
