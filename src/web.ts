import { WebPlugin } from '@capacitor/core';

import type { SunmiPayPlugin } from './definitions';

/**
 * Web implementation of Sunmi Pay Plugin
 * This is a stub implementation for web/PWA environments
 * The actual Sunmi hardware is only available on Android devices
 */
export class SunmiPayWeb extends WebPlugin implements SunmiPayPlugin {
  constructor() {
    super();
  }

  private notAvailable(methodName: string): Promise<any> {
    const error = `${methodName}() is not available on web platform. This plugin requires Sunmi POS hardware.`;
    console.warn(error);
    return Promise.reject(error);
  }

  // SDK Lifecycle
  async initPaySDK(): Promise<{ success: boolean }> {
    return this.notAvailable('initPaySDK');
  }

  async destroyPaySDK(): Promise<{ success: boolean }> {
    return this.notAvailable('destroyPaySDK');
  }

  async getPaySDKVersion(): Promise<{ version: string }> {
    return this.notAvailable('getPaySDKVersion');
  }

  async setEmvL2Split(): Promise<{ success: boolean }> {
    return this.notAvailable('setEmvL2Split');
  }

  // Basic Operations
  async getSysParam(): Promise<{ value: string }> {
    return this.notAvailable('getSysParam');
  }

  async setSysParam(): Promise<{ success: boolean }> {
    return this.notAvailable('setSysParam');
  }

  async buzzerOnDevice(): Promise<{ success: boolean }> {
    return this.notAvailable('buzzerOnDevice');
  }

  async ledStatusOnDevice(): Promise<{ success: boolean }> {
    return this.notAvailable('ledStatusOnDevice');
  }

  async ledStatusOnDeviceEx(): Promise<{ success: boolean }> {
    return this.notAvailable('ledStatusOnDeviceEx');
  }

  async setScreenMode(): Promise<{ success: boolean }> {
    return this.notAvailable('setScreenMode');
  }

  async sysGetRandom(): Promise<{ data: string }> {
    return this.notAvailable('sysGetRandom');
  }

  async setStatusBarDropDownMode(): Promise<{ success: boolean }> {
    return this.notAvailable('setStatusBarDropDownMode');
  }

  async setNavigationBarVisibility(): Promise<{ success: boolean }> {
    return this.notAvailable('setNavigationBarVisibility');
  }

  async setHideNavigationBarItems(): Promise<{ success: boolean }> {
    return this.notAvailable('setHideNavigationBarItems');
  }

  async sysPowerManage(): Promise<{ success: boolean }> {
    return this.notAvailable('sysPowerManage');
  }

  async setScheduleReboot(): Promise<{ success: boolean }> {
    return this.notAvailable('setScheduleReboot');
  }

  async clearScheduleReboot(): Promise<{ success: boolean }> {
    return this.notAvailable('clearScheduleReboot');
  }

  async sysSetWakeup(): Promise<{ success: boolean }> {
    return this.notAvailable('sysSetWakeup');
  }

  async getCardUsageCount(): Promise<{ count: number }> {
    return this.notAvailable('getCardUsageCount');
  }

  async getModuleAccessibility(): Promise<{ ability: number }> {
    return this.notAvailable('getModuleAccessibility');
  }

  async setModuleAccessibility(): Promise<{ success: boolean }> {
    return this.notAvailable('setModuleAccessibility');
  }

  async getPedMode(): Promise<{ mode: number }> {
    return this.notAvailable('getPedMode');
  }

  async setPedMode(): Promise<{ success: boolean }> {
    return this.notAvailable('setPedMode');
  }

  async installSharedLib(): Promise<{ success: boolean }> {
    return this.notAvailable('installSharedLib');
  }

  async deleteSharedLib(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteSharedLib');
  }

  async getRtcBatVol(): Promise<{ vol: number; fromAdc: number }> {
    return this.notAvailable('getRtcBatVol');
  }

  // Card Operations
  async checkCard(): Promise<any> {
    return this.notAvailable('checkCard');
  }

  async checkCardEx(): Promise<any> {
    return this.notAvailable('checkCardEx');
  }

  async checkCardEnc(): Promise<any> {
    return this.notAvailable('checkCardEnc');
  }

  async cancelCheckCard(): Promise<{ success: boolean }> {
    return this.notAvailable('cancelCheckCard');
  }

