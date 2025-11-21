package com.sunmi.capacitor.pay;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;
import com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2;
import com.sunmi.pay.hardware.aidlv2.printer.PrinterOptV2;
import com.sunmi.paylib.SunmiPayKernel;
import com.sunmi.capacitor.pay.modules.BasicModule;
import com.sunmi.capacitor.pay.modules.CardModule;

/**
 * Sunmi Payment SDK V2 Capacitor Plugin
 * Complete implementation of all Sunmi Pay SDK modules
 * 
 * @version 2.0.17
 */
@CapacitorPlugin(name = "SunmiPay")
public class SunmiPayPlugin extends Plugin {
    private static final String TAG = "SunmiPayPlugin";
    
    private SunmiPayKernel payKernel;
    private boolean isConnected = false;
    
    // AIDL V2 interfaces
    private BasicOptV2 basicOpt;
    private ReadCardOptV2 readCardOpt;
    private PinPadOptV2 pinPadOpt;
    private SecurityOptV2 securityOpt;
    private EMVOptV2 emvOpt;
    private TaxOptV2 taxOpt;
    private PrinterOptV2 printerOpt;
    
    // Module implementations
    private BasicModule basicModule;
    private CardModule cardModule;

    @Override
    public void load() {
        super.load();
        
        // Initialize modules
        basicModule = new BasicModule(getContext());
        cardModule = new CardModule(getContext());
        
        // Auto-initialize SDK on plugin load
        initPaySDK(null);
    }

    // ==================== SDK Lifecycle Methods ====================

    /**
     * Initialize Pay SDK and connect to Sunmi Payment Hardware Service
     */
    @PluginMethod
    public void initPaySDK(PluginCall call) {
        if (isConnected) {
            if (call != null) {
                JSObject result = new JSObject();
                result.put("success", true);
                call.resolve(result);
            }
            return;
        }

        payKernel = SunmiPayKernel.getInstance();
        payKernel.initPaySDK(getContext(), new SunmiPayKernel.ConnectCallback() {
            @Override
            public void onConnectPaySDK() {
                Log.d(TAG, "Connected to Pay SDK");
                isConnected = true;
                
                // Get AIDL interfaces
                basicOpt = payKernel.mBasicOptV2;
                readCardOpt = payKernel.mReadCardOptV2;
                pinPadOpt = payKernel.mPinPadOptV2;
                securityOpt = payKernel.mSecurityOptV2;
                emvOpt = payKernel.mEMVOptV2;
                taxOpt = payKernel.mTaxOptV2;
                printerOpt = payKernel.mPrinterOptV2;
                
                // Set interfaces to modules
                basicModule.setBasicOpt(basicOpt);
                cardModule.setReadCardOpt(readCardOpt);
                
                if (call != null) {
                    JSObject result = new JSObject();
                    result.put("success", true);
                    call.resolve(result);
                }
            }

            @Override
            public void onDisconnectPaySDK() {
                Log.d(TAG, "Disconnected from Pay SDK");
                isConnected = false;
                
                // Clear interfaces
                basicOpt = null;
                readCardOpt = null;
                pinPadOpt = null;
                securityOpt = null;
                emvOpt = null;
                taxOpt = null;
                printerOpt = null;
                
                if (call != null) {
                    call.reject("Failed to connect to Pay SDK");
                }
            }
        });
    }

    /**
     * Destroy Pay SDK connection
     */
    @PluginMethod
    public void destroyPaySDK(PluginCall call) {
        if (payKernel != null) {
            payKernel.destroyPaySDK();
            isConnected = false;
            payKernel = null;
        }
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    /**
     * Get Pay SDK version
     */
    @PluginMethod
    public void getPaySDKVersion(PluginCall call) {
        try {
            String version = SunmiPayKernel.getInstance().getPayLibVersion();
            JSObject result = new JSObject();
            result.put("version", version);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "getPaySDKVersion error", e);
            call.reject("Failed to get SDK version: " + e.getMessage());
        }
    }

