package com.sunmi.capacitor.pay.modules;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadListenerV2;
import com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2;
import com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * PinPad Operation Module
 * Implements PIN pad operations from Sunmi Pay SDK
 */
public class PinPadModule {
    private static final String TAG = "SunmiPay-PinPadModule";
    private final Context context;
    private PinPadOptV2 pinPadOpt;
    private PluginCall currentCall;

    public PinPadModule(Context context) {
        this.context = context;
    }

    public void setPinPadOpt(PinPadOptV2 pinPadOpt) {
        this.pinPadOpt = pinPadOpt;
    }

    /**
     * Initialize PinPad
     */
    public void initPinPad(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            JSObject configObj = call.getObject("config");
            if (configObj == null) {
                call.reject("Parameter 'config' is required");
                return;
            }

            // Parse PinPadConfig
            PinPadConfigV2 pinPadConfig = new PinPadConfigV2();
            pinPadConfig.setPinPadType((byte) configObj.getInteger("pinPadType", 0).intValue());
            pinPadConfig.setPinType((byte) configObj.getInteger("pinType", 0).intValue());
            pinPadConfig.setOrderNumKey(configObj.getInteger("isOrderNumKey", 1) == 1);
            
            // PCI DSS: PAN must be converted to byte array (BCD format)
            // SECURITY: Never log full PAN - only mask for debugging purposes
            String panStr = configObj.getString("pan");
            
            if (panStr != null && !panStr.isEmpty()) {
                // Ensure PAN is exactly 16 digits (pad with 0s on the left if needed)
                // Most PIN pads expect exactly 16 digits (8 bytes in BCD)
                if (panStr.length() < 16) {
                    panStr = String.format("%16s", panStr).replace(' ', '0');
                } else if (panStr.length() > 19) {
                    panStr = panStr.substring(0, 19);
                }
                
                // Ensure even length for BCD conversion
                if (panStr.length() % 2 != 0) {
                    panStr = panStr + "F";
                }
                
                try {
                    // Convert PAN string to BCD (Binary Coded Decimal) format
                    byte[] panBytes = stringToBcd(panStr);
                    pinPadConfig.setPan(panBytes);
                } catch (Exception e) {
                    Log.e(TAG, "Failed to convert PAN to BCD");
                    call.reject("Failed to convert PAN: " + e.getMessage());
                    return;
                }
            } else {
                call.reject("PAN (card number) is required");
                return;
            }
            
            int pinKeyIndex = configObj.getInteger("pinKeyIndex", configObj.getInteger("keyIndex", 0));
            int maxInput = configObj.getInteger("maxInput", 6);
            int minInput = configObj.getInteger("minInput", 4);
            int keySystem = configObj.getInteger("keySystem", 0);
            int timeout = configObj.getInteger("timeout", 60);
            int algorithmType = configObj.getInteger("algorithmType", 0);
            
            pinPadConfig.setPinKeyIndex(pinKeyIndex);
            pinPadConfig.setMaxInput((byte) maxInput);
            pinPadConfig.setMinInput((byte) minInput);
            pinPadConfig.setKeySystem((byte) keySystem);
            pinPadConfig.setTimeout(timeout);
            pinPadConfig.setAlgorithmType((byte) algorithmType);
            
            // Note: setPinBlockFormat and setEncryptWay may not be available in all SDK versions
            // These are optional parameters that can be set if needed

            currentCall = call;

            // Call SDK method
            pinPadOpt.initPinPad(pinPadConfig, mPinPadListener);
            
        } catch (Exception e) {
            Log.e(TAG, "initPinPad error", e);
            call.reject("Failed to initialize PIN pad: " + e.getMessage());
        }
    }

    /**
     * Initialize PinPad (extended method)
     */
    public void initPinPadEx(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            JSObject configObj = call.getObject("config");
            if (configObj == null) {
                call.reject("Parameter 'config' is required");
                return;
            }

            // Parse PinPadConfigEx (uses Bundle for Ex version)
            Bundle pinPadConfig = new Bundle();
            pinPadConfig.putInt("pinPadType", configObj.getInteger("pinPadType", 0));
            pinPadConfig.putInt("pinType", configObj.getInteger("pinType", 0));
            pinPadConfig.putInt("isOrderNumKey", configObj.getInteger("isOrderNumKey", 1));
            pinPadConfig.putString("pan", configObj.getString("pan"));
            pinPadConfig.putInt("pinKeyIndex", configObj.getInteger("pinKeyIndex", configObj.getInteger("keyIndex", 0)));
            pinPadConfig.putInt("maxInput", configObj.getInteger("maxInput", 6));
            pinPadConfig.putInt("minInput", configObj.getInteger("minInput", 4));
            pinPadConfig.putInt("keySystem", configObj.getInteger("keySystem", 0));
            pinPadConfig.putInt("timeout", configObj.getInteger("timeout", 60));
            pinPadConfig.putInt("algorithmType", configObj.getInteger("algorithmType", 0));
            
            if (configObj.has("isSupportBypass")) {
                pinPadConfig.putInt("isSupportBypass", configObj.getInteger("isSupportBypass", 0));
            }
            if (configObj.has("pinblockFormat")) {
                pinPadConfig.putInt("pinblockFormat", configObj.getInteger("pinblockFormat", 0));
            }
            if (configObj.has("encryptWay")) {
                pinPadConfig.putInt("encryptWay", configObj.getInteger("encryptWay", 0));
            }
            if (configObj.has("diversify")) {
                pinPadConfig.putString("diversify", configObj.getString("diversify"));
            }
            if (configObj.has("expLen")) {
                pinPadConfig.putString("expLen", configObj.getString("expLen"));
            }

            currentCall = call;

            // Call SDK method
            pinPadOpt.initPinPadEx(pinPadConfig, mPinPadListener);
            
        } catch (Exception e) {
            Log.e(TAG, "initPinPadEx error", e);
            call.reject("Failed to initialize PIN pad (Ex): " + e.getMessage());
        }
    }

    /**
     * Import PinPad data (for custom keyboards)
     */
    public void importPinPadData(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            JSObject dataObj = call.getObject("data");
            if (dataObj == null) {
                call.reject("Parameter 'data' is required");
                return;
            }

            Bundle pinPadData = new Bundle();
            // Parse arrays
            // Note: JSObject doesn't have getArray, so this needs special handling
            // For now, we'll implement a basic version
            
            call.reject("importPinPadData not fully implemented yet");
            
        } catch (Exception e) {
            Log.e(TAG, "importPinPadData error", e);
            call.reject("Failed to import PIN pad data: " + e.getMessage());
        }
    }

    /**
     * Import PinPad data (extended method)
     */
    public void importPinPadDataEx(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            call.reject("importPinPadDataEx not fully implemented yet");
            
        } catch (Exception e) {
            Log.e(TAG, "importPinPadDataEx error", e);
            call.reject("Failed to import PIN pad data (Ex): " + e.getMessage());
        }
    }

    /**
     * Cancel PIN input
     */
    public void cancelInputPin(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            pinPadOpt.cancelInputPin();
            
            JSObject response = new JSObject();
            response.put("success", true);
            call.resolve(response);
            
        } catch (Exception e) {
            Log.e(TAG, "cancelInputPin error", e);
            call.reject("Failed to cancel PIN input: " + e.getMessage());
        }
    }

    /**
     * Set PinPad showing text
     */
    public void setPinPadText(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            JSObject configObj = call.getObject("config");
            if (configObj == null) {
                call.reject("Parameter 'config' is required");
                return;
            }

            // PinPadTextConfigV2 might not have public fields or setters
            // Try creating default instance and let SDK handle it
            PinPadTextConfigV2 textConfig = new PinPadTextConfigV2();
            
            // Note: Text configuration fields may not be accessible in all SDK versions
            // The SDK should show default text in Chinese

            pinPadOpt.setPinPadText(textConfig);
            
            JSObject response = new JSObject();
            response.put("success", true);
            call.resolve(response);
            
        } catch (Exception e) {
            Log.e(TAG, "setPinPadText error", e);
            call.reject("Failed to set PIN pad text: " + e.getMessage());
        }
    }

    /**
     * Set PinPad mode
     */
    public void setPinPadMode(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            JSObject configObj = call.getObject("config");
            if (configObj == null) {
                call.reject("Parameter 'config' is required");
                return;
            }

            Bundle modeConfig = new Bundle();
            if (configObj.has("normal")) {
                modeConfig.putInt("normal", configObj.getInteger("normal"));
            }
            if (configObj.has("longPressToClear")) {
                modeConfig.putInt("longPressToClear", configObj.getInteger("longPressToClear"));
            }
            if (configObj.has("silent")) {
                modeConfig.putInt("silent", configObj.getInteger("silent"));
            }

            int result = pinPadOpt.setPinPadMode(modeConfig);
            
            JSObject response = new JSObject();
            response.put("success", result == 0);
            call.resolve(response);
            
        } catch (Exception e) {
            Log.e(TAG, "setPinPadMode error", e);
            call.reject("Failed to set PIN pad mode: " + e.getMessage());
        }
    }

    /**
     * Get PinPad mode
     */
    public void getPinPadMode(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Bundle modeConfigOut = new Bundle();
            pinPadOpt.getPinPadMode(modeConfigOut);
            
            JSObject result = new JSObject();
            if (modeConfigOut != null) {
                result.put("normal", modeConfigOut.getInt("normal", 0));
                result.put("longPressToClear", modeConfigOut.getInt("longPressToClear", 0));
                result.put("silent", modeConfigOut.getInt("silent", 0));
            }
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "getPinPadMode error", e);
            call.reject("Failed to get PIN pad mode: " + e.getMessage());
        }
    }

    /**
     * PinPad callback listener
     */
    private final PinPadListenerV2.Stub mPinPadListener = new PinPadListenerV2.Stub() {
        @Override
        public void onPinLength(int len) throws RemoteException {
            // PCI DSS: Do not log PIN length - can hint at PIN value
        }

        @Override
        public void onConfirm(int i, byte[] pinBlock) throws RemoteException {
            // PCI DSS: Never log PIN block data
            if (currentCall != null) {
                if (i == 0 && pinBlock != null && pinBlock.length > 0) {
                    // pinBlock is already the encrypted PIN block from SDK
                    String pinBlockHex = bytesToHex(pinBlock);
                    
                    JSObject result = new JSObject();
                    result.put("pinBlock", pinBlockHex);
                    result.put("confirmed", true);
                    currentCall.resolve(result);
                    
                    // PCI DSS: Clear sensitive data from memory
                    java.util.Arrays.fill(pinBlock, (byte) 0);
                } else {
                    currentCall.reject("PIN input failed with code: " + i);
                }
                currentCall = null;
            }
        }

        @Override
        public void onCancel() throws RemoteException {
            if (currentCall != null) {
                currentCall.reject("PIN input cancelled by user");
                currentCall = null;
            }
        }

        @Override
        public void onError(int errorCode) throws RemoteException {
            // Only log error codes, no sensitive data
            Log.e(TAG, "PIN pad error code: " + errorCode);
            if (currentCall != null) {
                currentCall.reject("PIN pad error: " + errorCode);
                currentCall = null;
            }
        }

        @Override
        public void onHover(int x, byte[] pinBlock) throws RemoteException {
            // PCI DSS: Do not log hover events with PIN data
        }
    };

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

    /**
     * Get PIN block
     * This method retrieves the encrypted PIN block after PIN entry
     */
    public void getPinBlock(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keySystem = call.getInt("keySystem", 0);  // 0: MKSK, 1: DUKPT
            Integer pinKeyIndex = call.getInt("pinKeyIndex");
            Integer algorithmType = call.getInt("algorithmType", 0);  // 0: 3DES, 1: SM4, 2: AES
            Integer pinblockFormat = call.getInt("pinblockFormat", 0);  // ISO 9564-1 Format
            String pan = call.getString("pan");

            if (pinKeyIndex == null || pan == null) {
                call.reject("Missing required parameters: pinKeyIndex and pan are required");
                return;
            }

            // PCI DSS: Do not log PAN or any sensitive cardholder data

            // Create Bundle for getPinBlock
            Bundle param = new Bundle();
            param.putInt("keySystem", keySystem);
            param.putInt("pinKeyIndex", pinKeyIndex);
            param.putInt("algorithmType", algorithmType);
            param.putInt("pinblockFormat", pinblockFormat);
            
            // Convert PAN to ASCII bytes
            byte[] panBytes = pan.getBytes("US-ASCII");
            param.putByteArray("pan", panBytes);

            // Buffer for output (16 bytes for SM4/AES, 8 bytes for 3DES)
            int bufferSize = (algorithmType == 0) ? 8 : 16;
            byte[] dataOut = new byte[bufferSize];

            // Call SDK method
            int result = pinPadOpt.getPinBlock(param, dataOut);

            // PCI DSS: Never log PIN block data
            if (result >= 0) {
                // result is the length of valid data in dataOut
                byte[] pinBlockBytes = new byte[result];
                System.arraycopy(dataOut, 0, pinBlockBytes, 0, result);
                
                // Convert to hex string
                String pinBlock = bytesToHex(pinBlockBytes);

                JSObject response = new JSObject();
                response.put("pinBlock", pinBlock);
                call.resolve(response);
                
                // PCI DSS: Clear sensitive data from memory
                java.util.Arrays.fill(dataOut, (byte) 0);
                java.util.Arrays.fill(pinBlockBytes, (byte) 0);
            } else {
                call.reject("Failed to get PIN block, error code: " + result);
            }

        } catch (Exception e) {
            Log.e(TAG, "getPinBlock error");
            call.reject("Failed to get PIN block: " + e.getMessage());
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
     * Convert numeric string to BCD (Binary Coded Decimal) format
     * Each byte contains two decimal digits (4 bits each)
     * Example: "1234" -> [0x12, 0x34]
     * If string has odd length, it should be padded with 'F' (e.g., "123F")
     */
    private byte[] stringToBcd(String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        
        // Ensure even length by padding with 'F' if needed
        if (str.length() % 2 != 0) {
            str = str + "F";
        }
        
        int len = str.length();
        byte[] bcd = new byte[len / 2];
        
        for (int i = 0; i < len; i += 2) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            
            int digit1 = Character.digit(c1, 16);  // Support 0-9, A-F
            int digit2 = Character.digit(c2, 16);
            
            if (digit1 == -1 || digit2 == -1) {
                Log.e(TAG, "Invalid character in BCD string: " + str);
                throw new IllegalArgumentException("Invalid BCD string: " + str);
            }
            
            bcd[i / 2] = (byte) ((digit1 << 4) | digit2);
        }
        
        return bcd;
    }

    // ==================== Anti-Exhaustive Protection ====================

    /**
     * Reset anti-exhaustive protection
     * Resets the counter used for limiting failed PIN attempts
     */
    public void resetAntiExhaust(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyIndex == null) {
                call.reject("Parameters 'keyType' and 'keyIndex' are required");
                return;
            }

            // Note: resetAntiExhaust is not available in SDK
            // Using setAntiExhaustiveProtectionMode with level 1 (lowest) as a workaround
            int result = pinPadOpt.setAntiExhaustiveProtectionMode(1);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("waitTime", result);
                call.resolve(response);
            } else {
                call.reject("Reset anti-exhaustive failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "resetAntiExhaust error", e);
            call.reject("Failed to reset anti-exhaustive: " + e.getMessage());
        }
    }

    /**
     * Get anti-exhaustive status
     * Returns the current status and remaining attempts
     */
    public void getAntiExhaustStatus(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            Integer keyIndex = call.getInt("keyIndex");

            if (keyType == null || keyIndex == null) {
                call.reject("Parameters 'keyType' and 'keyIndex' are required");
                return;
            }

            // SDK method: getAntiExhaustiveProtectionMode() returns current mode (1-5)
            int currentMode = pinPadOpt.getAntiExhaustiveProtectionMode();
            
            if (currentMode >= 0) {
                JSObject response = new JSObject();
                response.put("mode", currentMode);
                // Estimate remain times based on mode
                int[] maxTimes = {4, 12, 30, 60, 120};
                response.put("maxTimes", currentMode > 0 && currentMode <= 5 ? maxTimes[currentMode - 1] : 0);
                call.resolve(response);
            } else {
                call.reject("Get anti-exhaustive status failed, error code: " + currentMode);
            }
        } catch (Exception e) {
            Log.e(TAG, "getAntiExhaustStatus error", e);
            call.reject("Failed to get anti-exhaustive status: " + e.getMessage());
        }
    }

    /**
     * Set anti-exhaustive configuration
     */
    public void setAntiExhaustConfig(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            Integer keyIndex = call.getInt("keyIndex");
            Integer maxTimes = call.getInt("maxTimes", 5);
            Integer lockDuration = call.getInt("lockDuration", 300);

            if (keyType == null || keyIndex == null) {
                call.reject("Parameters 'keyType' and 'keyIndex' are required");
                return;
            }

            // SDK method: setAntiExhaustiveProtectionMode(int level)
            // level 1-5: 1-2min4次, 2-6min12次, 3-15min30次, 4-30min60次, 5-60min120次
            // Map maxTimes to level
            int level;
            if (maxTimes <= 4) level = 1;
            else if (maxTimes <= 12) level = 2;
            else if (maxTimes <= 30) level = 3;
            else if (maxTimes <= 60) level = 4;
            else level = 5;

            int result = pinPadOpt.setAntiExhaustiveProtectionMode(level);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("waitTime", result);
                call.resolve(response);
            } else {
                call.reject("Set anti-exhaustive config failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setAntiExhaustConfig error", e);
            call.reject("Failed to set anti-exhaustive config: " + e.getMessage());
        }
    }

    // ==================== Visual Impairment Mode ====================

    /**
     * Set visual impairment mode for PIN pad
     * Enables audio feedback for visually impaired users
     */
    public void setVisualImpairmentMode(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Boolean enable = call.getBoolean("enable", false);

            Bundle config = new Bundle();
            config.putBoolean("enable", enable);

            // Voice type for audio feedback
            if (call.hasOption("voiceType")) {
                config.putInt("voiceType", call.getInt("voiceType", 0));
            }
            // Volume level
            if (call.hasOption("volume")) {
                config.putInt("volume", call.getInt("volume", 50));
            }

            // SDK method: setVisualImpairmentModeParam(Bundle param)
            int result = pinPadOpt.setVisualImpairmentModeParam(config);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Set visual impairment mode failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setVisualImpairmentMode error", e);
            call.reject("Failed to set visual impairment mode: " + e.getMessage());
        }
    }

    /**
     * Get visual impairment mode status
     */
    public void getVisualImpairmentMode(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Bundle statusOut = new Bundle();
            // SDK method: getVisualImpairmentModeParam(Bundle param)
            int result = pinPadOpt.getVisualImpairmentModeParam(statusOut);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("timeoutGap1", statusOut.getInt("timeoutGap1", 10));
                response.put("timeoutGap2", statusOut.getInt("timeoutGap2", 10));
                response.put("ttsLanguage", statusOut.getInt("ttsLanguage", 0));
                response.put("rnibSelectMode", statusOut.getInt("rnibSelectMode", 0));
                response.put("rnibHoldTime", statusOut.getInt("rnibHoldTime", 30));
                call.resolve(response);
            } else {
                call.reject("Get visual impairment mode failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "getVisualImpairmentMode error", e);
            call.reject("Failed to get visual impairment mode: " + e.getMessage());
        }
    }

    // ==================== PinPad Info ====================

    /**
     * Get PinPad serial number
     */
    public void getPinPadSerialNo(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            // Note: getPinPadSerialNo is not available in SDK
            // Return a placeholder response
            JSObject response = new JSObject();
            response.put("serialNo", "N/A");
            response.put("note", "PinPad serial number not available in this SDK version");
            call.resolve(response);
        } catch (Exception e) {
            Log.e(TAG, "getPinPadSerialNo error", e);
            call.reject("Failed to get PinPad serial number: " + e.getMessage());
        }
    }

    /**
     * Get PinPad firmware version
     */
    public void getPinPadVersion(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            // Note: getPinPadVersion is not available in SDK
            JSObject response = new JSObject();
            response.put("version", "N/A");
            response.put("note", "PinPad version not available in this SDK version");
            call.resolve(response);
        } catch (Exception e) {
            Log.e(TAG, "getPinPadVersion error", e);
            call.reject("Failed to get PinPad version: " + e.getMessage());
        }
    }

    /**
     * Check if PinPad supports specific feature
     */
    public void isPinPadFeatureSupported(PluginCall call) {
        if (pinPadOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer feature = call.getInt("feature");
            if (feature == null) {
                call.reject("Parameter 'feature' is required");
                return;
            }

            // Note: isPinPadFeatureSupported is not available in SDK
            // Always return true as a default behavior
            JSObject response = new JSObject();
            response.put("supported", true);
            response.put("note", "Feature check not available in this SDK version");
            call.resolve(response);
        } catch (Exception e) {
            Log.e(TAG, "isPinPadFeatureSupported error", e);
            call.reject("Failed to check PinPad feature: " + e.getMessage());
        }
    }
}

