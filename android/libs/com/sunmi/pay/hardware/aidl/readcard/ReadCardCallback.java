/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.readcard;
// Declare any non-default types here with import statements
/** @deprecated */
public interface ReadCardCallback extends android.os.IInterface
{
  /** Default implementation for ReadCardCallback. */
  public static class Default implements com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
  {
    /**
         * 检卡成功
         * @param cardInfo  卡片信息
         * @deprecated
         */
    @Override public void onCardDetected(com.sunmi.pay.hardware.aidl.bean.CardInfo cardInfo) throws android.os.RemoteException
    {
    }
    /**
         * 检卡错误回调
         * @param code      错误码
         * @param message   message 错误信息
         * @deprecated
         */
    @Override public void onError(int code, java.lang.String message) throws android.os.RemoteException
    {
    }
    /**
         * 开始检卡回调
         * @deprecated
         */
    @Override public void onStartCheckCard() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback))) {
        return ((com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback)iin);
      }
      return new com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onCardDetected:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.bean.CardInfo _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidl.bean.CardInfo.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onCardDetected(_arg0);
          return true;
        }
        case TRANSACTION_onError:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onError(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onStartCheckCard:
        {
          data.enforceInterface(descriptor);
          this.onStartCheckCard();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback
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
           * 检卡成功
           * @param cardInfo  卡片信息
           * @deprecated
           */
      @Override public void onCardDetected(com.sunmi.pay.hardware.aidl.bean.CardInfo cardInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((cardInfo!=null)) {
            _data.writeInt(1);
            cardInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCardDetected, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCardDetected(cardInfo);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 检卡错误回调
           * @param code      错误码
           * @param message   message 错误信息
           * @deprecated
           */
      @Override public void onError(int code, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(code);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onError(code, message);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 开始检卡回调
           * @deprecated
           */
      @Override public void onStartCheckCard() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onStartCheckCard, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onStartCheckCard();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback sDefaultImpl;
    }
    static final int TRANSACTION_onCardDetected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onStartCheckCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback impl) {
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
    public static com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 检卡成功
       * @param cardInfo  卡片信息
       * @deprecated
       */
  public void onCardDetected(com.sunmi.pay.hardware.aidl.bean.CardInfo cardInfo) throws android.os.RemoteException;
  /**
       * 检卡错误回调
       * @param code      错误码
       * @param message   message 错误信息
       * @deprecated
       */
  public void onError(int code, java.lang.String message) throws android.os.RemoteException;
  /**
       * 开始检卡回调
       * @deprecated
       */
  public void onStartCheckCard() throws android.os.RemoteException;
}
