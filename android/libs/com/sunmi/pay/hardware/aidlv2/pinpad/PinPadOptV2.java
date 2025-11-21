/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.pinpad;
// Declare any non-default types here with import statements

public interface PinPadOptV2 extends android.os.IInterface
{
  /** Default implementation for PinPadOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
  {
    /**
         * 初始化PinPad
         * @param config: 密码键盘配置
         * @param listener 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
         * @return 顺序/乱序键值
         */
    @Override public java.lang.String initPinPad(com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2 config, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 输入pinpad 坐标参数 实现TP接管
         * @param data: 自实现的密码键盘需要传入坐标
         */
    @Override public void importPinPadData(com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2 data) throws android.os.RemoteException
    {
    }
    /**
         * 取消输PIN
         */
    @Override public void cancelInputPin() throws android.os.RemoteException
    {
    }
    /**
         * 设置PinPad显示的文字
         * @param config: 要显示的文字配置
         */
    @Override public void setPinPadText(com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2 config) throws android.os.RemoteException
    {
    }
    /**
         * 设置PinPad模式
         * @param bundle: PinPad模式，包含key：
         * normal：普通模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
         * longPressToClear：输PIN时长按清除（类型：int，0-关闭，1-开启）
         * silent：输PIN时静音（类型：int，0-关闭，1-开启）
         * greenLed：输PIN时绿灯亮（类型：int，0-关闭，1-开启）
         * monitorClearKey：监视是否按下清除按钮（类型：int，0-关闭，1-开启）
         * cancelToClear：按取消键清除输PIN（类型：int，0-关闭，1-开启）
         * visualImpairment：视障模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
         * longTimeoutTime: 输PIN时最长10min超时时间（类型：int，0-关闭，1-开启）
         * @return 0-成功，非0-错误码
         */
    @Override public int setPinPadMode(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取PinPad模式
         * @param bundle: PinPad模式，包含key：
         * normal：普通模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
         * longPressToClear：输PIN时长按清除（类型：int，0-关闭，1-开启）
         * silent：输PIN时静音（类型：int，0-关闭，1-开启）
         * greenLed：输PIN时绿灯亮（类型：int，0-关闭，1-开启）
         * monitorClearKey 监视是否按下清除按钮（类型：int，0-关闭，1-开启）
         * cancelToClear：按取消键清除输PIN（类型：int，0-关闭，1-开启）
         * visualImpairment：视障模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
         * longTimeoutTime: 输PIN时最长10min超时时间（类型：int，0-关闭，1-开启）
         * @return 0-成功，非0-错误码
         */
    @Override public int getPinPadMode(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 初始化PinPad
         * @param config: 密码键盘配置，包含key：
         * pinPadType: 密码键盘类型，类型int，0-预置普通键盘(默认值) ，1-自定义普通键盘，2-预置盲人模式键盘(默认值)，3-预置rnib认证盲人模式键盘，
         *             4-预置rnib认证普通键盘，5-自定义盲人模式键盘
         * pinType：PIN类型标识(类型int，0-联机PIN，1-脱机PIN)
         * isOrderNumKey: 是否顺序键盘(类型int，0-乱序键盘(默认值)，1-顺序键盘)
         * pan：PAN数据，ASCII格式转换成的byte 例如 “123456”.getBytes("US-ASCII")(类型byte[])
         * pinKeyIndex：PIK(PIN key)索引(类型int)
         * minInput：最小输入位数(类型int，默认0)
         * maxInput：最大输入位数(类型int，默认6)
         * inputStep：PIN步长(类型int，默认1)
         * timeout：超时时间，单位：ms(类型int，默认60000)
         * isSupportbypass：是否支持bypass PIN(类型int，0-不支持，1-支持(默认值))
         * pinblockFormat：PinBlock格式(类型int，默认0)
         * algorithmType：加密Pin的算法类型(类型int, 0-3DES(返回8字节PinBlock),1-SM4(返回16字节PinBlock),2-AES(返回16字节PinBlock))
         * keySystem：密钥体系(类型int, 0-SEC_MKSK(默认值), 1-SEC_DUKPT)
         * @param listener 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
         * @return 顺序/乱序键值
         */
    @Override public java.lang.String initPinPadEx(android.os.Bundle config, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 设置PIN防穷举保护模式
         * @param level 等级，范围1-5，1-2min4次，2-6min12次，3-15min30次，4-30min60次，5-60min120次
         * @return >=0-距离新周期生效需等待的时间，单位：min，<0-错误码
         */
    @Override public int setAntiExhaustiveProtectionMode(int level) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取PIN防穷举保护模式
         * @return >=0-当前生效的模式，范围1-5，<0-错误码
         */
    @Override public int getAntiExhaustiveProtectionMode() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置视障模式参数
         * @param param: 盲人模式参数，包含key：
         * timeoutGap1: 手指触摸屏幕时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
         * timeoutGap2：两次点击屏幕的间隔时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
         * ttsLanguage：语音播报的语言(类型：int，0-跟随系统（默认值），1-英语，2-波兰语，3-法语，4-葡萄牙语(巴西)，5-中文(中国))，6-西班牙语
         * rnibSelectMode: PIN数字确认模式（类型：int，0-双击确认（默认值），1-长按确认）
         * rnibHoldTime：长按确认时模式下长按时间，单位：100ms(类型：int，范围：(0,100]，默认值：30)
         * @return 0-成功，<0-错误码
         */
    @Override public int setVisualImpairmentModeParam(android.os.Bundle param) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取视障模式参数
         * @param param: 盲人模式参数，包含key：
         * timeoutGap1: 手指触摸屏幕时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
         * timeoutGap2：两次点击屏幕的间隔时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
         * ttsLanguage：语音播报的语言(类型：int，0-跟随系统（默认值），1-英语，2-波兰语，3-法语，4-葡萄牙语(巴西)，5-中文(中国))，6-西班牙语
         * rnibSelectMode: PIN数字确认模式（类型：int，0-双击确认（默认值），1-长按确认）
         * rnibHoldTime：长按确认时模式下长按时间，单位：100ms(类型：int，范围：(0,100]，默认值：30)
         * @return 0-成功，<0-错误码
         */
    @Override public int getVisualImpairmentModeParam(android.os.Bundle param) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 启动输PIN
         * @param param: 密码键盘配置，包含key：
         * pinPadType: 密码键盘类型，类型int，0-预置普通键盘(默认值) ，1-自定义普通键盘，2-预置盲人模式键盘(默认值)，3-预置rnib认证盲人模式键盘，
         *             4-预置rnib认证普通键盘，5-自定义盲人模式键盘
         * pinType：PIN类型标识(类型：int，0-联机PIN，1-脱机PIN)
         * isOrderNumKey: 是否顺序键盘(类型：int，0-乱序键盘(默认值)，1-顺序键盘)
         * minInput：最小输入位数(类型：int，默认0)
         * maxInput：最大输入位数(类型：int，默认6)
         * inputStep：PIN步长(类型：int，默认1)
         * expLen：允许输入的PIN数字个数，以","分割，例如"0,4,6"表示允许输入0个/4个/6个数字（类型：String，此字段与minInput/maxInput/inputStep互斥，若都存在，则优先使用expLen）
         * isSupportbypass：是否支持bypass PIN(类型：int，0-不支持，1-支持(默认值))
         * timeout：超时时间，单位：ms(类型：int，默认60000)
         * @param listener 回调（不回调onConfirm）
         * @return 0-成功，<0-错误码
         */
    @Override public int startInputPin(android.os.Bundle param, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取PinBlock
         * @param param: 密码键盘配置，包含key：
         * keySystem：密钥体系(类型：int, 0-SEC_MKSK(默认值), 1-SEC_DUKPT)
         * pinKeyIndex：PIK(PIN key)索引(类型：int)
         * algorithmType：加密Pin的算法类型(类型：int, 0-3DES(返回8字节PinBlock),1-SM4(返回16字节PinBlock),2-AES(返回16字节PinBlock))
         * pinblockFormat：PinBlock格式(类型：int，默认0)
         * pan：PAN数据，ASCII格式转换成的byte 例如 “123456”.getBytes("US-ASCII")(类型：byte[])
         * @return >=0-dataOut中有效数据的长度，<0-错误码
         */
    @Override public int getPinBlock(android.os.Bundle param, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 验证脱机PIN
         * @param paramIn: 脱机PIN参数，包含key：
         * offlineType：脱机类型(类型：int, 0-脱机明文，1-脱机密文)
         * modulus：RSA密钥模(类型：byte[])
         * exponent：RSA密钥指数(类型：byte[])
         * random：随机数(类型：byte[])
         * @param paramOut 出参数据，包含key：
         * sw1：SW1(类型：int)
         * sw2：SW2(类型：int)
         * @return 0-成功，<0-错误码
         */
    @Override public int offlinePinVerify(android.os.Bundle paramIn, android.os.Bundle paramOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 输入pinpad 坐标参数 实现TP接管
         * @param data: 自实现的密码键盘需要传入坐标
         */
    @Override public void importPinPadDataEx(com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2Ex data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_initPinPad:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _result = this.initPinPad(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_importPinPadData:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.importPinPadData(_arg0);
          reply.writeNoException();
          if ((_arg0!=null)) {
            reply.writeInt(1);
            _arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_cancelInputPin:
        {
          data.enforceInterface(descriptor);
          this.cancelInputPin();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPinPadText:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2 _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.setPinPadText(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPinPadMode:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setPinPadMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPinPadMode:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.getPinPadMode(_arg0);
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
        case TRANSACTION_initPinPadEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _result = this.initPinPadEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setAntiExhaustiveProtectionMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setAntiExhaustiveProtectionMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getAntiExhaustiveProtectionMode:
        {
          data.enforceInterface(descriptor);
          int _result = this.getAntiExhaustiveProtectionMode();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setVisualImpairmentModeParam:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.setVisualImpairmentModeParam(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getVisualImpairmentModeParam:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.getVisualImpairmentModeParam(_arg0);
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
        case TRANSACTION_startInputPin:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2.Stub.asInterface(data.readStrongBinder());
          int _result = this.startInputPin(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPinBlock:
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
          int _result = this.getPinBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_offlinePinVerify:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.offlinePinVerify(_arg0, _arg1);
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
        case TRANSACTION_importPinPadDataEx:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2Ex _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2Ex.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.importPinPadDataEx(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2
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
           * 初始化PinPad
           * @param config: 密码键盘配置
           * @param listener 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
           * @return 顺序/乱序键值
           */
      @Override public java.lang.String initPinPad(com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2 config, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((config!=null)) {
            _data.writeInt(1);
            config.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_initPinPad, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initPinPad(config, listener);
          }
          _reply.readException();
          _result = _reply.readString();
          if ((0!=_reply.readInt())) {
            config.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 输入pinpad 坐标参数 实现TP接管
           * @param data: 自实现的密码键盘需要传入坐标
           */
      @Override public void importPinPadData(com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2 data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((data!=null)) {
            _data.writeInt(1);
            data.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPinPadData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importPinPadData(data);
            return;
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            data.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
           * 取消输PIN
           */
      @Override public void cancelInputPin() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelInputPin, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().cancelInputPin();
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
           * 设置PinPad显示的文字
           * @param config: 要显示的文字配置
           */
      @Override public void setPinPadText(com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2 config) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((config!=null)) {
            _data.writeInt(1);
            config.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPinPadText, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPinPadText(config);
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
           * 设置PinPad模式
           * @param bundle: PinPad模式，包含key：
           * normal：普通模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
           * longPressToClear：输PIN时长按清除（类型：int，0-关闭，1-开启）
           * silent：输PIN时静音（类型：int，0-关闭，1-开启）
           * greenLed：输PIN时绿灯亮（类型：int，0-关闭，1-开启）
           * monitorClearKey：监视是否按下清除按钮（类型：int，0-关闭，1-开启）
           * cancelToClear：按取消键清除输PIN（类型：int，0-关闭，1-开启）
           * visualImpairment：视障模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
           * longTimeoutTime: 输PIN时最长10min超时时间（类型：int，0-关闭，1-开启）
           * @return 0-成功，非0-错误码
           */
      @Override public int setPinPadMode(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPinPadMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setPinPadMode(bundle);
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
           * 获取PinPad模式
           * @param bundle: PinPad模式，包含key：
           * normal：普通模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
           * longPressToClear：输PIN时长按清除（类型：int，0-关闭，1-开启）
           * silent：输PIN时静音（类型：int，0-关闭，1-开启）
           * greenLed：输PIN时绿灯亮（类型：int，0-关闭，1-开启）
           * monitorClearKey 监视是否按下清除按钮（类型：int，0-关闭，1-开启）
           * cancelToClear：按取消键清除输PIN（类型：int，0-关闭，1-开启）
           * visualImpairment：视障模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
           * longTimeoutTime: 输PIN时最长10min超时时间（类型：int，0-关闭，1-开启）
           * @return 0-成功，非0-错误码
           */
      @Override public int getPinPadMode(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPinPadMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPinPadMode(bundle);
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
           * 初始化PinPad
           * @param config: 密码键盘配置，包含key：
           * pinPadType: 密码键盘类型，类型int，0-预置普通键盘(默认值) ，1-自定义普通键盘，2-预置盲人模式键盘(默认值)，3-预置rnib认证盲人模式键盘，
           *             4-预置rnib认证普通键盘，5-自定义盲人模式键盘
           * pinType：PIN类型标识(类型int，0-联机PIN，1-脱机PIN)
           * isOrderNumKey: 是否顺序键盘(类型int，0-乱序键盘(默认值)，1-顺序键盘)
           * pan：PAN数据，ASCII格式转换成的byte 例如 “123456”.getBytes("US-ASCII")(类型byte[])
           * pinKeyIndex：PIK(PIN key)索引(类型int)
           * minInput：最小输入位数(类型int，默认0)
           * maxInput：最大输入位数(类型int，默认6)
           * inputStep：PIN步长(类型int，默认1)
           * timeout：超时时间，单位：ms(类型int，默认60000)
           * isSupportbypass：是否支持bypass PIN(类型int，0-不支持，1-支持(默认值))
           * pinblockFormat：PinBlock格式(类型int，默认0)
           * algorithmType：加密Pin的算法类型(类型int, 0-3DES(返回8字节PinBlock),1-SM4(返回16字节PinBlock),2-AES(返回16字节PinBlock))
           * keySystem：密钥体系(类型int, 0-SEC_MKSK(默认值), 1-SEC_DUKPT)
           * @param listener 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
           * @return 顺序/乱序键值
           */
      @Override public java.lang.String initPinPadEx(android.os.Bundle config, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((config!=null)) {
            _data.writeInt(1);
            config.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_initPinPadEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initPinPadEx(config, listener);
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
           * 设置PIN防穷举保护模式
           * @param level 等级，范围1-5，1-2min4次，2-6min12次，3-15min30次，4-30min60次，5-60min120次
           * @return >=0-距离新周期生效需等待的时间，单位：min，<0-错误码
           */
      @Override public int setAntiExhaustiveProtectionMode(int level) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(level);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAntiExhaustiveProtectionMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setAntiExhaustiveProtectionMode(level);
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
           * 获取PIN防穷举保护模式
           * @return >=0-当前生效的模式，范围1-5，<0-错误码
           */
      @Override public int getAntiExhaustiveProtectionMode() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAntiExhaustiveProtectionMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAntiExhaustiveProtectionMode();
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
           * 设置视障模式参数
           * @param param: 盲人模式参数，包含key：
           * timeoutGap1: 手指触摸屏幕时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
           * timeoutGap2：两次点击屏幕的间隔时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
           * ttsLanguage：语音播报的语言(类型：int，0-跟随系统（默认值），1-英语，2-波兰语，3-法语，4-葡萄牙语(巴西)，5-中文(中国))，6-西班牙语
           * rnibSelectMode: PIN数字确认模式（类型：int，0-双击确认（默认值），1-长按确认）
           * rnibHoldTime：长按确认时模式下长按时间，单位：100ms(类型：int，范围：(0,100]，默认值：30)
           * @return 0-成功，<0-错误码
           */
      @Override public int setVisualImpairmentModeParam(android.os.Bundle param) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((param!=null)) {
            _data.writeInt(1);
            param.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setVisualImpairmentModeParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setVisualImpairmentModeParam(param);
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
           * 获取视障模式参数
           * @param param: 盲人模式参数，包含key：
           * timeoutGap1: 手指触摸屏幕时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
           * timeoutGap2：两次点击屏幕的间隔时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
           * ttsLanguage：语音播报的语言(类型：int，0-跟随系统（默认值），1-英语，2-波兰语，3-法语，4-葡萄牙语(巴西)，5-中文(中国))，6-西班牙语
           * rnibSelectMode: PIN数字确认模式（类型：int，0-双击确认（默认值），1-长按确认）
           * rnibHoldTime：长按确认时模式下长按时间，单位：100ms(类型：int，范围：(0,100]，默认值：30)
           * @return 0-成功，<0-错误码
           */
      @Override public int getVisualImpairmentModeParam(android.os.Bundle param) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVisualImpairmentModeParam, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getVisualImpairmentModeParam(param);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            param.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 启动输PIN
           * @param param: 密码键盘配置，包含key：
           * pinPadType: 密码键盘类型，类型int，0-预置普通键盘(默认值) ，1-自定义普通键盘，2-预置盲人模式键盘(默认值)，3-预置rnib认证盲人模式键盘，
           *             4-预置rnib认证普通键盘，5-自定义盲人模式键盘
           * pinType：PIN类型标识(类型：int，0-联机PIN，1-脱机PIN)
           * isOrderNumKey: 是否顺序键盘(类型：int，0-乱序键盘(默认值)，1-顺序键盘)
           * minInput：最小输入位数(类型：int，默认0)
           * maxInput：最大输入位数(类型：int，默认6)
           * inputStep：PIN步长(类型：int，默认1)
           * expLen：允许输入的PIN数字个数，以","分割，例如"0,4,6"表示允许输入0个/4个/6个数字（类型：String，此字段与minInput/maxInput/inputStep互斥，若都存在，则优先使用expLen）
           * isSupportbypass：是否支持bypass PIN(类型：int，0-不支持，1-支持(默认值))
           * timeout：超时时间，单位：ms(类型：int，默认60000)
           * @param listener 回调（不回调onConfirm）
           * @return 0-成功，<0-错误码
           */
      @Override public int startInputPin(android.os.Bundle param, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((param!=null)) {
            _data.writeInt(1);
            param.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_startInputPin, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startInputPin(param, listener);
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
           * 获取PinBlock
           * @param param: 密码键盘配置，包含key：
           * keySystem：密钥体系(类型：int, 0-SEC_MKSK(默认值), 1-SEC_DUKPT)
           * pinKeyIndex：PIK(PIN key)索引(类型：int)
           * algorithmType：加密Pin的算法类型(类型：int, 0-3DES(返回8字节PinBlock),1-SM4(返回16字节PinBlock),2-AES(返回16字节PinBlock))
           * pinblockFormat：PinBlock格式(类型：int，默认0)
           * pan：PAN数据，ASCII格式转换成的byte 例如 “123456”.getBytes("US-ASCII")(类型：byte[])
           * @return >=0-dataOut中有效数据的长度，<0-错误码
           */
      @Override public int getPinBlock(android.os.Bundle param, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((param!=null)) {
            _data.writeInt(1);
            param.writeToParcel(_data, 0);
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPinBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPinBlock(param, dataOut);
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
           * 验证脱机PIN
           * @param paramIn: 脱机PIN参数，包含key：
           * offlineType：脱机类型(类型：int, 0-脱机明文，1-脱机密文)
           * modulus：RSA密钥模(类型：byte[])
           * exponent：RSA密钥指数(类型：byte[])
           * random：随机数(类型：byte[])
           * @param paramOut 出参数据，包含key：
           * sw1：SW1(类型：int)
           * sw2：SW2(类型：int)
           * @return 0-成功，<0-错误码
           */
      @Override public int offlinePinVerify(android.os.Bundle paramIn, android.os.Bundle paramOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((paramIn!=null)) {
            _data.writeInt(1);
            paramIn.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_offlinePinVerify, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().offlinePinVerify(paramIn, paramOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            paramOut.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 输入pinpad 坐标参数 实现TP接管
           * @param data: 自实现的密码键盘需要传入坐标
           */
      @Override public void importPinPadDataEx(com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2Ex data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((data!=null)) {
            _data.writeInt(1);
            data.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPinPadDataEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().importPinPadDataEx(data);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_initPinPad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_importPinPadData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelInputPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setPinPadText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setPinPadMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getPinPadMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_initPinPadEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setAntiExhaustiveProtectionMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getAntiExhaustiveProtectionMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setVisualImpairmentModeParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getVisualImpairmentModeParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_startInputPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getPinBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_offlinePinVerify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_importPinPadDataEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 初始化PinPad
       * @param config: 密码键盘配置
       * @param listener 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
       * @return 顺序/乱序键值
       */
  public java.lang.String initPinPad(com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2 config, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException;
  /**
       * 输入pinpad 坐标参数 实现TP接管
       * @param data: 自实现的密码键盘需要传入坐标
       */
  public void importPinPadData(com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2 data) throws android.os.RemoteException;
  /**
       * 取消输PIN
       */
  public void cancelInputPin() throws android.os.RemoteException;
  /**
       * 设置PinPad显示的文字
       * @param config: 要显示的文字配置
       */
  public void setPinPadText(com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2 config) throws android.os.RemoteException;
  /**
       * 设置PinPad模式
       * @param bundle: PinPad模式，包含key：
       * normal：普通模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
       * longPressToClear：输PIN时长按清除（类型：int，0-关闭，1-开启）
       * silent：输PIN时静音（类型：int，0-关闭，1-开启）
       * greenLed：输PIN时绿灯亮（类型：int，0-关闭，1-开启）
       * monitorClearKey：监视是否按下清除按钮（类型：int，0-关闭，1-开启）
       * cancelToClear：按取消键清除输PIN（类型：int，0-关闭，1-开启）
       * visualImpairment：视障模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
       * longTimeoutTime: 输PIN时最长10min超时时间（类型：int，0-关闭，1-开启）
       * @return 0-成功，非0-错误码
       */
  public int setPinPadMode(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 获取PinPad模式
       * @param bundle: PinPad模式，包含key：
       * normal：普通模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
       * longPressToClear：输PIN时长按清除（类型：int，0-关闭，1-开启）
       * silent：输PIN时静音（类型：int，0-关闭，1-开启）
       * greenLed：输PIN时绿灯亮（类型：int，0-关闭，1-开启）
       * monitorClearKey 监视是否按下清除按钮（类型：int，0-关闭，1-开启）
       * cancelToClear：按取消键清除输PIN（类型：int，0-关闭，1-开启）
       * visualImpairment：视障模式（类型：int，0-关闭，1-开启.本模式和其他模式互斥）
       * longTimeoutTime: 输PIN时最长10min超时时间（类型：int，0-关闭，1-开启）
       * @return 0-成功，非0-错误码
       */
  public int getPinPadMode(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 初始化PinPad
       * @param config: 密码键盘配置，包含key：
       * pinPadType: 密码键盘类型，类型int，0-预置普通键盘(默认值) ，1-自定义普通键盘，2-预置盲人模式键盘(默认值)，3-预置rnib认证盲人模式键盘，
       *             4-预置rnib认证普通键盘，5-自定义盲人模式键盘
       * pinType：PIN类型标识(类型int，0-联机PIN，1-脱机PIN)
       * isOrderNumKey: 是否顺序键盘(类型int，0-乱序键盘(默认值)，1-顺序键盘)
       * pan：PAN数据，ASCII格式转换成的byte 例如 “123456”.getBytes("US-ASCII")(类型byte[])
       * pinKeyIndex：PIK(PIN key)索引(类型int)
       * minInput：最小输入位数(类型int，默认0)
       * maxInput：最大输入位数(类型int，默认6)
       * inputStep：PIN步长(类型int，默认1)
       * timeout：超时时间，单位：ms(类型int，默认60000)
       * isSupportbypass：是否支持bypass PIN(类型int，0-不支持，1-支持(默认值))
       * pinblockFormat：PinBlock格式(类型int，默认0)
       * algorithmType：加密Pin的算法类型(类型int, 0-3DES(返回8字节PinBlock),1-SM4(返回16字节PinBlock),2-AES(返回16字节PinBlock))
       * keySystem：密钥体系(类型int, 0-SEC_MKSK(默认值), 1-SEC_DUKPT)
       * @param listener 回调（如果配置中使用内置密码键盘，仅回调PinBlock）
       * @return 顺序/乱序键值
       */
  public java.lang.String initPinPadEx(android.os.Bundle config, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException;
  /**
       * 设置PIN防穷举保护模式
       * @param level 等级，范围1-5，1-2min4次，2-6min12次，3-15min30次，4-30min60次，5-60min120次
       * @return >=0-距离新周期生效需等待的时间，单位：min，<0-错误码
       */
  public int setAntiExhaustiveProtectionMode(int level) throws android.os.RemoteException;
  /**
       * 获取PIN防穷举保护模式
       * @return >=0-当前生效的模式，范围1-5，<0-错误码
       */
  public int getAntiExhaustiveProtectionMode() throws android.os.RemoteException;
  /**
       * 设置视障模式参数
       * @param param: 盲人模式参数，包含key：
       * timeoutGap1: 手指触摸屏幕时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
       * timeoutGap2：两次点击屏幕的间隔时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
       * ttsLanguage：语音播报的语言(类型：int，0-跟随系统（默认值），1-英语，2-波兰语，3-法语，4-葡萄牙语(巴西)，5-中文(中国))，6-西班牙语
       * rnibSelectMode: PIN数字确认模式（类型：int，0-双击确认（默认值），1-长按确认）
       * rnibHoldTime：长按确认时模式下长按时间，单位：100ms(类型：int，范围：(0,100]，默认值：30)
       * @return 0-成功，<0-错误码
       */
  public int setVisualImpairmentModeParam(android.os.Bundle param) throws android.os.RemoteException;
  /**
       * 获取视障模式参数
       * @param param: 盲人模式参数，包含key：
       * timeoutGap1: 手指触摸屏幕时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
       * timeoutGap2：两次点击屏幕的间隔时间，单位：100ms(类型：int，范围：(0,100]，默认值：10)
       * ttsLanguage：语音播报的语言(类型：int，0-跟随系统（默认值），1-英语，2-波兰语，3-法语，4-葡萄牙语(巴西)，5-中文(中国))，6-西班牙语
       * rnibSelectMode: PIN数字确认模式（类型：int，0-双击确认（默认值），1-长按确认）
       * rnibHoldTime：长按确认时模式下长按时间，单位：100ms(类型：int，范围：(0,100]，默认值：30)
       * @return 0-成功，<0-错误码
       */
  public int getVisualImpairmentModeParam(android.os.Bundle param) throws android.os.RemoteException;
  /**
       * 启动输PIN
       * @param param: 密码键盘配置，包含key：
       * pinPadType: 密码键盘类型，类型int，0-预置普通键盘(默认值) ，1-自定义普通键盘，2-预置盲人模式键盘(默认值)，3-预置rnib认证盲人模式键盘，
       *             4-预置rnib认证普通键盘，5-自定义盲人模式键盘
       * pinType：PIN类型标识(类型：int，0-联机PIN，1-脱机PIN)
       * isOrderNumKey: 是否顺序键盘(类型：int，0-乱序键盘(默认值)，1-顺序键盘)
       * minInput：最小输入位数(类型：int，默认0)
       * maxInput：最大输入位数(类型：int，默认6)
       * inputStep：PIN步长(类型：int，默认1)
       * expLen：允许输入的PIN数字个数，以","分割，例如"0,4,6"表示允许输入0个/4个/6个数字（类型：String，此字段与minInput/maxInput/inputStep互斥，若都存在，则优先使用expLen）
       * isSupportbypass：是否支持bypass PIN(类型：int，0-不支持，1-支持(默认值))
       * timeout：超时时间，单位：ms(类型：int，默认60000)
       * @param listener 回调（不回调onConfirm）
       * @return 0-成功，<0-错误码
       */
  public int startInputPin(android.os.Bundle param, com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2 listener) throws android.os.RemoteException;
  /**
       * 获取PinBlock
       * @param param: 密码键盘配置，包含key：
       * keySystem：密钥体系(类型：int, 0-SEC_MKSK(默认值), 1-SEC_DUKPT)
       * pinKeyIndex：PIK(PIN key)索引(类型：int)
       * algorithmType：加密Pin的算法类型(类型：int, 0-3DES(返回8字节PinBlock),1-SM4(返回16字节PinBlock),2-AES(返回16字节PinBlock))
       * pinblockFormat：PinBlock格式(类型：int，默认0)
       * pan：PAN数据，ASCII格式转换成的byte 例如 “123456”.getBytes("US-ASCII")(类型：byte[])
       * @return >=0-dataOut中有效数据的长度，<0-错误码
       */
  public int getPinBlock(android.os.Bundle param, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 验证脱机PIN
       * @param paramIn: 脱机PIN参数，包含key：
       * offlineType：脱机类型(类型：int, 0-脱机明文，1-脱机密文)
       * modulus：RSA密钥模(类型：byte[])
       * exponent：RSA密钥指数(类型：byte[])
       * random：随机数(类型：byte[])
       * @param paramOut 出参数据，包含key：
       * sw1：SW1(类型：int)
       * sw2：SW2(类型：int)
       * @return 0-成功，<0-错误码
       */
  public int offlinePinVerify(android.os.Bundle paramIn, android.os.Bundle paramOut) throws android.os.RemoteException;
  /**
       * 输入pinpad 坐标参数 实现TP接管
       * @param data: 自实现的密码键盘需要传入坐标
       */
  public void importPinPadDataEx(com.sunmi.pay.hardware.aidlv2.bean.PinPadDataV2Ex data) throws android.os.RemoteException;
}
