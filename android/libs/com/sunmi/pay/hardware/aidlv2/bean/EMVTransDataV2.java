package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/** EMV交易处理实体类 */
public class EMVTransDataV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    /** 交易金额(单位分)，必须参数，不能为空 ,当amount="0"时表示查询余额 */
    public String amount;
    /** 交易类型 */
    public String transType = "00";
    /** 流程类型，0x01：标准的授权过程，0x02：简易流程，0x03：qPass */
    public int flowType = 0x01;
    /** 卡类型 2:IC 4:NFC */
    public int cardType = 2;

    public EMVTransDataV2() {
    }

    protected EMVTransDataV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.amount = in.readString();
        this.transType = in.readString();
        this.flowType = in.readInt();
        this.cardType = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.amount);
        dest.writeString(this.transType);
        dest.writeInt(this.flowType);
        dest.writeInt(this.cardType);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<EMVTransDataV2> CREATOR = new Creator<EMVTransDataV2>() {
        @Override
        public EMVTransDataV2 createFromParcel(Parcel source) {
            return new EMVTransDataV2(source);
        }

        @Override
        public EMVTransDataV2[] newArray(int size) {
            return new EMVTransDataV2[size];
        }
    };

    @Override
    public String toString() {
        return "EMVTransDataV2{" +
                "amount='" + amount + '\'' +
                ", transType='" + transType + '\'' +
                ", flowType=" + flowType +
                ", cardType=" + cardType +
                '}';
    }
}