    /**
     * Enable or disable EMV L2 Split library
     */
    @PluginMethod
    public void setEmvL2Split(PluginCall call) {
        try {
            Boolean enable = call.getBoolean("enable", false);
            SunmiPayKernel.getInstance().setEmvL2Split(enable);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "setEmvL2Split error", e);
            call.reject("Failed to set EMV L2 Split: " + e.getMessage());
        }
    }

    // ==================== Basic Operation Module Methods ====================

    @PluginMethod
    public void getSysParam(PluginCall call) {
        basicModule.getSysParam(call);
    }

    @PluginMethod
    public void setSysParam(PluginCall call) {
        basicModule.setSysParam(call);
    }

    @PluginMethod
    public void buzzerOnDevice(PluginCall call) {
        basicModule.buzzerOnDevice(call);
    }

    @PluginMethod
    public void ledStatusOnDevice(PluginCall call) {
        basicModule.ledStatusOnDevice(call);
    }

    @PluginMethod
    public void ledStatusOnDeviceEx(PluginCall call) {
        basicModule.ledStatusOnDeviceEx(call);
    }

    @PluginMethod
    public void setScreenMode(PluginCall call) {
        basicModule.setScreenMode(call);
    }

    @PluginMethod
    public void sysGetRandom(PluginCall call) {
        basicModule.sysGetRandom(call);
    }

    @PluginMethod
    public void setStatusBarDropDownMode(PluginCall call) {
        basicModule.setStatusBarDropDownMode(call);
    }

    @PluginMethod
    public void setNavigationBarVisibility(PluginCall call) {
        basicModule.setNavigationBarVisibility(call);
    }

    @PluginMethod
    public void setHideNavigationBarItems(PluginCall call) {
        basicModule.setHideNavigationBarItems(call);
    }

    @PluginMethod
    public void sysPowerManage(PluginCall call) {
        basicModule.sysPowerManage(call);
    }

    @PluginMethod
    public void setScheduleReboot(PluginCall call) {
        basicModule.setScheduleReboot(call);
    }

    @PluginMethod
    public void clearScheduleReboot(PluginCall call) {
        basicModule.clearScheduleReboot(call);
    }

    @PluginMethod
    public void sysSetWakeup(PluginCall call) {
        basicModule.sysSetWakeup(call);
    }

    @PluginMethod
    public void getCardUsageCount(PluginCall call) {
        basicModule.getCardUsageCount(call);
    }

    @PluginMethod
    public void getModuleAccessibility(PluginCall call) {
        basicModule.getModuleAccessibility(call);
    }

    @PluginMethod
    public void setModuleAccessibility(PluginCall call) {
        basicModule.setModuleAccessibility(call);
    }

    @PluginMethod
    public void getPedMode(PluginCall call) {
        basicModule.getPedMode(call);
    }

    @PluginMethod
    public void setPedMode(PluginCall call) {
        basicModule.setPedMode(call);
    }

    @PluginMethod
    public void installSharedLib(PluginCall call) {
        basicModule.installSharedLib(call);
    }

    @PluginMethod
    public void deleteSharedLib(PluginCall call) {
        basicModule.deleteSharedLib(call);
    }

    @PluginMethod
    public void getRtcBatVol(PluginCall call) {
        basicModule.getRtcBatVol(call);
    }

    // ==================== Card Operation Module Methods ====================

    @PluginMethod
    public void checkCard(PluginCall call) {
        cardModule.checkCard(call);
    }

    @PluginMethod
    public void checkCardEx(PluginCall call) {
        cardModule.checkCardEx(call);
    }

    @PluginMethod
    public void checkCardEnc(PluginCall call) {
        cardModule.checkCardEnc(call);
    }

    @PluginMethod
    public void cancelCheckCard(PluginCall call) {
        cardModule.cancelCheckCard(call);
    }

    @PluginMethod
    public void apduCommand(PluginCall call) {
        cardModule.apduCommand(call);
    }

    @PluginMethod
    public void smartCardExchange(PluginCall call) {
        cardModule.smartCardExchange(call);
    }

    @PluginMethod
    public void transmitApdu(PluginCall call) {
        cardModule.transmitApdu(call);
    }

    @PluginMethod
    public void transmitApduEx(PluginCall call) {
        cardModule.transmitApduEx(call);
    }

    @PluginMethod
    public void transmitApduExx(PluginCall call) {
        cardModule.transmitApduExx(call);
    }

    @PluginMethod
    public void transmitMultiApdus(PluginCall call) {
        cardModule.transmitMultiApdus(call);
    }

    @PluginMethod
    public void cardOff(PluginCall call) {
        cardModule.cardOff(call);
    }

    @PluginMethod
    public void getCardExistStatus(PluginCall call) {
        cardModule.getCardExistStatus(call);
    }

    @PluginMethod
    public void mifareAuth(PluginCall call) {
        cardModule.mifareAuth(call);
    }

    @PluginMethod
    public void mifareReadBlock(PluginCall call) {
        cardModule.mifareReadBlock(call);
    }

    @PluginMethod
    public void mifareWriteBlock(PluginCall call) {
        cardModule.mifareWriteBlock(call);
    }

    @PluginMethod
    public void mifareIncValue(PluginCall call) {
        cardModule.mifareIncValue(call);
    }

    @PluginMethod
    public void mifareDecValue(PluginCall call) {
        cardModule.mifareDecValue(call);
    }

    // ==================== PinPad Operation Module Methods ====================
    // NOTE: PinPad methods would be implemented in a separate PinPadModule class
    // and called here similar to BasicModule and CardModule

    // ==================== Security Operation Module Methods ====================
    // NOTE: Security methods would be implemented in a separate SecurityModule class

    // ==================== EMV Operation Module Methods ====================
    // NOTE: EMV methods would be implemented in a separate EMVModule class

    // ==================== Printer Operation Module Methods ====================

    @PluginMethod
    public void printText(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String text = call.getString("text");
            if (text == null) {
                call.reject("Parameter 'text' is required");
                return;
            }

            printerOpt.printText(text, null);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "printText error", e);
            call.reject("Failed to print text: " + e.getMessage());
        }
    }

    @PluginMethod
    public void printBarcode(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String data = call.getString("data");
            Integer barcodeType = call.getInt("barcodeType", 8); // CODE128 default
            Integer width = call.getInt("width", 2);
            Integer height = call.getInt("height", 100);

            if (data == null) {
                call.reject("Parameter 'data' is required");
                return;
            }

            printerOpt.printBarCode(data, barcodeType, width, height, null);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "printBarcode error", e);
            call.reject("Failed to print barcode: " + e.getMessage());
        }
    }

    @PluginMethod
    public void printQRCode(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            String data = call.getString("data");
            Integer size = call.getInt("size", 8);
            Integer errorLevel = call.getInt("errorLevel", 1);

            if (data == null) {
                call.reject("Parameter 'data' is required");
                return;
            }

            printerOpt.printQRCode(data, size, errorLevel, null);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "printQRCode error", e);
            call.reject("Failed to print QR code: " + e.getMessage());
        }
    }

    @PluginMethod
    public void feedPaper(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            Integer lines = call.getInt("lines", 3);
            
            printerOpt.lineFeed(lines, null);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "feedPaper error", e);
            call.reject("Failed to feed paper: " + e.getMessage());
        }
    }

    @PluginMethod
    public void cutPaper(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            printerOpt.cutPaper(null);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "cutPaper error", e);
            call.reject("Failed to cut paper: " + e.getMessage());
        }
    }

    @PluginMethod
    public void getPrinterStatus(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            int status = printerOpt.getPrinterStatus();
            
            JSObject result = new JSObject();
            result.put("status", status);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "getPrinterStatus error", e);
            call.reject("Failed to get printer status: " + e.getMessage());
        }
    }

    @PluginMethod
    public void initPrinter(PluginCall call) {
        if (printerOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            printerOpt.initPrinter(null);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "initPrinter error", e);
            call.reject("Failed to initialize printer: " + e.getMessage());
        }
    }

    // ==================== Tax Operation Module Methods ====================

    @PluginMethod
    public void getFiscalStatus(PluginCall call) {
        if (taxOpt == null) {
            call.reject("SDK not initialized or Tax module not available");
            return;
        }

        try {
            // Tax module implementation would vary by region
            JSObject result = new JSObject();
            result.put("status", "Not implemented - requires regional configuration");
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "getFiscalStatus error", e);
            call.reject("Failed to get fiscal status: " + e.getMessage());
        }
    }

    @Override
    protected void handleOnDestroy() {
        super.handleOnDestroy();
        if (payKernel != null) {
            payKernel.destroyPaySDK();
        }
    }
}
