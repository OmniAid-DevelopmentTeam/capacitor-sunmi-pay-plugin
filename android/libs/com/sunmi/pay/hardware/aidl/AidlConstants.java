package com.sunmi.pay.hardware.aidl;

public class AidlConstants {

    /** 卡类型 **/
    public enum CardType {
        // 检卡顺序,不能乱改
        MAGNETIC(1 << 0, "MAG"),
        NFC(1 << 2, "SCCL0"),
        IC(1 << 1, "SCC0"),
        PSAM0(1 << 4, "SAM0"),
        SAM1(1 << 6, "SAM1"),
        MIFARE(1 << 3, "Mifare"),
        FELICA(1 << 5, "Felica"),
        MIFARE_PLUS(1 << 7, "MPLUS"),
        MIFARE_DESFIRE(1 << 8, "Desfire"),
        AT24C01(1 << 9, "24C01"),
        AT24C02(1 << 10, "24C02"),
        AT24C04(1 << 11, "24C04"),
        AT24C08(1 << 12, "24C08"),
        AT24C16(1 << 13, "24C16"),
        AT24C32(1 << 14, "24C32"),
        AT24C64(1 << 15, "24C64"),
        AT24C128(1 << 16, "24C128"),
        AT24C256(1 << 17, "24C256"),
        AT24C512(1 << 18, "24C512"),
        SLE4442(1 << 19, "4442"),
        SLE4428(1 << 20, "4428"),
        AT88SC1608(1 << 21, "1608"),
        CTX512B(1 << 22, "CTX512"),
        SAM2(1 << 23, "SAM2"),
        SAM3(1 << 24, "SAM3"),
        SRI(1 << 25, "SRI"),
        SAM4(1 << 26, "SAM4"),
        SAM5(1 << 27, "SAM5"),
        ISO15693(1 << 28, "15693"),
        INNOVATRON(1 << 29, "INNOVATRON");

        private final int value;
        private final String deviceId;

        CardType(int value, String text) {
            this.value = value;
            this.deviceId = text;
        }

        public int getValue() {
            return value;
        }

        public String getMessage() {
            return deviceId;
        }

        public static String getDeviceId(int value) {
            for (CardType card : values()) {
                if (card.value == value) {
                    return card.deviceId;
                }
            }
            return "";
        }
    }

    /** 检卡 */
    public static class ReadCard {
        /** 磁道无错误 */
        public static final int ERR_TRACK_SUCCESS = 0;
        /** 磁道无数据 */
        public static final int ERR_TRACK_NO_DATA = -1;
        /** 磁道奇偶校验错 */
        public static final int ERR_TRACK_PARITY_CHECK = -2;
        /** 磁道LRC校验错 */
        public static final int ERR_TRACK_LRC_CHECK = -3;
    }

    /** 证件类型 */
    public static class CertType {
        /** 身份证 */
        public static final int IDCARD = 536911872;
        /** 军官证 */
        public static final int ARMYCARD = 536911873;
        /** 护照 */
        public static final int PASSPORT = 536911874;
        /** 入境证 */
        public static final int ARRIVALCARD = 536911875;
        /** 临时身份证 */
        public static final int TEMPIDCARD = 536911876;
        /** 其他证件 */
        public static final int OTHERCARD = 536911877;
    }

    /** 密钥相关常量 */
    public static class Security {
        public static final int KEY_TYPE_KEK = 0x01;         // 密钥类型，KEK
        public static final int KEY_TYPE_TMK = 0x02;         // 密钥类型，TMK
        public static final int KEY_TYPE_PIK = 0x03;         // 密钥类型，PIK
        public static final int KEY_TYPE_MAK = 0x04;         // 密钥类型，MAK
        public static final int KEY_TYPE_TDK = 0x05;         // 密钥类型，TDK
        public static final int KEY_TYPE_REC = 0x06;         // 密钥类型，保留
        public static final int KEY_TYPE_DUPKT_BDK = 0x07;   // 密钥类型，dupkt根密钥
        public static final int KEY_TYPE_DUPKT_IPEK = 0x08;  // 密钥类型，初始PIN加密密钥
        public static final int KEY_TYPE_KBPK = 0x09;        // 密钥类型，TR31密钥块保护密钥(KBPK)
        public static final int KEY_TYPE_TADK = 0x0A;        // 密钥类型，账户数据密钥TADK
        public static final int KEY_TYPE_RSA_KPK = 0x0B;     // 密钥类型，RSA KPK
        public static final int KEY_TYPE_RSA_KEK = 0x0C;     // 密钥类型，RSA KEK

