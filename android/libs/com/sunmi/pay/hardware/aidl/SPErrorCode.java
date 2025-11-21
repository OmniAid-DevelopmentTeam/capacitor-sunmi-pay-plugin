package com.sunmi.pay.hardware.aidl;

import com.sunmi.paylib.R;

/**
 * SP错误码
 */
public enum SPErrorCode {
    /*=====================================================以下为SPBase误码===============================================*/
    /*=====================================================SP状态错误码定义===============================================*/
    /** 成功 **/
    SUCCESS(0, R.string.sp_success),
    /** 串口关闭 */
    CLOSED(-10100, R.string.sp_closed),
    /** 超时 */
    TIME_OUT(-10101, R.string.sp_timeout),
    /** LRC校验错误 */
    LRC_ERROR(-10102, R.string.sp_lrc_error),
    /** 失步 */
    SEQ_UNMATCH(-10103, R.string.sp_seq_unmatch),
    /** SP初始化中 */
    INITIALIZING(-10104, R.string.sp_initializing),
    /** SP重启中 */
    REBOOTING(-10105, R.string.sp_rebooting),
    /** SP重连中 */
    RECONNECTING(-10106, R.string.sp_reconnecting),
    /** SP忙碌中 */
    BUSY(-10107, R.string.sp_busy),
    /** SP已休眠 */
    SLEEP(-10108, R.string.sp_sleep),

    /*=====================================================文件下载错误码定义===============================================*/
    /** 读取OS文件包错误 */
    DL_COPY_FILE_FAILED(-10200, R.string.sp_dl_copy_file_failed),
    /** SP正在升级中 */
    DL_UPGRADING(-10201, R.string.sp_dl_upgrading),
    /** 连接SP失败 */
    DL_CONN_FAILED(-10202, R.string.sp_dl_conn_failed),
    /** 打开升级文件失败 */
    DL_OPEN_FILE_FAILED(-10203, R.string.sp_dl_open_file_failed),
    /** 数据包超时 */
    DL_DATA_PKG_TIMEOUT(-10204, R.string.sp_dl_data_pkg_timeout),
    /** 数据包处理出错 */
    DL_DATA_PKG_PROCESS_ERROR(-10205, R.string.sp_dl_data_pkg_process_error),
    /** 升级字符串过长 */
    DL_STRING_OVERLONG(-10206, R.string.sp_dl_string_overlong),
    /** 升级失败 */
    DL_FAILED(-10207, R.string.sp_dl_failed),
    /** 未获取到本机的sdk版本号 */
    DL_GET_WRONG_SDK_VERSION(-10208, R.string.sp_dl_get_wrong_sdk_version),
    /** 版本号与目标升级版本一致 */
    DL_GET_SAME_SDK_VERSION(-10209, R.string.sp_dl_get_same_sdk_version),
    /** 查询默认信息失败 */
    DL_QUERY_DEFAULT_INFO_FAILED(-10210, R.string.sp_dl_query_default_info_failed),
    /** 固件版本不允许降级 */
    DL_VERSION_NOT_DOWNGRADE(-10211, R.string.sp_dl_version_not_downgrade),
    /** 升级被取消 */
    DL_UPGRADE_CANCELED(-10212, R.string.sp_dl_upgrade_canceled),

    /*=====================================================业务接口错误码定义================================================*/
    /** 输入参数错误 */
    BI_INPUT_PARAM_ERROR(-10300, R.string.sp_bi_input_param_error),
    /** 应答包数据区长度非法 */
    BI_ILLEGAL_DATA_LENGTH(-10301, R.string.sp_bi_illegal_data_length),
    /** 应答包数据解析出错 */
    BI_RSP_DATA_PARSE_ERROR(-10302, R.string.sp_bi_rsp_data_parse_error),

    /*=====================================================SP内核错误码定义(严重错误)========================================*/
    /** 内核已重启 */
    KL_KERNEL_REBOOTED(-10400, R.string.sp_kl_kernel_rebooted),

    /*=====================================================以下为内核错误码==================================================*/
    /*=====================================================内部接口错误码====================================================*/
    /** BASE错误开始位置 */
    BASE_ERROR(-11000, R.string.sp_base_error),

    /** Operation not permitted */
    BASE_ERROR_EPERM(-11001, R.string.sp_base_error_eperm),

    /** No such file or directory */
    BASE_ERROR_ENOENT(-11002, R.string.sp_base_error_enoent),

    /** No such process */
    BASE_ERROR_ESRCH(-11003, R.string.sp_base_error_esrch),

    /** Interrupted system call */
    BASE_ERROR_EINTR(-11004, R.string.sp_base_error_eintr),

    /** I/O error */
    BASE_ERROR_EIO(-11005, R.string.sp_base_error_eio),

    /** No such device or address */
    BASE_ERROR_ENXIO(-11006, R.string.sp_base_error_enxio),

    /** Argument list too long */
    BASE_ERROR_E2BIG(-11007, R.string.sp_base_error_e2big),

    /** Exec format error */
    BASE_ERROR_ENOEXEC(-11008, R.string.sp_base_error_enoexec),

    /** Bad file number */
    BASE_ERROR_EBADF(-11009, R.string.sp_base_error_ebadf),

    /** No child processes */
    BASE_ERROR_ECHILD(-11010, R.string.sp_base_error_echild),

    /** Try again */
    BASE_ERROR_EAGAIN(-11011, R.string.sp_base_error_eagain),

    /** Out of memory */
    BASE_ERROR_ENOMEM(-11012, R.string.sp_base_error_enomem),

    /** Permission denied */
    BASE_ERROR_EACCES(-11013, R.string.sp_base_error_eacces),

    /** Bad address */
    BASE_ERROR_EFAULT(-11014, R.string.sp_base_error_efault),

    /** Block device required */
    BASE_ERROR_ENOTBLK(-11015, R.string.sp_base_error_enotblk),

    /** Device or resource busy */
    BASE_ERROR_EBUSY(-11016, R.string.sp_base_error_ebusy),

    /** File exists */
    BASE_ERROR_EEXIST(-11017, R.string.sp_base_error_eexist),

    /** Cross-device link */
    BASE_ERROR_EXDEV(-11018, R.string.sp_base_error_exdev),

    /** No such device */
    BASE_ERROR_ENODEV(-11019, R.string.sp_base_error_enodev),

    /** Not a directory */
    BASE_ERROR_ENOTDIR(-11020, R.string.sp_base_error_enotdir),

    /** Is a directory */
    BASE_ERROR_EISDIR(-11021, R.string.sp_base_error_eisdir),

    /** Invalid argument */
    BASE_ERROR_EINVAL(-11022, R.string.sp_base_error_einval),

    /** File table overflow */
    BASE_ERROR_ENFILE(-11023, R.string.sp_base_error_enfile),

