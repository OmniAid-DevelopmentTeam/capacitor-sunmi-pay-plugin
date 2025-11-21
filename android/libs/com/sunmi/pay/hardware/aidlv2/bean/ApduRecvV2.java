package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ApduRecvV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public short outlen;     //outData中有效数据的长度
    public byte[] outData;   //返回数据体（最长256字节）
    public byte swa;         //swa
    public byte swb;         //swb

    public ApduRecvV2() {
    }

    protected ApduRecvV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.outlen = (short) in.readInt();
        this.outData = in.createByteArray();
        this.swa = in.readByte();
        this.swb = in.readByte();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.outlen);
        dest.writeByteArray(this.outData);
        dest.writeByte(this.swa);
        dest.writeByte(this.swb);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ApduRecvV2> CREATOR = new Creator<ApduRecvV2>() {
        @Override
        public ApduRecvV2 createFromParcel(Parcel source) {
            return new ApduRecvV2(source);
        }

        @Override
        public ApduRecvV2[] newArray(int size) {
            return new ApduRecvV2[size];
        }
    };

    @Override
    public String toString() {
        return "ApduRecvV2{" +
                "outlen=" + outlen +
                ", outData=" + bytes2HexString(outData) +
                ", swa=" + swa +
                ", swb=" + swb +
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
