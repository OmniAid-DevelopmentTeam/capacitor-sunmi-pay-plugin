/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.etc;
// Declare any non-default types here with import statements

public interface ETCSearchTradeOBUListenerV2 extends android.os.IInterface
{
  /** Default implementation for ETCSearchTradeOBUListenerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
  {
    /**
         * 搜索成功
         * @param bundle 出参，搜索到的obu信息，包含key：
         * deviceNo：String，设备编号（Hex，4B）
         * deviceStatus：int，设备状态
         * sysInfoIssuerId：String，系统信息-发行方标志(Hex，8B)
         * sysInfoContractNo：String，系统信息-合同序列号(Hex，8B)
         * 0015File：String，0015文件内容(Hex，43B)
         * 0015CardIssuerId：String，0015文件-发卡方标志(Hex，8B)
         * 0015CardTypeId：String，0015文件-卡类型标志(Hex,1B)
         * 0015CardVersion：String，0015文件-卡片版本号(Hex,1B)
         * 0015CardNetId：String，0015文件-卡片网络标志(Hex，2B)
         * 0015CardInternalNo：String，0015文件-卡片内部编号(Hex，8B)
         * 0015StartDate：String，0015文件-启用时间(Hex，4B，格式YYYYMMDD)
         * 0015EndDate：String，0015文件-到期时间(Hex，4B，格式YYYYMMDD)
         * 0015PlateNo：String，0015文件-车牌号码(Hex，12)
         * 0015UserType：String，0015文件-用户类型(Hex，1B)
         * 0015PlateColor：String，0015文件-车牌颜色(Hex，1B)
         * 0015VehicleType：String，0015文件-车型(Hex，1B)
         */
    @Override public void onSuccess(android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    //OBU信息
    /**
         * 搜索出错
         * @param code 错误码
         */
    @Override public void onError(int code) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2.Stub.Proxy(obj);
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
        case TRANSACTION_onSuccess:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onSuccess(_arg0);
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2
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
           * 搜索成功
           * @param bundle 出参，搜索到的obu信息，包含key：
           * deviceNo：String，设备编号（Hex，4B）
           * deviceStatus：int，设备状态
           * sysInfoIssuerId：String，系统信息-发行方标志(Hex，8B)
           * sysInfoContractNo：String，系统信息-合同序列号(Hex，8B)
           * 0015File：String，0015文件内容(Hex，43B)
           * 0015CardIssuerId：String，0015文件-发卡方标志(Hex，8B)
           * 0015CardTypeId：String，0015文件-卡类型标志(Hex,1B)
           * 0015CardVersion：String，0015文件-卡片版本号(Hex,1B)
           * 0015CardNetId：String，0015文件-卡片网络标志(Hex，2B)
           * 0015CardInternalNo：String，0015文件-卡片内部编号(Hex，8B)
           * 0015StartDate：String，0015文件-启用时间(Hex，4B，格式YYYYMMDD)
           * 0015EndDate：String，0015文件-到期时间(Hex，4B，格式YYYYMMDD)
           * 0015PlateNo：String，0015文件-车牌号码(Hex，12)
           * 0015UserType：String，0015文件-用户类型(Hex，1B)
           * 0015PlateColor：String，0015文件-车牌颜色(Hex，1B)
           * 0015VehicleType：String，0015文件-车型(Hex，1B)
           */
      @Override public void onSuccess(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onSuccess(bundle);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      //OBU信息
      /**
           * 搜索出错
           * @param code 错误码
           */
      @Override public void onError(int code) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(code);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onError(code);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 sDefaultImpl;
    }
    static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 搜索成功
       * @param bundle 出参，搜索到的obu信息，包含key：
       * deviceNo：String，设备编号（Hex，4B）
       * deviceStatus：int，设备状态
       * sysInfoIssuerId：String，系统信息-发行方标志(Hex，8B)
       * sysInfoContractNo：String，系统信息-合同序列号(Hex，8B)
       * 0015File：String，0015文件内容(Hex，43B)
       * 0015CardIssuerId：String，0015文件-发卡方标志(Hex，8B)
       * 0015CardTypeId：String，0015文件-卡类型标志(Hex,1B)
       * 0015CardVersion：String，0015文件-卡片版本号(Hex,1B)
       * 0015CardNetId：String，0015文件-卡片网络标志(Hex，2B)
       * 0015CardInternalNo：String，0015文件-卡片内部编号(Hex，8B)
       * 0015StartDate：String，0015文件-启用时间(Hex，4B，格式YYYYMMDD)
       * 0015EndDate：String，0015文件-到期时间(Hex，4B，格式YYYYMMDD)
       * 0015PlateNo：String，0015文件-车牌号码(Hex，12)
       * 0015UserType：String，0015文件-用户类型(Hex，1B)
       * 0015PlateColor：String，0015文件-车牌颜色(Hex，1B)
       * 0015VehicleType：String，0015文件-车型(Hex，1B)
       */
  public void onSuccess(android.os.Bundle bundle) throws android.os.RemoteException;
  //OBU信息
  /**
       * 搜索出错
       * @param code 错误码
       */
  public void onError(int code) throws android.os.RemoteException;
}