    /** Too many open files */
    BASE_ERROR_EMFILE(-11024, R.string.sp_base_error_emfile),

    /** Not a typewriter */
    BASE_ERROR_ENOTTY(-11025, R.string.sp_base_error_enotty),

    /** Text file busy */
    BASE_ERROR_ETXTBSY(-11026, R.string.sp_base_error_etxtbsy),

    /** File too large */
    BASE_ERROR_EFBIG(-11027, R.string.sp_base_error_efbig),

    /** No space left on device */
    BASE_ERROR_ENOSPC(-11028, R.string.sp_base_error_enospc),

    /** Read-only file system */
    BASE_ERROR_ESPIPE(-11029, R.string.sp_base_error_espipe),

    /** Illegal seek */
    BASE_ERROR_EROFS(-11030, R.string.sp_base_error_erofs),

    /** Too many links */
    BASE_ERROR_EMLINK(-11031, R.string.sp_base_error_emlink),

    /** Broken pipe */
    BASE_ERROR_EPIPE(-11032, R.string.sp_base_error_epipe),

    /** Math argument out of domain of func */
    BASE_ERROR_EDOM(-11033, R.string.sp_base_error_edom),

    /** Math result not representable */
    BASE_ERROR_ERANGE(-11034, R.string.sp_base_error_erange),

    /** 通信状态未连接 */
    BASE_ERROR_ENOTCONN(-11107, R.string.sp_base_error_enotconn),

    /** ACK响应包参数错误 */
    BASE_EACK_PARAM(-11301, R.string.sp_base_eack_param),

    /** SP待发送ACK数据超过通信buf错误 */
    BASE_EACK_OVERFLOW(-11302, R.string.sp_base_eack_overflow),

    /** 命令包数据长度溢出错误 */
    BASE_ECMD_OVERFLOW(-11401, R.string.sp_base_ecmd_overflow),

    /** 命令包校验异常，无info区 */
    BASE_ECMD_CHECK(-11402, R.string.sp_base_ecmd_check),

    /** SP接收缓冲区无存储空间，无info区 */
    BASE_ECMD_NOSPACE(-11403, R.string.sp_base_ecmd_nospace),

    /** SP接收数据超时，无info区 */
    BASE_ECMD_TIMEOUT(-11404, R.string.sp_base_ecmd_timeout),

    /** 命令包序号错误 */
    BASE_ECMD_SEQ(-11406, R.string.sp_base_ecmd_seq),

    /** 命令包参数错误 */
    BASE_ECMD_PARAM(-11600, R.string.sp_base_ecmd_param),

    /** 未知命令包、不支持的命令包 */
    BASE_ECMD_UNSUPPORT(-11601, R.string.sp_base_ecmd_unsupport),

    /** 固件更新失败 */
    BASE_ERROR_UPGRADE(-11700, R.string.sp_base_error_upgrade),

    /** 固件超过设计大小 */
    BASE_UPGRADE_SIZE(-11701, R.string.sp_base_upgrade_size),

    /** 固件签名校验错误 */
    BASE_UPGRADE_VERIFY(-11702, R.string.sp_base_upgrade_verify),

    /** 固件boot命名错误 */
    BASE_UPGRADE_NAME(-11703, R.string.sp_base_upgrade_name),

    /** 固件更新命令错误 */
    BASE_UPGRADE_CMD(-11704, R.string.sp_base_upgrade_cmd),

    /** 固件更新FLASH操作错误 */
    BASE_UPGRADE_FLASH(-11705, R.string.sp_base_upgrade_flash),

    /** 设备型号获取错误 */
    BASE_ERR_DEVICECODE(-11706, R.string.sp_base_err_devicecode),

    /** SE芯片型号错误 */
    BASE_ERROR_SETYPE(-11707, R.string.sp_base_error_setype),

    /*=====================================================litso错误码定义==============================================*/
    /** LITESO空间不够 */
    BASE_LITESO_ENOTSPACE(-16000, R.string.sp_base_liteso_enotspace),

    /** LITESO长度错误 */
    BASE_LITESO_ELITESOLEN(-16001, R.string.sp_base_liteso_elitesolen),

    /** 安装LITESO个数超过系统最大值 */
    BASE_LITESO_ECOUNT(-16002, R.string.sp_base_liteso_ecount),

    /** LITESO签名错误 */
    BASE_LITESO_EVERIFY(-16003, R.string.sp_base_liteso_everify),

    /** LITESO指纹错误 */
    BASE_LITESO_EFINGER(-16004, R.string.sp_base_liteso_efinger),

    /** LITESO写flash错误 */
    BASE_LITESO_EFLASH(-16005, R.string.sp_base_liteso_eflash),

    /** LITESO info错误 */
    BASE_LITESO_EINFO(-16006, R.string.sp_base_liteso_einfo),

    /** LITESO无文件访问权限 */
    BASE_LITESO_EACCESS(-16007, R.string.sp_base_liteso_eaccess),

    /** LITESO不存在 */
    BASE_LITESO_ENODEV(-16008, R.string.sp_base_liteso_enodev),

    /*=====================================================通信数据格式错误码定义==============================================*/
    /** 参数个数或长度错误 */
    PARAM_COUNT_LENGTH_ERR(-100, R.string.sp_param_count_length_err),

    /** 不支持的命令 */
    DC_UNSUPPORTED_CMD(-101, R.string.sp_dc_unsupported_cmd),

    /*=====================================================系统模块错误码定义==================================================*/
    /** 参数错误 */
    SYS_ERR_PARAM(-1000, R.string.sp_sys_err_param),

    /** 功能不支持 */
    SYS_ERR_NOSUPPORT(-1001, R.string.sp_sys_err_nosupport),

    /** 初始化失败 */
    SYS_ERR_INITFAIL(-1002, R.string.sp_sys_err_initfail),

    /** 系统时间年错误 */
    SYS_ERR_ILLEGALYEAR(-1003, R.string.sp_sys_err_illegalyear),

    /** 系统时间月错误 */
    SYS_ERR_ILLEGALMONTH(-1004, R.string.sp_sys_err_illegalmonth),

    /** 系统时间日错误 */
    SYS_ERR_ILLEGALDAY(-1005, R.string.sp_sys_err_illegalday),

    /** 系统时间时错误 */
    SYS_ERR_ILLEGALHOUR(-1006, R.string.sp_sys_err_illegalhour),

    /** 系统时间分错误 */
    SYS_ERR_ILLEGALMIN(-1007, R.string.sp_sys_err_illegalmin),

    /** 系统时间秒错误 */
    SYS_ERR_ILLEGALSEC(-1008, R.string.sp_sys_err_illegalsec),

    /** 硬件失败 */
    SYS_ERR_HARD(-1009, R.string.sp_sys_err_hard),

    /** Buf长度错误 */
    SYS_ERR_BUFLEN(-1010, R.string.sp_sys_err_buflen),

