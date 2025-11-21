package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by WL on 2017/3/30.
 */
public class PinPadDataV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    /** 密码键盘第一个按键x轴坐标（绝对坐标） */
    public int numX;
    /** 密码键盘第一个按y轴坐标（绝对坐标） */
    public int numY;
    /** 密码键盘第一个按键高 */
    public int numH;
    /** 密码键盘第一个按键宽 */
    public int numW;
    /** 间隔线宽（若无，传0即可） */
    public int lineW;
    /** 密码键盘取消键x轴坐标（绝对坐标） */
    public int cancelX;
    /** 密码键盘取消键y轴坐标（绝对坐标） */
    public int cancelY;
    /** 密码键盘取消键高 */
    public int cancelH;
    /** 密码键盘取消键宽 */
    public int cancelW;
    /** 行数 */
    public int rows;
    /** 列数 */
    public int clos;
    /** 键盘映射关系 */
    public byte[] keyMap = new byte[64];

    public int getNumX() {
        return numX;
    }

    public void setNumX(int numX) {
        this.numX = numX;
    }

    public int getNumY() {
        return numY;
    }

    public void setNumY(int numY) {
        this.numY = numY;
    }

    public int getNumH() {
        return numH;
    }

    public void setNumH(int numH) {
        this.numH = numH;
    }

    public int getNumW() {
        return numW;
    }

    public void setNumW(int numW) {
        this.numW = numW;
    }

    public int getLineW() {
        return lineW;
    }

    public void setLineW(int lineW) {
        this.lineW = lineW;
    }

    public int getCancelX() {
        return cancelX;
    }

    public void setCancelX(int cancelX) {
        this.cancelX = cancelX;
    }

    public int getCancelY() {
        return cancelY;
    }

    public void setCancelY(int cancelY) {
        this.cancelY = cancelY;
    }

    public int getCancelH() {
        return cancelH;
    }

    public void setCancelH(int cancelH) {
        this.cancelH = cancelH;
    }

    public int getCancelW() {
        return cancelW;
    }

    public void setCancelW(int cancelW) {
        this.cancelW = cancelW;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getClos() {
        return clos;
    }

    public void setClos(int clos) {
        this.clos = clos;
    }

    public byte[] getKeyMap() {
        return keyMap;
    }

    public void setKeyMap(byte[] keyMap) {
        this.keyMap = keyMap;
    }

    public PinPadDataV2() {
    }

    protected PinPadDataV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.numX = in.readInt();
        this.numY = in.readInt();
        this.numH = in.readInt();
        this.numW = in.readInt();
        this.lineW = in.readInt();
        this.cancelX = in.readInt();
        this.cancelY = in.readInt();
        this.cancelH = in.readInt();
        this.cancelW = in.readInt();
        this.rows = in.readInt();
        this.clos = in.readInt();
        this.keyMap = in.createByteArray();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.numX);
        dest.writeInt(this.numY);
        dest.writeInt(this.numH);
        dest.writeInt(this.numW);
        dest.writeInt(this.lineW);
        dest.writeInt(this.cancelX);
        dest.writeInt(this.cancelY);
        dest.writeInt(this.cancelH);
        dest.writeInt(this.cancelW);
        dest.writeInt(this.rows);
        dest.writeInt(this.clos);
        dest.writeByteArray(this.keyMap);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PinPadDataV2> CREATOR = new Creator<PinPadDataV2>() {
        @Override
        public PinPadDataV2 createFromParcel(Parcel in) {
            return new PinPadDataV2(in);
        }

        @Override
        public PinPadDataV2[] newArray(int size) {
            return new PinPadDataV2[size];
        }
    };

    @Override
    public String toString() {
        return "PinPadDataV2{" +
                "numX=" + numX +
                ", numY=" + numY +
                ", numH=" + numH +
                ", numW=" + numW +
                ", lineW=" + lineW +
                ", cancelX=" + cancelX +
                ", cancelY=" + cancelY +
                ", cancelH=" + cancelH +
                ", cancelW=" + cancelW +
                ", rows=" + rows +
                ", clos=" + clos +
                ", keyMap=" + bytes2HexString(keyMap) +
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
