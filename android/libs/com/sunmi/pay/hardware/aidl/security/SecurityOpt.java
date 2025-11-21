/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.security;
// Declare any non-default types here with import statements
/** @deprecated */
public interface SecurityOpt extends android.os.IInterface
{
  /** Default implementation for SecurityOpt. */
  public static class Default implements com.sunmi.pay.hardware.aidl.security.SecurityOpt
  {
    /**
          * 保存密钥
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param encryptIndex 用于解密密钥密文的索引，注意，这里是TMK的索引
          * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
          * @param keyIndex 密钥保存的位置索引
          * @param isEncrypt 是否密文
          * @return 0：成功，非0：错误码
          * @deprecated
          */
    @Override public int saveKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex, boolean isEncrypt) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 加密数据
          * @param keyIndex 加密密钥索引
          * @param dataIn  用于进行加密计算的源数据
          * @param dataOut 计算生成的密文
          * @return 0：成功，非0：错误码
          * @deprecated
          */
    @Override public int dataEncrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 实现数据MAC计算或校验
          * @param keyIndex :MAC索引
          * @param macType ：MAC加密算法
          * @param dataIn  用于进行MAC计算的源数据
          * @param dataOut 计算生成的MAC值
          * @return 大于0：计算完成的MAC数据长度，其他：错误码
          * @deprecated
          */
    @Override public int calcMac(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取密文硬件序列号
          * @param dataIn  用于计算密文的分散值(加密随机因子,取值说明：银行卡交易采用2域卡号后6位,扫码付交易采用C2B码后6位)
          * @param dataOut 计算生成的密文
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int getEncryptTUSN(java.lang.String dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存SM4密钥
          * @param dataIn 密钥数据
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int storeSM4Key(byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 使用保存的SM4密钥加密
          * @param dataIn  用于进行加密计算的源数据
          * @param dataOut 计算生成的密文
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取安全状态
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int getSecStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 验证apk签名
          * @param hashMessage  哈希值
          * @param signData 私钥加密的哈希值
          * @return 0：成功，其他：错误码
          *  @deprecated
          */
    @Override public int verifyApkSign(byte[] hashMessage, byte[] signData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 读取授权状态
          * @param type  授权类型
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public java.lang.String getAuthStatus(int type) throws android.os.RemoteException
    {
      return null;
    }
    /**
          * 获取终端状态 “Factory”,“Release”
          * @return null：出错，“Factory”：工厂模式，“Release”：Release模式
          * @deprecated
          */
    @Override public java.lang.String getTermStatus() throws android.os.RemoteException
    {
      return null;
    }
    /**
          * 将终端状态设置为 “Release”
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int setTermStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 请求授权
          * @param reqType  授权类型
          * @param authCode 授权码
          * @param SN       字符串，设备SN
          * @param authData 输出授权数据，256字节
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int sysRequestAuth(byte reqType, int authCode, java.lang.String SN, byte[] authData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 确认授权
          * @param dataIn 授权数据，512字节
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int sysConfirmAuth(byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 存储终端认证密钥
          * @param dataInPuk 终端认证公钥及签名 512位
          * @param dataInPvk 终端认证私钥 251位
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取终端认证公钥及签名
          * @param dataOut 输出数据，512字节
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int readTerminalPuk(byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取终端认证数据
          * @param dataIn 输入数据，256字节
          * @param dataOut 输出数据，256字节
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 存储基础密钥
          * @param destinationIndex 需要保存的密钥索引，[1,200]
          * @param keyData 密钥数据密文 256位
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int saveBaseKey(int destinationIndex, byte[] keyData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 解密数据
          * @param keyIndex 如果是保留区密钥，制定保留区的密钥索引
          * @param dataIn 输入数据，待解密的数据
          * @param dataOut 输出数据,解密后的数据
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int dataDecrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存DUKPT密钥
          * @param   keyValue 密钥数据
          * @param   checkValue 密钥校验值
          * @param   ksn
          * @param   encryptIndex 用于解密密钥密文的索引
          * @param   encryptType  密钥算法
          * @param   keyIndex 保存的索引 (范围为0-9)
          * @param   bool isEncrypt 是否密文
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int saveKeyDukpt(byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptIndex, int encryptType, int keyIndex, boolean isEncrypt) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥计算mac
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   macType  mac算法
          * @param   dataIn   待计算的mac数据
          * @param   dataOut  mac 结果
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int calcMacDukpt(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥加密数据
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   dataIn   待加密数据
          * @param   dataOut  加密结果
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int dataEncryptDukpt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥解密数据
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   dataIn   待解密数据
          * @param   dataOut  加密结果
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int dataDecryptDukpt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 密钥操作
          * @param   keySystem  密钥体系，参照AidlConstants.Security
          * @param   keyIndex 密钥索引keySystem为SEC_DUKPT时索引范围为0-9，keySystem为SEC_MKSK时索引范围为0-199
          * @param   ctrlCode 查看 AidlConstants.Security
          * @param   dataOut  密钥操作结果  1.ctrlCode 为SEC_CTRL_GETKCV时，dataOut长度为4
          *                                2.ctrlCode 为SEC_CTRL_DUKPT_ADD_KSN时，dataOut长度为0
          *                                3.ctrlCode 为SEC_CTRL_DUKPT_GET_KSN时，dataOut长度为10
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int calcSecKey(int keySystem, int keyIndex, int ctrlCode, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM1加密数据
          * @param   dataIn 待加密明文
          * @param   sk(默认16字节)
          * @param   ak(默认16字节)
          * @param   ek(默认16字节)
          * @param   encryptionMode  加密模式 CBC,ECB
          * @param   iv(默认16字节)
          * @param   dataOut
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm1EncryptData(byte[] dataIn, byte[] sk, byte[] ak, byte[] ek, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM1 解密数据
          * @param   dataIn 待加密明文
          * @param   sk(默认16字节)
          * @param   ak(默认16字节)
          * @param   ek(默认16字节)
          * @param   encryptionMode  加密模式 CBC,ECB
          * @param   iv(默认16字节)
          * @param   dataOut
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm1DecryptData(byte[] dataIn, byte[] sk, byte[] ak, byte[] ek, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2 加密数据
          * @param   dataIn
          * @param   key（加密密钥默认64字节）
          * @param   dataOut 256 字节
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm2EncryptData(byte[] dataIn, byte[] key, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2 解密数据
          * @param   dataIn
          * @param   key（解密密钥默认32字节）
          * @param   dataOut
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm2DecryptData(byte[] dataIn, byte[] key, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2 签名
          * @param   userId
          * @param   dataIn（待签名数据）
          * @param   pubKey（默认64字节）
          * @param   priKey （默认32字节）
          * @param   sign 签名后输出（64字节）
          * @param   eValue 待运算数据的E值
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm2SignData(byte[] userId, byte[] dataIn, byte[] pubKey, byte[] priKey, byte[] sign, byte[] eValue) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2 验签
          * @param   userId
          * @param   dataIn（待签名数据）
          * @param   pubKey（默认64字节）
          * @param   priKey （默认32字节）
          * @param   sign 签名后输出（64字节）
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm2VerifySign(byte[] userId, byte[] dataIn, byte[] pubKey, byte[] priKey, byte[] sign) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2 验签
          * @param   userId
          * @param   dataIn
          * @param   dataOut 签名后输出（32字节）
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm3CalHash(byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM4 加密数据
          * @param   dataIn 待加密明文数据
          * @param   key  密钥数据16 字节
          * @param   encryptMode 加密模式：ECB – 0，CBC – 1
          * @param   dataOut
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm4EncryptData(byte[] dataIn, byte[] key, int encryptMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM4 加密数据
          * @param   dataIn 待解密密文数据
          * @param   key  密钥数据16 字节
          * @param   encryptMode 加密模式：ECB – 0，CBC – 1
          * @param   dataOut
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int sm4DecryptData(byte[] dataIn, byte[] key, int encryptMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM4 MAC计算
          * @param   macKey Mac密钥
          * @param   iv  16字节
          * @param   dataIn 待计算数据
          * @param   dataOut 16字节
          * @return  0：成功，<0：错误码
          * @deprecated
          */
    @Override public int calcSM4Mac(byte[] macKey, byte[] iv, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.security.SecurityOpt
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.security.SecurityOpt";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.security.SecurityOpt interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.security.SecurityOpt asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.security.SecurityOpt))) {
        return ((com.sunmi.pay.hardware.aidl.security.SecurityOpt)iin);
      }
      return new com.sunmi.pay.hardware.aidl.security.SecurityOpt.Stub.Proxy(obj);
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
        case TRANSACTION_saveKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          boolean _arg6;
          _arg6 = (0!=data.readInt());
          int _result = this.saveKey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dataEncrypt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.dataEncrypt(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_calcMac:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcMac(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_getEncryptTUSN:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getEncryptTUSN(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_storeSM4Key:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.storeSM4Key(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_encryptDataBySM4Key:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.encryptDataBySM4Key(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_getSecStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.getSecStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_verifyApkSign:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.verifyApkSign(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getAuthStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getAuthStatus(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getTermStatus:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getTermStatus();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setTermStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.setTermStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysRequestAuth:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.sysRequestAuth(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_sysConfirmAuth:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sysConfirmAuth(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveTerminalKey:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.saveTerminalKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_readTerminalPuk:
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
          int _result = this.readTerminalPuk(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_getTerminalCertData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getTerminalCertData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_saveBaseKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.saveBaseKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dataDecrypt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.dataDecrypt(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_saveKeyDukpt:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          boolean _arg6;
          _arg6 = (0!=data.readInt());
          int _result = this.saveKeyDukpt(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_calcMacDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcMacDukpt(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_dataEncryptDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.dataEncryptDukpt(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_dataDecryptDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.dataDecryptDukpt(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_calcSecKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcSecKey(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_sm1EncryptData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          byte[] _arg6;
          int _arg6_length = data.readInt();
          if ((_arg6_length<0)) {
            _arg6 = null;
          }
          else {
            _arg6 = new byte[_arg6_length];
          }
          int _result = this.sm1EncryptData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg6);
          return true;
        }
        case TRANSACTION_sm1DecryptData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          byte[] _arg6;
          int _arg6_length = data.readInt();
          if ((_arg6_length<0)) {
            _arg6 = null;
          }
          else {
            _arg6 = new byte[_arg6_length];
          }
          int _result = this.sm1DecryptData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg6);
          return true;
        }
        case TRANSACTION_sm2EncryptData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sm2EncryptData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_sm2DecryptData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sm2DecryptData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_sm2SignData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          byte[] _arg5;
          int _arg5_length = data.readInt();
          if ((_arg5_length<0)) {
            _arg5 = null;
          }
          else {
            _arg5 = new byte[_arg5_length];
          }
          int _result = this.sm2SignData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          reply.writeByteArray(_arg5);
          return true;
        }
        case TRANSACTION_sm2VerifySign:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _result = this.sm2VerifySign(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sm3CalHash:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sm3CalHash(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_sm4EncryptData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.sm4EncryptData(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_sm4DecryptData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.sm4DecryptData(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_calcSM4Mac:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcSM4Mac(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.security.SecurityOpt
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
            * 保存密钥
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param encryptIndex 用于解密密钥密文的索引，注意，这里是TMK的索引
            * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
            * @param keyIndex 密钥保存的位置索引
            * @param isEncrypt 是否密文
            * @return 0：成功，非0：错误码
            * @deprecated
            */
      @Override public int saveKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex, boolean isEncrypt) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(encryptIndex);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          _data.writeInt(((isEncrypt)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveKey(keyType, keyValue, checkValue, encryptIndex, keyAlgType, keyIndex, isEncrypt);
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
            * 加密数据
            * @param keyIndex 加密密钥索引
            * @param dataIn  用于进行加密计算的源数据
            * @param dataOut 计算生成的密文
            * @return 0：成功，非0：错误码
            * @deprecated
            */
      @Override public int dataEncrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncrypt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncrypt(keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 实现数据MAC计算或校验
            * @param keyIndex :MAC索引
            * @param macType ：MAC加密算法
            * @param dataIn  用于进行MAC计算的源数据
            * @param dataOut 计算生成的MAC值
            * @return 大于0：计算完成的MAC数据长度，其他：错误码
            * @deprecated
            */
      @Override public int calcMac(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(macType);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMac, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMac(keyIndex, macType, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取密文硬件序列号
            * @param dataIn  用于计算密文的分散值(加密随机因子,取值说明：银行卡交易采用2域卡号后6位,扫码付交易采用C2B码后6位)
            * @param dataOut 计算生成的密文
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int getEncryptTUSN(java.lang.String dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEncryptTUSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getEncryptTUSN(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存SM4密钥
            * @param dataIn 密钥数据
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int storeSM4Key(byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeSM4Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().storeSM4Key(dataIn);
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
            * 使用保存的SM4密钥加密
            * @param dataIn  用于进行加密计算的源数据
            * @param dataOut 计算生成的密文
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_encryptDataBySM4Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().encryptDataBySM4Key(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取安全状态
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int getSecStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSecStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSecStatus();
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
            * 验证apk签名
            * @param hashMessage  哈希值
            * @param signData 私钥加密的哈希值
            * @return 0：成功，其他：错误码
            *  @deprecated
            */
      @Override public int verifyApkSign(byte[] hashMessage, byte[] signData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(hashMessage);
          _data.writeByteArray(signData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_verifyApkSign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().verifyApkSign(hashMessage, signData);
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
            * 读取授权状态
            * @param type  授权类型
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public java.lang.String getAuthStatus(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAuthStatus(type);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取终端状态 “Factory”,“Release”
            * @return null：出错，“Factory”：工厂模式，“Release”：Release模式
            * @deprecated
            */
      @Override public java.lang.String getTermStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTermStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTermStatus();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 将终端状态设置为 “Release”
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int setTermStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTermStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setTermStatus();
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
            * 请求授权
            * @param reqType  授权类型
            * @param authCode 授权码
            * @param SN       字符串，设备SN
            * @param authData 输出授权数据，256字节
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int sysRequestAuth(byte reqType, int authCode, java.lang.String SN, byte[] authData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(reqType);
          _data.writeInt(authCode);
          _data.writeString(SN);
          if ((authData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(authData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysRequestAuth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysRequestAuth(reqType, authCode, SN, authData);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(authData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 确认授权
            * @param dataIn 授权数据，512字节
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int sysConfirmAuth(byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysConfirmAuth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysConfirmAuth(dataIn);
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
            * 存储终端认证密钥
            * @param dataInPuk 终端认证公钥及签名 512位
            * @param dataInPvk 终端认证私钥 251位
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataInPuk);
          _data.writeByteArray(dataInPvk);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveTerminalKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveTerminalKey(dataInPuk, dataInPvk);
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
            * 获取终端认证公钥及签名
            * @param dataOut 输出数据，512字节
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int readTerminalPuk(byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_readTerminalPuk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readTerminalPuk(dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取终端认证数据
            * @param dataIn 输入数据，256字节
            * @param dataOut 输出数据，256字节
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTerminalCertData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTerminalCertData(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 存储基础密钥
            * @param destinationIndex 需要保存的密钥索引，[1,200]
            * @param keyData 密钥数据密文 256位
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int saveBaseKey(int destinationIndex, byte[] keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(destinationIndex);
          _data.writeByteArray(keyData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveBaseKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveBaseKey(destinationIndex, keyData);
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
            * 解密数据
            * @param keyIndex 如果是保留区密钥，制定保留区的密钥索引
            * @param dataIn 输入数据，待解密的数据
            * @param dataOut 输出数据,解密后的数据
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int dataDecrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecrypt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecrypt(keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存DUKPT密钥
            * @param   keyValue 密钥数据
            * @param   checkValue 密钥校验值
            * @param   ksn
            * @param   encryptIndex 用于解密密钥密文的索引
            * @param   encryptType  密钥算法
            * @param   keyIndex 保存的索引 (范围为0-9)
            * @param   bool isEncrypt 是否密文
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int saveKeyDukpt(byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptIndex, int encryptType, int keyIndex, boolean isEncrypt) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(ksn);
          _data.writeInt(encryptIndex);
          _data.writeInt(encryptType);
          _data.writeInt(keyIndex);
          _data.writeInt(((isEncrypt)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveKeyDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveKeyDukpt(keyValue, checkValue, ksn, encryptIndex, encryptType, keyIndex, isEncrypt);
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
            * DUKPT密钥计算mac
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   macType  mac算法
            * @param   dataIn   待计算的mac数据
            * @param   dataOut  mac 结果
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int calcMacDukpt(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(macType);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMacDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMacDukpt(keyIndex, macType, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥加密数据
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   dataIn   待加密数据
            * @param   dataOut  加密结果
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int dataEncryptDukpt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncryptDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncryptDukpt(keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥解密数据
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   dataIn   待解密数据
            * @param   dataOut  加密结果
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int dataDecryptDukpt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecryptDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecryptDukpt(keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 密钥操作
            * @param   keySystem  密钥体系，参照AidlConstants.Security
            * @param   keyIndex 密钥索引keySystem为SEC_DUKPT时索引范围为0-9，keySystem为SEC_MKSK时索引范围为0-199
            * @param   ctrlCode 查看 AidlConstants.Security
            * @param   dataOut  密钥操作结果  1.ctrlCode 为SEC_CTRL_GETKCV时，dataOut长度为4
            *                                2.ctrlCode 为SEC_CTRL_DUKPT_ADD_KSN时，dataOut长度为0
            *                                3.ctrlCode 为SEC_CTRL_DUKPT_GET_KSN时，dataOut长度为10
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int calcSecKey(int keySystem, int keyIndex, int ctrlCode, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySystem);
          _data.writeInt(keyIndex);
          _data.writeInt(ctrlCode);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcSecKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcSecKey(keySystem, keyIndex, ctrlCode, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM1加密数据
            * @param   dataIn 待加密明文
            * @param   sk(默认16字节)
            * @param   ak(默认16字节)
            * @param   ek(默认16字节)
            * @param   encryptionMode  加密模式 CBC,ECB
            * @param   iv(默认16字节)
            * @param   dataOut
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm1EncryptData(byte[] dataIn, byte[] sk, byte[] ak, byte[] ek, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(sk);
          _data.writeByteArray(ak);
          _data.writeByteArray(ek);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm1EncryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm1EncryptData(dataIn, sk, ak, ek, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM1 解密数据
            * @param   dataIn 待加密明文
            * @param   sk(默认16字节)
            * @param   ak(默认16字节)
            * @param   ek(默认16字节)
            * @param   encryptionMode  加密模式 CBC,ECB
            * @param   iv(默认16字节)
            * @param   dataOut
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm1DecryptData(byte[] dataIn, byte[] sk, byte[] ak, byte[] ek, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(sk);
          _data.writeByteArray(ak);
          _data.writeByteArray(ek);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm1DecryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm1DecryptData(dataIn, sk, ak, ek, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2 加密数据
            * @param   dataIn
            * @param   key（加密密钥默认64字节）
            * @param   dataOut 256 字节
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm2EncryptData(byte[] dataIn, byte[] key, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(key);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2EncryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2EncryptData(dataIn, key, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2 解密数据
            * @param   dataIn
            * @param   key（解密密钥默认32字节）
            * @param   dataOut
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm2DecryptData(byte[] dataIn, byte[] key, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(key);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2DecryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2DecryptData(dataIn, key, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2 签名
            * @param   userId
            * @param   dataIn（待签名数据）
            * @param   pubKey（默认64字节）
            * @param   priKey （默认32字节）
            * @param   sign 签名后输出（64字节）
            * @param   eValue 待运算数据的E值
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm2SignData(byte[] userId, byte[] dataIn, byte[] pubKey, byte[] priKey, byte[] sign, byte[] eValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(userId);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(pubKey);
          _data.writeByteArray(priKey);
          if ((sign==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(sign.length);
          }
          if ((eValue==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(eValue.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2SignData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2SignData(userId, dataIn, pubKey, priKey, sign, eValue);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(sign);
          _reply.readByteArray(eValue);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2 验签
            * @param   userId
            * @param   dataIn（待签名数据）
            * @param   pubKey（默认64字节）
            * @param   priKey （默认32字节）
            * @param   sign 签名后输出（64字节）
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm2VerifySign(byte[] userId, byte[] dataIn, byte[] pubKey, byte[] priKey, byte[] sign) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(userId);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(pubKey);
          _data.writeByteArray(priKey);
          _data.writeByteArray(sign);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2VerifySign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2VerifySign(userId, dataIn, pubKey, priKey, sign);
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
            * SM2 验签
            * @param   userId
            * @param   dataIn
            * @param   dataOut 签名后输出（32字节）
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm3CalHash(byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(userId);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm3CalHash, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm3CalHash(userId, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM4 加密数据
            * @param   dataIn 待加密明文数据
            * @param   key  密钥数据16 字节
            * @param   encryptMode 加密模式：ECB – 0，CBC – 1
            * @param   dataOut
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm4EncryptData(byte[] dataIn, byte[] key, int encryptMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(key);
          _data.writeInt(encryptMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm4EncryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm4EncryptData(dataIn, key, encryptMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM4 加密数据
            * @param   dataIn 待解密密文数据
            * @param   key  密钥数据16 字节
            * @param   encryptMode 加密模式：ECB – 0，CBC – 1
            * @param   dataOut
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int sm4DecryptData(byte[] dataIn, byte[] key, int encryptMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(key);
          _data.writeInt(encryptMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm4DecryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm4DecryptData(dataIn, key, encryptMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM4 MAC计算
            * @param   macKey Mac密钥
            * @param   iv  16字节
            * @param   dataIn 待计算数据
            * @param   dataOut 16字节
            * @return  0：成功，<0：错误码
            * @deprecated
            */
      @Override public int calcSM4Mac(byte[] macKey, byte[] iv, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(macKey);
          _data.writeByteArray(iv);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcSM4Mac, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcSM4Mac(macKey, iv, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidl.security.SecurityOpt sDefaultImpl;
    }
    static final int TRANSACTION_saveKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_dataEncrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_calcMac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getEncryptTUSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_storeSM4Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_encryptDataBySM4Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getSecStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_verifyApkSign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getAuthStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getTermStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setTermStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_sysRequestAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_sysConfirmAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_saveTerminalKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_readTerminalPuk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getTerminalCertData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_saveBaseKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_dataDecrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_saveKeyDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_calcMacDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_dataEncryptDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_dataDecryptDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_calcSecKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_sm1EncryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_sm1DecryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_sm2EncryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_sm2DecryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_sm2SignData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_sm2VerifySign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_sm3CalHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_sm4EncryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_sm4DecryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_calcSM4Mac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.security.SecurityOpt impl) {
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
    public static com.sunmi.pay.hardware.aidl.security.SecurityOpt getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
        * 保存密钥
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param encryptIndex 用于解密密钥密文的索引，注意，这里是TMK的索引
        * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
        * @param keyIndex 密钥保存的位置索引
        * @param isEncrypt 是否密文
        * @return 0：成功，非0：错误码
        * @deprecated
        */
  public int saveKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex, boolean isEncrypt) throws android.os.RemoteException;
  /**
        * 加密数据
        * @param keyIndex 加密密钥索引
        * @param dataIn  用于进行加密计算的源数据
        * @param dataOut 计算生成的密文
        * @return 0：成功，非0：错误码
        * @deprecated
        */
  public int dataEncrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 实现数据MAC计算或校验
        * @param keyIndex :MAC索引
        * @param macType ：MAC加密算法
        * @param dataIn  用于进行MAC计算的源数据
        * @param dataOut 计算生成的MAC值
        * @return 大于0：计算完成的MAC数据长度，其他：错误码
        * @deprecated
        */
  public int calcMac(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取密文硬件序列号
        * @param dataIn  用于计算密文的分散值(加密随机因子,取值说明：银行卡交易采用2域卡号后6位,扫码付交易采用C2B码后6位)
        * @param dataOut 计算生成的密文
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int getEncryptTUSN(java.lang.String dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存SM4密钥
        * @param dataIn 密钥数据
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int storeSM4Key(byte[] dataIn) throws android.os.RemoteException;
  /**
        * 使用保存的SM4密钥加密
        * @param dataIn  用于进行加密计算的源数据
        * @param dataOut 计算生成的密文
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取安全状态
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int getSecStatus() throws android.os.RemoteException;
  /**
        * 验证apk签名
        * @param hashMessage  哈希值
        * @param signData 私钥加密的哈希值
        * @return 0：成功，其他：错误码
        *  @deprecated
        */
  public int verifyApkSign(byte[] hashMessage, byte[] signData) throws android.os.RemoteException;
  /**
        * 读取授权状态
        * @param type  授权类型
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public java.lang.String getAuthStatus(int type) throws android.os.RemoteException;
  /**
        * 获取终端状态 “Factory”,“Release”
        * @return null：出错，“Factory”：工厂模式，“Release”：Release模式
        * @deprecated
        */
  public java.lang.String getTermStatus() throws android.os.RemoteException;
  /**
        * 将终端状态设置为 “Release”
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int setTermStatus() throws android.os.RemoteException;
  /**
        * 请求授权
        * @param reqType  授权类型
        * @param authCode 授权码
        * @param SN       字符串，设备SN
        * @param authData 输出授权数据，256字节
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int sysRequestAuth(byte reqType, int authCode, java.lang.String SN, byte[] authData) throws android.os.RemoteException;
  /**
        * 确认授权
        * @param dataIn 授权数据，512字节
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int sysConfirmAuth(byte[] dataIn) throws android.os.RemoteException;
  /**
        * 存储终端认证密钥
        * @param dataInPuk 终端认证公钥及签名 512位
        * @param dataInPvk 终端认证私钥 251位
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws android.os.RemoteException;
  /**
        * 获取终端认证公钥及签名
        * @param dataOut 输出数据，512字节
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int readTerminalPuk(byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取终端认证数据
        * @param dataIn 输入数据，256字节
        * @param dataOut 输出数据，256字节
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 存储基础密钥
        * @param destinationIndex 需要保存的密钥索引，[1,200]
        * @param keyData 密钥数据密文 256位
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int saveBaseKey(int destinationIndex, byte[] keyData) throws android.os.RemoteException;
  /**
        * 解密数据
        * @param keyIndex 如果是保留区密钥，制定保留区的密钥索引
        * @param dataIn 输入数据，待解密的数据
        * @param dataOut 输出数据,解密后的数据
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int dataDecrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存DUKPT密钥
        * @param   keyValue 密钥数据
        * @param   checkValue 密钥校验值
        * @param   ksn
        * @param   encryptIndex 用于解密密钥密文的索引
        * @param   encryptType  密钥算法
        * @param   keyIndex 保存的索引 (范围为0-9)
        * @param   bool isEncrypt 是否密文
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int saveKeyDukpt(byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptIndex, int encryptType, int keyIndex, boolean isEncrypt) throws android.os.RemoteException;
  /**
        * DUKPT密钥计算mac
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   macType  mac算法
        * @param   dataIn   待计算的mac数据
        * @param   dataOut  mac 结果
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int calcMacDukpt(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥加密数据
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   dataIn   待加密数据
        * @param   dataOut  加密结果
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int dataEncryptDukpt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥解密数据
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   dataIn   待解密数据
        * @param   dataOut  加密结果
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int dataDecryptDukpt(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 密钥操作
        * @param   keySystem  密钥体系，参照AidlConstants.Security
        * @param   keyIndex 密钥索引keySystem为SEC_DUKPT时索引范围为0-9，keySystem为SEC_MKSK时索引范围为0-199
        * @param   ctrlCode 查看 AidlConstants.Security
        * @param   dataOut  密钥操作结果  1.ctrlCode 为SEC_CTRL_GETKCV时，dataOut长度为4
        *                                2.ctrlCode 为SEC_CTRL_DUKPT_ADD_KSN时，dataOut长度为0
        *                                3.ctrlCode 为SEC_CTRL_DUKPT_GET_KSN时，dataOut长度为10
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int calcSecKey(int keySystem, int keyIndex, int ctrlCode, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM1加密数据
        * @param   dataIn 待加密明文
        * @param   sk(默认16字节)
        * @param   ak(默认16字节)
        * @param   ek(默认16字节)
        * @param   encryptionMode  加密模式 CBC,ECB
        * @param   iv(默认16字节)
        * @param   dataOut
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm1EncryptData(byte[] dataIn, byte[] sk, byte[] ak, byte[] ek, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM1 解密数据
        * @param   dataIn 待加密明文
        * @param   sk(默认16字节)
        * @param   ak(默认16字节)
        * @param   ek(默认16字节)
        * @param   encryptionMode  加密模式 CBC,ECB
        * @param   iv(默认16字节)
        * @param   dataOut
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm1DecryptData(byte[] dataIn, byte[] sk, byte[] ak, byte[] ek, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM2 加密数据
        * @param   dataIn
        * @param   key（加密密钥默认64字节）
        * @param   dataOut 256 字节
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm2EncryptData(byte[] dataIn, byte[] key, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM2 解密数据
        * @param   dataIn
        * @param   key（解密密钥默认32字节）
        * @param   dataOut
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm2DecryptData(byte[] dataIn, byte[] key, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM2 签名
        * @param   userId
        * @param   dataIn（待签名数据）
        * @param   pubKey（默认64字节）
        * @param   priKey （默认32字节）
        * @param   sign 签名后输出（64字节）
        * @param   eValue 待运算数据的E值
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm2SignData(byte[] userId, byte[] dataIn, byte[] pubKey, byte[] priKey, byte[] sign, byte[] eValue) throws android.os.RemoteException;
  /**
        * SM2 验签
        * @param   userId
        * @param   dataIn（待签名数据）
        * @param   pubKey（默认64字节）
        * @param   priKey （默认32字节）
        * @param   sign 签名后输出（64字节）
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm2VerifySign(byte[] userId, byte[] dataIn, byte[] pubKey, byte[] priKey, byte[] sign) throws android.os.RemoteException;
  /**
        * SM2 验签
        * @param   userId
        * @param   dataIn
        * @param   dataOut 签名后输出（32字节）
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm3CalHash(byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM4 加密数据
        * @param   dataIn 待加密明文数据
        * @param   key  密钥数据16 字节
        * @param   encryptMode 加密模式：ECB – 0，CBC – 1
        * @param   dataOut
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm4EncryptData(byte[] dataIn, byte[] key, int encryptMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM4 加密数据
        * @param   dataIn 待解密密文数据
        * @param   key  密钥数据16 字节
        * @param   encryptMode 加密模式：ECB – 0，CBC – 1
        * @param   dataOut
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int sm4DecryptData(byte[] dataIn, byte[] key, int encryptMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM4 MAC计算
        * @param   macKey Mac密钥
        * @param   iv  16字节
        * @param   dataIn 待计算数据
        * @param   dataOut 16字节
        * @return  0：成功，<0：错误码
        * @deprecated
        */
  public int calcSM4Mac(byte[] macKey, byte[] iv, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
}