    /*=====================================================卡片模块错误码定义==================================================*/
    /** 卡片参数错误 */
    CARD_ERR_PARAM(-2000, R.string.sp_card_err_param),

    /** 无卡 */
    CARD_ERR_NOCARD(-2001, R.string.sp_card_err_nocard),

    /** 多卡 */
    CLS_ERR_MULT(-2002, R.string.sp_cls_err_mult),

    /** Mifare卡片拒绝命令 */
    PHILIPS_MIFARE_ERR_NACK(-2032, R.string.sp_philips_mifare_err_nack),

    /** Mifare卡片应答数据字节数不是期望的数量 */
    PHILIPS_MIFARE_ERR_COMM(-2033, R.string.sp_philips_mifare_err_comm),

    /** Mifare卡片未认证密码 */
    PHILIPS_MIFARE_ERR_AUTHEN(-2034, R.string.sp_philips_mifare_err_authen),

    /** Mifare认证失败 */
    PHILIPS_MIFARE_ERR_AUTHE_FAIL(-2035, R.string.sp_philips_mifare_err_authe_fail),

    /** Mifare卡片响应数据错误 */
    PHILIPS_MIFARE_ERR_RESPONSE(-2036, R.string.sp_philips_mifare_err_response),

    /** Mifare参数非法 */
    PHILIPS_MIFARE_ERR_INVAILD_PARAM(-2037, R.string.sp_philips_mifare_err_invaild_param),

    /** Mifare Plus CMAC计算错误 */
    PHILIPS_MIFARE_ERR_CMAC_CALC_FAIL(-2038, R.string.sp_philips_mifare_err_cmac_calc_fail),

    /** Mifare Plus CMAC错误 */
    PHILIPS_MIFARE_ERR_CMAC_ERR(-2039, R.string.sp_philips_mifare_err_cmac_err),

    /** Mifare Plus AES解密失败 */
    PHILIPS_MIFARE_ERR_AES_DECTYPT_FAIL(-2040, R.string.sp_philips_mifare_err_aes_decrypt_fail),

    /** Mifare Plus AES加密失败 */
    PHILIPS_MIFARE_ERR_AES_ENCRYPT_FAIL(-2041, R.string.sp_philips_mifare_err_aes_encrypt_fail),

    /** HCE参数错误 */
    HCE_ERR_PARAM(-2401, R.string.sp_hce_err_param),

    /** HCE模块初始化失败 */
    HCE_HAL_ERR_MODULE(-2402, R.string.sp_hce_hal_err_module),

    /** HCE模块未打开 */
    HCE_ERR_NOT_OPEN(-2403, R.string.sp_hce_err_not_open),

    /** HCE功能尚未支持 */
    HCE_ERR_NOT_SUPPORT(-2404, R.string.sp_hce_err_not_support),

    /** HCE t4t操作失败 */
    HCE_T4T_FAILURE(-2405, R.string.sp_hce_t4t_failure),

    /** HCE NDEF数据无变化 */
    HCE_ERR_NOCHANGE(-2406, R.string.sp_hce_err_nochange),

    /** HCE状态错误 */
    HCE_ERR_STATUS(-2407, R.string.sp_hce_err_status),

    /** HCE t2t操作失败 */
    HCE_T2T_FAILURE(-2408, R.string.sp_hce_t2t_failure),

    /** 磁卡数据解码中 */
    CARD_ERR_DECODE(-2100, R.string.sp_card_err_decode),

    /** 模块检测失败 */
    CLS_HAL_ERR_MODULE(-2500, R.string.sp_cls_hal_err_module),

    /** 驱动核心数据结构错误 */
    CLS_HAL_ERR_CORE(-2501, R.string.sp_cls_hal_err_core),

    /** 模块未上电 */
    CLS_HAL_ERR_POWERDWN(-2502, R.string.sp_cls_hal_err_powerdwn),

    /** 载波未打开 */
    CLS_HAL_ERR_CARRIEROFF(-2503, R.string.sp_cls_hal_err_carrieroff),

    /** 通信超时 */
    CLS_HAL_ERR_TIMEOUT(-2520, R.string.sp_cls_hal_err_timeout),

    /** 内部FIFO操作失败 */
    CLS_HAL_ERR_FIFO(-2521, R.string.sp_cls_hal_err_fifo),

    /** 通信帧错误 */
    CLS_HAL_ERR_FRAME(-2522, R.string.sp_cls_hal_err_frame),

    /** 通信字符校验错 */
    CLS_HAL_ERR_PARITY(-2523, R.string.sp_cls_hal_err_parity),

    /** 通信冲突 */
    CLS_HAL_ERR_COLL(-2524, R.string.sp_cls_hal_err_coll),

    /** 通信中信号不符合协议 */
    CLS_HAL_ERR_PROT(-2525, R.string.sp_cls_hal_err_prot),

    /** 通信中CRC校验错 */
    CLS_HAL_ERR_CRC(-2526, R.string.sp_cls_hal_err_crc),

    /** 卡(Mifare)密码认证错 */
    CLS_HAL_ERR_M1AUTH(-2527, R.string.sp_cls_hal_err_m1auth),

    /** 卡(Mifare)认证参数不正确 */
    CLS_HAL_ERR_M1PARAM(-2528, R.string.sp_cls_hal_err_m1param),

    /** 卡片存在 */
    CLS_HAL_ERR_CARDEXIST(-2529, R.string.sp_cls_hal_err_cardexist),

    /** 卡片拒绝命令 */
    CLS_HAL_ERR_REFUSE(-2530, R.string.sp_cls_hal_err_refuse),

    /** A卡通信应答的数据数量与期望的不符 */
    CLS_TYPEA_ERR_NUMBER(-2540, R.string.sp_cls_typea_err_number),

    /** A卡通信应答WUPA/REQA命令的第一个字符非法 */
    CLS_TYPEA_ERR_ATQA(-2541, R.string.sp_cls_typea_err_atqa),

    /** A卡通信应答的卡号校验和错 */
    CLS_TYPEA_ERR_BCC(-2542, R.string.sp_cls_typea_err_bcc),

    /** A卡通信应答的卡号的第一个字符错 */
    CLS_TYPEA_ERR_UIDTAG(-2543, R.string.sp_cls_typea_err_uidtag),

    /** A卡通信应答的ATS的TL字节非法 */
    CLS_TYPEA_ERR_TL(-2544, R.string.sp_cls_typea_err_tl),

    /** A卡通信应答的ATS的T0字节非法 */
    CLS_TYPEA_ERR_T0(-2545, R.string.sp_cls_typea_err_t0),

    /** A卡通信应答的ATS的TA1字节非法 */
    CLS_TYPEA_ERR_TA1(-2546, R.string.sp_cls_typea_err_ta1),