  async apduCommand(): Promise<any> {
    return this.notAvailable('apduCommand');
  }

  async smartCardExchange(): Promise<{ apduRecv: string }> {
    return this.notAvailable('smartCardExchange');
  }

  async transmitApdu(): Promise<{ recvBuff: string }> {
    return this.notAvailable('transmitApdu');
  }

  async transmitApduEx(): Promise<{ recvBuff: string }> {
    return this.notAvailable('transmitApduEx');
  }

  async transmitApduExx(): Promise<{ recvBuff: string }> {
    return this.notAvailable('transmitApduExx');
  }

  async transmitMultiApdus(): Promise<{ recvList: string[] }> {
    return this.notAvailable('transmitMultiApdus');
  }

  async cardOff(): Promise<{ success: boolean }> {
    return this.notAvailable('cardOff');
  }

  async getCardExistStatus(): Promise<{ status: number }> {
    return this.notAvailable('getCardExistStatus');
  }

  // Mifare Operations
  async mifareAuth(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareAuth');
  }

  async mifareReadBlock(): Promise<{ data: string }> {
    return this.notAvailable('mifareReadBlock');
  }

  async mifareWriteBlock(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareWriteBlock');
  }

  async mifareIncValue(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareIncValue');
  }

  async mifareDecValue(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareDecValue');
  }

  async mifareIncValueDx(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareIncValueDx');
  }

  async mifareDecValueDx(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareDecValueDx');
  }

  async mifareTransfer(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareTransfer');
  }

  async mifareRestore(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareRestore');
  }

  // Mifare Ultralight C
  async mifareUltralightCAuth(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareUltralightCAuth');
  }

  async mifareUltralightCReadData(): Promise<{ data: string }> {
    return this.notAvailable('mifareUltralightCReadData');
  }

  async mifareUltralightCWriteData(): Promise<{ success: boolean }> {
    return this.notAvailable('mifareUltralightCWriteData');
  }

  // Mifare Plus
  async mifarePlusReadBlock(): Promise<{ data: string }> {
    return this.notAvailable('mifarePlusReadBlock');
  }

  async mifarePlusWriteBlock(): Promise<{ success: boolean }> {
    return this.notAvailable('mifarePlusWriteBlock');
  }

  async mifarePlusChangeBlockKey(): Promise<{ success: boolean }> {
    return this.notAvailable('mifarePlusChangeBlockKey');
  }

  // SLE Operations
  async sleAuthKey(): Promise<{ success: boolean }> {
    return this.notAvailable('sleAuthKey');
  }

  async sleChangeKey(): Promise<{ success: boolean }> {
    return this.notAvailable('sleChangeKey');
  }

  async sleReadData(): Promise<{ data: string }> {
    return this.notAvailable('sleReadData');
  }

  async sleWriteData(): Promise<{ success: boolean }> {
    return this.notAvailable('sleWriteData');
  }

  async sleGetRemainAuthCount(): Promise<{ count: number }> {
    return this.notAvailable('sleGetRemainAuthCount');
  }

  async sleWriteProtectionMemory(): Promise<{ success: boolean }> {
    return this.notAvailable('sleWriteProtectionMemory');
  }

  async sleReadMemoryProtectionStatus(): Promise<{ status: string }> {
    return this.notAvailable('sleReadMemoryProtectionStatus');
  }

  // AT24C Operations
  async at24cReadData(): Promise<{ data: string }> {
    return this.notAvailable('at24cReadData');
  }

  async at24cWriteData(): Promise<{ success: boolean }> {
    return this.notAvailable('at24cWriteData');
  }

  // AT88SC Operations
  async at88scAuthKey(): Promise<{ success: boolean }> {
    return this.notAvailable('at88scAuthKey');
  }

  async at88scChangeKey(): Promise<{ success: boolean }> {
    return this.notAvailable('at88scChangeKey');
  }

  async at88scReadData(): Promise<{ data: string }> {
    return this.notAvailable('at88scReadData');
  }

  async at88scWriteData(): Promise<{ success: boolean }> {
    return this.notAvailable('at88scWriteData');
  }

  async at88scGetRemainAuthCount(): Promise<{ count: number }> {
    return this.notAvailable('at88scGetRemainAuthCount');
  }

  // CTX512B Operations
  async ctx512ReadBlock(): Promise<{ data: string }> {
    return this.notAvailable('ctx512ReadBlock');
  }

