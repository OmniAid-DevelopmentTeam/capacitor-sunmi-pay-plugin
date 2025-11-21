package com.sunmi.capacitor.pay;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;

import sunmi.paylib.SunmiPayKernel;

/**
 * Helper class for security operations (PIN, MAC, encryption)
 * This is a stub implementation
 */
public class SecurityHelper {
    private static final String TAG = "SecurityHelper";
    private final SunmiPayKernel payKernel;
    private SecurityOptV2 securityOpt;

    public SecurityHelper(SunmiPayKernel payKernel) {
        this.payKernel = payKernel;
        this.securityOpt = payKernel.mSecurityOptV2;
    }

    /**
     * Input PIN
     * Note: Actual implementation requires PinPadOptV2 and proper PIN input handling
     */
    public void inputPIN(int keyIndex, String cardNumber, int pinBlockFormat, int timeout, PINInputCallback callback) {
        try {
            if (securityOpt == null) {
                callback.onError("SecurityOpt not initialized");
                return;
            }

            // This is a stub - actual implementation needs:
            // 1. Use PinPadOptV2 to show PIN input dialog
            // 2. Handle PIN input with proper key and format
            // 3. Return encrypted PIN block
            
            Log.d(TAG, "PIN input requested for card: " + cardNumber);
            callback.onError("PIN input requires full implementation with PinPadOptV2");
            
        } catch (Exception e) {
            Log.e(TAG, "Error inputting PIN", e);
            callback.onError("Error inputting PIN: " + e.getMessage());
        }
    }

    /**
     * Calculate MAC
     */
    public void calculateMAC(int keyIndex, String data, int macAlgorithm, DataCallback callback) {
        try {
            if (securityOpt == null) {
                callback.onError("SecurityOpt not initialized");
                return;
            }

            byte[] dataBytes = hexStringToByteArray(data);
            byte[] macOut = new byte[8];
            
            // Signature: calcMac(int macType, int keyIndex, byte[] data, byte[] mac)
            int result = securityOpt.calcMac(macAlgorithm, keyIndex, dataBytes, macOut);
            
            if (result == 0) {
                JSObject ret = new JSObject();
                ret.put("mac", byteArrayToHexString(macOut));
                callback.onSuccess(ret);
            } else {
                callback.onError("Failed to calculate MAC: error code " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error calculating MAC", e);
            callback.onError("Error calculating MAC: " + e.getMessage());
        }
    }

    /**
     * Encrypt data
     */
    public void encryptData(int keyIndex, String data, int mode, String iv, DataCallback callback) {
        try {
            if (securityOpt == null) {
                callback.onError("SecurityOpt not initialized");
                return;
            }

            byte[] dataBytes = hexStringToByteArray(data);
            byte[] ivBytes = hexStringToByteArray(iv);
            byte[] encryptedData = new byte[dataBytes.length + 16];
            
            // Signature: dataEncrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] ivBytes, byte[] dataOut)
            int result = securityOpt.dataEncrypt(keyIndex, dataBytes, mode, ivBytes, encryptedData);
            
            if (result > 0) {
                JSObject ret = new JSObject();
                ret.put("encryptedData", byteArrayToHexString(encryptedData).substring(0, result * 2));
                callback.onSuccess(ret);
            } else {
                callback.onError("Failed to encrypt data: error code " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error encrypting data", e);
            callback.onError("Error encrypting data: " + e.getMessage());
        }
    }

    /**
     * Decrypt data
     */
    public void decryptData(int keyIndex, String data, int mode, String iv, DataCallback callback) {
        try {
            if (securityOpt == null) {
                callback.onError("SecurityOpt not initialized");
                return;
            }

            byte[] dataBytes = hexStringToByteArray(data);
            byte[] ivBytes = hexStringToByteArray(iv);
            byte[] decryptedData = new byte[dataBytes.length];
            
            // Signature: dataDecrypt(int keyIndex, byte[] dataIn, int decryptionMode, byte[] ivBytes, byte[] dataOut)
            int result = securityOpt.dataDecrypt(keyIndex, dataBytes, mode, ivBytes, decryptedData);
            
            if (result > 0) {
                JSObject ret = new JSObject();
                ret.put("decryptedData", byteArrayToHexString(decryptedData).substring(0, result * 2));
                callback.onSuccess(ret);
            } else {
                callback.onError("Failed to decrypt data: error code " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error decrypting data", e);
            callback.onError("Error decrypting data: " + e.getMessage());
        }
    }

    private byte[] hexStringToByteArray(String s) {
        if (s == null || s.length() == 0) {
            return new byte[0];
        }
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    private String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}

