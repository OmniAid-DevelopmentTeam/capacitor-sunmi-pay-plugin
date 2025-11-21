/**
 * Sunmi Payment SDK V2 Capacitor Plugin
 * Complete TypeScript definitions for all SDK modules
 * @version 2.0.17
 */

export interface SunmiPayPlugin {
  // ==================== SDK Lifecycle ====================
  
  /**
   * Initialize Pay SDK and connect to Sunmi Payment Hardware Service
   */
  initPaySDK(): Promise<{ success: boolean }>;

  /**
   * Destroy Pay SDK connection
   */
  destroyPaySDK(): Promise<{ success: boolean }>;

  /**
   * Get Pay SDK version
   */
  getPaySDKVersion(): Promise<{ version: string }>;

  /**
   * Enable or disable EMV L2 Split library
   * @param enable - true to enable, false to disable
   */
  setEmvL2Split(options: { enable: boolean }): Promise<{ success: boolean }>;

  // ==================== Basic Operation Module ====================

  /**
   * Get system parameter by key
   * @param key - System parameter key (see SysParam constants)
   */
  getSysParam(options: { key: string }): Promise<{ value: string }>;

  /**
   * Set system parameter
   * @param key - System parameter key
   * @param value - Parameter value
   */
  setSysParam(options: { key: string; value: string }): Promise<{ success: boolean }>;

  /**
   * Control device buzzer
   * @param count - Beep times (0-100)
   * @param freq - Frequency in Hz
   * @param duration - Duration in ms
   * @param interval - Interval between beeps in ms (0-10000)
   */
  buzzerOnDevice(options: {
    count: number;
    freq: number;
    duration: number;
    interval: number;
  }): Promise<{ success: boolean }>;

  /**
   * Control LED status on device
   * @param ledIndex - LED index (see LedLight constants)
   * @param ledStatus - 0: on, 1: off
   */
  ledStatusOnDevice(options: {
    ledIndex: number;
    ledStatus: number;
  }): Promise<{ success: boolean }>;

  /**
   * Control all LEDs at once
   * @param redStatus - Red LED status (0: on, 1: off)
   * @param greenStatus - Green LED status
   * @param yellowStatus - Yellow LED status
   * @param blueStatus - Blue LED status
   */
  ledStatusOnDeviceEx(options: {
    redStatus: number;
    greenStatus: number;
    yellowStatus: number;
    blueStatus: number;
  }): Promise<{ success: boolean }>;

  /**
   * Set screen exclusive mode
   * @param mode - 1: set exclusive, -1: exit exclusive
   */
  setScreenMode(options: { mode: number }): Promise<{ success: boolean }>;

  /**
   * Get random data from SDK
   * @param len - Random data length (0-256)
   */
  sysGetRandom(options: { len: number }): Promise<{ data: string }>;

  /**
   * Set status bar dropdown mode
   * @param mode - 0: enable dropdown, 1: disable dropdown
   */
  setStatusBarDropDownMode(options: { mode: number }): Promise<{ success: boolean }>;

  /**
   * Set navigation bar visibility
   * @param visibility - 0: gone, 1: visible
   */
  setNavigationBarVisibility(options: { visibility: number }): Promise<{ success: boolean }>;

  /**
   * Hide specific navigation bar items
   * @param flag - Composite flag for items to hide
   */
  setHideNavigationBarItems(options: { flag: number }): Promise<{ success: boolean }>;

  /**
   * Manage device power
   * @param mode - Power mode: 1-dormant(not support), 2-shutdown, 3-reboot
   */
  sysPowerManage(options: { mode: number }): Promise<{ success: boolean }>;

  /**
   * Set schedule reboot time
   */
  setScheduleReboot(options: {
    hour: number;
    minute: number;
    second: number;
    millisecond: number;
  }): Promise<{ success: boolean }>;

  /**
   * Clear schedule reboot time
   */
  clearScheduleReboot(): Promise<{ success: boolean }>;

  /**
   * Set device wakeup sources
   * @param channel - Wakeup source: 1-IC card, 2-Magnetic stripe card, 3-press key
   * @param mode - 0: disable, 1: enable
   */
  sysSetWakeup(options: {
    channel: number;
    mode: number;
  }): Promise<{ success: boolean }>;

  /**
   * Get card usage count
   * @param cardType - Card type (MAGNETIC/IC/NFC)
   * @param isSuccess - true: success count, false: failure count
   */
  getCardUsageCount(options: {
    cardType: number;
    isSuccess: boolean;
  }): Promise<{ count: number }>;

  /**
   * Get module accessibility
   * @param module - Module: 1-MAG, 2-ICC, 3-PICC, 4-PinPad
   */
  getModuleAccessibility(options: { module: number }): Promise<{ ability: number }>;

  /**
   * Set module accessibility
   * @param module - Module: 1-MAG, 2-ICC, 3-PICC, 4-PinPad
   * @param ability - 0: disable, 1: enable
   */
  setModuleAccessibility(options: {
    module: number;
    ability: number;
  }): Promise<{ success: boolean }>;

  /**
   * Get PED mode
   * @returns PED mode: 1-Sharing mode, 2-Isolation mode, 3-Mixed mode
   */
  getPedMode(): Promise<{ mode: number }>;

  /**
   * Set PED mode
   * @param mode - PED mode: 1-Sharing mode, 2-Isolation mode, 3-Mixed mode
   */
  setPedMode(options: { mode: number }): Promise<{ success: boolean }>;

  /**
   * Install shared lib
   * @param path - Absolute path to shared lib
   */
  installSharedLib(options: { path: string }): Promise<{ success: boolean }>;

  /**
   * Delete shared lib
   * @param name - Shared lib name
   */
  deleteSharedLib(options: { name: string }): Promise<{ success: boolean }>;

  /**
   * Get RTC battery voltage
   */
  getRtcBatVol(): Promise<{ vol: number; fromAdc: number }>;

  // ==================== Card Operation Module ====================

  /**
   * Check card (magnetic, IC, NFC)
   * @param cardType - Composite card types (CardType values combined with OR)
   * @param timeout - Timeout in seconds (1-600)
   */
  checkCard(options: {
    cardType: number;
    timeout: number;
  }): Promise<CheckCardResult>;

  /**
   * Check card (extended method)
   * @param cardType - Composite card types
   * @param ctrCode - Card active control code
   * @param stopOnError - Whether to stop on error (composite card types only)
   * @param timeout - Timeout in seconds (1-600)
   */
  checkCardEx(options: {
    cardType: number;
    ctrCode: number;
    stopOnError: number;
    timeout: number;
  }): Promise<CheckCardResult>;

  /**
   * Check card with encryption
   * @param cardType - Composite card types
   * @param timeout - Timeout in seconds
   * @param encParams - Encryption parameters
   */
  checkCardEnc(options: {
    cardType: number;
    timeout: number;
    encParams: EncryptionParams;
  }): Promise<CheckCardResult>;

  /**
   * Cancel check card operation
   */
  cancelCheckCard(): Promise<{ success: boolean }>;

  /**
   * APDU command exchange
   * @param cardType - Card type
   * @param command - APDU command
   */
  apduCommand(options: {
    cardType: number;
    command: ApduSend;
  }): Promise<ApduRecv>;

