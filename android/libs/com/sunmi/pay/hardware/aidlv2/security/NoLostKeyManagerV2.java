/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.security;
// Declare any non-default types here with import statements

public interface NoLostKeyManagerV2 extends android.os.IInterface
{
  /** Default implementation for NoLostKeyManagerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2
  {
    //对于Token，默认支持NoLostkey
    //对于其他客户(或机型)，rom提供属性开关，打开/关闭NoLostKey功能
    /**
          * 保存MKSK密钥
          * @param bundle 密钥信息，包含如下key：
          * keyType 密钥类型(int)：KEK/TMK/REC
          * keyValue 密钥数据(byte[])
          * kcvMode kcv模式(int)
          * kcvMacType kcvMac算法类型(int)
          * kcvInData 用于计算kcv的数据(byte[])
          * checkValue 密钥校验值(byte[])
          * encryptIndex 对密钥进行加密的密钥索引(int)
          * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
          * keyIndex 密钥保存的位置索引(int)，范围：0~99
          * isEncrypt 是否密文(bool)
          * variantUsage 扩展变量的用法(int)
          * keyVariant 扩展变量(byte[])
          * dataMode 数据模式(int, ECB/CBCOFB/CFB)
          * iv 初始向量(byte[])
          * @return 0：成功，非0：错误码
          */
    @Override public int saveKey(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 加密数据
          * @param bundle 入参，包含如下key：
          * keyIndex 密钥索引(int)，范围：0~99
          * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
          * dataIn 输入数据，待加密的数据(byte[])
          * encryptionMode 工作模式(int)
          * iv 初始向量(byte[])
          * @param dataOut 计算生成的密文
          * @return 0：成功，非0：错误码
          */
    @Override public int dataEncrypt(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 解密数据
          * @param bundle 入参，包含如下key：
          * keyIndex 密钥索引(int)，范围：0~99
          * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
          * dataIn 输入数据，待解密的数据(byte[])
          * encryptionMode 工作模式(int)
          * iv 初始向量(byte[])
          * @param dataOut 输出数据，解密后的数据
          * @return 0：成功，其他：错误码
          */
    @Override public int dataDecrypt(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取已保存密钥 checkValue (扩展)
          * @param bundle 入参，包含如下key：
          * keySystem 密钥体系(int)，范围：SEC_MKSK
          * keyIndex 密钥索引(int)，范围：keySystem为SEC_MKSK时：0~99
          * kcvMode kcv模式(int)
          * targetAppPkgName 目标应用包名(String)
          * @param dataOut 4字节 checkValue
          * @return 0：成功，<0：错误码
          */
    @Override public int getKeyCheckValue(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 删除密钥
          * @param bundle 入参，包含如下key：
          * keySystem 密钥体系，范围：MKSK/RSA/ECC
          * keyIndex 密钥索引，范围根据keySystem值而定
          * @return  0：成功，<0：错误码
          */
    @Override public int deleteKey(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成RSA公私钥对（仅支持1024/2048位密钥）
          * @param bundle 密钥信息，包含如下key：
          * keyType 密钥类型(int)，范围：0/RSA_KPK/RSA_KEK
          * pvkIndex 私钥索引(int)，范围：0~19
          * keySize 密钥长度(int)，支持1024/2048位密钥
          * pubExponent 公钥指数(String)，Hex格式，支持03/010001
          * @param dataOut Buffer，存放公钥模
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int generateRSAKeypair(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入RSA密钥（仅支持1024/2048位密钥）
          * @param bundle 密钥信息，包含如下key：
          * keyType 密钥类型(int)，范围：0/RSA_KPK/RSA_KEK
          * keyIndex  密钥索引(int)，范围：0~19
          * keySize 密钥长度(int)，支持1024/2048为密钥
          * module 密钥模(String)，Hex格式
          * exponent：指数(String)，Hex格式，支持03/010001
          * @return 0：成功，<0：错误码
          */
    @Override public int injectRSAKey(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取RSA公钥
          * @param keyIndex  公钥索引，范围：0~19
          * @param bundle 出参，包含以下key：
          * module 密钥模(String)，Hex格式
          * exponent：指数(String)，Hex格式，支持03/010001
          * @return 0：成功，<0：错误码
          */
    @Override public int getRsaPubKey(int keyIndex, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * RSA公钥加密或私钥解密
          * @param keyIndex 密钥索引 范围：0~19
          * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
          * @param dataIn 待加密/解密数据，长度小于896字节
          * @param dataOut 加解密结果数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int rsaRecover(int keyIndex, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成ECC公私钥对
          * @param pvkIndex 私钥索引(int)，范围：0~19
          * @param keySize 密钥长度(int)，支持256/384/521位密钥
          * @param dataOut Buffer，存放公钥模
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int generateEccKeypair(int pvkIndex, int keySize, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入ECC公钥
          * @param pukIndex  公钥索引，范围：0~19
          * @param keySize 密钥长度，支持256/384/521位密钥
          * @param pubKey 公钥数据，长度136B
          * @return 0：成功，<0：错误码
          */
    @Override public int injectEccPubKey(int pukIndex, int keySize, byte[] pubKey) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入ECC私钥
          * @param pvkIndex  私钥索引，范围：0~19
          * @param keySize 密钥长度，支持256/384/521位密钥
          * @param pvkKey 私钥数据，长的68B
          * @return 0：成功，<0：错误码
          */
    @Override public int injectEccPvtKey(int pvkIndex, int keySize, byte[] pvkKey) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取ECC公钥
          * @param keyIndex  公钥索引，范围：0~19
          * @param bundle 出参，包含以下key：
          * publicKey 公钥数据(byte[])
          * @return 0：成功，<0：错误码
          */
    @Override public int getEccPubKey(int keyIndex, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * ECC公钥加密/私钥解密
          * @param keyIndex  密钥索引，范围：0~19
          * @param dataIn 输入数据，加密是长度<=256B，解密时<=420B
          * @param dataOut Buffer，存放输出数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int eccRecover(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * ECC私钥签名
          * @param pvkIndex  私钥索引，范围：0~19
          * @param hashType hash算法类型
          * @param dataIn 输入数据，长度大于0
          * @param dataOut Buffer，存放签名数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int eccSign(int pvkIndex, int hashType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * ECC公钥验签
          * @param pukIndex  公钥索引，范围：0~19
          * @param hashType hash算法类型
          * @param dataIn 输入数据
          * @param signData 签名数据
          * @return 0：成功，<0：错误码
          */
    @Override public int eccVerify(int pukIndex, int hashType, byte[] dataIn, byte[] signData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存证书
          * @param bundle 入参，包含如下key：
          * certType 证书类型(int)，0-RSA cert，1-ECC cert
          * certIndex 证书索引(int)，范围：0~9
          * certData 设备证书数据(byte[])
          * @return 0：成功，<0:错误码
          */
    @Override public int saveCert(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取证书
          * @param certIndex 证书索引，范围：0~9
          * @param bundle 出参，包含如下key：
          * certType 证书类型，0-RSA证书，1-ECC证书
          * certData 证书数据（byte[]）
          * @return 0：成功，<0:错误码
          */
    @Override public int getCert(int certIndex, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2.Stub.Proxy(obj);
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
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.saveKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dataEncrypt:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.dataEncrypt(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_dataDecrypt:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.dataDecrypt(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_getKeyCheckValue:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getKeyCheckValue(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_deleteKey:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.deleteKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_generateRSAKeypair:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.generateRSAKeypair(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_injectRSAKey:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectRSAKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getRsaPubKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.getRsaPubKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg1!=null)) {
            reply.writeInt(1);
            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_rsaRecover:
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
          int _result = this.rsaRecover(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_generateEccKeypair:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.generateEccKeypair(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_injectEccPubKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.injectEccPubKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectEccPvtKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.injectEccPvtKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getEccPubKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.getEccPubKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg1!=null)) {
            reply.writeInt(1);
            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_eccRecover:
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
          int _result = this.eccRecover(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_eccSign:
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
          int _result = this.eccSign(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_eccVerify:
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
          int _result = this.eccVerify(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveCert:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.saveCert(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getCert:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.getCert(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg1!=null)) {
            reply.writeInt(1);
            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2
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
      //对于Token，默认支持NoLostkey
      //对于其他客户(或机型)，rom提供属性开关，打开/关闭NoLostKey功能
      /**
            * 保存MKSK密钥
            * @param bundle 密钥信息，包含如下key：
            * keyType 密钥类型(int)：KEK/TMK/REC
            * keyValue 密钥数据(byte[])
            * kcvMode kcv模式(int)
            * kcvMacType kcvMac算法类型(int)
            * kcvInData 用于计算kcv的数据(byte[])
            * checkValue 密钥校验值(byte[])
            * encryptIndex 对密钥进行加密的密钥索引(int)
            * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
            * keyIndex 密钥保存的位置索引(int)，范围：0~99
            * isEncrypt 是否密文(bool)
            * variantUsage 扩展变量的用法(int)
            * keyVariant 扩展变量(byte[])
            * dataMode 数据模式(int, ECB/CBCOFB/CFB)
            * iv 初始向量(byte[])
            * @return 0：成功，非0：错误码
            */
      @Override public int saveKey(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveKey(bundle);
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
            * @param bundle 入参，包含如下key：
            * keyIndex 密钥索引(int)，范围：0~99
            * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
            * dataIn 输入数据，待加密的数据(byte[])
            * encryptionMode 工作模式(int)
            * iv 初始向量(byte[])
            * @param dataOut 计算生成的密文
            * @return 0：成功，非0：错误码
            */
      @Override public int dataEncrypt(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncrypt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncrypt(bundle, dataOut);
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
            * 解密数据
            * @param bundle 入参，包含如下key：
            * keyIndex 密钥索引(int)，范围：0~99
            * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
            * dataIn 输入数据，待解密的数据(byte[])
            * encryptionMode 工作模式(int)
            * iv 初始向量(byte[])
            * @param dataOut 输出数据，解密后的数据
            * @return 0：成功，其他：错误码
            */
      @Override public int dataDecrypt(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecrypt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecrypt(bundle, dataOut);
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
            * 获取已保存密钥 checkValue (扩展)
            * @param bundle 入参，包含如下key：
            * keySystem 密钥体系(int)，范围：SEC_MKSK
            * keyIndex 密钥索引(int)，范围：keySystem为SEC_MKSK时：0~99
            * kcvMode kcv模式(int)
            * targetAppPkgName 目标应用包名(String)
            * @param dataOut 4字节 checkValue
            * @return 0：成功，<0：错误码
            */
      @Override public int getKeyCheckValue(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKeyCheckValue, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getKeyCheckValue(bundle, dataOut);
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
            * 删除密钥
            * @param bundle 入参，包含如下key：
            * keySystem 密钥体系，范围：MKSK/RSA/ECC
            * keyIndex 密钥索引，范围根据keySystem值而定
            * @return  0：成功，<0：错误码
            */
      @Override public int deleteKey(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteKey(bundle);
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
            * 生成RSA公私钥对（仅支持1024/2048位密钥）
            * @param bundle 密钥信息，包含如下key：
            * keyType 密钥类型(int)，范围：0/RSA_KPK/RSA_KEK
            * pvkIndex 私钥索引(int)，范围：0~19
            * keySize 密钥长度(int)，支持1024/2048位密钥
            * pubExponent 公钥指数(String)，Hex格式，支持03/010001
            * @param dataOut Buffer，存放公钥模
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int generateRSAKeypair(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateRSAKeypair, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateRSAKeypair(bundle, dataOut);
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
            * 注入RSA密钥（仅支持1024/2048位密钥）
            * @param bundle 密钥信息，包含如下key：
            * keyType 密钥类型(int)，范围：0/RSA_KPK/RSA_KEK
            * keyIndex  密钥索引(int)，范围：0~19
            * keySize 密钥长度(int)，支持1024/2048为密钥
            * module 密钥模(String)，Hex格式
            * exponent：指数(String)，Hex格式，支持03/010001
            * @return 0：成功，<0：错误码
            */
      @Override public int injectRSAKey(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectRSAKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectRSAKey(bundle);
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
            * 获取RSA公钥
            * @param keyIndex  公钥索引，范围：0~19
            * @param bundle 出参，包含以下key：
            * module 密钥模(String)，Hex格式
            * exponent：指数(String)，Hex格式，支持03/010001
            * @return 0：成功，<0：错误码
            */
      @Override public int getRsaPubKey(int keyIndex, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRsaPubKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRsaPubKey(keyIndex, bundle);
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
            * RSA公钥加密或私钥解密
            * @param keyIndex 密钥索引 范围：0~19
            * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
            * @param dataIn 待加密/解密数据，长度小于896字节
            * @param dataOut 加解密结果数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int rsaRecover(int keyIndex, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(padding);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_rsaRecover, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().rsaRecover(keyIndex, padding, dataIn, dataOut);
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
            * 生成ECC公私钥对
            * @param pvkIndex 私钥索引(int)，范围：0~19
            * @param keySize 密钥长度(int)，支持256/384/521位密钥
            * @param dataOut Buffer，存放公钥模
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int generateEccKeypair(int pvkIndex, int keySize, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvkIndex);
          _data.writeInt(keySize);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateEccKeypair, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateEccKeypair(pvkIndex, keySize, dataOut);
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
            * 注入ECC公钥
            * @param pukIndex  公钥索引，范围：0~19
            * @param keySize 密钥长度，支持256/384/521位密钥
            * @param pubKey 公钥数据，长度136B
            * @return 0：成功，<0：错误码
            */
      @Override public int injectEccPubKey(int pukIndex, int keySize, byte[] pubKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pukIndex);
          _data.writeInt(keySize);
          _data.writeByteArray(pubKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectEccPubKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectEccPubKey(pukIndex, keySize, pubKey);
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
            * 注入ECC私钥
            * @param pvkIndex  私钥索引，范围：0~19
            * @param keySize 密钥长度，支持256/384/521位密钥
            * @param pvkKey 私钥数据，长的68B
            * @return 0：成功，<0：错误码
            */
      @Override public int injectEccPvtKey(int pvkIndex, int keySize, byte[] pvkKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvkIndex);
          _data.writeInt(keySize);
          _data.writeByteArray(pvkKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectEccPvtKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectEccPvtKey(pvkIndex, keySize, pvkKey);
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
            * 获取ECC公钥
            * @param keyIndex  公钥索引，范围：0~19
            * @param bundle 出参，包含以下key：
            * publicKey 公钥数据(byte[])
            * @return 0：成功，<0：错误码
            */
      @Override public int getEccPubKey(int keyIndex, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEccPubKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getEccPubKey(keyIndex, bundle);
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
            * ECC公钥加密/私钥解密
            * @param keyIndex  密钥索引，范围：0~19
            * @param dataIn 输入数据，加密是长度<=256B，解密时<=420B
            * @param dataOut Buffer，存放输出数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int eccRecover(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_eccRecover, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().eccRecover(keyIndex, dataIn, dataOut);
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
            * ECC私钥签名
            * @param pvkIndex  私钥索引，范围：0~19
            * @param hashType hash算法类型
            * @param dataIn 输入数据，长度大于0
            * @param dataOut Buffer，存放签名数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int eccSign(int pvkIndex, int hashType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvkIndex);
          _data.writeInt(hashType);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_eccSign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().eccSign(pvkIndex, hashType, dataIn, dataOut);
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
            * ECC公钥验签
            * @param pukIndex  公钥索引，范围：0~19
            * @param hashType hash算法类型
            * @param dataIn 输入数据
            * @param signData 签名数据
            * @return 0：成功，<0：错误码
            */
      @Override public int eccVerify(int pukIndex, int hashType, byte[] dataIn, byte[] signData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pukIndex);
          _data.writeInt(hashType);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(signData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_eccVerify, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().eccVerify(pukIndex, hashType, dataIn, signData);
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
            * 保存证书
            * @param bundle 入参，包含如下key：
            * certType 证书类型(int)，0-RSA cert，1-ECC cert
            * certIndex 证书索引(int)，范围：0~9
            * certData 设备证书数据(byte[])
            * @return 0：成功，<0:错误码
            */
      @Override public int saveCert(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveCert, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveCert(bundle);
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
            * 获取证书
            * @param certIndex 证书索引，范围：0~9
            * @param bundle 出参，包含如下key：
            * certType 证书类型，0-RSA证书，1-ECC证书
            * certData 证书数据（byte[]）
            * @return 0：成功，<0:错误码
            */
      @Override public int getCert(int certIndex, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCert, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCert(certIndex, bundle);
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
      public static com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2 sDefaultImpl;
    }
    static final int TRANSACTION_saveKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_dataEncrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_dataDecrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getKeyCheckValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_deleteKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_generateRSAKeypair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_injectRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getRsaPubKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_rsaRecover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_generateEccKeypair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_injectEccPubKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_injectEccPvtKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getEccPubKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_eccRecover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_eccSign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_eccVerify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_saveCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  //对于Token，默认支持NoLostkey
  //对于其他客户(或机型)，rom提供属性开关，打开/关闭NoLostKey功能
  /**
        * 保存MKSK密钥
        * @param bundle 密钥信息，包含如下key：
        * keyType 密钥类型(int)：KEK/TMK/REC
        * keyValue 密钥数据(byte[])
        * kcvMode kcv模式(int)
        * kcvMacType kcvMac算法类型(int)
        * kcvInData 用于计算kcv的数据(byte[])
        * checkValue 密钥校验值(byte[])
        * encryptIndex 对密钥进行加密的密钥索引(int)
        * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
        * keyIndex 密钥保存的位置索引(int)，范围：0~99
        * isEncrypt 是否密文(bool)
        * variantUsage 扩展变量的用法(int)
        * keyVariant 扩展变量(byte[])
        * dataMode 数据模式(int, ECB/CBCOFB/CFB)
        * iv 初始向量(byte[])
        * @return 0：成功，非0：错误码
        */
  public int saveKey(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 加密数据
        * @param bundle 入参，包含如下key：
        * keyIndex 密钥索引(int)，范围：0~99
        * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
        * dataIn 输入数据，待加密的数据(byte[])
        * encryptionMode 工作模式(int)
        * iv 初始向量(byte[])
        * @param dataOut 计算生成的密文
        * @return 0：成功，非0：错误码
        */
  public int dataEncrypt(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 解密数据
        * @param bundle 入参，包含如下key：
        * keyIndex 密钥索引(int)，范围：0~99
        * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
        * dataIn 输入数据，待解密的数据(byte[])
        * encryptionMode 工作模式(int)
        * iv 初始向量(byte[])
        * @param dataOut 输出数据，解密后的数据
        * @return 0：成功，其他：错误码
        */
  public int dataDecrypt(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取已保存密钥 checkValue (扩展)
        * @param bundle 入参，包含如下key：
        * keySystem 密钥体系(int)，范围：SEC_MKSK
        * keyIndex 密钥索引(int)，范围：keySystem为SEC_MKSK时：0~99
        * kcvMode kcv模式(int)
        * targetAppPkgName 目标应用包名(String)
        * @param dataOut 4字节 checkValue
        * @return 0：成功，<0：错误码
        */
  public int getKeyCheckValue(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 删除密钥
        * @param bundle 入参，包含如下key：
        * keySystem 密钥体系，范围：MKSK/RSA/ECC
        * keyIndex 密钥索引，范围根据keySystem值而定
        * @return  0：成功，<0：错误码
        */
  public int deleteKey(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 生成RSA公私钥对（仅支持1024/2048位密钥）
        * @param bundle 密钥信息，包含如下key：
        * keyType 密钥类型(int)，范围：0/RSA_KPK/RSA_KEK
        * pvkIndex 私钥索引(int)，范围：0~19
        * keySize 密钥长度(int)，支持1024/2048位密钥
        * pubExponent 公钥指数(String)，Hex格式，支持03/010001
        * @param dataOut Buffer，存放公钥模
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int generateRSAKeypair(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 注入RSA密钥（仅支持1024/2048位密钥）
        * @param bundle 密钥信息，包含如下key：
        * keyType 密钥类型(int)，范围：0/RSA_KPK/RSA_KEK
        * keyIndex  密钥索引(int)，范围：0~19
        * keySize 密钥长度(int)，支持1024/2048为密钥
        * module 密钥模(String)，Hex格式
        * exponent：指数(String)，Hex格式，支持03/010001
        * @return 0：成功，<0：错误码
        */
  public int injectRSAKey(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 获取RSA公钥
        * @param keyIndex  公钥索引，范围：0~19
        * @param bundle 出参，包含以下key：
        * module 密钥模(String)，Hex格式
        * exponent：指数(String)，Hex格式，支持03/010001
        * @return 0：成功，<0：错误码
        */
  public int getRsaPubKey(int keyIndex, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * RSA公钥加密或私钥解密
        * @param keyIndex 密钥索引 范围：0~19
        * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
        * @param dataIn 待加密/解密数据，长度小于896字节
        * @param dataOut 加解密结果数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int rsaRecover(int keyIndex, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 生成ECC公私钥对
        * @param pvkIndex 私钥索引(int)，范围：0~19
        * @param keySize 密钥长度(int)，支持256/384/521位密钥
        * @param dataOut Buffer，存放公钥模
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int generateEccKeypair(int pvkIndex, int keySize, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 注入ECC公钥
        * @param pukIndex  公钥索引，范围：0~19
        * @param keySize 密钥长度，支持256/384/521位密钥
        * @param pubKey 公钥数据，长度136B
        * @return 0：成功，<0：错误码
        */
  public int injectEccPubKey(int pukIndex, int keySize, byte[] pubKey) throws android.os.RemoteException;
  /**
        * 注入ECC私钥
        * @param pvkIndex  私钥索引，范围：0~19
        * @param keySize 密钥长度，支持256/384/521位密钥
        * @param pvkKey 私钥数据，长的68B
        * @return 0：成功，<0：错误码
        */
  public int injectEccPvtKey(int pvkIndex, int keySize, byte[] pvkKey) throws android.os.RemoteException;
  /**
        * 获取ECC公钥
        * @param keyIndex  公钥索引，范围：0~19
        * @param bundle 出参，包含以下key：
        * publicKey 公钥数据(byte[])
        * @return 0：成功，<0：错误码
        */
  public int getEccPubKey(int keyIndex, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * ECC公钥加密/私钥解密
        * @param keyIndex  密钥索引，范围：0~19
        * @param dataIn 输入数据，加密是长度<=256B，解密时<=420B
        * @param dataOut Buffer，存放输出数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int eccRecover(int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * ECC私钥签名
        * @param pvkIndex  私钥索引，范围：0~19
        * @param hashType hash算法类型
        * @param dataIn 输入数据，长度大于0
        * @param dataOut Buffer，存放签名数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int eccSign(int pvkIndex, int hashType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * ECC公钥验签
        * @param pukIndex  公钥索引，范围：0~19
        * @param hashType hash算法类型
        * @param dataIn 输入数据
        * @param signData 签名数据
        * @return 0：成功，<0：错误码
        */
  public int eccVerify(int pukIndex, int hashType, byte[] dataIn, byte[] signData) throws android.os.RemoteException;
  /**
        * 保存证书
        * @param bundle 入参，包含如下key：
        * certType 证书类型(int)，0-RSA cert，1-ECC cert
        * certIndex 证书索引(int)，范围：0~9
        * certData 设备证书数据(byte[])
        * @return 0：成功，<0:错误码
        */
  public int saveCert(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 获取证书
        * @param certIndex 证书索引，范围：0~9
        * @param bundle 出参，包含如下key：
        * certType 证书类型，0-RSA证书，1-ECC证书
        * certData 证书数据（byte[]）
        * @return 0：成功，<0:错误码
        */
  public int getCert(int certIndex, android.os.Bundle bundle) throws android.os.RemoteException;
}