    /** A卡通信应答的ATS的TB1字节非法 */
    CLS_TYPEA_ERR_TB1(-2547, R.string.sp_cls_typea_err_tb1),

    /** A卡通信应答的ATS的TC1字节非法 */
    CLS_TYPEA_ERR_TC1(-2548, R.string.sp_cls_typea_err_tc1),

    /** A卡不支持ISO14443-4，激活流程终止 */
    CLS_TYPEA_ERR_ISO14443_4(-2549, R.string.sp_cls_typea_err_iso14443_4),

    /** B卡通信应答的数据数量与期望的不符 */
    CLS_TYPEB_ERR_NUMBER(-2550, R.string.sp_cls_typeb_err_number),

    /** B卡通信应答WUPB/REQB命令的第一个字符非0x50 */
    CLS_TYPEB_ERR_ATQB0(-2551, R.string.sp_cls_typeb_err_atqb0),

    /** ATQB中协议类型字节的第四位不为'0' */
    CLS_TYPEB_ERR_PTYPE(-2552, R.string.sp_cls_typeb_err_ptype),

    /** B卡通信应答ATTRIB命令中信道编码的与设置的不同 */
    CLS_TYPEB_ERR_CID(-2553, R.string.sp_cls_typeb_err_cid),

    /** B卡通信应答HLTB命令应答非0x00错误 */
    CLS_TYPEB_ERR_HLTB(-2554, R.string.sp_cls_typeb_err_hltb),

    /** 接收正确的情况下重传次数到限 */
    CLS_ERR_PROTOCOL(-2560, R.string.sp_cls_err_protocol),

    /** 块类型编码错 */
    CLS_ERR_BLOCK_TYPE(-2561, R.string.sp_cls_err_block_type),

    /** I块PCB错或后续数据长度错 */
    CLS_ERR_IBLOCK_PROTOCOL(-2562, R.string.sp_cls_err_iblock_protocol),

    /** PICC使用I块响应链接块 */
    CLS_ERR_IBLOCK_ATCHAIN(-2563, R.string.sp_cls_err_iblock_atchain),

    /** 接收的I块序列号不正确 */
    CLS_ERR_IBLOCK_SN(-2564, R.string.sp_cls_err_iblock_sn),

    /** R块PCB错或后续数据长度错 */
    CLS_ERR_RBLOCK_PROTOCOL(-2565, R.string.sp_cls_err_rblock_protocol),

    /** PICC响应NAK块 */
    CLS_ERR_RBLOCK_NAK(-2566, R.string.sp_cls_err_rblock_nak),

    /** 接收的R块序列号不正确 */
    CLS_ERR_RBLOCK_SN(-2567, R.string.sp_cls_err_rblock_sn),

    /** S块PCB错或后续数据长度错 */
    CLS_ERR_SBLOCK_PROTOCOL(-2568, R.string.sp_cls_err_sblock_protocol),

    /** PICC发送的S块非S-WTX请求 */
    CLS_ERR_SBLOCK_NOWTX(-2569, R.string.sp_cls_err_sblock_nowtx),

    /** 请求的WTX参数错误(=0) */
    CLS_ERR_SBLOCK_WTX(-2570, R.string.sp_cls_err_sblock_wtx),

    /** 卡片回送数据超过FSD */
    CLS_ERR_EXCEED_FSD(-2571, R.string.sp_cls_err_exceed_fsd),

    /** 读二代证GUID错误 */
    CLS_ERR_IDCARD_GUID(-2580, R.string.sp_cls_err_idcard_guid),

    /** 按键取消 */
    CLS_ERR_USER_CANCEL(-2581, R.string.sp_cls_err_user_cancel),

    /** 刷卡或插卡取消 */
    CLS_ERR_MSR_IC_INTERRUPTED(-2582, R.string.sp_cls_err_msr_ic_interrupted),

    /** 校验错误 */
    SMC_HAL_ERR_PARITY(-2800, R.string.sp_smc_hal_err_parity),

    /** 通信超时 */
    SMC_HAL_ERR_TIMEOUT(-2801, R.string.sp_smc_hal_err_timeout),

    /** 模块没有上电 */
    SMC_HAL_ERR_STEP(-2802, R.string.sp_smc_hal_err_step),

    /** ATR错误 */
    SCI_ERR_ATR_DATA(-2803, R.string.sp_sci_err_atr_data),

    /** 通信错误 */
    SCI_ERR_COMMU(-2804, R.string.sp_sci_err_commu),

    /** PPS错误 */
    SCI_ERR_PPS(-2805, R.string.sp_sci_err_pps),

    /** T0参数错误 */
    SCI_ERR_T0_PARAM(-2806, R.string.sp_sci_err_t0_param),

    /** T0响应过程字节错误 */
    SCI_ERR_T0_PROB(-2807, R.string.sp_sci_err_t0_prob),

    /** T1参数错误 */
    SCI_ERR_T1_PARAM(-2808, R.string.sp_sci_err_t1_param),

    /** T1校验错误 */
    SCI_ERR_T1_LRC(-2809, R.string.sp_sci_err_t1_lrc),

    /** T1块序列号错误 */
    SCI_ERR_T1_BLOCK(-2810, R.string.sp_sci_err_t1_block),

    /** 无卡 */
    SMC_SYNC_NO_CARD(-2901, R.string.sp_smc_sync_no_card),

    /** 通道错误 */
    SMC_SYNC_ERROR_CHANNEL(-2902, R.string.sp_smc_sync_error_channel),

    /** 未上电 */
    SMC_SYNC_DEVICE_NOT_OPEN(-2903, R.string.sp_smc_sync_device_not_open),

    /** 复位失败 */
    SMC_SYNC_INVALID_RESET(-2904, R.string.sp_smc_sync_invalid_reset),

    /** 地址加上长度后溢出卡片存储大小 */
    SMC_SYNC_ADDRESS_OVERFLOW(-2905, R.string.sp_smc_sync_address_overflow),

    /** 错误内存指针 */
    SMC_SYNC_INVALID_POINTER(-2906, R.string.sp_smc_sync_invalid_pointer),

    /** 没有上电 */
    SMC_SYNC_NO_POWER(-2907, R.string.sp_smc_sync_no_power),

    /** 错误数据 */
    SMC_SYNC_INVALID_VALUE(-2908, R.string.sp_smc_sync_invalid_value),

    /** 验证密码失败 */
    SMC_SYNC_VERIFY_PSC_ERROR(-2909, R.string.sp_smc_sync_verify_psc_error),

    /** 操作失败 */
    SMC_SYNC_INVALID_OPERATION(-2910, R.string.sp_smc_sync_invalid_operation),

    /** 卡片响应失败 */
    SMC_SYNC_NACK(-2911, R.string.sp_smc_sync_nack),

