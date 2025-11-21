/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.etc;
// Declare any non-default types here with import statements

public interface ETCOptV2 extends android.os.IInterface
{
  /** Default implementation for ETCOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
  {
    /**
          * I2C数据交互
          * @param addr I2C地址
          * @param send 发送的数据，TLV格式
          * @param expOutLen 期望输出数据的长度
          * @param timeout 超时时间，单位:ms
          * @param recv 接收缓存区
          * @return >=0-recv中有效数据的长度，<0-错误码
          */
    @Override public int i2cDataExchange(int addr, byte[] send, int expOutLen, int timeout, byte[] recv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 搜索ETC设备
          * @param maxNum  最大etc设备数量
          * @param listener 搜索回调
          * @param timeout  超时时间，单位:ms
          */
    @Override public void search(int maxNum, com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2 listener, int timeout) throws android.os.RemoteException
    {
    }
    /**
          * 取消搜索
          */
    @Override public void cancelSearch() throws android.os.RemoteException
    {
    }
    /**
          * 设置搜索参数
          * @param bundle 配置搜索参数，包含key：
          * channel:通讯信道（类型：int），0-5.79G，1-5.80G，默认是5.79G
          * transPower:模块发射功率（类型：int），0~3，值越大功率越大，默认0
          * fragTimeout:帧接收超时时间（无命令交互后，ETC模块进入休眠时间）（类型：int），单位：s
          * buzzer:搜索成功时OBU模块是否提示蜂鸣器（类型：int），0-不提示，1-提示（默认）
          */
    @Override public int setSearchParam(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * （ETC扣费）搜索OBU
          * @param unixTime UnixTime(4B)
          * @param obuId OBUId(Hex，4B)，可传null
          * @param timeout 超时时间，单位:ms
          * @param listener 搜索回调
          * @return 0-成功，<0-错误码
          */
    @Override public void searchTradeOBU(int unixTime, java.lang.String obuId, int timeout, com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 listener) throws android.os.RemoteException
    {
    }
    /**
          * （ETC扣费）获取车辆信息密文
          *
          * @param expectLen      期望获取到密文数据长度（1B，密文长度固定79字节）
          * @param random         云端产生的随机数（Hex，8B，若无，则传8字节 0）
          * @param macKeyVersion  Mac密钥版本（1B，默认传0）
          * @param encryptVersion 加密版本（1B，默认传0）
          * @param bundle        出参，车辆信息密文，包含key：
          * allRet：String，车辆信息密文(Hex)
          * @return 0-成功，<0-错误码
          */
    @Override public int getTradeVehicleCipherInfo(int expectLen, java.lang.String random, int macKeyVersion, int encryptVersion, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * （ETC扣费）获取卡片消费记录
          *
          * @param bundle 出参，卡片消费记录，包含key：
          * cardType：int，卡片类型（1B），00-储值卡，01-记账卡，02-非法卡片
          * balance：int，卡片余额（4B），单位：分（0002文件）
          * 0019File：String，0019文件（Hex，43B，交易记录文件）
          * allRet：所有返回数据(Hex，48B)
          * @return 0-成功，<0-错误码
          */
    @Override public int getTradeRecord(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * （ETC扣费）消费初始化
          *
          * @param keyIndex   密钥索引（1B，默认传01）
          * @param amount     消费金额（4B，单位分）
          * @param terminalNo 终端机编号（Hex，6B，PSAM卡序列号）
          * @param bundle     出参，消费初始化应答数据，包含key：
          * balance：String，电子存折或电子钱包旧余额（Hex，4B）
          * offlineTradeNo：String，电子存折或电子钱包脱机交易序号（Hex，2B）
          * overdrawLimit：String，透支限额（Hex，3B）
          * keyVersion：String，密钥版本号（Hex，1B）
          * algorithmId：String，算法标志（Hex，1B）
          * pseudorandomNum：String，伪随机数（Hex，4B）
          * allRet：String，所有返回数据(Hex，15B)
          * @return 0-成功，<0-错误码
          */
    @Override public int initTrade(int keyIndex, int amount, java.lang.String terminalNo, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * （ETC扣费）复合消费
          *
          * @param cacheData 缓存数据（43B，0019文件内容）
          * @param tradeNo   终端脱机交易序列号（Hex，4B）
          * @param tradeDate 交易日期（Hex，4B，格式yyyyMMdd）
          * @param tradeTime 交易时间（Hex，3B，格式 HHmmss）
          * @param mac       MAC1（Hex，4B）
          * @param bundle   出参，复合消费应答数据，包含key：
          * tac：String，TAC(Hex，4B)
          * mac2：String，Mac2(Hex，4B)
          * allRet：String，所有返回数据(Hex，8B)
          * @return 0-成功，<0-错误码
          */
    @Override public int complexTrade(byte[] cacheData, java.lang.String tradeNo, java.lang.String tradeDate, java.lang.String tradeTime, java.lang.String mac, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * （ETC扣费）结束消费，释放资源
          *
          * @param tradeResult 消费结果，0-交易正常，1-操作失败，2-联系运营商，3-无卡
          * @return 0-成功，<-错误码
          */
    @Override public int finishTrade(int tradeResult) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * （ETC扣费）心跳包，防止OBU休眠
          *
          * @return 0-成功，<-错误码
          */
    @Override public int tradeHeartbeat() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_i2cDataExchange:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.i2cDataExchange(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_search:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2.Stub.asInterface(data.readStrongBinder());
          int _arg2;
          _arg2 = data.readInt();
          this.search(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_cancelSearch:
        {
          data.enforceInterface(descriptor);
          this.cancelSearch();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setSearchParam:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setSearchParam(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_searchTradeOBU:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 _arg3;
          _arg3 = com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2.Stub.asInterface(data.readStrongBinder());
          this.searchTradeOBU(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getTradeVehicleCipherInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          android.os.Bundle _arg4;
          _arg4 = new android.os.Bundle();
          int _result = this.getTradeVehicleCipherInfo(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg4!=null)) {
            reply.writeInt(1);
            _arg4.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getTradeRecord:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.getTradeRecord(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_initTrade:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          android.os.Bundle _arg3;
          _arg3 = new android.os.Bundle();
          int _result = this.initTrade(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg3!=null)) {
            reply.writeInt(1);
            _arg3.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_complexTrade:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          java.lang.String _arg4;
          _arg4 = data.readString();
          android.os.Bundle _arg5;
          _arg5 = new android.os.Bundle();
          int _result = this.complexTrade(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg5!=null)) {
            reply.writeInt(1);
            _arg5.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_finishTrade:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.finishTrade(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_tradeHeartbeat:
        {
          data.enforceInterface(descriptor);
          int _result = this.tradeHeartbeat();
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2
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
            * I2C数据交互
            * @param addr I2C地址
            * @param send 发送的数据，TLV格式
            * @param expOutLen 期望输出数据的长度
            * @param timeout 超时时间，单位:ms
            * @param recv 接收缓存区
            * @return >=0-recv中有效数据的长度，<0-错误码
            */
      @Override public int i2cDataExchange(int addr, byte[] send, int expOutLen, int timeout, byte[] recv) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(addr);
          _data.writeByteArray(send);
          _data.writeInt(expOutLen);
          _data.writeInt(timeout);
          if ((recv==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(recv.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_i2cDataExchange, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().i2cDataExchange(addr, send, expOutLen, timeout, recv);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(recv);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 搜索ETC设备
            * @param maxNum  最大etc设备数量
            * @param listener 搜索回调
            * @param timeout  超时时间，单位:ms
            */
      @Override public void search(int maxNum, com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2 listener, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(maxNum);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_search, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().search(maxNum, listener, timeout);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
            * 取消搜索
            */
      @Override public void cancelSearch() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelSearch, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().cancelSearch();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
            * 设置搜索参数
            * @param bundle 配置搜索参数，包含key：
            * channel:通讯信道（类型：int），0-5.79G，1-5.80G，默认是5.79G
            * transPower:模块发射功率（类型：int），0~3，值越大功率越大，默认0
            * fragTimeout:帧接收超时时间（无命令交互后，ETC模块进入休眠时间）（类型：int），单位：s
            * buzzer:搜索成功时OBU模块是否提示蜂鸣器（类型：int），0-不提示，1-提示（默认）
            */
      @Override public int setSearchParam(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSearchParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setSearchParam(bundle);
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
            * （ETC扣费）搜索OBU
            * @param unixTime UnixTime(4B)
            * @param obuId OBUId(Hex，4B)，可传null
            * @param timeout 超时时间，单位:ms
            * @param listener 搜索回调
            * @return 0-成功，<0-错误码
            */
      @Override public void searchTradeOBU(int unixTime, java.lang.String obuId, int timeout, com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(unixTime);
          _data.writeString(obuId);
          _data.writeInt(timeout);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_searchTradeOBU, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().searchTradeOBU(unixTime, obuId, timeout, listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
            * （ETC扣费）获取车辆信息密文
            *
            * @param expectLen      期望获取到密文数据长度（1B，密文长度固定79字节）
            * @param random         云端产生的随机数（Hex，8B，若无，则传8字节 0）
            * @param macKeyVersion  Mac密钥版本（1B，默认传0）
            * @param encryptVersion 加密版本（1B，默认传0）
            * @param bundle        出参，车辆信息密文，包含key：
            * allRet：String，车辆信息密文(Hex)
            * @return 0-成功，<0-错误码
            */
      @Override public int getTradeVehicleCipherInfo(int expectLen, java.lang.String random, int macKeyVersion, int encryptVersion, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(expectLen);
          _data.writeString(random);
          _data.writeInt(macKeyVersion);
          _data.writeInt(encryptVersion);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTradeVehicleCipherInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTradeVehicleCipherInfo(expectLen, random, macKeyVersion, encryptVersion, bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            bundle.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * （ETC扣费）获取卡片消费记录
            *
            * @param bundle 出参，卡片消费记录，包含key：
            * cardType：int，卡片类型（1B），00-储值卡，01-记账卡，02-非法卡片
            * balance：int，卡片余额（4B），单位：分（0002文件）
            * 0019File：String，0019文件（Hex，43B，交易记录文件）
            * allRet：所有返回数据(Hex，48B)
            * @return 0-成功，<0-错误码
            */
      @Override public int getTradeRecord(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTradeRecord, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTradeRecord(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            bundle.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * （ETC扣费）消费初始化
            *
            * @param keyIndex   密钥索引（1B，默认传01）
            * @param amount     消费金额（4B，单位分）
            * @param terminalNo 终端机编号（Hex，6B，PSAM卡序列号）
            * @param bundle     出参，消费初始化应答数据，包含key：
            * balance：String，电子存折或电子钱包旧余额（Hex，4B）
            * offlineTradeNo：String，电子存折或电子钱包脱机交易序号（Hex，2B）
            * overdrawLimit：String，透支限额（Hex，3B）
            * keyVersion：String，密钥版本号（Hex，1B）
            * algorithmId：String，算法标志（Hex，1B）
            * pseudorandomNum：String，伪随机数（Hex，4B）
            * allRet：String，所有返回数据(Hex，15B)
            * @return 0-成功，<0-错误码
            */
      @Override public int initTrade(int keyIndex, int amount, java.lang.String terminalNo, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(amount);
          _data.writeString(terminalNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initTrade, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initTrade(keyIndex, amount, terminalNo, bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            bundle.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * （ETC扣费）复合消费
            *
            * @param cacheData 缓存数据（43B，0019文件内容）
            * @param tradeNo   终端脱机交易序列号（Hex，4B）
            * @param tradeDate 交易日期（Hex，4B，格式yyyyMMdd）
            * @param tradeTime 交易时间（Hex，3B，格式 HHmmss）
            * @param mac       MAC1（Hex，4B）
            * @param bundle   出参，复合消费应答数据，包含key：
            * tac：String，TAC(Hex，4B)
            * mac2：String，Mac2(Hex，4B)
            * allRet：String，所有返回数据(Hex，8B)
            * @return 0-成功，<0-错误码
            */
      @Override public int complexTrade(byte[] cacheData, java.lang.String tradeNo, java.lang.String tradeDate, java.lang.String tradeTime, java.lang.String mac, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(cacheData);
          _data.writeString(tradeNo);
          _data.writeString(tradeDate);
          _data.writeString(tradeTime);
          _data.writeString(mac);
          boolean _status = mRemote.transact(Stub.TRANSACTION_complexTrade, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().complexTrade(cacheData, tradeNo, tradeDate, tradeTime, mac, bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            bundle.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * （ETC扣费）结束消费，释放资源
            *
            * @param tradeResult 消费结果，0-交易正常，1-操作失败，2-联系运营商，3-无卡
            * @return 0-成功，<-错误码
            */
      @Override public int finishTrade(int tradeResult) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(tradeResult);
          boolean _status = mRemote.transact(Stub.TRANSACTION_finishTrade, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().finishTrade(tradeResult);
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
            * （ETC扣费）心跳包，防止OBU休眠
            *
            * @return 0-成功，<-错误码
            */
      @Override public int tradeHeartbeat() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_tradeHeartbeat, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().tradeHeartbeat();
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
      public static com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_i2cDataExchange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_search = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setSearchParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_searchTradeOBU = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getTradeVehicleCipherInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getTradeRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_initTrade = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_complexTrade = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_finishTrade = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_tradeHeartbeat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
        * I2C数据交互
        * @param addr I2C地址
        * @param send 发送的数据，TLV格式
        * @param expOutLen 期望输出数据的长度
        * @param timeout 超时时间，单位:ms
        * @param recv 接收缓存区
        * @return >=0-recv中有效数据的长度，<0-错误码
        */
  public int i2cDataExchange(int addr, byte[] send, int expOutLen, int timeout, byte[] recv) throws android.os.RemoteException;
  /**
        * 搜索ETC设备
        * @param maxNum  最大etc设备数量
        * @param listener 搜索回调
        * @param timeout  超时时间，单位:ms
        */
  public void search(int maxNum, com.sunmi.pay.hardware.aidlv2.etc.ETCSearchListenerV2 listener, int timeout) throws android.os.RemoteException;
  /**
        * 取消搜索
        */
  public void cancelSearch() throws android.os.RemoteException;
  /**
        * 设置搜索参数
        * @param bundle 配置搜索参数，包含key：
        * channel:通讯信道（类型：int），0-5.79G，1-5.80G，默认是5.79G
        * transPower:模块发射功率（类型：int），0~3，值越大功率越大，默认0
        * fragTimeout:帧接收超时时间（无命令交互后，ETC模块进入休眠时间）（类型：int），单位：s
        * buzzer:搜索成功时OBU模块是否提示蜂鸣器（类型：int），0-不提示，1-提示（默认）
        */
  public int setSearchParam(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * （ETC扣费）搜索OBU
        * @param unixTime UnixTime(4B)
        * @param obuId OBUId(Hex，4B)，可传null
        * @param timeout 超时时间，单位:ms
        * @param listener 搜索回调
        * @return 0-成功，<0-错误码
        */
  public void searchTradeOBU(int unixTime, java.lang.String obuId, int timeout, com.sunmi.pay.hardware.aidlv2.etc.ETCSearchTradeOBUListenerV2 listener) throws android.os.RemoteException;
  /**
        * （ETC扣费）获取车辆信息密文
        *
        * @param expectLen      期望获取到密文数据长度（1B，密文长度固定79字节）
        * @param random         云端产生的随机数（Hex，8B，若无，则传8字节 0）
        * @param macKeyVersion  Mac密钥版本（1B，默认传0）
        * @param encryptVersion 加密版本（1B，默认传0）
        * @param bundle        出参，车辆信息密文，包含key：
        * allRet：String，车辆信息密文(Hex)
        * @return 0-成功，<0-错误码
        */
  public int getTradeVehicleCipherInfo(int expectLen, java.lang.String random, int macKeyVersion, int encryptVersion, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * （ETC扣费）获取卡片消费记录
        *
        * @param bundle 出参，卡片消费记录，包含key：
        * cardType：int，卡片类型（1B），00-储值卡，01-记账卡，02-非法卡片
        * balance：int，卡片余额（4B），单位：分（0002文件）
        * 0019File：String，0019文件（Hex，43B，交易记录文件）
        * allRet：所有返回数据(Hex，48B)
        * @return 0-成功，<0-错误码
        */
  public int getTradeRecord(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * （ETC扣费）消费初始化
        *
        * @param keyIndex   密钥索引（1B，默认传01）
        * @param amount     消费金额（4B，单位分）
        * @param terminalNo 终端机编号（Hex，6B，PSAM卡序列号）
        * @param bundle     出参，消费初始化应答数据，包含key：
        * balance：String，电子存折或电子钱包旧余额（Hex，4B）
        * offlineTradeNo：String，电子存折或电子钱包脱机交易序号（Hex，2B）
        * overdrawLimit：String，透支限额（Hex，3B）
        * keyVersion：String，密钥版本号（Hex，1B）
        * algorithmId：String，算法标志（Hex，1B）
        * pseudorandomNum：String，伪随机数（Hex，4B）
        * allRet：String，所有返回数据(Hex，15B)
        * @return 0-成功，<0-错误码
        */
  public int initTrade(int keyIndex, int amount, java.lang.String terminalNo, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * （ETC扣费）复合消费
        *
        * @param cacheData 缓存数据（43B，0019文件内容）
        * @param tradeNo   终端脱机交易序列号（Hex，4B）
        * @param tradeDate 交易日期（Hex，4B，格式yyyyMMdd）
        * @param tradeTime 交易时间（Hex，3B，格式 HHmmss）
        * @param mac       MAC1（Hex，4B）
        * @param bundle   出参，复合消费应答数据，包含key：
        * tac：String，TAC(Hex，4B)
        * mac2：String，Mac2(Hex，4B)
        * allRet：String，所有返回数据(Hex，8B)
        * @return 0-成功，<0-错误码
        */
  public int complexTrade(byte[] cacheData, java.lang.String tradeNo, java.lang.String tradeDate, java.lang.String tradeTime, java.lang.String mac, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * （ETC扣费）结束消费，释放资源
        *
        * @param tradeResult 消费结果，0-交易正常，1-操作失败，2-联系运营商，3-无卡
        * @return 0-成功，<-错误码
        */
  public int finishTrade(int tradeResult) throws android.os.RemoteException;
  /**
        * （ETC扣费）心跳包，防止OBU休眠
        *
        * @return 0-成功，<-错误码
        */
  public int tradeHeartbeat() throws android.os.RemoteException;
}
