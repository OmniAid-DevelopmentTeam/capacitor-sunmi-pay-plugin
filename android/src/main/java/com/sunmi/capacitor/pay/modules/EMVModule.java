package com.sunmi.capacitor.pay.modules;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.pay.hardware.aidlv2.bean.AidV2;
import com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2;
import com.sunmi.pay.hardware.aidlv2.emv.EMVListenerV2;
import com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2;

/**
 * EMV Module - Handles EMV transaction processing
 */
public class EMVModule {
    private static final String TAG = "EMVModule";
    private final Context context;
    private EMVOptV2 emvOpt;
    private PluginCall currentCall;

    public EMVModule(Context context) {
        this.context = context;
    }

    public void setEMVOpt(EMVOptV2 emvOpt) {
        Log.d(TAG, "setEMVOpt() called, emvOpt=" + (emvOpt != null ? "NOT NULL" : "NULL"));
        this.emvOpt = emvOpt;
        
        if (emvOpt == null) {
            Log.e(TAG, "❌ EMVOpt is NULL! Cannot initialize EMV parameters");
            return;
        }
        
        // Initialize EMV parameters on SDK connection
        initializeEMVParams();
    }

    /**
     * Initialize EMV parameters with test data
     */
    private void initializeEMVParams() {
        Log.d(TAG, "========================================");
        Log.d(TAG, "=== INITIALIZING EMV PARAMETERS ===");
        Log.d(TAG, "========================================");
        
        try {
            if (emvOpt == null) {
                Log.e(TAG, "❌ emvOpt is NULL in initializeEMVParams()!");
                return;
            }
            
            // Set terminal parameters
            Log.d(TAG, "Setting terminal parameters...");
            Bundle termParams = new Bundle();
            termParams.putString("terminalType", "22");           // Terminal type
            termParams.putString("terminalCapabilities", "E0F8C8"); // Terminal capabilities
            termParams.putString("additionalTerminalCapabilities", "F000F0A001"); // Additional capabilities
            termParams.putString("countryCode", "0643");         // Russia country code (643)
            termParams.putString("currencyCode", "0643");        // Russian Ruble (643)
            termParams.putString("merchantCategoryCode", "0000"); // MCC
            termParams.putString("merchantIdentifier", "000000000000001"); // Merchant ID
            termParams.putString("terminalIdentifier", "00000001"); // Terminal ID
            
            emvOpt.setTermParamEx(termParams);
            Log.d(TAG, "✅ Terminal parameters set");
            
            // Add test AIDs for common card schemes
            Log.d(TAG, "About to call addTestAIDs()...");
            addTestAIDs();
            Log.d(TAG, "addTestAIDs() completed");
            
            // Initialize EMV process
            Log.d(TAG, "Calling initEmvProcess()...");
            int result = emvOpt.initEmvProcess();
            if (result == 0) {
                Log.d(TAG, "✅ EMV process initialized successfully");
            } else {
                Log.e(TAG, "❌ Failed to initialize EMV process: " + result);
            }
            
            Log.d(TAG, "========================================");
            Log.d(TAG, "=== EMV INITIALIZATION COMPLETE ===");
            Log.d(TAG, "========================================");
        } catch (Exception e) {
            Log.e(TAG, "❌ EXCEPTION in initializeEMVParams()", e);
            Log.e(TAG, "Exception message: " + e.getMessage());
            Log.e(TAG, "Exception class: " + e.getClass().getName());
            e.printStackTrace();
        }
    }

