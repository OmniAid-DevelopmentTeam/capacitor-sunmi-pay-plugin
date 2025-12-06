package com.sunmi.capacitor.pay.modules;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Security Operation Module
 * Complete implementation of all security and encryption operations from Sunmi Pay SDK V2
 * 
 * Includes:
 * - MKSK key operations (save, delete, encrypt, decrypt, MAC)
 * - DUKPT key operations
 * - RSA operations (generate, inject, encrypt, decrypt, sign, verify)
 * - SM2 operations (generate, inject, encrypt, decrypt, sign, verify)
 * - Hash operations (SM3, SHA)
 * - Key injection for target apps
 * - TR31 key operations
 */
public class SecurityModule {
    private static final String TAG = "SunmiPay-SecurityModule";
    private final Context context;
    private SecurityOptV2 securityOpt;

    public SecurityModule(Context context) {
        this.context = context;
    }

    public void setSecurityOpt(SecurityOptV2 securityOpt) {
        this.securityOpt = securityOpt;
    }

    // ==================== MKSK Key Operations ====================

    /**
     * Save plaintext key (for testing only!)
     * WARNING: Never use in production - keys should always be encrypted
     */
    public void savePlaintextKey(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            Integer keyAlgType = call.getInt("keyAlgType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyValue == null || keyAlgType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            int result = securityOpt.savePlaintextKey(keyType, keyBytes, checkBytes, keyAlgType, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "savePlaintextKey error", e);
            call.reject("Failed to save plaintext key: " + e.getMessage());
        }
    }

    /**
     * Save ciphertext key (encrypted key)
     */
    public void saveCiphertextKey(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            Integer encryptIndex = call.getInt("encryptIndex");
            Integer keyAlgType = call.getInt("keyAlgType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyValue == null || encryptIndex == null || 
                keyAlgType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            int result = securityOpt.saveCiphertextKey(keyType, keyBytes, checkBytes, 
                encryptIndex, keyAlgType, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save encrypted key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "saveCiphertextKey error", e);
            call.reject("Failed to save ciphertext key: " + e.getMessage());
        }
    }

    /**
     * Save key with extended parameters
     */
    public void saveKeyEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            Integer keyAlgType = call.getInt("keyAlgType");
            Integer keyIndex = call.getInt("keyIndex");
            Integer keyUsage = call.getInt("keyUsage", 0xFF);
            Integer encryptIndex = call.getInt("encryptIndex", -1);
            Integer kcvMode = call.getInt("kcvMode", 0);
            Integer dataMode = call.getInt("dataMode", 0);
            String ivStr = call.getString("iv", "");
            Boolean isEncrypt = call.getBoolean("isEncrypt", false);

            if (keyType == null || keyValue == null || keyAlgType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);
            byte[] ivBytes = ivStr.isEmpty() ? new byte[0] : hexStringToBytes(ivStr);

            Bundle bundle = new Bundle();
            bundle.putInt("keyType", keyType);
            bundle.putByteArray("keyValue", keyBytes);
            bundle.putByteArray("checkValue", checkBytes);
            bundle.putInt("keyAlgType", keyAlgType);
            bundle.putInt("keyIndex", keyIndex);
            bundle.putInt("keyUsage", keyUsage);
            bundle.putInt("kcvMode", kcvMode);
            bundle.putInt("dataMode", dataMode);
            bundle.putByteArray("iv", ivBytes);
            bundle.putBoolean("isEncrypt", isEncrypt);
            
            if (encryptIndex >= 0) {
                bundle.putInt("encryptIndex", encryptIndex);
            }

