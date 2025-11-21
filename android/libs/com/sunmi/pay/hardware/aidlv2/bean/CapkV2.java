package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/** CAPK */
public class CapkV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public byte[] rid = new byte[5];            //应用注册服务商ID
    public byte index;                          //密钥索引
    public byte hashInd;                        //HASH算法标志
    public byte arithInd;                       //RSA算法标志
    public byte[] modul;                       //模（变长，最长248字节）
    public byte[] exponent;                     //指数（变长，最长3字节）
    public byte[] expDate = new byte[3];        //有效期(YYMMDD)（定长3字节）
    public byte[] checkSum = new byte[20];      //密钥校验和（定长20字节）

    public CapkV2() {
    }

    protected CapkV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.rid = in.createByteArray();
        this.index = in.readByte();
        this.hashInd = in.readByte();
        this.arithInd = in.readByte();
        this.modul = in.createByteArray();
        this.exponent = in.createByteArray();
        this.expDate = in.createByteArray();
        this.checkSum = in.createByteArray();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(this.rid);
        dest.writeByte(this.index);
        dest.writeByte(this.hashInd);
        dest.writeByte(this.arithInd);
        dest.writeByteArray(this.modul);
        dest.writeByteArray(this.exponent);
        dest.writeByteArray(this.expDate);
        dest.writeByteArray(this.checkSum);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CapkV2> CREATOR = new Creator<CapkV2>() {
        @Override
        public CapkV2 createFromParcel(Parcel source) {
            return new CapkV2(source);
        }

        @Override
        public CapkV2[] newArray(int size) {
            return new CapkV2[size];
        }
    };

    @Override
    public String toString() {
        return "CapkV2{" +
                "rid=" + bytes2HexString(rid) +
                ", index=" + index +
                ", hashInd=" + hashInd +
                ", arithInd=" + arithInd +
                ", modul=" + bytes2HexString(modul) +
                ", exponent=" + bytes2HexString(exponent) +
                ", expDate=" + bytes2HexString(expDate) +
                ", checkSum=" + bytes2HexString(checkSum) +
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
