package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class PinPadTextConfigV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;
    public String confirm;                    //键盘上的confirm键
    public String inputPin;                   //输入联机PIN
    public String inputOfflinePin;            //输入脱机PIN
    public String reinputOfflinePinFormat;    //重新输入脱机PIN（显示剩余次数）

    public PinPadTextConfigV2() {

    }

    protected PinPadTextConfigV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.confirm = in.readString();
        this.inputPin = in.readString();
        this.inputOfflinePin = in.readString();
        this.reinputOfflinePinFormat = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.confirm);
        dest.writeString(this.inputPin);
        dest.writeString(this.inputOfflinePin);
        dest.writeString(this.reinputOfflinePinFormat);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PinPadTextConfigV2> CREATOR = new Creator<PinPadTextConfigV2>() {
        @Override
        public PinPadTextConfigV2 createFromParcel(Parcel source) {
            return new PinPadTextConfigV2(source);
        }

        @Override
        public PinPadTextConfigV2[] newArray(int size) {
            return new PinPadTextConfigV2[size];
        }
    };
}