  async ctx512WriteBlock(): Promise<{ success: boolean }> {
    return this.notAvailable('ctx512WriteBlock');
  }

  async ctx512UpdateBlock(): Promise<{ success: boolean }> {
    return this.notAvailable('ctx512UpdateBlock');
  }

  async ctx512GetSignature(): Promise<{ signature: string }> {
    return this.notAvailable('ctx512GetSignature');
  }

  async ctx512MultiReadBlock(): Promise<{ data: string }> {
    return this.notAvailable('ctx512MultiReadBlock');
  }

  async smartCardIoControl(): Promise<{ dataOut: string }> {
    return this.notAvailable('smartCardIoControl');
  }

  async smartCardExChangePASS(): Promise<{ apduRecv: string }> {
    return this.notAvailable('smartCardExChangePASS');
  }

  async smartCardExChangePASSNoLength(): Promise<{ apduRecv: string }> {
    return this.notAvailable('smartCardExChangePASSNoLength');
  }

  // PinPad Operations (stub implementations for remaining methods)
  async initPinPad(): Promise<{ pinBlock: string; confirmed: boolean }> {
    return this.notAvailable('initPinPad');
  }

  async initPinPadEx(): Promise<{ pinBlock: string; confirmed: boolean }> {
    return this.notAvailable('initPinPadEx');
  }

  async importPinPadData(): Promise<{ success: boolean }> {
    return this.notAvailable('importPinPadData');
  }

  async importPinPadDataEx(): Promise<{ success: boolean }> {
    return this.notAvailable('importPinPadDataEx');
  }

  async cancelInputPin(): Promise<{ success: boolean }> {
    return this.notAvailable('cancelInputPin');
  }

  async setPinPadText(): Promise<{ success: boolean }> {
    return this.notAvailable('setPinPadText');
  }

  async setPinPadMode(): Promise<{ success: boolean }> {
    return this.notAvailable('setPinPadMode');
  }

  async getPinPadMode(): Promise<any> {
    return this.notAvailable('getPinPadMode');
  }

  async setAntiExhaustiveProtectionMode(): Promise<{ waitTime: number }> {
    return this.notAvailable('setAntiExhaustiveProtectionMode');
  }

  async getAntiExhaustiveProtectionMode(): Promise<{ level: number }> {
    return this.notAvailable('getAntiExhaustiveProtectionMode');
  }

  async setVisualImpairmentModeParam(): Promise<{ success: boolean }> {
    return this.notAvailable('setVisualImpairmentModeParam');
  }

  async getVisualImpairmentModeParam(): Promise<any> {
    return this.notAvailable('getVisualImpairmentModeParam');
  }

  async startInputPin(): Promise<{ success: boolean }> {
    return this.notAvailable('startInputPin');
  }

  async getPinBlock(): Promise<{ pinBlock: string }> {
    return this.notAvailable('getPinBlock');
  }

  async offlinePinVerify(): Promise<{ sw1: number; sw2: number }> {
    return this.notAvailable('offlinePinVerify');
  }

  // Security Operations (stub implementations)
  async savePlaintextKey(): Promise<{ success: boolean }> {
    return this.notAvailable('savePlaintextKey');
  }

  async saveCiphertextKey(): Promise<{ success: boolean }> {
    return this.notAvailable('saveCiphertextKey');
  }

  async saveKeyEx(): Promise<{ success: boolean }> {
    return this.notAvailable('saveKeyEx');
  }

  async calcMac(): Promise<{ dataOut: string }> {
    return this.notAvailable('calcMac');
  }

  async calcMacEx(): Promise<{ dataOut: string }> {
    return this.notAvailable('calcMacEx');
  }

  async verifyMac(): Promise<{ success: boolean }> {
    return this.notAvailable('verifyMac');
  }

  async dataEncrypt(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataEncrypt');
  }

  async dataDecrypt(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataDecrypt');
  }

  async dataEncryptEx(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataEncryptEx');
  }

  async dataDecryptEx(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataDecryptEx');
  }

  // DUKPT Operations
  async saveKeyDukpt(): Promise<{ success: boolean }> {
    return this.notAvailable('saveKeyDukpt');
  }

  async saveKeyDukptAES(): Promise<{ success: boolean }> {
    return this.notAvailable('saveKeyDukptAES');
  }

