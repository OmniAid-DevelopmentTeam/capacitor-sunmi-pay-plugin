/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.emv;
// Declare any non-default types here with import statements

public interface EMVDataListenerV2 extends android.os.IInterface
{
  /** Default implementation for EMVDataListenerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2
  {
    /**
         * 请求DET数据
         * @param data dek数据
         */
    @Override public void onRequestDETData(byte[] data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2.Stub.Proxy(obj);
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
        case TRANSACTION_onRequestDETData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.onRequestDETData(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2
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
           * 请求DET数据
           * @param data dek数据
           */
      @Override public void onRequestDETData(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestDETData, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRequestDETData(data);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 sDefaultImpl;
    }
    static final int TRANSACTION_onRequestDETData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 请求DET数据
       * @param data dek数据
       */
  public void onRequestDETData(byte[] data) throws android.os.RemoteException;
}