            int result = securityOpt.saveKeyEx(bundle);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save key ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "saveKeyEx error", e);
            call.reject("Failed to save key ex: " + e.getMessage());
        }
    }

    /**
     * Delete key by index
     */
    public void deleteKey(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySystem = call.getInt("keySystem");
            Integer keyIndex = call.getInt("keyIndex");

            if (keySystem == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            int result = securityOpt.deleteKey(keySystem, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to delete key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "deleteKey error", e);
            call.reject("Failed to delete key: " + e.getMessage());
        }
    }

    /**
     * Delete key (extended method)
     */
    public void deleteKeyEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String targetPkgName = call.getString("targetPkgName", "");
            Integer keySystem = call.getInt("keySystem");
            Integer keyIndex = call.getInt("keyIndex");

            if (keySystem == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            Bundle bundle = new Bundle();
            bundle.putString("targetAppPkgName", targetPkgName);
            bundle.putInt("keySystem", keySystem);
            bundle.putInt("keyIndex", keyIndex);

            int result = securityOpt.deleteKeyEx(bundle);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to delete key ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "deleteKeyEx error", e);
            call.reject("Failed to delete key ex: " + e.getMessage());
        }
    }

    /**
     * Get key check value
     */
    public void getKeyCheckValue(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySystem = call.getInt("keySystem");
            Integer keyIndex = call.getInt("keyIndex");

            if (keySystem == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataOut = new byte[4];
            int result = securityOpt.getKeyCheckValue(keySystem, keyIndex, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("checkValue", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to get key check value, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "getKeyCheckValue error", e);
            call.reject("Failed to get key check value: " + e.getMessage());
        }
    }

    /**
     * Get key length
     */
    public void getKeyLength(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySystem = call.getInt("keySystem");
            Integer keyIndex = call.getInt("keyIndex");

            if (keySystem == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            int length = securityOpt.getKeyLength(keySystem, keyIndex);

            if (length >= 0) {
                JSObject response = new JSObject();
                response.put("length", length);
                call.resolve(response);
            } else {
                call.reject("Failed to get key length, error code: " + length);
            }
        } catch (Exception e) {
            Log.e(TAG, "getKeyLength error", e);
            call.reject("Failed to get key length: " + e.getMessage());
        }
    }

    // ==================== MAC Operations ====================

    /**
     * Calculate MAC
     */
    public void calcMac(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || macType == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[16]; // 8 bytes for 3DES, 16 for SM4/AES

            int result = securityOpt.calcMac(keyIndex, macType, dataInBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to calculate MAC, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "calcMac error", e);
            call.reject("Failed to calculate MAC: " + e.getMessage());
        }
    }

    /**
     * Calculate MAC (extended method with ICV)
     */
    public void calcMacEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer keyLen = call.getInt("keyLength", 0);
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");
            String icv = call.getString("icv", "");
            String diversify = call.getString("diversify", "");

            if (keyIndex == null || macType == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] icvBytes = icv.isEmpty() ? null : hexStringToBytes(icv);
            byte[] diversifyBytes = diversify.isEmpty() ? null : hexStringToBytes(diversify);
            byte[] dataOut = new byte[16];

            int result = securityOpt.calcMacEx(keyIndex, keyLen, macType, diversifyBytes, dataInBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to calculate MAC ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "calcMacEx error", e);
            call.reject("Failed to calculate MAC ex: " + e.getMessage());
        }
    }

    /**
     * Verify MAC
     */
    public void verifyMac(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");
            String mac = call.getString("mac");

            if (keyIndex == null || macType == null || dataIn == null || mac == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] macBytes = hexStringToBytes(mac);

            int result = securityOpt.verifyMac(keyIndex, macType, dataInBytes, macBytes);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("MAC verification failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "verifyMac error", e);
            call.reject("Failed to verify MAC: " + e.getMessage());
        }
    }

    // ==================== Data Encryption/Decryption ====================

    /**
     * Encrypt data
     */
    public void dataEncrypt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.dataEncrypt(keyIndex, dataInBytes, encryptionMode, ivBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to encrypt data, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataEncrypt error", e);
            call.reject("Failed to encrypt data: " + e.getMessage());
        }
    }

    /**
     * Decrypt data
     */
    public void dataDecrypt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.dataDecrypt(keyIndex, dataInBytes, encryptionMode, ivBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to decrypt data, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataDecrypt error", e);
            call.reject("Failed to decrypt data: " + e.getMessage());
        }
    }

    /**
     * Encrypt data (extended method)
     */
    public void dataEncryptEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer keyLength = call.getInt("keyLength", 0);
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            // SDK method: dataEncryptEx(Bundle bundle, byte[] dataOut)
            Bundle bundle = new Bundle();
            bundle.putInt("keyIndex", keyIndex);
            bundle.putInt("keyLength", keyLength);
            bundle.putByteArray("dataIn", dataInBytes);
            bundle.putInt("encryptionMode", encryptionMode);
            if (ivBytes != null) {
                bundle.putByteArray("iv", ivBytes);
            }
            
            int result = securityOpt.dataEncryptEx(bundle, dataOut);

            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validData = new byte[result > 0 ? result : dataOut.length];
                System.arraycopy(dataOut, 0, validData, 0, validData.length);
                response.put("dataOut", bytesToHex(validData));
                call.resolve(response);
            } else {
                call.reject("Failed to encrypt data ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataEncryptEx error", e);
            call.reject("Failed to encrypt data ex: " + e.getMessage());
        }
    }

    /**
     * Decrypt data (extended method)
     */
    public void dataDecryptEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer keyLength = call.getInt("keyLength", 0);
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            // SDK method: dataDecryptEx(Bundle bundle, byte[] dataOut)
            Bundle bundle = new Bundle();
            bundle.putInt("keyIndex", keyIndex);
            bundle.putInt("keyLength", keyLength);
            bundle.putByteArray("dataIn", dataInBytes);
            bundle.putInt("encryptionMode", encryptionMode);
            if (ivBytes != null) {
                bundle.putByteArray("iv", ivBytes);
            }
            
            int result = securityOpt.dataDecryptEx(bundle, dataOut);

            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validData = new byte[result > 0 ? result : dataOut.length];
                System.arraycopy(dataOut, 0, validData, 0, validData.length);
                response.put("dataOut", bytesToHex(validData));
                call.resolve(response);
            } else {
                call.reject("Failed to decrypt data ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataDecryptEx error", e);
            call.reject("Failed to decrypt data ex: " + e.getMessage());
        }
    }

    // ==================== DUKPT Operations ====================

    /**
     * Save DUKPT key
     */
    public void saveKeyDukpt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            String ksn = call.getString("ksn");
            Integer encryptType = call.getInt("encryptType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyValue == null || ksn == null || 
                encryptType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);
            byte[] ksnBytes = hexStringToBytes(ksn);

            int result = securityOpt.saveKeyDukpt(keyType, keyBytes, checkBytes, ksnBytes, encryptType, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save DUKPT key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "saveKeyDukpt error", e);
            call.reject("Failed to save DUKPT key: " + e.getMessage());
        }
    }

    /**
     * Save DUKPT AES key
     */
    public void saveKeyDukptAES(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            String ksn = call.getString("ksn");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyValue == null || ksn == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);
            byte[] ksnBytes = hexStringToBytes(ksn);

            // Using dukpt key type for AES (parameter depends on SDK version)
            int result = securityOpt.saveKeyDukptAES(0, keyType, keyBytes, checkBytes, ksnBytes, 2, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save DUKPT AES key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "saveKeyDukptAES error", e);
            call.reject("Failed to save DUKPT AES key: " + e.getMessage());
        }
    }

    /**
     * Calculate MAC (DUKPT)
     */
    public void calcMacDukpt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || macType == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[16];

            int result = securityOpt.calcMacDukpt(keyIndex, macType, dataInBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to calculate DUKPT MAC, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "calcMacDukpt error", e);
            call.reject("Failed to calculate DUKPT MAC: " + e.getMessage());
        }
    }

    /**
     * Calculate MAC (DUKPT extended)
     */
    public void calcMacDukptEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySelect = call.getInt("keySelect");
            Integer keyIndex = call.getInt("keyIndex");
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");

            if (keySelect == null || keyIndex == null || macType == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[16];

            int result = securityOpt.calcMacDukptEx(keySelect, keyIndex, macType, dataInBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to calculate DUKPT MAC ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "calcMacDukptEx error", e);
            call.reject("Failed to calculate DUKPT MAC ex: " + e.getMessage());
        }
    }

    /**
     * Verify MAC (DUKPT)
     */
    public void verifyMacDukpt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");
            String mac = call.getString("mac");

            if (keyIndex == null || macType == null || dataIn == null || mac == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] macBytes = hexStringToBytes(mac);

            // SDK method: verifyMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] macData)
            // Using keySelect=0 as default
            int result = securityOpt.verifyMacDukptEx(0, keyIndex, macType, dataInBytes, macBytes);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("DUKPT MAC verification failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "verifyMacDukpt error", e);
            call.reject("Failed to verify DUKPT MAC: " + e.getMessage());
        }
    }

    /**
     * Verify MAC (DUKPT extended)
     */
    public void verifyMacDukptEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySelect = call.getInt("keySelect");
            Integer keyIndex = call.getInt("keyIndex");
            Integer macType = call.getInt("macType");
            String dataIn = call.getString("dataIn");
            String mac = call.getString("mac");

            if (keySelect == null || keyIndex == null || macType == null || 
                dataIn == null || mac == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] macBytes = hexStringToBytes(mac);

            int result = securityOpt.verifyMacDukptEx(keySelect, keyIndex, macType, dataInBytes, macBytes);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("DUKPT MAC verification ex failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "verifyMacDukptEx error", e);
            call.reject("Failed to verify DUKPT MAC ex: " + e.getMessage());
        }
    }

    /**
     * Encrypt data (DUKPT)
     */
    public void dataEncryptDukpt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.dataEncryptDukpt(keyIndex, dataInBytes, encryptionMode, ivBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to encrypt data with DUKPT, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataEncryptDukpt error", e);
            call.reject("Failed to encrypt data with DUKPT: " + e.getMessage());
        }
    }

    /**
     * Decrypt data (DUKPT)
     */
    public void dataDecryptDukpt(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.dataDecryptDukpt(keyIndex, dataInBytes, encryptionMode, ivBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to decrypt data with DUKPT, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataDecryptDukpt error", e);
            call.reject("Failed to decrypt data with DUKPT: " + e.getMessage());
        }
    }

    /**
     * Encrypt data (DUKPT extended)
     */
    public void dataEncryptDukptEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySelect = call.getInt("keySelect");
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keySelect == null || keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.dataEncryptDukptEx(keySelect, keyIndex, dataInBytes, encryptionMode, ivBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to encrypt data with DUKPT ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataEncryptDukptEx error", e);
            call.reject("Failed to encrypt data with DUKPT ex: " + e.getMessage());
        }
    }

    /**
     * Decrypt data (DUKPT extended)
     */
    public void dataDecryptDukptEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySelect = call.getInt("keySelect");
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");
            Integer encryptionMode = call.getInt("encryptionMode", 0);
            String iv = call.getString("iv", "");

            if (keySelect == null || keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] ivBytes = iv.isEmpty() ? null : hexStringToBytes(iv);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.dataDecryptDukptEx(keySelect, keyIndex, dataInBytes, encryptionMode, ivBytes, dataOut);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(dataOut));
                call.resolve(response);
            } else {
                call.reject("Failed to decrypt data with DUKPT ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dataDecryptDukptEx error", e);
            call.reject("Failed to decrypt data with DUKPT ex: " + e.getMessage());
        }
    }

    /**
     * Increase DUKPT KSN by 1
     */
    public void dukptIncreaseKSN(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");

            if (keyIndex == null) {
                call.reject("Missing required parameter: keyIndex");
                return;
            }

            int result = securityOpt.dukptIncreaseKSN(keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to increase DUKPT KSN, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dukptIncreaseKSN error", e);
            call.reject("Failed to increase DUKPT KSN: " + e.getMessage());
        }
    }

    /**
     * Get current DUKPT KSN
     */
    public void dukptCurrentKSN(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");

            if (keyIndex == null) {
                call.reject("Missing required parameter: keyIndex");
                return;
            }

            byte[] outKSN = new byte[12]; // 10 bytes for 3DES, 12 for AES

            int result = securityOpt.dukptCurrentKSN(keyIndex, outKSN);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("ksn", bytesToHex(outKSN));
                call.resolve(response);
            } else {
                call.reject("Failed to get current DUKPT KSN, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dukptCurrentKSN error", e);
            call.reject("Failed to get current DUKPT KSN: " + e.getMessage());
        }
    }

    /**
     * Get initialized DUKPT KSN
     */
    public void dukptGetInitKSN(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            byte[] outKSN = new byte[12];

            int result = securityOpt.dukptGetInitKSN(outKSN);

            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validKsn = new byte[result];
                System.arraycopy(outKSN, 0, validKsn, 0, result);
                response.put("ksn", bytesToHex(validKsn));
                call.resolve(response);
            } else {
                call.reject("Failed to get init DUKPT KSN, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "dukptGetInitKSN error", e);
            call.reject("Failed to get init DUKPT KSN: " + e.getMessage());
        }
    }

    // ==================== RSA Operations ====================

    /**
     * Generate RSA keypair
     */
    public void generateRSAKeypair(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer pubKeyIndex = call.getInt("pubKeyIndex");
            Integer pvtKeyIndex = call.getInt("pvtKeyIndex");
            Integer keysize = call.getInt("keysize");
            String pubExponent = call.getString("pubExponent", "010001");

            if (pubKeyIndex == null || pvtKeyIndex == null || keysize == null) {
                call.reject("Missing required parameters");
                return;
            }

            int result = securityOpt.generateRSAKeys(pubKeyIndex, pvtKeyIndex, keysize, pubExponent);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to generate RSA keypair, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "generateRSAKeypair error", e);
            call.reject("Failed to generate RSA keypair: " + e.getMessage());
        }
    }

    /**
     * Generate RSA keypair (extended, 1024/2048 bit only)
     */
    public void generateRSAKeypairEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType", 0);
            Integer pvkIndex = call.getInt("pvkIndex");
            Integer keySize = call.getInt("keySize");
            String pubExponent = call.getString("pubExponent", "010001");

            if (pvkIndex == null || keySize == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataOut = new byte[512]; // Buffer for module

            int result = securityOpt.generateRSAKeypair(pvkIndex, keySize, pubExponent, dataOut);

            if (result >= 0) {
                byte[] module = new byte[result];
                System.arraycopy(dataOut, 0, module, 0, result);
                
                JSObject response = new JSObject();
                response.put("module", bytesToHex(module));
                call.resolve(response);
            } else {
                call.reject("Failed to generate RSA keypair ex, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "generateRSAKeypairEx error", e);
            call.reject("Failed to generate RSA keypair ex: " + e.getMessage());
        }
    }

    /**
     * Inject RSA key (extended)
     */
    public void injectRSAKeyEx(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType", 0);
            Integer keyIndex = call.getInt("keyIndex");
            Integer keySize = call.getInt("keySize");
            String module = call.getString("module");
            String exponent = call.getString("exponent");

            if (keyIndex == null || keySize == null || module == null || exponent == null) {
                call.reject("Missing required parameters");
                return;
            }

            int result = securityOpt.injectRSAKey(keyIndex, keySize, module, exponent);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to inject RSA key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "injectRSAKeyEx error", e);
            call.reject("Failed to inject RSA key: " + e.getMessage());
        }
    }

    /**
     * Read RSA key
     */
    public void readRSAKey(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer keyType = call.getInt("keyType", 0);

            if (keyIndex == null) {
                call.reject("Missing required parameter: keyIndex");
                return;
            }

            Bundle keyInfo = new Bundle();
            int result = securityOpt.readRSAKey(keyIndex, keyInfo);

            if (result == 0) {
                JSObject response = new JSObject();
                byte[] modulus = keyInfo.getByteArray("modulus");
                byte[] exponent = keyInfo.getByteArray("exponent");
                
                if (modulus != null) {
                    response.put("modulus", bytesToHex(modulus));
                }
                if (exponent != null) {
                    response.put("exponent", bytesToHex(exponent));
                }
                call.resolve(response);
            } else {
                call.reject("Failed to read RSA key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "readRSAKey error", e);
            call.reject("Failed to read RSA key: " + e.getMessage());
        }
    }

    /**
     * RSA encrypt or decrypt data
     */
    public void rsaEncryptOrDecryptData(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            Integer keyType = call.getInt("keyType", 0);
            String transformation = call.getString("transformation", "RSA/ECB/PKCS1Padding");
            Integer paddingMode = call.getInt("paddingMode", 1);
            Boolean isEncrypt = call.getBoolean("isEncrypt", true);
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[512]; // Buffer for output

            int result = securityOpt.rsaEncryptOrDecryptData(keyIndex, paddingMode, dataInBytes, dataOut);

            if (result >= 0) {
                byte[] validData = new byte[result];
                System.arraycopy(dataOut, 0, validData, 0, result);
                
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(validData));
                call.resolve(response);
            } else {
                call.reject("Failed RSA encrypt/decrypt, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "rsaEncryptOrDecryptData error", e);
            call.reject("Failed RSA encrypt/decrypt: " + e.getMessage());
        }
    }

    /**
     * RSA sign data
     */
    public void rsaSignData(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String signAlg = call.getString("signAlg", "SHA256WithRSA");
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[512];

            int result = securityOpt.signingRSA(signAlg, keyIndex, dataInBytes, dataOut);

            if (result >= 0) {
                byte[] signature = new byte[result];
                System.arraycopy(dataOut, 0, signature, 0, result);
                
                JSObject response = new JSObject();
                response.put("signature", bytesToHex(signature));
                call.resolve(response);
            } else {
                call.reject("Failed to sign data, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "rsaSignData error", e);
            call.reject("Failed to sign data: " + e.getMessage());
        }
    }

    /**
     * RSA verify signature
     */
    public void rsaVerifySignature(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String signAlg = call.getString("signAlg", "SHA256WithRSA");
            String srcData = call.getString("srcData");
            String signature = call.getString("signature");

            if (keyIndex == null || srcData == null || signature == null) {
                call.reject("Missing required parameters");
                return;
            }

            // Get public key for verification
            byte[] pubKey = new byte[512];
            int keyResult = securityOpt.getRSAPublicKey(keyIndex, pubKey);
            
            if (keyResult < 0) {
                call.reject("Failed to get public key, error code: " + keyResult);
                return;
            }

            byte[] actualPubKey = new byte[keyResult];
            System.arraycopy(pubKey, 0, actualPubKey, 0, keyResult);

            byte[] srcDataBytes = hexStringToBytes(srcData);
            byte[] signatureBytes = hexStringToBytes(signature);

            int result = securityOpt.verifySignatureRSA(signAlg, actualPubKey, srcDataBytes, signatureBytes);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Signature verification failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "rsaVerifySignature error", e);
            call.reject("Failed to verify signature: " + e.getMessage());
        }
    }

    // ==================== SM2 Operations ====================

    /**
     * Generate SM2 keypair
     */
    public void generateSM2Keypair(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer pubKeyIndex = call.getInt("pubKeyIndex");
            Integer pvtKeyIndex = call.getInt("pvtKeyIndex");

            if (pubKeyIndex == null || pvtKeyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            Bundle pubKey = new Bundle();
            int result = securityOpt.generateSM2Keypair(pvtKeyIndex, pubKey);

            if (result == 0) {
                JSObject response = new JSObject();
                byte[] pubKeyData = pubKey.getByteArray("data");
                if (pubKeyData != null) {
                    response.put("pubKey", bytesToHex(pubKeyData));
                }
                call.resolve(response);
            } else {
                call.reject("Failed to generate SM2 keypair, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "generateSM2Keypair error", e);
            call.reject("Failed to generate SM2 keypair: " + e.getMessage());
        }
    }

    /**
     * Inject SM2 key
     */
    public void injectSM2Key(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer pubKeyIndex = call.getInt("pubKeyIndex");
            Integer pvtKeyIndex = call.getInt("pvtKeyIndex");
            String pubKey = call.getString("pubKey");
            String pvtKey = call.getString("pvtKey");

            if (pubKeyIndex == null || pvtKeyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            Bundle keyData = new Bundle();
            if (pubKey != null) {
                keyData.putByteArray("data", hexStringToBytes(pubKey));
            }
            if (pvtKey != null) {
                keyData.putByteArray("data", hexStringToBytes(pvtKey));
            }

            int result = securityOpt.injectSM2Key(pubKeyIndex, keyData);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to inject SM2 key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "injectSM2Key error", e);
            call.reject("Failed to inject SM2 key: " + e.getMessage());
        }
    }

    /**
     * Read SM2 public key
     */
    public void readSM2Key(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");

            if (keyIndex == null) {
                call.reject("Missing required parameter: keyIndex");
                return;
            }

            Bundle keyData = new Bundle();
            int result = securityOpt.readSM2Key(keyIndex, keyData);

            if (result == 0) {
                JSObject response = new JSObject();
                byte[] data = keyData.getByteArray("data");
                if (data != null) {
                    response.put("keyData", bytesToHex(data));
                }
                call.resolve(response);
            } else {
                call.reject("Failed to read SM2 key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "readSM2Key error", e);
            call.reject("Failed to read SM2 key: " + e.getMessage());
        }
    }

    /**
     * SM2 sign data
     */
    public void sm2Sign(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[128]; // SM2 signature is 64 bytes

            // Default userId
            byte[] userId = new byte[]{0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,
                                       0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38};

            int result = securityOpt.sm2Sign(keyIndex, keyIndex, userId, dataInBytes, dataOut);

            if (result >= 0) {
                byte[] signature = new byte[result];
                System.arraycopy(dataOut, 0, signature, 0, result);
                
                JSObject response = new JSObject();
                response.put("signature", bytesToHex(signature));
                call.resolve(response);
            } else {
                call.reject("Failed to sign with SM2, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sm2Sign error", e);
            call.reject("Failed to sign with SM2: " + e.getMessage());
        }
    }

    /**
     * SM2 verify signature
     */
    public void sm2VerifySign(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String srcData = call.getString("srcData");
            String signature = call.getString("signature");

            if (keyIndex == null || srcData == null || signature == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] srcDataBytes = hexStringToBytes(srcData);
            byte[] signatureBytes = hexStringToBytes(signature);
            byte[] userId = new byte[]{0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,
                                       0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38};

            int result = securityOpt.sm2VerifySign(keyIndex, userId, srcDataBytes, signatureBytes);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("SM2 signature verification failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sm2VerifySign error", e);
            call.reject("Failed to verify SM2 signature: " + e.getMessage());
        }
    }

    /**
     * SM2 encrypt data
     */
    public void sm2EncryptData(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[dataInBytes.length + 96]; // SM2 encrypted data includes overhead

            int result = securityOpt.sm2EncryptData(keyIndex, dataInBytes, dataOut);

            if (result >= 0) {
                byte[] encrypted = new byte[result];
                System.arraycopy(dataOut, 0, encrypted, 0, result);
                
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(encrypted));
                call.resolve(response);
            } else {
                call.reject("Failed to encrypt with SM2, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sm2EncryptData error", e);
            call.reject("Failed to encrypt with SM2: " + e.getMessage());
        }
    }

    /**
     * SM2 decrypt data
     */
    public void sm2DecryptData(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyIndex = call.getInt("keyIndex");
            String dataIn = call.getString("dataIn");

            if (keyIndex == null || dataIn == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[dataInBytes.length];

            int result = securityOpt.sm2DecryptData(keyIndex, dataInBytes, dataOut);

            if (result >= 0) {
                byte[] decrypted = new byte[result];
                System.arraycopy(dataOut, 0, decrypted, 0, result);
                
                JSObject response = new JSObject();
                response.put("dataOut", bytesToHex(decrypted));
                call.resolve(response);
            } else {
                call.reject("Failed to decrypt with SM2, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sm2DecryptData error", e);
            call.reject("Failed to decrypt with SM2: " + e.getMessage());
        }
    }

    // ==================== Hash Operations ====================

    /**
     * Calculate hash (SM3, SHA, etc.)
     */
    public void calcSecHash(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String hashAlg = call.getString("hashAlg", "SM3");
            String dataIn = call.getString("dataIn");

            if (dataIn == null) {
                call.reject("Missing required parameter: dataIn");
                return;
            }

            // Convert hashAlg string to mode int
            int mode = 0; // SM3 default
            if ("SHA1".equalsIgnoreCase(hashAlg)) {
                mode = 1;
            } else if ("SHA256".equalsIgnoreCase(hashAlg)) {
                mode = 2;
            } else if ("SHA384".equalsIgnoreCase(hashAlg)) {
                mode = 3;
            } else if ("SHA512".equalsIgnoreCase(hashAlg)) {
                mode = 4;
            }

            byte[] dataInBytes = hexStringToBytes(dataIn);
            byte[] dataOut = new byte[64]; // Max hash size

            int result = securityOpt.calcSecHash(mode, dataInBytes, dataOut);

            if (result >= 0) {
                byte[] hash = new byte[result];
                System.arraycopy(dataOut, 0, hash, 0, result);
                
                JSObject response = new JSObject();
                response.put("hash", bytesToHex(hash));
                call.resolve(response);
            } else {
                call.reject("Failed to calculate hash, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "calcSecHash error", e);
            call.reject("Failed to calculate hash: " + e.getMessage());
        }
    }

    // ==================== Key Injection Operations ====================

    /**
     * Inject plaintext key to target app
     */
    public void injectPlaintextKey(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String targetPkgName = call.getString("targetPkgName");
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            Integer keyAlgType = call.getInt("keyAlgType");
            Integer keyIndex = call.getInt("keyIndex");

            if (targetPkgName == null || keyType == null || keyValue == null || 
                keyAlgType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            int result = securityOpt.injectPlaintextKey(targetPkgName, keyType, keyBytes, 
                checkBytes, keyAlgType, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to inject plaintext key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "injectPlaintextKey error", e);
            call.reject("Failed to inject plaintext key: " + e.getMessage());
        }
    }

    /**
     * Inject ciphertext key to target app
     */
    public void injectCiphertextKey(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String targetPkgName = call.getString("targetPkgName");
            Integer keyType = call.getInt("keyType");
            String keyValue = call.getString("keyValue");
            String checkValue = call.getString("checkValue", "");
            Integer encryptIndex = call.getInt("encryptIndex");
            Integer keyAlgType = call.getInt("keyAlgType");
            Integer keyIndex = call.getInt("keyIndex");

            if (targetPkgName == null || keyType == null || keyValue == null || 
                encryptIndex == null || keyAlgType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            int result = securityOpt.injectCiphertextKey(targetPkgName, keyType, keyBytes, 
                checkBytes, encryptIndex, keyAlgType, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to inject ciphertext key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "injectCiphertextKey error", e);
            call.reject("Failed to inject ciphertext key: " + e.getMessage());
        }
    }

    /**
     * Save TR31 key
     */
    public void saveTR31Key(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String keyValue = call.getString("keyValue");
            Integer kbpkIndex = call.getInt("kbpkIndex");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyValue == null || kbpkIndex == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            byte[] keyBytes = hexStringToBytes(keyValue);

            int result = securityOpt.saveTR31Key(keyBytes, kbpkIndex, keyIndex);

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save TR31 key, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "saveTR31Key error", e);
            call.reject("Failed to save TR31 key: " + e.getMessage());
        }
    }

    /**
     * Check if key exists (using check value method)
     */
    public void isKeyExist(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySystem = call.getInt("keySystem", 0);
            Integer keyIndex = call.getInt("keyIndex");

            if (keyIndex == null) {
                call.reject("Missing required parameter: keyIndex");
                return;
            }

            byte[] checkValue = new byte[4];
            int result = securityOpt.getKeyCheckValue(keySystem, keyIndex, checkValue);

            JSObject response = new JSObject();
            response.put("exists", result == 0);
            call.resolve(response);
        } catch (Exception e) {
            Log.e(TAG, "isKeyExist error", e);
            JSObject response = new JSObject();
            response.put("exists", false);
            call.resolve(response);
        }
    }

    // ==================== Utility Methods ====================

    /**
     * Convert hex string to byte array
     */
    private byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.length() == 0) {
            return new byte[0];
        }
        
        hexString = hexString.replaceAll("\\s+", "").toUpperCase();
        
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                                 + Character.digit(hexString.charAt(i+1), 16));
        }
        return data;
    }

    /**
     * Convert byte array to hex string
     */
    private String bytesToHex(byte[] bytes) {
        if (bytes == null) return "";
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}
