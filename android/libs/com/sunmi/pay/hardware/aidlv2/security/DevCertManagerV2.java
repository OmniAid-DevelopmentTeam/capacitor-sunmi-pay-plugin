/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.security;
// Declare any non-default types here with import statements

public interface DevCertManagerV2 extends android.os.IInterface
{
  /** Default implementation for DevCertManagerV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2
  {
    /**
          * 保存设备证书与密文私钥
          * @param certIndex 证书索引，范围9001-9008
          * @param mode 模式，4-ECB模式，注入私钥密文使用
          * @param encryptIndex 对密文私钥进行解密的密钥索引
          * @param certData 设备证书数据
          * @param pvkData 私钥密文数据
          * @return 0：成功，其他：错误码
          */
    @Override public int storeDeviceCertPrivateKey(int certIndex, int mode, int encryptIndex, byte[] certData, byte[] pvkData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取保存的设备证书
          * @param certIndex 证书索引，范围9001-9008
          * @param dataOut 出参buffer，存放证书数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int getDeviceCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 设备证书对应的私钥运算
          * @param keyIndex 证书索引，范围9001-9008
          * @param mode 加解密类型-专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
          * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
          * @param dataIn 待加密/解密数据，长度小于896字节
          * @param dataOut 加解密结果数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int devicePrivateKeyRecover(int keyIndex, int mode, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取指定索引的公钥证书和私钥状态
          * @param certIndex 证书索引，范围9001-9008
          * @return 0：正常，<0：错误码
          */
    @Override public int getDevKeyState(int certIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成设备证书公私钥数据到指定索引
          * @param certIndex 证书索引，范围9001-9008
          * @param mode 模式
          * @param dataOut 公钥模
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int genDevKey(int certIndex, int mode, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存设备证书数据到指定索引
          * @param certIndex 证书索引，范围9001-9008
          * @param certData 设备证书数据
          * @return 0：成功，<0:错误码
          */
    @Override public int saveDevCert(int certIndex, byte[] certData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 删除指定索引的公钥证书+设备私钥
          * @param certIndex 证书索引，范围9001-9008
          * @return 0：成功，<0：错误码
          */
    @Override public int deleteKey(int certIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 指定包名获取保存的设备证书
          * @param bundle 入参，包含如下key：
          * targetPkgName(String)，目标APP的包名，不可为null
          * certIndex(int)，证书索引，范围9001-9008
          * @param dataOut 出参buffer，存放证书数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int getDeviceCertificateEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 根据证书物理索引查询证书映射记录（白名单程序专用）
          * @param keyIndexMapped 证书的物理索引
          * @param bundle 出参，包含如下key：
          * pkgName APP的包名(String)，不可为null
          * signature APP的开发者证书(String)，HEX格式
          * certIndex 证书的原始索引(int)，范围9001-9008
          * @return 0：成功，<0：错误码
          */
    @Override public int queryPhysicalDevCertWL(int keyIndexMapped, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 设备证书对应的私钥运算（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标APP的包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * certIndex 证书索引(int)，范围9001-9008
          * mode 加解密类型(int), 专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
          * padding 填充模式(int)，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
          * dataIn 待加密/解密数据(byte[])，长度小于896字节
          * @param dataOut 加解密结果数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int devicePrivateKeyRecoverWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成设备证书公私钥数据到指定索引（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标APP的包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * certIndex 证书索引(int)，范围9001-9008
          * mode 模式(int)
          * @param dataOut 公钥模
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int genDevKeyWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存设备证书到指定索引（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标APP的包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * certIndex 证书索引(int)，范围9001-9008
          * certData 设备证书数据(byte[])
          * @return 0：成功，<0:错误码
          */
    @Override public int saveDevCertWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 删除指定索引的公钥证书+设备私钥（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标APP的包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
          * certIndex 证书索引，范围9001-9008
          * @return 0：成功，<0：错误码
          */
    @Override public int deleteKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2.Stub.Proxy(obj);
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
        case TRANSACTION_storeDeviceCertPrivateKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _result = this.storeDeviceCertPrivateKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getDeviceCertificate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getDeviceCertificate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_devicePrivateKeyRecover:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
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
          int _result = this.devicePrivateKeyRecover(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_getDevKeyState:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getDevKeyState(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_genDevKey:
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
          int _result = this.genDevKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_saveDevCert:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.saveDevCert(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.deleteKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getDeviceCertificateEx:
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
          int _result = this.getDeviceCertificateEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_queryPhysicalDevCertWL:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.queryPhysicalDevCertWL(_arg0, _arg1);
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
        case TRANSACTION_devicePrivateKeyRecoverWL:
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
          int _result = this.devicePrivateKeyRecoverWL(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_genDevKeyWL:
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
          int _result = this.genDevKeyWL(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_saveDevCertWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.saveDevCertWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteKeyWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.deleteKeyWL(_arg0);
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2
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
            * 保存设备证书与密文私钥
            * @param certIndex 证书索引，范围9001-9008
            * @param mode 模式，4-ECB模式，注入私钥密文使用
            * @param encryptIndex 对密文私钥进行解密的密钥索引
            * @param certData 设备证书数据
            * @param pvkData 私钥密文数据
            * @return 0：成功，其他：错误码
            */
      @Override public int storeDeviceCertPrivateKey(int certIndex, int mode, int encryptIndex, byte[] certData, byte[] pvkData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          _data.writeInt(mode);
          _data.writeInt(encryptIndex);
          _data.writeByteArray(certData);
          _data.writeByteArray(pvkData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeDeviceCertPrivateKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().storeDeviceCertPrivateKey(certIndex, mode, encryptIndex, certData, pvkData);
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
            * 获取保存的设备证书
            * @param certIndex 证书索引，范围9001-9008
            * @param dataOut 出参buffer，存放证书数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int getDeviceCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDeviceCertificate(certIndex, dataOut);
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
            * 设备证书对应的私钥运算
            * @param keyIndex 证书索引，范围9001-9008
            * @param mode 加解密类型-专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
            * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
            * @param dataIn 待加密/解密数据，长度小于896字节
            * @param dataOut 加解密结果数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int devicePrivateKeyRecover(int keyIndex, int mode, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(mode);
          _data.writeInt(padding);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_devicePrivateKeyRecover, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().devicePrivateKeyRecover(keyIndex, mode, padding, dataIn, dataOut);
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
            * 获取指定索引的公钥证书和私钥状态
            * @param certIndex 证书索引，范围9001-9008
            * @return 0：正常，<0：错误码
            */
      @Override public int getDevKeyState(int certIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDevKeyState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDevKeyState(certIndex);
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
            * 生成设备证书公私钥数据到指定索引
            * @param certIndex 证书索引，范围9001-9008
            * @param mode 模式
            * @param dataOut 公钥模
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int genDevKey(int certIndex, int mode, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          _data.writeInt(mode);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_genDevKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().genDevKey(certIndex, mode, dataOut);
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
            * 保存设备证书数据到指定索引
            * @param certIndex 证书索引，范围9001-9008
            * @param certData 设备证书数据
            * @return 0：成功，<0:错误码
            */
      @Override public int saveDevCert(int certIndex, byte[] certData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          _data.writeByteArray(certData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveDevCert, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveDevCert(certIndex, certData);
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
            * 删除指定索引的公钥证书+设备私钥
            * @param certIndex 证书索引，范围9001-9008
            * @return 0：成功，<0：错误码
            */
      @Override public int deleteKey(int certIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteKey(certIndex);
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
            * 指定包名获取保存的设备证书
            * @param bundle 入参，包含如下key：
            * targetPkgName(String)，目标APP的包名，不可为null
            * certIndex(int)，证书索引，范围9001-9008
            * @param dataOut 出参buffer，存放证书数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int getDeviceCertificateEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceCertificateEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDeviceCertificateEx(bundle, dataOut);
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
            * 根据证书物理索引查询证书映射记录（白名单程序专用）
            * @param keyIndexMapped 证书的物理索引
            * @param bundle 出参，包含如下key：
            * pkgName APP的包名(String)，不可为null
            * signature APP的开发者证书(String)，HEX格式
            * certIndex 证书的原始索引(int)，范围9001-9008
            * @return 0：成功，<0：错误码
            */
      @Override public int queryPhysicalDevCertWL(int keyIndexMapped, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndexMapped);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryPhysicalDevCertWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryPhysicalDevCertWL(keyIndexMapped, bundle);
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
            * 设备证书对应的私钥运算（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标APP的包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * certIndex 证书索引(int)，范围9001-9008
            * mode 加解密类型(int), 专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
            * padding 填充模式(int)，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
            * dataIn 待加密/解密数据(byte[])，长度小于896字节
            * @param dataOut 加解密结果数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int devicePrivateKeyRecoverWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_devicePrivateKeyRecoverWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().devicePrivateKeyRecoverWL(bundle, dataOut);
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
            * 生成设备证书公私钥数据到指定索引（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标APP的包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * certIndex 证书索引(int)，范围9001-9008
            * mode 模式(int)
            * @param dataOut 公钥模
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int genDevKeyWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_genDevKeyWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().genDevKeyWL(bundle, dataOut);
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
            * 保存设备证书到指定索引（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标APP的包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * certIndex 证书索引(int)，范围9001-9008
            * certData 设备证书数据(byte[])
            * @return 0：成功，<0:错误码
            */
      @Override public int saveDevCertWL(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveDevCertWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveDevCertWL(bundle);
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
            * 删除指定索引的公钥证书+设备私钥（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标APP的包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
            * certIndex 证书索引，范围9001-9008
            * @return 0：成功，<0：错误码
            */
      @Override public int deleteKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKeyWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteKeyWL(bundle);
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
      public static com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 sDefaultImpl;
    }
    static final int TRANSACTION_storeDeviceCertPrivateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getDeviceCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_devicePrivateKeyRecover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getDevKeyState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_genDevKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_saveDevCert = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_deleteKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getDeviceCertificateEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_queryPhysicalDevCertWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_devicePrivateKeyRecoverWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_genDevKeyWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_saveDevCertWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_deleteKeyWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
        * 保存设备证书与密文私钥
        * @param certIndex 证书索引，范围9001-9008
        * @param mode 模式，4-ECB模式，注入私钥密文使用
        * @param encryptIndex 对密文私钥进行解密的密钥索引
        * @param certData 设备证书数据
        * @param pvkData 私钥密文数据
        * @return 0：成功，其他：错误码
        */
  public int storeDeviceCertPrivateKey(int certIndex, int mode, int encryptIndex, byte[] certData, byte[] pvkData) throws android.os.RemoteException;
  /**
        * 获取保存的设备证书
        * @param certIndex 证书索引，范围9001-9008
        * @param dataOut 出参buffer，存放证书数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int getDeviceCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 设备证书对应的私钥运算
        * @param keyIndex 证书索引，范围9001-9008
        * @param mode 加解密类型-专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
        * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
        * @param dataIn 待加密/解密数据，长度小于896字节
        * @param dataOut 加解密结果数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int devicePrivateKeyRecover(int keyIndex, int mode, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取指定索引的公钥证书和私钥状态
        * @param certIndex 证书索引，范围9001-9008
        * @return 0：正常，<0：错误码
        */
  public int getDevKeyState(int certIndex) throws android.os.RemoteException;
  /**
        * 生成设备证书公私钥数据到指定索引
        * @param certIndex 证书索引，范围9001-9008
        * @param mode 模式
        * @param dataOut 公钥模
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int genDevKey(int certIndex, int mode, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存设备证书数据到指定索引
        * @param certIndex 证书索引，范围9001-9008
        * @param certData 设备证书数据
        * @return 0：成功，<0:错误码
        */
  public int saveDevCert(int certIndex, byte[] certData) throws android.os.RemoteException;
  /**
        * 删除指定索引的公钥证书+设备私钥
        * @param certIndex 证书索引，范围9001-9008
        * @return 0：成功，<0：错误码
        */
  public int deleteKey(int certIndex) throws android.os.RemoteException;
  /**
        * 指定包名获取保存的设备证书
        * @param bundle 入参，包含如下key：
        * targetPkgName(String)，目标APP的包名，不可为null
        * certIndex(int)，证书索引，范围9001-9008
        * @param dataOut 出参buffer，存放证书数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int getDeviceCertificateEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 根据证书物理索引查询证书映射记录（白名单程序专用）
        * @param keyIndexMapped 证书的物理索引
        * @param bundle 出参，包含如下key：
        * pkgName APP的包名(String)，不可为null
        * signature APP的开发者证书(String)，HEX格式
        * certIndex 证书的原始索引(int)，范围9001-9008
        * @return 0：成功，<0：错误码
        */
  public int queryPhysicalDevCertWL(int keyIndexMapped, android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 设备证书对应的私钥运算（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标APP的包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * certIndex 证书索引(int)，范围9001-9008
        * mode 加解密类型(int), 专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
        * padding 填充模式(int)，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
        * dataIn 待加密/解密数据(byte[])，长度小于896字节
        * @param dataOut 加解密结果数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int devicePrivateKeyRecoverWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 生成设备证书公私钥数据到指定索引（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标APP的包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * certIndex 证书索引(int)，范围9001-9008
        * mode 模式(int)
        * @param dataOut 公钥模
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int genDevKeyWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存设备证书到指定索引（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标APP的包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * certIndex 证书索引(int)，范围9001-9008
        * certData 设备证书数据(byte[])
        * @return 0：成功，<0:错误码
        */
  public int saveDevCertWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 删除指定索引的公钥证书+设备私钥（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标APP的包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
        * certIndex 证书索引，范围9001-9008
        * @return 0：成功，<0：错误码
        */
  public int deleteKeyWL(android.os.Bundle bundle) throws android.os.RemoteException;
}
