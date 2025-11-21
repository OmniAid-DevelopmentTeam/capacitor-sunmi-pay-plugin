/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.emv;
// Declare any non-default types here with import statements

public interface EMVListenerV2 extends android.os.IInterface
{
  /** Default implementation for EMVListenerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
  {
    /**
         * 请求多应用选择
         * @param candList 应用列表
         * @param isFirstSelect 是否是第一次选择
         */
    @Override public void onWaitAppSelect(java.util.List<com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2> candList, boolean isFirstSelect) throws android.os.RemoteException
    {
    }
    /**
         * 应用最终选择
         * @param tag9F06Value tag9F06的值
         */
    @Override public void onAppFinalSelect(java.lang.String tag9F06Value) throws android.os.RemoteException
    {
    }
    /**
         * 请求确认卡号
         * @param cardNo 卡号
         */
    @Override public void onConfirmCardNo(java.lang.String cardNo) throws android.os.RemoteException
    {
    }
    /**
         * 请求输PIN
         * @param pinType PIN类型，0-联机PIN，1-脱机PIN
         * @param remainTimes 脱机PIN的剩余次数。当是联机PIN时，值永远为-1，
         *                    当第一次输PIN时，值也为-1
         */
    @Override public void onRequestShowPinPad(int pinType, int remainTimes) throws android.os.RemoteException
    {
    }
    /**
         * 请求客户端签名
         */
    @Override public void onRequestSignature() throws android.os.RemoteException
    {
    }
    /**
         * 请求确认证件信息
         * @param certType 证件类型
         * @param certInfo 证件信息
         */
    @Override public void onCertVerify(int certType, java.lang.String certInfo) throws android.os.RemoteException
    {
    }
    /**
         * 请求联机和二次授权
         */
    @Override public void onOnlineProc() throws android.os.RemoteException
    {
    }
    /**
         * 卡片数据交互完成
         */
    @Override public void onCardDataExchangeComplete() throws android.os.RemoteException
    {
    }
    /**
         * 交易处理结果
         * @param code EMV交易处理结果返回码,0-成功，1-脱机批准，2-脱机拒绝，3-预留，4-重新拍卡，5-联机批准，6-联机拒绝，其他-错误码
         * @param desc 返回码对应的错误信息
         */
    @Override public void onTransResult(int code, java.lang.String desc) throws android.os.RemoteException
    {
    }
    /**
         * 请求重启EMV流程.
         * 本方法和onTransResult()为互斥方法，即一次完整的emv流程中
         * 两个方法中只有一个会被调用.目前只有PayPass NFC可能会回调本方法
         * @param code EMV交易处理结果返回码
         * @param desc 返回码对应的错误信息
         */
    @Override public void onConfirmationCodeVerified() throws android.os.RemoteException
    {
    }
    /**
         * 请求数据交互
         * @param cardNo 卡号
         */
    @Override public void onRequestDataExchange(java.lang.String cardNo) throws android.os.RemoteException
    {
    }
    /**
         * 请求终端风险管理
         */
    @Override public void onTermRiskManagement() throws android.os.RemoteException
    {
    }
    /**
         * 第一次GAC前调用请求
         */
    @Override public void onPreFirstGenAC() throws android.os.RemoteException
    {
    }
    /**
         * 请求DataStorage处理
         * @param containerID 容器ID
         * @param containerContent 容器内容
         */
    @Override public void onDataStorageProc(java.lang.String[] containerID, java.lang.String[] containerContent) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2.Stub.Proxy(obj);
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
        case TRANSACTION_onWaitAppSelect:
        {
          data.enforceInterface(descriptor);
          java.util.List<com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2> _arg0;
          _arg0 = data.createTypedArrayList(com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2.CREATOR);
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.onWaitAppSelect(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onAppFinalSelect:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onAppFinalSelect(_arg0);
          return true;
        }
        case TRANSACTION_onConfirmCardNo:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onConfirmCardNo(_arg0);
          return true;
        }
        case TRANSACTION_onRequestShowPinPad:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.onRequestShowPinPad(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onRequestSignature:
        {
          data.enforceInterface(descriptor);
          this.onRequestSignature();
          return true;
        }
        case TRANSACTION_onCertVerify:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onCertVerify(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onOnlineProc:
        {
          data.enforceInterface(descriptor);
          this.onOnlineProc();
          return true;
        }
        case TRANSACTION_onCardDataExchangeComplete:
        {
          data.enforceInterface(descriptor);
          this.onCardDataExchangeComplete();
          return true;
        }
        case TRANSACTION_onTransResult:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onTransResult(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onConfirmationCodeVerified:
        {
          data.enforceInterface(descriptor);
          this.onConfirmationCodeVerified();
          return true;
        }
        case TRANSACTION_onRequestDataExchange:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onRequestDataExchange(_arg0);
          return true;
        }
        case TRANSACTION_onTermRiskManagement:
        {
          data.enforceInterface(descriptor);
          this.onTermRiskManagement();
          return true;
        }
        case TRANSACTION_onPreFirstGenAC:
        {
          data.enforceInterface(descriptor);
          this.onPreFirstGenAC();
          return true;
        }
        case TRANSACTION_onDataStorageProc:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          this.onDataStorageProc(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2
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
           * 请求多应用选择
           * @param candList 应用列表
           * @param isFirstSelect 是否是第一次选择
           */
      @Override public void onWaitAppSelect(java.util.List<com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2> candList, boolean isFirstSelect) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(candList);
          _data.writeInt(((isFirstSelect)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onWaitAppSelect, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onWaitAppSelect(candList, isFirstSelect);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 应用最终选择
           * @param tag9F06Value tag9F06的值
           */
      @Override public void onAppFinalSelect(java.lang.String tag9F06Value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tag9F06Value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAppFinalSelect, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onAppFinalSelect(tag9F06Value);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求确认卡号
           * @param cardNo 卡号
           */
      @Override public void onConfirmCardNo(java.lang.String cardNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(cardNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConfirmCardNo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onConfirmCardNo(cardNo);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求输PIN
           * @param pinType PIN类型，0-联机PIN，1-脱机PIN
           * @param remainTimes 脱机PIN的剩余次数。当是联机PIN时，值永远为-1，
           *                    当第一次输PIN时，值也为-1
           */
      @Override public void onRequestShowPinPad(int pinType, int remainTimes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pinType);
          _data.writeInt(remainTimes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestShowPinPad, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRequestShowPinPad(pinType, remainTimes);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求客户端签名
           */
      @Override public void onRequestSignature() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestSignature, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRequestSignature();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求确认证件信息
           * @param certType 证件类型
           * @param certInfo 证件信息
           */
      @Override public void onCertVerify(int certType, java.lang.String certInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certType);
          _data.writeString(certInfo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCertVerify, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCertVerify(certType, certInfo);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求联机和二次授权
           */
      @Override public void onOnlineProc() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onOnlineProc, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onOnlineProc();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 卡片数据交互完成
           */
      @Override public void onCardDataExchangeComplete() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCardDataExchangeComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCardDataExchangeComplete();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 交易处理结果
           * @param code EMV交易处理结果返回码,0-成功，1-脱机批准，2-脱机拒绝，3-预留，4-重新拍卡，5-联机批准，6-联机拒绝，其他-错误码
           * @param desc 返回码对应的错误信息
           */
      @Override public void onTransResult(int code, java.lang.String desc) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(code);
          _data.writeString(desc);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTransResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTransResult(code, desc);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求重启EMV流程.
           * 本方法和onTransResult()为互斥方法，即一次完整的emv流程中
           * 两个方法中只有一个会被调用.目前只有PayPass NFC可能会回调本方法
           * @param code EMV交易处理结果返回码
           * @param desc 返回码对应的错误信息
           */
      @Override public void onConfirmationCodeVerified() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConfirmationCodeVerified, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onConfirmationCodeVerified();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求数据交互
           * @param cardNo 卡号
           */
      @Override public void onRequestDataExchange(java.lang.String cardNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(cardNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestDataExchange, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRequestDataExchange(cardNo);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求终端风险管理
           */
      @Override public void onTermRiskManagement() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTermRiskManagement, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onTermRiskManagement();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 第一次GAC前调用请求
           */
      @Override public void onPreFirstGenAC() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPreFirstGenAC, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPreFirstGenAC();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 请求DataStorage处理
           * @param containerID 容器ID
           * @param containerContent 容器内容
           */
      @Override public void onDataStorageProc(java.lang.String[] containerID, java.lang.String[] containerContent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(containerID);
          _data.writeStringArray(containerContent);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDataStorageProc, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onDataStorageProc(containerID, containerContent);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 sDefaultImpl;
    }
    static final int TRANSACTION_onWaitAppSelect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onAppFinalSelect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onConfirmCardNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onRequestShowPinPad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onRequestSignature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onCertVerify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onOnlineProc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_onCardDataExchangeComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onTransResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_onConfirmationCodeVerified = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onRequestDataExchange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onTermRiskManagement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_onPreFirstGenAC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_onDataStorageProc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 请求多应用选择
       * @param candList 应用列表
       * @param isFirstSelect 是否是第一次选择
       */
  public void onWaitAppSelect(java.util.List<com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2> candList, boolean isFirstSelect) throws android.os.RemoteException;
  /**
       * 应用最终选择
       * @param tag9F06Value tag9F06的值
       */
  public void onAppFinalSelect(java.lang.String tag9F06Value) throws android.os.RemoteException;
  /**
       * 请求确认卡号
       * @param cardNo 卡号
       */
  public void onConfirmCardNo(java.lang.String cardNo) throws android.os.RemoteException;
  /**
       * 请求输PIN
       * @param pinType PIN类型，0-联机PIN，1-脱机PIN
       * @param remainTimes 脱机PIN的剩余次数。当是联机PIN时，值永远为-1，
       *                    当第一次输PIN时，值也为-1
       */
  public void onRequestShowPinPad(int pinType, int remainTimes) throws android.os.RemoteException;
  /**
       * 请求客户端签名
       */
  public void onRequestSignature() throws android.os.RemoteException;
  /**
       * 请求确认证件信息
       * @param certType 证件类型
       * @param certInfo 证件信息
       */
  public void onCertVerify(int certType, java.lang.String certInfo) throws android.os.RemoteException;
  /**
       * 请求联机和二次授权
       */
  public void onOnlineProc() throws android.os.RemoteException;
  /**
       * 卡片数据交互完成
       */
  public void onCardDataExchangeComplete() throws android.os.RemoteException;
  /**
       * 交易处理结果
       * @param code EMV交易处理结果返回码,0-成功，1-脱机批准，2-脱机拒绝，3-预留，4-重新拍卡，5-联机批准，6-联机拒绝，其他-错误码
       * @param desc 返回码对应的错误信息
       */
  public void onTransResult(int code, java.lang.String desc) throws android.os.RemoteException;
  /**
       * 请求重启EMV流程.
       * 本方法和onTransResult()为互斥方法，即一次完整的emv流程中
       * 两个方法中只有一个会被调用.目前只有PayPass NFC可能会回调本方法
       * @param code EMV交易处理结果返回码
       * @param desc 返回码对应的错误信息
       */
  public void onConfirmationCodeVerified() throws android.os.RemoteException;
  /**
       * 请求数据交互
       * @param cardNo 卡号
       */
  public void onRequestDataExchange(java.lang.String cardNo) throws android.os.RemoteException;
  /**
       * 请求终端风险管理
       */
  public void onTermRiskManagement() throws android.os.RemoteException;
  /**
       * 第一次GAC前调用请求
       */
  public void onPreFirstGenAC() throws android.os.RemoteException;
  /**
       * 请求DataStorage处理
       * @param containerID 容器ID
       * @param containerContent 容器内容
       */
  public void onDataStorageProc(java.lang.String[] containerID, java.lang.String[] containerContent) throws android.os.RemoteException;
}
