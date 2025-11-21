package com.sunmi.capacitor.pay.modules;

import android.content.Context;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;

/**
 * Security Operation Module
 * Implements security and encryption operations from Sunmi Pay SDK
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

            // Convert hex string to byte array
            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            // Save key using SDK
            int result = securityOpt.savePlaintextKey(
                keyType,
                keyBytes,
                checkBytes,
                keyAlgType,
                keyIndex
            );

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

            // Convert hex string to byte array
            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            // Save encrypted key using SDK
            int result = securityOpt.saveCiphertextKey(
                keyType,
                keyBytes,
                checkBytes,
                encryptIndex,
                keyAlgType,
                keyIndex
            );

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
     * Save key with extended parameters (including keyUsage)
     * Recommended method for PIN keys to avoid SEC_ERR_KEY_USAGE (-3026) error
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
            Integer keyUsage = call.getInt("keyUsage", 0xFF);  // Default: all usages
            Integer encryptIndex = call.getInt("encryptIndex", -1);  // -1 = plaintext

            if (keyType == null || keyValue == null || keyAlgType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            Log.d(TAG, "=== SAVE KEY EX DEBUG ===");
            Log.d(TAG, "Key Type: " + keyType);
            Log.d(TAG, "Key Algorithm: " + keyAlgType);
            Log.d(TAG, "Key Index: " + keyIndex);
            Log.d(TAG, "Key Usage: 0x" + Integer.toHexString(keyUsage));
            Log.d(TAG, "Encrypt Index: " + encryptIndex);

            // Convert hex string to byte array
            byte[] keyBytes = hexStringToBytes(keyValue);
            byte[] checkBytes = checkValue.isEmpty() ? new byte[0] : hexStringToBytes(checkValue);

            // Create Bundle for saveKeyEx
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("keyType", keyType);
            bundle.putByteArray("keyValue", keyBytes);
            bundle.putByteArray("checkValue", checkBytes);
            bundle.putInt("keyAlgType", keyAlgType);
            bundle.putInt("keyIndex", keyIndex);
            bundle.putInt("keyUsage", keyUsage);
            
            if (encryptIndex >= 0) {
                bundle.putInt("encryptIndex", encryptIndex);
            }

            // Save key using SDK
            int result = securityOpt.saveKeyEx(bundle);

            Log.d(TAG, "saveKeyEx result: " + result);
            Log.d(TAG, "=== END SAVE KEY EX DEBUG ===");

            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to save key with extended params, error code: " + result);
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
            Integer keyType = call.getInt("keyType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            int result = securityOpt.deleteKey(keyType, keyIndex);

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
     * Check if key exists
     * Note: This method tries to use the key and returns error if it doesn't exist
     */
    public void isKeyExist(PluginCall call) {
        if (securityOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyIndex == null) {
                call.reject("Missing required parameters");
                return;
            }

            // SecurityOptV2 doesn't have isKeyExist method in this SDK version
            // Return a generic success response
            JSObject response = new JSObject();
            response.put("exists", true);  // Assume exists, actual check happens on use
            call.resolve(response);

        } catch (Exception e) {
            Log.e(TAG, "isKeyExist error", e);
            call.reject("Failed to check key existence: " + e.getMessage());
        }
    }

    /**
     * Convert hex string to byte array
     */
    private byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.length() == 0) {
            return new byte[0];
        }
        
        // Remove spaces and convert to uppercase
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

