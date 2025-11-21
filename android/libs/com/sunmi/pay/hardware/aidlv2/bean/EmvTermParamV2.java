package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/** EMV终端参数 */
public class EmvTermParamV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public String ifDsn = "3030303030393035";          // IFD序列号 9F1E（hex格式,定长8字节）
    public String terminalType = "22";                 // 终端类型 9F35（hex格式,定长1字节）
    public String countryCode = "0156";                // 终端国家代码 9F1A（hex格式,定长2字节）
    public boolean forceOnline = false;                // 商户强制联机(1 表示总是联机交易)
    public boolean getDataPIN = true;                  // 密码检测前是否读重试次数
    public boolean surportPSESel = true;               // 是否支持PSE选择方式
    public boolean useTermAIPFlg = true;               // 是否基于卡片AIP进行风险管理
    public boolean termAIP = true;                     // 终端是否强制进行风险管理
    public boolean bypassAllFlg;                       // 当以byPass模式处理某个PIN后，对其他PIN是否也以bypass模式处理
    public boolean bypassPin = true;                   // 是否支持bypass PIN
    public boolean batchCapture;                       // 是否批抓取数据
    public boolean ectSiFlg = true;                    // 电子现金终端支持指示器(EC Terminal Support Indicator)是否存在
    public boolean ectSiVal = true;                    // 是否支持电子现金终端支持指示器
    public boolean ectTlFlg = true;                    // 电子现金终端交易限额(EC Terminal Transaction Limit)是否存在
    public String ectTlVal = "100000";                 // 电子现金终端交易限额，单位分（变长，最多6字节）
    public String capability = "E0F8C8";               // 终端性能 9F33（定长3字节）
    public String addCapability = "0300C00000";        // 终端扩展性能 9F40（定长5字节）
    public boolean scriptMode;                         // scriptMode
    public boolean adviceFlag = true;                  // adviceFlag
    public boolean isSupportSM = true;                 // 是否支持SM算法
    public boolean isSupportTransLog = true;           // 是否支持交易LOG
    public boolean isSupportMultiLang = true;          // 是否支持多语言
    public boolean isSupportExceptFile = true;         // 是否支持异常文件
    public boolean isSupportAccountSelect = true;      // 是否支持账号选择
    public String TTQ = "26000080";                    // 终端交易属性(非接使用)（定长4字节）
    public boolean IsReadLogInCard;                    // 是否是读卡内交易记录的应用选择过程
    private byte[] reserved = new byte[3];             // 保留字节值必须为0
    public String currencyCode = "0156";               // 5F2A
    public String currencyExp = "02";                  // 5F36
    public String accountType = "00";                  // 账户类型

    public EmvTermParamV2() {
    }

    protected EmvTermParamV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        ifDsn = in.readString();
        terminalType = in.readString();
        countryCode = in.readString();
        forceOnline = in.readByte() != 0;
        getDataPIN = in.readByte() != 0;
        surportPSESel = in.readByte() != 0;
        useTermAIPFlg = in.readByte() != 0;
        termAIP = in.readByte() != 0;
        bypassAllFlg = in.readByte() != 0;
        bypassPin = in.readByte() != 0;
        batchCapture = in.readByte() != 0;
        ectSiFlg = in.readByte() != 0;
        ectSiVal = in.readByte() != 0;
        ectTlFlg = in.readByte() != 0;
        ectTlVal = in.readString();
        capability = in.readString();
        addCapability = in.readString();
        scriptMode = in.readByte() != 0;
        adviceFlag = in.readByte() != 0;
        isSupportSM = in.readByte() != 0;
        isSupportTransLog = in.readByte() != 0;
        isSupportMultiLang = in.readByte() != 0;
        isSupportExceptFile = in.readByte() != 0;
        isSupportAccountSelect = in.readByte() != 0;
        TTQ = in.readString();
        IsReadLogInCard = in.readByte() != 0;
        reserved = in.createByteArray();
        currencyCode = in.readString();
        currencyExp = in.readString();
        accountType = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ifDsn);
        dest.writeString(terminalType);
        dest.writeString(countryCode);
        dest.writeByte((byte) (forceOnline ? 1 : 0));
        dest.writeByte((byte) (getDataPIN ? 1 : 0));
        dest.writeByte((byte) (surportPSESel ? 1 : 0));
        dest.writeByte((byte) (useTermAIPFlg ? 1 : 0));
        dest.writeByte((byte) (termAIP ? 1 : 0));
        dest.writeByte((byte) (bypassAllFlg ? 1 : 0));
        dest.writeByte((byte) (bypassPin ? 1 : 0));
        dest.writeByte((byte) (batchCapture ? 1 : 0));
        dest.writeByte((byte) (ectSiFlg ? 1 : 0));
        dest.writeByte((byte) (ectSiVal ? 1 : 0));
        dest.writeByte((byte) (ectTlFlg ? 1 : 0));
        dest.writeString(ectTlVal);
        dest.writeString(capability);
        dest.writeString(addCapability);
        dest.writeByte((byte) (scriptMode ? 1 : 0));
        dest.writeByte((byte) (adviceFlag ? 1 : 0));
        dest.writeByte((byte) (isSupportSM ? 1 : 0));
        dest.writeByte((byte) (isSupportTransLog ? 1 : 0));
        dest.writeByte((byte) (isSupportMultiLang ? 1 : 0));
        dest.writeByte((byte) (isSupportExceptFile ? 1 : 0));
        dest.writeByte((byte) (isSupportAccountSelect ? 1 : 0));
        dest.writeString(TTQ);
        dest.writeByte((byte) (IsReadLogInCard ? 1 : 0));
        dest.writeByteArray(reserved);
        dest.writeString(currencyCode);
        dest.writeString(currencyExp);
        dest.writeString(accountType);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<EmvTermParamV2> CREATOR = new Creator<EmvTermParamV2>() {
        @Override
        public EmvTermParamV2 createFromParcel(Parcel in) {
            return new EmvTermParamV2(in);
        }

        @Override
        public EmvTermParamV2[] newArray(int size) {
            return new EmvTermParamV2[size];
        }
    };

    @Override
    public String toString() {
        return "EmvTermParamV2{" +
                "ifDsn='" + ifDsn + '\'' +
                ", terminalType='" + terminalType + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", forceOnline=" + forceOnline +
                ", getDataPIN=" + getDataPIN +
                ", surportPSESel=" + surportPSESel +
                ", useTermAIPFlg=" + useTermAIPFlg +
                ", termAIP=" + termAIP +
                ", bypassAllFlg=" + bypassAllFlg +
                ", bypassPin=" + bypassPin +
                ", batchCapture=" + batchCapture +
                ", ectSiFlg=" + ectSiFlg +
                ", ectSiVal=" + ectSiVal +
                ", ectTlFlg=" + ectTlFlg +
                ", ectTlVal='" + ectTlVal + '\'' +
                ", capability='" + capability + '\'' +
                ", addCapability='" + addCapability + '\'' +
                ", scriptMode=" + scriptMode +
                ", adviceFlag=" + adviceFlag +
                ", isSupportSM=" + isSupportSM +
                ", isSupportTransLog=" + isSupportTransLog +
                ", isSupportMultiLang=" + isSupportMultiLang +
                ", isSupportExceptFile=" + isSupportExceptFile +
                ", isSupportAccountSelect=" + isSupportAccountSelect +
                ", TTQ='" + TTQ + '\'' +
                ", IsReadLogInCard=" + IsReadLogInCard +
                ", reserved=" + bytes2HexString(reserved) +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencyExp='" + currencyExp + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    private String bytes2HexString(byte... src) {
        if (src == null || src.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : src) {
            String hex = Integer.toHexString(b & 0xFF);
            if (hex.length() < 2) {
                sb.append(0);
            }
            sb.append(hex);
        }
        return sb.toString().toUpperCase();
    }
}