        public static final int KEY_ALG_TYPE_3DES = 0x01;    //密钥类型 3des des 都是用这个
        public static final int KEY_ALG_TYPE_AES = 0x02;     //加密类型 aes
        public static final int KEY_ALG_TYPE_SM4 = 0x03;     //加密类型 sm4

        public static final int MAC_ALG_ISO_9797_1_MAC_ALG1 = 1001;      // 固定用8字节长度的key
        public static final int MAC_ALG_ISO_9797_1_MAC_ALG3 = 1003;      //
        public static final int MAC_ALG_ISO_16609_MAC_ALG1 = 2000;       // 与9797-1-ALG3相同
        public static final int MAC_ALG_FAST_MODE = 3000;                // FAST_MODE 银联标准计算mac
        public static final int MAC_ALG_X9_19 = 3001;                    // X9_19算法计算mac
        public static final int MAC_ALG_CBC = 3002;                      // CBC 银联标准计算mac
        public static final int MAC_ALG_CUP_SM4_MAC_ALG1 = 3003;         // 国密SM4计算mac
        public static final int MAC_ALG_CUP_SM4_MAC_ALG2 = 3004;
        public static final int MAC_ALG_X9_19_DEA = 3005;                // X9.19-DEA
        public static final int MAC_ALG_HMAC_SHA1 = 3006;                // HMAC-SHA1
        public static final int MAC_ALG_HMAC_SHA256 = 3007;              // HMAC-SHA256
        public static final int MAC_ALG_CMAC = 3008;                     // CMAC
        public static final int MAC_ALG_FAST_MODE_INTERNATIONAL = 30000; // FAST_MODE 国际标准计算mac
        public static final int MAC_ALG_CBC_INTERNATIONAL = 30001;       // CBC 国际标准计算mac

        public static final int SEC_STATUS_MONITOR_ZERO = 0x01;   //BIT0
        public static final int SEC_STATUS_MONITOR_ONE = 0x02;    //BIT1
        public static final int SEC_STATUS_MONITOR_TWO = 0x04;    //BIT2
        public static final int SEC_STATUS_MONITOR_THREE = 0x08;  //BIT3

        public static final int AUTH_TYPE_DEBUGMODE = 1;          // 安全状态中的 DebugMode

        public static final String DEBUGMODE_YES = "Yes";         // 终端处于调试模式
        public static final String DEBUGMODE_NO = "No";           // 终端处于正常模式

        //密钥操作类型 ctrl_code
        public static final int SEC_CTRL_GETKCV = 0x00;
        public static final int SEC_CTRL_DUKPT_ADD_KSN = 0x01;
        public static final int SEC_CTRL_DUKPT_GET_KSN = 0x02;
        public static final int SEC_CTRL_ERASE_KEY = 0x03;

        //密钥体系类型
        public static final int SEC_MKSK = 0x00;
        public static final int SEC_DUKPT = 0x01;
        public static final int SEC_RSA_KEY = 0x02;
        public static final int SEC_SM2_KEY = 0x03;
        public static final int SEC_ECC_KEY = 0x04;
        public static final int SEC_DEVICE_CERT = 0x05;

        public static final int SEC_MKSK_NOLOST = 0x06;
        public static final int SEC_RSA_KEY_NOLOST = 0x07;
        public static final int SEC_ECC_KEY_NOLOST = 0x08;
        public static final int SEC_CERT_NOLOST = 0x09;

        // 数据加解密模式
        public static final int DATA_MODE_ECB = 0;
        public static final int DATA_MODE_CBC = 1;
        public static final int DATA_MODE_OFB = 2;
        public static final int DATA_MODE_CFB = 3;

