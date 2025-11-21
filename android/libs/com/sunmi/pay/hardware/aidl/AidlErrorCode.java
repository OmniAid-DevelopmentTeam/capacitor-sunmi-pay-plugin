package com.sunmi.pay.hardware.aidl;

import android.app.Application;

import com.sunmi.paylib.R;

import java.lang.reflect.Method;

/**
 * L1应用层错误码定义
 */
public enum AidlErrorCode {
    /**
     * 未知错误
     */
    UNKNOWN(Integer.MIN_VALUE, getString(R.string.unknown)),
    /**
     * SPBase错误码
     */
    SPBASE_ERROR(Integer.MIN_VALUE, getString(R.string.unknown)),

    /*=====================函数调用错误码=====================*/
    /**
     * 功能尚不支持
     */
    INVOKING_NOT_SUPPORT(-20000, getString(R.string.invoking_not_support)),
    /**
     * 重复调用
     */
    INVOKING_REPEAT(-20001, getString(R.string.invoking_repeat_invok)),
    /**
     * 固件升级中
     */
    INVOKING_WAIT_UPDATE(-20002, getString(R.string.invoking_wait_update)),
    /**
     * 参数错误
     */
    INVOKING_ERROR_PARAMS(-20003, getString(R.string.invoking_error_params)),
    /**
     * 线程被异常中断
     */
    INVOKING_THREAD_EXCEPTION(-20004, getString(R.string.invoking_thread_exception)),

    /**
     * 指定公钥长度与实际长度不一致
     */
    INVOKING_PUBLIC_KEY_LEN_NOT_MATCH(-20005, getString(R.string.invoking_pubkey_len_not_match)),


    /*=====================固件升级错误码=====================*/
    /**
     * 固件升级失败
     */
    FIRMWARE_UPDATE_FAIL(-20005, getString(R.string.firmware_update_fail)),
    /**
     * 固件校验失败
     */
    FIRMWARE_VERIFY_FAIL(-20006, getString(R.string.firmware_verify_fail)),
    /**
     * 连接服务失败
     */
    SERVICES_INIT_FAIL(-20007, getString(R.string.unknown)),

    /**
     * 远程服务异常(Remote Exception)
     */
    SERVICES_REMOTE_EXCEPTION(-20008, getString(R.string.unknown)),
    /**
     * 文件验签出错
     */
    FILE_VERIFY_ERROR(-21100, getString(R.string.basic_file_verify_fail)),
    /**
     * 文件复制出错
     */
    FILE_COPY_ERROR(-21101, getString(R.string.basic_file_copy_error)),
    /**
     * 文件删除出错
     */
    FILE_DELETE_ERROR(-21102, getString(R.string.basic_file_delete_error)),

    /*=====================读卡模块错误码=====================*/
    /**
     * 读卡失败
     */
    READ_CARD_FAIL(-30001, getString(R.string.readcard_fail)),
    /**
     * 未知的卡类型
     */
    READ_CARD_UNKNOWN_TYPE(-30002, getString(R.string.readcard_unknown_type)),
    /**
     * NFC检卡失败
     */
    READ_CARD_FAIL_NFC(-30003, getString(R.string.readcard_nfc_fail)),
    /**
     * IC检卡失败
     */
    READ_CARD_FAIL_IC(-30004, getString(R.string.readcard_ic_fail)),
    /**
     * 读卡超时
     */
    READ_CARD_TIMEOUT(-30005, getString(R.string.readcard_timeout)),
    /**
     * 一磁错误
     */
    READ_CARD_TRACK1(-30006, getString(R.string.readcard_track1_error)),
    /**
     * 二磁错误
     */
    READ_CARD_TRACK2(-30007, getString(R.string.readcard_track2_error)),
    /**
     * 三磁错误
     */
    READ_CARD_TRACK3(-30008, getString(R.string.readcard_track3_error)),
    /**
     * 一,二,三磁错误
     */
    READ_CARD_TRACK1_2_3(-30009, getString(R.string.readcard_track123_error)),
    /**
     * 一,二磁错误
     */
    READ_CARD_TRACK1_2(-30010, getString(R.string.readcard_track12_error)),
    /**
     * 一,三磁错误
     */
    READ_CARD_TRACK1_3(-30011, getString(R.string.readcard_track13_error)),
    /**
     * 二,三磁错误
     */
    READ_CARD_TRACK2_3(-30012, getString(R.string.readcard_track23_error)),
    /**
     * 此卡为芯片卡,不可降级交易
     */
    READ_CARD_FALLBACK(-30013, getString(R.string.readcard_downgrade_transaction)),
    /**
     * 建立候选列表超时
     */
    READ_CARD_BUILD_APP_TIMEOUT(-30014, getString(R.string.readcard_candidate_list_timeout)),
    /**
     * 卡片数据交互失败
     */
    READ_CARD_EXCHANGE(-30015, getString(R.string.readcard_interactive_fail)),
    /**
     * 卡片数据交互参数错误
     */
    READ_CARD_EXCHANGE_PARAMETER(-30016, getString(R.string.readcard_error_params_apdu)),

