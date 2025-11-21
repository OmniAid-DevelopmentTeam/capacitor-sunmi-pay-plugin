package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ApduSendV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public byte[] command;  //命令
    public short lc;        //dataIn中有效数据的长度
    public byte[] dataIn;   //数据体（最长256字节）
    public short le;        //le

    public ApduSendV2() {
    }

    protected ApduSendV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.command = in.createByteArray();
        this.lc = (short) in.readInt();
        this.dataIn = in.createByteArray();
        this.le = (short) in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(this.command);
        dest.writeInt(this.lc);
        dest.writeByteArray(this.dataIn);
        dest.writeInt(this.le);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ApduSendV2> CREATOR = new Creator<ApduSendV2>() {
        @Override
        public ApduSendV2 createFromParcel(Parcel source) {
            return new ApduSendV2(source);
        }

        @Override
        public ApduSendV2[] newArray(int size) {
            return new ApduSendV2[size];
        }
    };

    @Override
    public String toString() {
        return "ApduSendV2{" +
                "command=" + bytes2HexString(command) +
                ", lc=" + lc +
                ", dataIn=" + bytes2HexString(dataIn) +
                ", le=" + le +
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
