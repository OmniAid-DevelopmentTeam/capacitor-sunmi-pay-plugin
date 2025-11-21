package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by WL on 2017/3/30.
 */

public class PinPadData implements Parcelable {

    /**
     * 密码键盘第一个按键x轴坐标（绝对坐标）
     */
    public int numX;
    /**
     * 密码键盘第一个按y轴坐标（绝对坐标）
     */
    public int numY;
    /**
     * 密码键盘第一个按键高
     */
    public int numH;
    /**
     * 密码键盘第一个按键宽
     */
    public int numW;
    /**
     * 间隔线宽（若无，传0即可）
     */
    public int lineW;
    /**
     * 密码键盘取消键x轴坐标（绝对坐标）
     */
    public int cancelX;
    /**
     * 密码键盘取消键y轴坐标（绝对坐标）
     */
    public int cancelY;
    /**
     * 密码键盘取消键高
     */
    public int cancelH;
    /**
     * 密码键盘取消键宽
     */
    public int cancelW;
    /**
     * 函数
     */
    public int rows;
    /**
     * 列数
     */
    public int clos;
    /**
     * 键盘映射关系
     */
    public byte[] keyMap = new byte[64];

    public PinPadData() {
    }

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

    protected PinPadData(Parcel in) {
        numX = in.readInt();
        numY = in.readInt();
        numH = in.readInt();
        numW = in.readInt();
        lineW = in.readInt();
        cancelX = in.readInt();
        cancelY = in.readInt();
        cancelH = in.readInt();
        cancelW = in.readInt();
        rows = in.readInt();
        clos = in.readInt();
        keyMap = in.createByteArray();
    }

    public static final Creator<PinPadData> CREATOR = new Creator<PinPadData>() {
        @Override
        public PinPadData createFromParcel(Parcel in) {
            return new PinPadData(in);
        }

        @Override
        public PinPadData[] newArray(int size) {
            return new PinPadData[size];
        }
    };

    /**
     * 参数检查
     *
     * @return
     */
    public boolean check() {
        return !(numH == 0 || numW == 0) && !(cancelH == 0 || cancelW == 0);
    }

    @Override
    public String toString() {
        return "numX:" + numX +
                "\nnumW:" + numW +
                "\nnumH:" + numH +
                "\nnumY:" + numY +
                "\ncancelH:" + cancelH +
                "\ncancelW:" + cancelW +
                "\ncancelX:" + cancelX +
                "\ncancelY:" + cancelY;
    }

    public void readFromParcel(Parcel in) {
        numX = in.readInt();
        numY = in.readInt();
        numH = in.readInt();
        numW = in.readInt();
        lineW = in.readInt();
        cancelX = in.readInt();
        cancelY = in.readInt();
        cancelH = in.readInt();
        cancelW = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(numX);
        dest.writeInt(numY);
        dest.writeInt(numH);
        dest.writeInt(numW);
        dest.writeInt(lineW);
        dest.writeInt(cancelX);
        dest.writeInt(cancelY);
        dest.writeInt(cancelH);
        dest.writeInt(cancelW);
        dest.writeInt(rows);
        dest.writeInt(clos);
        dest.writeByteArray(keyMap);
    }
}