        // Dukpt key select
        public static final int DUKPT_KEY_SELECT_KEY_PIN = 0;              // DUKPT PIN密钥
        public static final int DUKPT_KEY_SELECT_KEY_MAC_BOTH = 1;         // DUKPT 请求和响应MAC密钥，既能产生MAC，也能校验MAC
        public static final int DUKPT_KEY_SELECT_KEY_MAC_RSP = 2;          // DUKPT 响应MAC密钥，校验MACNNN
        public static final int DUKPT_KEY_SELECT_KEY_DATA_BOTH = 3;        // DUKPT 请求和响应数据密钥，既能加密，也能解密
        public static final int DUKPT_KEY_SELECT_KEY_DATA_RSP = 4;         // DUKPT 响应数据密钥，解密数据
        public static final int DUKPT_KEY_SELECT_KEY_MAC_GEN = 5;          // DUKPT 计算Mac密钥（dukpt-aes）
        public static final int DUKPT_KEY_SELECT_KEY_DATA_ENC = 6;         // DUKPT 数据加密密钥（dukpt-aes）
        public static final int DUKPT_KEY_SELECT_KEY_KEY_ENC_KEY = 7;      // DUKPT 密钥加密密钥(key encryption key)（dukpt-aes）
        public static final int DUKPT_KEY_SELECT_KEY_DERIVATION = 8;       // DUKPT ipek key,aquire service use（dukpt-aes）
        public static final int DUKPT_KEY_SELECT_KEY_DERIVATION_INIT = 9;  // DUKPT bdk key,aquire service use（dukpt-aes）

        // Dukpt-AES key type
        public static final int DUKPT_KEY_TYPE_2TDEA = 1;
        public static final int DUKPT_KEY_TYPE_3TDEA = 2;
        public static final int DUKPT_KEY_TYPE_AES128 = 3;
        public static final int DUKPT_KEY_TYPE_AES192 = 4;
        public static final int DUKPT_KEY_TYPE_AES256 = 5;

        //摘要算法类型
        public static final int HASH_SHA_TYPE_1 = 0x00;
        public static final int HASH_SHA_TYPE_224 = 0x01;
        public static final int HASH_SHA_TYPE_256 = 0x02;
        public static final int HASH_SHA_TYPE_384 = 0x03;
        public static final int HASH_SHA_TYPE_512 = 0x04;
        public static final int HASH_SM3_TYPE = 0x05;

        // RSA transformation
        public static final String RSA_TRANSFORMATION_1 = "RSA/None/NoPadding";
        public static final String RSA_TRANSFORMATION_2 = "RSA/None/PKCS1Padding";
        public static final String RSA_TRANSFORMATION_3 = "RSA/ECB/NoPadding";
        public static final String RSA_TRANSFORMATION_4 = "RSA/ECB/PKCS1Padding";
        public static final String RSA_TRANSFORMATION_5 = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
        public static final String RSA_TRANSFORMATION_6 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
        public static final String RSA_TRANSFORMATION_7 = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";

        //RSA signature algorithms
        public static final String RSA_SIGN_ALG_1 = "NONEwithRSA";
        public static final String RSA_SIGN_ALG_2 = "MD5withRSA";
        public static final String RSA_SIGN_ALG_3 = "SHA1withRSA";
        public static final String RSA_SIGN_ALG_4 = "SHA256withRSA";
        public static final String RSA_SIGN_ALG_5 = "SHA512withRSA";

        // ECC步骤
        public static final int SEC_ECDH_STEP1_MODE = 2;  //ECDH密钥协商第一步（仅支持mksk）
        public static final int SEC_ECDH_STEP2_MODE = 3;  //ECDH密钥协商第二步（仅支持mksk）

        public static final int SEC_OAEP_MODE = 5;

        // ECC曲线参数
        public static final String SEC_ECC_PARAM_P256 = "P-256";
        public static final String SEC_ECC_PARAM_P384 = "P-384";
        public static final String SEC_ECC_PARAM_P521 = "P-521";

        public static final int ECC_KEYTYPE_PK = 0;
        public static final int ECC_KEYTYPE_SK = 1;

        // KCV mode
        public static final int KCV_MODE_NOCHK = 0;
        public static final int KCV_MODE_CHK0 = 1;
        public static final int KCV_MODE_CHKFIX = 2;
        public static final int KCV_MODE_CHKMAC = 3;
        public static final int KCV_MODE_CHKCMAC = 4; //AES key get KCV use CMAC
        public static final int KCV_MODE_CHKFIX_16 = 5;
        public static final int KCV_MODE_CHK_BUF = 6;
        public static final int KCV_MODE_CHKCMAC_BUF = 7;

