package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by WL on 2017/3/30.
 * 键盘初始化实体类
 */

public class PinPadConfig implements Parcelable {

    /**
     * 密码键盘类型。 0：预置密码键盘(由服务实现样式统一的键盘)  1:调用方自己实现的密码键盘
     */
    private int PinPadType;

    /**
     * PIN类型标识(0是联机PIN，1是脱机PIN)
     */
    private int PinType = 0;

    /**
     * 顺序键盘还是乱序键盘
     */
    private boolean isOrderNumKey = false;

    /**
     * ascii格式转换成的byte 例如 “123456”.getBytes("US-ASCII")
     */
    private byte[] Pan;

    /**
     * PIK索引(PIN密钥索引)
     */
    private int PinKeyIndex;

    /**
     * 最大输入位数
     */
    private int MaxInput = 6;
    /**
     * 最小输入位数
     */
    private int MinInput = 0;

    /**
     * 超时时间/毫秒
     */
    private int Timeout = 60000;


    public PinPadConfig() {
    }

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

    protected PinPadConfig(Parcel in) {
        PinPadType = in.readInt();
        PinType = in.readInt();
        isOrderNumKey = in.readByte() != 0;
        Pan = in.createByteArray();
        PinKeyIndex = in.readInt();
        MaxInput = in.readInt();
        MinInput = in.readInt();
        Timeout = in.readInt();
    }

    public static final Creator<PinPadConfig> CREATOR = new Creator<PinPadConfig>() {
        @Override
        public PinPadConfig createFromParcel(Parcel in) {
            return new PinPadConfig(in);
        }

        @Override
        public PinPadConfig[] newArray(int size) {
            return new PinPadConfig[size];
        }
    };

    public void readFromParcel(Parcel in) {
        PinPadType = in.readInt();
        PinType = in.readInt();
        isOrderNumKey = in.readByte() != 0;
        Pan = in.createByteArray();
        PinKeyIndex = in.readInt();
        MaxInput = in.readInt();
        MinInput = in.readInt();
        Timeout = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
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
    }
}