  async calcMacDukpt(): Promise<{ dataOut: string }> {
    return this.notAvailable('calcMacDukpt');
  }

  async calcMacDukptEx(): Promise<{ dataOut: string }> {
    return this.notAvailable('calcMacDukptEx');
  }

  async verifyMacDukpt(): Promise<{ success: boolean }> {
    return this.notAvailable('verifyMacDukpt');
  }

  async verifyMacDukptEx(): Promise<{ success: boolean }> {
    return this.notAvailable('verifyMacDukptEx');
  }

  async dataEncryptDukpt(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataEncryptDukpt');
  }

  async dataDecryptDukpt(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataDecryptDukpt');
  }

  async dataEncryptDukptEx(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataEncryptDukptEx');
  }

  async dataDecryptDukptEx(): Promise<{ dataOut: string }> {
    return this.notAvailable('dataDecryptDukptEx');
  }

  async dukptIncreaseKSN(): Promise<{ success: boolean }> {
    return this.notAvailable('dukptIncreaseKSN');
  }

  async dukptCurrentKSN(): Promise<{ ksn: string }> {
    return this.notAvailable('dukptCurrentKSN');
  }

  async dukptGetInitKSN(): Promise<{ ksn: string }> {
    return this.notAvailable('dukptGetInitKSN');
  }

  async getKeyCheckValue(): Promise<{ checkValue: string }> {
    return this.notAvailable('getKeyCheckValue');
  }

  async getKeyLength(): Promise<{ length: number }> {
    return this.notAvailable('getKeyLength');
  }

  async deleteKey(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteKey');
  }

  async deleteKeyEx(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteKeyEx');
  }

  async getTUSNEncryptData(): Promise<{ dataOut: string }> {
    return this.notAvailable('getTUSNEncryptData');
  }

  async injectPlaintextKey(): Promise<{ success: boolean }> {
    return this.notAvailable('injectPlaintextKey');
  }

  async injectCiphertextKey(): Promise<{ success: boolean }> {
    return this.notAvailable('injectCiphertextKey');
  }

  async injectCiphertextKeyEx(): Promise<{ success: boolean }> {
    return this.notAvailable('injectCiphertextKeyEx');
  }

  async injectKeyDukptEx(): Promise<{ success: boolean }> {
    return this.notAvailable('injectKeyDukptEx');
  }

  async saveTR31Key(): Promise<{ success: boolean }> {
    return this.notAvailable('saveTR31Key');
  }

  async injectTR31Key(): Promise<{ success: boolean }> {
    return this.notAvailable('injectTR31Key');
  }

  async writeKeyVariable(): Promise<{ success: boolean }> {
    return this.notAvailable('writeKeyVariable');
  }

  async readKeyVariable(): Promise<{ variable: string }> {
    return this.notAvailable('readKeyVariable');
  }

  // RSA Operations
  async generateRSAKeypair(): Promise<{ success: boolean }> {
    return this.notAvailable('generateRSAKeypair');
  }

  async generateRSAKeypairEx(): Promise<{ module: string }> {
    return this.notAvailable('generateRSAKeypairEx');
  }

  async injectRSAKeyEx(): Promise<{ success: boolean }> {
    return this.notAvailable('injectRSAKeyEx');
  }

  async readRSAKey(): Promise<{ keyData: string }> {
    return this.notAvailable('readRSAKey');
  }

  async rsaEncryptOrDecryptData(): Promise<{ dataOut: string }> {
    return this.notAvailable('rsaEncryptOrDecryptData');
  }

  async rsaSignData(): Promise<{ signature: string }> {
    return this.notAvailable('rsaSignData');
  }

  async rsaVerifySignature(): Promise<{ success: boolean }> {
    return this.notAvailable('rsaVerifySignature');
  }

  async injectCiphertextKeyUnderRSA(): Promise<{ success: boolean }> {
    return this.notAvailable('injectCiphertextKeyUnderRSA');
  }

  // SM2/SM3/SM4 Operations
  async generateSM2Keypair(): Promise<{ pubKey: string }> {
    return this.notAvailable('generateSM2Keypair');
  }

  async injectSM2Key(): Promise<{ success: boolean }> {
    return this.notAvailable('injectSM2Key');
  }

  async readSM2Key(): Promise<{ keyData: string }> {
    return this.notAvailable('readSM2Key');
  }

  async sm2Sign(): Promise<{ signature: string }> {
    return this.notAvailable('sm2Sign');
  }

