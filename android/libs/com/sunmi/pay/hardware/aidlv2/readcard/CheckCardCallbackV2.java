/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.readcard;
public interface CheckCardCallbackV2 extends android.os.IInterface
{
  /** Default implementation for CheckCardCallbackV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
  {
    /**
         * 检到磁条卡
         * @param info 返回数据，包含key:
         * cardType:卡类型(int)
         * TRACK1:一磁数据(String)
         * TRACK2:二磁数据(String)
         * TRACK3:三磁数据(String)
         * track1ErrorCode:一磁错误码(int)
         * track2ErrorCode:二磁错误码(int)
         * track3ErrorCode:三磁错误码(int)
         */
    @Override public void findMagCard(android.os.Bundle info) throws android.os.RemoteException
    {
    }
    /** 检到IC卡 */
    @Override public void findICCard(java.lang.String atr) throws android.os.RemoteException
    {
    }
    /** 检到非接卡 */
    @Override public void findRFCard(java.lang.String uuid) throws android.os.RemoteException
    {
    }
    /** 检卡错误回调 */
    @Override public void onError(int code, java.lang.String message) throws android.os.RemoteException
    {
    }
    /**
         * 检到IC卡
         * @param info 返回数据，包含key:
         * cardType:卡片类型(int)
         * atr:卡片的ATR(String)
         */
    @Override public void findICCardEx(android.os.Bundle info) throws android.os.RemoteException
    {
    }
    /**
         * 检到非接卡
         * @param info 返回数据，包含key:
         * cardType:卡片类型(int)
         * uuid:卡片的uuid(String)
         * ats:卡片的ats(String)
         * sak:卡片的sak(int)
         * cardCategory:卡片类别(int)，值为'A'或'B'
         * atqa:卡片的ATQA(byte[])
         */
    @Override public void findRFCardEx(android.os.Bundle info) throws android.os.RemoteException
    {
    }
    /**
         * 检卡出错
         * @param info 返回数据，包含key:
         * cardType:卡片类型(int)
         * code:错误码(int)
         * message:错误信息(String)
         */
    @Override public void onErrorEx(android.os.Bundle info) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2.Stub.Proxy(obj);
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
        case TRANSACTION_findICCardEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.findICCardEx(_arg0);
          return true;
        }
        case TRANSACTION_findRFCardEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.findRFCardEx(_arg0);
          return true;
        }
        case TRANSACTION_onErrorEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onErrorEx(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2
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
           * 检到磁条卡
           * @param info 返回数据，包含key:
           * cardType:卡类型(int)
           * TRACK1:一磁数据(String)
           * TRACK2:二磁数据(String)
           * TRACK3:三磁数据(String)
           * track1ErrorCode:一磁错误码(int)
           * track2ErrorCode:二磁错误码(int)
           * track3ErrorCode:三磁错误码(int)
           */
      @Override public void findMagCard(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info!=null)) {
            _data.writeInt(1);
            info.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_findMagCard, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findMagCard(info);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /** 检到IC卡 */
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
      /** 检到非接卡 */
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
      /** 检卡错误回调 */
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
           * 检到IC卡
           * @param info 返回数据，包含key:
           * cardType:卡片类型(int)
           * atr:卡片的ATR(String)
           */
      @Override public void findICCardEx(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info!=null)) {
            _data.writeInt(1);
            info.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_findICCardEx, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findICCardEx(info);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 检到非接卡
           * @param info 返回数据，包含key:
           * cardType:卡片类型(int)
           * uuid:卡片的uuid(String)
           * ats:卡片的ats(String)
           * sak:卡片的sak(int)
           * cardCategory:卡片类别(int)，值为'A'或'B'
           * atqa:卡片的ATQA(byte[])
           */
      @Override public void findRFCardEx(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info!=null)) {
            _data.writeInt(1);
            info.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_findRFCardEx, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().findRFCardEx(info);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 检卡出错
           * @param info 返回数据，包含key:
           * cardType:卡片类型(int)
           * code:错误码(int)
           * message:错误信息(String)
           */
      @Override public void onErrorEx(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info!=null)) {
            _data.writeInt(1);
            info.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onErrorEx, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onErrorEx(info);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 sDefaultImpl;
    }
    static final int TRANSACTION_findMagCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_findICCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_findRFCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_findICCardEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_findRFCardEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onErrorEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 检到磁条卡
       * @param info 返回数据，包含key:
       * cardType:卡类型(int)
       * TRACK1:一磁数据(String)
       * TRACK2:二磁数据(String)
       * TRACK3:三磁数据(String)
       * track1ErrorCode:一磁错误码(int)
       * track2ErrorCode:二磁错误码(int)
       * track3ErrorCode:三磁错误码(int)
       */
  public void findMagCard(android.os.Bundle info) throws android.os.RemoteException;
  /** 检到IC卡 */
  public void findICCard(java.lang.String atr) throws android.os.RemoteException;
  /** 检到非接卡 */
  public void findRFCard(java.lang.String uuid) throws android.os.RemoteException;
  /** 检卡错误回调 */
  public void onError(int code, java.lang.String message) throws android.os.RemoteException;
  /**
       * 检到IC卡
       * @param info 返回数据，包含key:
       * cardType:卡片类型(int)
       * atr:卡片的ATR(String)
       */
  public void findICCardEx(android.os.Bundle info) throws android.os.RemoteException;
  /**
       * 检到非接卡
       * @param info 返回数据，包含key:
       * cardType:卡片类型(int)
       * uuid:卡片的uuid(String)
       * ats:卡片的ats(String)
       * sak:卡片的sak(int)
       * cardCategory:卡片类别(int)，值为'A'或'B'
       * atqa:卡片的ATQA(byte[])
       */
  public void findRFCardEx(android.os.Bundle info) throws android.os.RemoteException;
  /**
       * 检卡出错
       * @param info 返回数据，包含key:
       * cardType:卡片类型(int)
       * code:错误码(int)
       * message:错误信息(String)
       */
  public void onErrorEx(android.os.Bundle info) throws android.os.RemoteException;
}
