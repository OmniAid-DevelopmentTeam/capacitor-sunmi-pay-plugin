package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import java.io.Serializable;

/** ETCInfoV2 */
public class ETCInfoV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;
    /** 设备编号 */
    public String deviceNo;
    /** 设备状态（多个设备状态用“|”分割） */
    public String deviceStatus;
    /** 卡类型，00-储值卡，01-记账卡，02-非法卡片 */
    public String cardType;
    /** 卡金额，单位：分 */
    public int amount;
    /** 车牌颜色 */
    public String licensePlateColor;
    /** 车牌号 */
    public String licensePlateNo;
    /** 信号强度 */
    public int signal;

    public ETCInfoV2() {
    }

    protected ETCInfoV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.deviceNo = in.readString();
        this.deviceStatus = in.readString();
        this.cardType = in.readString();
        this.amount = in.readInt();
        this.licensePlateColor = in.readString();
        this.licensePlateNo = in.readString();
        this.signal = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.deviceNo);
        dest.writeString(this.deviceStatus);
        dest.writeString(this.cardType);
        dest.writeInt(this.amount);
        dest.writeString(this.licensePlateColor);
        dest.writeString(this.licensePlateNo);
        dest.writeInt(this.signal);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ETCInfoV2> CREATOR = new Creator<ETCInfoV2>() {
        @Override
        public ETCInfoV2 createFromParcel(Parcel source) {
            return new ETCInfoV2(source);
        }

        @Override
        public ETCInfoV2[] newArray(int size) {
            return new ETCInfoV2[size];
        }
    };

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ETCInfoV2)) {
            return false;
        }
        ETCInfoV2 t = (ETCInfoV2) o;
        return TextUtils.equals(deviceNo, t.deviceNo);
    }

    @Override
    public int hashCode() {
        if (TextUtils.isEmpty(deviceNo)) {
            return 0;
        }
        return deviceNo.hashCode();
    }

    @Override
    public String toString() {
        return "ETCInfoV2{" +
                "deviceNo='" + deviceNo + '\'' +
                ", deviceStatus='" + deviceStatus + '\'' +
                ", cardType='" + cardType + '\'' +
                ", amount=" + amount +
                ", licensePlateColor='" + licensePlateColor + '\'' +
                ", licensePlateNo='" + licensePlateNo + '\'' +
                ", signal=" + signal +
                '}';
    }

}
