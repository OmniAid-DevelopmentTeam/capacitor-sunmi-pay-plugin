/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.readcard;
// Declare any non-default types here with import statements

public interface ReadCardOptV2 extends android.os.IInterface
{
  /** Default implementation for ReadCardOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
  {
    /**
         * 检卡(不区分银行卡和非银行卡)
         * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
         * @param callback  检卡回调,详见 CheckCardCallbackV2
         * @param timeout   超时时间（[1-120]，单位为秒）
         */
    @Override public void checkCard(int cardType, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException
    {
    }
    /**
         * 取消检卡
         */
    @Override public void cancelCheckCard() throws android.os.RemoteException
    {
    }
    /**
         * APDU指令交互(ISO 7816标准的APDU)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元
         * @param apduRecv  卡片应答应用数据单元
         * @return          0-成功，非0-错误码
         */
    @Override public int apduCommand(int cardType, com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2 send, com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2 recv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APDU指令交互(ISO 7816标准的APDU)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元
         * @param apduRecv  卡片应答应用数据单元
         * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
         */
    @Override public int smartCardExchange(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APDU指令透传(非ISO 7816标准的APDU)
         * @param cardType  卡类型
         * @param sendBuff  命令应用数据单元,最大256字节
         * @param recvBuff  卡片应答应用数据单元,最小256字节
         * @return >=0-recvBuff中有效数据的长度，<0-错误码
         */
    @Override public int transmitApdu(int cardType, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 卡片下电
         * @return  0-卡片已经下电(接触式IC)或移走(非接触式IC卡)，非0-错误码
         */
    @Override public int cardOff(int cardType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 判断卡是否在位
         * @param cardType  卡类型（非复合类型），仅支持: NFC、IC、PSAM0、PSAM1，每次只能为4种类型中的一种
         * @return  1-卡片不在位，2-卡片在位，其他-错误码
         */
    @Override public int getCardExistStatus(int cardType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1卡片认证
         * @param keyType 密钥类型,0表示KEY A,1表示 KEY B
         * @param block 认证块号
         * @param key 密钥数据
         * @return 0-认证成功，非0-认证失败
         */
    @Override public int mifareAuth(int keyType, int block, byte[] key) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1读取块数据
         * @param block   待读取的块号
         * @param outData 缓存区，保存读取到块数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int mifareReadBlock(int block, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1写入块数据
         * @param block 待写入的块号
         * @param data 块数据
         * @return 0-写数据块成功,非0-错误码
         */
    @Override public int mifareWriteBlock(int block, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1加值
         * @param block 待加值的块号
         * @param value 加值金额，共4字节（小端模式，低字节在前，高字节在后）
         * @return 0-加值成功,，非0-错误码
         */
    @Override public int mifareIncValue(int block, byte[] value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1减值
         * @param block 待减值的块号
         * @param value 减值金额，共4字节，（小端模式，低字节在前，高字节在后）
         * @return 0-减值成功，非0-错误码
         */
    @Override public int mifareDecValue(int block, byte[] value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * Mifare Ultralight C 卡片认证
         * @param authKey 认证密钥
         * @return 0-认证成功，-1-认证失败
         */
    @Override public int mifareUltralightCAuth(byte[] authKey) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * Mifare Ultralight C读取数据
         * @param block 块号
         * @param outData 缓存区，存储读取到块数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int mifareUltralightCReadData(int block, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * Mifare Ultralight C 写入数据
         * @param block 块号
         * @param data 块数据
         * @return 0-写数据成功，非0-错误码
         */
    @Override public int mifareUltralightCWriteData(int block, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APDU指令交互(底层裸数据（RAW DATA）收发)
         * @param cardType  卡类型
         * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
         * @param apduRecv  卡片应答应用数据单元
         * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
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
         */
    @Override public int smartCardExChangePASSNoLength(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * MifarePlus读block数据
         * @param block  待读取的块号
         * @param key 密钥数据
         * @param outData 缓存区，保存读取到块数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int mifarePlusReadBlock(int block, byte[] key, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * MifarePlus写block数据
         * @param block 待写入的块号
         * @param key 密钥数据
         * @param data 块数据
         * @return 0-写数据块成功,非0-错误码
         */
    @Override public int mifarePlusWriteBlock(int block, byte[] key, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * MifarePlus修改block密钥
         * @param block 待修改的块号
         * @param oldKey 旧密钥
         * @param newKey 新密钥
         * @return 0-成功,，非0-错误码
         */
    @Override public int mifarePlusChangeBlockKey(int block, byte[] oldKey, byte[] newKey) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428认证
         * @param key 密钥数据
         * @return 0-成功,，非0-错误码
         */
    @Override public int sleAuthKey(byte[] key) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428改密
         * @param newKey 新密钥数据
         * @return 0-成功,，非0-错误码
         */
    @Override public int sleChangeKey(byte[] newKey) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428读数据
         * @param address 起始地址
         * @param length 读数据的长度
         * @param outData 缓存区，保存读取到的数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int sleReadData(int startAddress, int length, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428写数据
         * @param address 起始地址
         * @param dataIn 要写入的数据，0~253字节
         * @return 0-成功,，非0-错误码
         */
    @Override public int sleWriteData(int startAddress, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428获取剩余认证次数，剩余次数为0时卡片被锁定
         * @return >=0-剩余可认证次数,，<0-错误码
         */
    @Override public int sleGetRemainAuthCount() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428锁定存储单元
         * @param startAddress 起始地址
         * @param length 锁定长度，单位：字节
         * @return 0-成功,，<0-错误码
         */
    @Override public int sleWriteProtectionMemory(int startAddress, int length) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SLE4442/SLE4428获取存储单元的锁定状态
         * @param startAddress 起始地址
         * @param length 锁定长度，单位：字节
         * @param dataOut 缓存区，保存每个字节的锁定状态
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int sleReadMemoryProtectionStatus(int startAddress, int length, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT24C01/02/04/08/16/32/64/128/256/512读数据
         * @param address 起始地址
         * @param length 读数据的长度，单位：字节
         * @param outData 缓存区，保存读取到的数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int at24cReadData(int startAddress, int length, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT24C01/02/04/08/16/32/64/128/256/512写数据
         * @param address 起始地址
         * @param dataIn 要写入的数据，0~253字节
         * @return 0-成功,，非0-错误码
         */
    @Override public int at24cWriteData(int startAddress, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT88SCxx认证
         * @param key 密钥数据(3B)
         * @param rwFlag 读写标志,0-写密码,1-读密码
         * @param zoneNo 用户区域编号,0~7
         * @return 0-成功,，非0-错误码
         */
    @Override public int at88scAuthKey(byte[] key, int rwFlag, int zoneNo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT88SCxx改密
         * @param newKey 新密钥数据(3B)
         * @param rwFlag 读写标志,0-写密码,1-读密码
         * @param zoneNo 用户区域编号,0~7
         * @return 0-成功,，非0-错误码
         */
    @Override public int at88scChangeKey(byte[] newKey, int rwFlag, int zoneNo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT88SCxx读数据
         * @param address 起始地址
         * @param length 读数据的长度
         * @param zoneFlag 区域标志,0-配置区，1-用户区
         * @param outData 缓存区，保存读取到的数据
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int at88scReadData(int startAddress, int length, int zoneFlag, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT88SCxx写数据
         * @param address 起始地址
         * @param zoneFlag 区域标志,0-配置区，1-用户区
         * @param dataIn 要写入的数据，0~253字节
         * @return 0-成功,，非0-错误码
         */
    @Override public int at88scWriteData(int startAddress, int zoneFlag, byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * AT88SCxx获取剩余认证次数，剩余次数为0时卡片被锁定
         * @param rwFlag 读写标志,0-写密码,1-读密码
         * @param zoneNo 用户区域编号,0~7
         * @return >=0-剩余可认证次数,，<0-错误码
         */
    @Override public int at88scGetRemainAuthCount(int rwFlag, int zoneNo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APDU指令透传(非ISO 7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
         * @param cardType  卡类型
         * @param sendBuff  命令应用数据单元,最大256字节
         * @param recvBuff  卡片应答应用数据单元,最小256字节
         * @return >=0-recvBuff中有效数据的长度，<0-错误码
         */
    @Override public int transmitApduEx(int cardType, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * CTX512读块数据
         * @param block 块号
         * @param outData 缓存区，保存读取到的数据(2B)
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int ctx512ReadBlock(int block, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * CTX512写块数据
         * @param block 块号
         * @param data 待写入的数据(2B)
         * @return 0-成功，<0-错误码
         */
    @Override public int ctx512WriteBlock(int block, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * CTX512更新数据
         * @param block 块号
         * @param data 待更新的数据(2B)
         * @return 0-成功，<0-错误码
         */
    @Override public int ctx512UpdateBlock(int block, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * CTX512获取签名数据
         * @param block 块号
         * @param random 随机数据(6B)
         * @param outData 签名数据(2B)
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int ctx512GetSignature(int block, byte[] random, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * CTX512读连续的4个块数据
         * @param startBlock 起始块号
         * @param outData 缓存区，保存读取到的数据(8B)
         * @return >=0-outData中有效数据的长度，<0-错误码
         */
    @Override public int ctx512MultiReadBlock(int startBlock, byte[] outData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1加值(不包含transfer操作)
         * @param block 待加值的块号
         * @param value 加值金额，共4字节（小端模式，低字节在前，高字节在后）
         * @return 0-加值成功,，非0-错误码
         */
    @Override public int mifareIncValueDx(int block, byte[] value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1传输(不包含transfer操作)
         * @param block 待减值的块号
         * @param value 减值金额，共4字节，（小端模式，低字节在前，高字节在后）
         * @return 0-减值成功，非0-错误码
         */
    @Override public int mifareDecValueDx(int block, byte[] value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1传输(将数据寄存器中的内容写入块中)
         * @param destBlock 存储数据的块号
         * @return 0-减值成功，非0-错误码
         */
    @Override public int mifareTransfer(int destBlock) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * M1存储(将块中的内容存到数据寄存器中)
         * @param srcBlock 待操作的块号
         * @return 0-减值成功，非0-错误码
         */
    @Override public int mifareRestore(int srcBlock) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 检卡(不区分银行卡和非银行卡)
         * @param cardType 卡类型,同时支持NFC,IC,MAG卡检卡
         * @param ctrCode  卡片激活控制码,默认值0
         * b0~b1:接触卡工作电压,00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
         * b2:接触CPU卡及SAM卡上电复位速率,0-SPD_1X,1-SPD_4X
         * b3:PPS是否支持,0-不支持,1-支持
         * b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
         * b5:选择卡片支持的第二协议
         * @param stopOnError 是否出错即停止，0-不停止，1-停止
         * @param callback 检卡回调,详见 CheckCardCallbackV2
         * @param timeout  超时时间（[1-120]，单位为秒）
         */
    @Override public void checkCardEx(int cardType, int ctrCode, int stopOnError, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException
    {
    }
    /**
         * APDU指令透传(非ISO-7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
         * @param cardType  卡类型
         * @param ctrCode  卡片数据交互控制码，按位取值如下：
         * b0~b3：非接CPU卡apdu帧等待时间fwi(默认值0x00),取值如下:
         *        0x00~0x03-卡指定时间,0x04-4.832ms,0x05-9.664ms
         *        0x06-19.3ms,0x07-38.7ms,0x08-77.3ms,0x09-154.3ms,0x0A-309ms
         *        0x0B-618.5ms,0x0C-1237ms,0x0D-2474ms,0x0E-4948ms
         * b4~b5：非接cpu卡apdu重试次数(0~2),取值如下:
         *        0-不重试,1-重试1次,2-重试2次,3-预留
         * bit6: 0-本次开启自动获取应答（默认），1-关闭此次自动获取应答（SCC0 SAMx）
         * bit7-bit31：保留将来使用，为0
         * @param sendBuff  命令应用数据单元,最大256字节
         * @param recvBuff  卡片应答应用数据单元,最小256字节
         * @return >=0-recvBuff中有效数据的长度，<0-错误码
         */
    @Override public int transmitApduExx(int cardType, int ctrCode, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 多条APDU指令透传(最多7条，非ISO-7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
         * @param cardType 卡类型
         * @param ctrCode  卡片数据交互控制码，按位取值如下：
         * b0~b3：非接CPU卡apdu帧等待时间fwi(默认值0x00),取值如下:
         *        0x00~0x03-卡指定时间,0x04-4.832ms,0x05-9.664ms
         *        0x06-19.3ms,0x07-38.7ms,0x08-77.3ms,0x09-154.3ms,0x0A-309ms
         *        0x0B-618.5ms,0x0C-1237ms,0x0D-2474ms,0x0E-4948ms
         * b4~b5：非接cpu卡apdu重试次数(0~2),取值如下:
         *        0-不重试,1-重试1次,2-重试2次,3-预留
         * bit6: 0-本次开启自动获取应答（默认），1-关闭此次自动获取应答（SCC0 SAMx）
         * bit7-bit31：保留将来使用，为0
         * @param sendList 发送的Apdu列表(Hex格式)
         * @param recvList 卡片应答数据列表(Hex格式)
         * @return 0-成功，<0-错误码
         */
    @Override public int transmitMultiApdus(int cardType, int ctrCode, java.util.List<java.lang.String> sendList, java.util.List<java.lang.String> recvList) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 检卡(不区分银行卡和非银行卡)
         * @param bundle  入参
         *                   cardType：int，卡类型,同时支持NFC,IC,MAG卡检卡
         *                   encKeySystem：int，密钥体系，包含 0-SEC_MKSK,1-SEC_DUKPT,2-SEC_RSA_KEY,3-SEC_SM2_KEY
         *                   encKeyIndex：int，磁道数据加密索引，一般传入TDK索引
         *                   encKeyAlgType：int，密钥的算法类型，值为KEY_ALG_TYPE_3DES,KEY_ALG_TYPE_AES,KEY_ALG_TYPE_SM4
         *                   encMode：int，加密模式
         *                   encIv：byte[]，初始向量，加密模式为ECB 传空，为其他加密模式传入8字节向量
         *                   encPaddingMode：byte，磁道数据进行DES加密时，长度不是8的倍数，则在后面补齐EncPaddingMode至长度为8的倍数的数据
         *                   encMaskStart：int，表示账号前EncMaskStart位为明文，范围：0~8，默认值：6
         *                   encMaskEnd：int，表示账号后EncMaskEnd位为明文，范围：0~4，默认值：4
         *                   encMaskWord：char，为0或者是非数字字符，表示账号EncMaskStart至encMaskWord为掩码,默认为 *
         *                   panAppendContent：String，RSA对track2加密时前缀/后缀数据（TID）
         *                   panAppendMode：int，RSA对track2加密时前后缀模式，0-前缀式（TID+track2），1-后缀式（track2+TID）
         *                   ctrCode：int，卡片激活控制码,默认值0
         *                      b0~b1:00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
         *                      b2:0-SPD_1X,1-SPD_4X
         *                      b3:是否支持PPS,0-不支持,1-支持
         *                      b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
         *                      b5:选择卡片支持的第二协议
         *                   stopOnError:int,是否出错即停止，0-不停止，1-停止
         * @param callback  检卡回调,详见 CheckCardCallbackV2
         * @param timeout   超时时间（[1-120]，单位为秒）
         */
    @Override public int checkCardEnc(android.os.Bundle bundle, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置智能卡相关参数
         * @param cardType 卡类型
         * @param ctrCode 控制码，取值如下：
         *        0-设置Felica卡轮询指令的系统码(默认为0xffff)，2字节，高位在前
         *        1-设置非接指令交互的超时时间，单位：ms，4字节，高位在前
         *        2-获取非接寄存器配置(TLV格式)
         *        3-设置非接寄存器配置(TLV格式)
         *        4-获取非接参数配置(TLV格式)
         *        5-设置非接参数配置(TLV格式
         * @param dataIn  输入数据
         * @param dataOut 输出数据
         * @return >=0-dataOut中有效数据的长度，<0-错误码
         */
    @Override public int smartCardIoControl(int cardType, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SRI卡获取UID
         * @param bundle 出参，包含key：
         * kindOfCard:卡类型(int)，值为：
         *  0-CARD_SR176
         *  1-CARD_SRIX4K
         *  2-CARD_SRIX512
         *  3-CARD_SRI512
         *  4-CARD_SRI4K
         *  5-CARD_SRT512
         *  0xFF-CARD_OTHER
         * uid:UID(String)
         * @return 0-成功，<0-错误码
         * @deprecated
         */
    @Override public int sriGetUid(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SRI卡读取32bit数据
         * @param address block地址
         * @param data 缓存区，存放读到的block数据（4B）
         * @return 0-成功，<0-错误码
         * @deprecated
         */
    @Override public int sriReadBlock32(int address, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SRI卡写32bit数据
         * @param address block地址
         * @param data 要写入的block数据（4B）
         * @return 0-成功，<0-错误码
         * @deprecated
         */
    @Override public int sriWriteBlock32(int address, byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * SRI卡将指定的块配置成写保护
         * @param nLockReg bit为0-Block配置成写保护（即不可写），bit为1-Block不作任何处理
         * 对于SRI4K卡，nLockReg值含义如下:
         * （1）b0对应blocks7和blocks8
         * （2）b1到b7依次对应block9到block15
         * bit为0表示对应的block配置了写保护，不能做写操作，为1表示未做写保护
         * @return 0-成功，<0-错误码
         * @deprecated
         */
    @Override public int sriProtectBlock(byte nLockReg) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取SRI卡片的写保护记录
         * @param dataOut 缓存区，存放读到的写保护记录（1B）
         * dataOut[0]为写保护记录，bit为0-Block配置成写保护（即不可写），bit为1-Block不作任何处理
         * 对于SRI4K卡，nLockReg值含义如下:
         * （1）b0对应blocks7和blocks8
         * （2）b1到b7依次对应block9到block15
         * bit为0表示对应的block配置了写保护，不能做写操作，为1表示未做写保护
         * @return 0-成功，<0-错误码
         * @deprecated
         */
    @Override public int sriGetBlockProtection(byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 磁条卡读取密文磁道数据
         * @param bundle 检卡参数，包含以下值：
         * cardType：int, 卡类型，同时支持NFC,IC,MAG卡检卡
         * ctrCode：int, 卡片激活控制码，默认值0
         *   b0~b1:00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
         *   b2:0-SPD_1X,1-SPD_4X
         *   b3:是否支持PPS,0-不支持,1-支持
         *   b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
         * code：int, vanCode值：0x01-KICC，0x02-NICE，0x03-KIS，0x04-SMATRO，0x05-KSNET
         * type: int, 卡类型：'I'-IC，'M'-MS/Fallback，'K'-KeyIn，'B'-Barcode
         * maskStart：int, 磁卡账号前maskStart位为明文，范围0-8
         * maskEnd：int, 磁卡账号后maskEnd位为明文，范围0-4，默认最后一位加掩码
         * maskChar：char, 磁卡掩码字符，默认为"*"，传0表示使用默认字符
         * stopOnError：int, 是否出错即停止，0-不停止，1-停止
         * clearMagCache: int, 是否清除磁卡缓存，0-不清除，1-清除（默认值）
         * @param callback 检卡回调，详见 CheckCardCallbackV2
         * @param timeout  超时时间（[1-120]，单位为秒）
         * @return 0-成功，<0-错误码
         */
    @Override public void checkCardForToss(android.os.Bundle bundle, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 callback, int timeout) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2.Stub.Proxy(obj);
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
        case TRANSACTION_checkCard:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2.Stub.asInterface(data.readStrongBinder());
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
        case TRANSACTION_apduCommand:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2 _arg1;
          if ((0!=data.readInt())) {
            _arg1 = com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2 _arg2;
          if ((0!=data.readInt())) {
            _arg2 = com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          int _result = this.apduCommand(_arg0, _arg1, _arg2);
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
        case TRANSACTION_transmitApdu:
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
          int _result = this.transmitApdu(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
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
          return true;
        }
        case TRANSACTION_mifareUltralightCAuth:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.mifareUltralightCAuth(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_mifareUltralightCReadData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareUltralightCReadData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_mifareUltralightCWriteData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareUltralightCWriteData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
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
        case TRANSACTION_mifarePlusReadBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.mifarePlusReadBlock(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_mifarePlusWriteBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.mifarePlusWriteBlock(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_mifarePlusChangeBlockKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.mifarePlusChangeBlockKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sleAuthKey:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sleAuthKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sleChangeKey:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sleChangeKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sleReadData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.sleReadData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_sleWriteData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.sleWriteData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sleGetRemainAuthCount:
        {
          data.enforceInterface(descriptor);
          int _result = this.sleGetRemainAuthCount();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sleWriteProtectionMemory:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.sleWriteProtectionMemory(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sleReadMemoryProtectionStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.sleReadMemoryProtectionStatus(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_at24cReadData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.at24cReadData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_at24cWriteData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.at24cWriteData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_at88scAuthKey:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.at88scAuthKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_at88scChangeKey:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.at88scChangeKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_at88scReadData:
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
          int _result = this.at88scReadData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_at88scWriteData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.at88scWriteData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_at88scGetRemainAuthCount:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.at88scGetRemainAuthCount(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_transmitApduEx:
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
          int _result = this.transmitApduEx(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_ctx512ReadBlock:
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
          int _result = this.ctx512ReadBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_ctx512WriteBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.ctx512WriteBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_ctx512UpdateBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.ctx512UpdateBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_ctx512GetSignature:
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
          int _result = this.ctx512GetSignature(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_ctx512MultiReadBlock:
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
          int _result = this.ctx512MultiReadBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_mifareIncValueDx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareIncValueDx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_mifareDecValueDx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.mifareDecValueDx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_mifareTransfer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.mifareTransfer(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_mifareRestore:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.mifareRestore(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_checkCardEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 _arg3;
          _arg3 = com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2.Stub.asInterface(data.readStrongBinder());
          int _arg4;
          _arg4 = data.readInt();
          this.checkCardEx(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_transmitApduExx:
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
          int _result = this.transmitApduExx(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_transmitMultiApdus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.util.List<java.lang.String> _arg2;
          _arg2 = data.createStringArrayList();
          java.util.List<java.lang.String> _arg3;
          _arg3 = new java.util.ArrayList<java.lang.String>();
          int _result = this.transmitMultiApdus(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeStringList(_arg3);
          return true;
        }
        case TRANSACTION_checkCardEnc:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2.Stub.asInterface(data.readStrongBinder());
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.checkCardEnc(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_smartCardIoControl:
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
          int _result = this.smartCardIoControl(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_sriGetUid:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.sriGetUid(_arg0);
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
        case TRANSACTION_sriReadBlock32:
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
          int _result = this.sriReadBlock32(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_sriWriteBlock32:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.sriWriteBlock32(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sriProtectBlock:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          int _result = this.sriProtectBlock(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sriGetBlockProtection:
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
          int _result = this.sriGetBlockProtection(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_checkCardForToss:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 _arg1;
          _arg1 = com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2.Stub.asInterface(data.readStrongBinder());
          int _arg2;
          _arg2 = data.readInt();
          this.checkCardForToss(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2
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
           * 检卡(不区分银行卡和非银行卡)
           * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
           * @param callback  检卡回调,详见 CheckCardCallbackV2
           * @param timeout   超时时间（[1-120]，单位为秒）
           */
      @Override public void checkCard(int cardType, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeStrongBinder((((checkCardCallback!=null))?(checkCardCallback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCard, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkCard(cardType, checkCardCallback, timeout);
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
           * @return          0-成功，非0-错误码
           */
      @Override public int apduCommand(int cardType, com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2 send, com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2 recv) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          if ((send!=null)) {
            _data.writeInt(1);
            send.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((recv!=null)) {
            _data.writeInt(1);
            recv.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_apduCommand, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().apduCommand(cardType, send, recv);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            recv.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * APDU指令交互(ISO 7816标准的APDU)
           * @param cardType  卡类型
           * @param apduSend  命令应用数据单元
           * @param apduRecv  卡片应答应用数据单元
           * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
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
           * APDU指令透传(非ISO 7816标准的APDU)
           * @param cardType  卡类型
           * @param sendBuff  命令应用数据单元,最大256字节
           * @param recvBuff  卡片应答应用数据单元,最小256字节
           * @return >=0-recvBuff中有效数据的长度，<0-错误码
           */
      @Override public int transmitApdu(int cardType, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(sendBuff);
          if ((recvBuff==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(recvBuff.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_transmitApdu, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().transmitApdu(cardType, sendBuff, recvBuff);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(recvBuff);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 卡片下电
           * @return  0-卡片已经下电(接触式IC)或移走(非接触式IC卡)，非0-错误码
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
           * 判断卡是否在位
           * @param cardType  卡类型（非复合类型），仅支持: NFC、IC、PSAM0、PSAM1，每次只能为4种类型中的一种
           * @return  1-卡片不在位，2-卡片在位，其他-错误码
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
           * M1卡片认证
           * @param keyType 密钥类型,0表示KEY A,1表示 KEY B
           * @param block 认证块号
           * @param key 密钥数据
           * @return 0-认证成功，非0-认证失败
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
           * @param block   待读取的块号
           * @param outData 缓存区，保存读取到块数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int mifareReadBlock(int block, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareReadBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareReadBlock(block, outData);
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
           * M1写入块数据
           * @param block 待写入的块号
           * @param data 块数据
           * @return 0-写数据块成功,非0-错误码
           */
      @Override public int mifareWriteBlock(int block, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareWriteBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareWriteBlock(block, data);
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
           * M1加值
           * @param block 待加值的块号
           * @param value 加值金额，共4字节（小端模式，低字节在前，高字节在后）
           * @return 0-加值成功,，非0-错误码
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
           * @param value 减值金额，共4字节，（小端模式，低字节在前，高字节在后）
           * @return 0-减值成功，非0-错误码
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
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * Mifare Ultralight C 卡片认证
           * @param authKey 认证密钥
           * @return 0-认证成功，-1-认证失败
           */
      @Override public int mifareUltralightCAuth(byte[] authKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(authKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareUltralightCAuth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareUltralightCAuth(authKey);
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
           * Mifare Ultralight C读取数据
           * @param block 块号
           * @param outData 缓存区，存储读取到块数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int mifareUltralightCReadData(int block, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareUltralightCReadData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareUltralightCReadData(block, outData);
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
           * Mifare Ultralight C 写入数据
           * @param block 块号
           * @param data 块数据
           * @return 0-写数据成功，非0-错误码
           */
      @Override public int mifareUltralightCWriteData(int block, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareUltralightCWriteData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareUltralightCWriteData(block, data);
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
           * APDU指令交互(底层裸数据（RAW DATA）收发)
           * @param cardType  卡类型
           * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
           * @param apduRecv  卡片应答应用数据单元
           * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
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
      /**
           * MifarePlus读block数据
           * @param block  待读取的块号
           * @param key 密钥数据
           * @param outData 缓存区，保存读取到块数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int mifarePlusReadBlock(int block, byte[] key, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(key);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifarePlusReadBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifarePlusReadBlock(block, key, outData);
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
           * MifarePlus写block数据
           * @param block 待写入的块号
           * @param key 密钥数据
           * @param data 块数据
           * @return 0-写数据块成功,非0-错误码
           */
      @Override public int mifarePlusWriteBlock(int block, byte[] key, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(key);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifarePlusWriteBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifarePlusWriteBlock(block, key, data);
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
           * MifarePlus修改block密钥
           * @param block 待修改的块号
           * @param oldKey 旧密钥
           * @param newKey 新密钥
           * @return 0-成功,，非0-错误码
           */
      @Override public int mifarePlusChangeBlockKey(int block, byte[] oldKey, byte[] newKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(oldKey);
          _data.writeByteArray(newKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifarePlusChangeBlockKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifarePlusChangeBlockKey(block, oldKey, newKey);
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
           * SLE4442/SLE4428认证
           * @param key 密钥数据
           * @return 0-成功,，非0-错误码
           */
      @Override public int sleAuthKey(byte[] key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleAuthKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleAuthKey(key);
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
           * SLE4442/SLE4428改密
           * @param newKey 新密钥数据
           * @return 0-成功,，非0-错误码
           */
      @Override public int sleChangeKey(byte[] newKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(newKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleChangeKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleChangeKey(newKey);
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
           * SLE4442/SLE4428读数据
           * @param address 起始地址
           * @param length 读数据的长度
           * @param outData 缓存区，保存读取到的数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int sleReadData(int startAddress, int length, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeInt(length);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleReadData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleReadData(startAddress, length, outData);
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
           * SLE4442/SLE4428写数据
           * @param address 起始地址
           * @param dataIn 要写入的数据，0~253字节
           * @return 0-成功,，非0-错误码
           */
      @Override public int sleWriteData(int startAddress, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleWriteData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleWriteData(startAddress, data);
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
           * SLE4442/SLE4428获取剩余认证次数，剩余次数为0时卡片被锁定
           * @return >=0-剩余可认证次数,，<0-错误码
           */
      @Override public int sleGetRemainAuthCount() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleGetRemainAuthCount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleGetRemainAuthCount();
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
           * SLE4442/SLE4428锁定存储单元
           * @param startAddress 起始地址
           * @param length 锁定长度，单位：字节
           * @return 0-成功,，<0-错误码
           */
      @Override public int sleWriteProtectionMemory(int startAddress, int length) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeInt(length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleWriteProtectionMemory, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleWriteProtectionMemory(startAddress, length);
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
           * SLE4442/SLE4428获取存储单元的锁定状态
           * @param startAddress 起始地址
           * @param length 锁定长度，单位：字节
           * @param dataOut 缓存区，保存每个字节的锁定状态
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int sleReadMemoryProtectionStatus(int startAddress, int length, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeInt(length);
          _data.writeByteArray(dataOut);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sleReadMemoryProtectionStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sleReadMemoryProtectionStatus(startAddress, length, dataOut);
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
           * AT24C01/02/04/08/16/32/64/128/256/512读数据
           * @param address 起始地址
           * @param length 读数据的长度，单位：字节
           * @param outData 缓存区，保存读取到的数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int at24cReadData(int startAddress, int length, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeInt(length);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at24cReadData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at24cReadData(startAddress, length, outData);
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
           * AT24C01/02/04/08/16/32/64/128/256/512写数据
           * @param address 起始地址
           * @param dataIn 要写入的数据，0~253字节
           * @return 0-成功,，非0-错误码
           */
      @Override public int at24cWriteData(int startAddress, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at24cWriteData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at24cWriteData(startAddress, data);
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
           * AT88SCxx认证
           * @param key 密钥数据(3B)
           * @param rwFlag 读写标志,0-写密码,1-读密码
           * @param zoneNo 用户区域编号,0~7
           * @return 0-成功,，非0-错误码
           */
      @Override public int at88scAuthKey(byte[] key, int rwFlag, int zoneNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(key);
          _data.writeInt(rwFlag);
          _data.writeInt(zoneNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at88scAuthKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at88scAuthKey(key, rwFlag, zoneNo);
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
           * AT88SCxx改密
           * @param newKey 新密钥数据(3B)
           * @param rwFlag 读写标志,0-写密码,1-读密码
           * @param zoneNo 用户区域编号,0~7
           * @return 0-成功,，非0-错误码
           */
      @Override public int at88scChangeKey(byte[] newKey, int rwFlag, int zoneNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(newKey);
          _data.writeInt(rwFlag);
          _data.writeInt(zoneNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at88scChangeKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at88scChangeKey(newKey, rwFlag, zoneNo);
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
           * AT88SCxx读数据
           * @param address 起始地址
           * @param length 读数据的长度
           * @param zoneFlag 区域标志,0-配置区，1-用户区
           * @param outData 缓存区，保存读取到的数据
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int at88scReadData(int startAddress, int length, int zoneFlag, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeInt(length);
          _data.writeInt(zoneFlag);
          _data.writeByteArray(outData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at88scReadData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at88scReadData(startAddress, length, zoneFlag, outData);
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
           * AT88SCxx写数据
           * @param address 起始地址
           * @param zoneFlag 区域标志,0-配置区，1-用户区
           * @param dataIn 要写入的数据，0~253字节
           * @return 0-成功,，非0-错误码
           */
      @Override public int at88scWriteData(int startAddress, int zoneFlag, byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startAddress);
          _data.writeInt(zoneFlag);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at88scWriteData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at88scWriteData(startAddress, zoneFlag, dataIn);
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
           * AT88SCxx获取剩余认证次数，剩余次数为0时卡片被锁定
           * @param rwFlag 读写标志,0-写密码,1-读密码
           * @param zoneNo 用户区域编号,0~7
           * @return >=0-剩余可认证次数,，<0-错误码
           */
      @Override public int at88scGetRemainAuthCount(int rwFlag, int zoneNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(rwFlag);
          _data.writeInt(zoneNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_at88scGetRemainAuthCount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().at88scGetRemainAuthCount(rwFlag, zoneNo);
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
           * APDU指令透传(非ISO 7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
           * @param cardType  卡类型
           * @param sendBuff  命令应用数据单元,最大256字节
           * @param recvBuff  卡片应答应用数据单元,最小256字节
           * @return >=0-recvBuff中有效数据的长度，<0-错误码
           */
      @Override public int transmitApduEx(int cardType, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeByteArray(sendBuff);
          if ((recvBuff==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(recvBuff.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_transmitApduEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().transmitApduEx(cardType, sendBuff, recvBuff);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(recvBuff);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * CTX512读块数据
           * @param block 块号
           * @param outData 缓存区，保存读取到的数据(2B)
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int ctx512ReadBlock(int block, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_ctx512ReadBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ctx512ReadBlock(block, outData);
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
           * CTX512写块数据
           * @param block 块号
           * @param data 待写入的数据(2B)
           * @return 0-成功，<0-错误码
           */
      @Override public int ctx512WriteBlock(int block, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ctx512WriteBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ctx512WriteBlock(block, data);
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
           * CTX512更新数据
           * @param block 块号
           * @param data 待更新的数据(2B)
           * @return 0-成功，<0-错误码
           */
      @Override public int ctx512UpdateBlock(int block, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ctx512UpdateBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ctx512UpdateBlock(block, data);
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
           * CTX512获取签名数据
           * @param block 块号
           * @param random 随机数据(6B)
           * @param outData 签名数据(2B)
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int ctx512GetSignature(int block, byte[] random, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(random);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_ctx512GetSignature, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ctx512GetSignature(block, random, outData);
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
           * CTX512读连续的4个块数据
           * @param startBlock 起始块号
           * @param outData 缓存区，保存读取到的数据(8B)
           * @return >=0-outData中有效数据的长度，<0-错误码
           */
      @Override public int ctx512MultiReadBlock(int startBlock, byte[] outData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(startBlock);
          if ((outData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_ctx512MultiReadBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ctx512MultiReadBlock(startBlock, outData);
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
           * M1加值(不包含transfer操作)
           * @param block 待加值的块号
           * @param value 加值金额，共4字节（小端模式，低字节在前，高字节在后）
           * @return 0-加值成功,，非0-错误码
           */
      @Override public int mifareIncValueDx(int block, byte[] value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareIncValueDx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareIncValueDx(block, value);
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
           * M1传输(不包含transfer操作)
           * @param block 待减值的块号
           * @param value 减值金额，共4字节，（小端模式，低字节在前，高字节在后）
           * @return 0-减值成功，非0-错误码
           */
      @Override public int mifareDecValueDx(int block, byte[] value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(block);
          _data.writeByteArray(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareDecValueDx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareDecValueDx(block, value);
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
           * M1传输(将数据寄存器中的内容写入块中)
           * @param destBlock 存储数据的块号
           * @return 0-减值成功，非0-错误码
           */
      @Override public int mifareTransfer(int destBlock) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(destBlock);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareTransfer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareTransfer(destBlock);
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
           * M1存储(将块中的内容存到数据寄存器中)
           * @param srcBlock 待操作的块号
           * @return 0-减值成功，非0-错误码
           */
      @Override public int mifareRestore(int srcBlock) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(srcBlock);
          boolean _status = mRemote.transact(Stub.TRANSACTION_mifareRestore, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().mifareRestore(srcBlock);
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
           * @param cardType 卡类型,同时支持NFC,IC,MAG卡检卡
           * @param ctrCode  卡片激活控制码,默认值0
           * b0~b1:接触卡工作电压,00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
           * b2:接触CPU卡及SAM卡上电复位速率,0-SPD_1X,1-SPD_4X
           * b3:PPS是否支持,0-不支持,1-支持
           * b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
           * b5:选择卡片支持的第二协议
           * @param stopOnError 是否出错即停止，0-不停止，1-停止
           * @param callback 检卡回调,详见 CheckCardCallbackV2
           * @param timeout  超时时间（[1-120]，单位为秒）
           */
      @Override public void checkCardEx(int cardType, int ctrCode, int stopOnError, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeInt(ctrCode);
          _data.writeInt(stopOnError);
          _data.writeStrongBinder((((checkCardCallback!=null))?(checkCardCallback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCardEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkCardEx(cardType, ctrCode, stopOnError, checkCardCallback, timeout);
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
           * APDU指令透传(非ISO-7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
           * @param cardType  卡类型
           * @param ctrCode  卡片数据交互控制码，按位取值如下：
           * b0~b3：非接CPU卡apdu帧等待时间fwi(默认值0x00),取值如下:
           *        0x00~0x03-卡指定时间,0x04-4.832ms,0x05-9.664ms
           *        0x06-19.3ms,0x07-38.7ms,0x08-77.3ms,0x09-154.3ms,0x0A-309ms
           *        0x0B-618.5ms,0x0C-1237ms,0x0D-2474ms,0x0E-4948ms
           * b4~b5：非接cpu卡apdu重试次数(0~2),取值如下:
           *        0-不重试,1-重试1次,2-重试2次,3-预留
           * bit6: 0-本次开启自动获取应答（默认），1-关闭此次自动获取应答（SCC0 SAMx）
           * bit7-bit31：保留将来使用，为0
           * @param sendBuff  命令应用数据单元,最大256字节
           * @param recvBuff  卡片应答应用数据单元,最小256字节
           * @return >=0-recvBuff中有效数据的长度，<0-错误码
           */
      @Override public int transmitApduExx(int cardType, int ctrCode, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeInt(ctrCode);
          _data.writeByteArray(sendBuff);
          if ((recvBuff==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(recvBuff.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_transmitApduExx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().transmitApduExx(cardType, ctrCode, sendBuff, recvBuff);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(recvBuff);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 多条APDU指令透传(最多7条，非ISO-7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
           * @param cardType 卡类型
           * @param ctrCode  卡片数据交互控制码，按位取值如下：
           * b0~b3：非接CPU卡apdu帧等待时间fwi(默认值0x00),取值如下:
           *        0x00~0x03-卡指定时间,0x04-4.832ms,0x05-9.664ms
           *        0x06-19.3ms,0x07-38.7ms,0x08-77.3ms,0x09-154.3ms,0x0A-309ms
           *        0x0B-618.5ms,0x0C-1237ms,0x0D-2474ms,0x0E-4948ms
           * b4~b5：非接cpu卡apdu重试次数(0~2),取值如下:
           *        0-不重试,1-重试1次,2-重试2次,3-预留
           * bit6: 0-本次开启自动获取应答（默认），1-关闭此次自动获取应答（SCC0 SAMx）
           * bit7-bit31：保留将来使用，为0
           * @param sendList 发送的Apdu列表(Hex格式)
           * @param recvList 卡片应答数据列表(Hex格式)
           * @return 0-成功，<0-错误码
           */
      @Override public int transmitMultiApdus(int cardType, int ctrCode, java.util.List<java.lang.String> sendList, java.util.List<java.lang.String> recvList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeInt(ctrCode);
          _data.writeStringList(sendList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_transmitMultiApdus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().transmitMultiApdus(cardType, ctrCode, sendList, recvList);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readStringList(recvList);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 检卡(不区分银行卡和非银行卡)
           * @param bundle  入参
           *                   cardType：int，卡类型,同时支持NFC,IC,MAG卡检卡
           *                   encKeySystem：int，密钥体系，包含 0-SEC_MKSK,1-SEC_DUKPT,2-SEC_RSA_KEY,3-SEC_SM2_KEY
           *                   encKeyIndex：int，磁道数据加密索引，一般传入TDK索引
           *                   encKeyAlgType：int，密钥的算法类型，值为KEY_ALG_TYPE_3DES,KEY_ALG_TYPE_AES,KEY_ALG_TYPE_SM4
           *                   encMode：int，加密模式
           *                   encIv：byte[]，初始向量，加密模式为ECB 传空，为其他加密模式传入8字节向量
           *                   encPaddingMode：byte，磁道数据进行DES加密时，长度不是8的倍数，则在后面补齐EncPaddingMode至长度为8的倍数的数据
           *                   encMaskStart：int，表示账号前EncMaskStart位为明文，范围：0~8，默认值：6
           *                   encMaskEnd：int，表示账号后EncMaskEnd位为明文，范围：0~4，默认值：4
           *                   encMaskWord：char，为0或者是非数字字符，表示账号EncMaskStart至encMaskWord为掩码,默认为 *
           *                   panAppendContent：String，RSA对track2加密时前缀/后缀数据（TID）
           *                   panAppendMode：int，RSA对track2加密时前后缀模式，0-前缀式（TID+track2），1-后缀式（track2+TID）
           *                   ctrCode：int，卡片激活控制码,默认值0
           *                      b0~b1:00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
           *                      b2:0-SPD_1X,1-SPD_4X
           *                      b3:是否支持PPS,0-不支持,1-支持
           *                      b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
           *                      b5:选择卡片支持的第二协议
           *                   stopOnError:int,是否出错即停止，0-不停止，1-停止
           * @param callback  检卡回调,详见 CheckCardCallbackV2
           * @param timeout   超时时间（[1-120]，单位为秒）
           */
      @Override public int checkCardEnc(android.os.Bundle bundle, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException
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
          _data.writeStrongBinder((((checkCardCallback!=null))?(checkCardCallback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCardEnc, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().checkCardEnc(bundle, checkCardCallback, timeout);
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
           * 设置智能卡相关参数
           * @param cardType 卡类型
           * @param ctrCode 控制码，取值如下：
           *        0-设置Felica卡轮询指令的系统码(默认为0xffff)，2字节，高位在前
           *        1-设置非接指令交互的超时时间，单位：ms，4字节，高位在前
           *        2-获取非接寄存器配置(TLV格式)
           *        3-设置非接寄存器配置(TLV格式)
           *        4-获取非接参数配置(TLV格式)
           *        5-设置非接参数配置(TLV格式
           * @param dataIn  输入数据
           * @param dataOut 输出数据
           * @return >=0-dataOut中有效数据的长度，<0-错误码
           */
      @Override public int smartCardIoControl(int cardType, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeInt(ctrCode);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_smartCardIoControl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().smartCardIoControl(cardType, ctrCode, dataIn, dataOut);
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
           * SRI卡获取UID
           * @param bundle 出参，包含key：
           * kindOfCard:卡类型(int)，值为：
           *  0-CARD_SR176
           *  1-CARD_SRIX4K
           *  2-CARD_SRIX512
           *  3-CARD_SRI512
           *  4-CARD_SRI4K
           *  5-CARD_SRT512
           *  0xFF-CARD_OTHER
           * uid:UID(String)
           * @return 0-成功，<0-错误码
           * @deprecated
           */
      @Override public int sriGetUid(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sriGetUid, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sriGetUid(bundle);
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
           * SRI卡读取32bit数据
           * @param address block地址
           * @param data 缓存区，存放读到的block数据（4B）
           * @return 0-成功，<0-错误码
           * @deprecated
           */
      @Override public int sriReadBlock32(int address, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(address);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sriReadBlock32, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sriReadBlock32(address, dataOut);
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
           * SRI卡写32bit数据
           * @param address block地址
           * @param data 要写入的block数据（4B）
           * @return 0-成功，<0-错误码
           * @deprecated
           */
      @Override public int sriWriteBlock32(int address, byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(address);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sriWriteBlock32, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sriWriteBlock32(address, dataIn);
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
           * SRI卡将指定的块配置成写保护
           * @param nLockReg bit为0-Block配置成写保护（即不可写），bit为1-Block不作任何处理
           * 对于SRI4K卡，nLockReg值含义如下:
           * （1）b0对应blocks7和blocks8
           * （2）b1到b7依次对应block9到block15
           * bit为0表示对应的block配置了写保护，不能做写操作，为1表示未做写保护
           * @return 0-成功，<0-错误码
           * @deprecated
           */
      @Override public int sriProtectBlock(byte nLockReg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(nLockReg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sriProtectBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sriProtectBlock(nLockReg);
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
           * 获取SRI卡片的写保护记录
           * @param dataOut 缓存区，存放读到的写保护记录（1B）
           * dataOut[0]为写保护记录，bit为0-Block配置成写保护（即不可写），bit为1-Block不作任何处理
           * 对于SRI4K卡，nLockReg值含义如下:
           * （1）b0对应blocks7和blocks8
           * （2）b1到b7依次对应block9到block15
           * bit为0表示对应的block配置了写保护，不能做写操作，为1表示未做写保护
           * @return 0-成功，<0-错误码
           * @deprecated
           */
      @Override public int sriGetBlockProtection(byte[] dataOut) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_sriGetBlockProtection, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sriGetBlockProtection(dataOut);
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
           * 磁条卡读取密文磁道数据
           * @param bundle 检卡参数，包含以下值：
           * cardType：int, 卡类型，同时支持NFC,IC,MAG卡检卡
           * ctrCode：int, 卡片激活控制码，默认值0
           *   b0~b1:00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
           *   b2:0-SPD_1X,1-SPD_4X
           *   b3:是否支持PPS,0-不支持,1-支持
           *   b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
           * code：int, vanCode值：0x01-KICC，0x02-NICE，0x03-KIS，0x04-SMATRO，0x05-KSNET
           * type: int, 卡类型：'I'-IC，'M'-MS/Fallback，'K'-KeyIn，'B'-Barcode
           * maskStart：int, 磁卡账号前maskStart位为明文，范围0-8
           * maskEnd：int, 磁卡账号后maskEnd位为明文，范围0-4，默认最后一位加掩码
           * maskChar：char, 磁卡掩码字符，默认为"*"，传0表示使用默认字符
           * stopOnError：int, 是否出错即停止，0-不停止，1-停止
           * clearMagCache: int, 是否清除磁卡缓存，0-不清除，1-清除（默认值）
           * @param callback 检卡回调，详见 CheckCardCallbackV2
           * @param timeout  超时时间（[1-120]，单位为秒）
           * @return 0-成功，<0-错误码
           */
      @Override public void checkCardForToss(android.os.Bundle bundle, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 callback, int timeout) throws android.os.RemoteException
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
          _data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCardForToss, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().checkCardForToss(bundle, callback, timeout);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_checkCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cancelCheckCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_apduCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_smartCardExchange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_transmitApdu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_cardOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getCardExistStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_mifareAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_mifareReadBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_mifareWriteBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_mifareIncValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_mifareDecValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_mifareUltralightCAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_mifareUltralightCReadData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_mifareUltralightCWriteData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_smartCardExChangePASS = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_smartCardExChangePASSNoLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_mifarePlusReadBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_mifarePlusWriteBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_mifarePlusChangeBlockKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_sleAuthKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_sleChangeKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_sleReadData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_sleWriteData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_sleGetRemainAuthCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_sleWriteProtectionMemory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_sleReadMemoryProtectionStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_at24cReadData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_at24cWriteData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_at88scAuthKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_at88scChangeKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_at88scReadData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_at88scWriteData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_at88scGetRemainAuthCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_transmitApduEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_ctx512ReadBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_ctx512WriteBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_ctx512UpdateBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_ctx512GetSignature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_ctx512MultiReadBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_mifareIncValueDx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_mifareDecValueDx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_mifareTransfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_mifareRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_checkCardEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_transmitApduExx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_transmitMultiApdus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_checkCardEnc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_smartCardIoControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_sriGetUid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_sriReadBlock32 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_sriWriteBlock32 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
    static final int TRANSACTION_sriProtectBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
    static final int TRANSACTION_sriGetBlockProtection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
    static final int TRANSACTION_checkCardForToss = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * 检卡(不区分银行卡和非银行卡)
       * @param cardType  卡类型,同时支持NFC,IC,MAG卡检卡
       * @param callback  检卡回调,详见 CheckCardCallbackV2
       * @param timeout   超时时间（[1-120]，单位为秒）
       */
  public void checkCard(int cardType, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException;
  /**
       * 取消检卡
       */
  public void cancelCheckCard() throws android.os.RemoteException;
  /**
       * APDU指令交互(ISO 7816标准的APDU)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元
       * @param apduRecv  卡片应答应用数据单元
       * @return          0-成功，非0-错误码
       */
  public int apduCommand(int cardType, com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2 send, com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2 recv) throws android.os.RemoteException;
  /**
       * APDU指令交互(ISO 7816标准的APDU)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元
       * @param apduRecv  卡片应答应用数据单元
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       */
  public int smartCardExchange(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
  /**
       * APDU指令透传(非ISO 7816标准的APDU)
       * @param cardType  卡类型
       * @param sendBuff  命令应用数据单元,最大256字节
       * @param recvBuff  卡片应答应用数据单元,最小256字节
       * @return >=0-recvBuff中有效数据的长度，<0-错误码
       */
  public int transmitApdu(int cardType, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException;
  /**
       * 卡片下电
       * @return  0-卡片已经下电(接触式IC)或移走(非接触式IC卡)，非0-错误码
       */
  public int cardOff(int cardType) throws android.os.RemoteException;
  /**
       * 判断卡是否在位
       * @param cardType  卡类型（非复合类型），仅支持: NFC、IC、PSAM0、PSAM1，每次只能为4种类型中的一种
       * @return  1-卡片不在位，2-卡片在位，其他-错误码
       */
  public int getCardExistStatus(int cardType) throws android.os.RemoteException;
  /**
       * M1卡片认证
       * @param keyType 密钥类型,0表示KEY A,1表示 KEY B
       * @param block 认证块号
       * @param key 密钥数据
       * @return 0-认证成功，非0-认证失败
       */
  public int mifareAuth(int keyType, int block, byte[] key) throws android.os.RemoteException;
  /**
       * M1读取块数据
       * @param block   待读取的块号
       * @param outData 缓存区，保存读取到块数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int mifareReadBlock(int block, byte[] outData) throws android.os.RemoteException;
  /**
       * M1写入块数据
       * @param block 待写入的块号
       * @param data 块数据
       * @return 0-写数据块成功,非0-错误码
       */
  public int mifareWriteBlock(int block, byte[] data) throws android.os.RemoteException;
  /**
       * M1加值
       * @param block 待加值的块号
       * @param value 加值金额，共4字节（小端模式，低字节在前，高字节在后）
       * @return 0-加值成功,，非0-错误码
       */
  public int mifareIncValue(int block, byte[] value) throws android.os.RemoteException;
  /**
       * M1减值
       * @param block 待减值的块号
       * @param value 减值金额，共4字节，（小端模式，低字节在前，高字节在后）
       * @return 0-减值成功，非0-错误码
       */
  public int mifareDecValue(int block, byte[] value) throws android.os.RemoteException;
  /**
       * Mifare Ultralight C 卡片认证
       * @param authKey 认证密钥
       * @return 0-认证成功，-1-认证失败
       */
  public int mifareUltralightCAuth(byte[] authKey) throws android.os.RemoteException;
  /**
       * Mifare Ultralight C读取数据
       * @param block 块号
       * @param outData 缓存区，存储读取到块数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int mifareUltralightCReadData(int block, byte[] outData) throws android.os.RemoteException;
  /**
       * Mifare Ultralight C 写入数据
       * @param block 块号
       * @param data 块数据
       * @return 0-写数据成功，非0-错误码
       */
  public int mifareUltralightCWriteData(int block, byte[] data) throws android.os.RemoteException;
  /**
       * APDU指令交互(底层裸数据（RAW DATA）收发)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
       * @param apduRecv  卡片应答应用数据单元
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       */
  public int smartCardExChangePASS(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
  /**
       * APDU指令交互(底层裸数据（RAW DATA）收发)
       * @param cardType  卡类型
       * @param apduSend  命令应用数据单元(command或command+Le或commamd+Lc+indata或commamd+Lc+indata+le)
       * @param apduRecv  卡片应答应用数据单元(无表示RAPDU有效数据长度的两字节)
       * @return          0,交互成功 -1,超时 -2,协议错误 -3,传输错误 其它< 0,与卡交互失败,可能是通信错误（比如,校验）,超时或协议错误（比如,编码错误,数据包类型错误）
       */
  public int smartCardExChangePASSNoLength(int cardType, byte[] apduSend, byte[] apduRecv) throws android.os.RemoteException;
  /**
       * MifarePlus读block数据
       * @param block  待读取的块号
       * @param key 密钥数据
       * @param outData 缓存区，保存读取到块数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int mifarePlusReadBlock(int block, byte[] key, byte[] outData) throws android.os.RemoteException;
  /**
       * MifarePlus写block数据
       * @param block 待写入的块号
       * @param key 密钥数据
       * @param data 块数据
       * @return 0-写数据块成功,非0-错误码
       */
  public int mifarePlusWriteBlock(int block, byte[] key, byte[] data) throws android.os.RemoteException;
  /**
       * MifarePlus修改block密钥
       * @param block 待修改的块号
       * @param oldKey 旧密钥
       * @param newKey 新密钥
       * @return 0-成功,，非0-错误码
       */
  public int mifarePlusChangeBlockKey(int block, byte[] oldKey, byte[] newKey) throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428认证
       * @param key 密钥数据
       * @return 0-成功,，非0-错误码
       */
  public int sleAuthKey(byte[] key) throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428改密
       * @param newKey 新密钥数据
       * @return 0-成功,，非0-错误码
       */
  public int sleChangeKey(byte[] newKey) throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428读数据
       * @param address 起始地址
       * @param length 读数据的长度
       * @param outData 缓存区，保存读取到的数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int sleReadData(int startAddress, int length, byte[] outData) throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428写数据
       * @param address 起始地址
       * @param dataIn 要写入的数据，0~253字节
       * @return 0-成功,，非0-错误码
       */
  public int sleWriteData(int startAddress, byte[] data) throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428获取剩余认证次数，剩余次数为0时卡片被锁定
       * @return >=0-剩余可认证次数,，<0-错误码
       */
  public int sleGetRemainAuthCount() throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428锁定存储单元
       * @param startAddress 起始地址
       * @param length 锁定长度，单位：字节
       * @return 0-成功,，<0-错误码
       */
  public int sleWriteProtectionMemory(int startAddress, int length) throws android.os.RemoteException;
  /**
       * SLE4442/SLE4428获取存储单元的锁定状态
       * @param startAddress 起始地址
       * @param length 锁定长度，单位：字节
       * @param dataOut 缓存区，保存每个字节的锁定状态
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int sleReadMemoryProtectionStatus(int startAddress, int length, byte[] dataOut) throws android.os.RemoteException;
  /**
       * AT24C01/02/04/08/16/32/64/128/256/512读数据
       * @param address 起始地址
       * @param length 读数据的长度，单位：字节
       * @param outData 缓存区，保存读取到的数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int at24cReadData(int startAddress, int length, byte[] outData) throws android.os.RemoteException;
  /**
       * AT24C01/02/04/08/16/32/64/128/256/512写数据
       * @param address 起始地址
       * @param dataIn 要写入的数据，0~253字节
       * @return 0-成功,，非0-错误码
       */
  public int at24cWriteData(int startAddress, byte[] data) throws android.os.RemoteException;
  /**
       * AT88SCxx认证
       * @param key 密钥数据(3B)
       * @param rwFlag 读写标志,0-写密码,1-读密码
       * @param zoneNo 用户区域编号,0~7
       * @return 0-成功,，非0-错误码
       */
  public int at88scAuthKey(byte[] key, int rwFlag, int zoneNo) throws android.os.RemoteException;
  /**
       * AT88SCxx改密
       * @param newKey 新密钥数据(3B)
       * @param rwFlag 读写标志,0-写密码,1-读密码
       * @param zoneNo 用户区域编号,0~7
       * @return 0-成功,，非0-错误码
       */
  public int at88scChangeKey(byte[] newKey, int rwFlag, int zoneNo) throws android.os.RemoteException;
  /**
       * AT88SCxx读数据
       * @param address 起始地址
       * @param length 读数据的长度
       * @param zoneFlag 区域标志,0-配置区，1-用户区
       * @param outData 缓存区，保存读取到的数据
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int at88scReadData(int startAddress, int length, int zoneFlag, byte[] outData) throws android.os.RemoteException;
  /**
       * AT88SCxx写数据
       * @param address 起始地址
       * @param zoneFlag 区域标志,0-配置区，1-用户区
       * @param dataIn 要写入的数据，0~253字节
       * @return 0-成功,，非0-错误码
       */
  public int at88scWriteData(int startAddress, int zoneFlag, byte[] dataIn) throws android.os.RemoteException;
  /**
       * AT88SCxx获取剩余认证次数，剩余次数为0时卡片被锁定
       * @param rwFlag 读写标志,0-写密码,1-读密码
       * @param zoneNo 用户区域编号,0~7
       * @return >=0-剩余可认证次数,，<0-错误码
       */
  public int at88scGetRemainAuthCount(int rwFlag, int zoneNo) throws android.os.RemoteException;
  /**
       * APDU指令透传(非ISO 7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
       * @param cardType  卡类型
       * @param sendBuff  命令应用数据单元,最大256字节
       * @param recvBuff  卡片应答应用数据单元,最小256字节
       * @return >=0-recvBuff中有效数据的长度，<0-错误码
       */
  public int transmitApduEx(int cardType, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException;
  /**
       * CTX512读块数据
       * @param block 块号
       * @param outData 缓存区，保存读取到的数据(2B)
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int ctx512ReadBlock(int block, byte[] outData) throws android.os.RemoteException;
  /**
       * CTX512写块数据
       * @param block 块号
       * @param data 待写入的数据(2B)
       * @return 0-成功，<0-错误码
       */
  public int ctx512WriteBlock(int block, byte[] data) throws android.os.RemoteException;
  /**
       * CTX512更新数据
       * @param block 块号
       * @param data 待更新的数据(2B)
       * @return 0-成功，<0-错误码
       */
  public int ctx512UpdateBlock(int block, byte[] data) throws android.os.RemoteException;
  /**
       * CTX512获取签名数据
       * @param block 块号
       * @param random 随机数据(6B)
       * @param outData 签名数据(2B)
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int ctx512GetSignature(int block, byte[] random, byte[] outData) throws android.os.RemoteException;
  /**
       * CTX512读连续的4个块数据
       * @param startBlock 起始块号
       * @param outData 缓存区，保存读取到的数据(8B)
       * @return >=0-outData中有效数据的长度，<0-错误码
       */
  public int ctx512MultiReadBlock(int startBlock, byte[] outData) throws android.os.RemoteException;
  /**
       * M1加值(不包含transfer操作)
       * @param block 待加值的块号
       * @param value 加值金额，共4字节（小端模式，低字节在前，高字节在后）
       * @return 0-加值成功,，非0-错误码
       */
  public int mifareIncValueDx(int block, byte[] value) throws android.os.RemoteException;
  /**
       * M1传输(不包含transfer操作)
       * @param block 待减值的块号
       * @param value 减值金额，共4字节，（小端模式，低字节在前，高字节在后）
       * @return 0-减值成功，非0-错误码
       */
  public int mifareDecValueDx(int block, byte[] value) throws android.os.RemoteException;
  /**
       * M1传输(将数据寄存器中的内容写入块中)
       * @param destBlock 存储数据的块号
       * @return 0-减值成功，非0-错误码
       */
  public int mifareTransfer(int destBlock) throws android.os.RemoteException;
  /**
       * M1存储(将块中的内容存到数据寄存器中)
       * @param srcBlock 待操作的块号
       * @return 0-减值成功，非0-错误码
       */
  public int mifareRestore(int srcBlock) throws android.os.RemoteException;
  /**
       * 检卡(不区分银行卡和非银行卡)
       * @param cardType 卡类型,同时支持NFC,IC,MAG卡检卡
       * @param ctrCode  卡片激活控制码,默认值0
       * b0~b1:接触卡工作电压,00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
       * b2:接触CPU卡及SAM卡上电复位速率,0-SPD_1X,1-SPD_4X
       * b3:PPS是否支持,0-不支持,1-支持
       * b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
       * b5:选择卡片支持的第二协议
       * @param stopOnError 是否出错即停止，0-不停止，1-停止
       * @param callback 检卡回调,详见 CheckCardCallbackV2
       * @param timeout  超时时间（[1-120]，单位为秒）
       */
  public void checkCardEx(int cardType, int ctrCode, int stopOnError, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException;
  /**
       * APDU指令透传(非ISO-7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
       * @param cardType  卡类型
       * @param ctrCode  卡片数据交互控制码，按位取值如下：
       * b0~b3：非接CPU卡apdu帧等待时间fwi(默认值0x00),取值如下:
       *        0x00~0x03-卡指定时间,0x04-4.832ms,0x05-9.664ms
       *        0x06-19.3ms,0x07-38.7ms,0x08-77.3ms,0x09-154.3ms,0x0A-309ms
       *        0x0B-618.5ms,0x0C-1237ms,0x0D-2474ms,0x0E-4948ms
       * b4~b5：非接cpu卡apdu重试次数(0~2),取值如下:
       *        0-不重试,1-重试1次,2-重试2次,3-预留
       * bit6: 0-本次开启自动获取应答（默认），1-关闭此次自动获取应答（SCC0 SAMx）
       * bit7-bit31：保留将来使用，为0
       * @param sendBuff  命令应用数据单元,最大256字节
       * @param recvBuff  卡片应答应用数据单元,最小256字节
       * @return >=0-recvBuff中有效数据的长度，<0-错误码
       */
  public int transmitApduExx(int cardType, int ctrCode, byte[] sendBuff, byte[] recvBuff) throws android.os.RemoteException;
  /**
       * 多条APDU指令透传(最多7条，非ISO-7816标准的APDU)，本接口和transmitApdu在Mifare卡的透传上逻辑有区别，对其他卡类型无区别
       * @param cardType 卡类型
       * @param ctrCode  卡片数据交互控制码，按位取值如下：
       * b0~b3：非接CPU卡apdu帧等待时间fwi(默认值0x00),取值如下:
       *        0x00~0x03-卡指定时间,0x04-4.832ms,0x05-9.664ms
       *        0x06-19.3ms,0x07-38.7ms,0x08-77.3ms,0x09-154.3ms,0x0A-309ms
       *        0x0B-618.5ms,0x0C-1237ms,0x0D-2474ms,0x0E-4948ms
       * b4~b5：非接cpu卡apdu重试次数(0~2),取值如下:
       *        0-不重试,1-重试1次,2-重试2次,3-预留
       * bit6: 0-本次开启自动获取应答（默认），1-关闭此次自动获取应答（SCC0 SAMx）
       * bit7-bit31：保留将来使用，为0
       * @param sendList 发送的Apdu列表(Hex格式)
       * @param recvList 卡片应答数据列表(Hex格式)
       * @return 0-成功，<0-错误码
       */
  public int transmitMultiApdus(int cardType, int ctrCode, java.util.List<java.lang.String> sendList, java.util.List<java.lang.String> recvList) throws android.os.RemoteException;
  /**
       * 检卡(不区分银行卡和非银行卡)
       * @param bundle  入参
       *                   cardType：int，卡类型,同时支持NFC,IC,MAG卡检卡
       *                   encKeySystem：int，密钥体系，包含 0-SEC_MKSK,1-SEC_DUKPT,2-SEC_RSA_KEY,3-SEC_SM2_KEY
       *                   encKeyIndex：int，磁道数据加密索引，一般传入TDK索引
       *                   encKeyAlgType：int，密钥的算法类型，值为KEY_ALG_TYPE_3DES,KEY_ALG_TYPE_AES,KEY_ALG_TYPE_SM4
       *                   encMode：int，加密模式
       *                   encIv：byte[]，初始向量，加密模式为ECB 传空，为其他加密模式传入8字节向量
       *                   encPaddingMode：byte，磁道数据进行DES加密时，长度不是8的倍数，则在后面补齐EncPaddingMode至长度为8的倍数的数据
       *                   encMaskStart：int，表示账号前EncMaskStart位为明文，范围：0~8，默认值：6
       *                   encMaskEnd：int，表示账号后EncMaskEnd位为明文，范围：0~4，默认值：4
       *                   encMaskWord：char，为0或者是非数字字符，表示账号EncMaskStart至encMaskWord为掩码,默认为 *
       *                   panAppendContent：String，RSA对track2加密时前缀/后缀数据（TID）
       *                   panAppendMode：int，RSA对track2加密时前后缀模式，0-前缀式（TID+track2），1-后缀式（track2+TID）
       *                   ctrCode：int，卡片激活控制码,默认值0
       *                      b0~b1:00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
       *                      b2:0-SPD_1X,1-SPD_4X
       *                      b3:是否支持PPS,0-不支持,1-支持
       *                      b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
       *                      b5:选择卡片支持的第二协议
       *                   stopOnError:int,是否出错即停止，0-不停止，1-停止
       * @param callback  检卡回调,详见 CheckCardCallbackV2
       * @param timeout   超时时间（[1-120]，单位为秒）
       */
  public int checkCardEnc(android.os.Bundle bundle, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 checkCardCallback, int timeout) throws android.os.RemoteException;
  /**
       * 设置智能卡相关参数
       * @param cardType 卡类型
       * @param ctrCode 控制码，取值如下：
       *        0-设置Felica卡轮询指令的系统码(默认为0xffff)，2字节，高位在前
       *        1-设置非接指令交互的超时时间，单位：ms，4字节，高位在前
       *        2-获取非接寄存器配置(TLV格式)
       *        3-设置非接寄存器配置(TLV格式)
       *        4-获取非接参数配置(TLV格式)
       *        5-设置非接参数配置(TLV格式
       * @param dataIn  输入数据
       * @param dataOut 输出数据
       * @return >=0-dataOut中有效数据的长度，<0-错误码
       */
  public int smartCardIoControl(int cardType, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * SRI卡获取UID
       * @param bundle 出参，包含key：
       * kindOfCard:卡类型(int)，值为：
       *  0-CARD_SR176
       *  1-CARD_SRIX4K
       *  2-CARD_SRIX512
       *  3-CARD_SRI512
       *  4-CARD_SRI4K
       *  5-CARD_SRT512
       *  0xFF-CARD_OTHER
       * uid:UID(String)
       * @return 0-成功，<0-错误码
       * @deprecated
       */
  public int sriGetUid(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * SRI卡读取32bit数据
       * @param address block地址
       * @param data 缓存区，存放读到的block数据（4B）
       * @return 0-成功，<0-错误码
       * @deprecated
       */
  public int sriReadBlock32(int address, byte[] dataOut) throws android.os.RemoteException;
  /**
       * SRI卡写32bit数据
       * @param address block地址
       * @param data 要写入的block数据（4B）
       * @return 0-成功，<0-错误码
       * @deprecated
       */
  public int sriWriteBlock32(int address, byte[] dataIn) throws android.os.RemoteException;
  /**
       * SRI卡将指定的块配置成写保护
       * @param nLockReg bit为0-Block配置成写保护（即不可写），bit为1-Block不作任何处理
       * 对于SRI4K卡，nLockReg值含义如下:
       * （1）b0对应blocks7和blocks8
       * （2）b1到b7依次对应block9到block15
       * bit为0表示对应的block配置了写保护，不能做写操作，为1表示未做写保护
       * @return 0-成功，<0-错误码
       * @deprecated
       */
  public int sriProtectBlock(byte nLockReg) throws android.os.RemoteException;
  /**
       * 获取SRI卡片的写保护记录
       * @param dataOut 缓存区，存放读到的写保护记录（1B）
       * dataOut[0]为写保护记录，bit为0-Block配置成写保护（即不可写），bit为1-Block不作任何处理
       * 对于SRI4K卡，nLockReg值含义如下:
       * （1）b0对应blocks7和blocks8
       * （2）b1到b7依次对应block9到block15
       * bit为0表示对应的block配置了写保护，不能做写操作，为1表示未做写保护
       * @return 0-成功，<0-错误码
       * @deprecated
       */
  public int sriGetBlockProtection(byte[] dataOut) throws android.os.RemoteException;
  /**
       * 磁条卡读取密文磁道数据
       * @param bundle 检卡参数，包含以下值：
       * cardType：int, 卡类型，同时支持NFC,IC,MAG卡检卡
       * ctrCode：int, 卡片激活控制码，默认值0
       *   b0~b1:00-VCC_3000mV,01-VCC_1800mV,02-VCC_5000mV,03-预留
       *   b2:0-SPD_1X,1-SPD_4X
       *   b3:是否支持PPS,0-不支持,1-支持
       *   b4:接触CPU卡及SAM卡协议流程,0-ICC_SPEC,1-ICC_EMV
       * code：int, vanCode值：0x01-KICC，0x02-NICE，0x03-KIS，0x04-SMATRO，0x05-KSNET
       * type: int, 卡类型：'I'-IC，'M'-MS/Fallback，'K'-KeyIn，'B'-Barcode
       * maskStart：int, 磁卡账号前maskStart位为明文，范围0-8
       * maskEnd：int, 磁卡账号后maskEnd位为明文，范围0-4，默认最后一位加掩码
       * maskChar：char, 磁卡掩码字符，默认为"*"，传0表示使用默认字符
       * stopOnError：int, 是否出错即停止，0-不停止，1-停止
       * clearMagCache: int, 是否清除磁卡缓存，0-不清除，1-清除（默认值）
       * @param callback 检卡回调，详见 CheckCardCallbackV2
       * @param timeout  超时时间（[1-120]，单位为秒）
       * @return 0-成功，<0-错误码
       */
  public void checkCardForToss(android.os.Bundle bundle, com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2 callback, int timeout) throws android.os.RemoteException;
}
