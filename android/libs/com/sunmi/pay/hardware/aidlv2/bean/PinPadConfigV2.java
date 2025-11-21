package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by WL on 2017/3/30.
 * 键盘初始化实体类
 */

public class PinPadConfigV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    private int PinPadType; //密码键盘类型。 0：预置密码键盘(由服务实现样式统一的键盘)  1:调用方自己实现的密码键盘

    private int PinType = 0; //PIN类型标识(0是联机PIN，1是脱机PIN)

    private boolean isOrderNumKey = false; //顺序键盘还是乱序键盘

    private byte[] Pan; //ascii格式转换成的byte 例如 “123456”.getBytes("US-ASCII")

    private int PinKeyIndex; //PIK索引(PIN密钥索引)

    private int MaxInput = 6; //最大输入位数

    private int MinInput = 0;//最小输入位数

    private int Timeout = 60000; //超时时间/毫秒

    private boolean isSupportbypass = true;//是否支持bypasspin

    private int PinblockFormat = 0;  //pinblock format格式

    private int AlgorithmType = 0; //加密Pin的算法类型 0-3DES(返回8字节),1-SM4（返回16字节）,2-AES（返回16字节）

    private int KeySystem = 0; // 0-SEC_MKSK,1-SEC_DUKPT


    public int getPinPadType() {
        return PinPadType;
    }

    public void setPinPadType(int pinPadType) {
        PinPadType = pinPadType;
    }

    public int getPinType() {
        return PinType;
    }

    public void setPinType(int pinType) {
        PinType = pinType;
    }

    public boolean isOrderNumKey() {
        return isOrderNumKey;
    }

    public void setOrderNumKey(boolean orderNumKey) {
        isOrderNumKey = orderNumKey;
    }

    public byte[] getPan() {
        return Pan;
    }

    public void setPan(byte[] pan) {
        Pan = pan;
    }

    public int getPinKeyIndex() {
        return PinKeyIndex;
    }

    public void setPinKeyIndex(int pinKeyIndex) {
        PinKeyIndex = pinKeyIndex;
    }

    public int getMaxInput() {
        return MaxInput;
    }

    public void setMaxInput(int maxInput) {
        MaxInput = maxInput;
    }

    public int getMinInput() {
        return MinInput;
    }

    public void setMinInput(int minInput) {
        MinInput = minInput;
    }

    public int getTimeout() {
        return Timeout;
    }

    public void setTimeout(int timeout) {
        Timeout = timeout;
    }

    public boolean isSupportbypass() {
        return isSupportbypass;
    }

    public void setSupportbypass(boolean supportbypass) {
        isSupportbypass = supportbypass;
    }

    public int getPinblockFormat() {
        return PinblockFormat;
    }

    public void setPinblockFormat(int pinblockFormat) {
        this.PinblockFormat = pinblockFormat;
    }

    public int getAlgorithmType() {
        return AlgorithmType;
    }

    public void setAlgorithmType(int algorithmType) {
        AlgorithmType = algorithmType;
    }

    public int getKeySystem() {
        return KeySystem;
    }

    public void setKeySystem(int keySystem) {
        KeySystem = keySystem;
    }

    public PinPadConfigV2() {
    }

    protected PinPadConfigV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        PinPadType = in.readInt();
        PinType = in.readInt();
        isOrderNumKey = in.readByte() != 0;
        Pan = in.createByteArray();
        PinKeyIndex = in.readInt();
        MaxInput = in.readInt();
        MinInput = in.readInt();
        Timeout = in.readInt();
        isSupportbypass = in.readByte() != 0;
        PinblockFormat = in.readInt();
        AlgorithmType = in.readInt();
        KeySystem = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(PinPadType);
        dest.writeInt(PinType);
        dest.writeByte((byte) (isOrderNumKey ? 1 : 0));
        dest.writeByteArray(Pan);
        dest.writeInt(PinKeyIndex);
        dest.writeInt(MaxInput);
        dest.writeInt(MinInput);
        dest.writeInt(Timeout);
        dest.writeByte((byte) (isSupportbypass ? 1 : 0));
        dest.writeInt(PinblockFormat);
        dest.writeInt(AlgorithmType);
        dest.writeInt(KeySystem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PinPadConfigV2> CREATOR = new Creator<PinPadConfigV2>() {
        @Override
        public PinPadConfigV2 createFromParcel(Parcel in) {
            return new PinPadConfigV2(in);
        }

        @Override
        public PinPadConfigV2[] newArray(int size) {
            return new PinPadConfigV2[size];
        }
    };

    @Override
    public String toString() {
        return "PinPadConfigV2{" +
                "PinPadType=" + PinPadType +
                ", PinType=" + PinType +
                ", isOrderNumKey=" + isOrderNumKey +
                ", Pan=" + bytes2HexString(Pan) +
                ", PinKeyIndex=" + PinKeyIndex +
                ", MaxInput=" + MaxInput +
                ", MinInput=" + MinInput +
                ", Timeout=" + Timeout +
                ", isSupportbypass=" + isSupportbypass +
                ", PinblockFormat=" + PinblockFormat +
                ", AlgorithmType=" + AlgorithmType +
                ", KeySystem=" + KeySystem +
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
