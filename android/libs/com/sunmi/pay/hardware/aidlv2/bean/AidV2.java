package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/** AID */
public class AidV2 implements Parcelable, Serializable {
    private static final long serialVersionUID = -1L;

    public byte[] aid;                                    //AID标识（变长，最长16字节）
    public byte[] cvmLmt = new byte[6];                   //持卡人限额(定长6字节，大端存储)
    public byte[] termClssLmt = new byte[6];              //终端非接交易限额(定长6字节，大端存储)
    public byte[] termClssOfflineFloorLmt = new byte[6];  //终端脱机非接最低限额定(定长6字节，大端存储)
    public byte[] termOfflineFloorLmt = new byte[6];      //终端脱机最低限额(终端电子现金交易限额)(定长6字节，大端存储)
    public byte selFlag;                                  //选择标志(0-部分匹配(PART_MATCH),1-全匹配(FULL_MATCH))
    public byte targetPer;                                //目标百分比数
    public byte maxTargetPer;                             // 最大目标百分比数
    public byte[] floorLimit;                             //最低限额,大端存储 9F1B（变长，最长4字节）
    public byte randTransSel;                             //是否进行随机交易选择
    public byte velocityCheck;                            //是否进行频度检测
    public byte[] threshold = new byte[4];                //阈值（定长4字节）
    public byte[] TACDenial = new byte[5];                //终端行为代码(拒绝)（定长5字节）
    public byte[] TACOnline = new byte[5];                //终端行为代码(联机)（定长5字节）
    public byte[] TACDefault = new byte[5];               //终端行为代码(缺省)（定长5字节）
    public byte[] AcquierId = new byte[6];                //收单行标志 9F01（定长6字节）
    public byte[] dDOL;                                   //终端缺省DDOL（变长，最长32字节）
    public byte[] tDOL;                                   //终端缺省TDOL（变长，最长32字节）
    public byte[] version = new byte[2];                  //应用版本（定长2字节）
    public byte rMDLen;                                   //风险管理数据长度
    public byte[] riskManData = new byte[8];              //风险管理数据（定长8字节）
    public byte[] merchName = new byte[128];              //商户名9F4E（定长128字节）
    public byte[] merchCateCode = new byte[2];            //商户类别码(没要求可不设置)9F15（定长2字节）
    public byte[] merchId = new byte[16];                 //商户标志(商户号)9F16（定长16字节）
    public byte[] termId = new byte[8];                   //终端标志(POS号)（定长8字节）
    public byte[] referCurrCode = {0x01, 0x56};           //参考货币代码9F3C（定长2字节）
    public byte referCurrExp;                             //参考货币指数9F3D
    public byte[] referCurrCon = new byte[4];             //参考货币代码和交易代码的转换系数(交易货币对参考货币的汇率*1000)，用于境外消费，暂时不用（定长4字节）
    public byte clsStatusCheck;                           //非接触状态检查DFC108
    public byte zeroCheck;                                //非接触零金额检查DFC109
    public byte kernelType;                               //内核类型DFC10A
    public byte paramType;                                //AID参数类型DFC10B(0-默认,1-接触，2-非接)
    public byte[] ttq = new byte[4];                      //终端交易属性9F66
    public byte[] kernelID;                               //内核ID DFC10C（变长，最长8字节）
    public byte extSelectSupFlg;                          //扩展选择支持标志DFC10D(00-不支持，01-支持)

    public AidV2() {
    }

    protected AidV2(Parcel in) {
        readFromParcel(in);
    }

