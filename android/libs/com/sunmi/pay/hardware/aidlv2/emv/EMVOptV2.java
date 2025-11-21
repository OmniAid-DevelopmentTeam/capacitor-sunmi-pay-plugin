/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.emv;
// Declare any non-default types here with import statements

public interface EMVOptV2 extends android.os.IInterface
{
  /** Default implementation for EMVOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
  {
    /**
         * 添加或修改一条AID
         * @param aid 单条AID
         * @returun 0-成功，非0-错误码
         */
    @Override public int addAid(com.sunmi.pay.hardware.aidlv2.bean.AidV2 aid) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 根据tag9F06的值删除AID
         * @param tag9F06Value tag9F06的值(hex格式)，若为null则清空AID
         * @returun 0-成功，非0-错误码
         */
    @Override public int deleteAid(java.lang.String tag9F06Value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 添加或更新一条CAPK
         * @param capk 单条CAPK
         * @returun 0-成功，非0-错误码
         */
    @Override public int addCapk(com.sunmi.pay.hardware.aidlv2.bean.CapkV2 capk) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 根据tag9F06Value、tag9F22Value的值删除CAPK
         * @param tag9F06Value tag9F06的值(hex格式),若为null则清空CAPK
         * @param tag9F22Value tag9F22的值(hex格式)
         * @returun 0-成功，非0-错误码
         */
    @Override public int deleteCapk(java.lang.String tag9F06Value, java.lang.String tag9F22Value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 修改终端参数
         * @param termParam 终端参数
         * @returun 0-成功，非0-错误码
         */
    @Override public int setTerminalParam(com.sunmi.pay.hardware.aidlv2.bean.EmvTermParamV2 termParam) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 判断内核中是否存在AID和CAPK
         * @returun -1：都不存在，0：都存在，1：只存在AID，2：只存在CAPK
         */
    @Override public int checkAidAndCapk() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 初始化EMV流程
         * @returun 0：成功，非0-错误码
         */
    @Override public int initEmvProcess() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 交易预处理
         * @param transData 交易处理实体类
         * @param listener EMV回调接口
         */
    @Override public void transactProcess(com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2 transData, com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 listener) throws android.os.RemoteException
    {
    }
    /**
         * 读取单条内核数据
         * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
         * @param tag 需要取出的tag(hex格式),如“95”
         * @param outData 输出取出的数据（TLV格式）
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int getTlv(int opCode, java.lang.String tag, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 读取内核数据列表
         * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
         * @param tags 需要取出的tag列表(hex格式),如{“95”,“9F2A”}
         * @param outData 输出取出的数据（TLV格式）
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int getTlvList(int opCode, java.lang.String[] tags, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置TLV数据
         * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
         * @param tag 要设置的tag(hex格式)，如“95”
         * @param hexValue tag对应的值(hex格式)
         */
    @Override public void setTlv(int opCode, java.lang.String tag, java.lang.String hexValue) throws android.os.RemoteException
    {
    }
    /**
         * 设置TLV数据列表
         * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
         * @param tags 要设置的tag(hex格式)列表，如{“95”,"5F2A","5F36"}
         * @param hexValues tag对应的值(hex格式)列表
         */
    @Override public void setTlvList(int opCode, java.lang.String[] tags, java.lang.String[] hexValues) throws android.os.RemoteException
    {
    }
    /**
         * 导入应用选择结果
         * @param selectIndex 应用选择索引，从0开始
         */
    @Override public void importAppSelect(int selectIndex) throws android.os.RemoteException
    {
    }
    /**
         * 导入最终选择结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importAppFinalSelectStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 导入PIN输入结果
         * @param pinType PIN类型,0-联机PIN，1-脱机PIN
         * @param inputResult PIN输入结果,0-处理成功,1-PIN取消,2-PIN跳过,3-PINPAD故障,4-输PIN超时
         */
    @Override public void importPinInputStatus(int pinType, int inputResult) throws android.os.RemoteException
    {
    }
    /**
         * 导入签名结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importSignatureStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 导入身份认证结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importCertStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 导入卡号确认结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importCardNoStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 导入联机数据，导入后台下发联机数据，包含发卡行脚本处理
         * @param status 联机结果 0-联机批准 1-联机拒绝 2-联机失败
         * @param tags 联机数据tag列表
         * @param hexValues 连接数据value列表
         * @param outData 脚本执行结果
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int importOnlineProcStatus(int status, java.lang.String[] tags, java.lang.String[] hexValues, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 读取交易日志
         * @param logType 日志类型,0-交易日志 1-圈存日志
         * @param infoOut 输出日志读取列表
         * @return 0-成功，非0-错误码
         */
    @Override public int readTransLog(int logType, java.util.List<java.lang.String> infoOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 中断交易处理流程
         */
    @Override public void abortTransactProcess() throws android.os.RemoteException
    {
    }
    /**
         * 导入数据交互结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importDataExchangeStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 交易预处理
         * @param transData 交易参数，包含key:
         * amount：交易金额（类型：String）
         * transType：交易类型（类型：String）
         * flowType：流程类型（类型：int）
         * cardType：卡类型（类型：int）
         * cashbackAmount：返现金额（类型：String）
         * emvAuthLevel: EMV认证级别（类型：int）
         * preProcessCompleted：交易预处理完成标志（类型：boolean）
         * @param listener EMV回调接口
         */
    @Override public void transactProcessEx(android.os.Bundle transData, com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 listener) throws android.os.RemoteException
    {
    }
    /**
         * 查询电子现金余额
         * @param bundle 输出电子现金余额，包含如下key：
         * 9F51:应用货币代码(Hex)
         * 9F79:电子现金余额(long)
         */
    @Override public int queryECBalance(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 添加或修改一条DRL limitSet
         * @param drl 单条DRL limitSet
         * @returun 0-成功，非0-错误码
         */
    @Override public int addDrlLimitSet(com.sunmi.pay.hardware.aidlv2.bean.DrlV2 drl) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 根据programId的值删除DRL limitSet
         * @param programId 应用程序ID(hex格式)，若为null则清空DRL limitSet
         * @returun 0-成功，非0-错误码
         */
    @Override public int deleteDrlLimitSet(java.lang.String programId) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置终端参数
         * @param bundle 包含如下key：
         * supportDRL：是否支持DRL功能(类型：boolean)
         * downloadAidParam：是否下发AID参数(类型：boolean)
         * downloadAidParamAll：是否下发AID参数ALL(类型：boolean)
         * downloadPreParamEP：是否下发EntryPoint预处理参数(类型：boolean)
         * optOnlineRes：优化联机结果(类型：boolean)
         * ledLightingDuration：led点亮时长(类型：int)
         * contactlessManualSelAppGeneral：非接手动选择应用(通用版本)(类型：boolean)
         * contactlessManualSelAppGeneralEx：非接手动选择应用(通用版本)扩展(类型：boolean)
         * contactlessManualSelApp：非接手动选择应用(类型：boolean)
         * importScriptData：联机拒绝导入脚本数据(类型：boolean)
         */
    @Override public void setTermParamEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    /**
         * 查询Aid/Capk列表
         * @param type 类型,0-Aid列表，1-Capk列表
         * @param list 查询到的Aid/Capk列表
         * @return 0-成功，非0-错误码
         */
    @Override public int queryAidCapkList(int type, java.util.List<java.lang.String> list) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 交易预处理
         * @returun 0：成功，非0-错误码
         */
    @Override public int transactPreProcess() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 添加或更新一条RevocationList
         * @param revocList 单条RevocationList
         * @returun 0-成功，非0-错误码
         */
    @Override public int addRevocList(com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 revocList) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 删除一条RevocationList
         * @param revocList 单条RevocationList，若为null则清除所有RevocationList
         * @returun 0-成功，非0-错误码
         */
    @Override public int deleteRevocList(com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 revocList) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置终端时间
         * @param timeStamp: 时间戳，单位：ms
         * @returun 0-成功，非0-错误码
         */
    @Override public int sysSetTime(long timeStamp) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取终端时间
         * @param outData 输出取出的数据，yyyyMMddHHmmss字符串转成的Hex字节数组
         * <br/>如：hexStringToBytes("20191130142020")
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int sysGetTime(byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 清除终端、卡片数据
         * @param opCode 操作类型, 0-清除所有数据, 1-清除终端数据, 2-清除卡片数据
         * @returun 0:成功, 非0-错误码
         */
    @Override public int clearData(int opCode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 设置账户数据安全参数
        * @param bundle 入参，包含如下key：
        * encKeySystem:int,密钥体系，包含 0-SEC_MKSK,1-SEC_DUKPT,2-SEC_RSA_KEY,3-SEC_SM2_KEY
        * encKeyIndex:int,磁道数据加密索引，一般传入TDK索引
        * encMode:int,加密模式
        * encIv:byte[]初始向量，加密模式为ECB 传空，为其他加密模式传入8字节向量
        * encPaddingMode:byte 磁道数据进行DES加密时，长度不是8的倍数，则在后面补齐encPaddingMode至长度为8的倍数的数据
        * encMaskStart:int,表示账号前EncMaskStart位为明文，范围是0~6
        * encMaskEnd:int,表示账号后EncMaskEnd位为明文，范围是0~4
        * encMaskWord:char,为0或者是非数字字符，表示账号encMaskStart至encMaskWord为掩码,默认为 *
        * @return 0-成功，非0-错误码
        */
    @Override public int setAccountDataSecParam(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取账户安全数据(加密/掩码)
         * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
         * @param tags 需要取出的tag列表(hex格式),如{“5A”,“57”}
         * @param bundle 出参，输出的数据 包含key:
         * tag+Enc,如{“5AEnc”,“57Enc”}:tag加密数据(String)
         * tag+Mask,如{“5AMask”,“57Mask”}:tag掩码数据(String)
         * @return 0-成功，<0-错误码
         */
    @Override public int getAccountSecData(int opCode, java.lang.String[] tags, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 导入终端风险管理结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importTermRiskManagementStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 导入第一次GAC前调用结果
         * @param status 0-成功，非0-失败
         */
    @Override public void importPreFirstGenACStatus(int status) throws android.os.RemoteException
    {
    }
    /**
         * 导入DataStorage相关数据
         * @param tags DataStorage相关数据tag列表, 如BF10数据, PDOL的更改数据.
         * @param hexValues DataStorage相关数据value列表.
         */
    @Override public void importDataStorage(java.lang.String[] tags, java.lang.String[] hexValues) throws android.os.RemoteException
    {
    }
    /**
         * 添加EMV回调监听器
         * @param listener EMV回调接口
         */
    @Override public void addEMVDataListener(com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 listener) throws android.os.RemoteException
    {
    }
    /**
         * 添加DET数据
         * @return 0-成功，<0-错误码
         */
    @Override public int addDETData(byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 数据输入输出处理，可用于调试EMV功能、相关参数的设置和获取，但不可用于控制EMV交易流程
         * @param mode 输入/输出模式 0-输入，1-输出
         * @param procType 处理类型
         * @param inData 输入数据
         * @param outData 输出数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int dataInputOutputProcess(int mode, int procType, byte[] inData, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 导入PIN输入结果
         * @param pinValue pin值
         * @param inputResult PIN输入结果,0-处理成功,1-PIN取消,2-PIN跳过,3-PINPAD故障,4-输PIN超时
         */
    @Override public void importPinInputStatusForToss(byte[] pinValue, int inputResult) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_addAid:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.AidV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.AidV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.addAid(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteAid:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.deleteAid(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_addCapk:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.CapkV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.CapkV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.addCapk(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteCapk:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.deleteCapk(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setTerminalParam:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.EmvTermParamV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.EmvTermParamV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setTerminalParam(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_checkAidAndCapk:
        {
          data.enforceInterface(descriptor);
          int _result = this.checkAidAndCapk();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_initEmvProcess:
        {
          data.enforceInterface(descriptor);
          int _result = this.initEmvProcess();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_transactProcess:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2.Stub.asInterface(data.readStrongBinder());
          this.transactProcess(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_getTlv:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.getTlv(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_getTlvList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.getTlvList(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_setTlv:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.setTlv(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_setTlvList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          this.setTlvList(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_importAppSelect:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importAppSelect(_arg0);
          return true;
        }
        case TRANSACTION_importAppFinalSelectStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importAppFinalSelectStatus(_arg0);
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
        case TRANSACTION_importSignatureStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importSignatureStatus(_arg0);
          return true;
        }
        case TRANSACTION_importCertStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importCertStatus(_arg0);
          return true;
        }
        case TRANSACTION_importCardNoStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importCardNoStatus(_arg0);
          return true;
        }
        case TRANSACTION_importOnlineProcStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _result = this.importOnlineProcStatus(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_readTransLog:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _arg1;
          _arg1 = data.createStringArrayList();
          int _result = this.readTransLog(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeStringList(_arg1);
          return true;
        }
        case TRANSACTION_abortTransactProcess:
        {
          data.enforceInterface(descriptor);
          this.abortTransactProcess();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_importDataExchangeStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importDataExchangeStatus(_arg0);
          return true;
        }
        case TRANSACTION_transactProcessEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2.Stub.asInterface(data.readStrongBinder());
          this.transactProcessEx(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_queryECBalance:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.queryECBalance(_arg0);
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
        case TRANSACTION_addDrlLimitSet:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.DrlV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.DrlV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.addDrlLimitSet(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteDrlLimitSet:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.deleteDrlLimitSet(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setTermParamEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.setTermParamEx(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_queryAidCapkList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<java.lang.String> _arg1;
          _arg1 = data.createStringArrayList();
          int _result = this.queryAidCapkList(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeStringList(_arg1);
          return true;
        }
        case TRANSACTION_transactPreProcess:
        {
          data.enforceInterface(descriptor);
          int _result = this.transactPreProcess();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_addRevocList:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.RevocListV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.addRevocList(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteRevocList:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.RevocListV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.deleteRevocList(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysSetTime:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          int _result = this.sysSetTime(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysGetTime:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sysGetTime(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_clearData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.clearData(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setAccountDataSecParam:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setAccountDataSecParam(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getAccountSecData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          android.os.Bundle _arg2;
          _arg2 = new android.os.Bundle();
          int _result = this.getAccountSecData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg2!=null)) {
            reply.writeInt(1);
            _arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_importTermRiskManagementStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importTermRiskManagementStatus(_arg0);
          return true;
        }
        case TRANSACTION_importPreFirstGenACStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.importPreFirstGenACStatus(_arg0);
          return true;
        }
        case TRANSACTION_importDataStorage:
        {
          data.enforceInterface(descriptor);
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          this.importDataStorage(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_addEMVDataListener:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 _arg0;
          _arg0 = com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2.Stub.asInterface(data.readStrongBinder());
          this.addEMVDataListener(_arg0);
          return true;
        }
        case TRANSACTION_addDETData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.addDETData(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dataInputOutputProcess:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _result = this.dataInputOutputProcess(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_importPinInputStatusForToss:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          this.importPinInputStatusForToss(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2
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
           * 添加或修改一条AID
           * @param aid 单条AID
           * @returun 0-成功，非0-错误码
           */
      @Override public int addAid(com.sunmi.pay.hardware.aidlv2.bean.AidV2 aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((aid!=null)) {
            _data.writeInt(1);
            aid.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addAid(aid);
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
           * 根据tag9F06的值删除AID
           * @param tag9F06Value tag9F06的值(hex格式)，若为null则清空AID
           * @returun 0-成功，非0-错误码
           */
      @Override public int deleteAid(java.lang.String tag9F06Value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tag9F06Value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteAid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteAid(tag9F06Value);
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
           * 添加或更新一条CAPK
           * @param capk 单条CAPK
           * @returun 0-成功，非0-错误码
           */
      @Override public int addCapk(com.sunmi.pay.hardware.aidlv2.bean.CapkV2 capk) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((capk!=null)) {
            _data.writeInt(1);
            capk.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_addCapk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addCapk(capk);
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
           * 根据tag9F06Value、tag9F22Value的值删除CAPK
           * @param tag9F06Value tag9F06的值(hex格式),若为null则清空CAPK
           * @param tag9F22Value tag9F22的值(hex格式)
           * @returun 0-成功，非0-错误码
           */
      @Override public int deleteCapk(java.lang.String tag9F06Value, java.lang.String tag9F22Value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tag9F06Value);
          _data.writeString(tag9F22Value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteCapk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteCapk(tag9F06Value, tag9F22Value);
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
           * @param termParam 终端参数
           * @returun 0-成功，非0-错误码
           */
      @Override public int setTerminalParam(com.sunmi.pay.hardware.aidlv2.bean.EmvTermParamV2 termParam) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((termParam!=null)) {
            _data.writeInt(1);
            termParam.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTerminalParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setTerminalParam(termParam);
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
           * 判断内核中是否存在AID和CAPK
           * @returun -1：都不存在，0：都存在，1：只存在AID，2：只存在CAPK
           */
      @Override public int checkAidAndCapk() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkAidAndCapk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().checkAidAndCapk();
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
           * 初始化EMV流程
           * @returun 0：成功，非0-错误码
           */
      @Override public int initEmvProcess() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initEmvProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initEmvProcess();
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
           * 交易预处理
           * @param transData 交易处理实体类
           * @param listener EMV回调接口
           */
      @Override public void transactProcess(com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2 transData, com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((transData!=null)) {
            _data.writeInt(1);
            transData.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_transactProcess, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().transactProcess(transData, listener);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 读取单条内核数据
           * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
           * @param tag 需要取出的tag(hex格式),如“95”
           * @param outData 输出取出的数据（TLV格式）
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int getTlv(int opCode, java.lang.String tag, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opCode);
          _data.writeString(tag);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTlv, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTlv(opCode, tag, outData);
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
           * 读取内核数据列表
           * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
           * @param tags 需要取出的tag列表(hex格式),如{“95”,“9F2A”}
           * @param outData 输出取出的数据（TLV格式）
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int getTlvList(int opCode, java.lang.String[] tags, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opCode);
          _data.writeStringArray(tags);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTlvList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTlvList(opCode, tags, outData);
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
           * 设置TLV数据
           * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
           * @param tag 要设置的tag(hex格式)，如“95”
           * @param hexValue tag对应的值(hex格式)
           */
      @Override public void setTlv(int opCode, java.lang.String tag, java.lang.String hexValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opCode);
          _data.writeString(tag);
          _data.writeString(hexValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTlv, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTlv(opCode, tag, hexValue);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 设置TLV数据列表
           * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
           * @param tags 要设置的tag(hex格式)列表，如{“95”,"5F2A","5F36"}
           * @param hexValues tag对应的值(hex格式)列表
           */
      @Override public void setTlvList(int opCode, java.lang.String[] tags, java.lang.String[] hexValues) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opCode);
          _data.writeStringArray(tags);
          _data.writeStringArray(hexValues);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTlvList, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTlvList(opCode, tags, hexValues);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入应用选择结果
           * @param selectIndex 应用选择索引，从0开始
           */
      @Override public void importAppSelect(int selectIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(selectIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importAppSelect, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importAppSelect(selectIndex);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入最终选择结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importAppFinalSelectStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importAppFinalSelectStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importAppFinalSelectStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入PIN输入结果
           * @param pinType PIN类型,0-联机PIN，1-脱机PIN
           * @param inputResult PIN输入结果,0-处理成功,1-PIN取消,2-PIN跳过,3-PINPAD故障,4-输PIN超时
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
           * 导入签名结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importSignatureStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importSignatureStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importSignatureStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入身份认证结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importCertStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importCertStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importCertStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入卡号确认结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importCardNoStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importCardNoStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importCardNoStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入联机数据，导入后台下发联机数据，包含发卡行脚本处理
           * @param status 联机结果 0-联机批准 1-联机拒绝 2-联机失败
           * @param tags 联机数据tag列表
           * @param hexValues 连接数据value列表
           * @param outData 脚本执行结果
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int importOnlineProcStatus(int status, java.lang.String[] tags, java.lang.String[] hexValues, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          _data.writeStringArray(tags);
          _data.writeStringArray(hexValues);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importOnlineProcStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().importOnlineProcStatus(status, tags, hexValues, outData);
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
           * 读取交易日志
           * @param logType 日志类型,0-交易日志 1-圈存日志
           * @param infoOut 输出日志读取列表
           * @return 0-成功，非0-错误码
           */
      @Override public int readTransLog(int logType, java.util.List<java.lang.String> infoOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(logType);
          _data.writeStringList(infoOut);
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
           * 中断交易处理流程
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
      /**
           * 导入数据交互结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importDataExchangeStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importDataExchangeStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importDataExchangeStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 交易预处理
           * @param transData 交易参数，包含key:
           * amount：交易金额（类型：String）
           * transType：交易类型（类型：String）
           * flowType：流程类型（类型：int）
           * cardType：卡类型（类型：int）
           * cashbackAmount：返现金额（类型：String）
           * emvAuthLevel: EMV认证级别（类型：int）
           * preProcessCompleted：交易预处理完成标志（类型：boolean）
           * @param listener EMV回调接口
           */
      @Override public void transactProcessEx(android.os.Bundle transData, com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((transData!=null)) {
            _data.writeInt(1);
            transData.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_transactProcessEx, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().transactProcessEx(transData, listener);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 查询电子现金余额
           * @param bundle 输出电子现金余额，包含如下key：
           * 9F51:应用货币代码(Hex)
           * 9F79:电子现金余额(long)
           */
      @Override public int queryECBalance(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryECBalance, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryECBalance(bundle);
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
           * 添加或修改一条DRL limitSet
           * @param drl 单条DRL limitSet
           * @returun 0-成功，非0-错误码
           */
      @Override public int addDrlLimitSet(com.sunmi.pay.hardware.aidlv2.bean.DrlV2 drl) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((drl!=null)) {
            _data.writeInt(1);
            drl.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_addDrlLimitSet, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addDrlLimitSet(drl);
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
           * 根据programId的值删除DRL limitSet
           * @param programId 应用程序ID(hex格式)，若为null则清空DRL limitSet
           * @returun 0-成功，非0-错误码
           */
      @Override public int deleteDrlLimitSet(java.lang.String programId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(programId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteDrlLimitSet, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteDrlLimitSet(programId);
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
           * 设置终端参数
           * @param bundle 包含如下key：
           * supportDRL：是否支持DRL功能(类型：boolean)
           * downloadAidParam：是否下发AID参数(类型：boolean)
           * downloadAidParamAll：是否下发AID参数ALL(类型：boolean)
           * downloadPreParamEP：是否下发EntryPoint预处理参数(类型：boolean)
           * optOnlineRes：优化联机结果(类型：boolean)
           * ledLightingDuration：led点亮时长(类型：int)
           * contactlessManualSelAppGeneral：非接手动选择应用(通用版本)(类型：boolean)
           * contactlessManualSelAppGeneralEx：非接手动选择应用(通用版本)扩展(类型：boolean)
           * contactlessManualSelApp：非接手动选择应用(类型：boolean)
           * importScriptData：联机拒绝导入脚本数据(类型：boolean)
           */
      @Override public void setTermParamEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTermParamEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setTermParamEx(bundle);
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
           * 查询Aid/Capk列表
           * @param type 类型,0-Aid列表，1-Capk列表
           * @param list 查询到的Aid/Capk列表
           * @return 0-成功，非0-错误码
           */
      @Override public int queryAidCapkList(int type, java.util.List<java.lang.String> list) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeStringList(list);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryAidCapkList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryAidCapkList(type, list);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readStringList(list);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 交易预处理
           * @returun 0：成功，非0-错误码
           */
      @Override public int transactPreProcess() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_transactPreProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().transactPreProcess();
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
           * 添加或更新一条RevocationList
           * @param revocList 单条RevocationList
           * @returun 0-成功，非0-错误码
           */
      @Override public int addRevocList(com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 revocList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((revocList!=null)) {
            _data.writeInt(1);
            revocList.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_addRevocList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addRevocList(revocList);
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
           * 删除一条RevocationList
           * @param revocList 单条RevocationList，若为null则清除所有RevocationList
           * @returun 0-成功，非0-错误码
           */
      @Override public int deleteRevocList(com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 revocList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((revocList!=null)) {
            _data.writeInt(1);
            revocList.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteRevocList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteRevocList(revocList);
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
           * 设置终端时间
           * @param timeStamp: 时间戳，单位：ms
           * @returun 0-成功，非0-错误码
           */
      @Override public int sysSetTime(long timeStamp) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(timeStamp);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysSetTime, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysSetTime(timeStamp);
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
           * 获取终端时间
           * @param outData 输出取出的数据，yyyyMMddHHmmss字符串转成的Hex字节数组
           * <br/>如：hexStringToBytes("20191130142020")
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int sysGetTime(byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysGetTime, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysGetTime(outData);
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
           * 清除终端、卡片数据
           * @param opCode 操作类型, 0-清除所有数据, 1-清除终端数据, 2-清除卡片数据
           * @returun 0:成功, 非0-错误码
           */
      @Override public int clearData(int opCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().clearData(opCode);
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
          * 设置账户数据安全参数
          * @param bundle 入参，包含如下key：
          * encKeySystem:int,密钥体系，包含 0-SEC_MKSK,1-SEC_DUKPT,2-SEC_RSA_KEY,3-SEC_SM2_KEY
          * encKeyIndex:int,磁道数据加密索引，一般传入TDK索引
          * encMode:int,加密模式
          * encIv:byte[]初始向量，加密模式为ECB 传空，为其他加密模式传入8字节向量
          * encPaddingMode:byte 磁道数据进行DES加密时，长度不是8的倍数，则在后面补齐encPaddingMode至长度为8的倍数的数据
          * encMaskStart:int,表示账号前EncMaskStart位为明文，范围是0~6
          * encMaskEnd:int,表示账号后EncMaskEnd位为明文，范围是0~4
          * encMaskWord:char,为0或者是非数字字符，表示账号encMaskStart至encMaskWord为掩码,默认为 *
          * @return 0-成功，非0-错误码
          */
      @Override public int setAccountDataSecParam(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAccountDataSecParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setAccountDataSecParam(bundle);
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
           * 获取账户安全数据(加密/掩码)
           * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
           * @param tags 需要取出的tag列表(hex格式),如{“5A”,“57”}
           * @param bundle 出参，输出的数据 包含key:
           * tag+Enc,如{“5AEnc”,“57Enc”}:tag加密数据(String)
           * tag+Mask,如{“5AMask”,“57Mask”}:tag掩码数据(String)
           * @return 0-成功，<0-错误码
           */
      @Override public int getAccountSecData(int opCode, java.lang.String[] tags, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opCode);
          _data.writeStringArray(tags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAccountSecData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAccountSecData(opCode, tags, bundle);
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
           * 导入终端风险管理结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importTermRiskManagementStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importTermRiskManagementStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importTermRiskManagementStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入第一次GAC前调用结果
           * @param status 0-成功，非0-失败
           */
      @Override public void importPreFirstGenACStatus(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPreFirstGenACStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importPreFirstGenACStatus(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 导入DataStorage相关数据
           * @param tags DataStorage相关数据tag列表, 如BF10数据, PDOL的更改数据.
           * @param hexValues DataStorage相关数据value列表.
           */
      @Override public void importDataStorage(java.lang.String[] tags, java.lang.String[] hexValues) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(tags);
          _data.writeStringArray(hexValues);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importDataStorage, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importDataStorage(tags, hexValues);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 添加EMV回调监听器
           * @param listener EMV回调接口
           */
      @Override public void addEMVDataListener(com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_addEMVDataListener, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addEMVDataListener(listener);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * 添加DET数据
           * @return 0-成功，<0-错误码
           */
      @Override public int addDETData(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addDETData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().addDETData(data);
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
           * 数据输入输出处理，可用于调试EMV功能、相关参数的设置和获取，但不可用于控制EMV交易流程
           * @param mode 输入/输出模式 0-输入，1-输出
           * @param procType 处理类型
           * @param inData 输入数据
           * @param outData 输出数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int dataInputOutputProcess(int mode, int procType, byte[] inData, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(procType);
          _data.writeByteArray(inData);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataInputOutputProcess, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataInputOutputProcess(mode, procType, inData, outData);
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
           * 导入PIN输入结果
           * @param pinValue pin值
           * @param inputResult PIN输入结果,0-处理成功,1-PIN取消,2-PIN跳过,3-PINPAD故障,4-输PIN超时
           */
      @Override public void importPinInputStatusForToss(byte[] pinValue, int inputResult) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(pinValue);
          _data.writeInt(inputResult);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPinInputStatusForToss, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importPinInputStatusForToss(pinValue, inputResult);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_addAid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_deleteAid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_addCapk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_deleteCapk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setTerminalParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_checkAidAndCapk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_initEmvProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_transactProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getTlv = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getTlvList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setTlv = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setTlvList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_importAppSelect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_importAppFinalSelectStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_importPinInputStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_importSignatureStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_importCertStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_importCardNoStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_importOnlineProcStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_readTransLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_abortTransactProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_importDataExchangeStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_transactProcessEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_queryECBalance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_addDrlLimitSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_deleteDrlLimitSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setTermParamEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_queryAidCapkList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_transactPreProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_addRevocList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_deleteRevocList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_sysSetTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_sysGetTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_clearData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_setAccountDataSecParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_getAccountSecData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_importTermRiskManagementStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_importPreFirstGenACStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_importDataStorage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_addEMVDataListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_addDETData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_dataInputOutputProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_importPinInputStatusForToss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 添加或修改一条AID
       * @param aid 单条AID
       * @returun 0-成功，非0-错误码
       */
  public int addAid(com.sunmi.pay.hardware.aidlv2.bean.AidV2 aid) throws android.os.RemoteException;
  /**
       * 根据tag9F06的值删除AID
       * @param tag9F06Value tag9F06的值(hex格式)，若为null则清空AID
       * @returun 0-成功，非0-错误码
       */
  public int deleteAid(java.lang.String tag9F06Value) throws android.os.RemoteException;
  /**
       * 添加或更新一条CAPK
       * @param capk 单条CAPK
       * @returun 0-成功，非0-错误码
       */
  public int addCapk(com.sunmi.pay.hardware.aidlv2.bean.CapkV2 capk) throws android.os.RemoteException;
  /**
       * 根据tag9F06Value、tag9F22Value的值删除CAPK
       * @param tag9F06Value tag9F06的值(hex格式),若为null则清空CAPK
       * @param tag9F22Value tag9F22的值(hex格式)
       * @returun 0-成功，非0-错误码
       */
  public int deleteCapk(java.lang.String tag9F06Value, java.lang.String tag9F22Value) throws android.os.RemoteException;
  /**
       * 修改终端参数
       * @param termParam 终端参数
       * @returun 0-成功，非0-错误码
       */
  public int setTerminalParam(com.sunmi.pay.hardware.aidlv2.bean.EmvTermParamV2 termParam) throws android.os.RemoteException;
  /**
       * 判断内核中是否存在AID和CAPK
       * @returun -1：都不存在，0：都存在，1：只存在AID，2：只存在CAPK
       */
  public int checkAidAndCapk() throws android.os.RemoteException;
  /**
       * 初始化EMV流程
       * @returun 0：成功，非0-错误码
       */
  public int initEmvProcess() throws android.os.RemoteException;
  /**
       * 交易预处理
       * @param transData 交易处理实体类
       * @param listener EMV回调接口
       */
  public void transactProcess(com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2 transData, com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 listener) throws android.os.RemoteException;
  /**
       * 读取单条内核数据
       * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
       * @param tag 需要取出的tag(hex格式),如“95”
       * @param outData 输出取出的数据（TLV格式）
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int getTlv(int opCode, java.lang.String tag, byte[] outData) throws android.os.RemoteException;
  /**
       * 读取内核数据列表
       * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
       * @param tags 需要取出的tag列表(hex格式),如{“95”,“9F2A”}
       * @param outData 输出取出的数据（TLV格式）
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int getTlvList(int opCode, java.lang.String[] tags, byte[] outData) throws android.os.RemoteException;
  /**
       * 设置TLV数据
       * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
       * @param tag 要设置的tag(hex格式)，如“95”
       * @param hexValue tag对应的值(hex格式)
       */
  public void setTlv(int opCode, java.lang.String tag, java.lang.String hexValue) throws android.os.RemoteException;
  /**
       * 设置TLV数据列表
       * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
       * @param tags 要设置的tag(hex格式)列表，如{“95”,"5F2A","5F36"}
       * @param hexValues tag对应的值(hex格式)列表
       */
  public void setTlvList(int opCode, java.lang.String[] tags, java.lang.String[] hexValues) throws android.os.RemoteException;
  /**
       * 导入应用选择结果
       * @param selectIndex 应用选择索引，从0开始
       */
  public void importAppSelect(int selectIndex) throws android.os.RemoteException;
  /**
       * 导入最终选择结果
       * @param status 0-成功，非0-失败
       */
  public void importAppFinalSelectStatus(int status) throws android.os.RemoteException;
  /**
       * 导入PIN输入结果
       * @param pinType PIN类型,0-联机PIN，1-脱机PIN
       * @param inputResult PIN输入结果,0-处理成功,1-PIN取消,2-PIN跳过,3-PINPAD故障,4-输PIN超时
       */
  public void importPinInputStatus(int pinType, int inputResult) throws android.os.RemoteException;
  /**
       * 导入签名结果
       * @param status 0-成功，非0-失败
       */
  public void importSignatureStatus(int status) throws android.os.RemoteException;
  /**
       * 导入身份认证结果
       * @param status 0-成功，非0-失败
       */
  public void importCertStatus(int status) throws android.os.RemoteException;
  /**
       * 导入卡号确认结果
       * @param status 0-成功，非0-失败
       */
  public void importCardNoStatus(int status) throws android.os.RemoteException;
  /**
       * 导入联机数据，导入后台下发联机数据，包含发卡行脚本处理
       * @param status 联机结果 0-联机批准 1-联机拒绝 2-联机失败
       * @param tags 联机数据tag列表
       * @param hexValues 连接数据value列表
       * @param outData 脚本执行结果
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int importOnlineProcStatus(int status, java.lang.String[] tags, java.lang.String[] hexValues, byte[] outData) throws android.os.RemoteException;
  /**
       * 读取交易日志
       * @param logType 日志类型,0-交易日志 1-圈存日志
       * @param infoOut 输出日志读取列表
       * @return 0-成功，非0-错误码
       */
  public int readTransLog(int logType, java.util.List<java.lang.String> infoOut) throws android.os.RemoteException;
  /**
       * 中断交易处理流程
       */
  public void abortTransactProcess() throws android.os.RemoteException;
  /**
       * 导入数据交互结果
       * @param status 0-成功，非0-失败
       */
  public void importDataExchangeStatus(int status) throws android.os.RemoteException;
  /**
       * 交易预处理
       * @param transData 交易参数，包含key:
       * amount：交易金额（类型：String）
       * transType：交易类型（类型：String）
       * flowType：流程类型（类型：int）
       * cardType：卡类型（类型：int）
       * cashbackAmount：返现金额（类型：String）
       * emvAuthLevel: EMV认证级别（类型：int）
       * preProcessCompleted：交易预处理完成标志（类型：boolean）
       * @param listener EMV回调接口
       */
  public void transactProcessEx(android.os.Bundle transData, com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2 listener) throws android.os.RemoteException;
  /**
       * 查询电子现金余额
       * @param bundle 输出电子现金余额，包含如下key：
       * 9F51:应用货币代码(Hex)
       * 9F79:电子现金余额(long)
       */
  public int queryECBalance(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 添加或修改一条DRL limitSet
       * @param drl 单条DRL limitSet
       * @returun 0-成功，非0-错误码
       */
  public int addDrlLimitSet(com.sunmi.pay.hardware.aidlv2.bean.DrlV2 drl) throws android.os.RemoteException;
  /**
       * 根据programId的值删除DRL limitSet
       * @param programId 应用程序ID(hex格式)，若为null则清空DRL limitSet
       * @returun 0-成功，非0-错误码
       */
  public int deleteDrlLimitSet(java.lang.String programId) throws android.os.RemoteException;
  /**
       * 设置终端参数
       * @param bundle 包含如下key：
       * supportDRL：是否支持DRL功能(类型：boolean)
       * downloadAidParam：是否下发AID参数(类型：boolean)
       * downloadAidParamAll：是否下发AID参数ALL(类型：boolean)
       * downloadPreParamEP：是否下发EntryPoint预处理参数(类型：boolean)
       * optOnlineRes：优化联机结果(类型：boolean)
       * ledLightingDuration：led点亮时长(类型：int)
       * contactlessManualSelAppGeneral：非接手动选择应用(通用版本)(类型：boolean)
       * contactlessManualSelAppGeneralEx：非接手动选择应用(通用版本)扩展(类型：boolean)
       * contactlessManualSelApp：非接手动选择应用(类型：boolean)
       * importScriptData：联机拒绝导入脚本数据(类型：boolean)
       */
  public void setTermParamEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 查询Aid/Capk列表
       * @param type 类型,0-Aid列表，1-Capk列表
       * @param list 查询到的Aid/Capk列表
       * @return 0-成功，非0-错误码
       */
  public int queryAidCapkList(int type, java.util.List<java.lang.String> list) throws android.os.RemoteException;
  /**
       * 交易预处理
       * @returun 0：成功，非0-错误码
       */
  public int transactPreProcess() throws android.os.RemoteException;
  /**
       * 添加或更新一条RevocationList
       * @param revocList 单条RevocationList
       * @returun 0-成功，非0-错误码
       */
  public int addRevocList(com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 revocList) throws android.os.RemoteException;
  /**
       * 删除一条RevocationList
       * @param revocList 单条RevocationList，若为null则清除所有RevocationList
       * @returun 0-成功，非0-错误码
       */
  public int deleteRevocList(com.sunmi.pay.hardware.aidlv2.bean.RevocListV2 revocList) throws android.os.RemoteException;
  /**
       * 设置终端时间
       * @param timeStamp: 时间戳，单位：ms
       * @returun 0-成功，非0-错误码
       */
  public int sysSetTime(long timeStamp) throws android.os.RemoteException;
  /**
       * 获取终端时间
       * @param outData 输出取出的数据，yyyyMMddHHmmss字符串转成的Hex字节数组
       * <br/>如：hexStringToBytes("20191130142020")
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int sysGetTime(byte[] outData) throws android.os.RemoteException;
  /**
       * 清除终端、卡片数据
       * @param opCode 操作类型, 0-清除所有数据, 1-清除终端数据, 2-清除卡片数据
       * @returun 0:成功, 非0-错误码
       */
  public int clearData(int opCode) throws android.os.RemoteException;
  /**
      * 设置账户数据安全参数
      * @param bundle 入参，包含如下key：
      * encKeySystem:int,密钥体系，包含 0-SEC_MKSK,1-SEC_DUKPT,2-SEC_RSA_KEY,3-SEC_SM2_KEY
      * encKeyIndex:int,磁道数据加密索引，一般传入TDK索引
      * encMode:int,加密模式
      * encIv:byte[]初始向量，加密模式为ECB 传空，为其他加密模式传入8字节向量
      * encPaddingMode:byte 磁道数据进行DES加密时，长度不是8的倍数，则在后面补齐encPaddingMode至长度为8的倍数的数据
      * encMaskStart:int,表示账号前EncMaskStart位为明文，范围是0~6
      * encMaskEnd:int,表示账号后EncMaskEnd位为明文，范围是0~4
      * encMaskWord:char,为0或者是非数字字符，表示账号encMaskStart至encMaskWord为掩码,默认为 *
      * @return 0-成功，非0-错误码
      */
  public int setAccountDataSecParam(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 获取账户安全数据(加密/掩码)
       * @param opCode 操作码，0-普通Tlv数据, 1-PayPass数据, 2-Paywave数据
       * @param tags 需要取出的tag列表(hex格式),如{“5A”,“57”}
       * @param bundle 出参，输出的数据 包含key:
       * tag+Enc,如{“5AEnc”,“57Enc”}:tag加密数据(String)
       * tag+Mask,如{“5AMask”,“57Mask”}:tag掩码数据(String)
       * @return 0-成功，<0-错误码
       */
  public int getAccountSecData(int opCode, java.lang.String[] tags, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 导入终端风险管理结果
       * @param status 0-成功，非0-失败
       */
  public void importTermRiskManagementStatus(int status) throws android.os.RemoteException;
  /**
       * 导入第一次GAC前调用结果
       * @param status 0-成功，非0-失败
       */
  public void importPreFirstGenACStatus(int status) throws android.os.RemoteException;
  /**
       * 导入DataStorage相关数据
       * @param tags DataStorage相关数据tag列表, 如BF10数据, PDOL的更改数据.
       * @param hexValues DataStorage相关数据value列表.
       */
  public void importDataStorage(java.lang.String[] tags, java.lang.String[] hexValues) throws android.os.RemoteException;
  /**
       * 添加EMV回调监听器
       * @param listener EMV回调接口
       */
  public void addEMVDataListener(com.sunmi.pay.hardware.aidlv2.emv.EMVDataListenerV2 listener) throws android.os.RemoteException;
  /**
       * 添加DET数据
       * @return 0-成功，<0-错误码
       */
  public int addDETData(byte[] data) throws android.os.RemoteException;
  /**
       * 数据输入输出处理，可用于调试EMV功能、相关参数的设置和获取，但不可用于控制EMV交易流程
       * @param mode 输入/输出模式 0-输入，1-输出
       * @param procType 处理类型
       * @param inData 输入数据
       * @param outData 输出数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int dataInputOutputProcess(int mode, int procType, byte[] inData, byte[] outData) throws android.os.RemoteException;
  /**
       * 导入PIN输入结果
       * @param pinValue pin值
       * @param inputResult PIN输入结果,0-处理成功,1-PIN取消,2-PIN跳过,3-PINPAD故障,4-输PIN超时
       */
  public void importPinInputStatusForToss(byte[] pinValue, int inputResult) throws android.os.RemoteException;
}
