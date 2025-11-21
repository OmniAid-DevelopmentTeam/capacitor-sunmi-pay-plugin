package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * DrlV2
 */
public class DrlV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public boolean isDefaultLmt = false;                 //是否是默认的limitSet
    public boolean statusCheck = false;                  //是否开启状态检查
    public byte zeroCheck = 1;                           //是否开启零金额检查,0表示联机，1表示notAllow,2表示关闭
    public byte[] programID;                             //应用程序ID
    public byte[] cvmLmt = new byte[6];                  //持卡人限额(定长6字节，大端存储)
    public byte[] termClssLmt = new byte[6];             //终端非接交易限额(定长6字节，大端存储)
    public byte[] termClssFloorLmt = new byte[6];        //终端非接最低限额定(定长6字节，大端存储)
    public byte[] termFloorLmt = new byte[6];            //终端最低限额(定长6字节，大端存储)
    public boolean cvmLmtActivate = true;                //是否开启持卡人限额检查
    public boolean termClssLmtActivate = false;          //是否开启终端非接限额检查
    public byte termClssFloorLmtActivate = 1;            //是否开启终端非接最低限额定，0表示关闭，1表示开启且终端非接限额存在，2表示开启但终端非接限额不存在

    public DrlV2() {
    }

    protected DrlV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.isDefaultLmt = in.readByte() != 0;
        this.statusCheck = in.readByte() != 0;
        this.zeroCheck = in.readByte();
        this.programID = in.createByteArray();
        this.cvmLmt = in.createByteArray();
        this.termClssLmt = in.createByteArray();
        this.termClssFloorLmt = in.createByteArray();
        this.termFloorLmt = in.createByteArray();
        this.cvmLmtActivate = in.readByte() != 0;
        this.termClssLmtActivate = in.readByte() != 0;
        this.termClssFloorLmtActivate = in.readByte();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.isDefaultLmt ? (byte) 1 : (byte) 0);
        dest.writeByte(this.statusCheck ? (byte) 1 : (byte) 0);
        dest.writeByte(this.zeroCheck);
        dest.writeByteArray(this.programID);
        dest.writeByteArray(this.cvmLmt);
        dest.writeByteArray(this.termClssLmt);
        dest.writeByteArray(this.termClssFloorLmt);
        dest.writeByteArray(this.termFloorLmt);
        dest.writeByte(this.cvmLmtActivate ? (byte) 1 : (byte) 0);
        dest.writeByte(this.termClssLmtActivate ? (byte) 1 : (byte) 0);
        dest.writeByte(this.termClssFloorLmtActivate);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DrlV2> CREATOR = new Creator<DrlV2>() {
        @Override
        public DrlV2 createFromParcel(Parcel source) {
            return new DrlV2(source);
        }

        @Override
        public DrlV2[] newArray(int size) {
            return new DrlV2[size];
        }
    };

    @Override
    public String toString() {
        return "DrlV2{" +
                "isDefaultLmt=" + isDefaultLmt +
                ", statusCheck=" + statusCheck +
                ", zeroCheck=" + zeroCheck +
                ", programID=" + bytes2HexString(programID) +
                ", cvmLmt=" + bytes2HexString(cvmLmt) +
                ", termClssLmt=" + bytes2HexString(termClssLmt) +
                ", termClssOfflineFloorLmt=" + bytes2HexString(termClssFloorLmt) +
                ", termOfflineFloorLmt=" + bytes2HexString(termFloorLmt) +
                ", cvmLmtStatus=" + cvmLmtActivate +
                ", termClssLmtStatus=" + termClssLmtActivate +
                ", termClssOfflineFloorLmtStatus=" + termClssFloorLmtActivate +
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
