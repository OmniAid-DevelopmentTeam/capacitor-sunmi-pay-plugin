package com.sunmi.capacitor.pay;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;

import sunmi.paylib.SunmiPayKernel;

/**
 * Helper class for system operations (LED, beep, device info)
 */
public class SystemHelper {
    private static final String TAG = "SystemHelper";
    private final SunmiPayKernel payKernel;
    private BasicOptV2 basicOpt;

    public SystemHelper(SunmiPayKernel payKernel) {
        this.payKernel = payKernel;
        this.basicOpt = payKernel.mBasicOptV2;
    }

    public void getSystemParam(String key, DataCallback callback) {
        try {
            if (basicOpt == null) {
                callback.onError("BasicOpt not initialized");
                return;
            }

            String value = basicOpt.getSysParam(key);
            
            JSObject result = new JSObject();
            result.put("value", value != null ? value : "");
            callback.onSuccess(result);
        } catch (Exception e) {
            Log.e(TAG, "Error getting system param", e);
            callback.onError("Error getting system param: " + e.getMessage());
        }
    }

    public JSObject getDeviceInfo() {
        JSObject deviceInfo = new JSObject();
        try {
            if (basicOpt == null) {
                return deviceInfo;
            }

            deviceInfo.put("serialNumber", basicOpt.getSysParam(AidlConstants.SysParam.SN));
            deviceInfo.put("deviceModel", basicOpt.getSysParam(AidlConstants.SysParam.DEVICE_MODEL));
            deviceInfo.put("firmwareVersion", basicOpt.getSysParam(AidlConstants.SysParam.FIRMWARE_VERSION));
            deviceInfo.put("hardwareVersion", basicOpt.getSysParam(AidlConstants.SysParam.HARDWARE_VERSION));
            deviceInfo.put("emvKernelVersion", basicOpt.getSysParam(AidlConstants.SysParam.EMV_VERSION));
            deviceInfo.put("paySDKVersion", payKernel.getMatchedPaySDKVersion());
        } catch (Exception e) {
            Log.e(TAG, "Error getting device info", e);
        }
        return deviceInfo;
    }

    public void controlLED(int ledType, int state, int duration, ResultCallback callback) {
        try {
            if (basicOpt == null) {
                callback.onError("BasicOpt not initialized");
                return;
            }

            // LED control implementation
            // state: 0=Off, 1=On, 2=Blink
            if (state == 2) {
                // Blink mode
                basicOpt.ledStatusOnDevice(ledType, 1);
                new android.os.Handler().postDelayed(() -> {
                    try {
                        basicOpt.ledStatusOnDevice(ledType, 0);
                    } catch (Exception e) {
                        Log.e(TAG, "Error turning off LED", e);
                    }
                }, duration);
            } else {
                basicOpt.ledStatusOnDevice(ledType, state);
            }
            
            callback.onSuccess();
        } catch (Exception e) {
            Log.e(TAG, "Error controlling LED", e);
            callback.onError("Error controlling LED: " + e.getMessage());
        }
    }

    public void controlBeep(int duration, int count, ResultCallback callback) {
        try {
            if (basicOpt == null) {
                callback.onError("BasicOpt not initialized");
                return;
            }

            for (int i = 0; i < count; i++) {
                basicOpt.buzzer();
                if (i < count - 1) {
                    Thread.sleep(duration);
                }
            }
            
            callback.onSuccess();
        } catch (Exception e) {
            Log.e(TAG, "Error controlling beep", e);
            callback.onError("Error controlling beep: " + e.getMessage());
        }
    }
}