    /*=======================安全模块错误码=======================*/
    /**
     * 验证APK签名失败
     */
    ERROR_VERIFY_APK_SIGN(-40001, getString(R.string.security_verify_apk_sign_fail)),
    /**
     * 密钥长度错误
     */
    ERROR_LENGTH(-40002, getString(R.string.security_key_length_error)),
    /**
     * checkValue不通过
     */
    ERROR_CHECK_VALUE(-40003, getString(R.string.security_check_value_error)),
    /**
     * 保存失败
     */
    ERROR_SAVE_FAIL(-40004, getString(R.string.security_save_fail)),
    /**
     * mac计算失败
     */
    ERROR_MAC(-40005, getString(R.string.security_mac_error)),
    /**
     * 加密失败
     */
    ERROR_ENCRYPT(-40006, getString(R.string.security_encrypt_fail)),
    /**
     * 回传数组长度错误
     */
    ERROR_BAD_ARRAY_LENGTH(-40007, getString(R.string.security_bad_array_length)),
    /**
     * 不支持的MAC算法类型
     */
    ERROR_MAC_TYPE(-40008, getString(R.string.security_mac_type_unsuppor)),
    /**
     * checkValue长度错误
     */
    ERROR_CHECKVALUE_LENGTH(-40009, getString(R.string.security_checkvalue_length_error)),
    /**
     * 密钥索引位置错误
     */
    ERROR_KEY_INDEX(-40010, getString(R.string.security_key_index_error)),
    /**
     * 密钥解密失败
     */
    ERROR_DECRYPT(-40011, getString(R.string.security_decrypt_fail)),
    /**
     * 密钥长度错误
     */
    ERROR_KEY_LENGTH(-40012, getString(R.string.security_key_len_error)),
    /**
     * 随机密钥生成失败
     */
    GEN_RANDOM_KEY_FAIL(-40013, getString(R.string.security_gen_random_key_fail)),
    /**
     * 指定加密索引密钥不存在
     */
    ERROR_INDEX_NO_KEY(-40014, getString(R.string.security_index_no_key)),
    /**
     * 公钥保存失败
     */
    ERROR_SAVE_PK_FAIL(-40015, getString(R.string.security_save_pk_fail)),
    /**
     * 验签失败
     */
    VERIFY_ERROR(-40016, getString(R.string.security_verify_fail)),
    /**
     * 获取报警信息码失败
     */
    GET_SMSTATUS_ERROR(-40017, getString(R.string.security_get_smstatus_fail)),
    /**
     * 密钥分区已用完
     */
    ERROR_KEY_PARTITION_EXHAUSTED(-40018, getString(R.string.security_key_partition_exhausted)),

    /** 注入BDK错误 */
    ERROR_INJECT_BDK(-40019, getString(R.string.security_inject_bdk_error)),

    /** transformation不支持 */
    ERROR_UNSUPPORTED_TRANSFORMATION(-40020, getString(R.string.security_unsupported_transformation)),

    /** 密钥未保存 */
    ERROR_KEY_NOT_SAVED(-40021, getString(R.string.security_key_not_saved)),