    /**
     * Add test AIDs for Visa, Mastercard, UnionPay, etc.
     * We add BOTH contact and contactless versions for maximum compatibility
     */
    private void addTestAIDs() {
        Log.d(TAG, ">>>>>>>>>> addTestAIDs() STARTED <<<<<<<<<<");
        try {
            if (emvOpt == null) {
                Log.e(TAG, "❌ emvOpt is NULL in addTestAIDs()!");
                return;
            }
            
            Log.d(TAG, "Step 1: Deleting existing AIDs...");
            // Delete all existing AIDs first
            int deleteResult = emvOpt.deleteAid(null); // null = delete all
            Log.d(TAG, "Delete existing AIDs result: " + deleteResult + 
                  (deleteResult == 0 ? " (SUCCESS)" : " (FAILED)"));
            
            // Add NFC/contactless versions (paramType=2)
            Log.d(TAG, "Step 2: Adding Visa NFC AID...");
            AidV2 visaAid = createVisaAID(2); // NFC
            int result1 = emvOpt.addAid(visaAid);
            Log.d(TAG, result1 == 0 ? "✅ Visa NFC AID added (result=0)" : 
                  "❌ Failed to add Visa NFC AID: " + result1);
            
            // Add multiple Mastercard AIDs for better coverage
            Log.d(TAG, "Step 3: Adding Mastercard AIDs (NFC)...");
            
            // ==========================================================
            // Mastercard NFC AIDs - comprehensive list
            // ==========================================================
            Log.d(TAG, "Adding Mastercard NFC AIDs...");
            
            // Generic Mastercard RID (most important - catches all MC variants)
            AidV2 mcGenericNfc = createMastercardAID("A000000004", "MC-Generic-NFC", 2);
            int result2a = emvOpt.addAid(mcGenericNfc);
            Log.d(TAG, result2a == 0 ? "✅ MC Generic NFC added" : "❌ Failed MC Generic NFC: " + result2a);
            
            // Mastercard Maestro
            AidV2 mcMaestroNfc = createMastercardAID("A0000000041010", "MC-Maestro-NFC", 2);
            int result2b = emvOpt.addAid(mcMaestroNfc);
            Log.d(TAG, result2b == 0 ? "✅ MC Maestro NFC added" : "❌ Failed: " + result2b);
            
            // Mastercard Credit
            AidV2 mcCreditNfc = createMastercardAID("A0000000048002", "MC-Credit-NFC", 2);
            int result2c = emvOpt.addAid(mcCreditNfc);
            Log.d(TAG, result2c == 0 ? "✅ MC Credit NFC added" : "❌ Failed: " + result2c);
            
            // Mastercard Debit
            AidV2 mcDebitNfc = createMastercardAID("A0000000043060", "MC-Debit-NFC", 2);
            int result2d = emvOpt.addAid(mcDebitNfc);
            Log.d(TAG, result2d == 0 ? "✅ MC Debit NFC added" : "❌ Failed: " + result2d);
            
            // Mastercard International Debit
            AidV2 mcIntlDebitNfc = createMastercardAID("A0000000042203", "MC-IntlDebit-NFC", 2);
            int result2e = emvOpt.addAid(mcIntlDebitNfc);
            Log.d(TAG, result2e == 0 ? "✅ MC IntlDebit NFC added" : "❌ Failed: " + result2e);
            
            // Mastercard US Common Debit
            AidV2 mcUsDebitNfc = createMastercardAID("A0000000042010", "MC-USDebit-NFC", 2);
            int result2f = emvOpt.addAid(mcUsDebitNfc);
            Log.d(TAG, result2f == 0 ? "✅ MC USDebit NFC added" : "❌ Failed: " + result2f);
            
            int result2 = (result2a == 0 || result2b == 0 || result2c == 0 || result2d == 0 || result2e == 0 || result2f == 0) ? 0 : -1;
            
            Log.d(TAG, "Step 4: Adding UnionPay NFC AID...");
            AidV2 cupAid = createUnionPayAID(2); // NFC
            int result3 = emvOpt.addAid(cupAid);
            Log.d(TAG, result3 == 0 ? "✅ UnionPay NFC AID added (result=0)" : 
                  "❌ Failed to add UnionPay NFC AID: " + result3);
            
            // Also add Contact/IC versions (paramType=1) as backup
            Log.d(TAG, "Step 5: Adding Visa IC AID...");
            AidV2 visaIcAid = createVisaAID(1); // IC
            int result4 = emvOpt.addAid(visaIcAid);
            Log.d(TAG, result4 == 0 ? "✅ Visa IC AID added (result=0)" : 
                  "❌ Failed to add Visa IC AID: " + result4);
            
            // Add multiple Mastercard AIDs for IC (Contact)
            Log.d(TAG, "Step 6: Adding Mastercard AIDs (IC)...");
            
            // ==========================================================
            // Mastercard IC/Contact AIDs
            // ==========================================================
            Log.d(TAG, "Adding Mastercard IC AIDs...");
            
            // Generic Mastercard RID for IC
            AidV2 mcGenericIc = createMastercardAID("A000000004", "MC-Generic-IC", 1);
            int result5a = emvOpt.addAid(mcGenericIc);
            Log.d(TAG, result5a == 0 ? "✅ MC Generic IC added" : "❌ Failed: " + result5a);
            
            // Mastercard Maestro IC
            AidV2 mcMaestroIc = createMastercardAID("A0000000041010", "MC-Maestro-IC", 1);
            int result5b = emvOpt.addAid(mcMaestroIc);
            Log.d(TAG, result5b == 0 ? "✅ MC Maestro IC added" : "❌ Failed: " + result5b);
            
            // Mastercard Credit IC
            AidV2 mcCreditIc = createMastercardAID("A0000000048002", "MC-Credit-IC", 1);
            int result5c = emvOpt.addAid(mcCreditIc);
            Log.d(TAG, result5c == 0 ? "✅ MC Credit IC added" : "❌ Failed: " + result5c);
            
            // Mastercard Debit IC
            AidV2 mcDebitIc = createMastercardAID("A0000000043060", "MC-Debit-IC", 1);
            int result5d = emvOpt.addAid(mcDebitIc);
            Log.d(TAG, result5d == 0 ? "✅ MC Debit IC added" : "❌ Failed: " + result5d);
            
            // Mastercard International Debit IC
            AidV2 mcIntlDebitIc = createMastercardAID("A0000000042203", "MC-IntlDebit-IC", 1);
            int result5e = emvOpt.addAid(mcIntlDebitIc);
            Log.d(TAG, result5e == 0 ? "✅ MC IntlDebit IC added" : "❌ Failed: " + result5e);
            
            // Mastercard US Common Debit IC
            AidV2 mcUsDebitIc = createMastercardAID("A0000000042010", "MC-USDebit-IC", 1);
            int result5f = emvOpt.addAid(mcUsDebitIc);
            Log.d(TAG, result5f == 0 ? "✅ MC USDebit IC added" : "❌ Failed: " + result5f);
            
            int result5 = (result5a == 0 || result5b == 0 || result5c == 0 || result5d == 0 || result5e == 0 || result5f == 0) ? 0 : -1;
            
            Log.d(TAG, "Step 7: Adding UnionPay IC AID...");
            AidV2 cupIcAid = createUnionPayAID(1); // IC
            int result6 = emvOpt.addAid(cupIcAid);
            Log.d(TAG, result6 == 0 ? "✅ UnionPay IC AID added (result=0)" : 
                  "❌ Failed to add UnionPay IC AID: " + result6);
            
            Log.d(TAG, "Step 8: Summary:");
            Log.d(TAG, "  - Visa: " + (result1 == 0 && result4 == 0 ? "✅" : "❌"));
            Log.d(TAG, "  - Mastercard: " + (result2 == 0 && result5 == 0 ? "✅" : "❌") + " (added multiple AIDs)");
            Log.d(TAG, "  - UnionPay: " + (result3 == 0 && result6 == 0 ? "✅" : "❌"));
            
            // Count minimum - each payment system gets 1 point if at least one AID succeeded
            int successCount = 0;
            if (result1 == 0) successCount++; // Visa
            if (result2 == 0) successCount++; // Mastercard (any)
            if (result3 == 0) successCount++; // UnionPay
            if (result4 == 0 && result1 != 0) successCount++; // Visa IC (if NFC failed)
            if (result5 == 0 && result2 != 0) successCount++; // MC IC (if NFC failed)
            if (result6 == 0 && result3 != 0) successCount++; // CUP IC (if NFC failed)
            
            if (successCount > 0) {
                Log.d(TAG, "✅ AIDs configured for " + successCount + " payment systems");
            } else {
                Log.e(TAG, "========================================");
                Log.e(TAG, "❌ CRITICAL: Failed to add ANY AIDs!");
                Log.e(TAG, "❌ EMV transactions WILL FAIL with -4125");
                Log.e(TAG, "========================================");
            }
            
        } catch (Exception e) {
            Log.e(TAG, "❌ EXCEPTION in addTestAIDs()", e);
            Log.e(TAG, "Exception message: " + e.getMessage());
            Log.e(TAG, "Exception class: " + e.getClass().getName());
            e.printStackTrace();
        }
        Log.d(TAG, ">>>>>>>>>> addTestAIDs() COMPLETED <<<<<<<<<<");
    }

