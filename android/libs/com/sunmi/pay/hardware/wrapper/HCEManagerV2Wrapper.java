package com.sunmi.pay.hardware.wrapper;

import android.nfc.NdefMessage;
import android.util.Log;

import com.sunmi.pay.hardware.aidl.AidlConstants.CardType;
import com.sunmi.pay.hardware.aidl.AidlErrorCode;
import com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2;

import java.util.Arrays;

public class HCEManagerV2Wrapper {
    private static final String TAG = "HCEManagerV2Wrapper";
    private final HCEManagerV2 proxy;

    public HCEManagerV2Wrapper(HCEManagerV2 proxy) {
        this.proxy = proxy;
    }

    /**
     * OPen HCE
     *
     * @param cardType card type，2-NFC tag2 card，4-NFC FORUM T4T card
     * @return 0-success，other value- error code
     */
    public int hceOpen(int cardType) {
        return hceOpen(cardType, null);
    }

    /**
     * OPen HCE
     *
     * @param cardType card type，2-NFC tag2 card，4-NFC FORUM T4T card
     * @return 0-success，other value- error code
     */
    public int hceOpen(int cardType, byte[] param) {
        try {
            if (cardType != CardType.NFC.getValue() && cardType != CardType.IC.getValue()
                    || param != null && param.length > 255) {
                return AidlErrorCode.INVOKING_ERROR_PARAMS.getCode();
            }
            return proxy.hceOpen(cardType, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AidlErrorCode.UNKNOWN.getCode();
    }

    /**
     * Write NDEF data
     *
     * @param msg NdefMessage， For tag 4, the max data length is 1024B, and for tag 2, the max data length is 399B
     * @return 0-success，<0-error code
     */
    public int hceNdefWrite(NdefMessage msg) {
        if (msg == null) {
            return AidlErrorCode.INVOKING_ERROR_PARAMS.getCode();
        }
        return hceWrite(msg.toByteArray());
    }

    /**
     * Write NDEF data
     *
     * @param msg Currently, only support NdefMessage data format，For tag 4, the max data length is 1024B, and for tag 2, the max data length is 399B
     * @return 0-success，<0-error code
     */
    public int hceWrite(byte[] msg) {
        try {
            if (msg == null || msg.length > 1024) {
                return AidlErrorCode.INVOKING_ERROR_PARAMS.getCode();
            }
            return proxy.hceNdefWrite(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AidlErrorCode.UNKNOWN.getCode();
    }

    /**
     * Read NDEF data
     *
     * @return NdefMessage data if success, else null
     */
    public NdefMessage hceNdefRead() {
        try {
            byte[] buffer = new byte[2048];
            int len = proxy.hceNdefRead(buffer);
            if (len < 0) {
                Log.e(TAG, "hceNdefRead() failed, code:" + len);
                return null;
            }
            byte[] valid = Arrays.copyOf(buffer, len);
            return new NdefMessage(valid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Read NDEF data
     * <br/>Currently only return NdefMessage format data
     *
     * @return >0-The valid data length of param outData, <0-error code
     */
    public int hceRead(byte[] outData) {
        try {
            if (outData == null || outData.length == 0) {
                return AidlErrorCode.INVOKING_ERROR_PARAMS.getCode();
            }
            byte[] buffer = new byte[2048];
            int len = proxy.hceNdefRead(buffer);
            if (len < 0) {
                Log.e("HCE", "hceNdefRead() failed, code:" + len);
                return len;
            }
            byte[] valid = Arrays.copyOf(buffer, len);
            int copyLen = Math.min(valid.length, outData.length);
            System.arraycopy(valid, 0, outData, 0, copyLen);
            return copyLen;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AidlErrorCode.UNKNOWN.getCode();
    }

    /**
     * Close HCE
     *
     * @return 0-success，<0-error code
     */
    public int hceClose() {
        try {
            return proxy.hceClose();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return AidlErrorCode.UNKNOWN.getCode();
    }
}
