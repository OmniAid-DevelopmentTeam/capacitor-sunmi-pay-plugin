/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidl.readcard;
// Declare any non-default types here with import statements
/** @deprecated */
public interface ReadCardOpt extends android.os.IInterface
{
  /** Default implementation for ReadCardOpt. */
  public static class Default implements com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
  {
    /**
         * 银行卡检卡
         * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
         * @param callback  检卡回调,详见ReadCardCallback
         * @param timeout   timeout 超时时间，（单位为秒）
         * @deprecated
         */
    @Override public void checkBankCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback callback, int timeout) throws android.os.RemoteException
    {
    }
    /**
         * 行业卡检卡检卡
         * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
         * @param callback  检卡回调,详见ReadCardCallback
         * @param timeout   timeout 超时时间，（单位为秒）
         * @deprecated
         */
    @Override public void checkCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback callback, int timeout) throws android.os.RemoteException
    {
    }
    /**
         * 取消检卡
         * @deprecated
         */
    @Override public void cancelCheckCard() throws android.os.RemoteException
    {
    }
    /**
         * APDU指令交互(ISO 7816标准的APDU)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元
         * @param apduRecv  卡片应答应用数据单元
         * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
         * @deprecated
         */
    @Override public int smartCardExchange(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 卡片下电
         * @return  0,卡片已经下电(接触式IC)或移走(非接触式IC卡) < 0 失败
         * @deprecated
         */
    @Override public int cardOff(int cardType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1卡片认证
         * @param keyType   密钥类型,0表示KEY A,1表示 KEY B
         * @param block     认证块号
         * @param key       密钥数据
         * @return          0卡片认证成功,非0认证失败
         * @deprecated
         */
    @Override public int mifareAuth(int keyType, int block, byte[] key) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1读取块数据
         * @param block     待读取的块号
         * @param blockData 保存读取到块数据的缓存
         * @return          0表示读取成功,6表示读取失败,其他值为错误,非0,认证失败,返回值待整理
         * @deprecated
         */
    @Override public int mifareReadBlock(int block, byte[] blockData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1写入块数据
         * @param block     待读取的块号
         * @param blockData 保存读取到块数据的缓存
         * @return          0表示写入数据块成功,3表示写入失败,其他值为错误,非0认证失败,返回值待整理
         * @deprecated
         */
    @Override public int mifareWriteBlock(int block, byte[] blockData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1加值
         * @param block 待加值的块号
         * @param value 待加的值缓存,低字节在前,高字节在后
         * @return      0表示加值成功,6表示加值失败,其他值为错误,非0认证失败,返回值待整理
         * @deprecated
         */
    @Override public int mifareIncValue(int block, byte[] value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1减值
         * @param block 待减值的块号
         * @param value 待减的值缓存,低字节在前,高字节在后
         * @return      0表示减值成功,6表示减值失败,其他值为错误,非0认证失败,返回值待整理
         * @deprecated
         */
    @Override public int mifareDecValue(int block, byte[] value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 初始化交易数据
         * @param transData 交易参数配置对象
         * @return          成功为0,非0为失败
         * @deprecated
         */
    @Override public int initTransData(com.sunmi.pay.hardware.aidl.bean.TransData transData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APDU指令交互(激活卡片后按照半双工块传输协议（Half-Duplex Block Transmission Protocol ）方式进行非标准APDU命令数据收发)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
         * @param apduRecv  卡片应答应用数据单元
         * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
         * @deprecated
         */
    @Override public int smartCardExChangeNISO(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 查看卡片是否存在
         * @param cardType  IC，NFC  卡片类型不能复合传递
         * @return < 0 错误, > 0 参考AidlConstants.CardExistStatus
         * @deprecated
         */
    @Override public int getCardExistStatus(int cardType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 检卡(不区分银行卡和非银行卡)
         * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
         * @param callback  检卡回调,详见 CheckCardCallback
         * @param timeout   timeout 超时时间，（单位为秒）
         * @deprecated
         */
    @Override public void detectCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback checkCardCallback, int timeout) throws android.os.RemoteException
    {
    }
    /**
         * APDU指令交互(底层裸数据（RAW DATA）收发)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
         * @param apduRecv  卡片应答应用数据单元
         * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
         * @deprecated
         */
    @Override public int smartCardExChangePASS(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APDU指令交互(底层裸数据（RAW DATA）收发)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
         * @param apduRecv  卡片应答应用数据单元(无表示RAPDU有效数据长度的两字节)
         * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
         * @deprecated
         */
    @Override public int smartCardExChangePASSNoLength(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt))) {
        return ((com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt)iin);
      }
      return new com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt.Stub.Proxy(obj);
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
        case TRANSACTION_checkBankCard:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback _arg1;
          _arg1 = com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback.Stub.asInterface(data.readStrongBinder());
          int _arg2;
          _arg2 = data.readInt();
          this.checkBankCard(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_checkCard:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback _arg1;
          _arg1 = com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback.Stub.asInterface(data.readStrongBinder());
          int _arg2;
          _arg2 = data.readInt();
          this.checkCard(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_cancelCheckCard:
        {
          data.enforceInterface(descriptor);
          this.cancelCheckCard();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_smartCardExchange:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.smartCardExchange(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_cardOff:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.cardOff(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_mifareAuth:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.mifareAuth(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_mifareReadBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareReadBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_mifareWriteBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareWriteBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_mifareIncValue:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareIncValue(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_mifareDecValue:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareDecValue(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_initTransData:
        {
          data.enforceInterface(descriptor);
          com.sunmi.pay.hardware.aidl.bean.TransData _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.sunmi.pay.hardware.aidl.bean.TransData.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.initTransData(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_smartCardExChangeNISO:
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
          int _result = this.smartCardExChangeNISO(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_getCardExistStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getCardExistStatus(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_detectCard:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback _arg1;
          _arg1 = com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback.Stub.asInterface(data.readStrongBinder());
          int _arg2;
          _arg2 = data.readInt();
          this.detectCard(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_smartCardExChangePASS:
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
          int _result = this.smartCardExChangePASS(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_smartCardExChangePASSNoLength:
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
          int _result = this.smartCardExChangePASSNoLength(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt
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
           * 银行卡检卡
           * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
           * @param callback  检卡回调,详见ReadCardCallback
           * @param timeout   timeout 超时时间，（单位为秒）
           * @deprecated
           */
      @Override public void checkBankCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback callback, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkBankCard, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkBankCard(cardType, callback, timeout);
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
           * 行业卡检卡检卡
           * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
           * @param callback  检卡回调,详见ReadCardCallback
           * @param timeout   timeout 超时时间，（单位为秒）
           * @deprecated
           */
      @Override public void checkCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback callback, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCard, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkCard(cardType, callback, timeout);
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
           * 取消检卡
           * @deprecated
           */
      @Override public void cancelCheckCard() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelCheckCard, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().cancelCheckCard();
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
           * APDU指令交互(ISO 7816标准的APDU)
           * @param cardType  卡类型
           * @param apduSend  命令应用数据单元
           * @param apduRecv  卡片应答应用数据单元
           * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
           * @deprecated
           */
      @Override public int smartCardExchange(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(apduSend);
          _data.writeByteArray(apduRecv);
          boolean _status = mRemote.transact(Stub.TRANSACTION_smartCardExchange, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().smartCardExchange(cardType, apduSend, apduRecv);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(apduSend);
          _reply.readByteArray(apduRecv);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 卡片下电
           * @return  0,卡片已经下电(接触式IC)或移走(非接触式IC卡) < 0 失败
           * @deprecated
           */
      @Override public int cardOff(int cardType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cardOff, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().cardOff(cardType);
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
           * M1卡片认证
           * @param keyType   密钥类型,0表示KEY A,1表示 KEY B
           * @param block     认证块号
           * @param key       密钥数据
           * @return          0卡片认证成功,非0认证失败
           * @deprecated
           */
      @Override public int mifareAuth(int keyType, int block, byte[] key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(block);
          _data.writeByteArray(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareAuth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareAuth(keyType, block, key);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(key);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * M1读取块数据
           * @param block     待读取的块号
           * @param blockData 保存读取到块数据的缓存
           * @return          0表示读取成功,6表示读取失败,其他值为错误,非0,认证失败,返回值待整理
           * @deprecated
           */
      @Override public int mifareReadBlock(int block, byte[] blockData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(blockData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareReadBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareReadBlock(block, blockData);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(blockData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * M1写入块数据
           * @param block     待读取的块号
           * @param blockData 保存读取到块数据的缓存
           * @return          0表示写入数据块成功,3表示写入失败,其他值为错误,非0认证失败,返回值待整理
           * @deprecated
           */
      @Override public int mifareWriteBlock(int block, byte[] blockData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(blockData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareWriteBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareWriteBlock(block, blockData);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(blockData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * M1加值
           * @param block 待加值的块号
           * @param value 待加的值缓存,低字节在前,高字节在后
           * @return      0表示加值成功,6表示加值失败,其他值为错误,非0认证失败,返回值待整理
           * @deprecated
           */
      @Override public int mifareIncValue(int block, byte[] value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareIncValue, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareIncValue(block, value);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(value);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * M1减值
           * @param block 待减值的块号
           * @param value 待减的值缓存,低字节在前,高字节在后
           * @return      0表示减值成功,6表示减值失败,其他值为错误,非0认证失败,返回值待整理
           * @deprecated
           */
      @Override public int mifareDecValue(int block, byte[] value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareDecValue, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareDecValue(block, value);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(value);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 初始化交易数据
           * @param transData 交易参数配置对象
           * @return          成功为0,非0为失败
           * @deprecated
           */
      @Override public int initTransData(com.sunmi.pay.hardware.aidl.bean.TransData transData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((transData!=null)) {
            _data.writeInt(1);
            transData.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_initTransData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().initTransData(transData);
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
           * APDU指令交互(激活卡片后按照半双工块传输协议（Half-Duplex Block Transmission Protocol ）方式进行非标准APDU命令数据收发)
           * @param cardType  卡类型
           * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
           * @param apduRecv  卡片应答应用数据单元
           * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
           * @deprecated
           */
      @Override public int smartCardExChangeNISO(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(apduSend);
          if ((apduRecv==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(apduRecv.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_smartCardExChangeNISO, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().smartCardExChangeNISO(cardType, apduSend, apduRecv);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(apduRecv);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 查看卡片是否存在
           * @param cardType  IC，NFC  卡片类型不能复合传递
           * @return < 0 错误, > 0 参考AidlConstants.CardExistStatus
           * @deprecated
           */
      @Override public int getCardExistStatus(int cardType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCardExistStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCardExistStatus(cardType);
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
           * 检卡(不区分银行卡和非银行卡)
           * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
           * @param callback  检卡回调,详见 CheckCardCallback
           * @param timeout   timeout 超时时间，（单位为秒）
           * @deprecated
           */
      @Override public void detectCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback checkCardCallback, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeStrongBinder((((checkCardCallback!=null))?(checkCardCallback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_detectCard, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().detectCard(cardType, checkCardCallback, timeout);
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
           * APDU指令交互(底层裸数据（RAW DATA）收发)
           * @param cardType  卡类型
           * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
           * @param apduRecv  卡片应答应用数据单元
           * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
           * @deprecated
           */
      @Override public int smartCardExChangePASS(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(apduSend);
          if ((apduRecv==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(apduRecv.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_smartCardExChangePASS, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().smartCardExChangePASS(cardType, apduSend, apduRecv);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(apduRecv);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * APDU指令交互(底层裸数据（RAW DATA）收发)
           * @param cardType  卡类型
           * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
           * @param apduRecv  卡片应答应用数据单元(无表示RAPDU有效数据长度的两字节)
           * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
           * @deprecated
           */
      @Override public int smartCardExChangePASSNoLength(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(apduSend);
          if ((apduRecv==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(apduRecv.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_smartCardExChangePASSNoLength, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().smartCardExChangePASSNoLength(cardType, apduSend, apduRecv);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(apduRecv);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt sDefaultImpl;
    }
    static final int TRANSACTION_checkBankCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_checkCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelCheckCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_smartCardExchange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_cardOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_mifareAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_mifareReadBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_mifareWriteBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_mifareIncValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_mifareDecValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_initTransData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_smartCardExChangeNISO = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getCardExistStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_detectCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_smartCardExChangePASS = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_smartCardExChangePASSNoLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt impl) {
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
    public static com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 银行卡检卡
       * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
       * @param callback  检卡回调,详见ReadCardCallback
       * @param timeout   timeout 超时时间，（单位为秒）
       * @deprecated
       */
  public void checkBankCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback callback, int timeout) throws android.os.RemoteException;
  /**
       * 行业卡检卡检卡
       * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
       * @param callback  检卡回调,详见ReadCardCallback
       * @param timeout   timeout 超时时间，（单位为秒）
       * @deprecated
       */
  public void checkCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback callback, int timeout) throws android.os.RemoteException;
  /**
       * 取消检卡
       * @deprecated
       */
  public void cancelCheckCard() throws android.os.RemoteException;
  /**
       * APDU指令交互(ISO 7816标准的APDU)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元
       * @param apduRecv  卡片应答应用数据单元
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       * @deprecated
       */
  public int smartCardExchange(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
  /**
       * 卡片下电
       * @return  0,卡片已经下电(接触式IC)或移走(非接触式IC卡) < 0 失败
       * @deprecated
       */
  public int cardOff(int cardType) throws android.os.RemoteException;
  /**
       * M1卡片认证
       * @param keyType   密钥类型,0表示KEY A,1表示 KEY B
       * @param block     认证块号
       * @param key       密钥数据
       * @return          0卡片认证成功,非0认证失败
       * @deprecated
       */
  public int mifareAuth(int keyType, int block, byte[] key) throws android.os.RemoteException;
  /**
       * M1读取块数据
       * @param block     待读取的块号
       * @param blockData 保存读取到块数据的缓存
       * @return          0表示读取成功,6表示读取失败,其他值为错误,非0,认证失败,返回值待整理
       * @deprecated
       */
  public int mifareReadBlock(int block, byte[] blockData) throws android.os.RemoteException;
  /**
       * M1写入块数据
       * @param block     待读取的块号
       * @param blockData 保存读取到块数据的缓存
       * @return          0表示写入数据块成功,3表示写入失败,其他值为错误,非0认证失败,返回值待整理
       * @deprecated
       */
  public int mifareWriteBlock(int block, byte[] blockData) throws android.os.RemoteException;
  /**
       * M1加值
       * @param block 待加值的块号
       * @param value 待加的值缓存,低字节在前,高字节在后
       * @return      0表示加值成功,6表示加值失败,其他值为错误,非0认证失败,返回值待整理
       * @deprecated
       */
  public int mifareIncValue(int block, byte[] value) throws android.os.RemoteException;
  /**
       * M1减值
       * @param block 待减值的块号
       * @param value 待减的值缓存,低字节在前,高字节在后
       * @return      0表示减值成功,6表示减值失败,其他值为错误,非0认证失败,返回值待整理
       * @deprecated
       */
  public int mifareDecValue(int block, byte[] value) throws android.os.RemoteException;
  /**
       * 初始化交易数据
       * @param transData 交易参数配置对象
       * @return          成功为0,非0为失败
       * @deprecated
       */
  public int initTransData(com.sunmi.pay.hardware.aidl.bean.TransData transData) throws android.os.RemoteException;
  /**
       * APDU指令交互(激活卡片后按照半双工块传输协议（Half-Duplex Block Transmission Protocol ）方式进行非标准APDU命令数据收发)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
       * @param apduRecv  卡片应答应用数据单元
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       * @deprecated
       */
  public int smartCardExChangeNISO(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
  /**
       * 查看卡片是否存在
       * @param cardType  IC，NFC  卡片类型不能复合传递
       * @return < 0 错误, > 0 参考AidlConstants.CardExistStatus
       * @deprecated
       */
  public int getCardExistStatus(int cardType) throws android.os.RemoteException;
  /**
       * 检卡(不区分银行卡和非银行卡)
       * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
       * @param callback  检卡回调,详见 CheckCardCallback
       * @param timeout   timeout 超时时间，（单位为秒）
       * @deprecated
       */
  public void detectCard(int cardType, com.sunmi.pay.hardware.aidl.readcard.CheckCardCallback checkCardCallback, int timeout) throws android.os.RemoteException;
  /**
       * APDU指令交互(底层裸数据（RAW DATA）收发)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
       * @param apduRecv  卡片应答应用数据单元
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       * @deprecated
       */
  public int smartCardExChangePASS(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
  /**
       * APDU指令交互(底层裸数据（RAW DATA）收发)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
       * @param apduRecv  卡片应答应用数据单元(无表示RAPDU有效数据长度的两字节)
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       * @deprecated
       */
  public int smartCardExChangePASSNoLength(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
}
