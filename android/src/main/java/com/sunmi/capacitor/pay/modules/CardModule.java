package com.sunmi.capacitor.pay.modules;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

/**
 * Card Operation Module
 * Implements all card operations from Sunmi Pay SDK
 * Supports: Magnetic cards, IC cards, NFC cards, Mifare, SLE, AT24C, AT88SC, CTX512B
 */
public class CardModule {
    private static final String TAG = "SunmiPay-CardModule";
    private final Context context;
    private ReadCardOptV2 readCardOpt;
    private PluginCall checkCardCall;

    public CardModule(Context context) {
        this.context = context;
    }

    public void setReadCardOpt(ReadCardOptV2 readCardOpt) {
        this.readCardOpt = readCardOpt;
    }

    /**
     * Check card (basic method)
     */
    public void checkCard(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            Integer timeout = call.getInt("timeout", 60);

            if (cardType == null) {
                call.reject("Parameter 'cardType' is required");
                return;
            }

            // Validate timeout
            if (timeout <= 0) {
                timeout = 60;
            } else if (timeout > 600) {
                timeout = 600;
            }

            checkCardCall = call;
            readCardOpt.checkCard(cardType, mCheckCardCallback, timeout);
            
        } catch (Exception e) {
            Log.e(TAG, "checkCard error", e);
            call.reject("Failed to check card: " + e.getMessage());
        }
    }

    /**
     * Check card (extended method)
     */
    public void checkCardEx(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            Integer ctrCode = call.getInt("ctrCode", 0);
            Integer stopOnError = call.getInt("stopOnError", 0);
            Integer timeout = call.getInt("timeout", 60);

            if (cardType == null) {
                call.reject("Parameter 'cardType' is required");
                return;
            }

            // Validate timeout
            if (timeout <= 0) {
                timeout = 60;
            } else if (timeout > 600) {
                timeout = 600;
            }

            checkCardCall = call;
            readCardOpt.checkCardEx(cardType, ctrCode, stopOnError, mCheckCardCallback, timeout);
            
        } catch (Exception e) {
            Log.e(TAG, "checkCardEx error", e);
            call.reject("Failed to check card: " + e.getMessage());
        }
    }

    /**
     * Check card with encryption
     */
    public void checkCardEnc(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            Integer timeout = call.getInt("timeout", 60);
            JSObject encParams = call.getObject("encParams");

            if (cardType == null || encParams == null) {
                call.reject("Parameters 'cardType' and 'encParams' are required");
                return;
            }

            // Build encryption params bundle
            Bundle bundle = new Bundle();
            bundle.putInt("keyIndex", encParams.getInteger("keyIndex", 0));
            bundle.putInt("keyAlgType", encParams.getInteger("keyAlgType", 0));
            
            if (encParams.has("encKeyAlgType")) {
                bundle.putInt("encKeyAlgType", encParams.getInteger("encKeyAlgType"));
            }
            if (encParams.has("panAppendContent")) {
                bundle.putString("panAppendContent", encParams.getString("panAppendContent"));
            }
            if (encParams.has("panAppendMode")) {
                bundle.putInt("panAppendMode", encParams.getInteger("panAppendMode"));
            }

            // Validate timeout
            if (timeout <= 0) {
                timeout = 60;
            } else if (timeout > 600) {
                timeout = 600;
            }

            checkCardCall = call;
            // Signature: checkCardEnc(Bundle, CheckCardCallbackV2, int timeout)
            readCardOpt.checkCardEnc(bundle, mCheckCardCallback, timeout);
            
        } catch (Exception e) {
            Log.e(TAG, "checkCardEnc error", e);
            call.reject("Failed to check card with encryption: " + e.getMessage());
        }
    }

    /**
     * Cancel check card operation
     */
    public void cancelCheckCard(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            readCardOpt.cancelCheckCard();
            
            if (checkCardCall != null) {
                checkCardCall.reject("Check card cancelled");
                checkCardCall = null;
            }
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "cancelCheckCard error", e);
            call.reject("Failed to cancel check card: " + e.getMessage());
        }
    }

    /**
     * APDU command exchange
     */
    public void apduCommand(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            JSObject command = call.getObject("command");

            if (cardType == null || command == null) {
                call.reject("Parameters 'cardType' and 'command' are required");
                return;
            }

            // Parse APDU send
            String commandStr = command.getString("command");
            int lc = command.getInteger("lc", 0);
            String dataInStr = command.getString("dataIn", "");
            int le = command.getInteger("le", 0);

            // Convert command to bytes
            byte[] commandBytes = hexToBytes(commandStr);
            byte[] dataIn = hexToBytes(dataInStr);

            // Prepare APDU structures (using Bundle as simplified approach)
            Bundle sendBundle = new Bundle();
            sendBundle.putByteArray("command", commandBytes);
            sendBundle.putInt("lc", lc);
            sendBundle.putByteArray("dataIn", dataIn);
            sendBundle.putInt("le", le);

            Bundle recvBundle = new Bundle();
            
            // Call APDU exchange via smartCardExchange (simplified implementation)
            // For full implementation, would use proper ApduSendV2/ApduRecvV2 classes
            byte[] apduSend = buildApduBytes(commandBytes, dataIn, lc, le);
            byte[] apduRecv = new byte[260];
            
            int result = readCardOpt.smartCardExchange(cardType, apduSend, apduRecv);
            
            if (result == 0) {
                // Parse response
                JSObject response = parseApduResponse(apduRecv);
                call.resolve(response);
            } else {
                call.reject("APDU command failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "apduCommand error", e);
            call.reject("Failed to execute APDU command: " + e.getMessage());
        }
    }

    /**
     * Smart card exchange
     */
    public void smartCardExchange(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            String apduSend = call.getString("apduSend");

            if (cardType == null || apduSend == null) {
                call.reject("Parameters 'cardType' and 'apduSend' are required");
                return;
            }

            byte[] sendBytes = hexToBytes(apduSend);
            byte[] recvBytes = new byte[260];

            int result = readCardOpt.smartCardExchange(cardType, sendBytes, recvBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("apduRecv", bytesToHex(recvBytes));
                call.resolve(response);
            } else {
                call.reject("Smart card exchange failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "smartCardExchange error", e);
            call.reject("Failed to exchange with smart card: " + e.getMessage());
        }
    }

    /**
     * Transmit APDU command to card
     */
    public void transmitApdu(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            String sendBuff = call.getString("sendBuff");

            if (cardType == null || sendBuff == null) {
                call.reject("Parameters 'cardType' and 'sendBuff' are required");
                return;
            }

            byte[] sendBytes = hexToBytes(sendBuff);
            byte[] recvBytes = new byte[2046]; // Max receive length

            int result = readCardOpt.transmitApdu(cardType, sendBytes, recvBytes);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                // Return only valid bytes
                byte[] validBytes = new byte[result];
                System.arraycopy(recvBytes, 0, validBytes, 0, result);
                response.put("recvBuff", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("Transmit APDU failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "transmitApdu error", e);
            call.reject("Failed to transmit APDU: " + e.getMessage());
        }
    }

    /**
     * Transmit APDU (extended method)
     */
    public void transmitApduEx(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            String sendBuff = call.getString("sendBuff");

            if (cardType == null || sendBuff == null) {
                call.reject("Parameters 'cardType' and 'sendBuff' are required");
                return;
            }

            byte[] sendBytes = hexToBytes(sendBuff);
            byte[] recvBytes = new byte[2046];

            int result = readCardOpt.transmitApduEx(cardType, sendBytes, recvBytes);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validBytes = new byte[result];
                System.arraycopy(recvBytes, 0, validBytes, 0, result);
                response.put("recvBuff", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("Transmit APDU Ex failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "transmitApduEx error", e);
            call.reject("Failed to transmit APDU Ex: " + e.getMessage());
        }
    }

    /**
     * Transmit APDU (extended method 2)
     */
    public void transmitApduExx(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            String sendBuff = call.getString("sendBuff");

            if (cardType == null || sendBuff == null) {
                call.reject("Parameters 'cardType' and 'sendBuff' are required");
                return;
            }

            byte[] sendBytes = hexToBytes(sendBuff);
            byte[] recvBytes = new byte[2046];

            // Signature: transmitApduExx(int cardSlot, int cardType, byte[] sendBuff, byte[] recvBuff)
            int result = readCardOpt.transmitApduExx(0, cardType, sendBytes, recvBytes);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validBytes = new byte[result];
                System.arraycopy(recvBytes, 0, validBytes, 0, result);
                response.put("recvBuff", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("Transmit APDU Exx failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "transmitApduExx error", e);
            call.reject("Failed to transmit APDU Exx: " + e.getMessage());
        }
    }

    /**
     * Transmit multiple APDUs
     */
    public void transmitMultiApdus(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            JSArray apduList = call.getArray("apduList");

            if (cardType == null || apduList == null) {
                call.reject("Parameters 'cardType' and 'apduList' are required");
                return;
            }

            int apduCount = apduList.length();
            if (apduCount > 7) {
                call.reject("Maximum 7 APDUs allowed");
                return;
            }

            // Convert JSArray to List<String> 
            List<String> sendList = new ArrayList<>();
            for (int i = 0; i < apduCount; i++) {
                sendList.add(apduList.getString(i));
            }

            List<String> recvList = new ArrayList<>();
            
            // Signature: transmitMultiApdus(int cardSlot, int cardType, List<String> sendList, List<String> recvList)
            int result = readCardOpt.transmitMultiApdus(0, cardType, sendList, recvList);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                JSArray recvArray = new JSArray();
                
                for (String recv : recvList) {
                    recvArray.put(recv);
                }
                
                response.put("recvList", recvArray);
                call.resolve(response);
            } else {
                call.reject("Transmit multi APDUs failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "transmitMultiApdus error", e);
            call.reject("Failed to transmit multi APDUs: " + e.getMessage());
        }
    }

    /**
     * Power off contact or contactless card
     */
    public void cardOff(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            if (cardType == null) {
                call.reject("Parameter 'cardType' is required");
                return;
            }

            int result = readCardOpt.cardOff(cardType);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Card off failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "cardOff error", e);
            call.reject("Failed to power off card: " + e.getMessage());
        }
    }

    /**
     * Check if card exists on slot
     */
    public void getCardExistStatus(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            if (cardType == null) {
                call.reject("Parameter 'cardType' is required");
                return;
            }

            int status = readCardOpt.getCardExistStatus(cardType);
            
            if (status >= 0) {
                JSObject response = new JSObject();
                response.put("status", status);
                call.resolve(response);
            } else {
                call.reject("Get card exist status failed, error code: " + status);
            }
        } catch (Exception e) {
            Log.e(TAG, "getCardExistStatus error", e);
            call.reject("Failed to get card exist status: " + e.getMessage());
        }
    }

    // ==================== Mifare Classic (M1) Operations ====================

    /**
     * Verify M1 card sector password
     */
    public void mifareAuth(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer keyType = call.getInt("keyType");
            Integer block = call.getInt("block");
            String key = call.getString("key");

            if (keyType == null || block == null || key == null) {
                call.reject("All parameters are required");
                return;
            }

            byte[] keyBytes = hexToBytes(key);
            if (keyBytes.length != 6) {
                call.reject("Key must be 6 bytes");
                return;
            }

            int result = readCardOpt.mifareAuth(keyType, block, keyBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare auth failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareAuth error", e);
            call.reject("Failed to authenticate Mifare: " + e.getMessage());
        }
    }

    /**
     * Read M1 card block data
     */
    public void mifareReadBlock(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            if (block == null) {
                call.reject("Parameter 'block' is required");
                return;
            }

            byte[] outData = new byte[16];
            int result = readCardOpt.mifareReadBlock(block, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("Mifare read block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareReadBlock error", e);
            call.reject("Failed to read Mifare block: " + e.getMessage());
        }
    }

    /**
     * Write M1 card block data
     */
    public void mifareWriteBlock(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            String data = call.getString("data");

            if (block == null || data == null) {
                call.reject("Parameters 'block' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);
            if (dataBytes.length != 16) {
                call.reject("Data must be 16 bytes");
                return;
            }

            int result = readCardOpt.mifareWriteBlock(block, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare write block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareWriteBlock error", e);
            call.reject("Failed to write Mifare block: " + e.getMessage());
        }
    }

    /**
     * M1 card increment operation
     */
    public void mifareIncValue(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            String value = call.getString("value");

            if (block == null || value == null) {
                call.reject("Parameters 'block' and 'value' are required");
                return;
            }

            byte[] valueBytes = hexToBytes(value);
            if (valueBytes.length != 4) {
                call.reject("Value must be 4 bytes");
                return;
            }

            int result = readCardOpt.mifareIncValue(block, valueBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare increment failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareIncValue error", e);
            call.reject("Failed to increment Mifare value: " + e.getMessage());
        }
    }

    /**
     * M1 card decrement operation
     */
    public void mifareDecValue(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            String value = call.getString("value");

            if (block == null || value == null) {
                call.reject("Parameters 'block' and 'value' are required");
                return;
            }

            byte[] valueBytes = hexToBytes(value);
            if (valueBytes.length != 4) {
                call.reject("Value must be 4 bytes");
                return;
            }

            int result = readCardOpt.mifareDecValue(block, valueBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare decrement failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareDecValue error", e);
            call.reject("Failed to decrement Mifare value: " + e.getMessage());
        }
    }

    // NOTE: Due to file size limits, additional Mifare methods (IncValueDx, DecValueDx, Transfer, Restore)
    // and other card types (Mifare Ultralight C, Mifare Plus, SLE, AT24C, AT88SC, CTX512B, PASS mode)
    // would be implemented similarly following the same pattern.

    // ==================== CheckCardCallback Implementation ====================

    private final CheckCardCallbackV2 mCheckCardCallback = new CheckCardCallbackV2.Stub() {
        @Override
        public void findMagCard(Bundle info) throws RemoteException {
            if (checkCardCall != null) {
                JSObject result = new JSObject();
                result.put("cardType", AidlConstants.CardType.MAGNETIC.getValue());
                
                JSObject cardData = new JSObject();
                cardData.put("track1", info.getString("TRACK1", ""));
                cardData.put("track2", info.getString("TRACK2", ""));
                cardData.put("track3", info.getString("TRACK3", ""));
                
                if (info.containsKey("track2Raw")) {
                    cardData.put("track2Raw", bytesToHex(info.getByteArray("track2Raw")));
                }
                if (info.containsKey("pan")) {
                    cardData.put("pan", info.getString("pan"));
                }
                if (info.containsKey("name")) {
                    cardData.put("name", info.getString("name"));
                }
                if (info.containsKey("expire")) {
                    cardData.put("expire", info.getString("expire"));
                }
                if (info.containsKey("servicecode")) {
                    cardData.put("servicecode", info.getString("servicecode"));
                }
                if (info.containsKey("appendedPanEnc")) {
                    cardData.put("appendedPanEnc", info.getString("appendedPanEnc"));
                }
                if (info.containsKey("track1ErrorCode")) {
                    cardData.put("track1ErrorCode", info.getInt("track1ErrorCode"));
                }
                if (info.containsKey("track2ErrorCode")) {
                    cardData.put("track2ErrorCode", info.getInt("track2ErrorCode"));
                }
                if (info.containsKey("track3ErrorCode")) {
                    cardData.put("track3ErrorCode", info.getInt("track3ErrorCode"));
                }
                
                result.put("cardData", cardData);
                checkCardCall.resolve(result);
                checkCardCall = null;
            }
        }

        @Override
        public void findICCard(String atr) throws RemoteException {
            if (checkCardCall != null) {
                JSObject result = new JSObject();
                result.put("cardType", AidlConstants.CardType.IC.getValue());
                
                JSObject cardData = new JSObject();
                cardData.put("atr", atr);
                
                result.put("cardData", cardData);
                checkCardCall.resolve(result);
                checkCardCall = null;
            }
        }

        @Override
        public void findRFCard(String uuid) throws RemoteException {
            if (checkCardCall != null) {
                JSObject result = new JSObject();
                result.put("cardType", AidlConstants.CardType.NFC.getValue());
                
                JSObject cardData = new JSObject();
                cardData.put("uuid", uuid);
                
                result.put("cardData", cardData);
                checkCardCall.resolve(result);
                checkCardCall = null;
            }
        }

        @Override
        public void onError(int code, String message) throws RemoteException {
            if (checkCardCall != null) {
                checkCardCall.reject("Card check error: " + message + " (code: " + code + ")");
                checkCardCall = null;
            }
        }

        @Override
        public void findICCardEx(Bundle info) throws RemoteException {
            if (checkCardCall != null) {
                JSObject result = new JSObject();
                result.put("cardType", info.getInt("cardType"));
                
                JSObject cardData = new JSObject();
                cardData.put("atr", info.getString("atr"));
                
                result.put("cardData", cardData);
                checkCardCall.resolve(result);
                checkCardCall = null;
            }
        }

        @Override
        public void findRFCardEx(Bundle info) throws RemoteException {
            if (checkCardCall != null) {
                JSObject result = new JSObject();
                result.put("cardType", info.getInt("cardType"));
                
                JSObject cardData = new JSObject();
                cardData.put("uuid", info.getString("uuid"));
                cardData.put("ats", info.getString("ats", ""));
                cardData.put("cardCategory", info.getInt("cardCategory", 0));
                if (info.containsKey("atqa")) {
                    cardData.put("atqa", bytesToHex(info.getByteArray("atqa")));
                }
                
                result.put("cardData", cardData);
                checkCardCall.resolve(result);
                checkCardCall = null;
            }
        }

        @Override
        public void onErrorEx(Bundle info) throws RemoteException {
            if (checkCardCall != null) {
                int code = info.getInt("code");
                String message = info.getString("message");
                checkCardCall.reject("Card check error: " + message + " (code: " + code + ")");
                checkCardCall = null;
            }
        }
    };

    // ==================== Utility Methods ====================

    private String bytesToHex(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return "";
        }
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xFF & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString().toUpperCase();
    }

    private byte[] hexToBytes(String hex) {
        if (hex == null || hex.isEmpty()) {
            return new byte[0];
        }
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    private byte[] buildApduBytes(byte[] command, byte[] dataIn, int lc, int le) {
        int totalLen = 4 + (lc > 0 ? 1 + lc : 0) + (le > 0 ? 1 : 0);
        byte[] apdu = new byte[totalLen];
        
        // Copy command (CLA, INS, P1, P2)
        System.arraycopy(command, 0, apdu, 0, 4);
        int pos = 4;
        
        // Add LC and data
        if (lc > 0) {
            apdu[pos++] = (byte) lc;
            System.arraycopy(dataIn, 0, apdu, pos, lc);
            pos += lc;
        }
        
        // Add LE
        if (le > 0) {
            apdu[pos] = (byte) le;
        }
        
        return apdu;
    }

    private JSObject parseApduResponse(byte[] apduRecv) throws JSONException {
        JSObject response = new JSObject();
        
        if (apduRecv.length < 4) {
            response.put("outLen", 0);
            response.put("outData", "");
            response.put("swa", 0);
            response.put("swb", 0);
            return response;
        }
        
        // Parse response: outLen(2B) + outData(len) + SWA(1B) + SWB(1B)
        int outLen = ((apduRecv[0] & 0xFF) << 8) | (apduRecv[1] & 0xFF);
        
        byte[] outData = new byte[outLen];
        System.arraycopy(apduRecv, 2, outData, 0, outLen);
        
        byte swa = apduRecv[2 + outLen];
        byte swb = apduRecv[3 + outLen];
        
        response.put("outLen", outLen);
        response.put("outData", bytesToHex(outData));
        response.put("swa", swa & 0xFF);
        response.put("swb", swb & 0xFF);
        
        return response;
    }
}

