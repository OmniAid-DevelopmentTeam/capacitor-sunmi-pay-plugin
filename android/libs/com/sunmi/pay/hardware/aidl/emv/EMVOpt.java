/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.emv;
// Declare any non-default types here with import statements
/** @deprecated */
public interface EMVOpt extends android.os.IInterface
{
  /** Default implementation for EMVOpt. */
  public static class Default implements com.sunmi.pay.hardware.aidl.emv.EMVOpt
  {
    /**
         * 修改AID参数
         * @param actType 操作类型，详见 AidlConstants.Emv.AID
         * @param aid 单条AID,16进制字符串
         * @returun 0 为成功，其他为错误
         * @deprecated
         */
    @Override public int updateAID(int actType, java.lang.String aid) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 修改CAPK参数
          * @param actType 操作类型,详见 AidlConstants.Emv.CAPK
          * @param capk 单条capk，16进制字符串
          * @return 0 为成功，其他为错误
          * @deprecated
          */
    @Override public int updateCAPK(int actType, java.lang.String capk) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存AID参数
         * @param 所有的aid
         * @return 0 成功，其他为错误
         * @deprecated
         */
    @Override public int insertAID(java.util.List<java.lang.String> aidList) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存CAPK参数
         * @param 所有的capk
         * @return 0 成功，其他为错误
         * @deprecated
         */
    @Override public int insertCAPK(java.util.List<java.lang.String> capkList) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 同步参数，将数据库中的AID、CAPK、终端参数写入内核
         * 注意：在调用该方法前必须先调用{@link updateAID(int actType, String aid)、@link updateCAPK(int actType, String capk) 、
         * @link setTerminalParm(EmvTermParam emvTermParam)}保存AID、CAPK、终端参数
         * @return 0为成功，其他为错误
         * @deprecated
         */
    @Override public int syncParam() throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 修改终端参数
          * @param emvTermParam  终端参数对应的实体类
          * @return 0 为成功，其他为错误
          * @deprecated
          */
    @Override public int setTerminalParam(com.sunmi.pay.hardware.aidl.bean.EmvTermParam emvTermParam) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 判断CAPK以及AID是否存在
          * @return -1:都不存在，0：都存在，1：AID存在，capk不存在，2：capk存在，AID不存在
          * @deprecated
          */
    @Override public int isExistCapkAndAID() throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 开始交易处理
          * @parame listener EMV回调接口，详见 EMVListner
          * @deprecated
          */
    @Override public void transactProcess(com.sunmi.pay.hardware.aidl.emv.EMVListener listener) throws android.os.RemoteException
    {
    }
    /**
          * 读取内核数据，读取内核55域数据，用于联机上送
          * @parame tags,需要取出的tag列表，例：{“95”,“9F2A”}
          * @parame outData 输出取出的数据（TLV格式）
          * @return 读取到的数据长度，小于0为错误码
          * @deprecated
          */
    @Override public int readKernelData(java.lang.String[] tags, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 导入联机数据，导入后台下发联机数据，包含发卡行脚本处理
          * @param 联机结果 0:联机批准 1： 联机拒绝 2： 联机失败
          * @param tagIn 后台返回联机数据
          * @param tagInLength 连接数据长度
          * @param tagOut 输出脚本执行结果
          * @return 输出的数据长度，小于0为错误码
          * @deprecated
          */
    @Override public int importResponseData(int onlineResult, byte[] tagIn, int tagInLength, byte[] tagOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 读取交易日志，读取卡片交易日志
          * @param logType 日志类型
          * @param infoOut 读取到的日志列表
          * @return 输出的数据长度，小于0为错误码
          * @deprecated
          */
    @Override public int readTransLog(int logType, java.util.List<java.lang.String> infoOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 导入密码输入结果
          * @param pinType PIN类型 0： 联机PIN 1：脱机PIN
          * @param inputResult 输入结果  0:处理成功,1:PIN取消,2:PIN跳过,3:PINPAD故障
          * @deprecated
          */
    @Override public void importPinInputStatus(int pinType, int inputResult) throws android.os.RemoteException
    {
    }
    /**
          * 交易预处理（IC,NFC）
          * @param cardType 卡类型
          * @param transData 交易参数配置对象
          * @return          成功为0,非0为失败
          * @deprecated
          */
    @Override public int TransPreProcess(int icCardType, com.sunmi.pay.hardware.aidl.bean.TransData transData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 设置内核TLV数据(可一次设置多个TLV数据)
          * @param tlvData tlv数据
          * @return 0:成功，其他：错误码
          * @deprecated
          */
    @Override public int setKernelData(byte[] tlvData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 中断交易处理流程
          * @deprecated
          */
    @Override public void abortTransactProcess() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.emv.EMVOpt
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.emv.EMVOpt";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.emv.EMVOpt interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.emv.EMVOpt asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.emv.EMVOpt))) {
        return ((com.sunmi.pay.hardware.aidl.emv.EMVOpt)iin);
      }
      return new com.sunmi.pay.hardware.aidl.emv.EMVOpt.Stub.Proxy(obj);
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
        case TRANSACTION_updateAID:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.updateAID(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_updateCAPK:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.updateCAPK(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_insertAID:
        {
          data.enforceInterface(descriptor);
          java.util.List<java.lang.String> _arg0;
          _arg0 = data.createStringArrayList();
          int _result = this.insertAID(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_insertCAPK:
        {
          data.enforceInterface(descriptor);
          java.util.List<java.lang.String> _arg0;
          _arg0 = data.createStringArrayList();
          int _result = this.insertCAPK(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_syncParam:
        {
          data.enforceInterface(descriptor);
          int _result = this.syncParam();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setTerminalParam:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.bean.EmvTermParam _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidl.bean.EmvTermParam.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setTerminalParam(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_isExistCapkAndAID:
        {
          data.enforceInterface(descriptor);
          int _result = this.isExistCapkAndAID();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_transactProcess:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.emv.EMVListener _arg0;
          _arg0 = com.sunmi.pay.hardware.aidl.emv.EMVListener.Stub.asInterface(data.readStrongBinder());
          this.transactProcess(_arg0);
          return true;
        }
        case TRANSACTION_readKernelData:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.readKernelData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_importResponseData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _result = this.importResponseData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_readTransLog:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _arg1;
          _arg1 = new java.util.ArrayList<java.lang.String>();
          int _result = this.readTransLog(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeStringList(_arg1);
          return true;
        }
        case TRANSACTION_importPinInputStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.importPinInputStatus(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_TransPreProcess:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidl.bean.TransData _arg1;
          if ((0!=data.readInt())) {
            _arg1 = com.sunmi.pay.hardware.aidl.bean.TransData.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _result = this.TransPreProcess(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setKernelData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.setKernelData(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_abortTransactProcess:
        {
          data.enforceInterface(descriptor);
          this.abortTransactProcess();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.emv.EMVOpt
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
           * 修改AID参数
           * @param actType 操作类型，详见 AidlConstants.Emv.AID
           * @param aid 单条AID,16进制字符串
           * @returun 0 为成功，其他为错误
           * @deprecated
           */
      @Override public int updateAID(int actType, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(actType);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAID, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().updateAID(actType, aid);
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
            * 修改CAPK参数
            * @param actType 操作类型,详见 AidlConstants.Emv.CAPK
            * @param capk 单条capk，16进制字符串
            * @return 0 为成功，其他为错误
            * @deprecated
            */
      @Override public int updateCAPK(int actType, java.lang.String capk) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(actType);
          _data.writeString(capk);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateCAPK, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().updateCAPK(actType, capk);
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
           * 保存AID参数
           * @param 所有的aid
           * @return 0 成功，其他为错误
           * @deprecated
           */
      @Override public int insertAID(java.util.List<java.lang.String> aidList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringList(aidList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_insertAID, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().insertAID(aidList);
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
           * 保存CAPK参数
           * @param 所有的capk
           * @return 0 成功，其他为错误
           * @deprecated
           */
      @Override public int insertCAPK(java.util.List<java.lang.String> capkList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringList(capkList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_insertCAPK, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().insertCAPK(capkList);
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
           * 同步参数，将数据库中的AID、CAPK、终端参数写入内核
           * 注意：在调用该方法前必须先调用{@link updateAID(int actType, String aid)、@link updateCAPK(int actType, String capk) 、
           * @link setTerminalParm(EmvTermParam emvTermParam)}保存AID、CAPK、终端参数
           * @return 0为成功，其他为错误
           * @deprecated
           */
      @Override public int syncParam() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_syncParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().syncParam();
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
            * 修改终端参数
            * @param emvTermParam  终端参数对应的实体类
            * @return 0 为成功，其他为错误
            * @deprecated
            */
      @Override public int setTerminalParam(com.sunmi.pay.hardware.aidl.bean.EmvTermParam emvTermParam) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((emvTermParam!=null)) {
            _data.writeInt(1);
            emvTermParam.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTerminalParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setTerminalParam(emvTermParam);
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
            * 判断CAPK以及AID是否存在
            * @return -1:都不存在，0：都存在，1：AID存在，capk不存在，2：capk存在，AID不存在
            * @deprecated
            */
      @Override public int isExistCapkAndAID() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isExistCapkAndAID, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isExistCapkAndAID();
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
            * 开始交易处理
            * @parame listener EMV回调接口，详见 EMVListner
            * @deprecated
            */
      @Override public void transactProcess(com.sunmi.pay.hardware.aidl.emv.EMVListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_transactProcess, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().transactProcess(listener);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
            * 读取内核数据，读取内核55域数据，用于联机上送
            * @parame tags,需要取出的tag列表，例：{“95”,“9F2A”}
            * @parame outData 输出取出的数据（TLV格式）
            * @return 读取到的数据长度，小于0为错误码
            * @deprecated
            */
      @Override public int readKernelData(java.lang.String[] tags, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(tags);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readKernelData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readKernelData(tags, outData);
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
            * 导入联机数据，导入后台下发联机数据，包含发卡行脚本处理
            * @param 联机结果 0:联机批准 1： 联机拒绝 2： 联机失败
            * @param tagIn 后台返回联机数据
            * @param tagInLength 连接数据长度
            * @param tagOut 输出脚本执行结果
            * @return 输出的数据长度，小于0为错误码
            * @deprecated
            */
      @Override public int importResponseData(int onlineResult, byte[] tagIn, int tagInLength, byte[] tagOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(onlineResult);
          _data.writeByteArray(tagIn);
          _data.writeInt(tagInLength);
          _data.writeByteArray(tagOut);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importResponseData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().importResponseData(onlineResult, tagIn, tagInLength, tagOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(tagIn);
          _reply.readByteArray(tagOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 读取交易日志，读取卡片交易日志
            * @param logType 日志类型
            * @param infoOut 读取到的日志列表
            * @return 输出的数据长度，小于0为错误码
            * @deprecated
            */
      @Override public int readTransLog(int logType, java.util.List<java.lang.String> infoOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(logType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readTransLog, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readTransLog(logType, infoOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readStringList(infoOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 导入密码输入结果
            * @param pinType PIN类型 0： 联机PIN 1：脱机PIN
            * @param inputResult 输入结果  0:处理成功,1:PIN取消,2:PIN跳过,3:PINPAD故障
            * @deprecated
            */
      @Override public void importPinInputStatus(int pinType, int inputResult) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pinType);
          _data.writeInt(inputResult);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPinInputStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importPinInputStatus(pinType, inputResult);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
            * 交易预处理（IC,NFC）
            * @param cardType 卡类型
            * @param transData 交易参数配置对象
            * @return          成功为0,非0为失败
            * @deprecated
            */
      @Override public int TransPreProcess(int icCardType, com.sunmi.pay.hardware.aidl.bean.TransData transData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(icCardType);
          if ((transData!=null)) {
            _data.writeInt(1);
            transData.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_TransPreProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().TransPreProcess(icCardType, transData);
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
            * 设置内核TLV数据(可一次设置多个TLV数据)
            * @param tlvData tlv数据
            * @return 0:成功，其他：错误码
            * @deprecated
            */
      @Override public int setKernelData(byte[] tlvData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(tlvData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setKernelData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setKernelData(tlvData);
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
            * 中断交易处理流程
            * @deprecated
            */
      @Override public void abortTransactProcess() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abortTransactProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().abortTransactProcess();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidl.emv.EMVOpt sDefaultImpl;
    }
    static final int TRANSACTION_updateAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_updateCAPK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_insertAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_insertCAPK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_syncParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setTerminalParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_isExistCapkAndAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_transactProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_readKernelData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_importResponseData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_readTransLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_importPinInputStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_TransPreProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setKernelData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_abortTransactProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.emv.EMVOpt impl) {
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
    public static com.sunmi.pay.hardware.aidl.emv.EMVOpt getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 修改AID参数
       * @param actType 操作类型，详见 AidlConstants.Emv.AID
       * @param aid 单条AID,16进制字符串
       * @returun 0 为成功，其他为错误
       * @deprecated
       */
  public int updateAID(int actType, java.lang.String aid) throws android.os.RemoteException;
  /**
        * 修改CAPK参数
        * @param actType 操作类型,详见 AidlConstants.Emv.CAPK
        * @param capk 单条capk，16进制字符串
        * @return 0 为成功，其他为错误
        * @deprecated
        */
  public int updateCAPK(int actType, java.lang.String capk) throws android.os.RemoteException;
  /**
       * 保存AID参数
       * @param 所有的aid
       * @return 0 成功，其他为错误
       * @deprecated
       */
  public int insertAID(java.util.List<java.lang.String> aidList) throws android.os.RemoteException;
  /**
       * 保存CAPK参数
       * @param 所有的capk
       * @return 0 成功，其他为错误
       * @deprecated
       */
  public int insertCAPK(java.util.List<java.lang.String> capkList) throws android.os.RemoteException;
  /**
       * 同步参数，将数据库中的AID、CAPK、终端参数写入内核
       * 注意：在调用该方法前必须先调用{@link updateAID(int actType, String aid)、@link updateCAPK(int actType, String capk) 、
       * @link setTerminalParm(EmvTermParam emvTermParam)}保存AID、CAPK、终端参数
       * @return 0为成功，其他为错误
       * @deprecated
       */
  public int syncParam() throws android.os.RemoteException;
  /**
        * 修改终端参数
        * @param emvTermParam  终端参数对应的实体类
        * @return 0 为成功，其他为错误
        * @deprecated
        */
  public int setTerminalParam(com.sunmi.pay.hardware.aidl.bean.EmvTermParam emvTermParam) throws android.os.RemoteException;
  /**
        * 判断CAPK以及AID是否存在
        * @return -1:都不存在，0：都存在，1：AID存在，capk不存在，2：capk存在，AID不存在
        * @deprecated
        */
  public int isExistCapkAndAID() throws android.os.RemoteException;
  /**
        * 开始交易处理
        * @parame listener EMV回调接口，详见 EMVListner
        * @deprecated
        */
  public void transactProcess(com.sunmi.pay.hardware.aidl.emv.EMVListener listener) throws android.os.RemoteException;
  /**
        * 读取内核数据，读取内核55域数据，用于联机上送
        * @parame tags,需要取出的tag列表，例：{“95”,“9F2A”}
        * @parame outData 输出取出的数据（TLV格式）
        * @return 读取到的数据长度，小于0为错误码
        * @deprecated
        */
  public int readKernelData(java.lang.String[] tags, byte[] outData) throws android.os.RemoteException;
  /**
        * 导入联机数据，导入后台下发联机数据，包含发卡行脚本处理
        * @param 联机结果 0:联机批准 1： 联机拒绝 2： 联机失败
        * @param tagIn 后台返回联机数据
        * @param tagInLength 连接数据长度
        * @param tagOut 输出脚本执行结果
        * @return 输出的数据长度，小于0为错误码
        * @deprecated
        */
  public int importResponseData(int onlineResult, byte[] tagIn, int tagInLength, byte[] tagOut) throws android.os.RemoteException;
  /**
        * 读取交易日志，读取卡片交易日志
        * @param logType 日志类型
        * @param infoOut 读取到的日志列表
        * @return 输出的数据长度，小于0为错误码
        * @deprecated
        */
  public int readTransLog(int logType, java.util.List<java.lang.String> infoOut) throws android.os.RemoteException;
  /**
        * 导入密码输入结果
        * @param pinType PIN类型 0： 联机PIN 1：脱机PIN
        * @param inputResult 输入结果  0:处理成功,1:PIN取消,2:PIN跳过,3:PINPAD故障
        * @deprecated
        */
  public void importPinInputStatus(int pinType, int inputResult) throws android.os.RemoteException;
  /**
        * 交易预处理（IC,NFC）
        * @param cardType 卡类型
        * @param transData 交易参数配置对象
        * @return          成功为0,非0为失败
        * @deprecated
        */
  public int TransPreProcess(int icCardType, com.sunmi.pay.hardware.aidl.bean.TransData transData) throws android.os.RemoteException;
  /**
        * 设置内核TLV数据(可一次设置多个TLV数据)
        * @param tlvData tlv数据
        * @return 0:成功，其他：错误码
        * @deprecated
        */
  public int setKernelData(byte[] tlvData) throws android.os.RemoteException;
  /**
        * 中断交易处理流程
        * @deprecated
        */
  public void abortTransactProcess() throws android.os.RemoteException;
}
