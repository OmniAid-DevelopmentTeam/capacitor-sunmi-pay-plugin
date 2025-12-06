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

    /**
     * M1 card increment with auto restore
     */
    public void mifareIncValueDx(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer srcBlock = call.getInt("srcBlock");
            Integer dstBlock = call.getInt("dstBlock");
            String value = call.getString("value");

            if (srcBlock == null || dstBlock == null || value == null) {
                call.reject("Parameters 'srcBlock', 'dstBlock' and 'value' are required");
                return;
            }

            byte[] valueBytes = hexToBytes(value);
            if (valueBytes.length != 4) {
                call.reject("Value must be 4 bytes");
                return;
            }

            int result = readCardOpt.mifareIncValueDx(srcBlock, dstBlock, valueBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare increment Dx failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareIncValueDx error", e);
            call.reject("Failed to increment Mifare value Dx: " + e.getMessage());
        }
    }

    /**
     * M1 card decrement with auto restore
     */
    public void mifareDecValueDx(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer srcBlock = call.getInt("srcBlock");
            Integer dstBlock = call.getInt("dstBlock");
            String value = call.getString("value");

            if (srcBlock == null || dstBlock == null || value == null) {
                call.reject("Parameters 'srcBlock', 'dstBlock' and 'value' are required");
                return;
            }

            byte[] valueBytes = hexToBytes(value);
            if (valueBytes.length != 4) {
                call.reject("Value must be 4 bytes");
                return;
            }

            int result = readCardOpt.mifareDecValueDx(srcBlock, dstBlock, valueBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare decrement Dx failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareDecValueDx error", e);
            call.reject("Failed to decrement Mifare value Dx: " + e.getMessage());
        }
    }

    /**
     * M1 card transfer operation
     */
    public void mifareTransfer(PluginCall call) {
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

            int result = readCardOpt.mifareTransfer(block);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare transfer failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareTransfer error", e);
            call.reject("Failed to transfer Mifare: " + e.getMessage());
        }
    }

    /**
     * M1 card restore operation
     */
    public void mifareRestore(PluginCall call) {
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

            int result = readCardOpt.mifareRestore(block);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare restore failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifareRestore error", e);
            call.reject("Failed to restore Mifare: " + e.getMessage());
        }
    }

    // ==================== Mifare Ultralight C Operations ====================

    /**
     * Ultralight C 3DES Authentication
     */
    public void ultralightCAuth(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String key = call.getString("key");
            if (key == null) {
                call.reject("Parameter 'key' is required");
                return;
            }

            byte[] keyBytes = hexToBytes(key);
            if (keyBytes.length != 16) {
                call.reject("Key must be 16 bytes");
                return;
            }

            int result = readCardOpt.ultralightCAuth(keyBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Ultralight C auth failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ultralightCAuth error", e);
            call.reject("Failed to authenticate Ultralight C: " + e.getMessage());
        }
    }

    /**
     * Ultralight C read page
     */
    public void ultralightReadPage(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer page = call.getInt("page");
            if (page == null) {
                call.reject("Parameter 'page' is required");
                return;
            }

            byte[] outData = new byte[16]; // 4 pages * 4 bytes
            int result = readCardOpt.ultralightReadPage(page, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("Ultralight read page failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ultralightReadPage error", e);
            call.reject("Failed to read Ultralight page: " + e.getMessage());
        }
    }

    /**
     * Ultralight C write page
     */
    public void ultralightWritePage(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer page = call.getInt("page");
            String data = call.getString("data");

            if (page == null || data == null) {
                call.reject("Parameters 'page' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);
            if (dataBytes.length != 4) {
                call.reject("Data must be 4 bytes");
                return;
            }

            int result = readCardOpt.ultralightWritePage(page, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Ultralight write page failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ultralightWritePage error", e);
            call.reject("Failed to write Ultralight page: " + e.getMessage());
        }
    }

    // ==================== Mifare Plus Operations ====================

    /**
     * Mifare Plus SL1 Authentication
     */
    public void mifarePlusAuth(PluginCall call) {
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

            int result = readCardOpt.mifarePlusAuth(keyType, block, keyBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare Plus auth failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifarePlusAuth error", e);
            call.reject("Failed to authenticate Mifare Plus: " + e.getMessage());
        }
    }

    /**
     * Mifare Plus SL3 AES Authentication
     */
    public void mifarePlusAESAuth(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            String key = call.getString("key");

            if (block == null || key == null) {
                call.reject("Parameters 'block' and 'key' are required");
                return;
            }

            byte[] keyBytes = hexToBytes(key);
            if (keyBytes.length != 16) {
                call.reject("Key must be 16 bytes");
                return;
            }

            int result = readCardOpt.mifarePlusAESAuth(block, keyBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare Plus AES auth failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifarePlusAESAuth error", e);
            call.reject("Failed to AES authenticate Mifare Plus: " + e.getMessage());
        }
    }

    /**
     * Mifare Plus read encrypted block
     */
    public void mifarePlusReadEncBlock(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            Integer blockNum = call.getInt("blockNum", 1);
            Integer readType = call.getInt("readType", 0);

            if (block == null) {
                call.reject("Parameter 'block' is required");
                return;
            }

            byte[] outData = new byte[16 * blockNum]; // 16 bytes per block
            int result = readCardOpt.mifarePlusReadEncBlock(block, blockNum, readType, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("Mifare Plus read encrypted block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifarePlusReadEncBlock error", e);
            call.reject("Failed to read Mifare Plus encrypted block: " + e.getMessage());
        }
    }

    /**
     * Mifare Plus write encrypted block
     */
    public void mifarePlusWriteEncBlock(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            Integer blockNum = call.getInt("blockNum", 1);
            String data = call.getString("data");

            if (block == null || data == null) {
                call.reject("Parameters 'block' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);

            int result = readCardOpt.mifarePlusWriteEncBlock(block, blockNum, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare Plus write encrypted block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifarePlusWriteEncBlock error", e);
            call.reject("Failed to write Mifare Plus encrypted block: " + e.getMessage());
        }
    }

    /**
     * Mifare Plus encrypted value increment
     */
    public void mifarePlusEncIncValue(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer srcBlock = call.getInt("srcBlock");
            Integer dstBlock = call.getInt("dstBlock");
            String value = call.getString("value");

            if (srcBlock == null || dstBlock == null || value == null) {
                call.reject("Parameters 'srcBlock', 'dstBlock' and 'value' are required");
                return;
            }

            byte[] valueBytes = hexToBytes(value);
            if (valueBytes.length != 4) {
                call.reject("Value must be 4 bytes");
                return;
            }

            int result = readCardOpt.mifarePlusEncIncValue(srcBlock, dstBlock, valueBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare Plus encrypted increment failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifarePlusEncIncValue error", e);
            call.reject("Failed to increment Mifare Plus encrypted value: " + e.getMessage());
        }
    }

    /**
     * Mifare Plus encrypted value decrement
     */
    public void mifarePlusEncDecValue(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer srcBlock = call.getInt("srcBlock");
            Integer dstBlock = call.getInt("dstBlock");
            String value = call.getString("value");

            if (srcBlock == null || dstBlock == null || value == null) {
                call.reject("Parameters 'srcBlock', 'dstBlock' and 'value' are required");
                return;
            }

            byte[] valueBytes = hexToBytes(value);
            if (valueBytes.length != 4) {
                call.reject("Value must be 4 bytes");
                return;
            }

            int result = readCardOpt.mifarePlusEncDecValue(srcBlock, dstBlock, valueBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Mifare Plus encrypted decrement failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "mifarePlusEncDecValue error", e);
            call.reject("Failed to decrement Mifare Plus encrypted value: " + e.getMessage());
        }
    }

    // ==================== SLE Card Operations ====================

    /**
     * SLE4428/SLE4442 card password verification
     */
    public void sleVerifyPwd(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            String pwd = call.getString("pwd");

            if (cardType == null || pwd == null) {
                call.reject("Parameters 'cardType' and 'pwd' are required");
                return;
            }

            byte[] pwdBytes = hexToBytes(pwd);

            int result = readCardOpt.sleVerifyPwd(cardType, pwdBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("SLE verify password failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sleVerifyPwd error", e);
            call.reject("Failed to verify SLE password: " + e.getMessage());
        }
    }

    /**
     * SLE4428/SLE4442 card change password
     */
    public void sleChangePwd(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            String newPwd = call.getString("newPwd");

            if (cardType == null || newPwd == null) {
                call.reject("Parameters 'cardType' and 'newPwd' are required");
                return;
            }

            byte[] newPwdBytes = hexToBytes(newPwd);

            int result = readCardOpt.sleChangePwd(cardType, newPwdBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("SLE change password failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sleChangePwd error", e);
            call.reject("Failed to change SLE password: " + e.getMessage());
        }
    }

    /**
     * SLE4428/SLE4442 card read data
     */
    public void sleReadData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            Integer addr = call.getInt("addr");
            Integer len = call.getInt("len");

            if (cardType == null || addr == null || len == null) {
                call.reject("Parameters 'cardType', 'addr' and 'len' are required");
                return;
            }

            byte[] outData = new byte[len];
            int result = readCardOpt.sleReadData(cardType, addr, len, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("SLE read data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sleReadData error", e);
            call.reject("Failed to read SLE data: " + e.getMessage());
        }
    }

    /**
     * SLE4428/SLE4442 card write data
     */
    public void sleWriteData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            Integer addr = call.getInt("addr");
            String data = call.getString("data");

            if (cardType == null || addr == null || data == null) {
                call.reject("Parameters 'cardType', 'addr' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);

            int result = readCardOpt.sleWriteData(cardType, addr, dataBytes.length, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("SLE write data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sleWriteData error", e);
            call.reject("Failed to write SLE data: " + e.getMessage());
        }
    }

    /**
     * SLE4442 read protection data
     */
    public void sle4442ReadProtectionData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            byte[] outData = new byte[4];
            int result = readCardOpt.sle4442ReadProtectionData(outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("SLE4442 read protection data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sle4442ReadProtectionData error", e);
            call.reject("Failed to read SLE4442 protection data: " + e.getMessage());
        }
    }

    /**
     * SLE4442 write protection data
     */
    public void sle4442WriteProtectionData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer addr = call.getInt("addr");
            String data = call.getString("data");

            if (addr == null || data == null) {
                call.reject("Parameters 'addr' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);
            if (dataBytes.length != 1) {
                call.reject("Data must be 1 byte");
                return;
            }

            int result = readCardOpt.sle4442WriteProtectionData(addr, dataBytes[0]);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("SLE4442 write protection data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sle4442WriteProtectionData error", e);
            call.reject("Failed to write SLE4442 protection data: " + e.getMessage());
        }
    }

    // ==================== AT24CXX Card Operations ====================

    /**
     * AT24CXX card read data
     */
    public void at24cxxReadData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer addr = call.getInt("addr");
            Integer len = call.getInt("len");

            if (addr == null || len == null) {
                call.reject("Parameters 'addr' and 'len' are required");
                return;
            }

            byte[] outData = new byte[len];
            int result = readCardOpt.at24cxxReadData(addr, len, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("AT24CXX read data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at24cxxReadData error", e);
            call.reject("Failed to read AT24CXX data: " + e.getMessage());
        }
    }

    /**
     * AT24CXX card write data
     */
    public void at24cxxWriteData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer addr = call.getInt("addr");
            String data = call.getString("data");

            if (addr == null || data == null) {
                call.reject("Parameters 'addr' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);

            int result = readCardOpt.at24cxxWriteData(addr, dataBytes.length, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("AT24CXX write data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at24cxxWriteData error", e);
            call.reject("Failed to write AT24CXX data: " + e.getMessage());
        }
    }

    // ==================== AT88SC Card Operations ====================

    /**
     * AT88SC card verify password
     */
    public void at88scVerifyPwd(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer zone = call.getInt("zone");
            Integer pwType = call.getInt("pwType");
            String pwd = call.getString("pwd");

            if (zone == null || pwType == null || pwd == null) {
                call.reject("Parameters 'zone', 'pwType' and 'pwd' are required");
                return;
            }

            byte[] pwdBytes = hexToBytes(pwd);

            int result = readCardOpt.at88scVerifyPwd(zone, pwType, pwdBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("AT88SC verify password failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scVerifyPwd error", e);
            call.reject("Failed to verify AT88SC password: " + e.getMessage());
        }
    }

    /**
     * AT88SC card change password
     */
    public void at88scChangePwd(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer zone = call.getInt("zone");
            Integer pwType = call.getInt("pwType");
            String newPwd = call.getString("newPwd");

            if (zone == null || pwType == null || newPwd == null) {
                call.reject("Parameters 'zone', 'pwType' and 'newPwd' are required");
                return;
            }

            byte[] newPwdBytes = hexToBytes(newPwd);

            int result = readCardOpt.at88scChangePwd(zone, pwType, newPwdBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("AT88SC change password failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scChangePwd error", e);
            call.reject("Failed to change AT88SC password: " + e.getMessage());
        }
    }

    /**
     * AT88SC card read data
     */
    public void at88scReadData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer zone = call.getInt("zone");
            Integer addr = call.getInt("addr");
            Integer len = call.getInt("len");

            if (zone == null || addr == null || len == null) {
                call.reject("Parameters 'zone', 'addr' and 'len' are required");
                return;
            }

            byte[] outData = new byte[len];
            int result = readCardOpt.at88scReadData(zone, addr, len, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("AT88SC read data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scReadData error", e);
            call.reject("Failed to read AT88SC data: " + e.getMessage());
        }
    }

    /**
     * AT88SC card write data
     */
    public void at88scWriteData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer zone = call.getInt("zone");
            Integer addr = call.getInt("addr");
            String data = call.getString("data");

            if (zone == null || addr == null || data == null) {
                call.reject("Parameters 'zone', 'addr' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);

            int result = readCardOpt.at88scWriteData(zone, addr, dataBytes.length, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("AT88SC write data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scWriteData error", e);
            call.reject("Failed to write AT88SC data: " + e.getMessage());
        }
    }

    /**
     * AT88SC card read fuse
     */
    public void at88scReadFuse(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            byte[] outData = new byte[1];
            int result = readCardOpt.at88scReadFuse(outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("fuse", outData[0] & 0xFF);
                call.resolve(response);
            } else {
                call.reject("AT88SC read fuse failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scReadFuse error", e);
            call.reject("Failed to read AT88SC fuse: " + e.getMessage());
        }
    }

    /**
     * AT88SC card burn fuse
     */
    public void at88scBurnFuse(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer fuse = call.getInt("fuse");
            if (fuse == null) {
                call.reject("Parameter 'fuse' is required");
                return;
            }

            int result = readCardOpt.at88scBurnFuse(fuse);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("AT88SC burn fuse failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scBurnFuse error", e);
            call.reject("Failed to burn AT88SC fuse: " + e.getMessage());
        }
    }

    /**
     * AT88SC card authentication
     */
    public void at88scAuth(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String gc = call.getString("gc");
            if (gc == null) {
                call.reject("Parameter 'gc' is required");
                return;
            }

            byte[] gcBytes = hexToBytes(gc);
            byte[] outData = new byte[8];

            int result = readCardOpt.at88scAuth(gcBytes, outData);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("ci", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("AT88SC auth failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "at88scAuth error", e);
            call.reject("Failed to authenticate AT88SC: " + e.getMessage());
        }
    }

    // ==================== CTX512B Card Operations ====================

    /**
     * CTX512B card verify password
     */
    public void ctx512bVerifyPwd(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String pwd = call.getString("pwd");
            if (pwd == null) {
                call.reject("Parameter 'pwd' is required");
                return;
            }

            byte[] pwdBytes = hexToBytes(pwd);
            if (pwdBytes.length != 2) {
                call.reject("Password must be 2 bytes");
                return;
            }

            int result = readCardOpt.ctx512bVerifyPwd(pwdBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("CTX512B verify password failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512bVerifyPwd error", e);
            call.reject("Failed to verify CTX512B password: " + e.getMessage());
        }
    }

    /**
     * CTX512B card change password
     */
    public void ctx512bChangePwd(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String newPwd = call.getString("newPwd");
            if (newPwd == null) {
                call.reject("Parameter 'newPwd' is required");
                return;
            }

            byte[] newPwdBytes = hexToBytes(newPwd);
            if (newPwdBytes.length != 2) {
                call.reject("Password must be 2 bytes");
                return;
            }

            int result = readCardOpt.ctx512bChangePwd(newPwdBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("CTX512B change password failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512bChangePwd error", e);
            call.reject("Failed to change CTX512B password: " + e.getMessage());
        }
    }

    /**
     * CTX512B card read data
     */
    public void ctx512bReadData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer addr = call.getInt("addr");
            Integer len = call.getInt("len");

            if (addr == null || len == null) {
                call.reject("Parameters 'addr' and 'len' are required");
                return;
            }

            byte[] outData = new byte[len];
            int result = readCardOpt.ctx512bReadData(addr, len, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(outData));
                call.resolve(response);
            } else {
                call.reject("CTX512B read data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512bReadData error", e);
            call.reject("Failed to read CTX512B data: " + e.getMessage());
        }
    }

    /**
     * CTX512B card write data
     */
    public void ctx512bWriteData(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer addr = call.getInt("addr");
            String data = call.getString("data");

            if (addr == null || data == null) {
                call.reject("Parameters 'addr' and 'data' are required");
                return;
            }

            byte[] dataBytes = hexToBytes(data);

            int result = readCardOpt.ctx512bWriteData(addr, dataBytes.length, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("CTX512B write data failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512bWriteData error", e);
            call.reject("Failed to write CTX512B data: " + e.getMessage());
        }
    }

    /**
     * CTX512B read block
     */
    public void ctx512ReadBlock(PluginCall call) {
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

            byte[] outData = new byte[64];
            int result = readCardOpt.ctx512ReadBlock(block, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validBytes = new byte[result];
                System.arraycopy(outData, 0, validBytes, 0, result);
                response.put("data", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("CTX512 read block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512ReadBlock error", e);
            call.reject("Failed to read CTX512 block: " + e.getMessage());
        }
    }

    /**
     * CTX512B write block
     */
    public void ctx512WriteBlock(PluginCall call) {
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
            int result = readCardOpt.ctx512WriteBlock(block, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("CTX512 write block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512WriteBlock error", e);
            call.reject("Failed to write CTX512 block: " + e.getMessage());
        }
    }

    /**
     * CTX512B update block (read-modify-write)
     */
    public void ctx512UpdateBlock(PluginCall call) {
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
            int result = readCardOpt.ctx512UpdateBlock(block, dataBytes);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("CTX512 update block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512UpdateBlock error", e);
            call.reject("Failed to update CTX512 block: " + e.getMessage());
        }
    }

    /**
     * CTX512B get signature
     */
    public void ctx512GetSignature(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer block = call.getInt("block");
            String randomHex = call.getString("random", "");
            
            if (block == null) {
                call.reject("Parameter 'block' is required");
                return;
            }

            byte[] randomData = randomHex.isEmpty() ? new byte[8] : hexToBytes(randomHex);
            byte[] signatureData = new byte[8];
            int result = readCardOpt.ctx512GetSignature(block, randomData, signatureData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validBytes = new byte[result];
                System.arraycopy(signatureData, 0, validBytes, 0, result);
                response.put("signature", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("CTX512 get signature failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512GetSignature error", e);
            call.reject("Failed to get CTX512 signature: " + e.getMessage());
        }
    }

    /**
     * CTX512B multi-read blocks (read 4 successive blocks)
     */
    public void ctx512MultiReadBlock(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer startBlock = call.getInt("startBlock");
            if (startBlock == null) {
                call.reject("Parameter 'startBlock' is required");
                return;
            }

            byte[] outData = new byte[256]; // 4 blocks * 64 bytes
            int result = readCardOpt.ctx512MultiReadBlock(startBlock, outData);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validBytes = new byte[result];
                System.arraycopy(outData, 0, validBytes, 0, result);
                response.put("data", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("CTX512 multi-read block failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ctx512MultiReadBlock error", e);
            call.reject("Failed to multi-read CTX512 blocks: " + e.getMessage());
        }
    }

    // ==================== PASS Mode Operations ====================

    /**
     * NFC transparent transmission TPDU mode
     */
    public void nfcPassThrough(PluginCall call) {
        if (readCardOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String send = call.getString("send");
            if (send == null) {
                call.reject("Parameter 'send' is required");
                return;
            }

            byte[] sendBytes = hexToBytes(send);
            byte[] recvBytes = new byte[512];

            int result = readCardOpt.nfcPassThrough(sendBytes, recvBytes);
            
            if (result >= 0) {
                JSObject response = new JSObject();
                byte[] validBytes = new byte[result];
                System.arraycopy(recvBytes, 0, validBytes, 0, result);
                response.put("data", bytesToHex(validBytes));
                call.resolve(response);
            } else {
                call.reject("NFC pass through failed, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "nfcPassThrough error", e);
            call.reject("Failed NFC pass through: " + e.getMessage());
        }
    }

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

