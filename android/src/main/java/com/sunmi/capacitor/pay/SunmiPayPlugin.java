package com.sunmi.capacitor.pay;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.getcapacitor.JSArray;
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
import com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2;
import sunmi.paylib.SunmiPayKernel;
import com.sunmi.capacitor.pay.modules.BasicModule;
import com.sunmi.capacitor.pay.modules.CardModule;
import com.sunmi.capacitor.pay.modules.PinPadModule;
import com.sunmi.capacitor.pay.modules.SecurityModule;
import com.sunmi.capacitor.pay.modules.EMVModule;
import com.sunmi.peripheral.printer.InnerPrinterCallback;
import com.sunmi.peripheral.printer.InnerPrinterException;
import com.sunmi.peripheral.printer.InnerPrinterManager;
import com.sunmi.peripheral.printer.InnerResultCallback;
import com.sunmi.peripheral.printer.SunmiPrinterService;
import com.sunmi.peripheral.printer.WoyouConsts;

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
    private PinPadModule pinPadModule;
    private SecurityModule securityModule;
    private EMVModule emvModule;
    
    // Sunmi Printer Service (for text printing)
    private SunmiPrinterService printerService;
    private boolean printerServiceConnected = false;

    @Override
    public void load() {
        super.load();
        
        // Initialize modules
        basicModule = new BasicModule(getContext());
        cardModule = new CardModule(getContext());
        pinPadModule = new PinPadModule(getContext());
        securityModule = new SecurityModule(getContext());
        emvModule = new EMVModule(getContext());
        
        // Auto-initialize SDK on plugin load
        initPaySDK(null);
        
        // Connect to Sunmi Printer Service
        connectPrinterService();
    }
    
    /**
     * Connect to Sunmi Printer Service for text printing
     */
    private void connectPrinterService() {
        try {
            boolean ret = InnerPrinterManager.getInstance().bindService(getContext(), printerCallback);
            if (!ret) {
                Log.w(TAG, "No Sunmi printer available on this device");
            }
        } catch (InnerPrinterException e) {
            Log.e(TAG, "Failed to connect to Printer Service", e);
        }
    }
    
    private InnerPrinterCallback printerCallback = new InnerPrinterCallback() {
        @Override
        protected void onConnected(SunmiPrinterService service) {
            printerService = service;
            printerServiceConnected = true;
            Log.d(TAG, "Connected to Sunmi Printer Service");
        }

        @Override
        protected void onDisconnected() {
            printerService = null;
            printerServiceConnected = false;
            Log.d(TAG, "Disconnected from Sunmi Printer Service");
        }
    };
    
    /**
     * Inner result callback for printer operations
     */
    private InnerResultCallback innerResultCallback = new InnerResultCallback() {
        @Override
        public void onRunResult(boolean isSuccess) throws RemoteException {
            Log.d(TAG, "Printer result: " + isSuccess);
        }

        @Override
        public void onReturnString(String result) throws RemoteException {
            Log.d(TAG, "Printer return: " + result);
        }

        @Override
        public void onRaiseException(int code, String msg) throws RemoteException {
            Log.e(TAG, "Printer exception: " + code + " - " + msg);
        }

        @Override
        public void onPrintResult(int code, String msg) throws RemoteException {
            Log.d(TAG, "Print result: " + code + " - " + msg);
        }
    };

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
                pinPadModule.setPinPadOpt(pinPadOpt);
                securityModule.setSecurityOpt(securityOpt);
                // EMV module disabled for card reader mode (not needed for simple card reading)
                // emvModule.setEMVOpt(emvOpt);
                
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

    @PluginMethod
    public void mifareIncValueDx(PluginCall call) {
        cardModule.mifareIncValueDx(call);
    }

    @PluginMethod
    public void mifareDecValueDx(PluginCall call) {
        cardModule.mifareDecValueDx(call);
    }

    @PluginMethod
    public void mifareTransfer(PluginCall call) {
        cardModule.mifareTransfer(call);
    }

    @PluginMethod
    public void mifareRestore(PluginCall call) {
        cardModule.mifareRestore(call);
    }

    // Mifare Ultralight C
    @PluginMethod
    public void ultralightCAuth(PluginCall call) {
        cardModule.ultralightCAuth(call);
    }

    @PluginMethod
    public void ultralightReadPage(PluginCall call) {
        cardModule.ultralightReadPage(call);
    }

    @PluginMethod
    public void ultralightWritePage(PluginCall call) {
        cardModule.ultralightWritePage(call);
    }

    // Mifare Plus
    @PluginMethod
    public void mifarePlusAuth(PluginCall call) {
        cardModule.mifarePlusAuth(call);
    }

    @PluginMethod
    public void mifarePlusAESAuth(PluginCall call) {
        cardModule.mifarePlusAESAuth(call);
    }

    @PluginMethod
    public void mifarePlusReadEncBlock(PluginCall call) {
        cardModule.mifarePlusReadEncBlock(call);
    }

    @PluginMethod
    public void mifarePlusWriteEncBlock(PluginCall call) {
        cardModule.mifarePlusWriteEncBlock(call);
    }

    @PluginMethod
    public void mifarePlusEncIncValue(PluginCall call) {
        cardModule.mifarePlusEncIncValue(call);
    }

    @PluginMethod
    public void mifarePlusEncDecValue(PluginCall call) {
        cardModule.mifarePlusEncDecValue(call);
    }

    // SLE Card Operations
    @PluginMethod
    public void sleVerifyPwd(PluginCall call) {
        cardModule.sleVerifyPwd(call);
    }

    @PluginMethod
    public void sleChangePwd(PluginCall call) {
        cardModule.sleChangePwd(call);
    }

    @PluginMethod
    public void sleReadData(PluginCall call) {
        cardModule.sleReadData(call);
    }

    @PluginMethod
    public void sleWriteData(PluginCall call) {
        cardModule.sleWriteData(call);
    }

    @PluginMethod
    public void sle4442ReadProtectionData(PluginCall call) {
        cardModule.sle4442ReadProtectionData(call);
    }

    @PluginMethod
    public void sle4442WriteProtectionData(PluginCall call) {
        cardModule.sle4442WriteProtectionData(call);
    }

    // AT24CXX Card Operations
    @PluginMethod
    public void at24cxxReadData(PluginCall call) {
        cardModule.at24cxxReadData(call);
    }

    @PluginMethod
    public void at24cxxWriteData(PluginCall call) {
        cardModule.at24cxxWriteData(call);
    }

    // AT88SC Card Operations
    @PluginMethod
    public void at88scVerifyPwd(PluginCall call) {
        cardModule.at88scVerifyPwd(call);
    }

    @PluginMethod
    public void at88scChangePwd(PluginCall call) {
        cardModule.at88scChangePwd(call);
    }

    @PluginMethod
    public void at88scReadData(PluginCall call) {
        cardModule.at88scReadData(call);
    }

    @PluginMethod
    public void at88scWriteData(PluginCall call) {
        cardModule.at88scWriteData(call);
    }

    @PluginMethod
    public void at88scReadFuse(PluginCall call) {
        cardModule.at88scReadFuse(call);
    }

    @PluginMethod
    public void at88scBurnFuse(PluginCall call) {
        cardModule.at88scBurnFuse(call);
    }

    @PluginMethod
    public void at88scAuth(PluginCall call) {
        cardModule.at88scAuth(call);
    }

    // CTX512B Card Operations
    @PluginMethod
    public void ctx512bVerifyPwd(PluginCall call) {
        cardModule.ctx512bVerifyPwd(call);
    }

    @PluginMethod
    public void ctx512bChangePwd(PluginCall call) {
        cardModule.ctx512bChangePwd(call);
    }

    @PluginMethod
    public void ctx512bReadData(PluginCall call) {
        cardModule.ctx512bReadData(call);
    }

    @PluginMethod
    public void ctx512bWriteData(PluginCall call) {
        cardModule.ctx512bWriteData(call);
    }

    @PluginMethod
    public void ctx512ReadBlock(PluginCall call) {
        cardModule.ctx512ReadBlock(call);
    }

    @PluginMethod
    public void ctx512WriteBlock(PluginCall call) {
        cardModule.ctx512WriteBlock(call);
    }

    @PluginMethod
    public void ctx512UpdateBlock(PluginCall call) {
        cardModule.ctx512UpdateBlock(call);
    }

    @PluginMethod
    public void ctx512GetSignature(PluginCall call) {
        cardModule.ctx512GetSignature(call);
    }

    @PluginMethod
    public void ctx512MultiReadBlock(PluginCall call) {
        cardModule.ctx512MultiReadBlock(call);
    }

    // NFC Pass Through
    @PluginMethod
    public void nfcPassThrough(PluginCall call) {
        cardModule.nfcPassThrough(call);
    }

    // ==================== PinPad Operation Module Methods ====================

    @PluginMethod
    public void initPinPad(PluginCall call) {
        pinPadModule.initPinPad(call);
    }

    @PluginMethod
    public void initPinPadEx(PluginCall call) {
        pinPadModule.initPinPadEx(call);
    }

    @PluginMethod
    public void importPinPadData(PluginCall call) {
        pinPadModule.importPinPadData(call);
    }

    @PluginMethod
    public void importPinPadDataEx(PluginCall call) {
        pinPadModule.importPinPadDataEx(call);
    }

    @PluginMethod
    public void cancelInputPin(PluginCall call) {
        pinPadModule.cancelInputPin(call);
    }

    @PluginMethod
    public void setPinPadText(PluginCall call) {
        pinPadModule.setPinPadText(call);
    }

    @PluginMethod
    public void setPinPadMode(PluginCall call) {
        pinPadModule.setPinPadMode(call);
    }

    @PluginMethod
    public void getPinPadMode(PluginCall call) {
        pinPadModule.getPinPadMode(call);
    }

    @PluginMethod
    public void getPinBlock(PluginCall call) {
        pinPadModule.getPinBlock(call);
    }

    // Anti-Exhaustive Protection
    @PluginMethod
    public void resetAntiExhaust(PluginCall call) {
        pinPadModule.resetAntiExhaust(call);
    }

    @PluginMethod
    public void getAntiExhaustStatus(PluginCall call) {
        pinPadModule.getAntiExhaustStatus(call);
    }

    @PluginMethod
    public void setAntiExhaustConfig(PluginCall call) {
        pinPadModule.setAntiExhaustConfig(call);
    }

    // Visual Impairment Mode
    @PluginMethod
    public void setVisualImpairmentMode(PluginCall call) {
        pinPadModule.setVisualImpairmentMode(call);
    }

    @PluginMethod
    public void getVisualImpairmentMode(PluginCall call) {
        pinPadModule.getVisualImpairmentMode(call);
    }

    // PinPad Info
    @PluginMethod
    public void getPinPadSerialNo(PluginCall call) {
        pinPadModule.getPinPadSerialNo(call);
    }

    @PluginMethod
    public void getPinPadVersion(PluginCall call) {
        pinPadModule.getPinPadVersion(call);
    }

    @PluginMethod
    public void isPinPadFeatureSupported(PluginCall call) {
        pinPadModule.isPinPadFeatureSupported(call);
    }

    // ==================== Security Operation Module Methods ====================

    @PluginMethod
    public void savePlaintextKey(PluginCall call) {
        securityModule.savePlaintextKey(call);
    }

    @PluginMethod
    public void saveCiphertextKey(PluginCall call) {
        securityModule.saveCiphertextKey(call);
    }

    @PluginMethod
    public void saveKeyEx(PluginCall call) {
        securityModule.saveKeyEx(call);
    }

    @PluginMethod
    public void deleteKey(PluginCall call) {
        securityModule.deleteKey(call);
    }

    @PluginMethod
    public void deleteKeyEx(PluginCall call) {
        securityModule.deleteKeyEx(call);
    }

    @PluginMethod
    public void getKeyCheckValue(PluginCall call) {
        securityModule.getKeyCheckValue(call);
    }

    @PluginMethod
    public void getKeyLength(PluginCall call) {
        securityModule.getKeyLength(call);
    }

    @PluginMethod
    public void isKeyExist(PluginCall call) {
        securityModule.isKeyExist(call);
    }

    // MAC Operations
    @PluginMethod
    public void calcMac(PluginCall call) {
        securityModule.calcMac(call);
    }

    @PluginMethod
    public void calcMacEx(PluginCall call) {
        securityModule.calcMacEx(call);
    }

    @PluginMethod
    public void verifyMac(PluginCall call) {
        securityModule.verifyMac(call);
    }

    // Data Encryption/Decryption
    @PluginMethod
    public void dataEncrypt(PluginCall call) {
        securityModule.dataEncrypt(call);
    }

    @PluginMethod
    public void dataDecrypt(PluginCall call) {
        securityModule.dataDecrypt(call);
    }

    @PluginMethod
    public void dataEncryptEx(PluginCall call) {
        securityModule.dataEncryptEx(call);
    }

    @PluginMethod
    public void dataDecryptEx(PluginCall call) {
        securityModule.dataDecryptEx(call);
    }

    // DUKPT Operations
    @PluginMethod
    public void saveKeyDukpt(PluginCall call) {
        securityModule.saveKeyDukpt(call);
    }

    @PluginMethod
    public void saveKeyDukptAES(PluginCall call) {
        securityModule.saveKeyDukptAES(call);
    }

    @PluginMethod
    public void calcMacDukpt(PluginCall call) {
        securityModule.calcMacDukpt(call);
    }

    @PluginMethod
    public void calcMacDukptEx(PluginCall call) {
        securityModule.calcMacDukptEx(call);
    }

    @PluginMethod
    public void verifyMacDukpt(PluginCall call) {
        securityModule.verifyMacDukpt(call);
    }

    @PluginMethod
    public void verifyMacDukptEx(PluginCall call) {
        securityModule.verifyMacDukptEx(call);
    }

    @PluginMethod
    public void dataEncryptDukpt(PluginCall call) {
        securityModule.dataEncryptDukpt(call);
    }

    @PluginMethod
    public void dataDecryptDukpt(PluginCall call) {
        securityModule.dataDecryptDukpt(call);
    }

    @PluginMethod
    public void dataEncryptDukptEx(PluginCall call) {
        securityModule.dataEncryptDukptEx(call);
    }

    @PluginMethod
    public void dataDecryptDukptEx(PluginCall call) {
        securityModule.dataDecryptDukptEx(call);
    }

    @PluginMethod
    public void dukptIncreaseKSN(PluginCall call) {
        securityModule.dukptIncreaseKSN(call);
    }

    @PluginMethod
    public void dukptCurrentKSN(PluginCall call) {
        securityModule.dukptCurrentKSN(call);
    }

    @PluginMethod
    public void dukptGetInitKSN(PluginCall call) {
        securityModule.dukptGetInitKSN(call);
    }

    // RSA Operations
    @PluginMethod
    public void generateRSAKeypair(PluginCall call) {
        securityModule.generateRSAKeypair(call);
    }

    @PluginMethod
    public void generateRSAKeypairEx(PluginCall call) {
        securityModule.generateRSAKeypairEx(call);
    }

    @PluginMethod
    public void injectRSAKeyEx(PluginCall call) {
        securityModule.injectRSAKeyEx(call);
    }

    @PluginMethod
    public void readRSAKey(PluginCall call) {
        securityModule.readRSAKey(call);
    }

    @PluginMethod
    public void rsaEncryptOrDecryptData(PluginCall call) {
        securityModule.rsaEncryptOrDecryptData(call);
    }

    @PluginMethod
    public void rsaSignData(PluginCall call) {
        securityModule.rsaSignData(call);
    }

    @PluginMethod
    public void rsaVerifySignature(PluginCall call) {
        securityModule.rsaVerifySignature(call);
    }

    // SM2 Operations
    @PluginMethod
    public void generateSM2Keypair(PluginCall call) {
        securityModule.generateSM2Keypair(call);
    }

    @PluginMethod
    public void injectSM2Key(PluginCall call) {
        securityModule.injectSM2Key(call);
    }

    @PluginMethod
    public void readSM2Key(PluginCall call) {
        securityModule.readSM2Key(call);
    }

    @PluginMethod
    public void sm2Sign(PluginCall call) {
        securityModule.sm2Sign(call);
    }

    @PluginMethod
    public void sm2VerifySign(PluginCall call) {
        securityModule.sm2VerifySign(call);
    }

    @PluginMethod
    public void sm2EncryptData(PluginCall call) {
        securityModule.sm2EncryptData(call);
    }

    @PluginMethod
    public void sm2DecryptData(PluginCall call) {
        securityModule.sm2DecryptData(call);
    }

    // Hash Operations
    @PluginMethod
    public void calcSecHash(PluginCall call) {
        securityModule.calcSecHash(call);
    }

    // Key Injection Operations
    @PluginMethod
    public void injectPlaintextKey(PluginCall call) {
        securityModule.injectPlaintextKey(call);
    }

    @PluginMethod
    public void injectCiphertextKey(PluginCall call) {
        securityModule.injectCiphertextKey(call);
    }

    @PluginMethod
    public void saveTR31Key(PluginCall call) {
        securityModule.saveTR31Key(call);
    }

    // ==================== EMV Operation Module Methods ====================

    @PluginMethod
    public void transactProcess(PluginCall call) {
        emvModule.transactProcess(call);
    }

    @PluginMethod
    public void transactProcessEx(PluginCall call) {
        emvModule.transactProcessEx(call);
    }

    @PluginMethod
    public void abortTransact(PluginCall call) {
        emvModule.abortTransact(call);
    }

    // AID Operations
    @PluginMethod
    public void addAid(PluginCall call) {
        emvModule.addAid(call);
    }

    @PluginMethod
    public void deleteAid(PluginCall call) {
        emvModule.deleteAid(call);
    }

    @PluginMethod
    public void getAidList(PluginCall call) {
        emvModule.getAidList(call);
    }

    // CAPK Operations
    @PluginMethod
    public void addCapk(PluginCall call) {
        emvModule.addCapk(call);
    }

    @PluginMethod
    public void deleteCapk(PluginCall call) {
        emvModule.deleteCapk(call);
    }

    @PluginMethod
    public void getCapkList(PluginCall call) {
        emvModule.getCapkList(call);
    }

    // TLV Operations
    @PluginMethod
    public void getTlv(PluginCall call) {
        emvModule.getTlv(call);
    }

    @PluginMethod
    public void setTlv(PluginCall call) {
        emvModule.setTlv(call);
    }

    @PluginMethod
    public void getTlvList(PluginCall call) {
        emvModule.getTlvList(call);
    }

    // Terminal Parameters
    @PluginMethod
    public void setTermParam(PluginCall call) {
        emvModule.setTermParam(call);
    }

    @PluginMethod
    public void getTermParam(PluginCall call) {
        emvModule.getTermParam(call);
    }

    // EMV Process Control
    @PluginMethod
    public void initEmvProcess(PluginCall call) {
        emvModule.initEmvProcess(call);
    }

    @PluginMethod
    public void importAppSelect(PluginCall call) {
        emvModule.importAppSelect(call);
    }

    @PluginMethod
    public void importAppFinalSelectStatus(PluginCall call) {
        emvModule.importAppFinalSelectStatus(call);
    }

    @PluginMethod
    public void importPinInputStatus(PluginCall call) {
        emvModule.importPinInputStatus(call);
    }

    @PluginMethod
    public void importOnlineProcStatus(PluginCall call) {
        emvModule.importOnlineProcStatus(call);
    }

    @PluginMethod
    public void importSignatureStatus(PluginCall call) {
        emvModule.importSignatureStatus(call);
    }

    @PluginMethod
    public void importCertStatus(PluginCall call) {
        emvModule.importCertStatus(call);
    }

    @PluginMethod
    public void importCardNoStatus(PluginCall call) {
        emvModule.importCardNoStatus(call);
    }

    @PluginMethod
    public void importDataExchangeStatus(PluginCall call) {
        emvModule.importDataExchangeStatus(call);
    }

    // DRL Operations
    @PluginMethod
    public void addDrl(PluginCall call) {
        emvModule.addDrl(call);
    }

    @PluginMethod
    public void deleteDrl(PluginCall call) {
        emvModule.deleteDrl(call);
    }

    // ==================== Printer Operation Module Methods ====================
    // Using SunmiPrinterService from printerlibrary for high-level printing API

    @PluginMethod
    public void printText(PluginCall call) {
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            String text = call.getString("text");
            if (text == null) {
                call.reject("Parameter 'text' is required");
                return;
            }

            printerService.printText(text, innerResultCallback);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "printText error", e);
            call.reject("Failed to print text: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void printTextWithFormat(PluginCall call) {
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            String text = call.getString("text");
            if (text == null) {
                call.reject("Parameter 'text' is required");
                return;
            }
            
            float fontSize = call.getFloat("fontSize", 24f);
            boolean isBold = call.getBoolean("isBold", false);
            boolean isUnderline = call.getBoolean("isUnderline", false);
            int align = call.getInt("align", 0); // 0: left, 1: center, 2: right
            
            // Set alignment
            printerService.setAlignment(align, innerResultCallback);
            
            // Set bold style
            try {
                printerService.setPrinterStyle(WoyouConsts.ENABLE_BOLD, 
                    isBold ? WoyouConsts.ENABLE : WoyouConsts.DISABLE);
            } catch (RemoteException e) {
                // Fallback: use ESC commands for bold
                if (isBold) {
                    printerService.sendRAWData(new byte[]{0x1B, 0x45, 0x01}, innerResultCallback);
                } else {
                    printerService.sendRAWData(new byte[]{0x1B, 0x45, 0x00}, innerResultCallback);
                }
            }
            
            // Set underline style
            try {
                printerService.setPrinterStyle(WoyouConsts.ENABLE_UNDERLINE, 
                    isUnderline ? WoyouConsts.ENABLE : WoyouConsts.DISABLE);
            } catch (RemoteException e) {
                // Fallback: use ESC commands for underline
                if (isUnderline) {
                    printerService.sendRAWData(new byte[]{0x1B, 0x2D, 0x01}, innerResultCallback);
                } else {
                    printerService.sendRAWData(new byte[]{0x1B, 0x2D, 0x00}, innerResultCallback);
                }
            }
            
            // Print with font size
            printerService.printTextWithFont(text, "", fontSize, innerResultCallback);
            
            // Reset styles
            try {
                printerService.setPrinterStyle(WoyouConsts.ENABLE_BOLD, WoyouConsts.DISABLE);
                printerService.setPrinterStyle(WoyouConsts.ENABLE_UNDERLINE, WoyouConsts.DISABLE);
            } catch (RemoteException e) {
                printerService.sendRAWData(new byte[]{0x1B, 0x45, 0x00}, innerResultCallback);
                printerService.sendRAWData(new byte[]{0x1B, 0x2D, 0x00}, innerResultCallback);
            }
            
            // Reset alignment to left
            printerService.setAlignment(0, innerResultCallback);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "printTextWithFormat error", e);
            call.reject("Failed to print text: " + e.getMessage());
        }
    }

    @PluginMethod
    public void printBarcode(PluginCall call) {
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            String data = call.getString("data");
            int barcodeType = call.getInt("barcodeType", 8); // CODE128 default
            int width = call.getInt("width", 2);
            int height = call.getInt("height", 100);

            if (data == null) {
                call.reject("Parameter 'data' is required");
                return;
            }

            printerService.printBarCode(data, barcodeType, height, width, 2, innerResultCallback);
            
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
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            String data = call.getString("data");
            int size = call.getInt("size", 8);
            int errorLevel = call.getInt("errorLevel", 1);

            if (data == null) {
                call.reject("Parameter 'data' is required");
                return;
            }

            printerService.printQRCode(data, size, errorLevel, innerResultCallback);
            
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
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            int lines = call.getInt("lines", 3);
            
            printerService.lineWrap(lines, innerResultCallback);
            
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
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            printerService.cutPaper(innerResultCallback);
            
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
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            int status = printerService.updatePrinterState();
            
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
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            printerService.printerInit(innerResultCallback);
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "initPrinter error", e);
            call.reject("Failed to initialize printer: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void setAlignment(PluginCall call) {
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            int align = call.getInt("align", 0); // 0: left, 1: center, 2: right

            printerService.setAlignment(align, innerResultCallback);

            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "setAlignment error", e);
            call.reject("Failed to set alignment: " + e.getMessage());
        }
    }

    /**
     * Print a table where each row contains N cells laid out with the given
     * per-column widths (in characters) and per-column alignments (0=left,
     * 1=center, 2=right). Each row is rendered by Sunmi's printColumnsString
     * which computes column widths in pixels under the active font, so the
     * caller does not need to pad with spaces manually.
     */
    @PluginMethod
    public void printTable(PluginCall call) {
        if (!printerServiceConnected || printerService == null) {
            call.reject("Print service not connected");
            return;
        }

        try {
            JSArray rowsArray = call.getArray("data");
            JSArray widthsArray = call.getArray("columnWidths");
            JSArray alignsArray = call.getArray("align");

            if (rowsArray == null || widthsArray == null || alignsArray == null) {
                call.reject("Parameters 'data', 'columnWidths' and 'align' are required");
                return;
            }

            int columnCount = widthsArray.length();
            if (columnCount == 0) {
                call.reject("'columnWidths' must contain at least one column");
                return;
            }
            if (alignsArray.length() != columnCount) {
                call.reject("'columnWidths' and 'align' must have the same length");
                return;
            }

            int[] widths = new int[columnCount];
            int[] aligns = new int[columnCount];
            for (int columnIndex = 0; columnIndex < columnCount; columnIndex += 1) {
                widths[columnIndex] = widthsArray.getInt(columnIndex);
                aligns[columnIndex] = alignsArray.getInt(columnIndex);
            }

            int rowCount = rowsArray.length();
            for (int rowIndex = 0; rowIndex < rowCount; rowIndex += 1) {
                org.json.JSONArray rowArray = rowsArray.getJSONArray(rowIndex);
                if (rowArray.length() != columnCount) {
                    call.reject("Row " + rowIndex + " has " + rowArray.length()
                        + " columns, expected " + columnCount);
                    return;
                }

                String[] cells = new String[columnCount];
                for (int columnIndex = 0; columnIndex < columnCount; columnIndex += 1) {
                    cells[columnIndex] = rowArray.getString(columnIndex);
                }

                try {
                    printerService.printColumnsString(cells, widths, aligns, innerResultCallback);
                } catch (RemoteException remoteException) {
                    Log.e(TAG, "printTable row " + rowIndex + " failed", remoteException);
                    call.reject("Failed to print table row " + rowIndex + ": " + remoteException.getMessage());
                    return;
                }
            }

            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "printTable error", e);
            call.reject("Failed to print table: " + e.getMessage());
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
