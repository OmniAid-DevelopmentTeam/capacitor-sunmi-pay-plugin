/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.print;
/** @deprecated */
public interface PrinterCallback extends android.os.IInterface
{
  /** Default implementation for PrinterCallback. */
  public static class Default implements com.sunmi.pay.hardware.aidl.print.PrinterCallback
  {
    /**
         * 打印机状态更新
         * 目前主动更新的打印机状态：待命、缺纸、过热、电池电压低
         * @param status 参见AidlConstants.PrinterStatus中的状态码
         * @deprecated
         */
    @Override public void onPrinterStatusUpdate(int status) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.print.PrinterCallback
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.print.PrinterCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.print.PrinterCallback interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.print.PrinterCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.print.PrinterCallback))) {
        return ((com.sunmi.pay.hardware.aidl.print.PrinterCallback)iin);
      }
      return new com.sunmi.pay.hardware.aidl.print.PrinterCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onPrinterStatusUpdate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onPrinterStatusUpdate(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.print.PrinterCallback
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
           * 打印机状态更新
           * 目前主动更新的打印机状态：待命、缺纸、过热、电池电压低
           * @param status 参见AidlConstants.PrinterStatus中的状态码
           * @deprecated
           */
      @Override public void onPrinterStatusUpdate(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPrinterStatusUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPrinterStatusUpdate(status);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidl.print.PrinterCallback sDefaultImpl;
    }
    static final int TRANSACTION_onPrinterStatusUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.print.PrinterCallback impl) {
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
    public static com.sunmi.pay.hardware.aidl.print.PrinterCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 打印机状态更新
       * 目前主动更新的打印机状态：待命、缺纸、过热、电池电压低
       * @param status 参见AidlConstants.PrinterStatus中的状态码
       * @deprecated
       */
  public void onPrinterStatusUpdate(int status) throws android.os.RemoteException;
}