        // Key control code
        public static final int KEY_CTRL_PANPARA = 0x41;
        public static final int KEY_CTRL_AUTHPARA = 0x42;
        public static final int KEY_CTRL_APACSMAC = 0x43;

        //key variant usage
        public static final int KEY_VARIANT_XOR = 0xE001;

        //RSA padding mode
        public static final int NOTHING_PADDING = 0;  //不填充
        public static final int PKCS1_PADDING = 1;
        public static final int PKCS7_PADDING = 2;
        public static final int PKCS5_PADDING = 3;
        public static final int PKCS1_OAEP_PADDING = 4;
        public static final int PKCS1_V1_5_SHA512 = 5;
        public static final int PADDING_OAEP_SHA1 = 6;

        //Inject symmetric key mode
        //OAEP模式注入密钥，依赖密钥是设备证书私钥
        public static final int INJECT_OAEP_MODE = 0x05;
        //PKCS1模式注入密钥，依赖密钥是RSA私钥
        public static final int INJECT_PKCS1_MODE = 0x06;
        public static final int INJECT_DERIVER_OWF2 = 0x80;//OWF2算法类型派生并保存密钥
        public static final int INJECT_DERIVER_OWF3 = 0x81;//OWF3算法类型派生并保存密钥
        public static final int INJECT_DERIVER_GOWF = 0x82;//GOWF算法类型派生并保存密钥
        public static final int INJECT_DERIVER_ENC = 0x83;

        //mode of cert generate
        public static final int CERT_GENERATE_RSA2048_E65537_PVK_PUK = 0x82;
    }

    /** EMV相关常量 */
    public static class EMV {
        /** 强制联机 */
        public static final int FORCE_ONLINE = 0;
        /** 非联机 */
        public static final int NO_ONLINE = 1;
        /** CAPK AID都不存在 */
        public static final int EXIST_ALL_NOT = -1;
        /** CAPK AID都存在 */
        public static final int EXIST_ALL = 0;
        /** CAPK 不存在 */
        public static final int EXIST_CAPK_NOT = 1;
        /** AID 不存在 */
        public static final int EXIST_AID_NOT = 2;
        /** 交易完成 */
        public static final int EMV_RESULT_FINISHED = 0x9000;
        /** 交易终止 */
        public static final int EMV_RESULT_TERMINATION = 0x9001;
        /** 交易终止，PINBLOCK获取失败 */
        public static final int EMV_ERROR_PINBLOCK = 0x9002;
        /** 不支持交易 */
        public static final int EMV_UNSUPPORTED_TRANS = 0x9003;

        /** AID函数行为定义 */
        public static class AID {
            /** 添加或者更新一条AID */
            public static final int ACTION_AID_ADD = 0x00;
            /** 删除所有AID */
            public static final int ACTION_AID_DEL = 0x01;
        }

        /** CAPK函数行为定义 */
        public static class CAPK {
            /** 添加或者更新一条CAPK */
            public static final int ACTION_CAPK_ADD = 0x00;
            /** 删除所有CAPK */
            public static final int ACTION_CAPK_DEL = 0x01;
        }

        /** EMV中预置密码键盘相关行为定义 */
        public static class PinPad {
            /** 超时 */
            public static final int EMV_PINPAD_TIMEOUT = 6001;
            /** 取消 */
            public static final int EMV_PINPAD_CANCEL = 6002;
            /** 确认 */
            public static final int EMV_PINPAD_CONNFIRM = 6003;
        }

        /** TLV操作类型 */
        public static class TLVOpCode {
            /** 普通 */
            public static final int OP_NORMAL = 0;
            /** PayPass */
            public static final int OP_PAYPASS = 1;
            /** PayWave */
            public static final int OP_PAYWAVE = 2;
            /** MIR */
            public static final int OP_MIR = 3;
            /** PAGO */
            public static final int OP_PAGO = 4;
            /** JCB */
            public static final int OP_JCB = 5;
            /** PURE */
            public static final int OP_PURE = 6;
            /** AE */
            public static final int OP_AE = 7;
            /** FLASH */
            public static final int OP_FLASH = 8;
            /** DPAS */
            public static final int OP_DPAS = 9;
            /** RUPAY */
            public static final int OP_RUPAY = 10;
            /** EFTPOS */
            public static final int OP_EFTPOS = 11;
            /** CPACE */
            public static final int OP_CPACE = 13;
            /** AID RELEVANT */
            public static final int OP_AID_RELEVANT = 101;
            /** 添加自定义tag */
            public static final int OP_ADD_SELF_DEFINE_TAG = 102;
            /** 删除自定义tag */
            public static final int OP_DEL_SELF_DEFINE_TAG = 103;
            /** 获取加密卡号 */
            public static final int OP_ENCRYPT_PAN = 104;
            /** 设置tag值为空 */
            public static final int OP_SET_TAG_EMPTY = 105;
            /** 设置tag不存在 */
            public static final int OP_SET_TAG_NOT_PRESENT = 106; //原 104，因以被OP_ENCRYPT_PAN定义，改为106


        }

