package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by WL on 2017/3/30.
 */
public class PinPadDataV2Ex implements Parcelable, Serializable {
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
    /** 密码键盘确认键x轴坐标（绝对坐标） */
    public int enterX;
    /** 密码键盘确认键y轴坐标（绝对坐标） */
    public int enterY;
    /** 密码键盘确认键高 */
    public int enterH;
    /** 密码键盘确认键宽 */
    public int enterW;
    /** 密码键盘清除键x轴坐标（绝对坐标） */
    public int clearX;
    /** 密码键盘清除键y轴坐标（绝对坐标） */
    public int clearY;
    /** 密码键盘清除键高 */
    public int clearH;
    /** 密码键盘清除键宽 */
    public int clearW;
    /** 行数 */
    public int rows;
    /** 列数 */
    public int clos;
    /** 键盘映射关系 */
    public byte[] keyMap = new byte[64];

    public PinPadDataV2Ex() {
    }

    protected PinPadDataV2Ex(Parcel in) {
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
        this.enterX = in.readInt();
        this.enterY = in.readInt();
        this.enterH = in.readInt();
        this.enterW = in.readInt();
        this.clearX = in.readInt();
        this.clearY = in.readInt();
        this.clearH = in.readInt();
        this.clearW = in.readInt();
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
        dest.writeInt(this.enterX);
        dest.writeInt(this.enterY);
        dest.writeInt(this.enterH);
        dest.writeInt(this.enterW);
        dest.writeInt(this.clearX);
        dest.writeInt(this.clearY);
        dest.writeInt(this.clearH);
        dest.writeInt(this.clearW);
        dest.writeInt(this.rows);
        dest.writeInt(this.clos);
        dest.writeByteArray(this.keyMap);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PinPadDataV2Ex> CREATOR = new Creator<PinPadDataV2Ex>() {
        @Override
        public PinPadDataV2Ex createFromParcel(Parcel in) {
            return new PinPadDataV2Ex(in);
        }

        @Override
        public PinPadDataV2Ex[] newArray(int size) {
            return new PinPadDataV2Ex[size];
        }
    };

    @Override
    public String toString() {
        return "PinPadDataV2Ex{" +
                "numX=" + numX +
                ", numY=" + numY +
                ", numH=" + numH +
                ", numW=" + numW +
                ", lineW=" + lineW +
                ", cancelX=" + cancelX +
                ", cancelY=" + cancelY +
                ", cancelH=" + cancelH +
                ", cancelW=" + cancelW +
                ", enterX=" + enterX +
                ", enterY=" + enterY +
                ", enterH=" + enterH +
                ", enterW=" + enterW +
                ", clearX=" + clearX +
                ", clearY=" + clearY +
                ", clearH=" + clearH +
                ", clearW=" + clearW +
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
