package com.sunmi.capacitor.pay;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.pay.hardware.aidl.bean.CardInfo;
import com.sunmi.pay.hardware.aidlv2.readcard.CheckCardCallbackV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;

import sunmi.paylib.SunmiPayKernel;

/**
 * Helper class for card reading operations
 */
public class CardReaderHelper {
    private static final String TAG = "CardReaderHelper";
    private final SunmiPayKernel payKernel;
    private ReadCardOptV2 readCardOpt;

    public CardReaderHelper(SunmiPayKernel payKernel) {
        this.payKernel = payKernel;
        this.readCardOpt = payKernel.mReadCardOptV2;
    }

    /**
     * Check card - search for magnetic, IC, or NFC cards
     */
    public void checkCard(int cardTypes, int timeout, CardReaderCallback callback) {
        try {
            if (readCardOpt == null) {
                callback.onError("ReadCardOpt not initialized");
                return;
            }

            readCardOpt.checkCard(cardTypes, new CheckCardCallbackV2.Stub() {
                @Override
                public void findMagCard(Bundle bundle) throws RemoteException {
                    Log.d(TAG, "Magnetic card found");
                    JSObject result = new JSObject();
                    result.put("cardType", AidlConstants.CardType.MAGNETIC.getValue());
                    // Extract card data from bundle
                    String track1 = bundle.getString("track1", "");
                    String track2 = bundle.getString("track2", "");
                    String track3 = bundle.getString("track3", "");
                    result.put("track1", track1);
                    result.put("track2", track2);
                    result.put("track3", track3);
                    callback.onSuccess(result);
                }

                @Override
                public void findICCard(String atr) throws RemoteException {
                    Log.d(TAG, "IC card found: " + atr);
                    JSObject result = new JSObject();
                    result.put("cardType", AidlConstants.CardType.IC.getValue());
                    result.put("atr", atr);
                    callback.onSuccess(result);
                }

                @Override
                public void findRFCard(String uuid) throws RemoteException {
                    Log.d(TAG, "NFC card found: " + uuid);
                    JSObject result = new JSObject();
                    result.put("cardType", AidlConstants.CardType.NFC.getValue());
                    result.put("uuid", uuid);
                    callback.onSuccess(result);
                }

                @Override
                public void onError(int code, String message) throws RemoteException {
                    Log.e(TAG, "Card check error: " + code + " - " + message);
                    callback.onError("Card check error: " + message + " (code: " + code + ")");
                }
                
                @Override
                public void findICCardEx(Bundle bundle) throws RemoteException {
                    Log.d(TAG, "IC card found (Ex): " + bundle.toString());
                    JSObject result = new JSObject();
                    result.put("cardType", AidlConstants.CardType.IC.getValue());
                    String atr = bundle.getString("atr", "");
                    result.put("atr", atr);
                    callback.onSuccess(result);
                }
                
                @Override
                public void findRFCardEx(Bundle bundle) throws RemoteException {
                    Log.d(TAG, "NFC card found (Ex): " + bundle.toString());
                    JSObject result = new JSObject();
                    result.put("cardType", AidlConstants.CardType.NFC.getValue());
                    String uuid = bundle.getString("uuid", "");
                    result.put("uuid", uuid);
                    callback.onSuccess(result);
                }
                
                @Override
                public void onErrorEx(Bundle bundle) throws RemoteException {
                    int code = bundle.getInt("code", -1);
                    String message = bundle.getString("message", "Unknown error");
                    Log.e(TAG, "Card check error (Ex): " + code + " - " + message);
                    callback.onError("Card check error: " + message + " (code: " + code + ")");
                }
            }, timeout);
        } catch (Exception e) {
            Log.e(TAG, "Error checking card", e);
            callback.onError("Error checking card: " + e.getMessage());
        }
    }

    /**
     * Cancel card reading
     */
    public void cancelCheckCard() {
        try {
            if (readCardOpt != null) {
                readCardOpt.cancelCheckCard();
            }
        } catch (Exception e) {
            Log.e(TAG, "Error canceling card check", e);
        }
    }

    /**
     * Convert CardInfo to JSObject
     */
    private JSObject convertCardInfo(CardInfo cardInfo) {
        JSObject result = new JSObject();
        result.put("cardType", cardInfo.cardType);
        result.put("cardNumber", cardInfo.cardNo);
        result.put("track1", cardInfo.track1);
        result.put("track2", cardInfo.track2);
        result.put("track3", cardInfo.track3);
        result.put("expiryDate", cardInfo.expireDate);
        result.put("serviceCode", cardInfo.serviceCode);
        result.put("countryCode", cardInfo.countryCode);
        result.put("cardSerialNumber", cardInfo.cardSerialNo);
        result.put("atr", cardInfo.atr);
        result.put("uuid", cardInfo.uuid);
        return result;
    }
}

