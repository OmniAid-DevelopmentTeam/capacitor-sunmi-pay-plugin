/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.system;
// Declare any non-default types here with import statements

public interface BasicOptV2 extends android.os.IInterface
{
  /** Default implementation for BasicOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
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
         * @return 0-成功,非0-错误码
         */
    @Override public int setSysParam(java.lang.String key, java.lang.String value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 蜂鸣器
         * 功能>控制设备上的蜂鸣器响
         * @param count 连续鸣响的次数(0~100)
         * @param freq  鸣响频率（单位:HZ）
         * @param duration 鸣响的时长（单位：ms）
         * @param interval 两次鸣响的时间间隔（单位：ms,0~10000）
         * @return 0-成功，非0-错误码
         */
    @Override public void buzzerOnDevice(int count, int freq, int duration, int interval) throws android.os.RemoteException
    {
    }
    /**
         * LED灯控制
         * 功能>设备上的LED灯状态
         * @param ledIndex: 设备上的LED索引，1~4；1-红，2-绿，3-黄，4-蓝
         * @param ledStatus：LED状态，1表示LED灭，0表示LED亮
         * @return 0-成功，非0-错误码
         */
    @Override public int ledStatusOnDevice(int ledIndex, int ledStatus) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置屏幕独占
         * 功能>设置屏幕独占 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键
         * @param mode：设置屏幕独占的模式，1：设置屏幕独占，-1设置取消屏幕独占
         * @return 0-成功，非0-错误码
         */
    @Override public int setScreenMode(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取随机数
         * 功能>获取随机数
         * @param randData：随机数
         * @param len：要获取的随机数长度
         * @return 0-成功，非0-错误码
         */
    @Override public int sysGetRandom(byte[] randData, int len) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 扩展版LED灯控制
         * @param redStatus 红灯状态,0-亮，1-灭
         * @param greenStatus 绿灯状态,0-亮，1-灭
         * @param yellowStatus 黄灯状态,0-亮，1-灭
         * @param blueStatus 蓝灯状态,0-亮，1-灭
         * @return 0-成功，非0-错误码
         */
    @Override public int ledStatusOnDeviceEx(int redStatus, int greenStatus, int yellowStatus, int blueStatus) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置状态栏下拉模式
         * @param mode 状态栏下拉模式，0-启用下拉，1-禁用下拉
         * @return 0-成功，非0-错误码
         */
    @Override public int setStatusBarDropDownMode(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置导航栏可见性
         * @param visibility 导航栏可见性，0-隐藏，1-显示
         * @return 0-成功，非0-错误码
         */
    @Override public int setNavigationBarVisibility(int visibility) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置隐藏导航栏图标
         * STATUS_BAR_DISABLE_HOME = 0x00200000;//隐藏home键
         * STATUS_BAR_DISABLE_BACK = 0x00400000;//隐藏返回键
         * STATUS_BAR_DISABLE_RECENT = 0x01000000;//隐藏recent键
         * @param mode：隐藏标志，STATUS_BAR_DISABLE_HOME | STATUS_BAR_DISABLE_BACK 可同时隐藏home键和返回键
         * @return 0-成功，非0-错误码
         */
    @Override public int setHideNavigationBarItems(int flag) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 电源管理
         * @param mode 模式，1-休眠(不支持)，2-关机，3-重启
         * @return 0-成功，非0-错误码
         */
    @Override public int sysPowerManage(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * APP动态权限配置
         * @param packageName 目标APP包名
         * @return 0-成功，非0-错误码
         */
    @Override public int allowDynamicPermission(java.lang.String packageName) throws android.os.RemoteException
    {
      return 0;
    }
    /*
         * 设置全局wifi代理
         * @param proxy ip:port 或 url:port
         * @return 0-成功，<0-错误码
         */
    @Override public int setGlobalProxy(java.lang.String proxy) throws android.os.RemoteException
    {
      return 0;
    }
    /*
         * 安装CA证书
         * @param name 证书名称
         * @parma contents 证书内容
         * @return 0-成功，非0-错误码
         */
    @Override public int installApplicationCertificate(java.lang.String name, java.lang.String contents) throws android.os.RemoteException
    {
      return 0;
    }
    /*
         * 卸载CA证书
         * @param name 证书名称
         * @return 0-成功，非0-错误码
         */
    @Override public int uninstallApplicationCertificate(java.lang.String name) throws android.os.RemoteException
    {
      return 0;
    }
    /*
         * 获取CPU使用率
         * @param name 证书名称
         * @return 非空-CPU使用率，空-出错
         */
    @Override public java.lang.String getCpuUsage() throws android.os.RemoteException
    {
      return null;
    }
    /*
         * 获取CPU温度
         * @param name 证书名称
         * @return 非空-CPU温度，空-出错
         */
    @Override public java.lang.String getCpuTemperature() throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 设置定时重启
         * @param hour 时（0~23）
         * @param minute 分（0~59）
         * @param second 秒（0~59）
         * @param millisecond 毫秒（0~999）
         * @return 0-成功，非0-错误码
         */
    @Override public int setScheduleReboot(int hour, int minute, int second, int millisecond) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 清除定时重启
         * @return 0-成功，非0-错误码
         */
    @Override public int clearScheduleReboot() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 自定义功能键
         * @param 功能定义，包含如下key：
         * key：String，按键名称，如“volume_2”
         * type：String，功能类型，值可以为“function”、“native”
         * value：String，功能类型对应的值，type为“function”时，value为"volume_up"或"volume_down";
                          type为“native”时，value只能为“native”
         * @return 0-成功，非0-错误码
         */
    @Override public int customizeFunctionKey(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 添加APP至LMK白名单
         * @param packageName 目标APP包名
         * @return 0-成功，非0-错误码
         */
    @Override public int setLMKPackage(java.lang.String packageName) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 将APP从LMK白名单移除
         * @param packageName 目标APP包名
         * @return 0-成功，非0-错误码
         */
    @Override public int removeLMKPackage(java.lang.String packageName) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置设备唤醒源
         * @param channel 唤醒源，1-IC卡唤醒，2-磁卡唤醒，3-按键唤醒
         * @param mode 模式，0-关，1-开
         * @param attr 其他属性，预留
         * @return 0-成功，非0-错误码
         */
    @Override public int sysSetWakeup(int channel, int mode, android.os.Bundle attr) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置首选的网络类型
         * @param mode 网络类型，包含以下值：
         * 0-GSM/WCDMA (WCDMA preferred)
         * 1-GSM only
         * 2-WCDMA only
         * 3-GSM/WCDMA (auto mode, according to PRL) AVAILABLE Application Settings menu
         * 4-CDMA and EvDo (auto mode, according to PRL) AVAILABLE Application Settings menu
         * 5-CDMA only
         * 6-EvDo only
         * 7-GSM/WCDMA, CDMA, and EvDo (auto mode, according to PRL) AVAILABLE Application Settings menu
         * 8-LTE, CDMA and EvDo
         * 9-LTE, GSM/WCDMA
         * 10-LTE, CDMA, EvDo, GSM/WCDMA
         * 11-LTE Only mode.
         * 12-LTE/WCDMA
         * 13-TD-SCDMA only
         * 14-TD-SCDMA and WCDMA
         * 15-TD-SCDMA and LTE
         * 16-TD-SCDMA and GSM
         * 17-TD-SCDMA,GSM and LTE
         * 18-TD-SCDMA, GSM/WCDMA
         * 19-TD-SCDMA, WCDMA and LTE
         * 20-TD-SCDMA, GSM/WCDMA and LTE
         * 21-TD-SCDMA,EvDo,CDMA,GSM/WCDMA
         * 22-TD-SCDMA/LTE/GSM/WCDMA, CDMA, and EvDo
         * 30-LTE/GSM
         * 31-LTE TDD Only mode.
         * 32-CDMA,GSM(2G Global)
         * 33-CDMA,EVDO,GSM
         * 34-LTE,CDMA,EVDO,GSM(4G Global, 4M)
         * @param slotIndex sim卡槽索引
         * @return 0-成功，非0-错误码
         */
    @Override public int setPreferredNetworkMode(int mode, int slotIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取支持的网络类型
         * @param subId sim卡槽索引
         * @return 非空-网络类型，空-出错
         */
    @Override public java.lang.String getSupportedNetworkType(int slotIndex) throws android.os.RemoteException
    {
      return null;
    }
    /**
         * 打开或关闭飞行模式
         * @param enable 开关，true-打开飞行模式，false-关闭飞行模式
         * @return 0-成功，非0-错误码
         */
    @Override public int setAirplaneMode(boolean enable) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 打开或关闭数据漫游
         * @param subId sim卡槽索引
         * @param enable 开关，true-开启数据漫游，false-关闭数据漫游
         * @return 0-成功，非0-错误码
         */
    @Override public int setDataRoamingEnable(int slotIndex, boolean enable) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 启用/禁用电话功能
         * @param enable 开关，true-启用电话功能，false-禁用电话功能
         * @return 0-成功，非0-错误码
         */
    @Override public int enablePhoneCall(boolean enable) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取MAG刷卡、IC/NFC检卡成功/失败的的次数
         * @param cardType 卡类型，值为MAG/IC/NFC
         * @return >=0-成功/失败的次数，<0-错误码
         */
    @Override public int getCardUsageCount(int cardType, boolean isSuccess) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取模块的可访问性
         * @param module 模块，1-MAG，2-ICC，3-PICC，4-PinPad
         * @return 0-禁用，1-启用，<0-错误码
         */
    @Override public int getModuleAccessibility(int module) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置模块的可访问性
         * @param module 模块，1-MAG，2-ICC，3-PICC，4-PinPad
         * @param ability 可访问性，0-禁用，1-启用
         * @return 0-成功，非0-错误码
         */
    @Override public int setModuleAccessibility(int module, int ability) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取PED（PIN Entry Device）模式
         * @return >=PED模式，1-共享模式，2-隔离模式，3-混合模式，<0-错误码
         */
    @Override public int getPedMode() throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 设置PED（PIN Entry Device）模式
         * @param mode PED模式，1-共享模式，2-隔离模式，3-混合模式
         * @return 0-成功，<0-错误码
         */
    @Override public int setPedMode(int mode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取所有PED（PIN Entry Device）密钥信息
         * @param info 返回数据
         * @return 0-成功，<0-错误码
         */
    @Override public int getPedKeysInfo(android.os.Bundle info) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 安装共享so库
         * @param path 共享so库的绝对路径
         * @return 0-成功，<0-错误码
         */
    @Override public int installSharedLib(java.lang.String path) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 删除共享so库
         * @param name 共享so库的名称
         * @return 0-成功，<0-错误码
         */
    @Override public int deleteSharedLib(java.lang.String name) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 安装Liteso文件
         * @param index Liteso安装的位置，根据芯片配置而定，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
         * @param filePath Liteso的完整文件路径（路径名最大长度不超过128字节）
         * @return 0-成功，<0-错误码
         */
    @Override public int litesoInstaller(int index, java.lang.String filePath) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 运行指定idx对应的Liteso.运行前会清除上次运行的Liteso及其存储空间所有数据,并重启SE芯片. 运行成功后, SE芯片会保存当前索引,直到下一次执行LitesoRun接口.
         * @param index 需要切换的Liteso的索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
         * @return 0-成功，<0-错误码
         */
    @Override public int litesoRun(int index) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取Liteso信息
         * @param index Liteso索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
         * @param info Liteso信息，包含如下key：
         * name: Liteso名称(String)
         * desc: Liteso应用描述(String)
         * vender: Liteso厂商描述(String)
         * version: Liteso版本信息(String)
         * @return 0-成功，<0-错误码
         */
    @Override public int litesoInfo(int index, android.os.Bundle info) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取当前运行的Liteso信息
         * @param info Liteso信息，包含如下key：
         * name: Liteso名称(String)
         * desc: Liteso应用描述(String)
         * vender: Liteso厂商描述(String)
         * version: Liteso版本信息(String)
         * @return 0-成功，<0-错误码
         */
    @Override public int litesoRunInfo(android.os.Bundle info) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 与当前选择的Liteso进行数据交互
         * @param cmd 指令码
         * @param dataIn 传给Liteso的数据区，长度：0~1500
         * @param dataOut 指令的结果数据
         * @return >=0-dataOut中有效数据的长度，<0-错误码
         */
    @Override public int litesoCustomCmd(int cmd, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 删除Liteso
         * @param index 需要删除的Liteso索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
         * @return 0-成功，<0-错误码
         */
    @Override public int litesoRemove(int index) throws android.os.RemoteException
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
    /**
         * 获取RTC电池电压
         * @return bundle 包含如下key：
         * vol: 电压值，单位:mv(int)
         * fromAdc: 电压值来源(int)，0-缓存值，1-从ADC中直接读取的值，非缓存值
         * （1）若累计时间已超时,将使能检测电路读取纽扣电池的电压,更新缓存值并在上报的数据包中将ReadFromAdc标志置为1;
         * （2）若累计时间未超时,返回给上层的数据包中使用纽扣电池电压的缓存值,并将readFromAdc标志置为0
         * @return 0-成功，<0-错误码
         */
    @Override public int getRtcBatVol(android.os.Bundle info) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 读取验签Puk
         * @param pukType 1-manufacturer，2-resaller (不支持)
         * @return bundle 包含如下key：
         * pubKey：公钥数据(byte[])，长度264B，格式为：模长(4B，MSB，值为LEN)+模(LEN B)+指数(4B, MSB)
         * digestTime: 生效时间(long)，单位:ms
         * validDate: 失效时间(long)，单位：ms
         * owner：拥有者名称(String)
         * @return 0-成功，<0-错误码
         */
    @Override public int readPuk(int pukType, android.os.Bundle info) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.system.BasicOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.system.BasicOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.system.BasicOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.system.BasicOptV2.Stub.Proxy(obj);
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
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.buzzerOnDevice(_arg0, _arg1, _arg2, _arg3);
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
        case TRANSACTION_ledStatusOnDeviceEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _result = this.ledStatusOnDeviceEx(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setStatusBarDropDownMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setStatusBarDropDownMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setNavigationBarVisibility:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setNavigationBarVisibility(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setHideNavigationBarItems:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setHideNavigationBarItems(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysPowerManage:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.sysPowerManage(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_allowDynamicPermission:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.allowDynamicPermission(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setGlobalProxy:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.setGlobalProxy(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_installApplicationCertificate:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.installApplicationCertificate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_uninstallApplicationCertificate:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.uninstallApplicationCertificate(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getCpuUsage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getCpuUsage();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getCpuTemperature:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getCpuTemperature();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setScheduleReboot:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _result = this.setScheduleReboot(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_clearScheduleReboot:
        {
          data.enforceInterface(descriptor);
          int _result = this.clearScheduleReboot();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_customizeFunctionKey:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.customizeFunctionKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setLMKPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.setLMKPackage(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_removeLMKPackage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.removeLMKPackage(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysSetWakeup:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          int _result = this.sysSetWakeup(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setPreferredNetworkMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.setPreferredNetworkMode(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getSupportedNetworkType:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getSupportedNetworkType(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setAirplaneMode:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          int _result = this.setAirplaneMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setDataRoamingEnable:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          int _result = this.setDataRoamingEnable(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_enablePhoneCall:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          int _result = this.enablePhoneCall(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getCardUsageCount:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          int _result = this.getCardUsageCount(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getModuleAccessibility:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getModuleAccessibility(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setModuleAccessibility:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.setModuleAccessibility(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPedMode:
        {
          data.enforceInterface(descriptor);
          int _result = this.getPedMode();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setPedMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setPedMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPedKeysInfo:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.getPedKeysInfo(_arg0);
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
        case TRANSACTION_installSharedLib:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.installSharedLib(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteSharedLib:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _result = this.deleteSharedLib(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_litesoInstaller:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.litesoInstaller(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_litesoRun:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.litesoRun(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_litesoInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.litesoInfo(_arg0, _arg1);
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
        case TRANSACTION_litesoRunInfo:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.litesoRunInfo(_arg0);
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
        case TRANSACTION_litesoCustomCmd:
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
          int _result = this.litesoCustomCmd(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_litesoRemove:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.litesoRemove(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
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
        case TRANSACTION_getRtcBatVol:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          int _result = this.getRtcBatVol(_arg0);
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
        case TRANSACTION_readPuk:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.readPuk(_arg0, _arg1);
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
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.system.BasicOptV2
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
           * @return 0-成功,非0-错误码
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
           * @param count 连续鸣响的次数(0~100)
           * @param freq  鸣响频率（单位:HZ）
           * @param duration 鸣响的时长（单位：ms）
           * @param interval 两次鸣响的时间间隔（单位：ms,0~10000）
           * @return 0-成功，非0-错误码
           */
      @Override public void buzzerOnDevice(int count, int freq, int duration, int interval) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(count);
          _data.writeInt(freq);
          _data.writeInt(duration);
          _data.writeInt(interval);
          boolean _status = mRemote.transact(Stub.TRANSACTION_buzzerOnDevice, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().buzzerOnDevice(count, freq, duration, interval);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * LED灯控制
           * 功能>设备上的LED灯状态
           * @param ledIndex: 设备上的LED索引，1~4；1-红，2-绿，3-黄，4-蓝
           * @param ledStatus：LED状态，1表示LED灭，0表示LED亮
           * @return 0-成功，非0-错误码
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
           * @return 0-成功，非0-错误码
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
           * 获取随机数
           * 功能>获取随机数
           * @param randData：随机数
           * @param len：要获取的随机数长度
           * @return 0-成功，非0-错误码
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
           * 扩展版LED灯控制
           * @param redStatus 红灯状态,0-亮，1-灭
           * @param greenStatus 绿灯状态,0-亮，1-灭
           * @param yellowStatus 黄灯状态,0-亮，1-灭
           * @param blueStatus 蓝灯状态,0-亮，1-灭
           * @return 0-成功，非0-错误码
           */
      @Override public int ledStatusOnDeviceEx(int redStatus, int greenStatus, int yellowStatus, int blueStatus) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(redStatus);
          _data.writeInt(greenStatus);
          _data.writeInt(yellowStatus);
          _data.writeInt(blueStatus);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ledStatusOnDeviceEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ledStatusOnDeviceEx(redStatus, greenStatus, yellowStatus, blueStatus);
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
           * 设置状态栏下拉模式
           * @param mode 状态栏下拉模式，0-启用下拉，1-禁用下拉
           * @return 0-成功，非0-错误码
           */
      @Override public int setStatusBarDropDownMode(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setStatusBarDropDownMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setStatusBarDropDownMode(mode);
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
           * 设置导航栏可见性
           * @param visibility 导航栏可见性，0-隐藏，1-显示
           * @return 0-成功，非0-错误码
           */
      @Override public int setNavigationBarVisibility(int visibility) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(visibility);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNavigationBarVisibility, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setNavigationBarVisibility(visibility);
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
           * 设置隐藏导航栏图标
           * STATUS_BAR_DISABLE_HOME = 0x00200000;//隐藏home键
           * STATUS_BAR_DISABLE_BACK = 0x00400000;//隐藏返回键
           * STATUS_BAR_DISABLE_RECENT = 0x01000000;//隐藏recent键
           * @param mode：隐藏标志，STATUS_BAR_DISABLE_HOME | STATUS_BAR_DISABLE_BACK 可同时隐藏home键和返回键
           * @return 0-成功，非0-错误码
           */
      @Override public int setHideNavigationBarItems(int flag) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(flag);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setHideNavigationBarItems, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setHideNavigationBarItems(flag);
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
           * 电源管理
           * @param mode 模式，1-休眠(不支持)，2-关机，3-重启
           * @return 0-成功，非0-错误码
           */
      @Override public int sysPowerManage(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysPowerManage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysPowerManage(mode);
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
           * APP动态权限配置
           * @param packageName 目标APP包名
           * @return 0-成功，非0-错误码
           */
      @Override public int allowDynamicPermission(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_allowDynamicPermission, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().allowDynamicPermission(packageName);
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
      /*
           * 设置全局wifi代理
           * @param proxy ip:port 或 url:port
           * @return 0-成功，<0-错误码
           */
      @Override public int setGlobalProxy(java.lang.String proxy) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(proxy);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGlobalProxy, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setGlobalProxy(proxy);
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
      /*
           * 安装CA证书
           * @param name 证书名称
           * @parma contents 证书内容
           * @return 0-成功，非0-错误码
           */
      @Override public int installApplicationCertificate(java.lang.String name, java.lang.String contents) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          _data.writeString(contents);
          boolean _status = mRemote.transact(Stub.TRANSACTION_installApplicationCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().installApplicationCertificate(name, contents);
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
      /*
           * 卸载CA证书
           * @param name 证书名称
           * @return 0-成功，非0-错误码
           */
      @Override public int uninstallApplicationCertificate(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_uninstallApplicationCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().uninstallApplicationCertificate(name);
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
      /*
           * 获取CPU使用率
           * @param name 证书名称
           * @return 非空-CPU使用率，空-出错
           */
      @Override public java.lang.String getCpuUsage() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCpuUsage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCpuUsage();
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
      /*
           * 获取CPU温度
           * @param name 证书名称
           * @return 非空-CPU温度，空-出错
           */
      @Override public java.lang.String getCpuTemperature() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCpuTemperature, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCpuTemperature();
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
           * 设置定时重启
           * @param hour 时（0~23）
           * @param minute 分（0~59）
           * @param second 秒（0~59）
           * @param millisecond 毫秒（0~999）
           * @return 0-成功，非0-错误码
           */
      @Override public int setScheduleReboot(int hour, int minute, int second, int millisecond) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(hour);
          _data.writeInt(minute);
          _data.writeInt(second);
          _data.writeInt(millisecond);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setScheduleReboot, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setScheduleReboot(hour, minute, second, millisecond);
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
           * 清除定时重启
           * @return 0-成功，非0-错误码
           */
      @Override public int clearScheduleReboot() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearScheduleReboot, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().clearScheduleReboot();
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
           * 自定义功能键
           * @param 功能定义，包含如下key：
           * key：String，按键名称，如“volume_2”
           * type：String，功能类型，值可以为“function”、“native”
           * value：String，功能类型对应的值，type为“function”时，value为"volume_up"或"volume_down";
                            type为“native”时，value只能为“native”
           * @return 0-成功，非0-错误码
           */
      @Override public int customizeFunctionKey(android.os.Bundle bundle) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_customizeFunctionKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().customizeFunctionKey(bundle);
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
           * 添加APP至LMK白名单
           * @param packageName 目标APP包名
           * @return 0-成功，非0-错误码
           */
      @Override public int setLMKPackage(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLMKPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setLMKPackage(packageName);
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
           * 将APP从LMK白名单移除
           * @param packageName 目标APP包名
           * @return 0-成功，非0-错误码
           */
      @Override public int removeLMKPackage(java.lang.String packageName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeLMKPackage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().removeLMKPackage(packageName);
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
           * 设置设备唤醒源
           * @param channel 唤醒源，1-IC卡唤醒，2-磁卡唤醒，3-按键唤醒
           * @param mode 模式，0-关，1-开
           * @param attr 其他属性，预留
           * @return 0-成功，非0-错误码
           */
      @Override public int sysSetWakeup(int channel, int mode, android.os.Bundle attr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(channel);
          _data.writeInt(mode);
          if ((attr!=null)) {
            _data.writeInt(1);
            attr.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysSetWakeup, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysSetWakeup(channel, mode, attr);
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
           * 设置首选的网络类型
           * @param mode 网络类型，包含以下值：
           * 0-GSM/WCDMA (WCDMA preferred)
           * 1-GSM only
           * 2-WCDMA only
           * 3-GSM/WCDMA (auto mode, according to PRL) AVAILABLE Application Settings menu
           * 4-CDMA and EvDo (auto mode, according to PRL) AVAILABLE Application Settings menu
           * 5-CDMA only
           * 6-EvDo only
           * 7-GSM/WCDMA, CDMA, and EvDo (auto mode, according to PRL) AVAILABLE Application Settings menu
           * 8-LTE, CDMA and EvDo
           * 9-LTE, GSM/WCDMA
           * 10-LTE, CDMA, EvDo, GSM/WCDMA
           * 11-LTE Only mode.
           * 12-LTE/WCDMA
           * 13-TD-SCDMA only
           * 14-TD-SCDMA and WCDMA
           * 15-TD-SCDMA and LTE
           * 16-TD-SCDMA and GSM
           * 17-TD-SCDMA,GSM and LTE
           * 18-TD-SCDMA, GSM/WCDMA
           * 19-TD-SCDMA, WCDMA and LTE
           * 20-TD-SCDMA, GSM/WCDMA and LTE
           * 21-TD-SCDMA,EvDo,CDMA,GSM/WCDMA
           * 22-TD-SCDMA/LTE/GSM/WCDMA, CDMA, and EvDo
           * 30-LTE/GSM
           * 31-LTE TDD Only mode.
           * 32-CDMA,GSM(2G Global)
           * 33-CDMA,EVDO,GSM
           * 34-LTE,CDMA,EVDO,GSM(4G Global, 4M)
           * @param slotIndex sim卡槽索引
           * @return 0-成功，非0-错误码
           */
      @Override public int setPreferredNetworkMode(int mode, int slotIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(slotIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPreferredNetworkMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setPreferredNetworkMode(mode, slotIndex);
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
           * 获取支持的网络类型
           * @param subId sim卡槽索引
           * @return 非空-网络类型，空-出错
           */
      @Override public java.lang.String getSupportedNetworkType(int slotIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(slotIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSupportedNetworkType, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSupportedNetworkType(slotIndex);
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
           * 打开或关闭飞行模式
           * @param enable 开关，true-打开飞行模式，false-关闭飞行模式
           * @return 0-成功，非0-错误码
           */
      @Override public int setAirplaneMode(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAirplaneMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setAirplaneMode(enable);
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
           * 打开或关闭数据漫游
           * @param subId sim卡槽索引
           * @param enable 开关，true-开启数据漫游，false-关闭数据漫游
           * @return 0-成功，非0-错误码
           */
      @Override public int setDataRoamingEnable(int slotIndex, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(slotIndex);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataRoamingEnable, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setDataRoamingEnable(slotIndex, enable);
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
           * 启用/禁用电话功能
           * @param enable 开关，true-启用电话功能，false-禁用电话功能
           * @return 0-成功，非0-错误码
           */
      @Override public int enablePhoneCall(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_enablePhoneCall, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().enablePhoneCall(enable);
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
           * 获取MAG刷卡、IC/NFC检卡成功/失败的的次数
           * @param cardType 卡类型，值为MAG/IC/NFC
           * @return >=0-成功/失败的次数，<0-错误码
           */
      @Override public int getCardUsageCount(int cardType, boolean isSuccess) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          _data.writeInt(((isSuccess)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCardUsageCount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCardUsageCount(cardType, isSuccess);
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
           * 获取模块的可访问性
           * @param module 模块，1-MAG，2-ICC，3-PICC，4-PinPad
           * @return 0-禁用，1-启用，<0-错误码
           */
      @Override public int getModuleAccessibility(int module) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(module);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getModuleAccessibility, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getModuleAccessibility(module);
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
           * 设置模块的可访问性
           * @param module 模块，1-MAG，2-ICC，3-PICC，4-PinPad
           * @param ability 可访问性，0-禁用，1-启用
           * @return 0-成功，非0-错误码
           */
      @Override public int setModuleAccessibility(int module, int ability) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(module);
          _data.writeInt(ability);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setModuleAccessibility, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setModuleAccessibility(module, ability);
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
           * 获取PED（PIN Entry Device）模式
           * @return >=PED模式，1-共享模式，2-隔离模式，3-混合模式，<0-错误码
           */
      @Override public int getPedMode() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPedMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPedMode();
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
           * 设置PED（PIN Entry Device）模式
           * @param mode PED模式，1-共享模式，2-隔离模式，3-混合模式
           * @return 0-成功，<0-错误码
           */
      @Override public int setPedMode(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPedMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setPedMode(mode);
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
           * 获取所有PED（PIN Entry Device）密钥信息
           * @param info 返回数据
           * @return 0-成功，<0-错误码
           */
      @Override public int getPedKeysInfo(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPedKeysInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPedKeysInfo(info);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            info.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 安装共享so库
           * @param path 共享so库的绝对路径
           * @return 0-成功，<0-错误码
           */
      @Override public int installSharedLib(java.lang.String path) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(path);
          boolean _status = mRemote.transact(Stub.TRANSACTION_installSharedLib, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().installSharedLib(path);
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
           * 删除共享so库
           * @param name 共享so库的名称
           * @return 0-成功，<0-错误码
           */
      @Override public int deleteSharedLib(java.lang.String name) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(name);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteSharedLib, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteSharedLib(name);
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
           * 安装Liteso文件
           * @param index Liteso安装的位置，根据芯片配置而定，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
           * @param filePath Liteso的完整文件路径（路径名最大长度不超过128字节）
           * @return 0-成功，<0-错误码
           */
      @Override public int litesoInstaller(int index, java.lang.String filePath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          _data.writeString(filePath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_litesoInstaller, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().litesoInstaller(index, filePath);
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
           * 运行指定idx对应的Liteso.运行前会清除上次运行的Liteso及其存储空间所有数据,并重启SE芯片. 运行成功后, SE芯片会保存当前索引,直到下一次执行LitesoRun接口.
           * @param index 需要切换的Liteso的索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
           * @return 0-成功，<0-错误码
           */
      @Override public int litesoRun(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_litesoRun, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().litesoRun(index);
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
           * 获取Liteso信息
           * @param index Liteso索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
           * @param info Liteso信息，包含如下key：
           * name: Liteso名称(String)
           * desc: Liteso应用描述(String)
           * vender: Liteso厂商描述(String)
           * version: Liteso版本信息(String)
           * @return 0-成功，<0-错误码
           */
      @Override public int litesoInfo(int index, android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_litesoInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().litesoInfo(index, info);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            info.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 获取当前运行的Liteso信息
           * @param info Liteso信息，包含如下key：
           * name: Liteso名称(String)
           * desc: Liteso应用描述(String)
           * vender: Liteso厂商描述(String)
           * version: Liteso版本信息(String)
           * @return 0-成功，<0-错误码
           */
      @Override public int litesoRunInfo(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_litesoRunInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().litesoRunInfo(info);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            info.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 与当前选择的Liteso进行数据交互
           * @param cmd 指令码
           * @param dataIn 传给Liteso的数据区，长度：0~1500
           * @param dataOut 指令的结果数据
           * @return >=0-dataOut中有效数据的长度，<0-错误码
           */
      @Override public int litesoCustomCmd(int cmd, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cmd);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_litesoCustomCmd, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().litesoCustomCmd(cmd, dataIn, dataOut);
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
           * 删除Liteso
           * @param index 需要删除的Liteso索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
           * @return 0-成功，<0-错误码
           */
      @Override public int litesoRemove(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_litesoRemove, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().litesoRemove(index);
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
      /**
           * 获取RTC电池电压
           * @return bundle 包含如下key：
           * vol: 电压值，单位:mv(int)
           * fromAdc: 电压值来源(int)，0-缓存值，1-从ADC中直接读取的值，非缓存值
           * （1）若累计时间已超时,将使能检测电路读取纽扣电池的电压,更新缓存值并在上报的数据包中将ReadFromAdc标志置为1;
           * （2）若累计时间未超时,返回给上层的数据包中使用纽扣电池电压的缓存值,并将readFromAdc标志置为0
           * @return 0-成功，<0-错误码
           */
      @Override public int getRtcBatVol(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRtcBatVol, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRtcBatVol(info);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            info.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 读取验签Puk
           * @param pukType 1-manufacturer，2-resaller (不支持)
           * @return bundle 包含如下key：
           * pubKey：公钥数据(byte[])，长度264B，格式为：模长(4B，MSB，值为LEN)+模(LEN B)+指数(4B, MSB)
           * digestTime: 生效时间(long)，单位:ms
           * validDate: 失效时间(long)，单位：ms
           * owner：拥有者名称(String)
           * @return 0-成功，<0-错误码
           */
      @Override public int readPuk(int pukType, android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pukType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readPuk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readPuk(pukType, info);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            info.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_getSysParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setSysParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_buzzerOnDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_ledStatusOnDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setScreenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_sysGetRandom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_ledStatusOnDeviceEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setStatusBarDropDownMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setNavigationBarVisibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setHideNavigationBarItems = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_sysPowerManage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_allowDynamicPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setGlobalProxy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_installApplicationCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_uninstallApplicationCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getCpuUsage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getCpuTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setScheduleReboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_clearScheduleReboot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_customizeFunctionKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_setLMKPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_removeLMKPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_sysSetWakeup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_setPreferredNetworkMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getSupportedNetworkType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_setAirplaneMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setDataRoamingEnable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_enablePhoneCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_getCardUsageCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_getModuleAccessibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_setModuleAccessibility = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_getPedMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_setPedMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getPedKeysInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_installSharedLib = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_deleteSharedLib = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_litesoInstaller = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_litesoRun = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_litesoInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_litesoRunInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_litesoCustomCmd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_litesoRemove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_sysGetDebugData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_sysPutDebugData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_getRtcBatVol = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_readPuk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 impl) {
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
    public static com.sunmi.pay.hardware.aidlv2.system.BasicOptV2 getDefaultImpl() {
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
       */
  public java.lang.String getSysParam(java.lang.String key) throws android.os.RemoteException;
  /**
       * 设置系统参数
       * 功能>写入资源窗口关键字的属性
       * @param key：用户参数关键字
       * @param value：关键字属性值
       * @return 0-成功,非0-错误码
       */
  public int setSysParam(java.lang.String key, java.lang.String value) throws android.os.RemoteException;
  /**
       * 蜂鸣器
       * 功能>控制设备上的蜂鸣器响
       * @param count 连续鸣响的次数(0~100)
       * @param freq  鸣响频率（单位:HZ）
       * @param duration 鸣响的时长（单位：ms）
       * @param interval 两次鸣响的时间间隔（单位：ms,0~10000）
       * @return 0-成功，非0-错误码
       */
  public void buzzerOnDevice(int count, int freq, int duration, int interval) throws android.os.RemoteException;
  /**
       * LED灯控制
       * 功能>设备上的LED灯状态
       * @param ledIndex: 设备上的LED索引，1~4；1-红，2-绿，3-黄，4-蓝
       * @param ledStatus：LED状态，1表示LED灭，0表示LED亮
       * @return 0-成功，非0-错误码
       */
  public int ledStatusOnDevice(int ledIndex, int ledStatus) throws android.os.RemoteException;
  /**
       * 设置屏幕独占
       * 功能>设置屏幕独占 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键
       * @param mode：设置屏幕独占的模式，1：设置屏幕独占，-1设置取消屏幕独占
       * @return 0-成功，非0-错误码
       */
  public int setScreenMode(int mode) throws android.os.RemoteException;
  /**
       * 获取随机数
       * 功能>获取随机数
       * @param randData：随机数
       * @param len：要获取的随机数长度
       * @return 0-成功，非0-错误码
       */
  public int sysGetRandom(byte[] randData, int len) throws android.os.RemoteException;
  /**
       * 扩展版LED灯控制
       * @param redStatus 红灯状态,0-亮，1-灭
       * @param greenStatus 绿灯状态,0-亮，1-灭
       * @param yellowStatus 黄灯状态,0-亮，1-灭
       * @param blueStatus 蓝灯状态,0-亮，1-灭
       * @return 0-成功，非0-错误码
       */
  public int ledStatusOnDeviceEx(int redStatus, int greenStatus, int yellowStatus, int blueStatus) throws android.os.RemoteException;
  /**
       * 设置状态栏下拉模式
       * @param mode 状态栏下拉模式，0-启用下拉，1-禁用下拉
       * @return 0-成功，非0-错误码
       */
  public int setStatusBarDropDownMode(int mode) throws android.os.RemoteException;
  /**
       * 设置导航栏可见性
       * @param visibility 导航栏可见性，0-隐藏，1-显示
       * @return 0-成功，非0-错误码
       */
  public int setNavigationBarVisibility(int visibility) throws android.os.RemoteException;
  /**
       * 设置隐藏导航栏图标
       * STATUS_BAR_DISABLE_HOME = 0x00200000;//隐藏home键
       * STATUS_BAR_DISABLE_BACK = 0x00400000;//隐藏返回键
       * STATUS_BAR_DISABLE_RECENT = 0x01000000;//隐藏recent键
       * @param mode：隐藏标志，STATUS_BAR_DISABLE_HOME | STATUS_BAR_DISABLE_BACK 可同时隐藏home键和返回键
       * @return 0-成功，非0-错误码
       */
  public int setHideNavigationBarItems(int flag) throws android.os.RemoteException;
  /**
       * 电源管理
       * @param mode 模式，1-休眠(不支持)，2-关机，3-重启
       * @return 0-成功，非0-错误码
       */
  public int sysPowerManage(int mode) throws android.os.RemoteException;
  /**
       * APP动态权限配置
       * @param packageName 目标APP包名
       * @return 0-成功，非0-错误码
       */
  public int allowDynamicPermission(java.lang.String packageName) throws android.os.RemoteException;
  /*
       * 设置全局wifi代理
       * @param proxy ip:port 或 url:port
       * @return 0-成功，<0-错误码
       */
  public int setGlobalProxy(java.lang.String proxy) throws android.os.RemoteException;
  /*
       * 安装CA证书
       * @param name 证书名称
       * @parma contents 证书内容
       * @return 0-成功，非0-错误码
       */
  public int installApplicationCertificate(java.lang.String name, java.lang.String contents) throws android.os.RemoteException;
  /*
       * 卸载CA证书
       * @param name 证书名称
       * @return 0-成功，非0-错误码
       */
  public int uninstallApplicationCertificate(java.lang.String name) throws android.os.RemoteException;
  /*
       * 获取CPU使用率
       * @param name 证书名称
       * @return 非空-CPU使用率，空-出错
       */
  public java.lang.String getCpuUsage() throws android.os.RemoteException;
  /*
       * 获取CPU温度
       * @param name 证书名称
       * @return 非空-CPU温度，空-出错
       */
  public java.lang.String getCpuTemperature() throws android.os.RemoteException;
  /**
       * 设置定时重启
       * @param hour 时（0~23）
       * @param minute 分（0~59）
       * @param second 秒（0~59）
       * @param millisecond 毫秒（0~999）
       * @return 0-成功，非0-错误码
       */
  public int setScheduleReboot(int hour, int minute, int second, int millisecond) throws android.os.RemoteException;
  /**
       * 清除定时重启
       * @return 0-成功，非0-错误码
       */
  public int clearScheduleReboot() throws android.os.RemoteException;
  /**
       * 自定义功能键
       * @param 功能定义，包含如下key：
       * key：String，按键名称，如“volume_2”
       * type：String，功能类型，值可以为“function”、“native”
       * value：String，功能类型对应的值，type为“function”时，value为"volume_up"或"volume_down";
                        type为“native”时，value只能为“native”
       * @return 0-成功，非0-错误码
       */
  public int customizeFunctionKey(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 添加APP至LMK白名单
       * @param packageName 目标APP包名
       * @return 0-成功，非0-错误码
       */
  public int setLMKPackage(java.lang.String packageName) throws android.os.RemoteException;
  /**
       * 将APP从LMK白名单移除
       * @param packageName 目标APP包名
       * @return 0-成功，非0-错误码
       */
  public int removeLMKPackage(java.lang.String packageName) throws android.os.RemoteException;
  /**
       * 设置设备唤醒源
       * @param channel 唤醒源，1-IC卡唤醒，2-磁卡唤醒，3-按键唤醒
       * @param mode 模式，0-关，1-开
       * @param attr 其他属性，预留
       * @return 0-成功，非0-错误码
       */
  public int sysSetWakeup(int channel, int mode, android.os.Bundle attr) throws android.os.RemoteException;
  /**
       * 设置首选的网络类型
       * @param mode 网络类型，包含以下值：
       * 0-GSM/WCDMA (WCDMA preferred)
       * 1-GSM only
       * 2-WCDMA only
       * 3-GSM/WCDMA (auto mode, according to PRL) AVAILABLE Application Settings menu
       * 4-CDMA and EvDo (auto mode, according to PRL) AVAILABLE Application Settings menu
       * 5-CDMA only
       * 6-EvDo only
       * 7-GSM/WCDMA, CDMA, and EvDo (auto mode, according to PRL) AVAILABLE Application Settings menu
       * 8-LTE, CDMA and EvDo
       * 9-LTE, GSM/WCDMA
       * 10-LTE, CDMA, EvDo, GSM/WCDMA
       * 11-LTE Only mode.
       * 12-LTE/WCDMA
       * 13-TD-SCDMA only
       * 14-TD-SCDMA and WCDMA
       * 15-TD-SCDMA and LTE
       * 16-TD-SCDMA and GSM
       * 17-TD-SCDMA,GSM and LTE
       * 18-TD-SCDMA, GSM/WCDMA
       * 19-TD-SCDMA, WCDMA and LTE
       * 20-TD-SCDMA, GSM/WCDMA and LTE
       * 21-TD-SCDMA,EvDo,CDMA,GSM/WCDMA
       * 22-TD-SCDMA/LTE/GSM/WCDMA, CDMA, and EvDo
       * 30-LTE/GSM
       * 31-LTE TDD Only mode.
       * 32-CDMA,GSM(2G Global)
       * 33-CDMA,EVDO,GSM
       * 34-LTE,CDMA,EVDO,GSM(4G Global, 4M)
       * @param slotIndex sim卡槽索引
       * @return 0-成功，非0-错误码
       */
  public int setPreferredNetworkMode(int mode, int slotIndex) throws android.os.RemoteException;
  /**
       * 获取支持的网络类型
       * @param subId sim卡槽索引
       * @return 非空-网络类型，空-出错
       */
  public java.lang.String getSupportedNetworkType(int slotIndex) throws android.os.RemoteException;
  /**
       * 打开或关闭飞行模式
       * @param enable 开关，true-打开飞行模式，false-关闭飞行模式
       * @return 0-成功，非0-错误码
       */
  public int setAirplaneMode(boolean enable) throws android.os.RemoteException;
  /**
       * 打开或关闭数据漫游
       * @param subId sim卡槽索引
       * @param enable 开关，true-开启数据漫游，false-关闭数据漫游
       * @return 0-成功，非0-错误码
       */
  public int setDataRoamingEnable(int slotIndex, boolean enable) throws android.os.RemoteException;
  /**
       * 启用/禁用电话功能
       * @param enable 开关，true-启用电话功能，false-禁用电话功能
       * @return 0-成功，非0-错误码
       */
  public int enablePhoneCall(boolean enable) throws android.os.RemoteException;
  /**
       * 获取MAG刷卡、IC/NFC检卡成功/失败的的次数
       * @param cardType 卡类型，值为MAG/IC/NFC
       * @return >=0-成功/失败的次数，<0-错误码
       */
  public int getCardUsageCount(int cardType, boolean isSuccess) throws android.os.RemoteException;
  /**
       * 获取模块的可访问性
       * @param module 模块，1-MAG，2-ICC，3-PICC，4-PinPad
       * @return 0-禁用，1-启用，<0-错误码
       */
  public int getModuleAccessibility(int module) throws android.os.RemoteException;
  /**
       * 设置模块的可访问性
       * @param module 模块，1-MAG，2-ICC，3-PICC，4-PinPad
       * @param ability 可访问性，0-禁用，1-启用
       * @return 0-成功，非0-错误码
       */
  public int setModuleAccessibility(int module, int ability) throws android.os.RemoteException;
  /**
       * 获取PED（PIN Entry Device）模式
       * @return >=PED模式，1-共享模式，2-隔离模式，3-混合模式，<0-错误码
       */
  public int getPedMode() throws android.os.RemoteException;
  /**
       * 设置PED（PIN Entry Device）模式
       * @param mode PED模式，1-共享模式，2-隔离模式，3-混合模式
       * @return 0-成功，<0-错误码
       */
  public int setPedMode(int mode) throws android.os.RemoteException;
  /**
       * 获取所有PED（PIN Entry Device）密钥信息
       * @param info 返回数据
       * @return 0-成功，<0-错误码
       */
  public int getPedKeysInfo(android.os.Bundle info) throws android.os.RemoteException;
  /**
       * 安装共享so库
       * @param path 共享so库的绝对路径
       * @return 0-成功，<0-错误码
       */
  public int installSharedLib(java.lang.String path) throws android.os.RemoteException;
  /**
       * 删除共享so库
       * @param name 共享so库的名称
       * @return 0-成功，<0-错误码
       */
  public int deleteSharedLib(java.lang.String name) throws android.os.RemoteException;
  /**
       * 安装Liteso文件
       * @param index Liteso安装的位置，根据芯片配置而定，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
       * @param filePath Liteso的完整文件路径（路径名最大长度不超过128字节）
       * @return 0-成功，<0-错误码
       */
  public int litesoInstaller(int index, java.lang.String filePath) throws android.os.RemoteException;
  /**
       * 运行指定idx对应的Liteso.运行前会清除上次运行的Liteso及其存储空间所有数据,并重启SE芯片. 运行成功后, SE芯片会保存当前索引,直到下一次执行LitesoRun接口.
       * @param index 需要切换的Liteso的索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
       * @return 0-成功，<0-错误码
       */
  public int litesoRun(int index) throws android.os.RemoteException;
  /**
       * 获取Liteso信息
       * @param index Liteso索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
       * @param info Liteso信息，包含如下key：
       * name: Liteso名称(String)
       * desc: Liteso应用描述(String)
       * vender: Liteso厂商描述(String)
       * version: Liteso版本信息(String)
       * @return 0-成功，<0-错误码
       */
  public int litesoInfo(int index, android.os.Bundle info) throws android.os.RemoteException;
  /**
       * 获取当前运行的Liteso信息
       * @param info Liteso信息，包含如下key：
       * name: Liteso名称(String)
       * desc: Liteso应用描述(String)
       * vender: Liteso厂商描述(String)
       * version: Liteso版本信息(String)
       * @return 0-成功，<0-错误码
       */
  public int litesoRunInfo(android.os.Bundle info) throws android.os.RemoteException;
  /**
       * 与当前选择的Liteso进行数据交互
       * @param cmd 指令码
       * @param dataIn 传给Liteso的数据区，长度：0~1500
       * @param dataOut 指令的结果数据
       * @return >=0-dataOut中有效数据的长度，<0-错误码
       */
  public int litesoCustomCmd(int cmd, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 删除Liteso
       * @param index 需要删除的Liteso索引，MH1902T(1MB)取值:0，MH1902T(4MB)范围:0~11
       * @return 0-成功，<0-错误码
       */
  public int litesoRemove(int index) throws android.os.RemoteException;
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
  /**
       * 获取RTC电池电压
       * @return bundle 包含如下key：
       * vol: 电压值，单位:mv(int)
       * fromAdc: 电压值来源(int)，0-缓存值，1-从ADC中直接读取的值，非缓存值
       * （1）若累计时间已超时,将使能检测电路读取纽扣电池的电压,更新缓存值并在上报的数据包中将ReadFromAdc标志置为1;
       * （2）若累计时间未超时,返回给上层的数据包中使用纽扣电池电压的缓存值,并将readFromAdc标志置为0
       * @return 0-成功，<0-错误码
       */
  public int getRtcBatVol(android.os.Bundle info) throws android.os.RemoteException;
  /**
       * 读取验签Puk
       * @param pukType 1-manufacturer，2-resaller (不支持)
       * @return bundle 包含如下key：
       * pubKey：公钥数据(byte[])，长度264B，格式为：模长(4B，MSB，值为LEN)+模(LEN B)+指数(4B, MSB)
       * digestTime: 生效时间(long)，单位:ms
       * validDate: 失效时间(long)，单位：ms
       * owner：拥有者名称(String)
       * @return 0-成功，<0-错误码
       */
  public int readPuk(int pukType, android.os.Bundle info) throws android.os.RemoteException;
}