        /** 流程类型 */
        public static class FlowType {
            /** 标准的授权过程 */
            public static final int TYPE_EMV_STANDARD = 0x01;
            /** 简易流程-读到卡号即结束 */
            public static final int TYPE_EMV_BRIEF = 0x02;
            /** QPass流程，NFC跳过输密 */
            public static final int TYPE_NFC_SKIP_CVM = 0x03;
            /** 非接提速流程 */
            public static final int TYPE_NFC_SPEEDUP = 0x04;
            /** 非接提速流程(FULL) */
            public static final int TYPE_NFC_SPEEDUP_FULL = 0x05;
        }

        /** 清除数据函数行为定义 */
        public static class ClearDataOpCode {
            /** 所有数据 */
            public static final int OP_CLEAR_DATA_ALL = 0;
            /** 终端数据 */
            public static final int OP_CLEAR_DATA_TERMINAL = 1;
            /** 卡片数据 */
            public static final int OP_CLEAR_DATA_CARD = 2;
        }

        /** EMV内核类型 */
        public static class KernelType {
            /** EMV(接触) */
            public static final int EMV = 0;
            /** QPBOC */
            public static final int QPBOC = 1;
            /** PAYPASS */
            public static final int PAYPASS = 2;
            /** PAYWAVE */
            public static final int PAYWAVE = 3;
            /** AE */
            public static final int AE = 4;
            /** DISCOVER */
            public static final int DISCOVER = 5;
            /** JCB */
            public static final int JCB = 6;
            /** FLASH */
            public static final int FLASH = 7;
            /** MIR */
            public static final int MIR = 8;
            /** MCCS */
            public static final int MCCS = 9;
            /** RUPAY */
            public static final int RUPAY = 10;
            /** PAGO */
            public static final int PAGO = 11;
            /** EFTPOS */
            public static final int EFTPOS = 12;
            /** SAMSUNGPAY */
            public static final int SAMSUNGPAY = 13;
            /** CPACE */
            public static final int CPACE = 15;
        }

        /** EMV参数类型 */
        public static class ParamType {
            /** CONTACT/CONTACTLESS(默认) */
            public static final int DEFAULT = 0;
            /** CONTACT(接触) */
            public static final int CONTACT = 1;
            /** CONTACTLESS(非接) */
            public static final int CONTACTLESS = 2;
        }

        /** EMV交易结果 */
        public static class TransResult {
            /** 成功(兼容) */
            public static final int SUCCESS = 0;
            /** 脱机批准 */
            public static final int OFFLINE_APPROVAL = 1;
            /** 脱机拒绝 */
            public static final int OFFLINE_DECLINE = 2;
            /** 预留 */
            public static final int RESERVE = 3;
            /** 重新拍卡 */
            public static final int TRY_AGAIN = 4;
            /** 联机批准 */
            public static final int ONLINE_APPROVAL = 5;
            /** 联机拒绝 */
            public static final int ONLINE_DECLINE = 6;
        }

        /** EMV联机结果 */
        public static class OnlineResult {
            /** 联机批准 */
            public static final int ONLINE_APPROVAL = 0;
            /** 联机拒绝 */
            public static final int ONLINE_DECLINE = 1;
            /** 联机失败 */
            public static final int ONLINE_FAIL = 2;
            /** 联机批准与二次拍卡 */
            public static final int ONLINE_APPROVAL_2_TAP = 3;
            /** 联机拒绝与二次拍卡 */
            public static final int ONLINE_DECLINE_2_TAP = 4;
            /** 联机失败与二次拍卡 */
            public static final int ONLINE_FAIL_2_TAP = 5;
            /** 脱机拒绝 */
            public static final int OFFLINE_DECLINE = 6;
            /** 联机失败与Full online */
            public static final int ONLINE_FAIL_FULL_ONLINE = 7;
            /** 联机成功，8A存在，且不存在脚本 */
            public static final int ONLINE_SUCCESS_NO_SCRIPT = 8;
            /** AE 后台要求输PIN失败 */
            public static final int ONLINE_FAIL_ONLINEPIN = 9;
        }
    }

