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
            
            // PAN must be converted to byte array (BCD format)
            String panStr = configObj.getString("pan");
            Log.d(TAG, "=== PAN CONVERSION DEBUG ===");
            Log.d(TAG, "Received PAN string: " + panStr);
            
            if (panStr != null && !panStr.isEmpty()) {
                Log.d(TAG, "PAN length: " + panStr.length());
                
                // Ensure PAN is exactly 16 digits (pad with 0s on the left if needed)
                // Most PIN pads expect exactly 16 digits (8 bytes in BCD)
                if (panStr.length() < 16) {
                    panStr = String.format("%16s", panStr).replace(' ', '0');
                    Log.d(TAG, "Padded PAN to 16 digits: " + panStr);
                } else if (panStr.length() > 19) {
                    panStr = panStr.substring(0, 19);
                    Log.d(TAG, "Truncated PAN to 19 digits: " + panStr);
                }
                
                // Ensure even length for BCD conversion
                if (panStr.length() % 2 != 0) {
                    panStr = panStr + "F";
                    Log.d(TAG, "Padded PAN with F for BCD: " + panStr);
                }
                
                try {
                    // Convert PAN string to BCD (Binary Coded Decimal) format
                    byte[] panBytes = stringToBcd(panStr);
                    Log.d(TAG, "PAN in BCD (hex): " + bytesToHex(panBytes));
                    Log.d(TAG, "PAN BCD length: " + panBytes.length + " bytes");
                    
                    pinPadConfig.setPan(panBytes);
                    Log.d(TAG, "PAN successfully set in config");
                } catch (Exception e) {
                    Log.e(TAG, "Failed to convert PAN to BCD", e);
                    call.reject("Failed to convert PAN: " + e.getMessage());
                    return;
                }
            } else {
                Log.e(TAG, "PAN is null or empty!");
                call.reject("PAN (card number) is required");
                return;
            }
            Log.d(TAG, "=== END PAN DEBUG ===");
            
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
            
            Log.d(TAG, "PinPad Config:");
            Log.d(TAG, "  pinKeyIndex: " + pinKeyIndex);
            Log.d(TAG, "  maxInput: " + maxInput);
            Log.d(TAG, "  minInput: " + minInput);
            Log.d(TAG, "  keySystem: " + keySystem);
            Log.d(TAG, "  timeout: " + timeout);
            Log.d(TAG, "  algorithmType: " + algorithmType);
            
            // Note: setPinBlockFormat and setEncryptWay may not be available in all SDK versions
            // These are optional parameters that can be set if needed

            currentCall = call;

            Log.d(TAG, "Calling pinPadOpt.initPinPad()...");
            // Call SDK method
            pinPadOpt.initPinPad(pinPadConfig, mPinPadListener);
            Log.d(TAG, "initPinPad() called successfully");
            
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
            Log.d(TAG, "PIN length: " + len);
            // Optionally notify the UI about PIN length
        }

        @Override
        public void onConfirm(int i, byte[] pinBlock) throws RemoteException {
            Log.d(TAG, "=== PIN CONFIRM CALLBACK ===");
            Log.d(TAG, "Result code: " + i);
            
            if (currentCall != null) {
                if (i == 0 && pinBlock != null && pinBlock.length > 0) {
                    // pinBlock is already the encrypted PIN block from SDK
                    String pinBlockHex = bytesToHex(pinBlock);
                    
                    Log.d(TAG, "PIN Block length: " + pinBlock.length + " bytes");
                    Log.d(TAG, "PIN Block (hex): " + pinBlockHex);
                    Log.d(TAG, "=== END PIN CONFIRM CALLBACK ===");
                    
                    JSObject result = new JSObject();
                    result.put("pinBlock", pinBlockHex);  // Return as pinBlock, not keySequence
                    result.put("confirmed", true);
                    currentCall.resolve(result);
                } else {
                    Log.e(TAG, "PIN input failed or no PIN block returned");
                    Log.d(TAG, "=== END PIN CONFIRM CALLBACK ===");
                    currentCall.reject("PIN input failed with code: " + i);
                }
                currentCall = null;
            }
        }

        @Override
        public void onCancel() throws RemoteException {
            Log.d(TAG, "PIN input cancelled");
            if (currentCall != null) {
                currentCall.reject("PIN input cancelled by user");
                currentCall = null;
            }
        }

        @Override
        public void onError(int errorCode) throws RemoteException {
            Log.e(TAG, "PIN pad error: " + errorCode);
            if (currentCall != null) {
                currentCall.reject("PIN pad error: " + errorCode);
                currentCall = null;
            }
        }

        @Override
        public void onHover(int x, byte[] pinBlock) throws RemoteException {
            Log.d(TAG, "PIN hover: x=" + x);
            // This is called when user hovers over a key (for some PIN pad types)
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

            Log.d(TAG, "=== GET PIN BLOCK DEBUG ===");
            Log.d(TAG, "Key System: " + keySystem);
            Log.d(TAG, "PIN Key Index: " + pinKeyIndex);
            Log.d(TAG, "Algorithm Type: " + algorithmType);
            Log.d(TAG, "PIN Block Format: " + pinblockFormat);
            Log.d(TAG, "PAN: " + pan.substring(0, Math.min(6, pan.length())) + "***" + 
                       (pan.length() > 4 ? pan.substring(pan.length() - 4) : ""));

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

            Log.d(TAG, "getPinBlock result: " + result);

            if (result >= 0) {
                // result is the length of valid data in dataOut
                byte[] pinBlockBytes = new byte[result];
                System.arraycopy(dataOut, 0, pinBlockBytes, 0, result);
                
                // Convert to hex string
                String pinBlock = bytesToHex(pinBlockBytes);
                
                Log.d(TAG, "PIN Block length: " + result + " bytes");
                Log.d(TAG, "PIN Block (hex): " + pinBlock);
                Log.d(TAG, "=== END GET PIN BLOCK DEBUG ===");

                JSObject response = new JSObject();
                response.put("pinBlock", pinBlock);
                call.resolve(response);
            } else {
                Log.e(TAG, "Failed to get PIN block, error code: " + result);
                Log.d(TAG, "=== END GET PIN BLOCK DEBUG ===");
                call.reject("Failed to get PIN block, error code: " + result);
            }

        } catch (Exception e) {
            Log.e(TAG, "getPinBlock error", e);
            Log.d(TAG, "=== END GET PIN BLOCK DEBUG ===");
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
}