    /*=====================================================安全模块错误码定义==================================================*/
    /** 成功 */
    SEC_RET_OK(0, R.string.sp_sec_ret_ok),

    /** 参数错误 */
    SEC_RET_PARAM_ERROR(-3000, R.string.sp_sec_ret_param_error),

    /** 根秘钥错误 */
    SEC_ROOTKEY_ERROR(-3001, R.string.sp_sec_rootkey_error),

    /** 安全系统被锁定 */
    SEC_ERR_LOCKED(-3002, R.string.sp_sec_err_locked),

    /** 安全文件读写错误 */
    SEC_ERR_DATA(-3003, R.string.sp_sec_err_data),

    /** 密钥索引错误 */
    SEC_ERR_KEYINDEX(-3004, R.string.sp_sec_err_keyindex),

    /** 密钥校验错误 */
    SEC_ERR_KEYFAIL(-3005, R.string.sp_sec_err_keyfail),

    /** 没有PIN输入 */
    SEC_ERR_NOPIN(-3006, R.string.sp_sec_err_nopin),

    /** PIN输入取消 */
    SEC_ERR_INPUT_CANCEL(-3007, R.string.sp_sec_err_input_cancel),

    /** PIN输入超时 */
    SEC_ERR_PIN_TIMEOUT(-3008, R.string.sp_sec_err_pin_timeout),

    /** PIN输入间隔时间太短 */
    SEC_ERR_SMALL_INTERVAL(-3009, R.string.sp_sec_err_small_interval),

    /** KCV模式错误 */
    SEC_ERR_KCV_MODE(-3010, R.string.sp_sec_err_kcv_mode),

    /** KCV校验错误 */
    SEC_ERR_KCV_FAIL(-3011, R.string.sp_sec_err_kcv_fail),

    /** KCV ODD校验错误 */
    SEC_ERR_KCV_ODD(-3012, R.string.sp_sec_err_kcv_odd),

    /** 无匹配密钥 */
    SEC_ERR_NO_MATCH(-3013, R.string.sp_sec_err_no_match),

    /** 密钥类型错误 */
    SEC_ERR_KEYTPYE(-3014, R.string.sp_sec_err_keytpye),

    /** 密钥长度错误 */
    SEC_ERR_KEYLEN(-3015, R.string.sp_sec_err_keylen),

    /** 密钥指数长度错误 */
    SEC_ERR_EXPLEN(-3016, R.string.sp_sec_err_explen),

    /** 目的密钥索引错误 */
    SEC_ERR_DSTKEY_INDEX(-3017, R.string.sp_sec_err_dstkey_index),

    /** 源密钥索引错误 */
    SEC_ERR_SRCKEY_INDEX(-3018, R.string.sp_sec_err_srckey_index),

    /** 源密钥类型错误 */
    SEC_ERR_SRCKEY_TYPE(-3019, R.string.sp_sec_err_srckey_type),

    /** 组索引错误 */
    SEC_ERR_GROUP_INDEX(-3020, R.string.sp_sec_err_group_index),

    /** 空指针 */
    SEC_ERR_NULL_PTR(-3021, R.string.sp_sec_err_null_ptr),

    /** 无KCV */
    SEC_ERR_NOKCV(-3022, R.string.sp_sec_err_nokcv),

    /** DUKPT溢出 */
    SEC_ERR_DUKPT_OVERFLOW(-3023, R.string.sp_sec_err_dukpt_overflow),

    /** DUKPT密钥类型错误 */
    SEC_ERR_DUKPT_KEYTYPE(-3024, R.string.sp_sec_err_dukpt_keytype),

    /** DUKPT KSN需要加1 */
    SEC_ERR_NEED_ADD_KSN(-3025, R.string.sp_sec_err_need_add_ksn),

    /** 试图在 key 的 "usage" 之外, 使用该key */
    SEC_ERR_KEY_USAGE(-3026, R.string.sp_sec_err_key_usage),

    /** 对 key 的使用方式错误. 比如用被限定只能用来加密的key来解密数据 */
    SEC_ERR_MODE_OF_KEY_USE(-3027, R.string.sp_sec_err_mode_of_key_use),

    /** 功能尚不支持 */
    SEC_ERR_NOT_SUPPORT(-3028, R.string.sp_sec_err_not_support),

    /** 功能密钥属性不匹配 */
    SEC_ERR_KEYATTR_NOT_MATCH(-3029, R.string.sp_sec_err_keyattr_not_match),

    /** 未认证 */
    SEC_ERR_NO_AUTH(-3030, R.string.sp_sec_err_no_auth),

    /** TR31类型密钥下发加密密钥错误 */
    SEC_ERR_CMAC_ENCKEY(-3031, R.string.sp_sec_err_cmac_enckey),

    /** TR31类型密钥下发MAC密钥错误 */
    SEC_ERR_CMAC_MACKEY(-3032, R.string.sp_sec_err_cmac_mackey),

    /** CMAC算法错误 */
    SEC_ERR_CMAC(-3033, R.string.sp_sec_err_cmac),

    /** 数据长度错误 */
    SEC_ERR_DATALEN(-3034, R.string.sp_sec_err_datalen),

    /** 算法块错误 */
    SEC_ERR_ALGBLOCK(-3035, R.string.sp_sec_err_algblock),

    /** Des算法异常 */
    SEC_ERR_ALG_DES(-3036, R.string.sp_sec_err_alg_des),

    /** Aes算法异常 */
    SEC_ERR_ALG_AES(-3037, R.string.sp_sec_err_alg_aes),

    /** Sm4算法异常 */
    SEC_ERR_ALG_SM4(-3038, R.string.sp_sec_err_alg_sm4),

    /** Sm2算法异常 */
    SEC_ERR_ALG_SM2(-3039, R.string.sp_sec_err_alg_sm2),

    /** Sm3算法异常 */
    SEC_ERR_ALG_SM3(-3040, R.string.sp_sec_err_alg_sm3),

    /** Rsa算法异常 */
    SEC_ERR_ALG_RSA(-3041, R.string.sp_sec_err_alg_rsa),

    /** hash算法异常 */
    SEC_ERR_ALG_HASH(-3042, R.string.sp_sec_err_alg_hash),

    /** pos公私钥异常，触发丢失，kms公钥异常等 */
    SEC_ERR_POS_PKSK(-3046, R.string.sp_sec_err_pos_pksk),

    /** 刷卡超时时间 */
    SEC_ERR_PAN_TIMEOUT(-3047, R.string.sp_sec_err_pan_timeout),

    /** 次数超出 */
    SEC_ERR_OVERNUM(-3048, R.string.sp_sec_err_overnum),

    /** 密码错误 */
    SEC_ERR_PWD(-3049, R.string.sp_sec_err_pwd),

    /** 密钥未初始化 */
    SEC_ERR_KEY_INVALID(-3050, R.string.sp_sec_err_key_invalid),