    /**
     * Create Visa AID configuration (short AID for broader matching)
     * @param paramType 1=Contact(IC), 2=Contactless(NFC)
     */
    private AidV2 createVisaAID(int paramType) {
        AidV2 aid = new AidV2();
        // Shorter AID for partial match - matches ANY Visa app (A0000000031XXX)
        aid.aid = hexStringToBytes("A000000003"); // Visa RID only - will match all Visa
        aid.selFlag = 0; // 0 = Partial match
        aid.targetPer = 0;
        aid.maxTargetPer = 0;
        aid.floorLimit = new byte[]{0x00, 0x00, 0x00, 0x00};
        aid.threshold = new byte[]{0x00, 0x00, 0x00, 0x00};
        aid.TACDenial = hexStringToBytes("0000000000");
        aid.TACOnline = hexStringToBytes("DC4004F800");
        aid.TACDefault = hexStringToBytes("DC4000A800");
        aid.AcquierId = hexStringToBytes("000000000000");
        aid.dDOL = hexStringToBytes("9F3704"); // DDOL
        aid.tDOL = new byte[0]; // Empty TDOL
        aid.version = hexStringToBytes("008C"); // Version
        aid.rMDLen = 0;
        aid.kernelType = 3; // ⭐ Visa Kernel (PayWave)
        aid.paramType = (byte) paramType;  // ⭐ Set based on parameter
        aid.ttq = hexStringToBytes("F6204000"); // Terminal Transaction Qualifiers for PayWave
        return aid;
    }