  /**
   * Smart card exchange
   * @param cardType - Card type
   * @param apduSend - APDU send data (hex string)
   */
  smartCardExchange(options: {
    cardType: number;
    apduSend: string;
  }): Promise<{ apduRecv: string }>;

  /**
   * Transmit APDU command to card
   * @param cardType - Card type
   * @param sendBuff - Send buffer (hex string, max 1929B)
   */
  transmitApdu(options: {
    cardType: number;
    sendBuff: string;
  }): Promise<{ recvBuff: string }>;

  /**
   * Transmit APDU (extended method)
   * @param cardType - Card type
   * @param sendBuff - Send buffer with control byte
   */
  transmitApduEx(options: {
    cardType: number;
    sendBuff: string;
  }): Promise<{ recvBuff: string }>;

  /**
   * Transmit APDU (extended method 2)
   */
  transmitApduExx(options: {
    cardType: number;
    sendBuff: string;
  }): Promise<{ recvBuff: string }>;

  /**
   * Transmit multiple APDUs at once
   * @param cardType - Card type
   * @param apduList - List of APDU commands (max 7)
   */
  transmitMultiApdus(options: {
    cardType: number;
    apduList: string[];
  }): Promise<{ recvList: string[] }>;

  /**
   * Power off contact or contactless card
   * @param cardType - Card type (IC or composite IC|NFC)
   */
  cardOff(options: { cardType: number }): Promise<{ success: boolean }>;

  /**
   * Check if card exists on slot
   * @param cardType - Card type (non-composite)
   */
  getCardExistStatus(options: { cardType: number }): Promise<{ status: number }>;

  // Mifare Classic (M1)
  
  /**
   * Verify M1 card sector password
   * @param keyType - Password type: 0-password A, 1-password B
   * @param block - Block number (0-63 for 1K card)
   * @param key - Password (6 bytes, hex string)
   */
  mifareAuth(options: {
    keyType: number;
    block: number;
    key: string;
  }): Promise<{ success: boolean }>;

  /**
   * Read M1 card block data
   * @param block - Block number
   */
  mifareReadBlock(options: { block: number }): Promise<{ data: string }>;

  /**
   * Write M1 card block data
   * @param block - Block number
   * @param data - Block data (16 bytes, hex string)
   */
  mifareWriteBlock(options: {
    block: number;
    data: string;
  }): Promise<{ success: boolean }>;

  /**
   * M1 card increment operation
   * @param block - Block number
   * @param value - Amount to increment (4 bytes, hex string)
   */
  mifareIncValue(options: {
    block: number;
    value: string;
  }): Promise<{ success: boolean }>;

  /**
   * M1 card decrement operation
   * @param block - Block number
   * @param value - Amount to decrement (4 bytes, hex string)
   */
  mifareDecValue(options: {
    block: number;
    value: string;
  }): Promise<{ success: boolean }>;

  /**
   * M1 card increment (shrink method, no transfer)
   */
  mifareIncValueDx(options: {
    block: number;
    value: string;
  }): Promise<{ success: boolean }>;

  /**
   * M1 card decrement (shrink method, no transfer)
   */
  mifareDecValueDx(options: {
    block: number;
    value: string;
  }): Promise<{ success: boolean }>;

  /**
   * M1 card transfer data to block
   */
  mifareTransfer(options: { destBlock: number }): Promise<{ success: boolean }>;

  /**
   * M1 card restore block data to register
   */
  mifareRestore(options: { srcBlock: number }): Promise<{ success: boolean }>;

  // Mifare Ultralight C

  /**
   * Mifare Ultralight C authentication
   */
  mifareUltralightCAuth(options: { authKey: string }): Promise<{ success: boolean }>;

  /**
   * Mifare Ultralight C read block
   */
  mifareUltralightCReadData(options: { block: number }): Promise<{ data: string }>;

  /**
   * Mifare Ultralight C write block
   */
  mifareUltralightCWriteData(options: {
    block: number;
    data: string;
  }): Promise<{ success: boolean }>;

  // Mifare Plus SL3

  /**
   * Mifare Plus read block
   */
  mifarePlusReadBlock(options: {
    block: number;
    key: string;
  }): Promise<{ data: string }>;

  /**
   * Mifare Plus write block
   */
  mifarePlusWriteBlock(options: {
    block: number;
    key: string;
    data: string;
  }): Promise<{ success: boolean }>;

  /**
   * Mifare Plus change block key
   */
  mifarePlusChangeBlockKey(options: {
    block: number;
    oldKey: string;
    newKey: string;
  }): Promise<{ success: boolean }>;

  // SLE4442/SLE4428

  /**
   * SLE verify password
   */
  sleAuthKey(options: { key: string }): Promise<{ success: boolean }>;

  /**
   * SLE change password
   */
  sleChangeKey(options: { newKey: string }): Promise<{ success: boolean }>;

  /**
   * SLE read data
   */
  sleReadData(options: {
    startAddress: number;
    length: number;
  }): Promise<{ data: string }>;

  /**
   * SLE write data
   */
  sleWriteData(options: {
    startAddress: number;
    data: string;
  }): Promise<{ success: boolean }>;

  /**
   * SLE get remain authentication count
   */
  sleGetRemainAuthCount(): Promise<{ count: number }>;

  /**
   * SLE write protection memory
   */
  sleWriteProtectionMemory(options: {
    startAddress: number;
    length: number;
  }): Promise<{ success: boolean }>;

  /**
   * SLE read memory protection status
   */
  sleReadMemoryProtectionStatus(options: {
    startAddress: number;
    length: number;
  }): Promise<{ status: string }>;

  // AT24C series

  /**
   * AT24C read data
   */
  at24cReadData(options: {
    startAddress: number;
    length: number;
  }): Promise<{ data: string }>;

  /**
   * AT24C write data
   */
  at24cWriteData(options: {
    startAddress: number;
    data: string;
  }): Promise<{ success: boolean }>;

  // AT88SC

  /**
   * AT88SC verify password
   */
  at88scAuthKey(options: {
    key: string;
    rwFlag: number;
    zoneNo: number;
  }): Promise<{ success: boolean }>;

  /**
   * AT88SC change password
   */
  at88scChangeKey(options: {
    newKey: string;
    rwFlag: number;
    zoneNo: number;
  }): Promise<{ success: boolean }>;

  /**
   * AT88SC read data
   */
  at88scReadData(options: {
    startAddress: number;
    length: number;
    zoneFlag: number;
  }): Promise<{ data: string }>;

  /**
   * AT88SC write data
   */
  at88scWriteData(options: {
    startAddress: number;
    zoneFlag: number;
    data: string;
  }): Promise<{ success: boolean }>;

  /**
   * AT88SC get remain authentication count
   */
  at88scGetRemainAuthCount(options: {
    rwFlag: number;
    zoneNo: number;
  }): Promise<{ count: number }>;

  // CTX512B

  /**
   * CTX512B read block
   */
  ctx512ReadBlock(options: { block: number }): Promise<{ data: string }>;

  /**
   * CTX512B write block
   */
  ctx512WriteBlock(options: {
    block: number;
    data: string;
  }): Promise<{ success: boolean }>;

