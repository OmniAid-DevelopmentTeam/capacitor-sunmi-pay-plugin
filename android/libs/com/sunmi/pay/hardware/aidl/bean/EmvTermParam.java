package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;

/**
 * Created by zdy on 2017/10/16.
 */

public class EmvTermParam implements Parcelable {
    //"9F1E", "3030303030393035" //默认值
    public String tag9F1E = "3030303030393035";        //  ifDsn IFD序列号 9F1E
    //"9F35", "22"  //默认值
    public String tag9F35 = "22";                      // terminalType 终端类型 9F35
    //"9F1A", "0156" //默认值
    public String tag9F1A = "0156";                    // countryCode 终端国家代码 9F1A
    public boolean forceOnline = false;                // 商户强制联机(1 表示总是联机交易)
    public boolean getDataPIN = true;                  // 密码检测前是否读重试次数
    public boolean surportPSESel = true;               // 是否支持PSE选择方式
    //"9F4E"
    public boolean useTermAIPFlg = true;               // 是否基于卡片AIP进行风险管理,0-用卡片AIP,1-用终端AIP,默认为0
    public boolean termAIP = true;                     // 终端是否强制进行风险管理，byte1-bit4为1：强制进行风险管理；byte1-bit4为0：不进行风险管理。默认两个字节全为0。
    public boolean bypassAllFlg;                       // whether bypass all other pin when one pin has been bypassed 1-Yes, 0-No
    public boolean bypassPin = true;                   // 0-不支持，1－支持，默认支持
    public boolean batchCapture;                       // 0-online data capture, 1-batch capture
    public boolean ectSiFlg = true;                    // TSI存在? 1-存在 电子现金终端支持指示器 （EC Terminal Support Indicator）
    public boolean ectSiVal = true;                    // 电子现金终端支持指示器 = 1,支持
    public boolean ectTlFlg = true;                    // TTL存在? 1-存在 电子现金终端交易限额（EC Terminal Transaction Limit）
    public String ectTlVal = "100000";                 // 电子现金终端交易限额，单位分
    //"9F33", "E068C8"  //默认值,暂时不支持脱机PIN,第二字节第8位为0
    public String tag9F33 = "E0F8C8";                  // capability  终端性能9F33
    //"9F40", "0300C00000"  //默认值
    public String tag9F40 = "0300C00000";              // addCapability  终端扩展性能9F40
    public boolean scriptMode;
    public boolean adviceFlag = true;
    public boolean isSupportSM = true;                 // 是否支持SM算法
    public boolean isSupportTransLog = true;           // 是否支持交易LOG
    public boolean isSupportMultiLang = true;          // 是否支持多语言
    public boolean isSupportExceptFile = true;         // 是否支持异常文件
    public boolean isSupportAccountSelect = true;      // 是否支持账号选择
    public String TTQ = "26000080";                    // 终端交易属性(非接使用),16进制，length为8
    public boolean IsReadLogInCard;                    // 是否是读卡内交易记录的应用选择过程
    private byte[] reserved = new byte[3];             // 保留字节值必须为0
    public String currencyCode = "0156";               // 5F2A
    public String currencyExp = "02";                  // 5F36
    public String accountType = "00";                  // 账户类型

    public EmvTermParam() {
    }

    protected EmvTermParam(Parcel in) {
        tag9F1E = in.readString();
        tag9F35 = in.readString();
        tag9F1A = in.readString();
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
        tag9F33 = in.readString();
        tag9F40 = in.readString();
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

    public static final Creator<EmvTermParam> CREATOR = new Creator<EmvTermParam>() {
        @Override
        public EmvTermParam createFromParcel(Parcel in) {
            return new EmvTermParam(in);
        }

        @Override
        public EmvTermParam[] newArray(int size) {
            return new EmvTermParam[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tag9F1E);
        dest.writeString(tag9F35);
        dest.writeString(tag9F1A);
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
        dest.writeString(tag9F33);
        dest.writeString(tag9F40);
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
    public String toString() {
        return "EmvTermParam{" +
                "tag9F1E='" + tag9F1E + '\'' +
                ", tag9F35='" + tag9F35 + '\'' +
                ", tag9F1A='" + tag9F1A + '\'' +
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
                ", tag9F33='" + tag9F33 + '\'' +
                ", tag9F40='" + tag9F40 + '\'' +
                ", scriptMode=" + scriptMode +
                ", adviceFlag=" + adviceFlag +
                ", isSupportSM=" + isSupportSM +
                ", isSupportTransLog=" + isSupportTransLog +
                ", isSupportMultiLang=" + isSupportMultiLang +
                ", isSupportExceptFile=" + isSupportExceptFile +
                ", isSupportAccountSelect=" + isSupportAccountSelect +
                ", TTQ='" + TTQ + '\'' +
                ", IsReadLogInCard=" + IsReadLogInCard +
                ", reserved=" + Arrays.toString(reserved) +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencyExp='" + currencyExp + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
