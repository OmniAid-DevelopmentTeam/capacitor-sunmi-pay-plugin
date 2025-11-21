/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl;
// Declare any non-default types here with import statements
/**
 * 获取设备操作的统一句柄，返回接口实现类
 */
public interface DeviceProvide extends android.os.IInterface
{
  /** Default implementation for DeviceProvide. */
  public static class Default implements com.sunmi.pay.hardware.aidl.DeviceProvide
  {
    /**
        * 获取基础操作模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.system.BasicOpt getBasicOpt() throws android.os.RemoteException
    {
      return null;
    }
    /**
        * 获取读卡模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt getReadCardOpt() throws android.os.RemoteException
    {
      return null;
    }
    /**
        * 获取PinPad操作模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt getPinPadOpt() throws android.os.RemoteException
    {
      return null;
    }
    /**
        * 获取EMV操作模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.emv.EMVOpt getEMVOpt() throws android.os.RemoteException
    {
      return null;
    }
    /**
        * 获取RSA安全相关操作模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.security.SecurityOpt getSecurityOpt() throws android.os.RemoteException
    {
      return null;
    }
    /** 设置Binder，监听客户端进程是否死掉 */
    @Override public int setBinder(android.os.IBinder client) throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 获取打印机相关操作模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.print.PrinterOpt getPrinterOpt() throws android.os.RemoteException
    {
      return null;
    }
    /**
        * 获取税控操作模块
        * @deprecated
        */
    @Override public com.sunmi.pay.hardware.aidl.tax.TaxOpt getTaxOpt() throws android.os.RemoteException
    {
      return null;
    }
    /*===================V2版本接口===================*//**获取基础操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 getBasicOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取读卡模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 getReadCardOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取PinPad操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 getPinPadOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取EMV操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 getEMVOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取RSA安全相关操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 getSecurityOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取打印机相关操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 getPrinterOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取税控操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2 getTaxOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取ETC操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 getETCOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取Test操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.test.TestOptV2 getTestOptV2() throws android.os.RemoteException
    {
      return null;
    }
    /**获取DevCertManagerV2操作模块*/
    @Override public com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 getDevCertManagerV2() throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 获取各个操作模块
         * @param name 操作模块的名称
         */
    @Override public android.os.IBinder getOptBinderV2(java.lang.String name) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.DeviceProvide
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.DeviceProvide";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.DeviceProvide interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.DeviceProvide asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.DeviceProvide))) {
        return ((com.sunmi.pay.hardware.aidl.DeviceProvide)iin);
      }
      return new com.sunmi.pay.hardware.aidl.DeviceProvide.Stub.Proxy(obj);
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
        case TRANSACTION_getBasicOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.system.BasicOpt _result = this.getBasicOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getReadCardOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt _result = this.getReadCardOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getPinPadOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt _result = this.getPinPadOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getEMVOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.emv.EMVOpt _result = this.getEMVOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getSecurityOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.security.SecurityOpt _result = this.getSecurityOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setBinder:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          int _result = this.setBinder(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.print.PrinterOpt _result = this.getPrinterOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getTaxOpt:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.tax.TaxOpt _result = this.getTaxOpt();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getBasicOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 _result = this.getBasicOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getReadCardOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 _result = this.getReadCardOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getPinPadOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 _result = this.getPinPadOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getEMVOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 _result = this.getEMVOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getSecurityOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 _result = this.getSecurityOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getPrinterOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 _result = this.getPrinterOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getTaxOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2 _result = this.getTaxOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getETCOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 _result = this.getETCOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getTestOptV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.test.TestOptV2 _result = this.getTestOptV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getDevCertManagerV2:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 _result = this.getDevCertManagerV2();
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getOptBinderV2:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.IBinder _result = this.getOptBinderV2(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.DeviceProvide
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
          * 获取基础操作模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.system.BasicOpt getBasicOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.system.BasicOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBasicOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getBasicOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.system.BasicOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取读卡模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt getReadCardOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getReadCardOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getReadCardOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取PinPad操作模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt getPinPadOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPinPadOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPinPadOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取EMV操作模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.emv.EMVOpt getEMVOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.emv.EMVOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEMVOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getEMVOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.emv.EMVOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取RSA安全相关操作模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.security.SecurityOpt getSecurityOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.security.SecurityOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSecurityOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSecurityOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.security.SecurityOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** 设置Binder，监听客户端进程是否死掉 */
      @Override public int setBinder(android.os.IBinder client) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(client);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBinder, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setBinder(client);
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
          * 获取打印机相关操作模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.print.PrinterOpt getPrinterOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.print.PrinterOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.print.PrinterOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取税控操作模块
          * @deprecated
          */
      @Override public com.sunmi.pay.hardware.aidl.tax.TaxOpt getTaxOpt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidl.tax.TaxOpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTaxOpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTaxOpt();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidl.tax.TaxOpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*===================V2版本接口===================*//**获取基础操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 getBasicOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBasicOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getBasicOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.system.BasicOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取读卡模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 getReadCardOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getReadCardOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getReadCardOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取PinPad操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 getPinPadOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPinPadOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPinPadOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取EMV操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 getEMVOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEMVOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getEMVOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取RSA安全相关操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 getSecurityOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSecurityOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSecurityOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取打印机相关操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 getPrinterOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取税控操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2 getTaxOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTaxOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTaxOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取ETC操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 getETCOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getETCOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getETCOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取Test操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.test.TestOptV2 getTestOptV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.test.TestOptV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTestOptV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTestOptV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.test.TestOptV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**获取DevCertManagerV2操作模块*/
      @Override public com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 getDevCertManagerV2() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDevCertManagerV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDevCertManagerV2();
          }
          _reply.readException();
          _result = com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 获取各个操作模块
           * @param name 操作模块的名称
           */
      @Override public android.os.IBinder getOptBinderV2(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.IBinder _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOptBinderV2, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getOptBinderV2(name);
          }
          _reply.readException();
          _result = _reply.readStrongBinder();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidl.DeviceProvide sDefaultImpl;
    }
    static final int TRANSACTION_getBasicOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getReadCardOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getPinPadOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getEMVOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getSecurityOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setBinder = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getPrinterOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getTaxOpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getBasicOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getReadCardOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getPinPadOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getEMVOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getSecurityOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getPrinterOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getTaxOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getETCOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getTestOptV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getDevCertManagerV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getOptBinderV2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.DeviceProvide impl) {
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
    public static com.sunmi.pay.hardware.aidl.DeviceProvide getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
      * 获取基础操作模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.system.BasicOpt getBasicOpt() throws android.os.RemoteException;
  /**
      * 获取读卡模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt getReadCardOpt() throws android.os.RemoteException;
  /**
      * 获取PinPad操作模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt getPinPadOpt() throws android.os.RemoteException;
  /**
      * 获取EMV操作模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.emv.EMVOpt getEMVOpt() throws android.os.RemoteException;
  /**
      * 获取RSA安全相关操作模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.security.SecurityOpt getSecurityOpt() throws android.os.RemoteException;
  /** 设置Binder，监听客户端进程是否死掉 */
  public int setBinder(android.os.IBinder client) throws android.os.RemoteException;
  /**
      * 获取打印机相关操作模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.print.PrinterOpt getPrinterOpt() throws android.os.RemoteException;
  /**
      * 获取税控操作模块
      * @deprecated
      */
  public com.sunmi.pay.hardware.aidl.tax.TaxOpt getTaxOpt() throws android.os.RemoteException;
  /*===================V2版本接口===================*//**获取基础操作模块*/
  public com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 getBasicOptV2() throws android.os.RemoteException;
  /**获取读卡模块*/
  public com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 getReadCardOptV2() throws android.os.RemoteException;
  /**获取PinPad操作模块*/
  public com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 getPinPadOptV2() throws android.os.RemoteException;
  /**获取EMV操作模块*/
  public com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2 getEMVOptV2() throws android.os.RemoteException;
  /**获取RSA安全相关操作模块*/
  public com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 getSecurityOptV2() throws android.os.RemoteException;
  /**获取打印机相关操作模块*/
  public com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 getPrinterOptV2() throws android.os.RemoteException;
  /**获取税控操作模块*/
  public com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2 getTaxOptV2() throws android.os.RemoteException;
  /**获取ETC操作模块*/
  public com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2 getETCOptV2() throws android.os.RemoteException;
  /**获取Test操作模块*/
  public com.sunmi.pay.hardware.aidlv2.test.TestOptV2 getTestOptV2() throws android.os.RemoteException;
  /**获取DevCertManagerV2操作模块*/
  public com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2 getDevCertManagerV2() throws android.os.RemoteException;
  /**
       * 获取各个操作模块
       * @param name 操作模块的名称
       */
  public android.os.IBinder getOptBinderV2(java.lang.String name) throws android.os.RemoteException;
}