    /**
     * Create Mastercard AID configuration with specific AID
     * @param aidHex The AID in hex string format
     * @param name Friendly name for logging
     * @param paramType 1=Contact(IC), 2=Contactless(NFC), 3=Both
     */
    private AidV2 createMastercardAID(String aidHex, String name, int paramType) {
        AidV2 aid = new AidV2();
        aid.aid = hexStringToBytes(aidHex);
        // Use partial match (0) for short AIDs (RID only), exact match (1) for longer specific AIDs
        aid.selFlag = (byte) (aidHex.length() <= 10 ? 0 : 0); // Partial matching for better compatibility
        aid.targetPer = 0;
        aid.maxTargetPer = 0;
        aid.floorLimit = new byte[]{0x00, 0x00, 0x00, 0x00};
        aid.threshold = new byte[]{0x00, 0x00, 0x00, 0x00};
        aid.TACDenial = hexStringToBytes("0000000000");
        aid.TACOnline = hexStringToBytes("FC50ACF800"); // Mastercard TAC Online
        aid.TACDefault = hexStringToBytes("FC50ACA000"); // Mastercard TAC Default
        aid.AcquierId = hexStringToBytes("000000000000");
        aid.dDOL = hexStringToBytes("9F3704"); // Default DDOL
        aid.tDOL = new byte[0]; // Empty TDOL
        aid.version = hexStringToBytes("0002"); // Mastercard version
        aid.rMDLen = 0;
        aid.kernelType = 2; // ⭐ Mastercard Kernel (PayPass/M-Chip)
        aid.paramType = (byte) paramType;  // ⭐ Set based on parameter
        // TTQ for Mastercard contactless - supports MSD and qVSDC
        aid.ttq = hexStringToBytes("F6E0C000"); // More permissive TTQ for Mastercard
        return aid;
    }

    /**
     * Create UnionPay AID configuration (short AID for broader matching)
     * @param paramType 1=Contact(IC), 2=Contactless(NFC)
     */
    private AidV2 createUnionPayAID(int paramType) {
        AidV2 aid = new AidV2();
        // Shorter AID for partial match - matches ANY UnionPay app (A000000333XXXXXX)
        aid.aid = hexStringToBytes("A000000333"); // UnionPay RID only - will match all CUP
        aid.selFlag = 0; // 0 = Partial match
        aid.targetPer = 0;
        aid.maxTargetPer = 0;
        aid.floorLimit = new byte[]{0x00, 0x00, 0x00, 0x00};
        aid.threshold = new byte[]{0x00, 0x00, 0x00, 0x00};
        aid.TACDenial = hexStringToBytes("0000000000");
        aid.TACOnline = hexStringToBytes("DC4004F800");
        aid.TACDefault = hexStringToBytes("DC4000A800");
        aid.AcquierId = hexStringToBytes("000000000000");
        aid.dDOL = hexStringToBytes("9F3704"); // DDOL
        aid.tDOL = new byte[0]; // Empty TDOL
        aid.version = hexStringToBytes("0001"); // Version
        aid.rMDLen = 0;
        aid.kernelType = 1; // ⭐ UnionPay Kernel (QPBOC)
        aid.paramType = (byte) paramType;  // ⭐ Set based on parameter
        aid.ttq = hexStringToBytes("F6204000"); // Terminal Transaction Qualifiers for QuickPass
        return aid;
    }