  /**
   * CTX512B update block
   */
  ctx512UpdateBlock(options: {
    block: number;
    data: string;
  }): Promise<{ success: boolean }>;

  /**
   * CTX512B get signature
   */
  ctx512GetSignature(options: {
    block: number;
    random: string;
  }): Promise<{ signature: string }>;

  /**
   * CTX512B read 4 successive blocks
   */
  ctx512MultiReadBlock(options: { startBlock: number }): Promise<{ data: string }>;

  /**
   * Smart card IO control
   */
  smartCardIoControl(options: {
    cardType: number;
    cmd: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * PASS mode transmit APDU
   */
  smartCardExChangePASS(options: {
    cardType: number;
    apduSend: string;
  }): Promise<{ apduRecv: string }>;

  /**
   * PASS mode transmit APDU (no length field in response)
   */
  smartCardExChangePASSNoLength(options: {
    cardType: number;
    apduSend: string;
  }): Promise<{ apduRecv: string }>;

  // ==================== PinPad Operation Module ====================

  /**
   * Initialize PinPad
   * @param config - PinPad configuration
   */
  initPinPad(options: { config: PinPadConfig }): Promise<{ pinBlock: string; confirmed: boolean }>;

  /**
   * Initialize PinPad (extended method)
   */
  initPinPadEx(options: { config: PinPadConfigEx }): Promise<{ pinBlock: string; confirmed: boolean }>;

  /**
   * Import PinPad data (for custom keyboards)
   */
  importPinPadData(options: { data: PinPadData }): Promise<{ success: boolean }>;

  /**
   * Import PinPad data (extended method)
   */
  importPinPadDataEx(options: { data: PinPadDataEx }): Promise<{ success: boolean }>;

  /**
   * Cancel input PIN
   */
  cancelInputPin(): Promise<{ success: boolean }>;

  /**
   * Set PinPad showing text
   */
  setPinPadText(options: { config: PinPadTextConfig }): Promise<{ success: boolean }>;

  /**
   * Set PinPad mode
   */
  setPinPadMode(options: { config: PinPadModeConfig }): Promise<{ success: boolean }>;

  /**
   * Get PinPad mode
   */
  getPinPadMode(): Promise<PinPadModeConfig>;

  /**
   * Set PIN anti-exhaustive protection mode
   * @param level - Protection level (1-5)
   */
  setAntiExhaustiveProtectionMode(options: { level: number }): Promise<{ waitTime: number }>;

  /**
   * Get PIN anti-exhaustive protection mode
   */
  getAntiExhaustiveProtectionMode(): Promise<{ level: number }>;

  /**
   * Set visual impairment mode parameters
   */
  setVisualImpairmentModeParam(options: { param: VisualImpairmentParam }): Promise<{ success: boolean }>;

  /**
   * Get visual impairment mode parameters
   */
  getVisualImpairmentModeParam(): Promise<VisualImpairmentParam>;

  /**
   * Start input PIN
   */
  startInputPin(options: { config: StartInputPinConfig }): Promise<{ success: boolean }>;

  /**
   * Get PIN block
   */
  getPinBlock(options: {
    keySystem: number;
    pinKeyIndex: number;
    algorithmType: number;
    pinblockFormat: number;
    pan: string;
  }): Promise<{ pinBlock: string }>;

  /**
   * Offline PIN verify (Brazil-CKD special)
   */
  offlinePinVerify(options: {
    offlineType: number;
    modulus: string;
    exponent: string;
    random: string;
  }): Promise<{ sw1: number; sw2: number }>;

  // ==================== Security Operation Module ====================

  /**
   * Save plaintext key
   */
  savePlaintextKey(options: {
    keyType: number;
    keyValue: string;
    checkValue: string;
    keyAlgType: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Save ciphertext key
   */
  saveCiphertextKey(options: {
    keyType: number;
    keyValue: string;
    checkValue: string;
    encryptIndex: number;
    keyAlgType: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Save key with extended parameters (including keyUsage)
   * This is the recommended method for PIN keys
   */
  saveKeyEx(options: {
    keyType: number;        // Key type: KEK(1), TMK(2), PIK(3), TDK(4), MAK(5), REC(6)
    keyValue: string;       // Key value in hex string
    checkValue?: string;    // Check value in hex string (optional)
    keyAlgType: number;     // Algorithm: DES(0), 3DES(1), AES128(2), AES192(3), AES256(4), SM4(5)
    keyIndex: number;       // Key index (0-99)
    keyUsage?: number;      // Key usage: PIN_ENC(0x01), MAC_GEN(0x02), DATA_ENC(0x04), DATA_DEC(0x08), ALL(0xFF)
    encryptIndex?: number;  // Encrypt key index (if key is encrypted)
  }): Promise<{ success: boolean }>;

  /**
   * Calculate MAC
   */
  calcMac(options: {
    keyIndex: number;
    macType: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Calculate MAC (extended method)
   */
  calcMacEx(options: {
    keyIndex: number;
    macType: number;
    dataIn: string;
    icv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Verify MAC
   */
  verifyMac(options: {
    keyIndex: number;
    macType: number;
    dataIn: string;
    mac: string;
  }): Promise<{ success: boolean }>;

  /**
   * Encrypt data
   */
  dataEncrypt(options: {
    keyIndex: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Decrypt data
   */
  dataDecrypt(options: {
    keyIndex: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Encrypt data (extended method)
   */
  dataEncryptEx(options: {
    keyIndex: number;
    keyLength: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Decrypt data (extended method)
   */
  dataDecryptEx(options: {
    keyIndex: number;
    keyLength: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Save DUKPT key
   */
  saveKeyDukpt(options: {
    keyType: number;
    keyValue: string;
    checkValue: string;
    ksn: string;
    encryptType: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Save DUKPT AES key
   */
  saveKeyDukptAES(options: {
    keyType: number;
    keyValue: string;
    checkValue: string;
    ksn: string;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Calculate MAC (DUKPT)
   */
  calcMacDukpt(options: {
    keyIndex: number;
    macType: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Calculate MAC (DUKPT extended)
   */
  calcMacDukptEx(options: {
    keySelect: number;
    keyIndex: number;
    macType: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Verify MAC (DUKPT)
   */
  verifyMacDukpt(options: {
    keyIndex: number;
    macType: number;
    dataIn: string;
    mac: string;
  }): Promise<{ success: boolean }>;

  /**
   * Verify MAC (DUKPT extended)
   */
  verifyMacDukptEx(options: {
    keySelect: number;
    keyIndex: number;
    macType: number;
    dataIn: string;
    mac: string;
  }): Promise<{ success: boolean }>;

  /**
   * Encrypt data (DUKPT)
   */
  dataEncryptDukpt(options: {
    keyIndex: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Decrypt data (DUKPT)
   */
  dataDecryptDukpt(options: {
    keyIndex: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Encrypt data (DUKPT extended)
   */
  dataEncryptDukptEx(options: {
    keySelect: number;
    keyIndex: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Decrypt data (DUKPT extended)
   */
  dataDecryptDukptEx(options: {
    keySelect: number;
    keyIndex: number;
    dataIn: string;
    encryptionMode: number;
    iv: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Increase DUKPT KSN by 1
   */
  dukptIncreaseKSN(options: { keyIndex: number }): Promise<{ success: boolean }>;

  /**
   * Get current DUKPT KSN
   */
  dukptCurrentKSN(options: { keyIndex: number }): Promise<{ ksn: string }>;

  /**
   * Get initialized DUKPT KSN
   */
  dukptGetInitKSN(): Promise<{ ksn: string }>;

  /**
   * Get key check value
   */
  getKeyCheckValue(options: {
    keySystem: number;
    keyIndex: number;
  }): Promise<{ checkValue: string }>;

  /**
   * Get key length
   */
  getKeyLength(options: {
    keySystem: number;
    keyIndex: number;
  }): Promise<{ length: number }>;

  /**
   * Delete key
   */
  deleteKey(options: {
    keySystem: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Delete key (extended method)
   */
  deleteKeyEx(options: {
    targetPkgName: string;
    keySystem: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Save key (extended method with more options)
   */
  saveKeyEx(options: {
    keyIndex: number;
    keyType: number;
    keyAlgType: number;
    keyValue: string;
    checkValue: string;
    kcvMode: number;
    encryptIndex: number;
    dataMode: number;
    iv: string;
    isEncrypt: boolean;
  }): Promise<{ success: boolean }>;

  /**
   * Get TUSN encrypted data (Chinese market only)
   */
  getTUSNEncryptData(options: { dataIn: string }): Promise<{ dataOut: string }>;

  /**
   * Inject plaintext key to target app
   */
  injectPlaintextKey(options: {
    targetPkgName: string;
    keyType: number;
    keyValue: string;
    checkValue: string;
    keyAlgType: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Inject ciphertext key to target app
   */
  injectCiphertextKey(options: {
    targetPkgName: string;
    keyType: number;
    keyValue: string;
    checkValue: string;
    encryptIndex: number;
    keyAlgType: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Inject ciphertext key (extended method)
   */
  injectCiphertextKeyEx(options: {
    targetPkgName: string;
    keyIndex: number;
    keyType: number;
    keyAlgType: number;
    checkValue: string;
    encryptIndex: number;
    keyValue: string;
    dataMode: number;
    iv: string;
    kcvMode: number;
    kcvMacType: number;
    kcvInData: string;
  }): Promise<{ success: boolean }>;

  /**
   * Inject DUKPT key (extended method)
   */
  injectKeyDukptEx(options: {
    targetPkgName: string;
    keyIndex: number;
    keyType: number;
    encryptType: number;
    checkValue: string;
    encryptIndex: number;
    keyValue: string;
    ksn: string;
    dataMode: number;
    iv: string;
    kcvMode: number;
    kcvMacType: number;
    kcvInData: string;
  }): Promise<{ success: boolean }>;

  /**
   * Save TR31 key
   */
  saveTR31Key(options: {
    keyValue: string;
    kbpkIndex: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Inject TR31 key to target app
   */
  injectTR31Key(options: {
    targetPkgName: string;
    keyValue: string;
    kbpkIndex: number;
    keyIndex: number;
  }): Promise<{ success: boolean }>;

  /**
   * Write key variable (Brazil-CKD special)
   */
  writeKeyVariable(options: {
    keyIndex: number;
    variable: string;
  }): Promise<{ success: boolean }>;

  /**
   * Read key variable (Brazil-CKD special)
   */
  readKeyVariable(options: { keyIndex: number }): Promise<{ variable: string }>;

  // RSA Operations

  /**
   * Generate RSA keypair
   */
  generateRSAKeypair(options: {
    pubKeyIndex: number;
    pvtKeyIndex: number;
    keysize: number;
    pubExponent: string;
  }): Promise<{ success: boolean }>;

  /**
   * Generate RSA keypair (extended, 1024/2048 bit only)
   */
  generateRSAKeypairEx(options: {
    keyType: number;
    pvkIndex: number;
    keySize: number;
    pubExponent: string;
  }): Promise<{ module: string }>;

  /**
   * Inject RSA key (extended)
   */
  injectRSAKeyEx(options: {
    keyType: number;
    keyIndex: number;
    keySize: number;
    module: string;
    exponent: string;
  }): Promise<{ success: boolean }>;

  /**
   * Read RSA key
   */
  readRSAKey(options: {
    keyIndex: number;
    keyType: number;
  }): Promise<{ keyData: string }>;

  /**
   * RSA encrypt or decrypt data
   */
  rsaEncryptOrDecryptData(options: {
    keyIndex: number;
    keyType: number;
    transformation: string;
    paddingMode: number;
    isEncrypt: boolean;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * RSA sign data
   */
  rsaSignData(options: {
    keyIndex: number;
    signAlg: string;
    dataIn: string;
  }): Promise<{ signature: string }>;

  /**
   * RSA verify signature
   */
  rsaVerifySignature(options: {
    keyIndex: number;
    signAlg: string;
    srcData: string;
    signature: string;
  }): Promise<{ success: boolean }>;

  /**
   * RSA inject ciphertext key
   */
  injectCiphertextKeyUnderRSA(options: {
    targetPkgName: string;
    keyIndex: number;
    rsaKeyIndex: number;
    keyType: number;
    keyAlgType: number;
    checkValue: string;
    keyData: string;
  }): Promise<{ success: boolean }>;

  // SM2 Operations

  /**
   * Generate SM2 keypair
   */
  generateSM2Keypair(options: {
    pubKeyIndex: number;
    pvtKeyIndex: number;
  }): Promise<{ pubKey: string }>;

  /**
   * Inject SM2 key
   */
  injectSM2Key(options: {
    pubKeyIndex: number;
    pvtKeyIndex: number;
    pubKey: string;
    pvtKey: string;
  }): Promise<{ success: boolean }>;

  /**
   * Read SM2 public key
   */
  readSM2Key(options: { keyIndex: number }): Promise<{ keyData: string }>;

  /**
   * SM2 sign data
   */
  sm2Sign(options: {
    keyIndex: number;
    dataIn: string;
  }): Promise<{ signature: string }>;

  /**
   * SM2 verify signature
   */
  sm2VerifySign(options: {
    keyIndex: number;
    srcData: string;
    signature: string;
  }): Promise<{ success: boolean }>;

  /**
   * SM2 single sign (with Z ID hash)
   */
  sm2SingleSign(options: {
    keyIndex: number;
    hash: string;
  }): Promise<{ signature: string }>;

  /**
   * SM2 encrypt data
   */
  sm2EncryptData(options: {
    keyIndex: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * SM2 decrypt data
   */
  sm2DecryptData(options: {
    keyIndex: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Calculate SM3 hash
   */
  calcSecHash(options: {
    hashAlg: string;
    dataIn: string;
  }): Promise<{ hash: string }>;

  /**
   * Calculate SM3 hash with Z(ID)
   */
  calcSM3HashWithID(options: {
    keyIndex: number;
    userId: string;
    dataIn: string;
  }): Promise<{ hash: string }>;

  // Symmetric Key Operations

  /**
   * Generate symmetric key
   */
  generateSymKey(options: {
    keyIndex: number;
    keyType: number;
    keyAlgType: number;
    keyLength: number;
  }): Promise<{ success: boolean }>;

  /**
   * Generate symmetric key (extended)
   */
  generateSymKeyEx(options: {
    keyIndex: number;
    keyType: number;
    keyAlgType: number;
    keyLength: number;
  }): Promise<{ success: boolean }>;

  /**
   * Inject symmetric key
   */
  injectSymKey(options: {
    targetPkgName: string;
    keyIndex: number;
    keyType: number;
    keyAlgType: number;
    keyValue: string;
    checkValue: string;
    encryptIndex: number;
    injectMode: number;
  }): Promise<{ success: boolean }>;

  /**
   * Inject symmetric key (extended)
   */
  injectSymKeyEx(options: {
    targetPkgName: string;
    keyIndex: number;
    keyType: number;
    keyAlgType: number;
    keyValue: string;
    checkValue: string;
    encryptIndex1: number;
    encryptIndex2: number;
    dataMode: number;
    iv: string;
    injectMode: number;
  }): Promise<{ success: boolean }>;

  /**
   * Query key mapping record list
   */
  queryKeyMappingRecordList(options: { targetPkgName?: string }): Promise<{ records: KeyMappingRecord[] }>;

  /**
   * Query all key mapping records in device
   */
  queryKeyMappingRecordListWL(): Promise<{ records: KeyMappingRecord[] }>;

  /**
   * APACS MAC calculation (Brazil-CKD special)
   */
  apacsMac(options: {
    keyIndex: number;
    dataIn: string;
  }): Promise<{ mac: string }>;

  /**
   * Security IO control
   */
  secKeyIoControl(options: {
    cmd: number;
    dataIn: string;
  }): Promise<{ dataOut: string }>;

  /**
   * Save base key
   */
  saveBaseKey(options: {
    destinationIndex: number;
    keyData: string;
  }): Promise<{ success: boolean }>;

  // Device Certificate Operations

  /**
   * Inject device cert private key
   */
  injectDeviceCertPrivateKey(options: {
    targetAppPkgName: string;
    certIndex: number;
    mode: number;
    isEncrypt: boolean;
    encryptIndex: number;
    certData: string;
    pvkData: string;
  }): Promise<{ success: boolean }>;

  /**
   * Set device certificate (TOSS special)
   */
  setDeviceCertificate(options: {
    certIndex: number;
    certData: string;
  }): Promise<{ success: boolean }>;

  // ==================== EMV Operation Module ====================

  /**
   * Add or update AID parameter
   */
  addAid(options: { aid: AidParam }): Promise<{ success: boolean }>;

  /**
   * Delete AID parameter
   * @param tag9F06Value - Value of tag 9F06 (null to delete all)
   */
  deleteAid(options: { tag9F06Value: string | null }): Promise<{ success: boolean }>;

  /**
   * Add or update CAPK parameter
   */
  addCapk(options: { capk: CapkParam }): Promise<{ success: boolean }>;

  /**
   * Delete CAPK parameter
   * @param tag9F06Value - Value of tag 9F06 (null to delete all)
   * @param tag9F22Value - Value of tag 9F22
   */
  deleteCapk(options: {
    tag9F06Value: string | null;
    tag9F22Value: string;
  }): Promise<{ success: boolean }>;

  /**
   * Set terminal parameter
   */
  setTerminalParam(options: { termParam: EmvTermParam }): Promise<{ success: boolean }>;

  /**
   * Set terminal parameter (extended method with more options)
   */
  setTermParamEx(options: { termParam: EmvTermParamEx }): Promise<{ success: boolean }>;

  /**
   * Check if AID and CAPK exist
   * @returns -1: both not exist, 0: both exist, 1: only AID, 2: only CAPK
   */
  isExistCapkAndAid(): Promise<{ status: number }>;

  /**
   * Initialize EMV process
   */
  initEmvProcess(): Promise<{ success: boolean }>;

  /**
   * Start EMV transaction process
   */
  transactProcess(options: { transData: EmvTransData }): Promise<EmvTransResult>;

  /**
   * Start EMV transaction process (extended method)
   */
  transactProcessEx(options: { transData: EmvTransDataEx }): Promise<EmvTransResult>;

  /**
   * Read one TLV data from kernel
   * @param opCode - TLV operation code
   * @param tag - Tag to read (hex format)
   */
  getTlv(options: {
    opCode: number;
    tag: string;
  }): Promise<{ value: string }>;

  /**
   * Read multiple TLV data from kernel
   * @param opCode - TLV operation code
   * @param tags - Tags to read (hex format array)
   */
  getTlvList(options: {
    opCode: number;
    tags: string[];
  }): Promise<{ tlvData: string }>;

  /**
   * Set TLV data to kernel
   * @param opCode - TLV operation code
   * @param tag - Tag to set (hex format)
   * @param hexValue - Value to set (hex format)
   */
  setTlv(options: {
    opCode: number;
    tag: string;
    hexValue: string;
  }): Promise<{ success: boolean }>;

  /**
   * Set multiple TLV data to kernel
   * @param opCode - TLV operation code
   * @param tags - Tags to set (hex format array)
   * @param hexValues - Values to set (hex format array)
   */
  setTlvList(options: {
    opCode: number;
    tags: string[];
    hexValues: string[];
  }): Promise<{ success: boolean }>;

  /**
   * Import app select result to EMV
   * @param selectIndex - Selected app index (starts from 0)
   */
  importAppSelect(options: { selectIndex: number }): Promise<{ success: boolean }>;

  /**
   * Import app final select result to EMV
   * @param status - 0: success, 1: fail
   */
  importAppFinalSelectStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import card number confirm result to EMV
   * @param status - 0: success, 1: fail
   */
  importCardNoStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import certificate authorize result to EMV
   * @param status - 0: success, 1: fail
   */
  importCertStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import PIN input result to EMV
   * @param pinType - 0: online PIN, 1: offline PIN
   * @param inputResult - 0: success, 1: cancel, 2: skip, 3: fail, 4: timeout
   */
  importPinInputStatus(options: {
    pinType: number;
    inputResult: number;
  }): Promise<{ success: boolean }>;

  /**
   * Import online process result to EMV
   * @param status - 0: approval, 1: denial, 2: failed
   * @param tags - Online data tags
   * @param hexValues - Values for tags
   */
  importOnlineProcStatus(options: {
    status: number;
    tags: string[];
    hexValues: string[];
  }): Promise<{ resultData: string }>;

  /**
   * Import signature result to EMV
   * @param status - 0: success, 1: fail
   */
  importSignatureStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import data exchange status to EMV
   * @param status - 0: success, 1: fail
   */
  importDataExchangeStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import term risk management status
   * @param status - 0: success, 1: fail
   */
  importTermRiskManagementStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import pre-first-gen-AC status
   * @param status - 0: success, 1: fail
   */
  importPreFirstGenACStatus(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import data storage status
   * @param status - 0: success, 1: fail
   */
  importDataStorage(options: { status: number }): Promise<{ success: boolean }>;

  /**
   * Import script data
   * @param scriptData - Script data (hex string)
   */
  importScriptData(options: { scriptData: string }): Promise<{ success: boolean }>;

  /**
   * Read transaction log
   * @param logType - 0: transaction log, 1: trap log
   */
  readTransLog(options: { logType: number }): Promise<{ logs: string[] }>;

  /**
   * Abort EMV transaction process
   */
  abortTransactProcess(): Promise<{ success: boolean }>;

  /**
   * Query electronic cash balance
   */
  queryECBalance(): Promise<{ currencyCode: string; balance: number }>;

  /**
   * Transaction pre-processing
   */
  transactPreProcess(options: { transData: EmvTransData }): Promise<{ success: boolean }>;

  /**
   * Add DRL LimitSet
   */
  addDrlLimitSet(options: { limitSet: DrlLimitSet }): Promise<{ success: boolean }>;

  /**
   * Delete DRL LimitSet
   * @param tag9F06Value - Value of tag 9F06
   */
  deleteDrlLimitSet(options: { tag9F06Value: string }): Promise<{ success: boolean }>;

  /**
   * Add RevocList
   */
  addRevocList(options: { revocList: RevocList }): Promise<{ success: boolean }>;

  /**
   * Delete RevocList
   * @param tag9F06Value - Value of tag 9F06
   */
  deleteRevocList(options: { tag9F06Value: string }): Promise<{ success: boolean }>;

  /**
   * Set system time
   */
  sysSetTime(options: { time: number }): Promise<{ success: boolean }>;

  /**
   * Get system time
   */
  sysGetTime(): Promise<{ time: number }>;

  /**
   * Clear EMV data
   * @param dataType - Data type to clear
   */
  clearData(options: { dataType: number }): Promise<{ success: boolean }>;

  /**
   * Query AID/CAPK list
   */
  queryAidCapkList(): Promise<{ aids: string[]; capks: string[] }>;

  /**
   * Set account data security parameter (SRED)
   */
  setAccountDataSecParam(options: { param: AccountDataSecParam }): Promise<{ success: boolean }>;

  /**
   * Get account secure data (SRED)
   */
  getAccountSecData(options: { tags: string[] }): Promise<{ secData: string }>;

  /**
   * Synchronize EMV parameters
   */
  syncEMVParams(): Promise<{ success: boolean }>;

  // ==================== Printer Operation Module ====================

  /**
   * Print text
   * @param text - Text to print
   */
  printText(options: { text: string }): Promise<{ success: boolean }>;

  /**
   * Print text with formatting
   */
  printTextWithFormat(options: {
    text: string;
    fontSize: number;
    isBold: boolean;
    isUnderline: boolean;
    align: number;
  }): Promise<{ success: boolean }>;

  /**
   * Print barcode
   * @param data - Barcode data
   * @param barcodeType - Barcode type
   * @param width - Barcode width
   * @param height - Barcode height
   */
  printBarcode(options: {
    data: string;
    barcodeType: number;
    width: number;
    height: number;
  }): Promise<{ success: boolean }>;

  /**
   * Print QR code
   * @param data - QR code data
   * @param size - QR code size
   * @param errorLevel - Error correction level
   */
  printQRCode(options: {
    data: string;
    size: number;
    errorLevel: number;
  }): Promise<{ success: boolean }>;

  /**
   * Print image
   * @param imagePath - Path to image file
   */
  printImage(options: { imagePath: string }): Promise<{ success: boolean }>;

  /**
   * Print bitmap
   * @param bitmap - Base64 encoded bitmap
   * @param width - Bitmap width
   * @param height - Bitmap height
   */
  printBitmap(options: {
    bitmap: string;
    width: number;
    height: number;
  }): Promise<{ success: boolean }>;

  /**
   * Feed paper
   * @param lines - Number of lines to feed
   */
  feedPaper(options: { lines: number }): Promise<{ success: boolean }>;

  /**
   * Cut paper
   */
  cutPaper(): Promise<{ success: boolean }>;

  /**
   * Get printer status
   */
  getPrinterStatus(): Promise<{ status: number }>;

  /**
   * Initialize printer
   */
  initPrinter(): Promise<{ success: boolean }>;

  /**
   * Set line spacing
   * @param spacing - Line spacing in dots
   */
  setLineSpacing(options: { spacing: number }): Promise<{ success: boolean }>;

  /**
   * Set left margin
   * @param margin - Left margin in dots
   */
  setLeftMargin(options: { margin: number }): Promise<{ success: boolean }>;

  /**
   * Print table
   * @param data - Table data (2D array)
   * @param columnWidths - Width of each column
   * @param align - Alignment for each column
   */
  printTable(options: {
    data: string[][];
    columnWidths: number[];
    align: number[];
  }): Promise<{ success: boolean }>;

  // ==================== Tax Operation Module ====================

  /**
   * Get fiscal status
   */
  getFiscalStatus(): Promise<{ status: string }>;

  /**
   * Send fiscal command
   * @param command - Fiscal command
   */
  sendFiscalCommand(options: { command: string }): Promise<{ response: string }>;

  /**
   * Get fiscal data
   * @param dataType - Data type to retrieve
   */
  getFiscalData(options: { dataType: number }): Promise<{ data: string }>;

  // ==================== Device Certificate Manager Module ====================

  /**
   * Get device certificate
   * @param certIndex - Certificate index
   */
  getDeviceCertificate(options: { certIndex: number }): Promise<{ certData: string }>;

  /**
   * Verify device certificate
   * @param certIndex - Certificate index
   */
  verifyDeviceCertificate(options: { certIndex: number }): Promise<{ isValid: boolean }>;
}

// ==================== Type Definitions ====================

export interface CheckCardResult {
  cardType: number;
  cardData?: MagneticCardData | ICCardData | NFCCardData;
}

export interface MagneticCardData {
  track1?: string;
  track2?: string;
  track3?: string;
  track2Raw?: string;
  pan?: string;
  name?: string;
  expire?: string;
  servicecode?: string;
  appendedPanEnc?: string;
  track1ErrorCode?: number;
  track2ErrorCode?: number;
  track3ErrorCode?: number;
}

export interface ICCardData {
  atr: string;
}

export interface NFCCardData {
  uuid: string;
  ats?: string;
  cardCategory?: number;
  atqa?: string;
}

export interface EncryptionParams {
  keyIndex: number;
  keyAlgType: number;
  encKeyAlgType?: number;
  panAppendContent?: string;
  panAppendMode?: number;
}

export interface ApduSend {
  command: string; // 4 bytes: CLA, INS, P1, P2
  lc: number; // Length of dataIn (0-256)
  dataIn?: string; // Data to send (hex string, max 256 bytes)
  le: number; // Expected length of response (0-256)
}

export interface ApduRecv {
  outLen: number;
  outData: string;
  swa: number;
  swb: number;
}

export interface PinPadConfig {
  pinPadType: number; // 0-5
  pinType: number; // 0: online, 1: offline
  isOrderNumKey: number; // 0: random, 1: ordered
  pan: string; // ASCII format, 12-19 bytes
  pinKeyIndex: number;
  minInput: number;
  maxInput: number;
  inputStep: number;
  timeout: number; // in ms
  isSupportBypass: number; // 0: not support, 1: support
  pinblockFormat: number;
  algorithmType: number; // 0: 3DES, 1: SM4, 2: AES
  keySystem: number; // 0: MKSK, 1: DUKPT
  diversify?: string; // hex string
}

export interface PinPadConfigEx extends PinPadConfig {
  expLen?: string; // e.g., "0,4,6"
}

export interface PinPadData {
  numX: number[];
  numY: number[];
  numH: number;
  numW: number;
  cancelX: number;
  cancelY: number;
  cancelH: number;
  cancelW: number;
}

export interface PinPadDataEx extends PinPadData {
  enterX: number;
  enterY: number;
  enterH: number;
  enterW: number;
  clearX: number;
  clearY: number;
  clearH: number;
  clearW: number;
}

export interface PinPadTextConfig {
  title?: string;
  amount?: string;
  pinLengthHint?: string;
  okButtonText?: string;
  clearButtonText?: string;
  cancelButtonText?: string;
}

export interface PinPadModeConfig {
  normal?: number; // 0: disable, 1: enable
  longPressToClear?: number;
  silent?: number;
  greenLed?: number;
  monitorClearKey?: number;
  cancelToClear?: number;
  visualImpairment?: number;
  longTimeoutTime?: number;
}

export interface VisualImpairmentParam {
  timeoutGap1?: number; // Screen touch time (0-100, unit: 100ms)
  timeoutGap2?: number; // Time between two taps (0-100, unit: 100ms)
  ttsLanguage?: number; // 0-follow system, 1-English, 2-Polish, 3-French, 4-Portugal, 5-Chinese, 6-Spanish
  rnibSelectMode?: number; // 0-double tap, 1-long press
  rnibHoldTime?: number; // Long press time (0-100, unit: 100ms)
}

export interface StartInputPinConfig {
  pinPadType: number;
  pinType: number;
  isOrderNumKey: number;
  minInput?: number;
  maxInput?: number;
  inputStep?: number;
  expLen?: string;
  isSupportBypass?: number;
  timeout?: number;
}

export interface KeyMappingRecord {
  pkgName: string;
  signature: string;
  keySystem: string;
  keyIndexRaw: number;
  keyIndexMapped: number;
  keyType: string;
  keyAlgType: string;
  checkValue: string;
  injectFlag: string;
  keySize: number;
  ksn?: string;
}

export interface AidParam {
  tag9F06Value: string; // AID value (hex string)
  selFlag: number; // Selection flag
  priority: number; // Application priority
  targetPercent: number;
  maxTargetPercent: number;
  floorLimitCheck: number;
  randTransSel: number;
  velocityCheck: number;
  floorLimit: string; // hex string
  threshold: string; // hex string
  tacDenial: string; // hex string
  tacOnline: string; // hex string
  tacDefault: string; // hex string
  acquierId: string; // hex string
  dDol: string; // hex string
  tDol: string; // hex string
  version: string; // hex string
  riskManData: string; // hex string
  termCapabilities?: string; // hex string
  addTermCapabilities?: string; // hex string
  // Extended fields
  clsStatusCheck?: number;
  zeroCheck?: number;
  kernelType?: number;
  paramType?: number;
  extSelectSupFlg?: number;
}

export interface CapkParam {
  tag9F06Value: string; // RID (hex string)
  tag9F22Value: string; // CAPK index (hex string)
  hashInd: number; // Hash algorithm indicator
  arithInd: number; // Arithmetic indicator
  module: string; // Modulus (hex string)
  exponent: string; // Exponent (hex string)
  expDate: string; // Expiry date (YYYYMMDD)
  checkSum: string; // Check sum (hex string)
}

export interface EmvTermParam {
  countryCode: string; // hex string
  transRefCurrCode: string; // hex string
  transRefCurrExp: string; // hex string
  transCurrCode: string; // hex string
  transCurrExp: string; // hex string
  transType: string; // hex string
  merchantId: string; // ASCII string
  merchantCateCode: string; // hex string
  merchantNameLoc: string; // ASCII string
  terminalId: string; // ASCII string
  terminalType: string; // hex string
  terminalCapabilities: string; // hex string
  addTermCapabilities: string; // hex string
  terminalCountryCode: string; // hex string
}

export interface EmvTermParamEx extends EmvTermParam {
  contactlessManualSelApp?: number;
  contactlessManualSelAppGeneralEx?: number;
  importScriptData?: number;
  dpasV2Support?: number;
  dpasDeferredAuthSupport?: number;
  dpasDataStorageSupport?: number;
  dpasExtendedLoggingSupport?: number;
  dpasTearingRecoverySupport?: number;
  quickChip?: number;
  noSignatureOrPINThreshold?: string;
  dpasContactlessSpeedupSupport?: number;
  jcbContactlessSpeedupSupport?: number;
  AEContactlessSpeedupSupport?: number;
  AEOnlineProcessSupport?: number;
  SupportAE41?: number;
  supportPOI?: number;
  CertifiedEP?: number;
  AutoRun?: number;
  KernelsForCertEP?: string;
}

export interface EmvTransData {
  amount: string; // Transaction amount (cents, e.g., "1000" for $10.00)
  cashbackAmount?: string; // Cashback amount
  transType: string; // Transaction type (hex, e.g., "00" for goods/services)
  flowType: number; // Flow type
  cardType: number; // Card type
  emvAuthLevel?: number; // 0: Normal, 1: EC PBOC
}

export interface EmvTransDataEx {
  amount: string;
  cashbackAmount?: string;
  transType: string;
  flowType: number;
  cardType: number;
  emvAuthLevel?: number;
  currencyCode?: string;
  [key: string]: any; // Additional custom parameters
}

export interface EmvTransResult {
  result: number; // Transaction result code
  tlvData?: string; // TLV data (hex string)
  [key: string]: any; // Additional result data
}

export interface DrlLimitSet {
  tag9F06Value: string;
  drlData: string; // hex string
}

export interface RevocList {
  tag9F06Value: string;
  revocData: string; // hex string
}

export interface AccountDataSecParam {
  encKeyIndex: number;
  encKeyAlgType: number;
  panAppendContent?: string;
  panAppendMode?: number;
}

// ==================== Constants ====================

export enum CardType {
  MAGNETIC = 0x01,
  IC = 0x02,
  NFC = 0x04,
  FELICA = 0x08,
  PSAM1 = 0x10,
  PSAM2 = 0x20,
  PSAM3 = 0x40,
  SAM1 = 0x10,
  SAM2 = 0x20,
  SAM3 = 0x40,
}

export enum LedLight {
  RED = 0,
  GREEN = 1,
  YELLOW = 2,
  BLUE = 3,
  RED_GREEN = 4,
  RED_BLUE = 5,
  CORNER_LED_RED = 6,
  CORNER_LED_GREEN = 7,
  CORNER_LED_BLUE = 8,
  INDICATOR_LED_WHITE = 9,
  INDICATOR_LED_RED = 10,
  INDICATOR_LED_GREEN = 11,
  INDICATOR_LED_BLUE = 12,
}

export enum PowerManage {
  DORMANT = 1, // Not supported
  SHUTDOWN = 2,
  REBOOT = 3,
}

export enum CardExistStatus {
  NOT_EXIST = 0,
  EXIST = 1,
  UNKNOWN = -1,
}

export enum EncryptionMode {
  ECB = 0,
  CBC = 1,
  CFB = 2,
  OFB = 3,
}

export enum MacAlgorithm {
  ISO9797_1 = 0,
  X9_19 = 1,
  X9_19_DEA = 2,
  CBC_MAC = 3,
  HMAC_SHA1 = 4,
  HMAC_SHA256 = 5,
  CMAC = 6,
}

export enum KeyType {
  KEK = 0, // Key Encryption Key
  TMK = 1, // Terminal Master Key
  PIK = 2, // PIN Key
  MAK = 3, // MAC Key
  TDK = 4, // Track Data Key
  REC = 5, // Record Key
  DUKPT_BDK = 10, // DUKPT Base Derivation Key
  DUKPT_IPEK = 11, // DUKPT Initial PIN Encryption Key
  KBPK = 12, // Key Block Protection Key
  TADK = 13, // Track Data Key (Another type)
  RSA_PUK = 20, // RSA Public Key
  RSA_PVK = 21, // RSA Private Key
  RSA_PUK_KPK = 22, // RSA Public Key Protection Key
  RSA_PVK_KPK = 23, // RSA Private Key Protection Key
  RSA_KEK = 24, // RSA Key Encryption Key
  SM2_PUK = 30, // SM2 Public Key
  SM2_PVK = 31, // SM2 Private Key
  ECC_PUK = 40, // ECC Public Key
  ECC_PVK = 41, // ECC Private Key
}

export enum KeyAlgorithm {
  DES = 0,
  TDES = 1,
  AES = 2,
  SM4 = 3,
  RSA = 10,
  SM2 = 11,
}

export enum KeySystem {
  MKSK = 0, // Master Key/Session Key
  DUKPT = 1, // Derived Unique Key Per Transaction
}

export enum PinBlockFormat {
  FORMAT_0 = 0, // ISO 9564-1 Format 0
  FORMAT_1 = 1, // ISO 9564-1 Format 1
  FORMAT_2 = 2, // ISO 9564-1 Format 2
  FORMAT_3 = 3, // ISO 9564-1 Format 3
  FORMAT_4 = 4, // ISO 9564-1 Format 4
}

export enum EmvFlowType {
  SIMPLE = 0x00, // Simple flow
  COMPLETE = 0x01, // Complete flow
  QPBOC = 0x02, // QPBOC flow
  MSD = 0x03, // MSD flow
  CONTACTLESS = 0x04, // Contactless flow
}

export enum EmvTransResultCode {
  APPROVED = 0, // Transaction approved
  DECLINED = 1, // Transaction declined
  GO_ONLINE = 2, // Go online
  FALLBACK = 3, // Fallback
  CANCELED = 4, // Transaction canceled
  TERMINATED = 5, // Transaction terminated
  TECH_FALLBACK = 6, // Technical fallback
  CARD_BLOCKED = 7, // Card blocked
  CARD_EXPIRED = 8, // Card expired
  SERVICE_NOT_ALLOWED = 9, // Service not allowed
}

export enum TlvOpCode {
  EMV = 0,
  PAYPASS = 1,
  PAYWAVE = 2,
  QPBOC = 3,
  JCB = 4,
  AE = 5,
  DPAS = 6,
  PURE = 7,
  EFTPOS = 8,
  MIR = 9,
  RUPAY = 10,
  CPACE = 11,
  SAMSUNG_PAY = 12,
  PAGO = 13,
  OP_ADD_SELF_DEFINE_TAG = 100,
  OP_DEL_SELF_DEFINE_TAG = 101,
}

export enum PrinterStatus {
  NORMAL = 0,
  OUT_OF_PAPER = 1,
  OVERHEAT = 2,
  VOLTAGE_TOO_LOW = 3,
  PRINTING = 4,
}

export enum BarcodeType {
  UPC_A = 0,
  UPC_E = 1,
  EAN13 = 2,
  EAN8 = 3,
  CODE39 = 4,
  ITF = 5,
  CODABAR = 6,
  CODE93 = 7,
  CODE128 = 8,
}

export enum QRErrorLevel {
  L = 0, // 7% error correction
  M = 1, // 15% error correction
  Q = 2, // 25% error correction
  H = 3, // 30% error correction
}

export enum TextAlign {
  LEFT = 0,
  CENTER = 1,
  RIGHT = 2,
}

// System Parameter Keys
export const SysParam = {
  // Version info
  PAY_LIB_VERSION: 'PayLibVersion',
  SPHS_VERSION: 'SPHSVersion',
  EMV_VERSION: 'EMVVersion',
  PAYPASS_VERSION: 'PaypassVersion',
  PAYWAVE_VERSION: 'PaywaveVersion',
  QPBOC_VERSION: 'QPBOCVersion',
  ENTRY_VERSION: 'EntryVersion',
  MIR_VERSION: 'MirVersion',
  JCB_VERSION: 'JCBVersion',
  PAGO_VERSION: 'PAGOVersion',
  AE_VERSION: 'AEVersion',
  FLASH_VERSION: 'FLASHVersion',
  DPAS_VERSION: 'DPASVersion',
  APEMV_VERSION: 'APEMVVersion',
  PURE_VERSION_FULL: 'PUREVersionFul',
  EFTPOS_VERSION_FULL: 'EFTPOSVersionFull',
  APEMV_VERSION_FULL: 'APEMVVersionFull',
  PCD_IFM_VERSION: 'PCD_IFMVersion',
  IFM_LIB_VERSION: 'IfmLibVersion',
  MSR_VERSION: 'MsrVersion',
  POSAPI_VERSION: 'posapiVersion',
  PCI_PTS_VERSION: 'PCIPTSVersion',
  RNIB_VERSION: 'RNIBVersion',
  CPACE_VERSION: 'CPACE_VERSION',
  CPACE_RELEASE_DATE: 'CPACE_RELEASE_DATE',
  
  // Checksum
  EMV_KERNEL_CHECKSUM: 'EmvKernelCheckSum',
  
  // Configuration
  RESERVED: 'RESERVED',
  TERM_STATUS: 'TERM_STATUS',
  PINPAD_MODE: 'PINPAD_MODE',
  PCD_PARAM_A: 'PCD_PARAM_A',
  PCD_PARAM_B: 'PCD_PARAM_B',
  PCD_PARAM_C: 'PCD_PARAM_C',
  SEC_MODE: 'SecMode',
  KB_BEEP_MODE: 'KBBeepMode',
  EMV_MASK: 'EMV_MASK',
  SRED: 'sred',
  SAM: 'SAM',
  RTCBATVOLDET: 'RTCBATVOLDET',
  
  // Status values
  CLEAR_TAMPER_LOG: 'clearTamperLog',
  CLEAR_TAMPER: 'clearTamper',
} as const;

export const PinPadMode = {
  MODE_NORMAL: '0',
  MODE_MEITUAN: '1',
  MODE_SILENT: '2',
  MODE_LEDOFF: '3',
} as const;

export const KBBeepMode = {
  MODE_ON: '1',
  MODE_OFF: '0',
} as const;
