/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.print;
public interface PrinterOptV2 extends android.os.IInterface
{
  /** Default implementation for PrinterOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2
  {
    /**
         * 打印打开
         * @return 0-成功，<0-错误码
         */
    @Override public int printOpen() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 打印关闭
         * @return 0-成功，<0-错误码
         */
    @Override public int printClose() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 打印点行
         * @param pointRowData: 点阵数据
         * @return  >=0-成功，返回值为打印缓冲剩余字节数，<0-错误码
         */
    @Override public int printPointLine(byte[] pointRowData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 打印走纸
          * @param nPixels 点行数
          * @return 0-成功，<0-错误码
          */
    @Override public int printFeedPaper(int nPixels) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取打印机状态
         * @return >0-打印机状态参考AidlConstants.PrinterStatus，<0-错误码
         */
    @Override public int getPrinterStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取打印机驱动版本号
         * @return 打印机驱动版本号
         */
    @Override public java.lang.String getPrinterDriverVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 设置灰度
         * @param level: 70-130
         * @return 0-成功，<0-错误码
         */
    @Override public int setGrayLevel(int level) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取打印buffer剩余字节数
         * @return >= 0-buffer剩余字节数，<0-错误码
         */
    @Override public int getBufferRemainingRows() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 读取打印配置(由SP控制还是MCU控制打印)
         * @return Y-sp控制，N-mcu控制，空-未下载配置文件未下载
         */
    @Override public java.lang.String getPrinterConfig() throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 获取打印灰度百分比
         * @return >0-打印灰度百分比值，<0-错误码
         */
    @Override public int getPrintGrayLevel() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取开机累计打印距离
         * @return >=0-打印距离（单位mm），<0 错误码
         */
    @Override public int getTotalPrintDistance() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取打印机序列号
         * @return 打印机序列号
         */
    @Override public java.lang.String getPrinterSN() throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 注册打印状态回调对象
         */
    @Override public void registerPrintCallback(com.sunmi.pay.hardware.aidlv2.print.PrinterCallbackV2 callback) throws android.os.RemoteException
    {
    }
    /**
         * 取消注册打印状态回调对象
         */
    @Override public void unregisterPrintCallback() throws android.os.RemoteException
    {
    }
    /**
         * 设置打印速度
         * @param level: 313-4291，默认800
         * @return 0-成功，<0-错误码
         */
    @Override public int setPrintSpeed(int speed) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置打印加热点数
         * @param pointNum: 加热点数，值为64/96/128/192，SP默认值为128
         * @return 0-成功，<0-错误码
         */
    @Override public int setPrintHeatPoint(int pointNum) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 清除打印点行
         * @return 0-成功，<0-错误码
         * @deprecated
         */
    @Override public int clearBuffer() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_printOpen:
        {
          data.enforceInterface(descriptor);
          int _result = this.printOpen();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printClose:
        {
          data.enforceInterface(descriptor);
          int _result = this.printClose();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printPointLine:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.printPointLine(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_printFeedPaper:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.printFeedPaper(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPrinterStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterDriverVersion:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPrinterDriverVersion();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setGrayLevel:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setGrayLevel(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getBufferRemainingRows:
        {
          data.enforceInterface(descriptor);
          int _result = this.getBufferRemainingRows();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterConfig:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPrinterConfig();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getPrintGrayLevel:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPrintGrayLevel();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getTotalPrintDistance:
        {
          data.enforceInterface(descriptor);
          int _result = this.getTotalPrintDistance();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPrinterSN:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPrinterSN();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_registerPrintCallback:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.print.PrinterCallbackV2 _arg0;
          _arg0 = com.sunmi.pay.hardware.aidlv2.print.PrinterCallbackV2.Stub.asInterface(data.readStrongBinder());
          this.registerPrintCallback(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterPrintCallback:
        {
          data.enforceInterface(descriptor);
          this.unregisterPrintCallback();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPrintSpeed:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setPrintSpeed(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setPrintHeatPoint:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setPrintHeatPoint(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_clearBuffer:
        {
          data.enforceInterface(descriptor);
          int _result = this.clearBuffer();
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2
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
           * 打印打开
           * @return 0-成功，<0-错误码
           */
      @Override public int printOpen() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printOpen, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printOpen();
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
           * 打印关闭
           * @return 0-成功，<0-错误码
           */
      @Override public int printClose() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printClose, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printClose();
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
           * 打印点行
           * @param pointRowData: 点阵数据
           * @return  >=0-成功，返回值为打印缓冲剩余字节数，<0-错误码
           */
      @Override public int printPointLine(byte[] pointRowData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(pointRowData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printPointLine, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printPointLine(pointRowData);
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
            * 打印走纸
            * @param nPixels 点行数
            * @return 0-成功，<0-错误码
            */
      @Override public int printFeedPaper(int nPixels) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nPixels);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printFeedPaper, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().printFeedPaper(nPixels);
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
           * 获取打印机状态
           * @return >0-打印机状态参考AidlConstants.PrinterStatus，<0-错误码
           */
      @Override public int getPrinterStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterStatus();
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
           * 获取打印机驱动版本号
           * @return 打印机驱动版本号
           */
      @Override public java.lang.String getPrinterDriverVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterDriverVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterDriverVersion();
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
           * 设置灰度
           * @param level: 70-130
           * @return 0-成功，<0-错误码
           */
      @Override public int setGrayLevel(int level) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(level);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGrayLevel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setGrayLevel(level);
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
           * 获取打印buffer剩余字节数
           * @return >= 0-buffer剩余字节数，<0-错误码
           */
      @Override public int getBufferRemainingRows() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBufferRemainingRows, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getBufferRemainingRows();
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
           * 读取打印配置(由SP控制还是MCU控制打印)
           * @return Y-sp控制，N-mcu控制，空-未下载配置文件未下载
           */
      @Override public java.lang.String getPrinterConfig() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterConfig, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterConfig();
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
           * 获取打印灰度百分比
           * @return >0-打印灰度百分比值，<0-错误码
           */
      @Override public int getPrintGrayLevel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrintGrayLevel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrintGrayLevel();
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
           * 获取开机累计打印距离
           * @return >=0-打印距离（单位mm），<0 错误码
           */
      @Override public int getTotalPrintDistance() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTotalPrintDistance, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTotalPrintDistance();
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
           * 获取打印机序列号
           * @return 打印机序列号
           */
      @Override public java.lang.String getPrinterSN() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinterSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPrinterSN();
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
           * 注册打印状态回调对象
           */
      @Override public void registerPrintCallback(com.sunmi.pay.hardware.aidlv2.print.PrinterCallbackV2 callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerPrintCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerPrintCallback(callback);
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
           * 取消注册打印状态回调对象
           */
      @Override public void unregisterPrintCallback() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterPrintCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterPrintCallback();
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
           * 设置打印速度
           * @param level: 313-4291，默认800
           * @return 0-成功，<0-错误码
           */
      @Override public int setPrintSpeed(int speed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(speed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrintSpeed, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setPrintSpeed(speed);
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
           * 设置打印加热点数
           * @param pointNum: 加热点数，值为64/96/128/192，SP默认值为128
           * @return 0-成功，<0-错误码
           */
      @Override public int setPrintHeatPoint(int pointNum) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pointNum);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPrintHeatPoint, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setPrintHeatPoint(pointNum);
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
           * 清除打印点行
           * @return 0-成功，<0-错误码
           * @deprecated
           */
      @Override public int clearBuffer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearBuffer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().clearBuffer();
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
      public static com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_printOpen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_printClose = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_printPointLine = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_printFeedPaper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getPrinterStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getPrinterDriverVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setGrayLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getBufferRemainingRows = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getPrinterConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getPrintGrayLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getTotalPrintDistance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getPrinterSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_registerPrintCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_unregisterPrintCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setPrintSpeed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setPrintHeatPoint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_clearBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 打印打开
       * @return 0-成功，<0-错误码
       */
  public int printOpen() throws android.os.RemoteException;
  /**
       * 打印关闭
       * @return 0-成功，<0-错误码
       */
  public int printClose() throws android.os.RemoteException;
  /**
       * 打印点行
       * @param pointRowData: 点阵数据
       * @return  >=0-成功，返回值为打印缓冲剩余字节数，<0-错误码
       */
  public int printPointLine(byte[] pointRowData) throws android.os.RemoteException;
  /**
        * 打印走纸
        * @param nPixels 点行数
        * @return 0-成功，<0-错误码
        */
  public int printFeedPaper(int nPixels) throws android.os.RemoteException;
  /**
       * 获取打印机状态
       * @return >0-打印机状态参考AidlConstants.PrinterStatus，<0-错误码
       */
  public int getPrinterStatus() throws android.os.RemoteException;
  /**
       * 获取打印机驱动版本号
       * @return 打印机驱动版本号
       */
  public java.lang.String getPrinterDriverVersion() throws android.os.RemoteException;
  /**
       * 设置灰度
       * @param level: 70-130
       * @return 0-成功，<0-错误码
       */
  public int setGrayLevel(int level) throws android.os.RemoteException;
  /**
       * 获取打印buffer剩余字节数
       * @return >= 0-buffer剩余字节数，<0-错误码
       */
  public int getBufferRemainingRows() throws android.os.RemoteException;
  /**
       * 读取打印配置(由SP控制还是MCU控制打印)
       * @return Y-sp控制，N-mcu控制，空-未下载配置文件未下载
       */
  public java.lang.String getPrinterConfig() throws android.os.RemoteException;
  /**
       * 获取打印灰度百分比
       * @return >0-打印灰度百分比值，<0-错误码
       */
  public int getPrintGrayLevel() throws android.os.RemoteException;
  /**
       * 获取开机累计打印距离
       * @return >=0-打印距离（单位mm），<0 错误码
       */
  public int getTotalPrintDistance() throws android.os.RemoteException;
  /**
       * 获取打印机序列号
       * @return 打印机序列号
       */
  public java.lang.String getPrinterSN() throws android.os.RemoteException;
  /**
       * 注册打印状态回调对象
       */
  public void registerPrintCallback(com.sunmi.pay.hardware.aidlv2.print.PrinterCallbackV2 callback) throws android.os.RemoteException;
  /**
       * 取消注册打印状态回调对象
       */
  public void unregisterPrintCallback() throws android.os.RemoteException;
  /**
       * 设置打印速度
       * @param level: 313-4291，默认800
       * @return 0-成功，<0-错误码
       */
  public int setPrintSpeed(int speed) throws android.os.RemoteException;
  /**
       * 设置打印加热点数
       * @param pointNum: 加热点数，值为64/96/128/192，SP默认值为128
       * @return 0-成功，<0-错误码
       */
  public int setPrintHeatPoint(int pointNum) throws android.os.RemoteException;
  /**
       * 清除打印点行
       * @return 0-成功，<0-错误码
       * @deprecated
       */
  public int clearBuffer() throws android.os.RemoteException;
}
