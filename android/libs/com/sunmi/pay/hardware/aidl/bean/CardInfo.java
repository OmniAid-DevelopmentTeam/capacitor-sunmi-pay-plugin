package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Created by WL on 2017/3/24.
 */

public class CardInfo implements Parcelable {

    public int cardType;
    public String cardNo;
    public String track1;
    public String track2;
    public String track3;
    public String expireDate;       // 有效期（4位）
    public String serviceCode;      // 服务码（3位）
    public String countryCode;      // 国家代码(IC卡和非接)
    public boolean isCardSerialNo;  // 是否有卡片序列号
    public String cardSerialNo;     // 卡片序列号（IC卡和非接）
    public String uuid;
    public String atr;

    public CardInfo() {
    }

    protected CardInfo(Parcel in) {
        cardType = in.readInt();
        cardNo = in.readString();
        track1 = in.readString();
        track2 = in.readString();
        track3 = in.readString();
        expireDate = in.readString();
        serviceCode = in.readString();
        countryCode = in.readString();
        uuid = in.readString();
        atr = in.readString();
        cardSerialNo = in.readString();
        isCardSerialNo = in.readByte() != 0;
    }

    public static final Creator<CardInfo> CREATOR = new Creator<CardInfo>() {
        @Override
        public CardInfo createFromParcel(Parcel in) {
            return new CardInfo(in);
        }

        @Override
        public CardInfo[] newArray(int size) {
            return new CardInfo[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(cardType);
        dest.writeString(cardNo);
        dest.writeString(track1);
        dest.writeString(track2);
        dest.writeString(track3);
        dest.writeString(expireDate);
        dest.writeString(serviceCode);
        dest.writeString(countryCode);
        dest.writeString(uuid);
        dest.writeString(atr);
        dest.writeString(cardSerialNo);
        byte b = (byte) (isCardSerialNo ? 1 : 0);
        dest.writeByte(b);
    }

    public void readFromParcel(Parcel in) {
        cardType = in.readInt();
        cardNo = in.readString();
        track1 = in.readString();
        track2 = in.readString();
        track3 = in.readString();
        expireDate = in.readString();
        serviceCode = in.readString();
        countryCode = in.readString();
        uuid = in.readString();
        atr = in.readString();
        cardSerialNo = in.readString();
        isCardSerialNo = in.readByte() != 0;
    }

    @Override
    public String toString() {
        return "CardInfo{" +
                "cardType=" + cardType +
                ", cardNo='" + cardNo + '\'' +
                ", track1='" + track1 + '\'' +
                ", track2='" + track2 + '\'' +
                ", track3='" + track3 + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", isCardSerialNo=" + isCardSerialNo +
                ", cardSerialNo='" + cardSerialNo + '\'' +
                ", uuid='" + uuid + '\'' +
                ", atr='" + atr + '\'' +
                '}';
    }

}