    /** 未设置新密码 */
    SEC_ERR_NEWPWD(-3051, R.string.sp_sec_err_newpwd),

    /** 要求敏感服务 */
    SEC_ERR_REQ_SSA(-3052, R.string.sp_sec_err_req_ssa),

    /** PIN/PAN 防穷举保护 */
    SEC_ERR_WAIT_INTERVAL(-3061, R.string.sp_sec_err_wait_interval),

    /** 存在相同的密钥 */
    SEC_ERR_KEY_SAME(-3062, R.string.sp_sec_err_key_same),

    /** TLV参数错误 */
    SEC_ERR_TLV(-3063, R.string.sp_sec_err_tlv),

    /** ECC算法错误 */
    SEC_ERR_ALG_ECC(-3064, R.string.sp_sec_err_alg_ecc),

    /** RNDKEY错误 */
    SEC_RNDKEY_ERROR(-3065, R.string.sp_sec_rndkey_error),

    /** 扩展密钥文件读错误 */
    SEC_ERR_APKEY_READ(-3081, R.string.sp_sec_err_apkey_read),

    /** 扩展密钥文件写错误 */
    SEC_ERR_APKEY_WRITE(-3082, R.string.sp_sec_err_apkey_write),

    /** 扩展密钥读错误 */
    SEC_ERR_APKEY_VERIFY(-3083, R.string.sp_sec_err_apkey_verify),

    /** 扩展密钥文件丢失 */
    SEC_ERR_APKEY_LOST(-3084, R.string.sp_sec_err_apkey_lost),

    /** 扩展密钥文件打开失败 */
    SEC_ERR_APKEY_OPEN(-3085, R.string.sp_sec_err_apkey_open),

    /** 扩展密钥自检失败 */
    SEC_ERR_APKEY_STATUS(-3086, R.string.sp_sec_err_apkey_status),

    /** 不支持的扩展密钥写操作模式 */
    SEC_ERR_APKEY_WRITE_MODE(-3087, R.string.sp_sec_err_apkey_write_mode),

    /** 密钥未写入 */
    SEC_ERR_APKEY_INVALID(-3088, R.string.sp_sec_err_apkey_invalid),

    /** 密钥访问超时（其他应用正在访问） */
    SEC_ERR_APKEY_TIMOUT(-3089, R.string.sp_sec_err_apkey_timout),

    /** 删除扩展密钥文件错误 */
    SEC_ERR_APKEY_DELETE(-3090, R.string.sp_sec_err_apkey_delete),

    /** 扩展密钥其它错误 */
    SEC_ERR_APKEY_OTHER(-3091, R.string.sp_sec_err_apkey_other),

    /** base64解码或编码输入数据存在无效字符 */
    SEC_ERR_BASE64_INVAID(-3111, R.string.sp_sec_err_base64_invaid),

    /** 缓冲区太小 */
    SEC_ERR_BUFFER_SIZE(-3112, R.string.sp_sec_err_buffer_size),

    /** TOKEN解析错误 */
    SEC_ERR_TR34_TOKEN_PARSE_FAILD(-3113, R.string.sp_sec_err_tr34_token_parse_faild),

    /** TOKEN校验错误 */
    SEC_ERR_TR34_VERIFY_FAILD(-3114, R.string.sp_sec_err_tr34_verify_faild),

    /** CA证书不存在或者解析错误 */
    SEC_ERR_CA_ERR(-3115, R.string.sp_sec_err_ca_err),

    /** 未绑定后台 */
    SEC_ERR_TR34_UNBIND(-3116, R.string.sp_sec_err_tr34_unbind),

    /** 未生成随机数 */
    SEC_ERR_TR34_RANDOM_MISS(-3117, R.string.sp_sec_err_tr34_random_miss),

    /** 后台已绑定，无法重新绑定 */
    SEC_ERR_TR34_BOUND(-3118, R.string.sp_sec_err_tr34_bound),

    /** 设备私钥运算错误 */
    SEC_ERR_POS_PVK_RECOVER(-3150, R.string.sp_sec_err_pos_pvk_recover),

    /** HASH不匹配 */
    SEC_ERR_HASH_NO_MATCH(-3151, R.string.sp_sec_err_hash_no_match),

    /** 随机数不匹配 */
    SEC_ERR_RAND_NO_MATCH(-3152, R.string.sp_sec_err_rand_no_match),

    /** 授权请求类型不匹配 */
    SEC_ERR_AUTH_REQTYPE(-3153, R.string.sp_sec_err_auth_reqtype),

    /*=====================================================MIR L2模块错误码定义================================================*/
    /** 数据交换处理 */
    MIR_DATA_EXCHANGE(10, R.string.sp_mir_data_exchange_deal),

    /*=====================================================EMV L2模块错误码定义================================================*/
    /** 选择下一个应用（超过最大限额） */
    EMV_SELECT_NEXT_APP_MAX_LIMIT_EXCEED(8, R.string.sp_emv_select_next_app),

    /** 请重新输入PIN(最后一次) */
    EMV_CVM_REENTER_PIN_LAST(7, R.string.sp_emv_cvm_reenter_pin_last),

    /** 请重新输入PIN */
    EMV_CVM_REENTER_PIN(6, R.string.sp_emv_cvm_reenter_pin),

    /** 请继续执行CVM处理 */
    EMV_CVM_STEP_NEXT(5, R.string.sp_emv_cvm_step_next),

    /** 请重新拍卡 */
    EMV_TRY_AGAIN(4, R.string.sp_emv_try_again),

    /** 请选择下一个应用 */
    EMV_SELECT_NEXT_APP(3, R.string.sp_emv_select_next_app),

    /** 执行联机操作 */
    EMV_ONLINE_REQUEST(2, R.string.sp_emv_online_request),

    /** 交易批准 */
    EMV_APPROVE(1, R.string.sp_emv_approve),

    /** 执行正确，继续下一个步骤 */
    EMV_OK_CONTINUE(0, R.string.sp_emv_ok_continue),

    /** 交易拒绝 */
    EMV_DECLINED(-4000, R.string.sp_emv_declined),

    /** 请使用其它界面 */
    EMV_TRY_ANOTHER_INTERFACE(-4001, R.string.sp_emv_try_another_interface),

    /** 交易终止 */
    EMV_ENDAPPLICATION(-4002, R.string.sp_emv_endapplication),

    /** 查看手机 */
    EMV_SEE_PHONE(-4003, R.string.sp_emv_see_phone),

    /** 最终选择数据错误 */
    EMV_FINALSELECT_DATA_ERR(-4006, R.string.sp_emv_final_select_data_error),

    /** Paywave 提速版本需要进行DRL操作 */
    WAVE_GOTO_DRL_FUNCTION(-4010, R.string.sp_emv_wave_goto_DRL),