    /** 获取系统参数行为定义 */
    public static class SysParam {
        public static final String BASE_VERSION = "BASE_VER";              //libbase库版本
        public static final String MSR2_FW_VER = "MSR2_FW_VER";            //第二磁头固件版本信息,字符串版本格式”A.B.C”
        public static final String HARDWARE_VERSION = "HardwareVersion";   //“HardwareVer”-设备硬件版本
        public static final String FIRMWARE_VERSION = "FirmwareVersion";   //“FirmwareVer”-设备固件版本
        public static final String SM_VERSION = "SMVersion";               //“SMVersion”-国密固件版本
        public static final String ETC_FIRM_VERSION = "ETCFirmVersion";    //ETC固件版本
        public static final String BootVersion = "BootVersion";            //SP BOOT 版本号
        public static final String CFG_FILE_VERSION = "CfgFileVersion";    //配置文件版本号
        public static final String FW_VERSION = "FWVersion";               //FWVersion
        public static final String SN = "SN";                              //“SN”-获取机器SN号
        public static final String PN = "PN";                              //“PN”-获取机器SN1(PN)渠道自定义SN号
        public static final String TUSN = "TUSN";                          //“TUSN”-获取机器银联TUSN号
        public static final String DEVICE_CODE = "DeviceCode";             //“DeviceCode”-获取设备型号
        public static final String DEVICE_MODEL = "DeviceModel";           //“DeviceModel”-获取机型
        public static final String RESERVED = "Reserved";                  //预留字段
        public static final String PINPAD_MODE = "PinPadMode";             //PIN输入模式
        public static final String PCD_PARAM_A = "PCD_PARAM_A";            //非接A卡参数
        public static final String PCD_PARAM_B = "PCD_PARAM_B";            //非接B卡参数
        public static final String PCD_PARAM_C = "PCD_PARAM_C";            //非接Felica卡参数
        public static final String PUSH_CFG_FILE = "PushCfgFile";          //推送的配置参数文件
        public static final String SUPPORT_ETC = "SupportETC";             //是否支持ETC,0-不支持,1-支持
        public static final String TUSN_KEY_KCV = "TusnKeyKcv";            //TusnKeyKcv
        public static final String SEC_MODE = "SecMode";                   //key same是否开启
        public static final String PCD_IFM_VERSION = "PCD_IFMVersion";     //IC驱动版本号
        public static final String KB_BEEP_MODE = "KBBeepMode";            //P2_smartPad按键音控制
        public static final String SAM_COUNT = "SAM";                      //获取设备上SAM卡槽个数
        public static final String SM_TYPE = "SMTYPE";                     //获取国密配置
        public static final String FLASH_SIZE = "FLASH";                   //FLASH配置，值为512KB/1MB/4MB/16MB
        public static final String CARD_HW = "CARD_HW";                    //获取MAG/IC/NFC/SAM状态
        public static final String NFC_CONFIG = "NFC";                     //获取设备上NFC配置
        public static final String NFC_FW_VER = "NFC_FW_VER";              //非接固件的版本信息
        public static final String IFM_LIB_VERSION = "IfmLibVersion";      //libicsam.a版本号
        public static final String MSR_VERSION = "MsrVersion";             //厂商磁条卡解码库版本号
        public static final String POSAPI_VERSION = "posapiVersion";       //sunmiposapi.jar版本号
        public static final String RTC_BAT_VOL_DET = "RTCBATVOLDET";       //是否支持检测RTC电池电压
        public static final String SRED = "sred";                          //是否支持sred,0-不支持，1-支持
        public static final String PCI_PTS_VERSION = "PCIPTSVersion";      //PCIPTS版本
        public static final String RNIB_VERSION = "RNIBVersion";           //RNIB认证版本

