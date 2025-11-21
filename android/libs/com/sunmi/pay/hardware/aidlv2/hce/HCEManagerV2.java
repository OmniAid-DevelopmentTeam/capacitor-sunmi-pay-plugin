/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.hce;
// Declare any non-default types here with import statements

public interface HCEManagerV2 extends android.os.IInterface
{
  /** Default implementation for HCEManagerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2
  {
    /**
         * 打开HCE功能
         * @param cardType  卡类型，2-模拟Tag2卡片，4-模拟NFC FORUM T4T卡片，其他-保留，目前不支持
         * @param param  cardType对应的参数，最大长度255字节，可为null
         * @return 0-成功，非0-错误码
         */
    @Override public int hceOpen(int cardType, byte[] param) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 写NDEF数据
         * @param ndefMsg NdefMessage数据，tag4最大长度1024字节，tag2最大长度399字节
         * @return 0-成功，<0-错误码
         */
    @Override public int hceNdefWrite(byte[] ndefMsg) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 读NDEF数据
         * @paramm outData NdefMessage数据
         * @return 错误码：>=0-outData中有效数据长度，<0-错误码
         */
    @Override public int hceNdefRead(byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 关闭HCE模式
         * @return 0-成功，<0-错误码
         */
    @Override public int hceClose() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2.Stub.Proxy(obj);
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
        case TRANSACTION_hceOpen:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.hceOpen(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hceNdefWrite:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.hceNdefWrite(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hceNdefRead:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.hceNdefRead(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_hceClose:
        {
          data.enforceInterface(descriptor);
          int _result = this.hceClose();
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2
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
           * 打开HCE功能
           * @param cardType  卡类型，2-模拟Tag2卡片，4-模拟NFC FORUM T4T卡片，其他-保留，目前不支持
           * @param param  cardType对应的参数，最大长度255字节，可为null
           * @return 0-成功，非0-错误码
           */
      @Override public int hceOpen(int cardType, byte[] param) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(param);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hceOpen, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hceOpen(cardType, param);
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
           * 写NDEF数据
           * @param ndefMsg NdefMessage数据，tag4最大长度1024字节，tag2最大长度399字节
           * @return 0-成功，<0-错误码
           */
      @Override public int hceNdefWrite(byte[] ndefMsg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ndefMsg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hceNdefWrite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hceNdefWrite(ndefMsg);
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
           * 读NDEF数据
           * @paramm outData NdefMessage数据
           * @return 错误码：>=0-outData中有效数据长度，<0-错误码
           */
      @Override public int hceNdefRead(byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hceNdefRead, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hceNdefRead(outData);
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
           * 关闭HCE模式
           * @return 0-成功，<0-错误码
           */
      @Override public int hceClose() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hceClose, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hceClose();
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
      public static com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2 sDefaultImpl;
    }
    static final int TRANSACTION_hceOpen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_hceNdefWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_hceNdefRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_hceClose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 打开HCE功能
       * @param cardType  卡类型，2-模拟Tag2卡片，4-模拟NFC FORUM T4T卡片，其他-保留，目前不支持
       * @param param  cardType对应的参数，最大长度255字节，可为null
       * @return 0-成功，非0-错误码
       */
  public int hceOpen(int cardType, byte[] param) throws android.os.RemoteException;
  /**
       * 写NDEF数据
       * @param ndefMsg NdefMessage数据，tag4最大长度1024字节，tag2最大长度399字节
       * @return 0-成功，<0-错误码
       */
  public int hceNdefWrite(byte[] ndefMsg) throws android.os.RemoteException;
  /**
       * 读NDEF数据
       * @paramm outData NdefMessage数据
       * @return 错误码：>=0-outData中有效数据长度，<0-错误码
       */
  public int hceNdefRead(byte[] outData) throws android.os.RemoteException;
  /**
       * 关闭HCE模式
       * @return 0-成功，<0-错误码
       */
  public int hceClose() throws android.os.RemoteException;
}