    /*=========================EMV模块错误码=========================*/
    /**
     * 交易预处理失败
     */
    EMV_PREPARE_FAIL(-50002, getString(R.string.emv_prepare_fail)),
    /**
     * 交易处理失败
     */
    EMV_TRANS_PROCESS_FAIL(-50003, getString(R.string.emv_trans_process_fail)),
    /**
     * 内核处理异常
     */
    EMV_KERNEL_EXCEPTION(-50004, getString(R.string.emv_kernel_exception)),
    /**
     * PAN数据错误
     */
    EMV_PAN_ERROR(-50005, getString(R.string.emv_pan_error)),
    /**
     * PINPAD回调为空
     */
    EMV_PINPAD_CALLBACK_ERROR(-50006, getString(R.string.emv_pinpad_callback_error)),
    /**
     * 交易处理数据为空
     */
    EMV_KERNEL_MSG_NULL(-50007, getString(R.string.emv_kernel_msg_null)),
    /**
     * 键盘初始化异常,传递的键盘坐标参数为Null
     */
    EMV_KEYBOARD_PARAMS_ERROR(-50008, getString(R.string.emv_keyboard_params_error)),
    /**
     * EMV流程未结束，无法进行下次操作
     */
    EMV_IN_PROCESS(-50009, getString(R.string.emv_in_process)),
    /**
     * 交易处理失败，不支持交易类型
     */
    EMV_TRANS_TYPE_UNSUPPORT(-50010, getString(R.string.emv_trans_type_unsupport)),
    /**
     * 确认卡号信息失败，或者超时
     */
    EMV_CONFIRM_CARD_INFO_ERROR(-50011, getString(R.string.emv_confirm_card_info_error)),
    /**
     * 非接卡CVM处理出错
     */
    EMV_NFC_CVM_ERROR(-50012, getString(R.string.emv_nfc_cvm_error)),
    /**
     * 数据库操作出错
     */
    EMV_DB_OPT_ERROR(-50013, getString(R.string.emv_db_opt_error)),
    /**
     * 数据库中没有匹配的CAPK
     */
    EMV_DB_NO_MATCHED_CAPK(-50014, getString(R.string.emv_db_no_matched_capk)),
    /**
     * 数据库保存终端参数出错
     */
    EMV_DB_SAVE_TERM_ERROR(-50015, getString(R.string.emv_db_save_term_error)),
    /**
     * 数据库没有匹配的AID
     */
    EMV_DB_NO_MATCHED_AID(-50016, getString(R.string.emv_db_no_matched_aid)),
    /**
     * 检卡出错，CardInfo为null
     */
    EMV_CARDINFO_ERROR(-50017, getString(R.string.emv_cardinfo_error)),
    /**
     * 函数调用顺序错误
     */
    EMV_TIMING_ERROR(-50018, getString(R.string.emv_timing_error)),
    /**
     * transdata非法
     */
    EMV_TRANSDATA_INVALID(-50019, getString(R.string.emv_transdata_invalid)),
    /**
     * PIN取消
     */
    EMV_PIN_CANCELED(-50020, getString(R.string.emv_pin_canceled)),
    /**
     * PIN出错
     */
    EMV_PIN_ERROR(-50021, getString(R.string.emv_pin_error)),
    /**
     * 应用选择索引错误
     */
    EMV_APP_SELECT_INDEX_ERROR(-50022, getString(R.string.emv_app_select_index_error)),
    /**
     * 身份认证出错
     */
    EMV_CERT_VERIFY_ERROR(-50023, getString(R.string.emv_cert_verify_error)),
    /**
     * 联机处理出错
     */
    EMV_ONLINE_PROCESS_ERROR(-50024, getString(R.string.emv_online_process_error)),
    /**
     * 最终选择超时
     */
    EMV_FINAL_SELECT_TIMEOUT(-50025, getString(R.string.emv_final_select_timeout)),
    /**
     * 最终选择出错
     */
    EMV_FINAL_SELECT_ERROR(-50026, getString(R.string.emv_final_select_error)),
    /**
     * 签名出错
     */
    EMV_SIGNATURE_ERROR(-50027, getString(R.string.emv_signature_error)),
    /**
     * 未知的CVM类型
     */
    EMV_UNKNOWN_CVM_TYPE(-50028, getString(R.string.emv_unknown_cvm_type)),
    /**
     * 数据交换出错
     */
    EMV_DATA_EXCHANGE_ERROR(-50029, getString(R.string.emv_data_exchange_error)),
    /**
     * 数据交换超时
     */
    EMV_DATA_EXCHANGE_TIMEOUT(-50030, getString(R.string.emv_data_exchange_timeout)),
    /**
     * 终端风险管理超时
     */
    EMV_TERMINAL_RISK_MANAGEMENT_TIMEOUT(-50031, getString(R.string.emv_terminal_risk_management_timeout)),
    /**
     * 终端风险管理出错
     */
    EMV_TERMINAL_RISK_MANAGEMENT_ERROR(-50032, getString(R.string.emv_terminal_risk_management_error)),
    /**
     * 第一次GAC前回调超时
     */
    EMV_PRE_FIRST_GAC_TIMEOUT(-50033, getString(R.string.emv_pre_first_gac_timeout)),
    /**
     * 第一次GAC前回调出错
     */
    EMV_PRE_FIRST_GAC_ERROR(-50034, getString(R.string.emv_pre_first_gac_error)),

