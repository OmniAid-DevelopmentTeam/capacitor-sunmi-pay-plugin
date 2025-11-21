/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.readcard;
/** @deprecated */
public interface CheckCardCallback extends android.os.IInterface
{
  /** Default implementation for CheckCardCallback. */
  public static class Default implements com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
  {
    /**
         * 开始检卡回调
         * @deprecated
         */
    @Override public void onStartCheckCard() throws android.os.RemoteException
    {
    }
    /**
         * 检到磁条卡
         * @deprecated
         */
    @Override public void findMagCard(android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    /**
         * 检到IC卡
         * @deprecated
         */
    @Override public void findICCard(java.lang.String atr) throws android.os.RemoteException
    {
    }
    /**
         * 检到非接卡
         * @deprecated
         */
    @Override public void findRFCard(java.lang.String uuid) throws android.os.RemoteException
    {
    }
    /**
         * 检卡错误回调
         * @deprecated
         */
    @Override public void onError(int code, java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback))) {
        return ((com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback)iin);
      }
      return new com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onStartCheckCard:
        {
          data.enforceInterface(descriptor);
          this.onStartCheckCard();
          return true;
        }
        case TRANSACTION_findMagCard:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.findMagCard(_arg0);
          return true;
        }
        case TRANSACTION_findICCard:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.findICCard(_arg0);
          return true;
        }
        case TRANSACTION_findRFCard:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.findRFCard(_arg0);
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
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback
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
      /**
           * 检到磁条卡
           * @deprecated
           */
      @Override public void findMagCard(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_findMagCard, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findMagCard(bundle);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 检到IC卡
           * @deprecated
           */
      @Override public void findICCard(java.lang.String atr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(atr);
          boolean _status = mRemote.transact(Stub.TRANSACTION_findICCard, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findICCard(atr);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 检到非接卡
           * @deprecated
           */
      @Override public void findRFCard(java.lang.String uuid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uuid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_findRFCard, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findRFCard(uuid);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 检卡错误回调
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
      public static com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback sDefaultImpl;
    }
    static final int TRANSACTION_onStartCheckCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_findMagCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_findICCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_findRFCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback impl) {
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
    public static com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 开始检卡回调
       * @deprecated
       */
  public void onStartCheckCard() throws android.os.RemoteException;
  /**
       * 检到磁条卡
       * @deprecated
       */
  public void findMagCard(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 检到IC卡
       * @deprecated
       */
  public void findICCard(java.lang.String atr) throws android.os.RemoteException;
  /**
       * 检到非接卡
       * @deprecated
       */
  public void findRFCard(java.lang.String uuid) throws android.os.RemoteException;
  /**
       * 检卡错误回调
       * @deprecated
       */
  public void onError(int code, java.lang.String message) throws android.os.RemoteException;
}