        //Emv相关版本信息
        public static final String EMV_VERSION = "EMVVersion";                 //EMV版本信息
        public static final String PAYPASS_VERSION = "PaypassVersion";         //Paypass版本信息
        public static final String PAYWAVE_VERSION = "PaywaveVersion";         //Paywave版本信息
        public static final String QPBOC_VERSION = "QPBOCVersion";             //QPBOC版本信息
        public static final String ENTRY_VERSION = "EntryVersion";             //Entry版本信息
        public static final String MIR_VERSION = "MirVersion";                 //Mir版本信息
        public static final String JCB_VERSION = "JCBVersion";                 //JCB版本信息
        public static final String PAGO_VERSION = "PAGOVersion";               //Pago版本信息
        public static final String PURE_VERSION = "PUREVersion";               //Pure版本信息
        public static final String AE_VERSION = "AEVersion";                   //AE版本信息
        public static final String FLASH_VERSION = "FLASHVersion";             //FLASH版本信息
        public static final String DPAS_VERSION = "DPASVersion";               //DPAS版本信息
        public static final String APEMV_VERSION = "APEMVVersion";             //APEMV版本信息
        public static final String EFTPOS_VERSION = "EFTPOSVersion";           //EFTPOS版本信息
        public static final String EMVBASE_VERSION = "EMVBaseVersion";         //EMVBase版本信息
        public static final String KD_VERSION = "KDVersion";                   //KernelDirect版本信息
        public static final String RUPAY_VERSION = "RUPAYVersion";             //RUPAY版本信息
        public static final String SAMSUNGPAY_VERSION = "SAMSUNGPAYVersion";   //SAMSUNGPAY版本信息
        public static final String CPACE_VERSION = "CPACEVersion";             //CPACE版本信息

        public static final String EMV_KERNEL_CHECKSUM = "EmvKernelCheckSum";  //EMV kernel checksum信息
        public static final String PURE_RELEASE_DATE = "PUREReleaseDate";      //Pure版本信息
        public static final String EFTPOS_RELEASE_DATE = "EFTPOSReleaseDate";  //EFTPOS版本信息
        public static final String EMV_RELEASE_DATE = "EMVReleaseDate";        //EMV版本信息
        public static final String PAYPASS_RELEASE_DATE = "PaypassReleaseDate";//Paypass版本信息
        public static final String PAYWAVE_RELEASE_DATE = "PaywaveReleaseDate";//Paywave版本信息
        public static final String QPBOC_RELEASE_DATE = "QPBOCReleaseDate";    //QPBOC版本信息
        public static final String ENTRY_RELEASE_DATE = "EntryReleaseDate";    //Entry版本信息
        public static final String MIR_RELEASE_DATE = "MirReleaseDate";        //Mir版本信息
        public static final String JCB_RELEASE_DATE = "JCBReleaseDate";        //JCB版本信息
        public static final String PAGO_RELEASE_DATE = "PAGOReleaseDate";      //Pago版本信息
        public static final String AE_RELEASE_DATE = "AEReleaseDate";          //AE版本信息
        public static final String FLASH_RELEASE_DATE = "FLASHReleaseDate";    //FLASH版本信息
        public static final String DPAS_RELEASE_DATE = "DPASReleaseDate";      //DPAS版本信息
        public static final String EMVBASE_RELEASE_DATE = "EMVBaseReleaseDate";//EMVBase版本信息
        public static final String KD_RELEASE_DATE = "KDReleaseDate";          //KernelDirect版本信息
        public static final String RUPAY_RELEASE_DATE = "RUPAYReleaseDate";     //Rupay版本信息
        public static final String SAMSUNGPAY_RELEASE_DATE = "SAMSUNGPAYReleaseDate"; //SAMSUNGPAY版本信息
        public static final String CPACE_RELEASE_DATE = "CPACEReleaseDate";     //CPACE版本信息

        //触发Log相关信息
        public static final String TAMPER_LOG = "TamperLog";               //获取触发Log
        public static final String CLEAR_TAMPER_LOG = "ClearTamperLog";    //清除触发Log

        //终端状态相关
        public static final String TERM_STATUS = "TermStatus";             //终端状态
        public static final String CLEAR_TAMPER = "ClearTamper";           //清除触发
        public static final String DEBUG_MODE = "DebugMode";               //调试模式，字符串（只读）“Yes”,“No”

        //EMV认证相关
        public static final String EMV_MASK = "EmvMask";                 //认证 取消键以及接触交易中断非接交易

    }