    /** Paywave 脚本处理需要再拍卡 */
    WAVE_GOTO_SECOND_TAP(-4011, R.string.sp_emv_wave_goto_second_tap),

    /** 交易终止（命令发送接收错误） */
    ENDAPPLICATION_CMD_ERR(-4100, R.string.sp_endapplication_cmd_err),

    /** 交易终止（命令接收超时） */
    ENDAPPLICATION_CMD_TIMEOUT(-4101, R.string.sp_endapplication_cmd_timeout),

    /** 交易终止（命令接收超时） */
    ENDAPPLICATION_CMD_SWAB_6985(-4102, R.string.sp_endapplication_cmd_swab_6985),

    /** 交易终止（状态码错误） */
    ENDAPPLICATION_CMD_RSP_ERR(-4103, R.string.sp_endapplication_cmd_rsp_err),

    /** 交易终止（卡片被锁） */
    ENDAPPLICATION_CARD_BLOCK(-4104, R.string.sp_endapplication_card_block),

    /** 交易终止（应用被锁） */
    ENDAPPLICATION_APP_BLOCK(-4105, R.string.sp_endapplication_app_block),

    /** 交易终止（终端无应用） */
    ENDAPPLICATION_TMAPP_EMPTY(-4106, R.string.sp_endapplication_tmapp_empty),

    /** 交易终止（终端和卡片无共同支持的应用） */
    ENDAPPLICATION_NO_SCAPP(-4107, R.string.sp_endapplication_no_scapp),

    /** 交易终止（卡片返回数据错误） */
    ENDAPPLICATION_DATA_ERR(-4108, R.string.sp_endapplication_data_err),

    /** 交易终止（卡片返回数据元重复） */
    ENDAPPLICATION_DATA_DUPLICATE(-4109, R.string.sp_endapplication_data_duplicate),

    /** 交易终止（交易不被接收） */
    ENDAPPLICATION_NOT_ACCEPT(-4110, R.string.sp_endapplication_not_accept),

    /** 交易终止（卡片过期） */
    ENDAPPLICATION_CARD_EXPIRED(-4111, R.string.sp_endapplication_card_expired),

    /** 预处理参数列表为空 */
    EMV_NO_PREPARAM(-4112, R.string.sp_emv_no_preparam),

    /** 交易终止（L1读卡超时） */
    ENDAPPLICATION_L1_TIMEOUT_ERR(-4113, R.string.sp_endapplication_l1_timeout_err),

    /** 交易终止（L1传输错误） */
    ENDAPPLICATION_L1_TRANSMISSION_ERR(-4114, R.string.sp_endapplication_l1_transmission_err),

    /** 交易终止（L1协议错误） */
    ENDAPPLICATION_L1_PROTOCAL_ERR(-4115, R.string.sp_endapplication_l1_protocal_err),

    /** 交易终止（L2必备数据错误） */
    ENDAPPLICATION_L2_CARD_DATA_MISSING(-4116, R.string.sp_endapplication_l2_card_data_missing),

    /** 交易终止（L2卡片认证失败（脱机数据认证失败）） */
    ENDAPPLICATION_L2_CAM_FAIL(-4117, R.string.sp_endapplication_l2_cam_fail),

    /** 交易终止（L2状态字错误） */
    ENDAPPLICATION_L2_STATUS_BYTE(-4118, R.string.sp_endapplication_l2_status_byte),

    /** 交易终止（L2数据解析失败） */
    ENDAPPLICATION_L2_PARSING_ERR(-4119, R.string.sp_endapplication_l2_parsing_err),

    /** 交易终止（L2交易金额超过非接交易限额） */
    ENDAPPLICATION_L2_MAX_LIMIT_EXCEED(-4120, R.string.sp_endapplication_l2_max_limit_exceed),

    /** 交易终止（L2卡片数据错误） */
    ENDAPPLICATION_L2_CARD_DATA_ERR(-4121, R.string.sp_endapplication_l2_card_data_err),

    /** 交易终止（L2不支持磁条卡模式） */
    ENDAPPLICATION_L2_MAG_NOT_SUPPORT(-4122, R.string.sp_endapplication_l2_mag_not_support),

    /** 交易终止（L2卡片无PPSE） */
    ENDAPPLICATION_L2_NO_PPSE(-4123, R.string.sp_endapplication_l2_no_ppse),

    /** 交易终止（L2 PPSE处理错误） */
    ENDAPPLICATION_L2_PPSE_FAULT(-4124, R.string.sp_endapplication_l2_ppse_fault),

    /** 交易终止（L2候选列表为空） */
    ENDAPPLICATION_L2_EMPTY_CAND_LIST(-4125, R.string.sp_endapplication_l2_empty_cand_list),

    /** 交易终止（L2 IDS读错误） */
    ENDAPPLICATION_L2_IDS_READ_ERR(-4126, R.string.sp_endapplication_l2_ids_read_err),

    /** 交易终止（L2 IDS写错误） */
    ENDAPPLICATION_L2_IDS_WRITE_ERR(-4127, R.string.sp_endapplication_l2_ids_write_err),

    /** 交易终止（L2 IDS数据错误） */
    ENDAPPLICATION_L2_IDS_DATA_ERRR(-4128, R.string.sp_endapplication_l2_ids_data_errr),

    /** 交易终止（L2 IDS无匹配AC） */
    ENDAPPLICATION_L2_IDS_NO_MATCH_AC(-4129, R.string.sp_endapplication_l2_ids_no_match_ac),

    /** 交易终止（L2终端数据错误） */
    ENDAPPLICATION_L2_TERMINAL_DATA_ERR(-4130, R.string.sp_endapplication_l2_terminal_data_err),

    /** 交易终止（L3超时） */
    ENDAPPLICATION_L3_TIMEOUT(-4131, R.string.sp_endapplication_l3_timeout),

    /** 交易终止（L3取消） */
    ENDAPPLICATION_L3_STOP(-4132, R.string.sp_endapplication_l3_stop),

    /** 交易终止（L3交易金额不存在） */
    ENDAPPLICATION_L3_AMOUNT_NOT_PRESENT(-4133, R.string.sp_endapplication_l3_amount_not_present),

    /** 交易终止（重新出示卡片） */
    ENDAPPLICATION_REPRESENT_CARD(-4134, R.string.sp_endapplication_represent_card),

    /** 交易终止（使用其他卡片（有Data Record）） */
    ENDAPPLICATION_OTHER_CARD_WITHRECORD(-4135, R.string.sp_endapplication_other_card_withrecord),

    /** 交易终止（使用其他卡片） */
    ENDAPPLICATION_OTHER_CARD(-4136, R.string.sp_endapplication_other_card),

    /** 交易终止（GPO响应错误） */
    ENDAPPLICATION_CMD_RSP_ERR_GPO(-4137, R.string.sp_endapplication_cmd_rsp_err_gpo),

