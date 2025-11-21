/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.system;
// Declare any non-default types here with import statements
/** @deprecated */
public interface BasicOpt extends android.os.IInterface
{
  /** Default implementation for BasicOpt. */
  public static class Default implements com.sunmi.pay.hardware.aidl.system.BasicOpt
  {
    /**
         * 获取系统参数
         * 功能>通过用户参数关键字，读取系统资源关键字的属性
         * @param key：用户参数关键字,含义如下：
         * <li>“SDKVer”-SDK版本查询</li>
         * <li>“HardwareVer”-设备硬件版本</li>
         * <li>“FirmwareVer”-设备固件版本</li>
         * <li>“SN”-获取机器SN号</li>
         * <li>“PN”-获取机器SN1(PN)渠道自定义SN号</li>
         * <li>“TUSN”-获取机器银联TUSN号</li>
         * <li>“DeviceCode”-获取设备型号</li>
         * <li>“DeviceModel”-获取机型</li>
         * @return 所查询的属性值
         * @deprecated
         */
    @Override public java.lang.String getSysParam(java.lang.String key) throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 设置系统参数
         * 功能>写入资源窗口关键字的属性
         * @param key：用户参数关键字
         * @param value：关键字属性值
         * @return 0 – 成功,<0 – 写入失败
         * @deprecated
         */
    @Override public int setSysParam(java.lang.String key, java.lang.String value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 蜂鸣器
         * 功能>控制设备上的蜂鸣器响
         * @param times：连续鸣响次数
         * @return 0 – 成功 非0 其他错误
         * @deprecated
         */
    @Override public int buzzerOnDevice(int times) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * LED灯控制
         * 功能>设备上的LED灯状态
         * @param ledIndex: 设备上的LED索引，1~4；1-红，2-绿，3-黄，4-蓝
         * @param ledStatus：LED状态，1表示LED灭，0表示LED亮
         * @return 0 – 成功 非0 其他错误
         * @deprecated
         */
    @Override public int ledStatusOnDevice(int ledIndex, int ledStatus) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置屏幕独占
         * 功能>设置屏幕独占 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键
         * @param mode：设置屏幕独占的模式，1：设置屏幕独占，-1设置取消屏幕独占
         * @return 0 – 成功 非0 其他错误
         * @deprecated
         */
    @Override public int setScreenMode(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SP重启
         * @deprecated
         */
    @Override public void resetSP() throws android.os.RemoteException
    {
    }
    /**
         * 设备电源管理
         * 功能>设备电源管理
         * @param mode：0  SYS_POWER_SLEEP---设备进入休眠
         *              1  SYS_POWER_REBOOT---设备重启
         *              2  SYS_POWER_SHUTDOWN---设备关机
         * @deprecated
         */
    @Override public int sysPowerManager(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取随机数
         * 功能>获取随机数
         * @param randData：随机数
         * @param len：要获取的随机数长度
         * @deprecated
         */
    @Override public int sysGetRandom(byte[] randData, int len) throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 获取SP数据
        * 功能>获取SP数据
        * @param data：数据
        * @param len：数据长度
        */
    @Override public int sysGetDebugData(byte[] data, int len) throws android.os.RemoteException
    {
      return 0;
    }
    /**
        * 向SP发数据
        * 功能>向SP发数据
        * @param data：数据
        * @param len：数据长度
        */
    @Override public int sysPutDebugData(byte[] data, int len) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.system.BasicOpt
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.system.BasicOpt";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.system.BasicOpt interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.system.BasicOpt asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.system.BasicOpt))) {
        return ((com.sunmi.pay.hardware.aidl.system.BasicOpt)iin);
      }
      return new com.sunmi.pay.hardware.aidl.system.BasicOpt.Stub.Proxy(obj);
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
        case TRANSACTION_getSysParam:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.getSysParam(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setSysParam:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.setSysParam(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_buzzerOnDevice:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.buzzerOnDevice(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_ledStatusOnDevice:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.ledStatusOnDevice(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setScreenMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setScreenMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_resetSP:
        {
          data.enforceInterface(descriptor);
          this.resetSP();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sysPowerManager:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.sysPowerManager(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysGetRandom:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.sysGetRandom(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_sysGetDebugData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.sysGetDebugData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_sysPutDebugData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.sysPutDebugData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.system.BasicOpt
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
           * 获取系统参数
           * 功能>通过用户参数关键字，读取系统资源关键字的属性
           * @param key：用户参数关键字,含义如下：
           * <li>“SDKVer”-SDK版本查询</li>
           * <li>“HardwareVer”-设备硬件版本</li>
           * <li>“FirmwareVer”-设备固件版本</li>
           * <li>“SN”-获取机器SN号</li>
           * <li>“PN”-获取机器SN1(PN)渠道自定义SN号</li>
           * <li>“TUSN”-获取机器银联TUSN号</li>
           * <li>“DeviceCode”-获取设备型号</li>
           * <li>“DeviceModel”-获取机型</li>
           * @return 所查询的属性值
           * @deprecated
           */
      @Override public java.lang.String getSysParam(java.lang.String key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSysParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSysParam(key);
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
           * 设置系统参数
           * 功能>写入资源窗口关键字的属性
           * @param key：用户参数关键字
           * @param value：关键字属性值
           * @return 0 – 成功,<0 – 写入失败
           * @deprecated
           */
      @Override public int setSysParam(java.lang.String key, java.lang.String value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(key);
          _data.writeString(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSysParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setSysParam(key, value);
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
           * 蜂鸣器
           * 功能>控制设备上的蜂鸣器响
           * @param times：连续鸣响次数
           * @return 0 – 成功 非0 其他错误
           * @deprecated
           */
      @Override public int buzzerOnDevice(int times) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(times);
          boolean _status = mRemote.transact(Stub.TRANSACTION_buzzerOnDevice, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().buzzerOnDevice(times);
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
           * LED灯控制
           * 功能>设备上的LED灯状态
           * @param ledIndex: 设备上的LED索引，1~4；1-红，2-绿，3-黄，4-蓝
           * @param ledStatus：LED状态，1表示LED灭，0表示LED亮
           * @return 0 – 成功 非0 其他错误
           * @deprecated
           */
      @Override public int ledStatusOnDevice(int ledIndex, int ledStatus) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ledIndex);
          _data.writeInt(ledStatus);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ledStatusOnDevice, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ledStatusOnDevice(ledIndex, ledStatus);
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
           * 设置屏幕独占
           * 功能>设置屏幕独占 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键
           * @param mode：设置屏幕独占的模式，1：设置屏幕独占，-1设置取消屏幕独占
           * @return 0 – 成功 非0 其他错误
           * @deprecated
           */
      @Override public int setScreenMode(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setScreenMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setScreenMode(mode);
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
           * SP重启
           * @deprecated
           */
      @Override public void resetSP() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resetSP, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().resetSP();
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
           * 设备电源管理
           * 功能>设备电源管理
           * @param mode：0  SYS_POWER_SLEEP---设备进入休眠
           *              1  SYS_POWER_REBOOT---设备重启
           *              2  SYS_POWER_SHUTDOWN---设备关机
           * @deprecated
           */
      @Override public int sysPowerManager(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysPowerManager, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysPowerManager(mode);
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
           * 获取随机数
           * 功能>获取随机数
           * @param randData：随机数
           * @param len：要获取的随机数长度
           * @deprecated
           */
      @Override public int sysGetRandom(byte[] randData, int len) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(randData);
          _data.writeInt(len);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysGetRandom, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysGetRandom(randData, len);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(randData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 获取SP数据
          * 功能>获取SP数据
          * @param data：数据
          * @param len：数据长度
          */
      @Override public int sysGetDebugData(byte[] data, int len) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeInt(len);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysGetDebugData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysGetDebugData(data, len);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(data);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
          * 向SP发数据
          * 功能>向SP发数据
          * @param data：数据
          * @param len：数据长度
          */
      @Override public int sysPutDebugData(byte[] data, int len) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeInt(len);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysPutDebugData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysPutDebugData(data, len);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(data);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidl.system.BasicOpt sDefaultImpl;
    }
    static final int TRANSACTION_getSysParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setSysParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_buzzerOnDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_ledStatusOnDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setScreenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_resetSP = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_sysPowerManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_sysGetRandom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_sysGetDebugData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_sysPutDebugData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.system.BasicOpt impl) {
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
    public static com.sunmi.pay.hardware.aidl.system.BasicOpt getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 获取系统参数
       * 功能>通过用户参数关键字，读取系统资源关键字的属性
       * @param key：用户参数关键字,含义如下：
       * <li>“SDKVer”-SDK版本查询</li>
       * <li>“HardwareVer”-设备硬件版本</li>
       * <li>“FirmwareVer”-设备固件版本</li>
       * <li>“SN”-获取机器SN号</li>
       * <li>“PN”-获取机器SN1(PN)渠道自定义SN号</li>
       * <li>“TUSN”-获取机器银联TUSN号</li>
       * <li>“DeviceCode”-获取设备型号</li>
       * <li>“DeviceModel”-获取机型</li>
       * @return 所查询的属性值
       * @deprecated
       */
  public java.lang.String getSysParam(java.lang.String key) throws android.os.RemoteException;
  /**
       * 设置系统参数
       * 功能>写入资源窗口关键字的属性
       * @param key：用户参数关键字
       * @param value：关键字属性值
       * @return 0 – 成功,<0 – 写入失败
       * @deprecated
       */
  public int setSysParam(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
  /**
       * 蜂鸣器
       * 功能>控制设备上的蜂鸣器响
       * @param times：连续鸣响次数
       * @return 0 – 成功 非0 其他错误
       * @deprecated
       */
  public int buzzerOnDevice(int times) throws android.os.RemoteException;
  /**
       * LED灯控制
       * 功能>设备上的LED灯状态
       * @param ledIndex: 设备上的LED索引，1~4；1-红，2-绿，3-黄，4-蓝
       * @param ledStatus：LED状态，1表示LED灭，0表示LED亮
       * @return 0 – 成功 非0 其他错误
       * @deprecated
       */
  public int ledStatusOnDevice(int ledIndex, int ledStatus) throws android.os.RemoteException;
  /**
       * 设置屏幕独占
       * 功能>设置屏幕独占 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键
       * @param mode：设置屏幕独占的模式，1：设置屏幕独占，-1设置取消屏幕独占
       * @return 0 – 成功 非0 其他错误
       * @deprecated
       */
  public int setScreenMode(int mode) throws android.os.RemoteException;
  /**
       * SP重启
       * @deprecated
       */
  public void resetSP() throws android.os.RemoteException;
  /**
       * 设备电源管理
       * 功能>设备电源管理
       * @param mode：0  SYS_POWER_SLEEP---设备进入休眠
       *              1  SYS_POWER_REBOOT---设备重启
       *              2  SYS_POWER_SHUTDOWN---设备关机
       * @deprecated
       */
  public int sysPowerManager(int mode) throws android.os.RemoteException;
  /**
       * 获取随机数
       * 功能>获取随机数
       * @param randData：随机数
       * @param len：要获取的随机数长度
       * @deprecated
       */
  public int sysGetRandom(byte[] randData, int len) throws android.os.RemoteException;
  /**
      * 获取SP数据
      * 功能>获取SP数据
      * @param data：数据
      * @param len：数据长度
      */
  public int sysGetDebugData(byte[] data, int len) throws android.os.RemoteException;
  /**
      * 向SP发数据
      * 功能>向SP发数据
      * @param data：数据
      * @param len：数据长度
      */
  public int sysPutDebugData(byte[] data, int len) throws android.os.RemoteException;
}