    /*=======================PINPAD模块错误码======================*/
    /**
     * 输入PIN超时
     */
    ERROR_INPUT_TIMEOUT(-60001, getString(R.string.pinpad_pin_input_timeout)),
    /**
     * 启动密码键盘失败
     */
    ERROR_START_PINPAD(-60002, getString(R.string.pinpad_start_up_pinpad_fail)),
    /**
     * pinPadType 类型错误(当传入的键盘类型不为1和2时候返回该错误)
     */
    ERROR_PINPAD_TYPE(-60003, getString(R.string.pinpad_pinpad_type_error)),
    /**
     * 输入PIN，返回PinBlock失败
     */
    ERROR_RETURN_PINBLOCK(-60004, getString(R.string.pinpad_return_pinblock_error)),
    /**
     * PIN状态查询线程被异常中断
     */
    ERROR_INTERRUPTED(-60005, getString(R.string.pinpad_thread_interrupted)),

    /*=========================权限模块错误码==============================*/
    /**
     * 缺少MSR权限
     */
    ERROR_PERMISSION_READ_MSR(-70001, getString(R.string.permission_read_msr)),
    /**
     * 缺少ICC权限
     */
    ERROR_PERMISSION_READ_ICC(-70002, getString(R.string.permission_read_icc)),
    /**
     * 缺少CONTACTLESS_CARD权限
     */
    ERROR_PERMISSION_READ_CONTACTLESS(-70003, getString(R.string.permission_read_contactless)),
    /**
     * 缺少PINPAD权限
     */
    ERROR_PERMISSION_PINPAD(-70004, getString(R.string.permission_pinpad)),
    /**
     * 缺少SECURITY权限
     */
    ERROR_PERMISSION_SECURITY(-70005, getString(R.string.permission_security)),
    /**
     * 缺少LED权限
     */
    ERROR_PERMISSION_LED(-70006, getString(R.string.permission_led)),
    /**
     * 未被授权调用SPHS
     */
    ERROR_UNAUTHORIZED_ACCESS_SPHS(-70007, getString(R.string.permission_access_sphs)),

    /*=========================打印块错误码==============================*/
    /**
     * 输PIN进行中
     */
    ERROR_PRINTER_PINPAD_ONGOING(-80001, getString(R.string.printer_pinpad_ongoing)),

    /*=========================ETC块错误码==============================*/
    /**
     * 未搜索到ETC设备
     */
    ERROR_ETC_NO_DEVICE_SEARCHED(-90001, getString(R.string.etc_no_device_searched));

    private int code;
    private String msg;

    AidlErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static AidlErrorCode valueOf(int errCode) {
        SPErrorCode errorCode = SPErrorCode.valueOf(errCode);
        if (!errorCode.equals(SPErrorCode.UNKNOWN)) {
            SPBASE_ERROR.setCode(errorCode.getCode());
            SPBASE_ERROR.setMsg(getString(errorCode.getResId()));
            return SPBASE_ERROR;
        }
        for (AidlErrorCode code : values()) {
            if (code.code == errCode) {
                return code;
            }
        }
        return UNKNOWN;
    }

    private static String getString(int id) {
        Application app = getApplication();
        return app == null ? "unknown error" : app.getString(id);
    }

    private static Application getApplication() {
        try {
            // 得到当前的ActivityThread对象
            Class<?> atCls = Class.forName("android.app.ActivityThread");
            Method method = atCls.getDeclaredMethod("currentActivityThread");
            method.setAccessible(true);
            Object atObject = method.invoke(null);
            //获取Application对象
            Method method2 = atCls.getDeclaredMethod("getApplication");
            method2.setAccessible(true);
            return (Application) method2.invoke(atObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
