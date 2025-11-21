package com.sunmi.capacitor.pay.modules;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;

import org.json.JSONException;

/**
 * Basic Operation Module
 * Implements all basic system operations from Sunmi Pay SDK
 */
public class BasicModule {
    private static final String TAG = "SunmiPay-BasicModule";
    private final Context context;
    private BasicOptV2 basicOpt;

    public BasicModule(Context context) {
        this.context = context;
    }

    public void setBasicOpt(BasicOptV2 basicOpt) {
        this.basicOpt = basicOpt;
    }

    /**
     * Get system parameter by key
     */
    public void getSysParam(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String key = call.getString("key");
            if (key == null) {
                call.reject("Parameter 'key' is required");
                return;
            }

            String value = basicOpt.getSysParam(key);
            JSObject result = new JSObject();
            result.put("value", value != null ? value : "NULL");
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "getSysParam error", e);
            call.reject("Failed to get system parameter: " + e.getMessage());
        }
    }

    /**
     * Set system parameter
     */
    public void setSysParam(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String key = call.getString("key");
            String value = call.getString("value");
            
            if (key == null || value == null) {
                call.reject("Parameters 'key' and 'value' are required");
                return;
            }

            int result = basicOpt.setSysParam(key, value);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set system parameter, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setSysParam error", e);
            call.reject("Failed to set system parameter: " + e.getMessage());
        }
    }

    /**
     * Control device buzzer
     */
    public void buzzerOnDevice(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer count = call.getInt("count", 1);
            Integer freq = call.getInt("freq", 2500);
            Integer duration = call.getInt("duration", 200);
            Integer interval = call.getInt("interval", 0);

            basicOpt.buzzerOnDevice(count, freq, duration, interval);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "buzzerOnDevice error", e);
            call.reject("Failed to control buzzer: " + e.getMessage());
        }
    }

    /**
     * Control LED status on device
     */
    public void ledStatusOnDevice(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer ledIndex = call.getInt("ledIndex");
            Integer ledStatus = call.getInt("ledStatus");

            if (ledIndex == null || ledStatus == null) {
                call.reject("Parameters 'ledIndex' and 'ledStatus' are required");
                return;
            }

            int result = basicOpt.ledStatusOnDevice(ledIndex, ledStatus);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to control LED, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ledStatusOnDevice error", e);
            call.reject("Failed to control LED: " + e.getMessage());
        }
    }

    /**
     * Control all LEDs at once
     */
    public void ledStatusOnDeviceEx(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer redStatus = call.getInt("redStatus");
            Integer greenStatus = call.getInt("greenStatus");
            Integer yellowStatus = call.getInt("yellowStatus");
            Integer blueStatus = call.getInt("blueStatus");

            if (redStatus == null || greenStatus == null || yellowStatus == null || blueStatus == null) {
                call.reject("All LED status parameters are required");
                return;
            }

            int result = basicOpt.ledStatusOnDeviceEx(redStatus, greenStatus, yellowStatus, blueStatus);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to control LEDs, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "ledStatusOnDeviceEx error", e);
            call.reject("Failed to control LEDs: " + e.getMessage());
        }
    }

    /**
     * Set screen exclusive mode
     */
    public void setScreenMode(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer mode = call.getInt("mode");
            if (mode == null) {
                call.reject("Parameter 'mode' is required");
                return;
            }

            int result = basicOpt.setScreenMode(mode);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set screen mode, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setScreenMode error", e);
            call.reject("Failed to set screen mode: " + e.getMessage());
        }
    }

    /**
     * Get random data from SDK
     */
    public void sysGetRandom(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer len = call.getInt("len");
            if (len == null || len <= 0 || len > 256) {
                call.reject("Parameter 'len' must be between 1 and 256");
                return;
            }

            byte[] randData = new byte[len];
            int result = basicOpt.sysGetRandom(randData, len);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("data", bytesToHex(randData));
                call.resolve(response);
            } else {
                call.reject("Failed to get random data, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sysGetRandom error", e);
            call.reject("Failed to get random data: " + e.getMessage());
        }
    }

    /**
     * Set status bar dropdown mode
     */
    public void setStatusBarDropDownMode(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer mode = call.getInt("mode");
            if (mode == null) {
                call.reject("Parameter 'mode' is required");
                return;
            }

            int result = basicOpt.setStatusBarDropDownMode(mode);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set status bar mode, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setStatusBarDropDownMode error", e);
            call.reject("Failed to set status bar mode: " + e.getMessage());
        }
    }

    /**
     * Set navigation bar visibility
     */
    public void setNavigationBarVisibility(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer visibility = call.getInt("visibility");
            if (visibility == null) {
                call.reject("Parameter 'visibility' is required");
                return;
            }

            int result = basicOpt.setNavigationBarVisibility(visibility);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set navigation bar visibility, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setNavigationBarVisibility error", e);
            call.reject("Failed to set navigation bar visibility: " + e.getMessage());
        }
    }

    /**
     * Hide specific navigation bar items
     */
    public void setHideNavigationBarItems(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer flag = call.getInt("flag");
            if (flag == null) {
                call.reject("Parameter 'flag' is required");
                return;
            }

            int result = basicOpt.setHideNavigationBarItems(flag);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to hide navigation bar items, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setHideNavigationBarItems error", e);
            call.reject("Failed to hide navigation bar items: " + e.getMessage());
        }
    }

    /**
     * Manage device power
     */
    public void sysPowerManage(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer mode = call.getInt("mode");
            if (mode == null) {
                call.reject("Parameter 'mode' is required");
                return;
            }

            int result = basicOpt.sysPowerManage(mode);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to manage power, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sysPowerManage error", e);
            call.reject("Failed to manage power: " + e.getMessage());
        }
    }

    /**
     * Set schedule reboot time
     */
    public void setScheduleReboot(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer hour = call.getInt("hour");
            Integer minute = call.getInt("minute");
            Integer second = call.getInt("second");
            Integer millisecond = call.getInt("millisecond");

            if (hour == null || minute == null || second == null || millisecond == null) {
                call.reject("All time parameters are required");
                return;
            }

            int result = basicOpt.setScheduleReboot(hour, minute, second, millisecond);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set schedule reboot, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setScheduleReboot error", e);
            call.reject("Failed to set schedule reboot: " + e.getMessage());
        }
    }

    /**
     * Clear schedule reboot time
     */
    public void clearScheduleReboot(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            int result = basicOpt.clearScheduleReboot();
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to clear schedule reboot, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "clearScheduleReboot error", e);
            call.reject("Failed to clear schedule reboot: " + e.getMessage());
        }
    }

    /**
     * Set device wakeup sources
     */
    public void sysSetWakeup(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer channel = call.getInt("channel");
            Integer mode = call.getInt("mode");

            if (channel == null || mode == null) {
                call.reject("Parameters 'channel' and 'mode' are required");
                return;
            }

            int result = basicOpt.sysSetWakeup(channel, mode, null);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set wakeup, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "sysSetWakeup error", e);
            call.reject("Failed to set wakeup: " + e.getMessage());
        }
    }

    /**
     * Get card usage count
     */
    public void getCardUsageCount(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer cardType = call.getInt("cardType");
            Boolean isSuccess = call.getBoolean("isSuccess");

            if (cardType == null || isSuccess == null) {
                call.reject("Parameters 'cardType' and 'isSuccess' are required");
                return;
            }

            int count = basicOpt.getCardUsageCount(cardType, isSuccess);
            if (count >= 0) {
                JSObject result = new JSObject();
                result.put("count", count);
                call.resolve(result);
            } else {
                call.reject("Failed to get card usage count, error code: " + count);
            }
        } catch (Exception e) {
            Log.e(TAG, "getCardUsageCount error", e);
            call.reject("Failed to get card usage count: " + e.getMessage());
        }
    }

    /**
     * Get module accessibility
     */
    public void getModuleAccessibility(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer module = call.getInt("module");
            if (module == null) {
                call.reject("Parameter 'module' is required");
                return;
            }

            int ability = basicOpt.getModuleAccessibility(module);
            if (ability >= 0) {
                JSObject result = new JSObject();
                result.put("ability", ability);
                call.resolve(result);
            } else {
                call.reject("Failed to get module accessibility, error code: " + ability);
            }
        } catch (Exception e) {
            Log.e(TAG, "getModuleAccessibility error", e);
            call.reject("Failed to get module accessibility: " + e.getMessage());
        }
    }

    /**
     * Set module accessibility
     */
    public void setModuleAccessibility(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer module = call.getInt("module");
            Integer ability = call.getInt("ability");

            if (module == null || ability == null) {
                call.reject("Parameters 'module' and 'ability' are required");
                return;
            }

            int result = basicOpt.setModuleAccessibility(module, ability);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set module accessibility, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setModuleAccessibility error", e);
            call.reject("Failed to set module accessibility: " + e.getMessage());
        }
    }

    /**
     * Get PED mode
     */
    public void getPedMode(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            int mode = basicOpt.getPedMode();
            if (mode > 0) {
                JSObject result = new JSObject();
                result.put("mode", mode);
                call.resolve(result);
            } else {
                call.reject("Failed to get PED mode, error code: " + mode);
            }
        } catch (Exception e) {
            Log.e(TAG, "getPedMode error", e);
            call.reject("Failed to get PED mode: " + e.getMessage());
        }
    }

    /**
     * Set PED mode
     */
    public void setPedMode(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer mode = call.getInt("mode");
            if (mode == null) {
                call.reject("Parameter 'mode' is required");
                return;
            }

            int result = basicOpt.setPedMode(mode);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to set PED mode, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "setPedMode error", e);
            call.reject("Failed to set PED mode: " + e.getMessage());
        }
    }

    /**
     * Install shared lib
     */
    public void installSharedLib(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String path = call.getString("path");
            if (path == null) {
                call.reject("Parameter 'path' is required");
                return;
            }

            int result = basicOpt.installSharedLib(path);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to install shared lib, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "installSharedLib error", e);
            call.reject("Failed to install shared lib: " + e.getMessage());
        }
    }

    /**
     * Delete shared lib
     */
    public void deleteSharedLib(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String name = call.getString("name");
            if (name == null) {
                call.reject("Parameter 'name' is required");
                return;
            }

            int result = basicOpt.deleteSharedLib(name);
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } else {
                call.reject("Failed to delete shared lib, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "deleteSharedLib error", e);
            call.reject("Failed to delete shared lib: " + e.getMessage());
        }
    }

    /**
     * Get RTC battery voltage
     */
    public void getRtcBatVol(PluginCall call) {
        if (basicOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Bundle info = new Bundle();
            int result = basicOpt.getRtcBatVol(info);
            
            if (result == 0) {
                JSObject response = new JSObject();
                response.put("vol", info.getInt("vol"));
                response.put("fromAdc", info.getInt("fromAdc"));
                call.resolve(response);
            } else {
                call.reject("Failed to get RTC battery voltage, error code: " + result);
            }
        } catch (Exception e) {
            Log.e(TAG, "getRtcBatVol error", e);
            call.reject("Failed to get RTC battery voltage: " + e.getMessage());
        }
    }

    // ==================== Utility Methods ====================

    /**
     * Convert byte array to hex string
     */
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

    /**
     * Convert hex string to byte array
     */
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
}

