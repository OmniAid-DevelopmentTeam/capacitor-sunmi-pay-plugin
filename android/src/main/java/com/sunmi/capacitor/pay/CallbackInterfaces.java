package com.sunmi.capacitor.pay;

import com.getcapacitor.JSObject;

/**
 * Callback interfaces for async operations
 */

interface CardReaderCallback {
    void onSuccess(JSObject cardInfo);
    void onError(String error);
}

interface EMVTransactionCallback {
    void onSuccess(JSObject result);
    void onError(String error);
}

interface EMVResponseCallback {
    void onSuccess(JSObject result);
    void onError(String error);
}

interface PINInputCallback {
    void onSuccess(JSObject result);
    void onError(String error);
}

interface DataCallback {
    void onSuccess(JSObject data);
    void onError(String error);
}

interface ResultCallback {
    void onSuccess();
    void onError(String error);
}

