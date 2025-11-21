package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * EMV交易处理实体类
 */
public class TransData implements Parcelable {

    /**
     * 交易金额(单位分)，必须参数，不能为null 和 "" ,当amount="0"时表示查询余额
     */
    public String amount;

    /**
     * 交易类型
     */
    public String transType = "00";

    /**
     * 是否强制联机，默认强制联机,常量定义见AidlConstants.EMV
     */
    public int isForceOnline;

    protected TransData(Parcel in) {
        amount = in.readString();
        transType = in.readString();
        isForceOnline = in.readInt();
    }

    public static final Creator<TransData> CREATOR = new Creator<TransData>() {

        @Override
        public TransData createFromParcel(Parcel in) {
            return new TransData(in);
        }

        @Override
        public TransData[] newArray(int size) {
            return new TransData[size];
        }

    };

    public TransData() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(amount);
        dest.writeString(transType);
        dest.writeInt(isForceOnline);
    }

}