  async sm2VerifySign(): Promise<{ success: boolean }> {
    return this.notAvailable('sm2VerifySign');
  }

  async sm2SingleSign(): Promise<{ signature: string }> {
    return this.notAvailable('sm2SingleSign');
  }

  async sm2EncryptData(): Promise<{ dataOut: string }> {
    return this.notAvailable('sm2EncryptData');
  }

  async sm2DecryptData(): Promise<{ dataOut: string }> {
    return this.notAvailable('sm2DecryptData');
  }

  async calcSecHash(): Promise<{ hash: string }> {
    return this.notAvailable('calcSecHash');
  }

  async calcSM3HashWithID(): Promise<{ hash: string }> {
    return this.notAvailable('calcSM3HashWithID');
  }

  // Symmetric Key Operations
  async generateSymKey(): Promise<{ success: boolean }> {
    return this.notAvailable('generateSymKey');
  }

  async generateSymKeyEx(): Promise<{ success: boolean }> {
    return this.notAvailable('generateSymKeyEx');
  }

  async injectSymKey(): Promise<{ success: boolean }> {
    return this.notAvailable('injectSymKey');
  }

  async injectSymKeyEx(): Promise<{ success: boolean }> {
    return this.notAvailable('injectSymKeyEx');
  }

  async queryKeyMappingRecordList(): Promise<{ records: any[] }> {
    return this.notAvailable('queryKeyMappingRecordList');
  }

  async queryKeyMappingRecordListWL(): Promise<{ records: any[] }> {
    return this.notAvailable('queryKeyMappingRecordListWL');
  }

  async apacsMac(): Promise<{ mac: string }> {
    return this.notAvailable('apacsMac');
  }

  async secKeyIoControl(): Promise<{ dataOut: string }> {
    return this.notAvailable('secKeyIoControl');
  }

  async saveBaseKey(): Promise<{ success: boolean }> {
    return this.notAvailable('saveBaseKey');
  }

  async injectDeviceCertPrivateKey(): Promise<{ success: boolean }> {
    return this.notAvailable('injectDeviceCertPrivateKey');
  }

  async setDeviceCertificate(): Promise<{ success: boolean }> {
    return this.notAvailable('setDeviceCertificate');
  }

  // Printer Operations
  async printText(): Promise<{ success: boolean }> {
    return this.notAvailable('printText');
  }

  async printTextWithFormat(): Promise<{ success: boolean }> {
    return this.notAvailable('printTextWithFormat');
  }

  async printBarcode(): Promise<{ success: boolean }> {
    return this.notAvailable('printBarcode');
  }

  async printQRCode(): Promise<{ success: boolean }> {
    return this.notAvailable('printQRCode');
  }

  async printImage(): Promise<{ success: boolean }> {
    return this.notAvailable('printImage');
  }

  async printBitmap(): Promise<{ success: boolean }> {
    return this.notAvailable('printBitmap');
  }

  async feedPaper(): Promise<{ success: boolean }> {
    return this.notAvailable('feedPaper');
  }

  async cutPaper(): Promise<{ success: boolean }> {
    return this.notAvailable('cutPaper');
  }

  async getPrinterStatus(): Promise<{ status: number }> {
    return this.notAvailable('getPrinterStatus');
  }

  async initPrinter(): Promise<{ success: boolean }> {
    return this.notAvailable('initPrinter');
  }

  async setLineSpacing(): Promise<{ success: boolean }> {
    return this.notAvailable('setLineSpacing');
  }

  async setLeftMargin(): Promise<{ success: boolean }> {
    return this.notAvailable('setLeftMargin');
  }

  async printTable(): Promise<{ success: boolean }> {
    return this.notAvailable('printTable');
  }

  // EMV Operations (stub implementations)
  async addAid(): Promise<{ success: boolean }> {
    return this.notAvailable('addAid');
  }

  async deleteAid(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteAid');
  }

  async addCapk(): Promise<{ success: boolean }> {
    return this.notAvailable('addCapk');
  }

  async deleteCapk(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteCapk');
  }

  async setTerminalParam(): Promise<{ success: boolean }> {
    return this.notAvailable('setTerminalParam');
  }

  async setTermParamEx(): Promise<{ success: boolean }> {
    return this.notAvailable('setTermParamEx');
  }