    /**
     * Convert hex string to byte array
     */
    private byte[] hexStringToBytes(String hex) {
        if (hex == null || hex.length() == 0) {
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

    /**
     * Process EMV transaction
     */
    public void transactProcess(PluginCall call) {
        if (emvOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            JSObject transDataObj = call.getObject("transData");
            if (transDataObj == null) {
                call.reject("Parameter 'transData' is required");
                return;
            }

            // Create EMVTransDataV2 from JSObject
            EMVTransDataV2 transData = new EMVTransDataV2();
            
            // Required: amount (in cents)
            String amount = transDataObj.getString("amount");
            if (amount == null) {
                call.reject("'amount' is required in transData");
                return;
            }
            transData.amount = amount;

            // Optional: transaction type (default: "00" - purchase)
            String transType = transDataObj.getString("transType", "00");
            transData.transType = transType;

            // Optional: flow type (default: 0x01 - standard authorization)
            Integer flowType = transDataObj.getInteger("flowType", 0x01);
            transData.flowType = flowType;

            // Optional: card type (default: 2 - IC card)
            Integer cardType = transDataObj.getInteger("cardType", 2);
            transData.cardType = cardType;

            Log.d(TAG, "=== TRANSACT PROCESS DEBUG ===");
            Log.d(TAG, "Amount: " + transData.amount + " cents");
            Log.d(TAG, "Trans Type: " + transData.transType);
            Log.d(TAG, "Flow Type: 0x" + Integer.toHexString(transData.flowType));
            Log.d(TAG, "Card Type: " + transData.cardType);

            currentCall = call;

            // Call SDK method
            emvOpt.transactProcess(transData, mEMVListener);
            Log.d(TAG, "transactProcess() called successfully");

        } catch (Exception e) {
            Log.e(TAG, "transactProcess error", e);
            call.reject("Failed to process transaction: " + e.getMessage());
        }
    }

    /**
     * Process EMV transaction (extended method with Bundle)
     */
    public void transactProcessEx(PluginCall call) {
        if (emvOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            // For now, delegate to transactProcess
            // TransactProcessEx uses Bundle instead of EMVTransDataV2, allowing more flexibility
            call.reject("transactProcessEx not yet implemented - use transactProcess instead");
        } catch (Exception e) {
            Log.e(TAG, "transactProcessEx error", e);
            call.reject("Failed to process transaction (Ex): " + e.getMessage());
        }
    }

    /**
     * Abort current EMV transaction
     */
    public void abortTransact(PluginCall call) {
        if (emvOpt == null) {
            call.reject("SDK not initialized");
            return;
        }

        try {
            emvOpt.abortTransactProcess();
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "abortTransact error", e);
            call.reject("Failed to abort transaction: " + e.getMessage());
        }
    }

    /**
     * EMV Listener for transaction callbacks
     */
    private final EMVListenerV2.Stub mEMVListener = new EMVListenerV2.Stub() {
        @Override
        public void onWaitAppSelect(java.util.List<com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2> appList, boolean isFirstSelect) throws RemoteException {
            Log.d(TAG, "=== EMV: WAIT APP SELECT ===");
            Log.d(TAG, "App List: " + (appList != null ? appList.size() + " apps" : "null"));
            Log.d(TAG, "Is First Select: " + isFirstSelect);
            
            // For simplicity, auto-select first app
            if (appList != null && !appList.isEmpty()) {
                try {
                    emvOpt.importAppSelect(0); // Select first app
                    Log.d(TAG, "Auto-selected first app (index 0)");
                } catch (RemoteException e) {
                    Log.e(TAG, "Failed to import app select", e);
                }
            }
        }

        @Override
        public void onAppFinalSelect(String tag9F06Value) throws RemoteException {
            Log.d(TAG, "=== EMV: APP FINAL SELECT ===");
            Log.d(TAG, "AID (9F06): " + tag9F06Value);
            
            // Confirm app selection
            try {
                emvOpt.importAppFinalSelectStatus(0); // 0 = success
                Log.d(TAG, "App final select confirmed");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import app final select status", e);
            }
        }

        @Override
        public void onRequestShowPinPad(int pinType, int remainTime) throws RemoteException {
            Log.d(TAG, "=== EMV: REQUEST SHOW PIN PAD ===");
            Log.d(TAG, "PIN Type: " + pinType);
            Log.d(TAG, "Remain Time: " + remainTime);
            
            // PIN input was already done via initPinPad(), so we can import success
            try {
                emvOpt.importPinInputStatus(pinType, 0); // 0 = success
                Log.d(TAG, "PIN input status imported (success)");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import PIN input status", e);
            }
        }

        @Override
        public void onRequestSignature() throws RemoteException {
            Log.d(TAG, "=== EMV: REQUEST SIGNATURE ===");
            
            // Auto-approve signature for demo purposes
            try {
                emvOpt.importSignatureStatus(0); // 0 = success
                Log.d(TAG, "Signature approved");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import signature status", e);
            }
        }

        @Override
        public void onCertVerify(int certType, String certInfo) throws RemoteException {
            Log.d(TAG, "=== EMV: CERT VERIFY ===");
            Log.d(TAG, "Cert Type: " + certType);
            Log.d(TAG, "Cert Info: " + certInfo);
            
            // Auto-approve certificate
            try {
                emvOpt.importCertStatus(0); // 0 = success
                Log.d(TAG, "Certificate approved");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import cert status", e);
            }
        }

        @Override
        public void onOnlineProc() throws RemoteException {
            Log.d(TAG, "=== EMV: ONLINE PROCESSING ===");
            
            // This is where you would send data to the payment server
            // For now, we'll simulate a successful online response
            try {
                // Import online processing status (0 = success/approval)
                byte[] outData = new byte[512];
                emvOpt.importOnlineProcStatus(0, new String[0], new String[0], outData);
                Log.d(TAG, "Online processing status imported (simulated approval)");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import online processing status", e);
            }
        }

        @Override
        public void onCardDataExchangeComplete() throws RemoteException {
            Log.d(TAG, "=== EMV: CARD DATA EXCHANGE COMPLETE ===");
            
            // Indicate data exchange was successful
            try {
                emvOpt.importDataExchangeStatus(0); // 0 = success
                Log.d(TAG, "Data exchange status imported (success)");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import data exchange status", e);
            }
        }

        @Override
        public void onTransResult(int code, String desc) throws RemoteException {
            Log.d(TAG, "=== EMV: TRANSACTION RESULT ===");
            Log.d(TAG, "Code: " + code);
            Log.d(TAG, "Description: " + desc);
            Log.d(TAG, "=== END EMV TRANSACTION ===");

            if (currentCall != null) {
                JSObject result = new JSObject();
                result.put("code", code);
                result.put("desc", desc);
                result.put("success", code == 0);
                
                if (code == 0) {
                    currentCall.resolve(result);
                } else {
                    currentCall.reject("Transaction failed: " + desc + " (code: " + code + ")");
                }
                currentCall = null;
            }
        }

        @Override
        public void onConfirmCardNo(String cardNo) throws RemoteException {
            Log.d(TAG, "=== EMV: CONFIRM CARD NO ===");
            Log.d(TAG, "Card No: " + cardNo.substring(0, 6) + "******" + cardNo.substring(cardNo.length() - 4));
            
            // Auto-confirm card number
            try {
                emvOpt.importCardNoStatus(0); // 0 = confirmed
                Log.d(TAG, "Card number confirmed");
            } catch (RemoteException e) {
                Log.e(TAG, "Failed to import card number status", e);
            }
        }

        @Override
        public void onConfirmationCodeVerified() throws RemoteException {
            Log.d(TAG, "=== EMV: CONFIRMATION CODE VERIFIED ===");
        }

        @Override
        public void onRequestDataExchange(String cardNo) throws RemoteException {
            Log.d(TAG, "=== EMV: REQUEST DATA EXCHANGE ===");
            Log.d(TAG, "Card No: " + (cardNo != null && cardNo.length() > 10 ? 
                cardNo.substring(0, 6) + "******" + cardNo.substring(cardNo.length() - 4) : cardNo));
        }

        @Override
        public void onTermRiskManagement() throws RemoteException {
            Log.d(TAG, "=== EMV: TERMINAL RISK MANAGEMENT ===");
        }

        @Override
        public void onPreFirstGenAC() throws RemoteException {
            Log.d(TAG, "=== EMV: PRE FIRST GEN AC ===");
        }

        @Override
        public void onDataStorageProc(String[] containerID, String[] containerContent) throws RemoteException {
            Log.d(TAG, "=== EMV: DATA STORAGE PROC ===");
            Log.d(TAG, "Container IDs: " + (containerID != null ? containerID.length : 0));
        }
    };
}