    public void readFromParcel(Parcel in) {
        this.aid = in.createByteArray();
        this.cvmLmt = in.createByteArray();
        this.termClssLmt = in.createByteArray();
        this.termClssOfflineFloorLmt = in.createByteArray();
        this.termOfflineFloorLmt = in.createByteArray();
        this.selFlag = in.readByte();
        this.targetPer = in.readByte();
        this.maxTargetPer = in.readByte();
        this.floorLimit = in.createByteArray();
        this.randTransSel = in.readByte();
        this.velocityCheck = in.readByte();
        this.threshold = in.createByteArray();
        this.TACDenial = in.createByteArray();
        this.TACOnline = in.createByteArray();
        this.TACDefault = in.createByteArray();
        this.AcquierId = in.createByteArray();
        this.dDOL = in.createByteArray();
        this.tDOL = in.createByteArray();
        this.version = in.createByteArray();
        this.rMDLen = in.readByte();
        this.riskManData = in.createByteArray();
        this.merchName = in.createByteArray();
        this.merchCateCode = in.createByteArray();
        this.merchId = in.createByteArray();
        this.termId = in.createByteArray();
        this.referCurrCode = in.createByteArray();
        this.referCurrExp = in.readByte();
        this.referCurrCon = in.createByteArray();
        this.clsStatusCheck = in.readByte();
        this.zeroCheck = in.readByte();
        this.kernelType = in.readByte();
        this.paramType = in.readByte();
        this.ttq = in.createByteArray();
        this.kernelID = in.createByteArray();
        this.extSelectSupFlg = in.readByte();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(this.aid);
        dest.writeByteArray(this.cvmLmt);
        dest.writeByteArray(this.termClssLmt);
        dest.writeByteArray(this.termClssOfflineFloorLmt);
        dest.writeByteArray(this.termOfflineFloorLmt);
        dest.writeByte(this.selFlag);
        dest.writeByte(this.targetPer);
        dest.writeByte(this.maxTargetPer);
        dest.writeByteArray(this.floorLimit);
        dest.writeByte(this.randTransSel);
        dest.writeByte(this.velocityCheck);
        dest.writeByteArray(this.threshold);
        dest.writeByteArray(this.TACDenial);
        dest.writeByteArray(this.TACOnline);
        dest.writeByteArray(this.TACDefault);
        dest.writeByteArray(this.AcquierId);
        dest.writeByteArray(this.dDOL);
        dest.writeByteArray(this.tDOL);
        dest.writeByteArray(this.version);
        dest.writeByte(this.rMDLen);
        dest.writeByteArray(this.riskManData);
        dest.writeByteArray(this.merchName);
        dest.writeByteArray(this.merchCateCode);
        dest.writeByteArray(this.merchId);
        dest.writeByteArray(this.termId);
        dest.writeByteArray(this.referCurrCode);
        dest.writeByte(this.referCurrExp);
        dest.writeByteArray(this.referCurrCon);
        dest.writeByte(this.clsStatusCheck);
        dest.writeByte(this.zeroCheck);
        dest.writeByte(this.kernelType);
        dest.writeByte(this.paramType);
        dest.writeByteArray(this.ttq);
        dest.writeByteArray(this.kernelID);
        dest.writeByte(this.extSelectSupFlg);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AidV2> CREATOR = new Creator<AidV2>() {
        @Override
        public AidV2 createFromParcel(Parcel source) {
            return new AidV2(source);
        }

        @Override
        public AidV2[] newArray(int size) {
            return new AidV2[size];
        }
    };

    @Override
    public String toString() {
        return "AidV2{" +
                "aid=" + bytes2HexString(aid) +
                ", cvmLmt=" + bytes2HexString(cvmLmt) +
                ", termClssLmt=" + bytes2HexString(termClssLmt) +
                ", termClssOfflineFloorLmt=" + bytes2HexString(termClssOfflineFloorLmt) +
                ", termOfflineFloorLmt=" + bytes2HexString(termOfflineFloorLmt) +
                ", selFlag=" + selFlag +
                ", targetPer=" + targetPer +
                ", maxTargetPer=" + maxTargetPer +
                ", floorLimit=" + bytes2HexString(floorLimit) +
                ", randTransSel=" + randTransSel +
                ", velocityCheck=" + velocityCheck +
                ", threshold=" + bytes2HexString(threshold) +
                ", TACDenial=" + bytes2HexString(TACDenial) +
                ", TACOnline=" + bytes2HexString(TACOnline) +
                ", TACDefault=" + bytes2HexString(TACDefault) +
                ", AcquierId=" + bytes2HexString(AcquierId) +
                ", dDOL=" + bytes2HexString(dDOL) +
                ", tDOL=" + bytes2HexString(tDOL) +
                ", version=" + bytes2HexString(version) +
                ", rMDLen=" + rMDLen +
                ", riskManData=" + bytes2HexString(riskManData) +
                ", merchName=" + bytes2HexString(merchName) +
                ", merchCateCode=" + bytes2HexString(merchCateCode) +
                ", merchId=" + bytes2HexString(merchId) +
                ", termId=" + bytes2HexString(termId) +
                ", referCurrCode=" + bytes2HexString(referCurrCode) +
                ", referCurrExp=" + referCurrExp +
                ", referCurrCon=" + bytes2HexString(referCurrCon) +
                ", clsStatusCheck=" + clsStatusCheck +
                ", zeroCheck=" + zeroCheck +
                ", kernelType=" + kernelType +
                ", paramType=" + paramType +
                ", ttq=" + bytes2HexString(ttq) +
                ", kernelID=" + bytes2HexString(kernelID) +
                ", extSelectSupFlg=" + extSelectSupFlg +
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
