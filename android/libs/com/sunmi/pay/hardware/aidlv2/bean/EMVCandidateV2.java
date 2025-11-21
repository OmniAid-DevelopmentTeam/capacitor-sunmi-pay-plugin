package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/** 候选人列表 */
public class EMVCandidateV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public short index;                  // 索引用于与优先级列表对应
    public String aid;                   // 卡片AID
    public String appPreName;            // 应用优先选择名称
    public String appLabel;              // 应用标签
    public String issDiscrData;          // tag 'BF0C'数据：1个字节的长度字节+'BF0C'最大222个字节
    public byte priority;                // 优先级标志
    public String appName;               // 本地应用名称
    public byte kernelType;              // 非接应用内核类型

    public EMVCandidateV2() {
    }

    protected EMVCandidateV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.index = (short) in.readInt();
        this.aid = in.readString();
        this.appPreName = in.readString();
        this.appLabel = in.readString();
        this.issDiscrData = in.readString();
        this.priority = in.readByte();
        this.appName = in.readString();
        this.kernelType = in.readByte();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.index);
        dest.writeString(this.aid);
        dest.writeString(this.appPreName);
        dest.writeString(this.appLabel);
        dest.writeString(this.issDiscrData);
        dest.writeByte(this.priority);
        dest.writeString(this.appName);
        dest.writeByte(this.kernelType);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<EMVCandidateV2> CREATOR = new Creator<EMVCandidateV2>() {
        @Override
        public EMVCandidateV2 createFromParcel(Parcel source) {
            return new EMVCandidateV2(source);
        }

        @Override
        public EMVCandidateV2[] newArray(int size) {
            return new EMVCandidateV2[size];
        }
    };

    @Override
    public String toString() {
        return "EMVCandidateV2{" +
                "index=" + index +
                ", aid='" + aid + '\'' +
                ", appPreName='" + appPreName + '\'' +
                ", appLabel='" + appLabel + '\'' +
                ", issDiscrData='" + issDiscrData + '\'' +
                ", priority=" + priority +
                ", appName='" + appName + '\'' +
                ", kernelType=" + kernelType +
                '}';
    }
}
