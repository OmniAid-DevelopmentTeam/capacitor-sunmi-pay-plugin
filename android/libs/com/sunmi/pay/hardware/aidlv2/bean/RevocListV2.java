package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class RevocListV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public byte[] rid = new byte[5];            //应用注册服务商ID（定长5字节）
    public byte index;                          //密钥索引
    public byte[] sn = new byte[3];             //序列号（定长3字节）
    public byte[] reserved = new byte[3];      // 保留字节值必须为0

    public RevocListV2() {
    }

    protected RevocListV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        rid = in.createByteArray();
        index = in.readByte();
        sn = in.createByteArray();
        reserved = in.createByteArray();
    }

    public static final Creator<RevocListV2> CREATOR = new Creator<RevocListV2>() {
        @Override
        public RevocListV2 createFromParcel(Parcel in) {
            return new RevocListV2(in);
        }

        @Override
        public RevocListV2[] newArray(int size) {
            return new RevocListV2[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(rid);
        dest.writeByte(index);
        dest.writeByteArray(sn);
        dest.writeByteArray(reserved);
    }

    @Override
    public String toString() {
        return "RevocListV2{" +
                "rid=" + bytes2HexString(rid) +
                ", index=" + index +
                ", sn=" + bytes2HexString(sn) +
                ", reserved=" + bytes2HexString(reserved) +
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

    /**
     * 将RevocationList转换成Hex字符串
     */
    public String toTlvString() {
        return "9F0605" + bytes2HexString(rid) +
                "8F01" + bytes2HexString(index) +
                "DF810503" + bytes2HexString(sn);
    }

}