  async isExistCapkAndAid(): Promise<{ status: number }> {
    return this.notAvailable('isExistCapkAndAid');
  }

  async initEmvProcess(): Promise<{ success: boolean }> {
    return this.notAvailable('initEmvProcess');
  }

  async transactProcess(): Promise<any> {
    return this.notAvailable('transactProcess');
  }

  async transactProcessEx(): Promise<any> {
    return this.notAvailable('transactProcessEx');
  }

  async getTlv(): Promise<{ value: string }> {
    return this.notAvailable('getTlv');
  }

  async getTlvList(): Promise<{ tlvData: string }> {
    return this.notAvailable('getTlvList');
  }

  async setTlv(): Promise<{ success: boolean }> {
    return this.notAvailable('setTlv');
  }

  async setTlvList(): Promise<{ success: boolean }> {
    return this.notAvailable('setTlvList');
  }

  async importAppSelect(): Promise<{ success: boolean }> {
    return this.notAvailable('importAppSelect');
  }

  async importAppFinalSelectStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importAppFinalSelectStatus');
  }

  async importCardNoStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importCardNoStatus');
  }

  async importCertStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importCertStatus');
  }

  async importPinInputStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importPinInputStatus');
  }

  async importOnlineProcStatus(): Promise<{ resultData: string }> {
    return this.notAvailable('importOnlineProcStatus');
  }

  async importSignatureStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importSignatureStatus');
  }

  async importDataExchangeStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importDataExchangeStatus');
  }

  async importTermRiskManagementStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importTermRiskManagementStatus');
  }

  async importPreFirstGenACStatus(): Promise<{ success: boolean }> {
    return this.notAvailable('importPreFirstGenACStatus');
  }

  async importDataStorage(): Promise<{ success: boolean }> {
    return this.notAvailable('importDataStorage');
  }

  async importScriptData(): Promise<{ success: boolean }> {
    return this.notAvailable('importScriptData');
  }

  async readTransLog(): Promise<{ logs: string[] }> {
    return this.notAvailable('readTransLog');
  }

  async abortTransactProcess(): Promise<{ success: boolean }> {
    return this.notAvailable('abortTransactProcess');
  }

  async queryECBalance(): Promise<{ currencyCode: string; balance: number }> {
    return this.notAvailable('queryECBalance');
  }

  async transactPreProcess(): Promise<{ success: boolean }> {
    return this.notAvailable('transactPreProcess');
  }

  async addDrlLimitSet(): Promise<{ success: boolean }> {
    return this.notAvailable('addDrlLimitSet');
  }

  async deleteDrlLimitSet(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteDrlLimitSet');
  }

  async addRevocList(): Promise<{ success: boolean }> {
    return this.notAvailable('addRevocList');
  }

  async deleteRevocList(): Promise<{ success: boolean }> {
    return this.notAvailable('deleteRevocList');
  }

  async sysSetTime(): Promise<{ success: boolean }> {
    return this.notAvailable('sysSetTime');
  }

  async sysGetTime(): Promise<{ time: number }> {
    return this.notAvailable('sysGetTime');
  }

  async clearData(): Promise<{ success: boolean }> {
    return this.notAvailable('clearData');
  }

  async queryAidCapkList(): Promise<{ aids: string[]; capks: string[] }> {
    return this.notAvailable('queryAidCapkList');
  }

  async setAccountDataSecParam(): Promise<{ success: boolean }> {
    return this.notAvailable('setAccountDataSecParam');
  }

  async getAccountSecData(): Promise<{ secData: string }> {
    return this.notAvailable('getAccountSecData');
  }

  async syncEMVParams(): Promise<{ success: boolean }> {
    return this.notAvailable('syncEMVParams');
  }

  // Tax Operations
  async getFiscalStatus(): Promise<{ status: string }> {
    return this.notAvailable('getFiscalStatus');
  }

  async sendFiscalCommand(): Promise<{ response: string }> {
    return this.notAvailable('sendFiscalCommand');
  }

  async getFiscalData(): Promise<{ data: string }> {
    return this.notAvailable('getFiscalData');
  }

  // Device Certificate
  async getDeviceCertificate(): Promise<{ certData: string }> {
    return this.notAvailable('getDeviceCertificate');
  }

  async verifyDeviceCertificate(): Promise<{ isValid: boolean }> {
    return this.notAvailable('verifyDeviceCertificate');
  }
}