    /** 交易终止（最终选择卡片数据错误） */
    ENDAPPLICATION_L2_CARD_DATA_FINALSEL(-4138, R.string.sp_endapplication_l2_card_data_finalsel),

    /** 交易终止（L3无DET数据） */
    ENDAPPLICATION_L3_NO_DET_DATA(-4139, R.string.sp_endapplication_l3_no_det_data),

    /** 内核类型不支持 */
    ENDAPPLICATION_KERNEL_NOT_SUPPORT(-4140, R.string.sp_endapplication_kernel_not_support),

    /** 非接限额超过 */
    ENDAPPLICATION_CLSS_LIMIT_EXCEED(-4141, R.string.sp_endapplication_clss_limit_exceed),

    /** 金额为0 */
    ENDAPPLICATION_ZERO_AMOUNT(-4142, R.string.sp_endapplication_zero_amount),

    /** 请使用其它界面（预处理失败） */
    TRY_ANOTHER_INTERFACE_PREPROC(-4144, R.string.sp_try_another_interface_preproc),

    /** 非接提速流程不支持该内核 */
    ENDAPPLICATION_SPEEDUP_KERNEL_NOT_SUPPORT(-4145, R.string.sp_endapplication_speedup_kernel_not_support),

    /** 请重新放卡（闪卡） */
    ENDAPPLICATION_REPRESENT_CARD_TORN(-4146, R.string.sp_endapplication_represent_card_torn),

    /** 读数据存储 */
    ENDAPPLICATION_DATA_STORAGE_READ(-4147, R.string.sp_endapplication_data_storage_read),

    /** 无效参数 */
    EMV_INVALID_PARAM(-4500, R.string.sp_emv_invalid_param),

    /** 下载公钥时校验码错误 */
    EMV_SUM_ERR(-4501, R.string.sp_emv_sum_err),

    /** 终端参数数据不存在 */
    EMV_PARAM_NOT_EXIST(-4502, R.string.sp_emv_param_not_exist),

    /** 终端参数数据错误 */
    EMV_PARAM_DATA_ERROR(-4503, R.string.sp_emv_param_data_error),

    /** 交易日志不存在 */
    PBOC_NO_LOG(-4504, R.string.sp_pboc_no_log),

    /** 交易日志数据错误 */
    PBOC_LOG_DATA_ERR(-4505, R.string.sp_pboc_log_data_err),

    /** EMV数据不存在 */
    EMV_NO_DATA(-4506, R.string.sp_emv_no_data),

    /** PBOC LOG格式不存在 */
    PBOC_NO_LOG_FMT(-4507, R.string.sp_pboc_no_log_fmt),

    /** MIR二次拍卡命令 */
    MIR_TWO_PRESENTATIONS(-4852, R.string.sp_mir_two_present_card),

    /** MIR发送COMPLETE命令使用空数据 */
    MIR_COMPLETE_TRANS_WITH_EMPTY(-4854, R.string.sp_mir_complete_trans_with_empty),

    /** MIR发送COMPLETE命令使用ODOL数据 */
    MIR_COMPLETE_TRANS_WITH_ODOL(-4855, R.string.sp_mir_complete_trans_with_odol),

    /** MIR重选组合应用后发送COMPLETE命令 */
    MIR_COMPLETE_TRANS_RESELECT_APP(-4856, R.string.sp_mir_complete_trans_reselect_app),

    /** MIR重选组合应用后发送READRECORD命令 */
    MIR_READCORD_TRANS_RESELECT_APP(-4857, R.string.sp_mir_read_record_trans_reselect_app),

    /*=====================================================算法模块错误码定义===================================================*/
    /** 算法参数错误 */
    ALG_RET_PARAM_ERROR(-5000, R.string.alg_ret_param_error),

    /** 国密芯片接收失败 */
    ALG_RET_SEND_SM_ERROR(-5001, R.string.alg_ret_send_sm_error),

    /** 国密芯片应答失败 */
    ALG_RET_RCV_SM_ERROR(-5002, R.string.alg_ret_rcv_sm_error),

    /** 不支持国密（无国密芯片） */
    ALG_ERR_NOGM(-5012, R.string.alg_err_nogm),

    /*=====================================================打印机模块错误码定义==================================================*/
    /** 错误 */
    PRINTER_ERROR(-7001, R.string.sp_printer_error),

    /** 电池电压低 */
    PRINTER_LOW_VOLTAGE(-7002, R.string.sp_printer_low_voltage),

    /** 缺纸 */
    PRINTER_PAPERLESS(-7003, R.string.sp_printer_no_paper),

    /** 过温 */
    PRINTER_OVER_TEMPERATURE(-7004, R.string.sp_printer_over_temperature),

    /** 数据错误 */
    PRINTER_DATA_ERROR(-7005, R.string.sp_printer_data_error),

    /** 参数无效 */
    PRINTER_INVALID_PARAMETER(-7006, R.string.sp_printer_invalid_parameter),

    /** 设备未打开或设备操作出错 */
    PRINTER_NOT_OPEN(-7007, R.string.sp_printer_device_no_open),

    /** 打印缓冲溢出 */
    PRINTER_BUFFER_OVERFLOW(-7008, R.string.sp_printer_buffer_overflow),

    /** 配置不支持打印机 */
    PRINTER_not_support(-7009, R.string.sp_printer_not_supported),

    /** 打印机不支持此功能 */
    PRINTER_function_not_support(-7010, R.string.sp_printer_function_not_supported),

    /** 打印机仓门打开 */
    PRINTER_no_platen(-7011, R.string.sp_printer_no_platen),

    /*=====================================================税控模块错误码定义==================================================*/
    /** 写税控数据失败 */
    TAX_ERR_WRITE(-8001, R.string.sp_tax_err_write),

    /** 读税控数据失败 */
    TAX_ERR_READ(-8002, R.string.sp_tax_err_read),

    /*=====================================================ETC模块错误码定义==================================================*/
    /** I2C发送数据失败 */
    I2C_SEND_DATA_FAILED(-8300, R.string.i2c_send_data_failed),

    /** I2C接收数据超时 */
    I2C_RECV_DATA_TIMEOUT(-8600, R.string.i2c_recv_data_timeout),

    /*=====================================================未知错误码定义==================================================*/
    /** 未知错误 */
    UNKNOWN(Integer.MIN_VALUE, R.string.sp_unknown);

    private final int code;
    private final int resId;

    SPErrorCode(int code, int resId) {
        this.code = code;
        this.resId = resId;
    }

    public int getCode() {
        return code;
    }

    public int getResId() {
        return resId;
    }

    public static SPErrorCode valueOf(int errCode) {
        for (SPErrorCode code : values()) {
            if (code.code == errCode) {
                return code;
            }
        }
        return UNKNOWN;
    }

}