    /** LED灯 */
    public static class LedLight {
        public static final int RED_LIGHT = 1;              //红灯
        public static final int GREEN_LIGHT = 2;            //绿灯
        public static final int YELLOW_LIGHT = 3;           //黄灯
        public static final int BLUE_LIGHT = 4;             //蓝灯
        public static final int WHITE_LIGHT = 5;            //白灯
        public static final int CORNER_RED_LIGHT = 6;       //四角灯-红（P3_MIX支持）
        public static final int CORNER_GREEN_LIGHT = 7;     //四角灯-绿（P3_MIX支持）
        public static final int CORNER_BLUE_LIGHT = 8;      //四角灯-蓝（P3_MIX支持）
        public static final int INDICATOR_YELLOW_LIGHT = 9; //黄色指示灯（P3_MIX支持）
    }

    /** 设备休眠状态 */
    public static class PowerManage {
        public static final int SYS_POWER_SLEEP = 1; //休眠
        public static final int SYS_SHUTDOWN = 2;    //关机
        public static final int SYS_REBOOT = 3;      //重启
    }

    /** 卡片在位状态 */
    public static class CardExistStatus {
        public static final int CARD_ABSENT = 0x01;    // 卡片不在位
        public static final int CARD_PRESENT = 0x02;   // 卡片在位
    }

    /** 打印状态 */
    public static class PrinterStatus {
        public static final int IDLE = 1;                  //待命
        public static final int PRINTING = 2;              //打印中
        public static final int PAPERLESS = 3;             //缺纸
        public static final int OVERTEMPERATURE = 4;       //过温
        public static final int LOW_BATTERY_VOLTAGE = 5;   //电池电压低
        public static final int PRI_CAP_OPEN = 6;          //打印机开盖
    }

    /** PIN输入模式 */
    public static class PinPadMode {
        public static final String MODE_NORMAL = "Normal";   //普通
        public static final String MODE_MEITUAN = "MeiTuan"; //美团
        public static final String MODE_SILENT = "Silent";   //静音
        public static final String MODE_LEDOFF = "LedOff";   //关闭led
    }

    /** P2_smartPad键盘按键音模式 */
    public static class KBBeepMode {
        public static final String MODE_ON = "ON";           //打开按键音（默认）
        public static final String MODE_OFF = "OFF";         //关闭按键音
    }

    /** PinBlock格式 */
    public static class PinBlockFormat {
        public static final int SEC_PIN_BLK_ISO_FMT0 = 0;  // （支持DES、TDES、SM4）输入格式化后的12位ASCII PAN
        public static final int SEC_PIN_BLK_ISO_FMT1 = 1;  // （支持DES、TDES）无意义
        public static final int SEC_PIN_BLK_ISO_FMT2 = 2;  //
        public static final int SEC_PIN_BLK_ISO_FMT3 = 3;  // （支持DES、TDES）输入格式化后的12位ASCII PAN
        public static final int SEC_PIN_BLK_EPS = 4;       //
        public static final int SEC_PIN_BLK_IBM_3621 = 5;  //
        public static final int SEC_PIN_BLK_IBM_3624 = 6;  //
        public static final int SEC_PIN_BLK_ISO_FMT4 = 7;  // （仅支持AES） 输入格式化后的12-19位ASCII PAN
    }

    /** SystemUI常量 */
    public static class SystemUI {
        //设置屏幕独占
        public static final int SET_SCREEN_MONOPOLY = 1;
        //取消屏幕独占
        public static final int CLEAR_SCREEN_MONOPOLY = -1;
        //禁用下拉状态栏
        public static final int DISABLE_STATUS_BAR_DROP_DOWN = 1;
        //启用下拉状态栏
        public static final int ENABLE_STATUS_BAR_DROP_DOWN = 0;
        //隐藏导航栏
        public static final int HIDE_NAV_BAR = 0;
        //显示导航栏
        public static final int SHOW_NAV_BAR = 1;
        //隐藏返回键
        public static final int HIDE_NAV_ITEM_BACK_KEY = 0x00400000;
        //隐藏home键
        public static final int HIDE_NAV_ITEM_HOME_KEY = 0x00200000;
        //隐藏recent键
        public static final int HIDE_NAV_ITEM_RECENT_KEY = 0x01000000;
    }
}
