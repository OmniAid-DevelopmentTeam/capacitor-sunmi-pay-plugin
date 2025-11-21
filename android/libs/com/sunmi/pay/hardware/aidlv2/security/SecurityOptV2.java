/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.sunmi.pay.hardware.aidlv2.security;
// Declare any non-default types here with import statements

public interface SecurityOptV2 extends android.os.IInterface
{
  /** Default implementation for SecurityOptV2. */
  public static class Default implements com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
  {
    /**
           * 存储基础密钥
           * @param destinationIndex 需要保存的密钥索引，[1,200]
           * @param keyData 密钥数据密文 256位
           * @return 0：成功，其他：错误码
           */
    @Override public int saveBaseKey(int destinationIndex, byte[] keyData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存明文密钥
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
          * @param keyIndex 密钥保存的位置索引
          * @return 0：成功，非0：错误码
          */
    @Override public int savePlaintextKey(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存密文密钥
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param encryptIndex 对密钥进行加密的密钥索引
          * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
          * @param keyIndex 密钥保存的位置索引
          * @return 0：成功，非0：错误码
          */
    @Override public int saveCiphertextKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 实现数据MAC计算或校验
          * @param keyIndex :MAC索引
          * @param macAlgType ：MAC加密算法
          * @param dataIn  用于进行MAC计算的源数据
          * @param dataOut 计算生成的MAC值
          * @return 0：成功，<0：错误码
          */
    @Override public int calcMac(int keyIndex, int macAlgType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 加密数据
          * @param keyIndex 加密密钥索引
          * @param dataIn  用于进行加密计算的源数据
          * @param encryptionMode 加密模式
          * @param iv 初始向量 DES 算法8字节
          * @param dataOut 计算生成的密文
          * @return 0：成功，非0：错误码
          */
    @Override public int dataEncrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 解密数据
          * @param keyIndex 如果是保留区密钥，制定保留区的密钥索引
          * @param dataIn 输入数据，待解密的数据
          * @param encryptionMode 加密模式
          * @param iv 初始向量
          * @param dataOut 输出数据,解密后的数据
          * @return 0：成功，其他：错误码
          */
    @Override public int dataDecrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存明文DUKPT密钥
          * @param   keyType  BDK-基础分散密钥
          *                   IPEK-初始PIN加密密钥
          * @param   keyValue 密钥数据
          * @param   checkValue 密钥校验值
          * @param   ksn
          * @param   encryptType  密钥算法
          * @param   keyIndex 保存的索引 (范围为0-9)
          * @param   bool isEncrypt 是否密文
          * @return  0：成功，<0：错误码
          */
    @Override public int saveKeyDukpt(int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥计算mac
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   macType  mac算法
          * @param   dataIn   待计算的mac数据
          * @param   dataOut  mac 结果
          * @return  0：成功，<0：错误码
          */
    @Override public int calcMacDukpt(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥加密数据
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   dataIn   待加密数据
          * @param   dataOut  加密结果
          * @return  0：成功，<0：错误码
          */
    @Override public int dataEncryptDukpt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥解密数据
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   dataIn   待解密数据
          * @param   dataOut  加密结果
          * @return  0：成功，<0：错误码
          */
    @Override public int dataDecryptDukpt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * Dukpt KSN 自增1
          * @param   keyIndex 密钥索引(范围为0-9)
          * @return  0：成功，<0：错误码
          */
    @Override public int dukptIncreaseKSN(int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * Dukpt获取当前KSN
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   outKSN 10字节 KSN
          * @return  0：成功，<0：错误码
          */
    @Override public int dukptCurrentKSN(int keyIndex, byte[] outKSN) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取已保存密钥 checkValue
          * @param   keyIndex 密钥索引(范围为0-9)
          * @param   dataOut 4字节 checkValue
          * @return  0：成功，<0：错误码
          */
    @Override public int getKeyCheckValue(int keySystem, int keyIndex, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取密文硬件序列号
          * 获取已保存密钥 checkValue
          * @param   dataIn 加密随机因子（银行卡为卡号后六位，扫码类为码的后六位）
          * @param   dataOut 固定传4个字节
          * @return  0：成功，<0：错误码
          */
    @Override public int getTUSNEncryptData(java.lang.String dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存SM4密钥
          * @param dataIn 密钥数据
          * @return 0：成功，其他：错误码
          */
    @Override public int storeSM4Key(byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 使用保存的SM4密钥加密
          * @param dataIn  用于进行加密计算的源数据
          * @param dataOut 计算生成的密文
          * @return 0：成功，其他：错误码
          */
    @Override public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取安全状态
          * @return 0：成功，其他：错误码
          */
    @Override public int getSecStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 验证apk签名
          * @param hashMessage  哈希值
          * @param signData 私钥加密的哈希值
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int verifyApkSign(byte[] hashMessage, byte[] signData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 读取授权状态
          * @param type  授权类型
          * @return 0：成功，其他：错误码
          */
    @Override public java.lang.String getAuthStatus(int type) throws android.os.RemoteException
    {
      return null;
    }
    /**
          * 获取终端状态 “Factory”,“Release”
          * @return null：出错，“Factory”：工厂模式，“Release”：Release模式
          */
    @Override public java.lang.String getTermStatus() throws android.os.RemoteException
    {
      return null;
    }
    /**
          * 将终端状态设置为 “Release”
          * @return 0：成功，其他：错误码
          */
    @Override public int setTermStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 请求授权
          * @param reqType  授权类型
          * @param authCode 授权码
          * @param SN       字符串，设备SN
          * @param authData 输出授权数据，256字节
          * @return 0：成功，其他：错误码
          */
    @Override public int sysRequestAuth(byte reqType, int authCode, java.lang.String SN, byte[] authData) throws android.os.RemoteException
    {
      return 0;
    }
    /*
          * 确认授权
          * @param dataIn 授权数据，512字节
          * @return 0：成功，其他：错误码
          */
    @Override public int sysConfirmAuth(byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 存储终端认证密钥
          * @param dataInPuk 终端认证公钥及签名 512位
          * @param dataInPvk 终端认证私钥 251位
          * @return 0：成功，其他：错误码
          */
    @Override public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取终端认证公钥及签名
          * @param dataOut 输出数据，512字节
          * @return 0：成功，其他：错误码
          */
    @Override public int readTerminalPuk(byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取终端认证数据
          * @param dataIn 输入数据，256字节
          * @param dataOut 输出数据，256字节
          * @return 0：成功，其他：错误码
          */
    @Override public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成RSA公私钥
          * @param pubKeyIndex 公钥保存的位置索引
          * @param pvtkeyIndex 私钥保存的位置索引
          * @param keysize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
          * @param pubExponent 指数(Hex格式)
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int generateRSAKeys(int pubKeyIndex, int pvtKeyIndex, int keysize, java.lang.String pubExponent) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取RSA公钥
          * @param pubKeyIndex 公钥保存的位置索引
          * @param outData 公钥数据(X509编码格式)
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          * @deprecated
          */
    @Override public int getRSAPublicKey(int pubKeyIndex, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取RSA私钥
          * @param pubKeyIndex 私钥保存的位置索引
          * @param outData 私钥数据(PKCS8编码格式)
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          * @deprecated
          */
    @Override public int getRSAPrivateKey(int pvtKeyIndex, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 用RSA算法加密数据
          * @param transformation 模式
          * @param keyIndex RSA公钥/私钥索引
          * @param dataIn 待加密的数据
          * @param dataOut 加密后的数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          * @deprecated
          */
    @Override public int dataEncryptRSA(java.lang.String transformation, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 用RSA算法解密数据
          * @param transformation 模式
          * @param keyIndex RSA私钥/公钥索引
          * @param dataIn 待解密的数据
          * @param dataOut 解密后的数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          * @deprecated
          */
    @Override public int dataDecryptRSA(java.lang.String transformation, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 移除RSA密钥
          * @param keyIndex RSA私钥/公钥索引
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int removeRSAKey(int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存证书
          * @param certIndex 证书保存的索引
          * @param certData 证书数据
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int storeCertificate(int certIndex, byte[] certData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取保存的证书
          * @param certIndex 证书保存的索引
          * @param dataOut 出参buffer，存放证书数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          * @deprecated
          */
    @Override public int getCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * Dukpt获取初始化KSN
          * @param outKSN 10字节 KSN
          * @return >=0：outKSN中有效数据的长度，<0：错误码
          */
    @Override public int dukptGetInitKSN(byte[] outKSN) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * RSA算法签名数据
          * @param signAlg 签名算法
          * @param pvtKeyIndex RSA私钥索引
          * @param dataIn 待签名的数据
          * @param dataOut buffer，存放签名后的数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          * @deprecated
          */
    @Override public int signingRSA(java.lang.String signAlg, int pvtKeyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * RSA算法验签
          * @param signAlg 签名算法
          * @param pubKey RSA公钥(X509编码格式)
          * @param srcData 签名前的数据(原始数据)
          * @param signature 签名数据
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int verifySignatureRSA(java.lang.String signAlg, byte[] pubKey, byte[] srcData, byte[] signature) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入明文密钥
          * @param targetPkgName 目标APP的包名
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
          * @param keyIndex 密钥保存的位置索引
          * @return 0：成功，非0：错误码
          */
    @Override public int injectPlaintextKey(java.lang.String targetPkgName, int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入密文密钥
          * @param targetPkgName 目标APP的包名
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param encryptIndex 对密钥进行加密的密钥索引
          * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
          * @param keyIndex 密钥保存的位置索引
          * @return 0：成功，非0：错误码
          */
    @Override public int injectCiphertextKey(java.lang.String targetPkgName, int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥加密
          * @param keySelect 密钥选择
          * @param keyIndex 密钥索引(范围为0-9)
          * @param dataIn   待加密数据
          * @param encryptionMode 工作模式
          * @param iv 初始化向量
          * @param dataOut  加密结果
          * @return 0：成功，<0：错误码
          */
    @Override public int dataEncryptDukptEx(int keySelect, int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥解密
          * @param keySelect 密钥选择
          * @param keyIndex 密钥索引(范围为0-9)
          * @param dataIn   待加密数据
          * @param encryptionMode 工作模式
          * @param iv 初始化向量
          * @param dataOut 加密结果
          * @return 0：成功，<0：错误码
          */
    @Override public int dataDecryptDukptEx(int keySelect, int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥计算mac
          * @param keySelect 密钥选择
          * @param keyIndex 密钥索引(范围为0-9)
          * @param macType  mac算法
          * @param dataIn   待计算的mac数据
          * @param dataOut  mac 结果
          * @return 0：成功，<0：错误码
          */
    @Override public int calcMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * DUKPT密钥校验MAC
          * @param keySelect 密钥选择
          * @param keyIndex 密钥索引(范围为0-9)
          * @param macType  mac算法
          * @param dataIn   待计算的mac数据
          * @param dataOut  mac 结果
          * @return 0：成功，<0：错误码
          */
    @Override public int verifyMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] macData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存TR31密钥
          * @param keyValue  TR31密钥数据
          * @param kbpkIndex KBPK索引
          * @param keyIndex 密钥索引(范围为0-9)
          * @return 0：成功，<0：错误码
          */
    @Override public int saveTR31Key(byte[] keyValue, int kbpkIndex, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存密文密钥（解密密钥为RSA私钥）
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
          * @param keyIndex 密钥保存的位置索引
          * @param encryptIndexRSA RSA私钥索引
          * @param transformation
          * @return 0：成功，非0：错误码
          * @deprecated
          */
    @Override public int saveCiphertextKeyRSA(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex, int encryptIndexRSA, java.lang.String transformation) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存RSA密钥
          * @param keyType  密钥类型,0-公钥,1-私钥
          * @param keyValue 密钥数据,keyType为0(公钥),则为ANS.1 X509标准编码格式,keyType为1(私钥),则为ANS.1 PKCS#8标准编码格式
          * @param keyIndex 密钥保存的位置索引
          * @return 0：成功，其他：错误码
          * @deprecated
          */
    @Override public int saveRSAKey(int keyType, byte[] keyValue, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 删除密钥
          * @param   keySystem 密钥体系
          * @param   keyIndex 密钥索引
          * @return  0：成功，<0：错误码
          */
    @Override public int deleteKey(int keySystem, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存DUKPT-AES密钥
          * @param dukptKeyType AES密钥加密类型(AES128/192/256)
          * @param keyType BDK-基础分散密钥
          *                IPEK-初始PIN加密密钥
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param ksn
          * @param encryptType  密钥算法
          * @param keyIndex 保存的索引(范围为10~19)
          * @return 0：成功，<0：错误码
          */
    @Override public int saveKeyDukptAES(int dukptKeyType, int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 计算MAC（扩展）
          * @param keyIndex MAC密钥索引
          * @param keyLen 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
          * @param macAlgType MAC加密算法
          * @param diversify 分散因子（值为null，暂不支持）
          * @param dataIn  用于进行MAC计算的源数据
          * @param dataOut 计算生成的MAC值
           * @return 0：成功，<0：错误码
          */
    @Override public int calcMacEx(int keyIndex, int keyLen, int macAlgType, byte[] diversify, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成SM2公私钥对
          * @param pvkIndex 私钥索引，范围0~9
          * @param pubKey 公钥数据，包含key：
          * data：密钥数据（类型：byte[]，长度：64字节）
          * kcv：密钥check value（类型：byte[]，长度：5字节）
          * rfu: RFU数据（类型：byte[]，长度：10字节）
          * @return 0：成功，其他：错误码
          */
    @Override public int generateSM2Keypair(int pvkIndex, android.os.Bundle pubKey) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入SM2密钥
          * @param keyIndex 密钥索引，范围0~9
          * @param keyData 密钥数据，包含key：
          * data：密钥数据（类型：byte[]，长度：公钥64字节，私钥32字节）
          * kcv：密钥check value（类型：byte[]，长度：5字节）
          * rfu: RFU数据（类型：byte[]，长度：10字节）
          * @return 0：成功，其他：错误码
          */
    @Override public int injectSM2Key(int keyIndex, android.os.Bundle keyData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2签名
          * @param pukIndex 公钥索引，范围0~9
          * @param pvkIndex 私钥索引，范围0~9
          * @param userId 签名者ID，小于512字节，国密推荐默认值为0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38
          * @param dataIn 待签名的数据，长度小于2048字节
          * @param dataOut 签名数据，定长64字节
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int sm2Sign(int pukIndex, int pvkIndex, byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2验签
          * @param pukIndex 公钥索引，范围0~9
          * @param userId 签名者ID
          * @param dataIn 待验签的数据，长度小于2048字节
          * @param signData 签名数据，定长64字节
          * @return 0：成功，其他：错误码
          */
    @Override public int sm2VerifySign(int pukIndex, byte[] userId, byte[] dataIn, byte[] signData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2公钥加密数据
          * @param pukIndex 公钥索引，范围0~9
          * @param dataIn 待加密的数据，长度小于896字节
          * @param dataOut 加密后的数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int sm2EncryptData(int pukIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * SM2私钥解密数据
          * @param pvkIndex 私钥索引，范围0~9
          * @param dataIn 待解密的数据，长度小于896字节
          * @param dataOut 解密后的数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int sm2DecryptData(int pvkIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 计算数据摘要
          * @param mode 摘要模式
          * @param dataIn 待计算的数据，长度小于1920字节
          * @param dataOut 计算后的数据摘要
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int calcSecHash(int mode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 校验MAC
          * @param keyIndex MAC密钥索引
          * @param macAlgType Mac算法类型
          * @param dataIn  待验证数据
          * @param mac  mac数据
          * @return 0：成功，<0：错误码
          */
    @Override public int verifyMac(int keyIndex, int macAlgType, byte[] dataIn, byte[] mac) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成RSA公私钥对（仅支持1024/2048位密钥）
          * @param pvkIndex 私钥索引，范围：0~19
          * @param keySize 密钥长度，支持1024/2048位密钥
          * @param pubExponent 公钥指数，Hex格式，支持03/010001
          * @param dataOut Buffer，存放公钥模
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int generateRSAKeypair(int pvkIndex, int keySize, java.lang.String pubExponent, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入RSA密钥（仅支持1024/2048位密钥）
          * @param KeyIndex  密钥索引，范围：0~19
          * @param keySize 密钥长度，支持1024/2048为密钥
          * @param module 密钥模，Hex格式
          * @param exponent：指数，Hex格式，支持03/010001
          * @return 0：成功，<0：错误码
          */
    @Override public int injectRSAKey(int keyIndex, int keySize, java.lang.String module, java.lang.String exponent) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 随机生成对称密钥(MKSK密钥)
          * @param keyIndex 密钥索引
          * @param keyType 密钥用途
          * @param keyAlgType 密钥算法
          * @return 0：成功， <0：错误
          */
    @Override public int generateSymKey(int keyIndex, int keyType, int keyAlgType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入对称密钥(MKSK密钥)
          * @param keyIndex 密钥索引
          * @param keyType 密钥用途
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param keyAlgType 密钥算法
          * @return 0：成功， <0：错误
          */
    @Override public int injectSymKey(int keyIndex, int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存明文密钥
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param keyAlgType 密钥算法类型,1：3Des 2：AES
          * @param keyIndex 密钥保存的位置索引
          * @return 0：成功，非0：错误码
          */
    @Override public int hsmSaveKeyShare(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存DUKPT密钥
          * @param dukptKeyType 密钥加密类型(TDES128/TDES192/AES128/AES192/AES256)
          * @param keyType BDK-基础分散密钥
          *                IPEK-初始PIN加密密钥
          * @param keyValue 密钥数据
          * @param checkValue 密钥校验值
          * @param ksn
          * @param encryptType  密钥算法
          * @param keyIndex 保存的索引(范围为10~19)
          * @return 0：成功，<0：错误码
          */
    @Override public int hsmSaveKeyShareDukpt(int dukptKeyType, int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 密钥分量合成密钥
          * @param keyType  密钥类型：密钥类型：KEK TMK PIK TDK MAK BDK IPEK
          * @param keyValue 密钥算法：AES 3DES
          * @param keyIndex 密钥索引
          * @param keyShareIndex1  密钥分量1索引
          * @param keyShareIndex2  密钥分量2索引
          * @param keyShareIndex3  密钥分量3索引
          * @param dataOut  KCV
          * @return 0：成功，<0：错误码
          */
    @Override public int hsmCombineKeyShare(int keyType, int keyAlgType, int keyIndex, int keyShareIndex1, int keyShareIndex2, int keyShareIndex3, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成RSA公私钥对（仅支持1024/2048位密钥）
          * @param pvtKeyIndex  私钥索引，范围：0~19
          * @param keySize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
          * @param pubExponent 密钥指数，Hex字符串，可为03/010001
          * @param dataOut  Buffer，存放公钥模
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int hsmGenerateRSAKeypair(int pvtKeyIndex, int keySize, java.lang.String pubExponent, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入RSA公私钥对（仅支持1024/2048位密钥）
          * @param keyIndex  密钥索引，范围：0~19
          * @param keySize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
          * @param module 密钥模
          * @param exponent  密钥指数
          * @return 0：成功，<0：错误码
          */
    @Override public int hsmInjectRSAKey(int keyIndex, int keySize, java.lang.String module, java.lang.String exponent) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存密文KEK
          * @param keyIndex 密钥索引
          * @param keyValue 密文KEK密钥值
          * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
          * @param keyAlgType 密钥算法
          * @param encryptKeySystem 解密密钥的密钥体系：RSA/MKSK
          * @param encryptIndex KEK解密索引
          * @return 0：成功，<0：错误码
          */
    @Override public int hsmSaveKeyUnderKEK(int keyIndex, byte[] keyValue, int keyType, int keyAlgType, int encryptKeySystem, int encryptIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 导出密钥密文
         * @param keyIndex 密钥索引
         * @param kekIndex KEK索引
         * @param kekKeySystem KEK密钥体系：RSA/MKSK
         * @param dataOut  密钥密文
         * @return >=0：dataOut中有效数据的长度，<0：错误码
         */
    @Override public int hsmExportKeyUnderKEK(int keyIndex, int kekIndex, int kekKeySystem, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 导出TR31格式的密钥块
          * @param keyIndex 密钥索引
          * @param encryptIndex 保护密钥索引
          * @param inLen 输入数据的长度
          * @param dataIn 输入数据，如KSN
          * @param dataOut 输出的密钥块
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int hsmExportTR31KeyBlock(int keyIndex, int encryptIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 销毁指定索引的密钥
         * @param keyIndex 密钥索引
         * @return 0：成功， <0：错误
         */
    @Override public int hsmDestroyKey(int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 随机注入或生成密钥
         * @param mode 注入或生成
         * @param curveParam 曲线参数
         * @param keyIndex 密钥索引
         * @param keyType 密钥用途
         * @param keyAlgType 密钥算法
         * @param pubKeyA 密钥数据
         * @param checkValue KCV
         * @param pubKeyB 出参，生成的密钥数据
         * @return 0：成功，<0：错误码
         */
    @Override public int hsmExchangeKeyEcc(int mode, java.lang.String curveParam, int keyIndex, int keyType, int keyAlgType, byte[] pubKeyA, byte[] checkValue, byte[] pubKeyB) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 非对称密钥算法
         * @param mode 算法模式，0-签名(私钥)和验签(公钥)，1-解密(私钥)和加密(公钥)
         * @param keySystem 密钥体系
         * @param keyIndex 密钥索引
         * @param dataIn  待运算的数据
         * @param dataOut 运算后的数据
         * @return >=0：dataOut中有效数据的长度， <0：错误
         */
    @Override public int hsmAsymKeyFun(int mode, int keySystem, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 敏感服务相关操作，包括密码管理、敏感服务状态查询
         * @param mode 模式
         * @param pinPadParam 键盘参数，260字节
         * @return 0-成功， <0：错误
         */
    @Override public int operateSensitiveService(int mode, byte[] pinPadParam) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * RSA公钥加密或私钥解密
          * @param keyIndex 密钥索引，范围：0~39
          * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
          * @param dataIn 待加密/解密数据，长度小于896字节
          * @param dataOut 加解密结果数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int rsaEncryptOrDecryptData(int keyIndex, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存设备证书与密文私钥
          * @param certIndex 证书索引，范围9001-9008
          * @param mode 模式，4-ECB模式，注入私钥密文使用
          * @param encryptIndex 对密文私钥进行解密的密钥索引
          * @param certData 设备证书数据
          * @param pvkData 私钥密文数据
          * @return 0：成功，其他：错误码
          */
    @Override public int storeDeviceCertPrivateKey(int certIndex, int mode, int encryptIndex, byte[] certData, byte[] pvkData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取保存的设备证书
          * @param certIndex 证书索引，范围9001-9008
          * @param dataOut 出参buffer，存放证书数据
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int getDeviceCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 设备证书对应的私钥运算
          * @param keyIndex 证书索引，范围：9001-9008
          * @param mode 加解密类型-专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
          * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
          * @param dataIn 待加密/解密数据，长度小于896字节
          * @param dataOut 加解密结果数据
          * @return >=0：dataOut中有效数据的长度，<0:错误码
          */
    @Override public int devicePrivateKeyRecover(int keyIndex, int mode, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取已保存密钥 checkValue (扩展)
         * @param bundle 入参，包含如下key：
         * keySystem 密钥体系(int)
         * keyIndex 密钥索引(范围为0-9)(int)
         * kcvMode kcv模式(int)
         * targetAppPkgName 目标应用包名(String)
         * @param dataOut 4字节 checkValue
         * @return 0：成功，<0：错误码
         */
    @Override public int getKeyCheckValueEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 删除密钥(扩展)
         * @param bundle 入参，包含如下key：
         * keySystem 密钥体系
         * keyIndex 密钥索引
         * targetAppPkgName 目标应用包名(String)
         * @return  0：成功，<0：错误码
         */
    @Override public int deleteKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 注入密文密钥(扩展)
         * @param bundle 入参，包含如下key：
         * targetAppPkgName 目标应用包名(String)
         * keyType 密钥类型：KEK TMK PIK TDK MAK REV(int)
         * keyValue 密钥数据(byte[])
         * kcvMode kcv模式(int)
         * kcvMacType kcvMac算法类型(int)
         * kcvInData 用于计算kcv的数据(byte[])
         * checkValue 密钥校验值(byte[])
         * encryptIndex 对密钥进行加密的密钥索引(int)
         * keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4(int)
         * keyIndex 密钥保存的位置索引(int)
         * keyLength 密钥长度（明文）(int)
         * dataMode 数据模式(int, ECB/CBCOFB/CFB)
         * iv 初始向量(byte[])
         * @return  0：成功，<0：错误码
         */
    @Override public int injectCiphertextKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存DUKPT密钥(扩展)
         * @param bundle 入参，包含如下key：
         * targetAppPkgName 目标应用包名(String)
         * keyValue 密钥数据(byte[])
         * kcvMode kcv模式(int)
         * kcvMacType kcvMac算法类型(int)
         * kcvInData 用于计算kcv的数据(byte[])
         * checkValue 密钥校验值(byte[])
         * ksn 密钥序列号(byte[])
         * encryptIndex 对密钥进行加密的密钥索引(int)
         * keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4(int)
         * keyIndex 密钥保存的位置索引(int)
         * isEncrypt 是否密文(bool)
         * keyLength 密钥长度（明文）(int)
         * dataMode 数据模式(int, ECB/CBCOFB/CFB)
         * iv 初始向量(byte[])
         * @return  0：成功，<0：错误码
         */
    @Override public int injectKeyDukptEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存MKSK密钥
         * @param bundle 密钥信息，包含如下key：
         * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REC
         * keyValue 密钥数据(byte[])
         * kcvMode kcv模式(int)
         * kcvMacType kcvMac算法类型(int)
         * kcvInData 用于计算kcv的数据(byte[])
         * checkValue 密钥校验值(byte[])
         * encryptIndex 对密钥进行加密的密钥索引(int)
         * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
         * keyIndex 密钥保存的位置索引(int)
         * isEncrypt 是否密文(bool)
         * variantUsage 扩展变量的用法(int)
         * keyVariant 扩展变量(byte[])
         * dataMode 数据模式(int, ECB/CBCOFB/CFB)
         * iv 初始向量(byte[])
         * @return 0：成功，非0：错误码
         */
    @Override public int saveKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 计算mac（扩展）
         * @param bundle 入参，包含如下key：
         * keyIndex mac密钥索引(int)
         * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLength字节(int)
         * macType mac算法(int)
         * diversify 分散因子（值为null，暂不支持）(byte[])
         * dataIn 用于进行mac计算的源数据(byte[])
         * iv 初始化向量(byte[])
         * @param dataOut 计算生成的mac值(byte[])
         * @return 0：成功，<0：错误码
         */
    @Override public int calcMacExtended(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * dukpt密钥计算MAC(扩展)
         * @param bundle 入参，包含如下key：
         * keySelect 密钥选择(int)
         * keyIndex 密钥索引(范围为：3DES：0-9,1100-1199,AES:10-19,2100-2199)
         * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLength字节(int)
         * macType mac算法(int)
         * dataIn 用于进行mac计算的源数据(byte[])
         * iv 初始化向量(byte[])
         * @param dataOut 计算生成的mac值(byte[])
         * @return 0：成功，<0：错误码
         */
    @Override public int calcMacDukptExtended(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 读取RSA密钥信息
         * @param keyIndex 密钥索引，范围：0~19
         * @param keyInfo 出参，包含如下key：
         * modulus：模(byte[])
         * exponent：指数(byte[])
         * @return 0：成功，<0：错误码
         */
    @Override public int readRSAKey(int keyIndex, android.os.Bundle keyInfo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 获取密钥长度
         * @param keySystem 密钥体系
         * @param keyIndex 密钥索引
         * @return >=0：密钥长度，<0：错误码
         */
    @Override public int getKeyLength(int keySystem, int keyIndex) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存可变密钥
         * @param bundle 密钥信息，包含如下key：
         * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REC
         * kcvMode kcv模式(int)
         * kcvMacType kcvMac算法类型(int)
         * kcvInData 用于计算kcv的数据
         * checkValue 密钥校验值(byte[])
         * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
         * srcKeyIndex 源密钥索引(int)
         * destKeyIndex 目标密钥索引(int)
         * xorData 异或数据(byte[])
         * @return 0：成功，非0：错误码
         */
    @Override public int writeKeyVariable(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 密钥杂项操作函数
         * @param keyIndex 密钥索引
         * @param ctrCode 密钥操作类型
         * @param dataIn 输入数据
         * @param dataOut 输出数据
         * @return >=0：dataOut中有效数据的长度， <0：错误
         */
    @Override public int secKeyIoControl(int keyIndex, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 计算APACS MAC
         * @param initMakIndex 初始Mac密钥索引
         * @param makIndex 派生Mac密钥索引
         * @param pikIndex 派生PIN密钥索引
         * @param ctrCode 密钥操作类型
         * @param dataIn 输入数据
         * @param dataOut 输出数据
         * @return >=0：dataOut中有效数据的长度， <0：错误
         */
    @Override public int apacsMac(int initMakIndex, int makIndex, int pikIndex, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存密文密钥，解密密钥为KEK
         * @param bundle 密钥信息，包含如下key：
         * keyIndex KEK索引(int)
         * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
         * keyValue 密文KEK密钥值(byte[])
         * keyAlgType 密钥算法(int)
         * encryptionMode 工作模式(int)
         * paddingMode 填充模式(int)
         * keySystem 密钥体系(int)
         * encryptKeySystem 解密密钥的密钥体系(int)：RSA/MKSK
         * encryptIndex KEK解密索引(int)
         * @return 0：成功，<0：错误码
         */
    @Override public int hsmSaveKeyUnderKEKEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 导出密钥密文
         * @param bundle 密钥信息，包含如下key：
         * keySystem 密钥体系(int)
         * keyIndex 密钥索引(int)
         * kekKeySystem KEK密钥体系(int)：RSA/MKSK
         * kekIndex KEK索引(int)
         * paddingMode 填充模式(int)
         * @param dataOut  密钥密文
         * @return >=0：dataOut中有效数据的长度，<0：错误码
         */
    @Override public int hsmExportKeyUnderKEKEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * OAEP模式注入
         * @param keyIndex   密钥索引
         * @param dependIndex  加密密钥索引
         * @param keyType    密钥类型
         * @param keyAlgType 密钥算法类型
         * @param checkValue 密钥KCV
         * @param keyData    密文
         * @return 0-成功，<0-错误码
         */
    @Override public int hsmGenerateKeyByOaep(int keyIndex, int dependIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 保存MKSK密文密钥，解密密钥为RSA私钥
         * @param keyIndex 密钥保存的位置索引
         * @param rsaKeyIndex RSA私钥索引，，范围：0~39
         * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
         * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
         * @param checkValue 密钥校验值
         * @param keyData RSA加密后密钥数据
         * @return 0-成功，<0-错误码
         */
    @Override public int saveCiphertextKeyUnderRSA(int keyIndex, int rsaKeyIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 注入MKSK密文密钥，解密密钥为RSA私钥
         * @param targetPkgName 目标APP的包名
         * @param keyIndex 密钥保存的位置索引
         * @param rsaKeyIndex RSA私钥索引，，范围：0~39
         * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
         * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
         * @param checkValue 密钥校验值
         * @param keyData RSA加密后密钥数据
         * @return 0-成功，<0-错误码
         */
    @Override public int injectCiphertextKeyUnderRSA(java.lang.String targetPkgName, int keyIndex, int rsaKeyIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 随机生成对称密钥(MKSK密钥)
          * @param bundle 密钥信息，包含如下key：
          * keyIndex 密钥索引(int)
          * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
          * keyAlgType 密钥算法类型(int)
          * keyLength 密钥长度(int, 3DES-16/24字节, AES-16/24/32字节)
          * @return 0-成功，<0-错误码
          */
    @Override public int generateSymKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入对称密钥(MKSK密钥)
          * @param bundle 密钥信息，包含如下key：
          * keyIndex 密钥索引(int)
          * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
          * keyValue 密钥数据(byte[])
          * checkValue 密钥校验值(byte[])
          * keyAlgType 密钥算法类型(int)
          * keyLength 密钥长度(int，3DES-16/24字节，AES-16/24/32字节)
          * encryptIndex1 依赖的解密密钥索引1(int)
          * encryptIndex2 依赖的解密密钥索引2(int，GOWF算法需要依赖两个解密密钥)
          * dataMode 数据模式(int, ECB/CBCOFB/CFB)
          * iv 初始向量(byte[])
          * injectMode 注入模式(int，0x80-OWF2算法类型派生并保存密钥，0x81-OWF3算法类型派生并保存密钥，0x82-0x82 GOWF算法类型派生并保存密钥)
          * @return 0：成功， <0：错误
          */
    @Override public int injectSymKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入设备证书与密文私钥
          * @param bundle 密钥信息，包含如下key：
          * targetAppPkgName 目标应用包名(String)
          * certIndex 证书索引(int)，范围9001-9008
          * mode 模式(int)，4-ECB模式，注入私钥密文使用
          * isEncrypt 是否密文(bool)
          * encryptIndex 对密文私钥进行解密的密钥索引(int)
          * certData 设备证书数据(byte[])
          * pvkData 私钥密文数据(byte[])
          * @return 0：成功，其他：错误码
          */
    @Override public int injectDeviceCertPrivateKey(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 生成RSA公私钥对（仅支持1024/2048位密钥）
          * @param bundle 密钥信息，包含如下key：
          * keyType 密钥类型(int)，值为0或KEY_TYPE_RSA_KPK
          * pvkIndex 私钥索引(int)，范围：20~39
          * keySize 密钥长度(int)，支持1024/2048位密钥
          * pubExponent 公钥指数(String)，Hex格式，支持03/010001
          * @param dataOut Buffer，存放公钥模
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int generateRSAKeypairEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入RSA密钥（仅支持1024/2048位密钥）
          * @param bundle 密钥信息，包含如下key：
          * keyType 密钥类型(int)，值为0或KEY_TYPE_RSA_KPK
          * keyIndex  密钥索引(int)，范围：20~39
          * keySize 密钥长度(int)，支持1024/2048为密钥
          * module 密钥模(String)，Hex格式
          * exponent：指数(String)，Hex格式，支持03/010001
          * @return 0：成功，<0：错误码
          */
    @Override public int injectRSAKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存设备证书
          * @param certIndex 设备证书保存的索引，范围9001-9008
          * @param certData 证书数据
          * @return  0：成功，<0：错误码
          */
    @Override public int setDeviceCertificate(int certIndex, byte[] certData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入明文密钥（白名单程序专用）
          * @param bundle 密钥信息，包含如下key：
          * targetPkgName 目标APP的包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * keyType 密钥类型(int)，范围：KEK TMK PIK TDK MAK REV
          * keyValue 密钥数据(byte[])
          * kcvMode kcv模式(int)
          * kcvMacType kcvMac算法类型(int)
          * kcvInData 用于计算kcv的数据(byte[])
          * checkValue 密钥校验值(byte[])
          * keyAlgType 加密类型(int)，1-3Des 2-AES 3-SM4
          * keyIndex 密钥保存的位置索引(int)
          * @return 0：成功，非0：错误码
          */
    @Override public int injectPlaintextKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 注入密文密钥（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
          * keyValue 密钥数据(byte[])
          * kcvMode kcv模式(int)
          * kcvMacType kcvMac算法类型(int)
          * kcvInData 用于计算kcv的数据(byte[])
          * checkValue 密钥校验值(byte[])
          * encryptIndex 对密钥进行加密的密钥索引(int)
          * keyAlgType 密钥算法类型(int)，1-3Des 2-AES 3-SM4
          * keyIndex 密钥保存的位置索引(int)
          * keyLength 密钥长度（明文）(int)
          * dataMode 数据模式(int)，范围：ECB/CBC/OFB/CFB
          * iv 初始向量(byte[])
          * @return  0：成功，<0：错误码
          */
    @Override public int injectCiphertextKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存DUKPT密钥（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * keyValue 密钥数据(byte[])
          * kcvMode kcv模式(int)
          * kcvMacType kcvMac算法类型(int)
          * kcvInData 用于计算kcv的数据(byte[])
          * checkValue 密钥校验值(byte[])
          * ksn 密钥序列号(byte[])
          * encryptIndex 对密钥进行加密的密钥索引(int)
          * keyAlgType 密钥算法类型(int)，1-3Des 2-AES 3-SM4
          * keyIndex 密钥保存的位置索引(int)
          * isEncrypt 是否密文(bool)
          * keyLength 密钥长度（明文）(int)
          * dataMode 数据模式(int)，范围：ECB/CBCOFB/CFB
          * iv 初始向量(byte[])
          * @return  0：成功，<0：错误码
          */
    @Override public int injectKeyDukptWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 获取已保存密钥的kcv（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
          * keySystem 密钥体系(int)
          * keyIndex 密钥索引(范围为0-9)(int)
          * kcvMode kcv模式(int)
          * @param dataOut 4字节 checkValue
          * @return 0：成功，<0：错误码
          */
    @Override public int getKeyCheckValueWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 删除密钥（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
          * keySystem 密钥体系(int)
          * keyIndex 密钥索引(int)
          * @return  0：成功，<0：错误码
          */
    @Override public int deleteKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 加密数据
          * @param bundle 入参，包含如下key：
          * keyIndex 密钥索引(int)
          * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
          * dataIn 输入数据，待加密的数据(byte[])
          * encryptionMode 工作模式(int)
          * iv 初始向量(byte[])
          * @param dataOut 计算生成的密文
          * @return 0：成功，非0：错误码
          */
    @Override public int dataEncryptEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 解密数据
          * @param bundle 入参，包含如下key：
          * keyIndex 密钥索引(int)
          * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
          * dataIn 输入数据，待解密的数据(byte[])
          * encryptionMode 工作模式(int)
          * iv 初始向量(byte[])
          * @param dataOut 输出数据，解密后的数据
          * @return 0：成功，其他：错误码
          */
    @Override public int dataDecryptEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 查询密钥映射记录列表
          * @param list 出参，每条记录包含如下key：
          * pkgName 密钥所属APP的包名(String)
          * signature 密钥所属APP的签名(String)，Hex格式
          * keySystem 密钥体系(String)，范围：SEC_MKSK,SEC_DUKPT,SEC_RSA_KEY,SEC_SM2_KEY,SEC_ECC_KEY,SEC_CERT,SEC_DEVICE_CERT,SEC_MKSK_NOLOST,SEC_RSA_KEY_NOLOST,SEC_ECC_KEY_NOLOST,SEC_CERT_NOLOST,SEC_UNKNOWN
          * keyIndexRaw 原始密钥索引(int)
          * keyIndexMapped 映射后的密钥索引(int)
          * keyType 密钥类型(String)，范围：BASE_KEY,KEK,TMK,PIK,MAK,TDK,REC,DUPKT_BDK,DUPKT_IPEK,KBPK,TADK,RSA_PUK,RSA_PVK,RSA_PUK_KPK,RSA_PVK_KPK,SM2_PUK,SM2_PVK,ECC_PUK,ECC_PVK,RSA_CERT,DEVICE_CERT_PVK,UNKNOWN
          * keyAlgType 密钥的算法类型(String)，范围：ALG_3DES,ALG_AES,ALG_SM4,ALG_UNKNOWN
          * checkValue 密钥的kcv(String)，Hex格式，kcv模式为KCV_MODE_CHK0
          * injectFlag 密钥的注入标志，范围：null,injected,occupied
          * @return 0：成功，其他：错误码
          */
    @Override public int queryKeyMappingRecordListWL(java.util.List<android.os.Bundle> list) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 采用index索引下的证书构建证书令牌（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * certIndex 证书索引(int)，范围：9001-9008
          * @param dataOut 令牌数据(base64格式)，不小于3072B
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int genTR34CredTokenWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 构建随机数令牌（白名单程序专用）
          * @param randomSize 随机数的长度，范围：1-64
          * @param dataOut 随机数令牌(base64格式)，不小于113B
          * @return >=0：dataOut中有效数据的长度，<0：错误码
          */
    @Override public int genTR34RandomTokenWL(int randomSize, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 校验后台证书Token，并保存后台证书（白名单程序专用）
          * @param dataIn 后台证书令牌(base64格式)
          * @return 0：成功，其他：错误码
          */
    @Override public int validateTR34CredTokenWL(byte[] dataIn) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 校验后台下发的(TR34 Tow Pass) key Token，并保存Kn(要下发的对称密钥)（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
          * depSKIndex 与加密证书中的公钥对应的私钥，用于临时加密密钥Ke的解密(int)，范围：9001－9008
          * keySystem 密钥体系(int)，kn所属密钥体系，范围：SEC_MKSK, SEC_DUKPT
          * keyType 密钥类型(int)，KEK TMK PIK TDK MAK REC
          * keyAlgType 密钥算法类型，1-3Des, 2-AES, 3-SM4
          * keyIndex 对称密钥（Kn）存放的索引(int)，算法类型：DES/AES
          * dataIn 后台下发的密钥令牌（base64格式）(byte[])
          * @return 0：成功，其他：错误码
          */
    @Override public int validateTR34KeyTokenWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 校验解绑令牌（白名单程序专用）
          * @param bundle 入参，包含如下key：
          * certIndex 证书索引(int)，范围：9001-9008
          * dataIn 解绑令牌（base64格式）(byte[])
          * @return 0：成功，其他：错误码
          */
    @Override public int validateTR34UNBTokenWL(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 查询密钥映射记录列表
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * @param list 出参，每条记录包含如下key：
          * pkgName 密钥所属APP的包名(String)
          * signature 密钥所属APP的签名(String)，Hex格式
          * keySystem 密钥体系(String)，范围：SEC_MKSK,SEC_DUKPT,SEC_RSA_KEY,SEC_SM2_KEY,SEC_ECC_KEY,SEC_CERT,SEC_DEVICE_CERT,SEC_MKSK_NOLOST,SEC_RSA_KEY_NOLOST,SEC_ECC_KEY_NOLOST,SEC_CERT_NOLOST,SEC_UNKNOWN
          * keyIndexRaw 原始密钥索引(int)
          * keyIndexMapped 映射后的密钥索引(int)
          * keyType 密钥类型(String)，范围：BASE_KEY,KEK,TMK,PIK,MAK,TDK,REC,DUPKT_BDK,DUPKT_IPEK,KBPK,TADK,RSA_PUK,RSA_PVK,RSA_PUK_KPK,RSA_PVK_KPK,SM2_PUK,SM2_PVK,ECC_PUK,ECC_PVK,RSA_CERT,DEVICE_CERT_PVK,UNKNOWN
          * keyAlgType 密钥的算法类型(String)，范围：ALG_3DES,ALG_AES,ALG_SM4,ALG_UNKNOWN
          * checkValue 密钥的kcv(String)，Hex格式，kcv模式为KCV_MODE_CHK0
          * injectFlag 密钥的注入标志，范围：null,injected,occupied
          * @return 0：成功，其他：错误码
          */
    @Override public int queryKeyMappingRecordList(android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 读取SM2公钥信息
          * @param keyIndex 公钥索引，范围：0~9
          * @param keyInfo 出参，包含如下key：
          * keyData：密钥数据（类型：byte[]，长度：64字节）
          * @return 0：成功，<0：错误码
          */
    @Override public int readSM2Key(int keyIndex, android.os.Bundle keyInfo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 加入Z(ID)值计算SM3哈希值
          * @param keyIndex SM2公钥索引，范围：0~9
          * @param userId userId
          * @param dataIn 输入数据，长度<=896
          * @param dataOut buffer，存放hash数据(32B)
          * @return >=0：dataOut中有效数据的长度，<0：错误
          */
    @Override public int calcSM3HashWithID(int keyIndex, byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 基于Z(ID)的SM3哈希值计算SM2签名
          * @param keyIndex SM2私钥索引，范围：0~9
          * @param hash SM3哈希值，填calcSM3HashWithID()接口的计算结果(32B)
          * @param dataOut buffer，存放Sm2签名数据(64B)
          * @return >=0：dataOut中有效数据的长度，<0：错误
          */
    @Override public int sm2SingleSign(int keyIndex, byte[] hash, byte[] dataOut) throws android.os.RemoteException
    {
      return 0;
    }
    /**
          * 保存TR31密钥
          * @param bundle 入参，包含如下key：
          * targetPkgName 目标应用包名(String)，不可为null
          * keyValue TR31密钥数据(byte[])
          * kbpkIndex KBPK索引(int)
          * keyIndex 密钥索引(int)
          * @return 0：成功，<0：错误码
          */
    @Override public int injectTR31Key(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
         * 随机注入或生成密钥
         * @param bundle 入参，包含如下key：
         * mode 注入或生成(int)
         * curveParam 曲线参数(String)
         * keyIndex 密钥索引(int)
         * keyLength 密钥长度(int)
         * keyType 密钥用途(int)
         * keyAlgType 密钥算法(int)
         * pubKeyA 密钥数据(byte[])
         * checkValue KCV(byte[])
         * @param pubKeyB 出参，生成的密钥数据
         * @return 0：成功，<0：错误码
         */
    @Override public int hsmExchangeKeyEccEx(android.os.Bundle bundle, byte[] pubKeyB) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
  {
    private static final java.lang.String DESCRIPTOR = "com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 interface,
     * generating a proxy if needed.
     */
    public static com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2))) {
        return ((com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2)iin);
      }
      return new com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_saveBaseKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.saveBaseKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_savePlaintextKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _result = this.savePlaintextKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveCiphertextKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _result = this.saveCiphertextKey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_calcMac:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcMac(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_dataEncrypt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.dataEncrypt(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_dataDecrypt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.dataDecrypt(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_saveKeyDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _result = this.saveKeyDukpt(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_calcMacDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcMacDukpt(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_dataEncryptDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.dataEncryptDukpt(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_dataDecryptDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.dataDecryptDukpt(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_dukptIncreaseKSN:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.dukptIncreaseKSN(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dukptCurrentKSN:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.dukptCurrentKSN(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_getKeyCheckValue:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.getKeyCheckValue(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_getTUSNEncryptData:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getTUSNEncryptData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_storeSM4Key:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.storeSM4Key(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_encryptDataBySM4Key:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.encryptDataBySM4Key(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_getSecStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.getSecStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_verifyApkSign:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.verifyApkSign(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getAuthStatus:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getAuthStatus(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getTermStatus:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getTermStatus();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setTermStatus:
        {
          data.enforceInterface(descriptor);
          int _result = this.setTermStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sysRequestAuth:
        {
          data.enforceInterface(descriptor);
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.sysRequestAuth(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_sysConfirmAuth:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sysConfirmAuth(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveTerminalKey:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.saveTerminalKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_readTerminalPuk:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.readTerminalPuk(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_getTerminalCertData:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getTerminalCertData(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_generateRSAKeys:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _result = this.generateRSAKeys(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getRSAPublicKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getRSAPublicKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_getRSAPrivateKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getRSAPrivateKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_dataEncryptRSA:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.dataEncryptRSA(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_dataDecryptRSA:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.dataDecryptRSA(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_removeRSAKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.removeRSAKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_storeCertificate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.storeCertificate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getCertificate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getCertificate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_dukptGetInitKSN:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if ((_arg0_length<0)) {
            _arg0 = null;
          }
          else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.dukptGetInitKSN(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          return true;
        }
        case TRANSACTION_signingRSA:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.signingRSA(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_verifySignatureRSA:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _result = this.verifySignatureRSA(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectPlaintextKey:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _result = this.injectPlaintextKey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectCiphertextKey:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          int _result = this.injectCiphertextKey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dataEncryptDukptEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          int _arg5_length = data.readInt();
          if ((_arg5_length<0)) {
            _arg5 = null;
          }
          else {
            _arg5 = new byte[_arg5_length];
          }
          int _result = this.dataEncryptDukptEx(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg5);
          return true;
        }
        case TRANSACTION_dataDecryptDukptEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          int _arg5_length = data.readInt();
          if ((_arg5_length<0)) {
            _arg5 = null;
          }
          else {
            _arg5 = new byte[_arg5_length];
          }
          int _result = this.dataDecryptDukptEx(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg5);
          return true;
        }
        case TRANSACTION_calcMacDukptEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.calcMacDukptEx(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_verifyMacDukptEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _result = this.verifyMacDukptEx(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveTR31Key:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.saveTR31Key(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveCiphertextKeyRSA:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          java.lang.String _arg6;
          _arg6 = data.readString();
          int _result = this.saveCiphertextKeyRSA(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveRSAKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.saveRSAKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_deleteKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.deleteKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveKeyDukptAES:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          int _result = this.saveKeyDukptAES(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_calcMacEx:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          int _arg5_length = data.readInt();
          if ((_arg5_length<0)) {
            _arg5 = null;
          }
          else {
            _arg5 = new byte[_arg5_length];
          }
          int _result = this.calcMacEx(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg5);
          return true;
        }
        case TRANSACTION_generateSM2Keypair:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.generateSM2Keypair(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg1!=null)) {
            reply.writeInt(1);
            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_injectSM2Key:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _result = this.injectSM2Key(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sm2Sign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.sm2Sign(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_sm2VerifySign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _result = this.sm2VerifySign(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sm2EncryptData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sm2EncryptData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_sm2DecryptData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sm2DecryptData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_calcSecHash:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.calcSecHash(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_verifyMac:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _result = this.verifyMac(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_generateRSAKeypair:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.generateRSAKeypair(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_injectRSAKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _result = this.injectRSAKey(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_generateSymKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.generateSymKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectSymKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          int _result = this.injectSymKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmSaveKeyShare:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _result = this.hsmSaveKeyShare(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmSaveKeyShareDukpt:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          int _result = this.hsmSaveKeyShareDukpt(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmCombineKeyShare:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          byte[] _arg6;
          int _arg6_length = data.readInt();
          if ((_arg6_length<0)) {
            _arg6 = null;
          }
          else {
            _arg6 = new byte[_arg6_length];
          }
          int _result = this.hsmCombineKeyShare(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg6);
          return true;
        }
        case TRANSACTION_hsmGenerateRSAKeypair:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.hsmGenerateRSAKeypair(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_hsmInjectRSAKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _result = this.hsmInjectRSAKey(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmSaveKeyUnderKEK:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _result = this.hsmSaveKeyUnderKEK(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmExportKeyUnderKEK:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.hsmExportKeyUnderKEK(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_hsmExportTR31KeyBlock:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.hsmExportTR31KeyBlock(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_hsmDestroyKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.hsmDestroyKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmExchangeKeyEcc:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          byte[] _arg6;
          _arg6 = data.createByteArray();
          byte[] _arg7;
          int _arg7_length = data.readInt();
          if ((_arg7_length<0)) {
            _arg7 = null;
          }
          else {
            _arg7 = new byte[_arg7_length];
          }
          int _result = this.hsmExchangeKeyEcc(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg7);
          return true;
        }
        case TRANSACTION_hsmAsymKeyFun:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _result = this.hsmAsymKeyFun(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_operateSensitiveService:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.operateSensitiveService(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_rsaEncryptOrDecryptData:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.rsaEncryptOrDecryptData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_storeDeviceCertPrivateKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          int _result = this.storeDeviceCertPrivateKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getDeviceCertificate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getDeviceCertificate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_devicePrivateKeyRecover:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          int _arg4_length = data.readInt();
          if ((_arg4_length<0)) {
            _arg4 = null;
          }
          else {
            _arg4 = new byte[_arg4_length];
          }
          int _result = this.devicePrivateKeyRecover(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg4);
          return true;
        }
        case TRANSACTION_getKeyCheckValueEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getKeyCheckValueEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_deleteKeyEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.deleteKeyEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectCiphertextKeyEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectCiphertextKeyEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectKeyDukptEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectKeyDukptEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveKeyEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.saveKeyEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_calcMacExtended:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.calcMacExtended(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_calcMacDukptExtended:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.calcMacDukptExtended(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_readRSAKey:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.readRSAKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg1!=null)) {
            reply.writeInt(1);
            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getKeyLength:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.getKeyLength(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_writeKeyVariable:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.writeKeyVariable(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_secKeyIoControl:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.secKeyIoControl(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_apacsMac:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          int _arg5_length = data.readInt();
          if ((_arg5_length<0)) {
            _arg5 = null;
          }
          else {
            _arg5 = new byte[_arg5_length];
          }
          int _result = this.apacsMac(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg5);
          return true;
        }
        case TRANSACTION_hsmSaveKeyUnderKEKEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.hsmSaveKeyUnderKEKEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmExportKeyUnderKEKEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.hsmExportKeyUnderKEKEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_hsmGenerateKeyByOaep:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          int _result = this.hsmGenerateKeyByOaep(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_saveCiphertextKeyUnderRSA:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          int _result = this.saveCiphertextKeyUnderRSA(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectCiphertextKeyUnderRSA:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          byte[] _arg6;
          _arg6 = data.createByteArray();
          int _result = this.injectCiphertextKeyUnderRSA(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_generateSymKeyEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.generateSymKeyEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectSymKeyEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectSymKeyEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectDeviceCertPrivateKey:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectDeviceCertPrivateKey(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_generateRSAKeypairEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.generateRSAKeypairEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_injectRSAKeyEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectRSAKeyEx(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setDeviceCertificate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.setDeviceCertificate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectPlaintextKeyWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectPlaintextKeyWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectCiphertextKeyWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectCiphertextKeyWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_injectKeyDukptWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectKeyDukptWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getKeyCheckValueWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.getKeyCheckValueWL(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_deleteKeyWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.deleteKeyWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_dataEncryptEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.dataEncryptEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_dataDecryptEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.dataDecryptEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_queryKeyMappingRecordListWL:
        {
          data.enforceInterface(descriptor);
          java.util.List<android.os.Bundle> _arg0;
          _arg0 = new java.util.ArrayList<android.os.Bundle>();
          int _result = this.queryKeyMappingRecordListWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeTypedList(_arg0);
          return true;
        }
        case TRANSACTION_genTR34CredTokenWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.genTR34CredTokenWL(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_genTR34RandomTokenWL:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.genTR34RandomTokenWL(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        case TRANSACTION_validateTR34CredTokenWL:
        {
          data.enforceInterface(descriptor);
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.validateTR34CredTokenWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_validateTR34KeyTokenWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.validateTR34KeyTokenWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_validateTR34UNBTokenWL:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.validateTR34UNBTokenWL(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_queryKeyMappingRecordList:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.util.List<android.os.Bundle> _arg1;
          _arg1 = new java.util.ArrayList<android.os.Bundle>();
          int _result = this.queryKeyMappingRecordList(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeTypedList(_arg1);
          return true;
        }
        case TRANSACTION_readSM2Key:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = new android.os.Bundle();
          int _result = this.readSM2Key(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          if ((_arg1!=null)) {
            reply.writeInt(1);
            _arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_calcSM3HashWithID:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          int _arg3_length = data.readInt();
          if ((_arg3_length<0)) {
            _arg3 = null;
          }
          else {
            _arg3 = new byte[_arg3_length];
          }
          int _result = this.calcSM3HashWithID(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg3);
          return true;
        }
        case TRANSACTION_sm2SingleSign:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          int _arg2_length = data.readInt();
          if ((_arg2_length<0)) {
            _arg2 = null;
          }
          else {
            _arg2 = new byte[_arg2_length];
          }
          int _result = this.sm2SingleSign(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg2);
          return true;
        }
        case TRANSACTION_injectTR31Key:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _result = this.injectTR31Key(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hsmExchangeKeyEccEx:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if ((_arg1_length<0)) {
            _arg1 = null;
          }
          else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.hsmExchangeKeyEccEx(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
             * 存储基础密钥
             * @param destinationIndex 需要保存的密钥索引，[1,200]
             * @param keyData 密钥数据密文 256位
             * @return 0：成功，其他：错误码
             */
      @Override public int saveBaseKey(int destinationIndex, byte[] keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(destinationIndex);
          _data.writeByteArray(keyData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveBaseKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveBaseKey(destinationIndex, keyData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存明文密钥
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
            * @param keyIndex 密钥保存的位置索引
            * @return 0：成功，非0：错误码
            */
      @Override public int savePlaintextKey(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_savePlaintextKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().savePlaintextKey(keyType, keyValue, checkValue, keyAlgType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存密文密钥
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param encryptIndex 对密钥进行加密的密钥索引
            * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
            * @param keyIndex 密钥保存的位置索引
            * @return 0：成功，非0：错误码
            */
      @Override public int saveCiphertextKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(encryptIndex);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveCiphertextKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveCiphertextKey(keyType, keyValue, checkValue, encryptIndex, keyAlgType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 实现数据MAC计算或校验
            * @param keyIndex :MAC索引
            * @param macAlgType ：MAC加密算法
            * @param dataIn  用于进行MAC计算的源数据
            * @param dataOut 计算生成的MAC值
            * @return 0：成功，<0：错误码
            */
      @Override public int calcMac(int keyIndex, int macAlgType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(macAlgType);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMac, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMac(keyIndex, macAlgType, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 加密数据
            * @param keyIndex 加密密钥索引
            * @param dataIn  用于进行加密计算的源数据
            * @param encryptionMode 加密模式
            * @param iv 初始向量 DES 算法8字节
            * @param dataOut 计算生成的密文
            * @return 0：成功，非0：错误码
            */
      @Override public int dataEncrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncrypt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncrypt(keyIndex, dataIn, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 解密数据
            * @param keyIndex 如果是保留区密钥，制定保留区的密钥索引
            * @param dataIn 输入数据，待解密的数据
            * @param encryptionMode 加密模式
            * @param iv 初始向量
            * @param dataOut 输出数据,解密后的数据
            * @return 0：成功，其他：错误码
            */
      @Override public int dataDecrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecrypt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecrypt(keyIndex, dataIn, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存明文DUKPT密钥
            * @param   keyType  BDK-基础分散密钥
            *                   IPEK-初始PIN加密密钥
            * @param   keyValue 密钥数据
            * @param   checkValue 密钥校验值
            * @param   ksn
            * @param   encryptType  密钥算法
            * @param   keyIndex 保存的索引 (范围为0-9)
            * @param   bool isEncrypt 是否密文
            * @return  0：成功，<0：错误码
            */
      @Override public int saveKeyDukpt(int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(ksn);
          _data.writeInt(encryptType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveKeyDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveKeyDukpt(keyType, keyValue, checkValue, ksn, encryptType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥计算mac
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   macType  mac算法
            * @param   dataIn   待计算的mac数据
            * @param   dataOut  mac 结果
            * @return  0：成功，<0：错误码
            */
      @Override public int calcMacDukpt(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(macType);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMacDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMacDukpt(keyIndex, macType, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥加密数据
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   dataIn   待加密数据
            * @param   dataOut  加密结果
            * @return  0：成功，<0：错误码
            */
      @Override public int dataEncryptDukpt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncryptDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncryptDukpt(keyIndex, dataIn, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥解密数据
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   dataIn   待解密数据
            * @param   dataOut  加密结果
            * @return  0：成功，<0：错误码
            */
      @Override public int dataDecryptDukpt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecryptDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecryptDukpt(keyIndex, dataIn, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * Dukpt KSN 自增1
            * @param   keyIndex 密钥索引(范围为0-9)
            * @return  0：成功，<0：错误码
            */
      @Override public int dukptIncreaseKSN(int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dukptIncreaseKSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dukptIncreaseKSN(keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * Dukpt获取当前KSN
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   outKSN 10字节 KSN
            * @return  0：成功，<0：错误码
            */
      @Override public int dukptCurrentKSN(int keyIndex, byte[] outKSN) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          if ((outKSN==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outKSN.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dukptCurrentKSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dukptCurrentKSN(keyIndex, outKSN);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(outKSN);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取已保存密钥 checkValue
            * @param   keyIndex 密钥索引(范围为0-9)
            * @param   dataOut 4字节 checkValue
            * @return  0：成功，<0：错误码
            */
      @Override public int getKeyCheckValue(int keySystem, int keyIndex, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySystem);
          _data.writeInt(keyIndex);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKeyCheckValue, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getKeyCheckValue(keySystem, keyIndex, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取密文硬件序列号
            * 获取已保存密钥 checkValue
            * @param   dataIn 加密随机因子（银行卡为卡号后六位，扫码类为码的后六位）
            * @param   dataOut 固定传4个字节
            * @return  0：成功，<0：错误码
            */
      @Override public int getTUSNEncryptData(java.lang.String dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTUSNEncryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTUSNEncryptData(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存SM4密钥
            * @param dataIn 密钥数据
            * @return 0：成功，其他：错误码
            */
      @Override public int storeSM4Key(byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeSM4Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().storeSM4Key(dataIn);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 使用保存的SM4密钥加密
            * @param dataIn  用于进行加密计算的源数据
            * @param dataOut 计算生成的密文
            * @return 0：成功，其他：错误码
            */
      @Override public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_encryptDataBySM4Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().encryptDataBySM4Key(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取安全状态
            * @return 0：成功，其他：错误码
            */
      @Override public int getSecStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSecStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSecStatus();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 验证apk签名
            * @param hashMessage  哈希值
            * @param signData 私钥加密的哈希值
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int verifyApkSign(byte[] hashMessage, byte[] signData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(hashMessage);
          _data.writeByteArray(signData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_verifyApkSign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().verifyApkSign(hashMessage, signData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 读取授权状态
            * @param type  授权类型
            * @return 0：成功，其他：错误码
            */
      @Override public java.lang.String getAuthStatus(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAuthStatus(type);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取终端状态 “Factory”,“Release”
            * @return null：出错，“Factory”：工厂模式，“Release”：Release模式
            */
      @Override public java.lang.String getTermStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTermStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTermStatus();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 将终端状态设置为 “Release”
            * @return 0：成功，其他：错误码
            */
      @Override public int setTermStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTermStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setTermStatus();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 请求授权
            * @param reqType  授权类型
            * @param authCode 授权码
            * @param SN       字符串，设备SN
            * @param authData 输出授权数据，256字节
            * @return 0：成功，其他：错误码
            */
      @Override public int sysRequestAuth(byte reqType, int authCode, java.lang.String SN, byte[] authData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(reqType);
          _data.writeInt(authCode);
          _data.writeString(SN);
          if ((authData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(authData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysRequestAuth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysRequestAuth(reqType, authCode, SN, authData);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(authData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /*
            * 确认授权
            * @param dataIn 授权数据，512字节
            * @return 0：成功，其他：错误码
            */
      @Override public int sysConfirmAuth(byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sysConfirmAuth, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sysConfirmAuth(dataIn);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 存储终端认证密钥
            * @param dataInPuk 终端认证公钥及签名 512位
            * @param dataInPvk 终端认证私钥 251位
            * @return 0：成功，其他：错误码
            */
      @Override public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataInPuk);
          _data.writeByteArray(dataInPvk);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveTerminalKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveTerminalKey(dataInPuk, dataInPvk);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取终端认证公钥及签名
            * @param dataOut 输出数据，512字节
            * @return 0：成功，其他：错误码
            */
      @Override public int readTerminalPuk(byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_readTerminalPuk, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readTerminalPuk(dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取终端认证数据
            * @param dataIn 输入数据，256字节
            * @param dataOut 输出数据，256字节
            * @return 0：成功，其他：错误码
            */
      @Override public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTerminalCertData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTerminalCertData(dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 生成RSA公私钥
            * @param pubKeyIndex 公钥保存的位置索引
            * @param pvtkeyIndex 私钥保存的位置索引
            * @param keysize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
            * @param pubExponent 指数(Hex格式)
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int generateRSAKeys(int pubKeyIndex, int pvtKeyIndex, int keysize, java.lang.String pubExponent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pubKeyIndex);
          _data.writeInt(pvtKeyIndex);
          _data.writeInt(keysize);
          _data.writeString(pubExponent);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateRSAKeys, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateRSAKeys(pubKeyIndex, pvtKeyIndex, keysize, pubExponent);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取RSA公钥
            * @param pubKeyIndex 公钥保存的位置索引
            * @param outData 公钥数据(X509编码格式)
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            * @deprecated
            */
      @Override public int getRSAPublicKey(int pubKeyIndex, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pubKeyIndex);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRSAPublicKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRSAPublicKey(pubKeyIndex, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取RSA私钥
            * @param pubKeyIndex 私钥保存的位置索引
            * @param outData 私钥数据(PKCS8编码格式)
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            * @deprecated
            */
      @Override public int getRSAPrivateKey(int pvtKeyIndex, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvtKeyIndex);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRSAPrivateKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRSAPrivateKey(pvtKeyIndex, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 用RSA算法加密数据
            * @param transformation 模式
            * @param keyIndex RSA公钥/私钥索引
            * @param dataIn 待加密的数据
            * @param dataOut 加密后的数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            * @deprecated
            */
      @Override public int dataEncryptRSA(java.lang.String transformation, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(transformation);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncryptRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncryptRSA(transformation, keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 用RSA算法解密数据
            * @param transformation 模式
            * @param keyIndex RSA私钥/公钥索引
            * @param dataIn 待解密的数据
            * @param dataOut 解密后的数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            * @deprecated
            */
      @Override public int dataDecryptRSA(java.lang.String transformation, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(transformation);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecryptRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecryptRSA(transformation, keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 移除RSA密钥
            * @param keyIndex RSA私钥/公钥索引
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int removeRSAKey(int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeRSAKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().removeRSAKey(keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存证书
            * @param certIndex 证书保存的索引
            * @param certData 证书数据
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int storeCertificate(int certIndex, byte[] certData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          _data.writeByteArray(certData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().storeCertificate(certIndex, certData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取保存的证书
            * @param certIndex 证书保存的索引
            * @param dataOut 出参buffer，存放证书数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            * @deprecated
            */
      @Override public int getCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCertificate(certIndex, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * Dukpt获取初始化KSN
            * @param outKSN 10字节 KSN
            * @return >=0：outKSN中有效数据的长度，<0：错误码
            */
      @Override public int dukptGetInitKSN(byte[] outKSN) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((outKSN==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(outKSN.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dukptGetInitKSN, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dukptGetInitKSN(outKSN);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(outKSN);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * RSA算法签名数据
            * @param signAlg 签名算法
            * @param pvtKeyIndex RSA私钥索引
            * @param dataIn 待签名的数据
            * @param dataOut buffer，存放签名后的数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            * @deprecated
            */
      @Override public int signingRSA(java.lang.String signAlg, int pvtKeyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(signAlg);
          _data.writeInt(pvtKeyIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_signingRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().signingRSA(signAlg, pvtKeyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * RSA算法验签
            * @param signAlg 签名算法
            * @param pubKey RSA公钥(X509编码格式)
            * @param srcData 签名前的数据(原始数据)
            * @param signature 签名数据
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int verifySignatureRSA(java.lang.String signAlg, byte[] pubKey, byte[] srcData, byte[] signature) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(signAlg);
          _data.writeByteArray(pubKey);
          _data.writeByteArray(srcData);
          _data.writeByteArray(signature);
          boolean _status = mRemote.transact(Stub.TRANSACTION_verifySignatureRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().verifySignatureRSA(signAlg, pubKey, srcData, signature);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入明文密钥
            * @param targetPkgName 目标APP的包名
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
            * @param keyIndex 密钥保存的位置索引
            * @return 0：成功，非0：错误码
            */
      @Override public int injectPlaintextKey(java.lang.String targetPkgName, int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(targetPkgName);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectPlaintextKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectPlaintextKey(targetPkgName, keyType, keyValue, checkValue, keyAlgType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入密文密钥
            * @param targetPkgName 目标APP的包名
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param encryptIndex 对密钥进行加密的密钥索引
            * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
            * @param keyIndex 密钥保存的位置索引
            * @return 0：成功，非0：错误码
            */
      @Override public int injectCiphertextKey(java.lang.String targetPkgName, int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(targetPkgName);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(encryptIndex);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectCiphertextKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectCiphertextKey(targetPkgName, keyType, keyValue, checkValue, encryptIndex, keyAlgType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥加密
            * @param keySelect 密钥选择
            * @param keyIndex 密钥索引(范围为0-9)
            * @param dataIn   待加密数据
            * @param encryptionMode 工作模式
            * @param iv 初始化向量
            * @param dataOut  加密结果
            * @return 0：成功，<0：错误码
            */
      @Override public int dataEncryptDukptEx(int keySelect, int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySelect);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncryptDukptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncryptDukptEx(keySelect, keyIndex, dataIn, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥解密
            * @param keySelect 密钥选择
            * @param keyIndex 密钥索引(范围为0-9)
            * @param dataIn   待加密数据
            * @param encryptionMode 工作模式
            * @param iv 初始化向量
            * @param dataOut 加密结果
            * @return 0：成功，<0：错误码
            */
      @Override public int dataDecryptDukptEx(int keySelect, int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySelect);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeInt(encryptionMode);
          _data.writeByteArray(iv);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecryptDukptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecryptDukptEx(keySelect, keyIndex, dataIn, encryptionMode, iv, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥计算mac
            * @param keySelect 密钥选择
            * @param keyIndex 密钥索引(范围为0-9)
            * @param macType  mac算法
            * @param dataIn   待计算的mac数据
            * @param dataOut  mac 结果
            * @return 0：成功，<0：错误码
            */
      @Override public int calcMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySelect);
          _data.writeInt(keyIndex);
          _data.writeInt(macType);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMacDukptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMacDukptEx(keySelect, keyIndex, macType, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * DUKPT密钥校验MAC
            * @param keySelect 密钥选择
            * @param keyIndex 密钥索引(范围为0-9)
            * @param macType  mac算法
            * @param dataIn   待计算的mac数据
            * @param dataOut  mac 结果
            * @return 0：成功，<0：错误码
            */
      @Override public int verifyMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] macData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySelect);
          _data.writeInt(keyIndex);
          _data.writeInt(macType);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(macData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_verifyMacDukptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().verifyMacDukptEx(keySelect, keyIndex, macType, dataIn, macData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存TR31密钥
            * @param keyValue  TR31密钥数据
            * @param kbpkIndex KBPK索引
            * @param keyIndex 密钥索引(范围为0-9)
            * @return 0：成功，<0：错误码
            */
      @Override public int saveTR31Key(byte[] keyValue, int kbpkIndex, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(keyValue);
          _data.writeInt(kbpkIndex);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveTR31Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveTR31Key(keyValue, kbpkIndex, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存密文密钥（解密密钥为RSA私钥）
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
            * @param keyIndex 密钥保存的位置索引
            * @param encryptIndexRSA RSA私钥索引
            * @param transformation
            * @return 0：成功，非0：错误码
            * @deprecated
            */
      @Override public int saveCiphertextKeyRSA(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex, int encryptIndexRSA, java.lang.String transformation) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          _data.writeInt(encryptIndexRSA);
          _data.writeString(transformation);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveCiphertextKeyRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveCiphertextKeyRSA(keyType, keyValue, checkValue, keyAlgType, keyIndex, encryptIndexRSA, transformation);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存RSA密钥
            * @param keyType  密钥类型,0-公钥,1-私钥
            * @param keyValue 密钥数据,keyType为0(公钥),则为ANS.1 X509标准编码格式,keyType为1(私钥),则为ANS.1 PKCS#8标准编码格式
            * @param keyIndex 密钥保存的位置索引
            * @return 0：成功，其他：错误码
            * @deprecated
            */
      @Override public int saveRSAKey(int keyType, byte[] keyValue, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveRSAKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveRSAKey(keyType, keyValue, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 删除密钥
            * @param   keySystem 密钥体系
            * @param   keyIndex 密钥索引
            * @return  0：成功，<0：错误码
            */
      @Override public int deleteKey(int keySystem, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySystem);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteKey(keySystem, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存DUKPT-AES密钥
            * @param dukptKeyType AES密钥加密类型(AES128/192/256)
            * @param keyType BDK-基础分散密钥
            *                IPEK-初始PIN加密密钥
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param ksn
            * @param encryptType  密钥算法
            * @param keyIndex 保存的索引(范围为10~19)
            * @return 0：成功，<0：错误码
            */
      @Override public int saveKeyDukptAES(int dukptKeyType, int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(dukptKeyType);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(ksn);
          _data.writeInt(encryptType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveKeyDukptAES, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveKeyDukptAES(dukptKeyType, keyType, keyValue, checkValue, ksn, encryptType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 计算MAC（扩展）
            * @param keyIndex MAC密钥索引
            * @param keyLen 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
            * @param macAlgType MAC加密算法
            * @param diversify 分散因子（值为null，暂不支持）
            * @param dataIn  用于进行MAC计算的源数据
            * @param dataOut 计算生成的MAC值
             * @return 0：成功，<0：错误码
            */
      @Override public int calcMacEx(int keyIndex, int keyLen, int macAlgType, byte[] diversify, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(keyLen);
          _data.writeInt(macAlgType);
          _data.writeByteArray(diversify);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMacEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMacEx(keyIndex, keyLen, macAlgType, diversify, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 生成SM2公私钥对
            * @param pvkIndex 私钥索引，范围0~9
            * @param pubKey 公钥数据，包含key：
            * data：密钥数据（类型：byte[]，长度：64字节）
            * kcv：密钥check value（类型：byte[]，长度：5字节）
            * rfu: RFU数据（类型：byte[]，长度：10字节）
            * @return 0：成功，其他：错误码
            */
      @Override public int generateSM2Keypair(int pvkIndex, android.os.Bundle pubKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvkIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateSM2Keypair, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateSM2Keypair(pvkIndex, pubKey);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            pubKey.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入SM2密钥
            * @param keyIndex 密钥索引，范围0~9
            * @param keyData 密钥数据，包含key：
            * data：密钥数据（类型：byte[]，长度：公钥64字节，私钥32字节）
            * kcv：密钥check value（类型：byte[]，长度：5字节）
            * rfu: RFU数据（类型：byte[]，长度：10字节）
            * @return 0：成功，其他：错误码
            */
      @Override public int injectSM2Key(int keyIndex, android.os.Bundle keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          if ((keyData!=null)) {
            _data.writeInt(1);
            keyData.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectSM2Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectSM2Key(keyIndex, keyData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2签名
            * @param pukIndex 公钥索引，范围0~9
            * @param pvkIndex 私钥索引，范围0~9
            * @param userId 签名者ID，小于512字节，国密推荐默认值为0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38
            * @param dataIn 待签名的数据，长度小于2048字节
            * @param dataOut 签名数据，定长64字节
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int sm2Sign(int pukIndex, int pvkIndex, byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pukIndex);
          _data.writeInt(pvkIndex);
          _data.writeByteArray(userId);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2Sign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2Sign(pukIndex, pvkIndex, userId, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2验签
            * @param pukIndex 公钥索引，范围0~9
            * @param userId 签名者ID
            * @param dataIn 待验签的数据，长度小于2048字节
            * @param signData 签名数据，定长64字节
            * @return 0：成功，其他：错误码
            */
      @Override public int sm2VerifySign(int pukIndex, byte[] userId, byte[] dataIn, byte[] signData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pukIndex);
          _data.writeByteArray(userId);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(signData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2VerifySign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2VerifySign(pukIndex, userId, dataIn, signData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2公钥加密数据
            * @param pukIndex 公钥索引，范围0~9
            * @param dataIn 待加密的数据，长度小于896字节
            * @param dataOut 加密后的数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int sm2EncryptData(int pukIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pukIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2EncryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2EncryptData(pukIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * SM2私钥解密数据
            * @param pvkIndex 私钥索引，范围0~9
            * @param dataIn 待解密的数据，长度小于896字节
            * @param dataOut 解密后的数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int sm2DecryptData(int pvkIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvkIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2DecryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2DecryptData(pvkIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 计算数据摘要
            * @param mode 摘要模式
            * @param dataIn 待计算的数据，长度小于1920字节
            * @param dataOut 计算后的数据摘要
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int calcSecHash(int mode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcSecHash, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcSecHash(mode, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 校验MAC
            * @param keyIndex MAC密钥索引
            * @param macAlgType Mac算法类型
            * @param dataIn  待验证数据
            * @param mac  mac数据
            * @return 0：成功，<0：错误码
            */
      @Override public int verifyMac(int keyIndex, int macAlgType, byte[] dataIn, byte[] mac) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(macAlgType);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(mac);
          boolean _status = mRemote.transact(Stub.TRANSACTION_verifyMac, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().verifyMac(keyIndex, macAlgType, dataIn, mac);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 生成RSA公私钥对（仅支持1024/2048位密钥）
            * @param pvkIndex 私钥索引，范围：0~19
            * @param keySize 密钥长度，支持1024/2048位密钥
            * @param pubExponent 公钥指数，Hex格式，支持03/010001
            * @param dataOut Buffer，存放公钥模
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int generateRSAKeypair(int pvkIndex, int keySize, java.lang.String pubExponent, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvkIndex);
          _data.writeInt(keySize);
          _data.writeString(pubExponent);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateRSAKeypair, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateRSAKeypair(pvkIndex, keySize, pubExponent, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入RSA密钥（仅支持1024/2048位密钥）
            * @param KeyIndex  密钥索引，范围：0~19
            * @param keySize 密钥长度，支持1024/2048为密钥
            * @param module 密钥模，Hex格式
            * @param exponent：指数，Hex格式，支持03/010001
            * @return 0：成功，<0：错误码
            */
      @Override public int injectRSAKey(int keyIndex, int keySize, java.lang.String module, java.lang.String exponent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(keySize);
          _data.writeString(module);
          _data.writeString(exponent);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectRSAKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectRSAKey(keyIndex, keySize, module, exponent);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 随机生成对称密钥(MKSK密钥)
            * @param keyIndex 密钥索引
            * @param keyType 密钥用途
            * @param keyAlgType 密钥算法
            * @return 0：成功， <0：错误
            */
      @Override public int generateSymKey(int keyIndex, int keyType, int keyAlgType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateSymKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateSymKey(keyIndex, keyType, keyAlgType);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入对称密钥(MKSK密钥)
            * @param keyIndex 密钥索引
            * @param keyType 密钥用途
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param keyAlgType 密钥算法
            * @return 0：成功， <0：错误
            */
      @Override public int injectSymKey(int keyIndex, int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(keyAlgType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectSymKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectSymKey(keyIndex, keyType, keyValue, checkValue, keyAlgType);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存明文密钥
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param keyAlgType 密钥算法类型,1：3Des 2：AES
            * @param keyIndex 密钥保存的位置索引
            * @return 0：成功，非0：错误码
            */
      @Override public int hsmSaveKeyShare(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmSaveKeyShare, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmSaveKeyShare(keyType, keyValue, checkValue, keyAlgType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存DUKPT密钥
            * @param dukptKeyType 密钥加密类型(TDES128/TDES192/AES128/AES192/AES256)
            * @param keyType BDK-基础分散密钥
            *                IPEK-初始PIN加密密钥
            * @param keyValue 密钥数据
            * @param checkValue 密钥校验值
            * @param ksn
            * @param encryptType  密钥算法
            * @param keyIndex 保存的索引(范围为10~19)
            * @return 0：成功，<0：错误码
            */
      @Override public int hsmSaveKeyShareDukpt(int dukptKeyType, int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(dukptKeyType);
          _data.writeInt(keyType);
          _data.writeByteArray(keyValue);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(ksn);
          _data.writeInt(encryptType);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmSaveKeyShareDukpt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmSaveKeyShareDukpt(dukptKeyType, keyType, keyValue, checkValue, ksn, encryptType, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 密钥分量合成密钥
            * @param keyType  密钥类型：密钥类型：KEK TMK PIK TDK MAK BDK IPEK
            * @param keyValue 密钥算法：AES 3DES
            * @param keyIndex 密钥索引
            * @param keyShareIndex1  密钥分量1索引
            * @param keyShareIndex2  密钥分量2索引
            * @param keyShareIndex3  密钥分量3索引
            * @param dataOut  KCV
            * @return 0：成功，<0：错误码
            */
      @Override public int hsmCombineKeyShare(int keyType, int keyAlgType, int keyIndex, int keyShareIndex1, int keyShareIndex2, int keyShareIndex3, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          _data.writeInt(keyIndex);
          _data.writeInt(keyShareIndex1);
          _data.writeInt(keyShareIndex2);
          _data.writeInt(keyShareIndex3);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmCombineKeyShare, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmCombineKeyShare(keyType, keyAlgType, keyIndex, keyShareIndex1, keyShareIndex2, keyShareIndex3, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 生成RSA公私钥对（仅支持1024/2048位密钥）
            * @param pvtKeyIndex  私钥索引，范围：0~19
            * @param keySize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
            * @param pubExponent 密钥指数，Hex字符串，可为03/010001
            * @param dataOut  Buffer，存放公钥模
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int hsmGenerateRSAKeypair(int pvtKeyIndex, int keySize, java.lang.String pubExponent, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pvtKeyIndex);
          _data.writeInt(keySize);
          _data.writeString(pubExponent);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmGenerateRSAKeypair, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmGenerateRSAKeypair(pvtKeyIndex, keySize, pubExponent, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入RSA公私钥对（仅支持1024/2048位密钥）
            * @param keyIndex  密钥索引，范围：0~19
            * @param keySize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
            * @param module 密钥模
            * @param exponent  密钥指数
            * @return 0：成功，<0：错误码
            */
      @Override public int hsmInjectRSAKey(int keyIndex, int keySize, java.lang.String module, java.lang.String exponent) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(keySize);
          _data.writeString(module);
          _data.writeString(exponent);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmInjectRSAKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmInjectRSAKey(keyIndex, keySize, module, exponent);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存密文KEK
            * @param keyIndex 密钥索引
            * @param keyValue 密文KEK密钥值
            * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
            * @param keyAlgType 密钥算法
            * @param encryptKeySystem 解密密钥的密钥体系：RSA/MKSK
            * @param encryptIndex KEK解密索引
            * @return 0：成功，<0：错误码
            */
      @Override public int hsmSaveKeyUnderKEK(int keyIndex, byte[] keyValue, int keyType, int keyAlgType, int encryptKeySystem, int encryptIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(keyValue);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          _data.writeInt(encryptKeySystem);
          _data.writeInt(encryptIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmSaveKeyUnderKEK, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmSaveKeyUnderKEK(keyIndex, keyValue, keyType, keyAlgType, encryptKeySystem, encryptIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 导出密钥密文
           * @param keyIndex 密钥索引
           * @param kekIndex KEK索引
           * @param kekKeySystem KEK密钥体系：RSA/MKSK
           * @param dataOut  密钥密文
           * @return >=0：dataOut中有效数据的长度，<0：错误码
           */
      @Override public int hsmExportKeyUnderKEK(int keyIndex, int kekIndex, int kekKeySystem, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(kekIndex);
          _data.writeInt(kekKeySystem);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmExportKeyUnderKEK, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmExportKeyUnderKEK(keyIndex, kekIndex, kekKeySystem, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 导出TR31格式的密钥块
            * @param keyIndex 密钥索引
            * @param encryptIndex 保护密钥索引
            * @param inLen 输入数据的长度
            * @param dataIn 输入数据，如KSN
            * @param dataOut 输出的密钥块
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int hsmExportTR31KeyBlock(int keyIndex, int encryptIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(encryptIndex);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmExportTR31KeyBlock, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmExportTR31KeyBlock(keyIndex, encryptIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 销毁指定索引的密钥
           * @param keyIndex 密钥索引
           * @return 0：成功， <0：错误
           */
      @Override public int hsmDestroyKey(int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmDestroyKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmDestroyKey(keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 随机注入或生成密钥
           * @param mode 注入或生成
           * @param curveParam 曲线参数
           * @param keyIndex 密钥索引
           * @param keyType 密钥用途
           * @param keyAlgType 密钥算法
           * @param pubKeyA 密钥数据
           * @param checkValue KCV
           * @param pubKeyB 出参，生成的密钥数据
           * @return 0：成功，<0：错误码
           */
      @Override public int hsmExchangeKeyEcc(int mode, java.lang.String curveParam, int keyIndex, int keyType, int keyAlgType, byte[] pubKeyA, byte[] checkValue, byte[] pubKeyB) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeString(curveParam);
          _data.writeInt(keyIndex);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          _data.writeByteArray(pubKeyA);
          _data.writeByteArray(checkValue);
          if ((pubKeyB==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(pubKeyB.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmExchangeKeyEcc, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmExchangeKeyEcc(mode, curveParam, keyIndex, keyType, keyAlgType, pubKeyA, checkValue, pubKeyB);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(pubKeyB);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 非对称密钥算法
           * @param mode 算法模式，0-签名(私钥)和验签(公钥)，1-解密(私钥)和加密(公钥)
           * @param keySystem 密钥体系
           * @param keyIndex 密钥索引
           * @param dataIn  待运算的数据
           * @param dataOut 运算后的数据
           * @return >=0：dataOut中有效数据的长度， <0：错误
           */
      @Override public int hsmAsymKeyFun(int mode, int keySystem, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(keySystem);
          _data.writeInt(keyIndex);
          _data.writeByteArray(dataIn);
          _data.writeByteArray(dataOut);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmAsymKeyFun, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmAsymKeyFun(mode, keySystem, keyIndex, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 敏感服务相关操作，包括密码管理、敏感服务状态查询
           * @param mode 模式
           * @param pinPadParam 键盘参数，260字节
           * @return 0-成功， <0：错误
           */
      @Override public int operateSensitiveService(int mode, byte[] pinPadParam) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeByteArray(pinPadParam);
          boolean _status = mRemote.transact(Stub.TRANSACTION_operateSensitiveService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().operateSensitiveService(mode, pinPadParam);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * RSA公钥加密或私钥解密
            * @param keyIndex 密钥索引，范围：0~39
            * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
            * @param dataIn 待加密/解密数据，长度小于896字节
            * @param dataOut 加解密结果数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int rsaEncryptOrDecryptData(int keyIndex, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(padding);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_rsaEncryptOrDecryptData, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().rsaEncryptOrDecryptData(keyIndex, padding, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存设备证书与密文私钥
            * @param certIndex 证书索引，范围9001-9008
            * @param mode 模式，4-ECB模式，注入私钥密文使用
            * @param encryptIndex 对密文私钥进行解密的密钥索引
            * @param certData 设备证书数据
            * @param pvkData 私钥密文数据
            * @return 0：成功，其他：错误码
            */
      @Override public int storeDeviceCertPrivateKey(int certIndex, int mode, int encryptIndex, byte[] certData, byte[] pvkData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          _data.writeInt(mode);
          _data.writeInt(encryptIndex);
          _data.writeByteArray(certData);
          _data.writeByteArray(pvkData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeDeviceCertPrivateKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().storeDeviceCertPrivateKey(certIndex, mode, encryptIndex, certData, pvkData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取保存的设备证书
            * @param certIndex 证书索引，范围9001-9008
            * @param dataOut 出参buffer，存放证书数据
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int getDeviceCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getDeviceCertificate(certIndex, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 设备证书对应的私钥运算
            * @param keyIndex 证书索引，范围：9001-9008
            * @param mode 加解密类型-专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
            * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
            * @param dataIn 待加密/解密数据，长度小于896字节
            * @param dataOut 加解密结果数据
            * @return >=0：dataOut中有效数据的长度，<0:错误码
            */
      @Override public int devicePrivateKeyRecover(int keyIndex, int mode, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(mode);
          _data.writeInt(padding);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_devicePrivateKeyRecover, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().devicePrivateKeyRecover(keyIndex, mode, padding, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 获取已保存密钥 checkValue (扩展)
           * @param bundle 入参，包含如下key：
           * keySystem 密钥体系(int)
           * keyIndex 密钥索引(范围为0-9)(int)
           * kcvMode kcv模式(int)
           * targetAppPkgName 目标应用包名(String)
           * @param dataOut 4字节 checkValue
           * @return 0：成功，<0：错误码
           */
      @Override public int getKeyCheckValueEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKeyCheckValueEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getKeyCheckValueEx(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 删除密钥(扩展)
           * @param bundle 入参，包含如下key：
           * keySystem 密钥体系
           * keyIndex 密钥索引
           * targetAppPkgName 目标应用包名(String)
           * @return  0：成功，<0：错误码
           */
      @Override public int deleteKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKeyEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteKeyEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 注入密文密钥(扩展)
           * @param bundle 入参，包含如下key：
           * targetAppPkgName 目标应用包名(String)
           * keyType 密钥类型：KEK TMK PIK TDK MAK REV(int)
           * keyValue 密钥数据(byte[])
           * kcvMode kcv模式(int)
           * kcvMacType kcvMac算法类型(int)
           * kcvInData 用于计算kcv的数据(byte[])
           * checkValue 密钥校验值(byte[])
           * encryptIndex 对密钥进行加密的密钥索引(int)
           * keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4(int)
           * keyIndex 密钥保存的位置索引(int)
           * keyLength 密钥长度（明文）(int)
           * dataMode 数据模式(int, ECB/CBCOFB/CFB)
           * iv 初始向量(byte[])
           * @return  0：成功，<0：错误码
           */
      @Override public int injectCiphertextKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectCiphertextKeyEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectCiphertextKeyEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 保存DUKPT密钥(扩展)
           * @param bundle 入参，包含如下key：
           * targetAppPkgName 目标应用包名(String)
           * keyValue 密钥数据(byte[])
           * kcvMode kcv模式(int)
           * kcvMacType kcvMac算法类型(int)
           * kcvInData 用于计算kcv的数据(byte[])
           * checkValue 密钥校验值(byte[])
           * ksn 密钥序列号(byte[])
           * encryptIndex 对密钥进行加密的密钥索引(int)
           * keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4(int)
           * keyIndex 密钥保存的位置索引(int)
           * isEncrypt 是否密文(bool)
           * keyLength 密钥长度（明文）(int)
           * dataMode 数据模式(int, ECB/CBCOFB/CFB)
           * iv 初始向量(byte[])
           * @return  0：成功，<0：错误码
           */
      @Override public int injectKeyDukptEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectKeyDukptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectKeyDukptEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 保存MKSK密钥
           * @param bundle 密钥信息，包含如下key：
           * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REC
           * keyValue 密钥数据(byte[])
           * kcvMode kcv模式(int)
           * kcvMacType kcvMac算法类型(int)
           * kcvInData 用于计算kcv的数据(byte[])
           * checkValue 密钥校验值(byte[])
           * encryptIndex 对密钥进行加密的密钥索引(int)
           * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
           * keyIndex 密钥保存的位置索引(int)
           * isEncrypt 是否密文(bool)
           * variantUsage 扩展变量的用法(int)
           * keyVariant 扩展变量(byte[])
           * dataMode 数据模式(int, ECB/CBCOFB/CFB)
           * iv 初始向量(byte[])
           * @return 0：成功，非0：错误码
           */
      @Override public int saveKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveKeyEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveKeyEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 计算mac（扩展）
           * @param bundle 入参，包含如下key：
           * keyIndex mac密钥索引(int)
           * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLength字节(int)
           * macType mac算法(int)
           * diversify 分散因子（值为null，暂不支持）(byte[])
           * dataIn 用于进行mac计算的源数据(byte[])
           * iv 初始化向量(byte[])
           * @param dataOut 计算生成的mac值(byte[])
           * @return 0：成功，<0：错误码
           */
      @Override public int calcMacExtended(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMacExtended, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMacExtended(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * dukpt密钥计算MAC(扩展)
           * @param bundle 入参，包含如下key：
           * keySelect 密钥选择(int)
           * keyIndex 密钥索引(范围为：3DES：0-9,1100-1199,AES:10-19,2100-2199)
           * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLength字节(int)
           * macType mac算法(int)
           * dataIn 用于进行mac计算的源数据(byte[])
           * iv 初始化向量(byte[])
           * @param dataOut 计算生成的mac值(byte[])
           * @return 0：成功，<0：错误码
           */
      @Override public int calcMacDukptExtended(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMacDukptExtended, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcMacDukptExtended(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 读取RSA密钥信息
           * @param keyIndex 密钥索引，范围：0~19
           * @param keyInfo 出参，包含如下key：
           * modulus：模(byte[])
           * exponent：指数(byte[])
           * @return 0：成功，<0：错误码
           */
      @Override public int readRSAKey(int keyIndex, android.os.Bundle keyInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readRSAKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readRSAKey(keyIndex, keyInfo);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            keyInfo.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 获取密钥长度
           * @param keySystem 密钥体系
           * @param keyIndex 密钥索引
           * @return >=0：密钥长度，<0：错误码
           */
      @Override public int getKeyLength(int keySystem, int keyIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keySystem);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKeyLength, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getKeyLength(keySystem, keyIndex);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 保存可变密钥
           * @param bundle 密钥信息，包含如下key：
           * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REC
           * kcvMode kcv模式(int)
           * kcvMacType kcvMac算法类型(int)
           * kcvInData 用于计算kcv的数据
           * checkValue 密钥校验值(byte[])
           * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
           * srcKeyIndex 源密钥索引(int)
           * destKeyIndex 目标密钥索引(int)
           * xorData 异或数据(byte[])
           * @return 0：成功，非0：错误码
           */
      @Override public int writeKeyVariable(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeKeyVariable, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().writeKeyVariable(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 密钥杂项操作函数
           * @param keyIndex 密钥索引
           * @param ctrCode 密钥操作类型
           * @param dataIn 输入数据
           * @param dataOut 输出数据
           * @return >=0：dataOut中有效数据的长度， <0：错误
           */
      @Override public int secKeyIoControl(int keyIndex, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(ctrCode);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_secKeyIoControl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().secKeyIoControl(keyIndex, ctrCode, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 计算APACS MAC
           * @param initMakIndex 初始Mac密钥索引
           * @param makIndex 派生Mac密钥索引
           * @param pikIndex 派生PIN密钥索引
           * @param ctrCode 密钥操作类型
           * @param dataIn 输入数据
           * @param dataOut 输出数据
           * @return >=0：dataOut中有效数据的长度， <0：错误
           */
      @Override public int apacsMac(int initMakIndex, int makIndex, int pikIndex, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(initMakIndex);
          _data.writeInt(makIndex);
          _data.writeInt(pikIndex);
          _data.writeInt(ctrCode);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_apacsMac, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().apacsMac(initMakIndex, makIndex, pikIndex, ctrCode, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 保存密文密钥，解密密钥为KEK
           * @param bundle 密钥信息，包含如下key：
           * keyIndex KEK索引(int)
           * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
           * keyValue 密文KEK密钥值(byte[])
           * keyAlgType 密钥算法(int)
           * encryptionMode 工作模式(int)
           * paddingMode 填充模式(int)
           * keySystem 密钥体系(int)
           * encryptKeySystem 解密密钥的密钥体系(int)：RSA/MKSK
           * encryptIndex KEK解密索引(int)
           * @return 0：成功，<0：错误码
           */
      @Override public int hsmSaveKeyUnderKEKEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmSaveKeyUnderKEKEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmSaveKeyUnderKEKEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 导出密钥密文
           * @param bundle 密钥信息，包含如下key：
           * keySystem 密钥体系(int)
           * keyIndex 密钥索引(int)
           * kekKeySystem KEK密钥体系(int)：RSA/MKSK
           * kekIndex KEK索引(int)
           * paddingMode 填充模式(int)
           * @param dataOut  密钥密文
           * @return >=0：dataOut中有效数据的长度，<0：错误码
           */
      @Override public int hsmExportKeyUnderKEKEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmExportKeyUnderKEKEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmExportKeyUnderKEKEx(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * OAEP模式注入
           * @param keyIndex   密钥索引
           * @param dependIndex  加密密钥索引
           * @param keyType    密钥类型
           * @param keyAlgType 密钥算法类型
           * @param checkValue 密钥KCV
           * @param keyData    密文
           * @return 0-成功，<0-错误码
           */
      @Override public int hsmGenerateKeyByOaep(int keyIndex, int dependIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(dependIndex);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(keyData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmGenerateKeyByOaep, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmGenerateKeyByOaep(keyIndex, dependIndex, keyType, keyAlgType, checkValue, keyData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 保存MKSK密文密钥，解密密钥为RSA私钥
           * @param keyIndex 密钥保存的位置索引
           * @param rsaKeyIndex RSA私钥索引，，范围：0~39
           * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
           * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
           * @param checkValue 密钥校验值
           * @param keyData RSA加密后密钥数据
           * @return 0-成功，<0-错误码
           */
      @Override public int saveCiphertextKeyUnderRSA(int keyIndex, int rsaKeyIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(rsaKeyIndex);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(keyData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveCiphertextKeyUnderRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().saveCiphertextKeyUnderRSA(keyIndex, rsaKeyIndex, keyType, keyAlgType, checkValue, keyData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 注入MKSK密文密钥，解密密钥为RSA私钥
           * @param targetPkgName 目标APP的包名
           * @param keyIndex 密钥保存的位置索引
           * @param rsaKeyIndex RSA私钥索引，，范围：0~39
           * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
           * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
           * @param checkValue 密钥校验值
           * @param keyData RSA加密后密钥数据
           * @return 0-成功，<0-错误码
           */
      @Override public int injectCiphertextKeyUnderRSA(java.lang.String targetPkgName, int keyIndex, int rsaKeyIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(targetPkgName);
          _data.writeInt(keyIndex);
          _data.writeInt(rsaKeyIndex);
          _data.writeInt(keyType);
          _data.writeInt(keyAlgType);
          _data.writeByteArray(checkValue);
          _data.writeByteArray(keyData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectCiphertextKeyUnderRSA, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectCiphertextKeyUnderRSA(targetPkgName, keyIndex, rsaKeyIndex, keyType, keyAlgType, checkValue, keyData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 随机生成对称密钥(MKSK密钥)
            * @param bundle 密钥信息，包含如下key：
            * keyIndex 密钥索引(int)
            * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
            * keyAlgType 密钥算法类型(int)
            * keyLength 密钥长度(int, 3DES-16/24字节, AES-16/24/32字节)
            * @return 0-成功，<0-错误码
            */
      @Override public int generateSymKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateSymKeyEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateSymKeyEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入对称密钥(MKSK密钥)
            * @param bundle 密钥信息，包含如下key：
            * keyIndex 密钥索引(int)
            * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
            * keyValue 密钥数据(byte[])
            * checkValue 密钥校验值(byte[])
            * keyAlgType 密钥算法类型(int)
            * keyLength 密钥长度(int，3DES-16/24字节，AES-16/24/32字节)
            * encryptIndex1 依赖的解密密钥索引1(int)
            * encryptIndex2 依赖的解密密钥索引2(int，GOWF算法需要依赖两个解密密钥)
            * dataMode 数据模式(int, ECB/CBCOFB/CFB)
            * iv 初始向量(byte[])
            * injectMode 注入模式(int，0x80-OWF2算法类型派生并保存密钥，0x81-OWF3算法类型派生并保存密钥，0x82-0x82 GOWF算法类型派生并保存密钥)
            * @return 0：成功， <0：错误
            */
      @Override public int injectSymKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectSymKeyEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectSymKeyEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入设备证书与密文私钥
            * @param bundle 密钥信息，包含如下key：
            * targetAppPkgName 目标应用包名(String)
            * certIndex 证书索引(int)，范围9001-9008
            * mode 模式(int)，4-ECB模式，注入私钥密文使用
            * isEncrypt 是否密文(bool)
            * encryptIndex 对密文私钥进行解密的密钥索引(int)
            * certData 设备证书数据(byte[])
            * pvkData 私钥密文数据(byte[])
            * @return 0：成功，其他：错误码
            */
      @Override public int injectDeviceCertPrivateKey(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectDeviceCertPrivateKey, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectDeviceCertPrivateKey(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 生成RSA公私钥对（仅支持1024/2048位密钥）
            * @param bundle 密钥信息，包含如下key：
            * keyType 密钥类型(int)，值为0或KEY_TYPE_RSA_KPK
            * pvkIndex 私钥索引(int)，范围：20~39
            * keySize 密钥长度(int)，支持1024/2048位密钥
            * pubExponent 公钥指数(String)，Hex格式，支持03/010001
            * @param dataOut Buffer，存放公钥模
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int generateRSAKeypairEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateRSAKeypairEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().generateRSAKeypairEx(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入RSA密钥（仅支持1024/2048位密钥）
            * @param bundle 密钥信息，包含如下key：
            * keyType 密钥类型(int)，值为0或KEY_TYPE_RSA_KPK
            * keyIndex  密钥索引(int)，范围：20~39
            * keySize 密钥长度(int)，支持1024/2048为密钥
            * module 密钥模(String)，Hex格式
            * exponent：指数(String)，Hex格式，支持03/010001
            * @return 0：成功，<0：错误码
            */
      @Override public int injectRSAKeyEx(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectRSAKeyEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectRSAKeyEx(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存设备证书
            * @param certIndex 设备证书保存的索引，范围9001-9008
            * @param certData 证书数据
            * @return  0：成功，<0：错误码
            */
      @Override public int setDeviceCertificate(int certIndex, byte[] certData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(certIndex);
          _data.writeByteArray(certData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDeviceCertificate, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setDeviceCertificate(certIndex, certData);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入明文密钥（白名单程序专用）
            * @param bundle 密钥信息，包含如下key：
            * targetPkgName 目标APP的包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * keyType 密钥类型(int)，范围：KEK TMK PIK TDK MAK REV
            * keyValue 密钥数据(byte[])
            * kcvMode kcv模式(int)
            * kcvMacType kcvMac算法类型(int)
            * kcvInData 用于计算kcv的数据(byte[])
            * checkValue 密钥校验值(byte[])
            * keyAlgType 加密类型(int)，1-3Des 2-AES 3-SM4
            * keyIndex 密钥保存的位置索引(int)
            * @return 0：成功，非0：错误码
            */
      @Override public int injectPlaintextKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectPlaintextKeyWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectPlaintextKeyWL(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 注入密文密钥（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
            * keyValue 密钥数据(byte[])
            * kcvMode kcv模式(int)
            * kcvMacType kcvMac算法类型(int)
            * kcvInData 用于计算kcv的数据(byte[])
            * checkValue 密钥校验值(byte[])
            * encryptIndex 对密钥进行加密的密钥索引(int)
            * keyAlgType 密钥算法类型(int)，1-3Des 2-AES 3-SM4
            * keyIndex 密钥保存的位置索引(int)
            * keyLength 密钥长度（明文）(int)
            * dataMode 数据模式(int)，范围：ECB/CBC/OFB/CFB
            * iv 初始向量(byte[])
            * @return  0：成功，<0：错误码
            */
      @Override public int injectCiphertextKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectCiphertextKeyWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectCiphertextKeyWL(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存DUKPT密钥（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * keyValue 密钥数据(byte[])
            * kcvMode kcv模式(int)
            * kcvMacType kcvMac算法类型(int)
            * kcvInData 用于计算kcv的数据(byte[])
            * checkValue 密钥校验值(byte[])
            * ksn 密钥序列号(byte[])
            * encryptIndex 对密钥进行加密的密钥索引(int)
            * keyAlgType 密钥算法类型(int)，1-3Des 2-AES 3-SM4
            * keyIndex 密钥保存的位置索引(int)
            * isEncrypt 是否密文(bool)
            * keyLength 密钥长度（明文）(int)
            * dataMode 数据模式(int)，范围：ECB/CBCOFB/CFB
            * iv 初始向量(byte[])
            * @return  0：成功，<0：错误码
            */
      @Override public int injectKeyDukptWL(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectKeyDukptWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectKeyDukptWL(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 获取已保存密钥的kcv（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
            * keySystem 密钥体系(int)
            * keyIndex 密钥索引(范围为0-9)(int)
            * kcvMode kcv模式(int)
            * @param dataOut 4字节 checkValue
            * @return 0：成功，<0：错误码
            */
      @Override public int getKeyCheckValueWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKeyCheckValueWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getKeyCheckValueWL(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 删除密钥（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
            * keySystem 密钥体系(int)
            * keyIndex 密钥索引(int)
            * @return  0：成功，<0：错误码
            */
      @Override public int deleteKeyWL(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteKeyWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().deleteKeyWL(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 加密数据
            * @param bundle 入参，包含如下key：
            * keyIndex 密钥索引(int)
            * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
            * dataIn 输入数据，待加密的数据(byte[])
            * encryptionMode 工作模式(int)
            * iv 初始向量(byte[])
            * @param dataOut 计算生成的密文
            * @return 0：成功，非0：错误码
            */
      @Override public int dataEncryptEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataEncryptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataEncryptEx(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 解密数据
            * @param bundle 入参，包含如下key：
            * keyIndex 密钥索引(int)
            * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
            * dataIn 输入数据，待解密的数据(byte[])
            * encryptionMode 工作模式(int)
            * iv 初始向量(byte[])
            * @param dataOut 输出数据，解密后的数据
            * @return 0：成功，其他：错误码
            */
      @Override public int dataDecryptEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_dataDecryptEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().dataDecryptEx(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 查询密钥映射记录列表
            * @param list 出参，每条记录包含如下key：
            * pkgName 密钥所属APP的包名(String)
            * signature 密钥所属APP的签名(String)，Hex格式
            * keySystem 密钥体系(String)，范围：SEC_MKSK,SEC_DUKPT,SEC_RSA_KEY,SEC_SM2_KEY,SEC_ECC_KEY,SEC_CERT,SEC_DEVICE_CERT,SEC_MKSK_NOLOST,SEC_RSA_KEY_NOLOST,SEC_ECC_KEY_NOLOST,SEC_CERT_NOLOST,SEC_UNKNOWN
            * keyIndexRaw 原始密钥索引(int)
            * keyIndexMapped 映射后的密钥索引(int)
            * keyType 密钥类型(String)，范围：BASE_KEY,KEK,TMK,PIK,MAK,TDK,REC,DUPKT_BDK,DUPKT_IPEK,KBPK,TADK,RSA_PUK,RSA_PVK,RSA_PUK_KPK,RSA_PVK_KPK,SM2_PUK,SM2_PVK,ECC_PUK,ECC_PVK,RSA_CERT,DEVICE_CERT_PVK,UNKNOWN
            * keyAlgType 密钥的算法类型(String)，范围：ALG_3DES,ALG_AES,ALG_SM4,ALG_UNKNOWN
            * checkValue 密钥的kcv(String)，Hex格式，kcv模式为KCV_MODE_CHK0
            * injectFlag 密钥的注入标志，范围：null,injected,occupied
            * @return 0：成功，其他：错误码
            */
      @Override public int queryKeyMappingRecordListWL(java.util.List<android.os.Bundle> list) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryKeyMappingRecordListWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryKeyMappingRecordListWL(list);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readTypedList(list, android.os.Bundle.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 采用index索引下的证书构建证书令牌（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * certIndex 证书索引(int)，范围：9001-9008
            * @param dataOut 令牌数据(base64格式)，不小于3072B
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int genTR34CredTokenWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_genTR34CredTokenWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().genTR34CredTokenWL(bundle, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 构建随机数令牌（白名单程序专用）
            * @param randomSize 随机数的长度，范围：1-64
            * @param dataOut 随机数令牌(base64格式)，不小于113B
            * @return >=0：dataOut中有效数据的长度，<0：错误码
            */
      @Override public int genTR34RandomTokenWL(int randomSize, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(randomSize);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_genTR34RandomTokenWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().genTR34RandomTokenWL(randomSize, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 校验后台证书Token，并保存后台证书（白名单程序专用）
            * @param dataIn 后台证书令牌(base64格式)
            * @return 0：成功，其他：错误码
            */
      @Override public int validateTR34CredTokenWL(byte[] dataIn) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(dataIn);
          boolean _status = mRemote.transact(Stub.TRANSACTION_validateTR34CredTokenWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().validateTR34CredTokenWL(dataIn);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 校验后台下发的(TR34 Tow Pass) key Token，并保存Kn(要下发的对称密钥)（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
            * depSKIndex 与加密证书中的公钥对应的私钥，用于临时加密密钥Ke的解密(int)，范围：9001－9008
            * keySystem 密钥体系(int)，kn所属密钥体系，范围：SEC_MKSK, SEC_DUKPT
            * keyType 密钥类型(int)，KEK TMK PIK TDK MAK REC
            * keyAlgType 密钥算法类型，1-3Des, 2-AES, 3-SM4
            * keyIndex 对称密钥（Kn）存放的索引(int)，算法类型：DES/AES
            * dataIn 后台下发的密钥令牌（base64格式）(byte[])
            * @return 0：成功，其他：错误码
            */
      @Override public int validateTR34KeyTokenWL(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_validateTR34KeyTokenWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().validateTR34KeyTokenWL(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 校验解绑令牌（白名单程序专用）
            * @param bundle 入参，包含如下key：
            * certIndex 证书索引(int)，范围：9001-9008
            * dataIn 解绑令牌（base64格式）(byte[])
            * @return 0：成功，其他：错误码
            */
      @Override public int validateTR34UNBTokenWL(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_validateTR34UNBTokenWL, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().validateTR34UNBTokenWL(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 查询密钥映射记录列表
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * @param list 出参，每条记录包含如下key：
            * pkgName 密钥所属APP的包名(String)
            * signature 密钥所属APP的签名(String)，Hex格式
            * keySystem 密钥体系(String)，范围：SEC_MKSK,SEC_DUKPT,SEC_RSA_KEY,SEC_SM2_KEY,SEC_ECC_KEY,SEC_CERT,SEC_DEVICE_CERT,SEC_MKSK_NOLOST,SEC_RSA_KEY_NOLOST,SEC_ECC_KEY_NOLOST,SEC_CERT_NOLOST,SEC_UNKNOWN
            * keyIndexRaw 原始密钥索引(int)
            * keyIndexMapped 映射后的密钥索引(int)
            * keyType 密钥类型(String)，范围：BASE_KEY,KEK,TMK,PIK,MAK,TDK,REC,DUPKT_BDK,DUPKT_IPEK,KBPK,TADK,RSA_PUK,RSA_PVK,RSA_PUK_KPK,RSA_PVK_KPK,SM2_PUK,SM2_PVK,ECC_PUK,ECC_PVK,RSA_CERT,DEVICE_CERT_PVK,UNKNOWN
            * keyAlgType 密钥的算法类型(String)，范围：ALG_3DES,ALG_AES,ALG_SM4,ALG_UNKNOWN
            * checkValue 密钥的kcv(String)，Hex格式，kcv模式为KCV_MODE_CHK0
            * injectFlag 密钥的注入标志，范围：null,injected,occupied
            * @return 0：成功，其他：错误码
            */
      @Override public int queryKeyMappingRecordList(android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryKeyMappingRecordList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryKeyMappingRecordList(bundle, list);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readTypedList(list, android.os.Bundle.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 读取SM2公钥信息
            * @param keyIndex 公钥索引，范围：0~9
            * @param keyInfo 出参，包含如下key：
            * keyData：密钥数据（类型：byte[]，长度：64字节）
            * @return 0：成功，<0：错误码
            */
      @Override public int readSM2Key(int keyIndex, android.os.Bundle keyInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readSM2Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().readSM2Key(keyIndex, keyInfo);
          }
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            keyInfo.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 加入Z(ID)值计算SM3哈希值
            * @param keyIndex SM2公钥索引，范围：0~9
            * @param userId userId
            * @param dataIn 输入数据，长度<=896
            * @param dataOut buffer，存放hash数据(32B)
            * @return >=0：dataOut中有效数据的长度，<0：错误
            */
      @Override public int calcSM3HashWithID(int keyIndex, byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(userId);
          _data.writeByteArray(dataIn);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcSM3HashWithID, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().calcSM3HashWithID(keyIndex, userId, dataIn, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 基于Z(ID)的SM3哈希值计算SM2签名
            * @param keyIndex SM2私钥索引，范围：0~9
            * @param hash SM3哈希值，填calcSM3HashWithID()接口的计算结果(32B)
            * @param dataOut buffer，存放Sm2签名数据(64B)
            * @return >=0：dataOut中有效数据的长度，<0：错误
            */
      @Override public int sm2SingleSign(int keyIndex, byte[] hash, byte[] dataOut) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeByteArray(hash);
          if ((dataOut==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(dataOut.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sm2SingleSign, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sm2SingleSign(keyIndex, hash, dataOut);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(dataOut);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
            * 保存TR31密钥
            * @param bundle 入参，包含如下key：
            * targetPkgName 目标应用包名(String)，不可为null
            * keyValue TR31密钥数据(byte[])
            * kbpkIndex KBPK索引(int)
            * keyIndex 密钥索引(int)
            * @return 0：成功，<0：错误码
            */
      @Override public int injectTR31Key(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectTR31Key, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().injectTR31Key(bundle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
           * 随机注入或生成密钥
           * @param bundle 入参，包含如下key：
           * mode 注入或生成(int)
           * curveParam 曲线参数(String)
           * keyIndex 密钥索引(int)
           * keyLength 密钥长度(int)
           * keyType 密钥用途(int)
           * keyAlgType 密钥算法(int)
           * pubKeyA 密钥数据(byte[])
           * checkValue KCV(byte[])
           * @param pubKeyB 出参，生成的密钥数据
           * @return 0：成功，<0：错误码
           */
      @Override public int hsmExchangeKeyEccEx(android.os.Bundle bundle, byte[] pubKeyB) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((pubKeyB==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(pubKeyB.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_hsmExchangeKeyEccEx, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hsmExchangeKeyEccEx(bundle, pubKeyB);
          }
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(pubKeyB);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 sDefaultImpl;
    }
    static final int TRANSACTION_saveBaseKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_savePlaintextKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_saveCiphertextKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_calcMac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_dataEncrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_dataDecrypt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_saveKeyDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_calcMacDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_dataEncryptDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_dataDecryptDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_dukptIncreaseKSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_dukptCurrentKSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getKeyCheckValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getTUSNEncryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_storeSM4Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_encryptDataBySM4Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getSecStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_verifyApkSign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getAuthStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getTermStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_setTermStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_sysRequestAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_sysConfirmAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_saveTerminalKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_readTerminalPuk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getTerminalCertData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_generateRSAKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getRSAPublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_getRSAPrivateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_dataEncryptRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_dataDecryptRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_removeRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_storeCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_dukptGetInitKSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_signingRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_verifySignatureRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_injectPlaintextKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_injectCiphertextKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_dataEncryptDukptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_dataDecryptDukptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_calcMacDukptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_verifyMacDukptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_saveTR31Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_saveCiphertextKeyRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_saveRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_deleteKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_saveKeyDukptAES = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_calcMacEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_generateSM2Keypair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_injectSM2Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_sm2Sign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
    static final int TRANSACTION_sm2VerifySign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
    static final int TRANSACTION_sm2EncryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
    static final int TRANSACTION_sm2DecryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
    static final int TRANSACTION_calcSecHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
    static final int TRANSACTION_verifyMac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
    static final int TRANSACTION_generateRSAKeypair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
    static final int TRANSACTION_injectRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
    static final int TRANSACTION_generateSymKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
    static final int TRANSACTION_injectSymKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
    static final int TRANSACTION_hsmSaveKeyShare = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
    static final int TRANSACTION_hsmSaveKeyShareDukpt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
    static final int TRANSACTION_hsmCombineKeyShare = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
    static final int TRANSACTION_hsmGenerateRSAKeypair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
    static final int TRANSACTION_hsmInjectRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
    static final int TRANSACTION_hsmSaveKeyUnderKEK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
    static final int TRANSACTION_hsmExportKeyUnderKEK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
    static final int TRANSACTION_hsmExportTR31KeyBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
    static final int TRANSACTION_hsmDestroyKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
    static final int TRANSACTION_hsmExchangeKeyEcc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
    static final int TRANSACTION_hsmAsymKeyFun = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
    static final int TRANSACTION_operateSensitiveService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
    static final int TRANSACTION_rsaEncryptOrDecryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
    static final int TRANSACTION_storeDeviceCertPrivateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
    static final int TRANSACTION_getDeviceCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
    static final int TRANSACTION_devicePrivateKeyRecover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
    static final int TRANSACTION_getKeyCheckValueEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
    static final int TRANSACTION_deleteKeyEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
    static final int TRANSACTION_injectCiphertextKeyEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
    static final int TRANSACTION_injectKeyDukptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
    static final int TRANSACTION_saveKeyEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
    static final int TRANSACTION_calcMacExtended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
    static final int TRANSACTION_calcMacDukptExtended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
    static final int TRANSACTION_readRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
    static final int TRANSACTION_getKeyLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
    static final int TRANSACTION_writeKeyVariable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
    static final int TRANSACTION_secKeyIoControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
    static final int TRANSACTION_apacsMac = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
    static final int TRANSACTION_hsmSaveKeyUnderKEKEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
    static final int TRANSACTION_hsmExportKeyUnderKEKEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
    static final int TRANSACTION_hsmGenerateKeyByOaep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
    static final int TRANSACTION_saveCiphertextKeyUnderRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
    static final int TRANSACTION_injectCiphertextKeyUnderRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
    static final int TRANSACTION_generateSymKeyEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
    static final int TRANSACTION_injectSymKeyEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
    static final int TRANSACTION_injectDeviceCertPrivateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 96);
    static final int TRANSACTION_generateRSAKeypairEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 97);
    static final int TRANSACTION_injectRSAKeyEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 98);
    static final int TRANSACTION_setDeviceCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 99);
    static final int TRANSACTION_injectPlaintextKeyWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 100);
    static final int TRANSACTION_injectCiphertextKeyWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 101);
    static final int TRANSACTION_injectKeyDukptWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 102);
    static final int TRANSACTION_getKeyCheckValueWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 103);
    static final int TRANSACTION_deleteKeyWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 104);
    static final int TRANSACTION_dataEncryptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 105);
    static final int TRANSACTION_dataDecryptEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 106);
    static final int TRANSACTION_queryKeyMappingRecordListWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 107);
    static final int TRANSACTION_genTR34CredTokenWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 108);
    static final int TRANSACTION_genTR34RandomTokenWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 109);
    static final int TRANSACTION_validateTR34CredTokenWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 110);
    static final int TRANSACTION_validateTR34KeyTokenWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 111);
    static final int TRANSACTION_validateTR34UNBTokenWL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 112);
    static final int TRANSACTION_queryKeyMappingRecordList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 113);
    static final int TRANSACTION_readSM2Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 114);
    static final int TRANSACTION_calcSM3HashWithID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 115);
    static final int TRANSACTION_sm2SingleSign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 116);
    static final int TRANSACTION_injectTR31Key = (android.os.IBinder.FIRST_CALL_TRANSACTION + 117);
    static final int TRANSACTION_hsmExchangeKeyEccEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 118);
    public static boolean setDefaultImpl(com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
         * 存储基础密钥
         * @param destinationIndex 需要保存的密钥索引，[1,200]
         * @param keyData 密钥数据密文 256位
         * @return 0：成功，其他：错误码
         */
  public int saveBaseKey(int destinationIndex, byte[] keyData) throws android.os.RemoteException;
  /**
        * 保存明文密钥
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
        * @param keyIndex 密钥保存的位置索引
        * @return 0：成功，非0：错误码
        */
  public int savePlaintextKey(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException;
  /**
        * 保存密文密钥
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param encryptIndex 对密钥进行加密的密钥索引
        * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
        * @param keyIndex 密钥保存的位置索引
        * @return 0：成功，非0：错误码
        */
  public int saveCiphertextKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex) throws android.os.RemoteException;
  /**
        * 实现数据MAC计算或校验
        * @param keyIndex :MAC索引
        * @param macAlgType ：MAC加密算法
        * @param dataIn  用于进行MAC计算的源数据
        * @param dataOut 计算生成的MAC值
        * @return 0：成功，<0：错误码
        */
  public int calcMac(int keyIndex, int macAlgType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 加密数据
        * @param keyIndex 加密密钥索引
        * @param dataIn  用于进行加密计算的源数据
        * @param encryptionMode 加密模式
        * @param iv 初始向量 DES 算法8字节
        * @param dataOut 计算生成的密文
        * @return 0：成功，非0：错误码
        */
  public int dataEncrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 解密数据
        * @param keyIndex 如果是保留区密钥，制定保留区的密钥索引
        * @param dataIn 输入数据，待解密的数据
        * @param encryptionMode 加密模式
        * @param iv 初始向量
        * @param dataOut 输出数据,解密后的数据
        * @return 0：成功，其他：错误码
        */
  public int dataDecrypt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存明文DUKPT密钥
        * @param   keyType  BDK-基础分散密钥
        *                   IPEK-初始PIN加密密钥
        * @param   keyValue 密钥数据
        * @param   checkValue 密钥校验值
        * @param   ksn
        * @param   encryptType  密钥算法
        * @param   keyIndex 保存的索引 (范围为0-9)
        * @param   bool isEncrypt 是否密文
        * @return  0：成功，<0：错误码
        */
  public int saveKeyDukpt(int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException;
  /**
        * DUKPT密钥计算mac
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   macType  mac算法
        * @param   dataIn   待计算的mac数据
        * @param   dataOut  mac 结果
        * @return  0：成功，<0：错误码
        */
  public int calcMacDukpt(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥加密数据
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   dataIn   待加密数据
        * @param   dataOut  加密结果
        * @return  0：成功，<0：错误码
        */
  public int dataEncryptDukpt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥解密数据
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   dataIn   待解密数据
        * @param   dataOut  加密结果
        * @return  0：成功，<0：错误码
        */
  public int dataDecryptDukpt(int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * Dukpt KSN 自增1
        * @param   keyIndex 密钥索引(范围为0-9)
        * @return  0：成功，<0：错误码
        */
  public int dukptIncreaseKSN(int keyIndex) throws android.os.RemoteException;
  /**
        * Dukpt获取当前KSN
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   outKSN 10字节 KSN
        * @return  0：成功，<0：错误码
        */
  public int dukptCurrentKSN(int keyIndex, byte[] outKSN) throws android.os.RemoteException;
  /**
        * 获取已保存密钥 checkValue
        * @param   keyIndex 密钥索引(范围为0-9)
        * @param   dataOut 4字节 checkValue
        * @return  0：成功，<0：错误码
        */
  public int getKeyCheckValue(int keySystem, int keyIndex, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取密文硬件序列号
        * 获取已保存密钥 checkValue
        * @param   dataIn 加密随机因子（银行卡为卡号后六位，扫码类为码的后六位）
        * @param   dataOut 固定传4个字节
        * @return  0：成功，<0：错误码
        */
  public int getTUSNEncryptData(java.lang.String dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存SM4密钥
        * @param dataIn 密钥数据
        * @return 0：成功，其他：错误码
        */
  public int storeSM4Key(byte[] dataIn) throws android.os.RemoteException;
  /**
        * 使用保存的SM4密钥加密
        * @param dataIn  用于进行加密计算的源数据
        * @param dataOut 计算生成的密文
        * @return 0：成功，其他：错误码
        */
  public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取安全状态
        * @return 0：成功，其他：错误码
        */
  public int getSecStatus() throws android.os.RemoteException;
  /**
        * 验证apk签名
        * @param hashMessage  哈希值
        * @param signData 私钥加密的哈希值
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int verifyApkSign(byte[] hashMessage, byte[] signData) throws android.os.RemoteException;
  /**
        * 读取授权状态
        * @param type  授权类型
        * @return 0：成功，其他：错误码
        */
  public java.lang.String getAuthStatus(int type) throws android.os.RemoteException;
  /**
        * 获取终端状态 “Factory”,“Release”
        * @return null：出错，“Factory”：工厂模式，“Release”：Release模式
        */
  public java.lang.String getTermStatus() throws android.os.RemoteException;
  /**
        * 将终端状态设置为 “Release”
        * @return 0：成功，其他：错误码
        */
  public int setTermStatus() throws android.os.RemoteException;
  /**
        * 请求授权
        * @param reqType  授权类型
        * @param authCode 授权码
        * @param SN       字符串，设备SN
        * @param authData 输出授权数据，256字节
        * @return 0：成功，其他：错误码
        */
  public int sysRequestAuth(byte reqType, int authCode, java.lang.String SN, byte[] authData) throws android.os.RemoteException;
  /*
        * 确认授权
        * @param dataIn 授权数据，512字节
        * @return 0：成功，其他：错误码
        */
  public int sysConfirmAuth(byte[] dataIn) throws android.os.RemoteException;
  /**
        * 存储终端认证密钥
        * @param dataInPuk 终端认证公钥及签名 512位
        * @param dataInPvk 终端认证私钥 251位
        * @return 0：成功，其他：错误码
        */
  public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws android.os.RemoteException;
  /**
        * 获取终端认证公钥及签名
        * @param dataOut 输出数据，512字节
        * @return 0：成功，其他：错误码
        */
  public int readTerminalPuk(byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取终端认证数据
        * @param dataIn 输入数据，256字节
        * @param dataOut 输出数据，256字节
        * @return 0：成功，其他：错误码
        */
  public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 生成RSA公私钥
        * @param pubKeyIndex 公钥保存的位置索引
        * @param pvtkeyIndex 私钥保存的位置索引
        * @param keysize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
        * @param pubExponent 指数(Hex格式)
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int generateRSAKeys(int pubKeyIndex, int pvtKeyIndex, int keysize, java.lang.String pubExponent) throws android.os.RemoteException;
  /**
        * 获取RSA公钥
        * @param pubKeyIndex 公钥保存的位置索引
        * @param outData 公钥数据(X509编码格式)
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        * @deprecated
        */
  public int getRSAPublicKey(int pubKeyIndex, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 获取RSA私钥
        * @param pubKeyIndex 私钥保存的位置索引
        * @param outData 私钥数据(PKCS8编码格式)
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        * @deprecated
        */
  public int getRSAPrivateKey(int pvtKeyIndex, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 用RSA算法加密数据
        * @param transformation 模式
        * @param keyIndex RSA公钥/私钥索引
        * @param dataIn 待加密的数据
        * @param dataOut 加密后的数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        * @deprecated
        */
  public int dataEncryptRSA(java.lang.String transformation, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 用RSA算法解密数据
        * @param transformation 模式
        * @param keyIndex RSA私钥/公钥索引
        * @param dataIn 待解密的数据
        * @param dataOut 解密后的数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        * @deprecated
        */
  public int dataDecryptRSA(java.lang.String transformation, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 移除RSA密钥
        * @param keyIndex RSA私钥/公钥索引
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int removeRSAKey(int keyIndex) throws android.os.RemoteException;
  /**
        * 保存证书
        * @param certIndex 证书保存的索引
        * @param certData 证书数据
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int storeCertificate(int certIndex, byte[] certData) throws android.os.RemoteException;
  /**
        * 获取保存的证书
        * @param certIndex 证书保存的索引
        * @param dataOut 出参buffer，存放证书数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        * @deprecated
        */
  public int getCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException;
  /**
        * Dukpt获取初始化KSN
        * @param outKSN 10字节 KSN
        * @return >=0：outKSN中有效数据的长度，<0：错误码
        */
  public int dukptGetInitKSN(byte[] outKSN) throws android.os.RemoteException;
  /**
        * RSA算法签名数据
        * @param signAlg 签名算法
        * @param pvtKeyIndex RSA私钥索引
        * @param dataIn 待签名的数据
        * @param dataOut buffer，存放签名后的数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        * @deprecated
        */
  public int signingRSA(java.lang.String signAlg, int pvtKeyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * RSA算法验签
        * @param signAlg 签名算法
        * @param pubKey RSA公钥(X509编码格式)
        * @param srcData 签名前的数据(原始数据)
        * @param signature 签名数据
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int verifySignatureRSA(java.lang.String signAlg, byte[] pubKey, byte[] srcData, byte[] signature) throws android.os.RemoteException;
  /**
        * 注入明文密钥
        * @param targetPkgName 目标APP的包名
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
        * @param keyIndex 密钥保存的位置索引
        * @return 0：成功，非0：错误码
        */
  public int injectPlaintextKey(java.lang.String targetPkgName, int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException;
  /**
        * 注入密文密钥
        * @param targetPkgName 目标APP的包名
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param encryptIndex 对密钥进行加密的密钥索引
        * @param keyAlgType 加密类型,1：3Des 2：AES 3：SM4
        * @param keyIndex 密钥保存的位置索引
        * @return 0：成功，非0：错误码
        */
  public int injectCiphertextKey(java.lang.String targetPkgName, int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int keyAlgType, int keyIndex) throws android.os.RemoteException;
  /**
        * DUKPT密钥加密
        * @param keySelect 密钥选择
        * @param keyIndex 密钥索引(范围为0-9)
        * @param dataIn   待加密数据
        * @param encryptionMode 工作模式
        * @param iv 初始化向量
        * @param dataOut  加密结果
        * @return 0：成功，<0：错误码
        */
  public int dataEncryptDukptEx(int keySelect, int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥解密
        * @param keySelect 密钥选择
        * @param keyIndex 密钥索引(范围为0-9)
        * @param dataIn   待加密数据
        * @param encryptionMode 工作模式
        * @param iv 初始化向量
        * @param dataOut 加密结果
        * @return 0：成功，<0：错误码
        */
  public int dataDecryptDukptEx(int keySelect, int keyIndex, byte[] dataIn, int encryptionMode, byte[] iv, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥计算mac
        * @param keySelect 密钥选择
        * @param keyIndex 密钥索引(范围为0-9)
        * @param macType  mac算法
        * @param dataIn   待计算的mac数据
        * @param dataOut  mac 结果
        * @return 0：成功，<0：错误码
        */
  public int calcMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * DUKPT密钥校验MAC
        * @param keySelect 密钥选择
        * @param keyIndex 密钥索引(范围为0-9)
        * @param macType  mac算法
        * @param dataIn   待计算的mac数据
        * @param dataOut  mac 结果
        * @return 0：成功，<0：错误码
        */
  public int verifyMacDukptEx(int keySelect, int keyIndex, int macType, byte[] dataIn, byte[] macData) throws android.os.RemoteException;
  /**
        * 保存TR31密钥
        * @param keyValue  TR31密钥数据
        * @param kbpkIndex KBPK索引
        * @param keyIndex 密钥索引(范围为0-9)
        * @return 0：成功，<0：错误码
        */
  public int saveTR31Key(byte[] keyValue, int kbpkIndex, int keyIndex) throws android.os.RemoteException;
  /**
        * 保存密文密钥（解密密钥为RSA私钥）
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
        * @param keyIndex 密钥保存的位置索引
        * @param encryptIndexRSA RSA私钥索引
        * @param transformation
        * @return 0：成功，非0：错误码
        * @deprecated
        */
  public int saveCiphertextKeyRSA(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex, int encryptIndexRSA, java.lang.String transformation) throws android.os.RemoteException;
  /**
        * 保存RSA密钥
        * @param keyType  密钥类型,0-公钥,1-私钥
        * @param keyValue 密钥数据,keyType为0(公钥),则为ANS.1 X509标准编码格式,keyType为1(私钥),则为ANS.1 PKCS#8标准编码格式
        * @param keyIndex 密钥保存的位置索引
        * @return 0：成功，其他：错误码
        * @deprecated
        */
  public int saveRSAKey(int keyType, byte[] keyValue, int keyIndex) throws android.os.RemoteException;
  /**
        * 删除密钥
        * @param   keySystem 密钥体系
        * @param   keyIndex 密钥索引
        * @return  0：成功，<0：错误码
        */
  public int deleteKey(int keySystem, int keyIndex) throws android.os.RemoteException;
  /**
        * 保存DUKPT-AES密钥
        * @param dukptKeyType AES密钥加密类型(AES128/192/256)
        * @param keyType BDK-基础分散密钥
        *                IPEK-初始PIN加密密钥
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param ksn
        * @param encryptType  密钥算法
        * @param keyIndex 保存的索引(范围为10~19)
        * @return 0：成功，<0：错误码
        */
  public int saveKeyDukptAES(int dukptKeyType, int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException;
  /**
        * 计算MAC（扩展）
        * @param keyIndex MAC密钥索引
        * @param keyLen 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
        * @param macAlgType MAC加密算法
        * @param diversify 分散因子（值为null，暂不支持）
        * @param dataIn  用于进行MAC计算的源数据
        * @param dataOut 计算生成的MAC值
         * @return 0：成功，<0：错误码
        */
  public int calcMacEx(int keyIndex, int keyLen, int macAlgType, byte[] diversify, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 生成SM2公私钥对
        * @param pvkIndex 私钥索引，范围0~9
        * @param pubKey 公钥数据，包含key：
        * data：密钥数据（类型：byte[]，长度：64字节）
        * kcv：密钥check value（类型：byte[]，长度：5字节）
        * rfu: RFU数据（类型：byte[]，长度：10字节）
        * @return 0：成功，其他：错误码
        */
  public int generateSM2Keypair(int pvkIndex, android.os.Bundle pubKey) throws android.os.RemoteException;
  /**
        * 注入SM2密钥
        * @param keyIndex 密钥索引，范围0~9
        * @param keyData 密钥数据，包含key：
        * data：密钥数据（类型：byte[]，长度：公钥64字节，私钥32字节）
        * kcv：密钥check value（类型：byte[]，长度：5字节）
        * rfu: RFU数据（类型：byte[]，长度：10字节）
        * @return 0：成功，其他：错误码
        */
  public int injectSM2Key(int keyIndex, android.os.Bundle keyData) throws android.os.RemoteException;
  /**
        * SM2签名
        * @param pukIndex 公钥索引，范围0~9
        * @param pvkIndex 私钥索引，范围0~9
        * @param userId 签名者ID，小于512字节，国密推荐默认值为0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38,0x31,0x32,0x33,0x34,0x35,0x36,0x37,0x38
        * @param dataIn 待签名的数据，长度小于2048字节
        * @param dataOut 签名数据，定长64字节
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int sm2Sign(int pukIndex, int pvkIndex, byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM2验签
        * @param pukIndex 公钥索引，范围0~9
        * @param userId 签名者ID
        * @param dataIn 待验签的数据，长度小于2048字节
        * @param signData 签名数据，定长64字节
        * @return 0：成功，其他：错误码
        */
  public int sm2VerifySign(int pukIndex, byte[] userId, byte[] dataIn, byte[] signData) throws android.os.RemoteException;
  /**
        * SM2公钥加密数据
        * @param pukIndex 公钥索引，范围0~9
        * @param dataIn 待加密的数据，长度小于896字节
        * @param dataOut 加密后的数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int sm2EncryptData(int pukIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * SM2私钥解密数据
        * @param pvkIndex 私钥索引，范围0~9
        * @param dataIn 待解密的数据，长度小于896字节
        * @param dataOut 解密后的数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int sm2DecryptData(int pvkIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 计算数据摘要
        * @param mode 摘要模式
        * @param dataIn 待计算的数据，长度小于1920字节
        * @param dataOut 计算后的数据摘要
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int calcSecHash(int mode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 校验MAC
        * @param keyIndex MAC密钥索引
        * @param macAlgType Mac算法类型
        * @param dataIn  待验证数据
        * @param mac  mac数据
        * @return 0：成功，<0：错误码
        */
  public int verifyMac(int keyIndex, int macAlgType, byte[] dataIn, byte[] mac) throws android.os.RemoteException;
  /**
        * 生成RSA公私钥对（仅支持1024/2048位密钥）
        * @param pvkIndex 私钥索引，范围：0~19
        * @param keySize 密钥长度，支持1024/2048位密钥
        * @param pubExponent 公钥指数，Hex格式，支持03/010001
        * @param dataOut Buffer，存放公钥模
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int generateRSAKeypair(int pvkIndex, int keySize, java.lang.String pubExponent, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 注入RSA密钥（仅支持1024/2048位密钥）
        * @param KeyIndex  密钥索引，范围：0~19
        * @param keySize 密钥长度，支持1024/2048为密钥
        * @param module 密钥模，Hex格式
        * @param exponent：指数，Hex格式，支持03/010001
        * @return 0：成功，<0：错误码
        */
  public int injectRSAKey(int keyIndex, int keySize, java.lang.String module, java.lang.String exponent) throws android.os.RemoteException;
  /**
        * 随机生成对称密钥(MKSK密钥)
        * @param keyIndex 密钥索引
        * @param keyType 密钥用途
        * @param keyAlgType 密钥算法
        * @return 0：成功， <0：错误
        */
  public int generateSymKey(int keyIndex, int keyType, int keyAlgType) throws android.os.RemoteException;
  /**
        * 注入对称密钥(MKSK密钥)
        * @param keyIndex 密钥索引
        * @param keyType 密钥用途
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param keyAlgType 密钥算法
        * @return 0：成功， <0：错误
        */
  public int injectSymKey(int keyIndex, int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType) throws android.os.RemoteException;
  /**
        * 保存明文密钥
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param keyAlgType 密钥算法类型,1：3Des 2：AES
        * @param keyIndex 密钥保存的位置索引
        * @return 0：成功，非0：错误码
        */
  public int hsmSaveKeyShare(int keyType, byte[] keyValue, byte[] checkValue, int keyAlgType, int keyIndex) throws android.os.RemoteException;
  /**
        * 保存DUKPT密钥
        * @param dukptKeyType 密钥加密类型(TDES128/TDES192/AES128/AES192/AES256)
        * @param keyType BDK-基础分散密钥
        *                IPEK-初始PIN加密密钥
        * @param keyValue 密钥数据
        * @param checkValue 密钥校验值
        * @param ksn
        * @param encryptType  密钥算法
        * @param keyIndex 保存的索引(范围为10~19)
        * @return 0：成功，<0：错误码
        */
  public int hsmSaveKeyShareDukpt(int dukptKeyType, int keyType, byte[] keyValue, byte[] checkValue, byte[] ksn, int encryptType, int keyIndex) throws android.os.RemoteException;
  /**
        * 密钥分量合成密钥
        * @param keyType  密钥类型：密钥类型：KEK TMK PIK TDK MAK BDK IPEK
        * @param keyValue 密钥算法：AES 3DES
        * @param keyIndex 密钥索引
        * @param keyShareIndex1  密钥分量1索引
        * @param keyShareIndex2  密钥分量2索引
        * @param keyShareIndex3  密钥分量3索引
        * @param dataOut  KCV
        * @return 0：成功，<0：错误码
        */
  public int hsmCombineKeyShare(int keyType, int keyAlgType, int keyIndex, int keyShareIndex1, int keyShareIndex2, int keyShareIndex3, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 生成RSA公私钥对（仅支持1024/2048位密钥）
        * @param pvtKeyIndex  私钥索引，范围：0~19
        * @param keySize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
        * @param pubExponent 密钥指数，Hex字符串，可为03/010001
        * @param dataOut  Buffer，存放公钥模
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int hsmGenerateRSAKeypair(int pvtKeyIndex, int keySize, java.lang.String pubExponent, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 注入RSA公私钥对（仅支持1024/2048位密钥）
        * @param keyIndex  密钥索引，范围：0~19
        * @param keySize 密钥的长度(512~65536,单位:bit,必须为64的倍数，一般为512、1024等)
        * @param module 密钥模
        * @param exponent  密钥指数
        * @return 0：成功，<0：错误码
        */
  public int hsmInjectRSAKey(int keyIndex, int keySize, java.lang.String module, java.lang.String exponent) throws android.os.RemoteException;
  /**
        * 保存密文KEK
        * @param keyIndex 密钥索引
        * @param keyValue 密文KEK密钥值
        * @param keyType 密钥类型：KEK TMK PIK TDK MAK REV
        * @param keyAlgType 密钥算法
        * @param encryptKeySystem 解密密钥的密钥体系：RSA/MKSK
        * @param encryptIndex KEK解密索引
        * @return 0：成功，<0：错误码
        */
  public int hsmSaveKeyUnderKEK(int keyIndex, byte[] keyValue, int keyType, int keyAlgType, int encryptKeySystem, int encryptIndex) throws android.os.RemoteException;
  /**
       * 导出密钥密文
       * @param keyIndex 密钥索引
       * @param kekIndex KEK索引
       * @param kekKeySystem KEK密钥体系：RSA/MKSK
       * @param dataOut  密钥密文
       * @return >=0：dataOut中有效数据的长度，<0：错误码
       */
  public int hsmExportKeyUnderKEK(int keyIndex, int kekIndex, int kekKeySystem, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 导出TR31格式的密钥块
        * @param keyIndex 密钥索引
        * @param encryptIndex 保护密钥索引
        * @param inLen 输入数据的长度
        * @param dataIn 输入数据，如KSN
        * @param dataOut 输出的密钥块
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int hsmExportTR31KeyBlock(int keyIndex, int encryptIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 销毁指定索引的密钥
       * @param keyIndex 密钥索引
       * @return 0：成功， <0：错误
       */
  public int hsmDestroyKey(int keyIndex) throws android.os.RemoteException;
  /**
       * 随机注入或生成密钥
       * @param mode 注入或生成
       * @param curveParam 曲线参数
       * @param keyIndex 密钥索引
       * @param keyType 密钥用途
       * @param keyAlgType 密钥算法
       * @param pubKeyA 密钥数据
       * @param checkValue KCV
       * @param pubKeyB 出参，生成的密钥数据
       * @return 0：成功，<0：错误码
       */
  public int hsmExchangeKeyEcc(int mode, java.lang.String curveParam, int keyIndex, int keyType, int keyAlgType, byte[] pubKeyA, byte[] checkValue, byte[] pubKeyB) throws android.os.RemoteException;
  /**
       * 非对称密钥算法
       * @param mode 算法模式，0-签名(私钥)和验签(公钥)，1-解密(私钥)和加密(公钥)
       * @param keySystem 密钥体系
       * @param keyIndex 密钥索引
       * @param dataIn  待运算的数据
       * @param dataOut 运算后的数据
       * @return >=0：dataOut中有效数据的长度， <0：错误
       */
  public int hsmAsymKeyFun(int mode, int keySystem, int keyIndex, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 敏感服务相关操作，包括密码管理、敏感服务状态查询
       * @param mode 模式
       * @param pinPadParam 键盘参数，260字节
       * @return 0-成功， <0：错误
       */
  public int operateSensitiveService(int mode, byte[] pinPadParam) throws android.os.RemoteException;
  /**
        * RSA公钥加密或私钥解密
        * @param keyIndex 密钥索引，范围：0~39
        * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
        * @param dataIn 待加密/解密数据，长度小于896字节
        * @param dataOut 加解密结果数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int rsaEncryptOrDecryptData(int keyIndex, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存设备证书与密文私钥
        * @param certIndex 证书索引，范围9001-9008
        * @param mode 模式，4-ECB模式，注入私钥密文使用
        * @param encryptIndex 对密文私钥进行解密的密钥索引
        * @param certData 设备证书数据
        * @param pvkData 私钥密文数据
        * @return 0：成功，其他：错误码
        */
  public int storeDeviceCertPrivateKey(int certIndex, int mode, int encryptIndex, byte[] certData, byte[] pvkData) throws android.os.RemoteException;
  /**
        * 获取保存的设备证书
        * @param certIndex 证书索引，范围9001-9008
        * @param dataOut 出参buffer，存放证书数据
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int getDeviceCertificate(int certIndex, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 设备证书对应的私钥运算
        * @param keyIndex 证书索引，范围：9001-9008
        * @param mode 加解密类型-专用于sm2私钥(rsa和ecc类型私钥，不识别这个参数）
        * @param padding 填充模式，0-NoPadding，1-PKCS1Padding，2-PKCS7Padding
        * @param dataIn 待加密/解密数据，长度小于896字节
        * @param dataOut 加解密结果数据
        * @return >=0：dataOut中有效数据的长度，<0:错误码
        */
  public int devicePrivateKeyRecover(int keyIndex, int mode, int padding, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 获取已保存密钥 checkValue (扩展)
       * @param bundle 入参，包含如下key：
       * keySystem 密钥体系(int)
       * keyIndex 密钥索引(范围为0-9)(int)
       * kcvMode kcv模式(int)
       * targetAppPkgName 目标应用包名(String)
       * @param dataOut 4字节 checkValue
       * @return 0：成功，<0：错误码
       */
  public int getKeyCheckValueEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 删除密钥(扩展)
       * @param bundle 入参，包含如下key：
       * keySystem 密钥体系
       * keyIndex 密钥索引
       * targetAppPkgName 目标应用包名(String)
       * @return  0：成功，<0：错误码
       */
  public int deleteKeyEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 注入密文密钥(扩展)
       * @param bundle 入参，包含如下key：
       * targetAppPkgName 目标应用包名(String)
       * keyType 密钥类型：KEK TMK PIK TDK MAK REV(int)
       * keyValue 密钥数据(byte[])
       * kcvMode kcv模式(int)
       * kcvMacType kcvMac算法类型(int)
       * kcvInData 用于计算kcv的数据(byte[])
       * checkValue 密钥校验值(byte[])
       * encryptIndex 对密钥进行加密的密钥索引(int)
       * keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4(int)
       * keyIndex 密钥保存的位置索引(int)
       * keyLength 密钥长度（明文）(int)
       * dataMode 数据模式(int, ECB/CBCOFB/CFB)
       * iv 初始向量(byte[])
       * @return  0：成功，<0：错误码
       */
  public int injectCiphertextKeyEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 保存DUKPT密钥(扩展)
       * @param bundle 入参，包含如下key：
       * targetAppPkgName 目标应用包名(String)
       * keyValue 密钥数据(byte[])
       * kcvMode kcv模式(int)
       * kcvMacType kcvMac算法类型(int)
       * kcvInData 用于计算kcv的数据(byte[])
       * checkValue 密钥校验值(byte[])
       * ksn 密钥序列号(byte[])
       * encryptIndex 对密钥进行加密的密钥索引(int)
       * keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4(int)
       * keyIndex 密钥保存的位置索引(int)
       * isEncrypt 是否密文(bool)
       * keyLength 密钥长度（明文）(int)
       * dataMode 数据模式(int, ECB/CBCOFB/CFB)
       * iv 初始向量(byte[])
       * @return  0：成功，<0：错误码
       */
  public int injectKeyDukptEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 保存MKSK密钥
       * @param bundle 密钥信息，包含如下key：
       * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REC
       * keyValue 密钥数据(byte[])
       * kcvMode kcv模式(int)
       * kcvMacType kcvMac算法类型(int)
       * kcvInData 用于计算kcv的数据(byte[])
       * checkValue 密钥校验值(byte[])
       * encryptIndex 对密钥进行加密的密钥索引(int)
       * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
       * keyIndex 密钥保存的位置索引(int)
       * isEncrypt 是否密文(bool)
       * variantUsage 扩展变量的用法(int)
       * keyVariant 扩展变量(byte[])
       * dataMode 数据模式(int, ECB/CBCOFB/CFB)
       * iv 初始向量(byte[])
       * @return 0：成功，非0：错误码
       */
  public int saveKeyEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 计算mac（扩展）
       * @param bundle 入参，包含如下key：
       * keyIndex mac密钥索引(int)
       * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLength字节(int)
       * macType mac算法(int)
       * diversify 分散因子（值为null，暂不支持）(byte[])
       * dataIn 用于进行mac计算的源数据(byte[])
       * iv 初始化向量(byte[])
       * @param dataOut 计算生成的mac值(byte[])
       * @return 0：成功，<0：错误码
       */
  public int calcMacExtended(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
       * dukpt密钥计算MAC(扩展)
       * @param bundle 入参，包含如下key：
       * keySelect 密钥选择(int)
       * keyIndex 密钥索引(范围为：3DES：0-9,1100-1199,AES:10-19,2100-2199)
       * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLength字节(int)
       * macType mac算法(int)
       * dataIn 用于进行mac计算的源数据(byte[])
       * iv 初始化向量(byte[])
       * @param dataOut 计算生成的mac值(byte[])
       * @return 0：成功，<0：错误码
       */
  public int calcMacDukptExtended(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 读取RSA密钥信息
       * @param keyIndex 密钥索引，范围：0~19
       * @param keyInfo 出参，包含如下key：
       * modulus：模(byte[])
       * exponent：指数(byte[])
       * @return 0：成功，<0：错误码
       */
  public int readRSAKey(int keyIndex, android.os.Bundle keyInfo) throws android.os.RemoteException;
  /**
       * 获取密钥长度
       * @param keySystem 密钥体系
       * @param keyIndex 密钥索引
       * @return >=0：密钥长度，<0：错误码
       */
  public int getKeyLength(int keySystem, int keyIndex) throws android.os.RemoteException;
  /**
       * 保存可变密钥
       * @param bundle 密钥信息，包含如下key：
       * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REC
       * kcvMode kcv模式(int)
       * kcvMacType kcvMac算法类型(int)
       * kcvInData 用于计算kcv的数据
       * checkValue 密钥校验值(byte[])
       * keyAlgType 加密类型(int)：1-3Des, 2-AES, 3-SM4
       * srcKeyIndex 源密钥索引(int)
       * destKeyIndex 目标密钥索引(int)
       * xorData 异或数据(byte[])
       * @return 0：成功，非0：错误码
       */
  public int writeKeyVariable(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 密钥杂项操作函数
       * @param keyIndex 密钥索引
       * @param ctrCode 密钥操作类型
       * @param dataIn 输入数据
       * @param dataOut 输出数据
       * @return >=0：dataOut中有效数据的长度， <0：错误
       */
  public int secKeyIoControl(int keyIndex, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 计算APACS MAC
       * @param initMakIndex 初始Mac密钥索引
       * @param makIndex 派生Mac密钥索引
       * @param pikIndex 派生PIN密钥索引
       * @param ctrCode 密钥操作类型
       * @param dataIn 输入数据
       * @param dataOut 输出数据
       * @return >=0：dataOut中有效数据的长度， <0：错误
       */
  public int apacsMac(int initMakIndex, int makIndex, int pikIndex, int ctrCode, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
       * 保存密文密钥，解密密钥为KEK
       * @param bundle 密钥信息，包含如下key：
       * keyIndex KEK索引(int)
       * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
       * keyValue 密文KEK密钥值(byte[])
       * keyAlgType 密钥算法(int)
       * encryptionMode 工作模式(int)
       * paddingMode 填充模式(int)
       * keySystem 密钥体系(int)
       * encryptKeySystem 解密密钥的密钥体系(int)：RSA/MKSK
       * encryptIndex KEK解密索引(int)
       * @return 0：成功，<0：错误码
       */
  public int hsmSaveKeyUnderKEKEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 导出密钥密文
       * @param bundle 密钥信息，包含如下key：
       * keySystem 密钥体系(int)
       * keyIndex 密钥索引(int)
       * kekKeySystem KEK密钥体系(int)：RSA/MKSK
       * kekIndex KEK索引(int)
       * paddingMode 填充模式(int)
       * @param dataOut  密钥密文
       * @return >=0：dataOut中有效数据的长度，<0：错误码
       */
  public int hsmExportKeyUnderKEKEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
       * OAEP模式注入
       * @param keyIndex   密钥索引
       * @param dependIndex  加密密钥索引
       * @param keyType    密钥类型
       * @param keyAlgType 密钥算法类型
       * @param checkValue 密钥KCV
       * @param keyData    密文
       * @return 0-成功，<0-错误码
       */
  public int hsmGenerateKeyByOaep(int keyIndex, int dependIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException;
  /**
       * 保存MKSK密文密钥，解密密钥为RSA私钥
       * @param keyIndex 密钥保存的位置索引
       * @param rsaKeyIndex RSA私钥索引，，范围：0~39
       * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
       * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
       * @param checkValue 密钥校验值
       * @param keyData RSA加密后密钥数据
       * @return 0-成功，<0-错误码
       */
  public int saveCiphertextKeyUnderRSA(int keyIndex, int rsaKeyIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException;
  /**
       * 注入MKSK密文密钥，解密密钥为RSA私钥
       * @param targetPkgName 目标APP的包名
       * @param keyIndex 密钥保存的位置索引
       * @param rsaKeyIndex RSA私钥索引，，范围：0~39
       * @param keyType 密钥类型：KEK TMK PIK TDK MAK REC
       * @param keyAlgType 密钥算法类型,1：3Des 2：AES 3：SM4
       * @param checkValue 密钥校验值
       * @param keyData RSA加密后密钥数据
       * @return 0-成功，<0-错误码
       */
  public int injectCiphertextKeyUnderRSA(java.lang.String targetPkgName, int keyIndex, int rsaKeyIndex, int keyType, int keyAlgType, byte[] checkValue, byte[] keyData) throws android.os.RemoteException;
  /**
        * 随机生成对称密钥(MKSK密钥)
        * @param bundle 密钥信息，包含如下key：
        * keyIndex 密钥索引(int)
        * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
        * keyAlgType 密钥算法类型(int)
        * keyLength 密钥长度(int, 3DES-16/24字节, AES-16/24/32字节)
        * @return 0-成功，<0-错误码
        */
  public int generateSymKeyEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 注入对称密钥(MKSK密钥)
        * @param bundle 密钥信息，包含如下key：
        * keyIndex 密钥索引(int)
        * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
        * keyValue 密钥数据(byte[])
        * checkValue 密钥校验值(byte[])
        * keyAlgType 密钥算法类型(int)
        * keyLength 密钥长度(int，3DES-16/24字节，AES-16/24/32字节)
        * encryptIndex1 依赖的解密密钥索引1(int)
        * encryptIndex2 依赖的解密密钥索引2(int，GOWF算法需要依赖两个解密密钥)
        * dataMode 数据模式(int, ECB/CBCOFB/CFB)
        * iv 初始向量(byte[])
        * injectMode 注入模式(int，0x80-OWF2算法类型派生并保存密钥，0x81-OWF3算法类型派生并保存密钥，0x82-0x82 GOWF算法类型派生并保存密钥)
        * @return 0：成功， <0：错误
        */
  public int injectSymKeyEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 注入设备证书与密文私钥
        * @param bundle 密钥信息，包含如下key：
        * targetAppPkgName 目标应用包名(String)
        * certIndex 证书索引(int)，范围9001-9008
        * mode 模式(int)，4-ECB模式，注入私钥密文使用
        * isEncrypt 是否密文(bool)
        * encryptIndex 对密文私钥进行解密的密钥索引(int)
        * certData 设备证书数据(byte[])
        * pvkData 私钥密文数据(byte[])
        * @return 0：成功，其他：错误码
        */
  public int injectDeviceCertPrivateKey(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 生成RSA公私钥对（仅支持1024/2048位密钥）
        * @param bundle 密钥信息，包含如下key：
        * keyType 密钥类型(int)，值为0或KEY_TYPE_RSA_KPK
        * pvkIndex 私钥索引(int)，范围：20~39
        * keySize 密钥长度(int)，支持1024/2048位密钥
        * pubExponent 公钥指数(String)，Hex格式，支持03/010001
        * @param dataOut Buffer，存放公钥模
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int generateRSAKeypairEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 注入RSA密钥（仅支持1024/2048位密钥）
        * @param bundle 密钥信息，包含如下key：
        * keyType 密钥类型(int)，值为0或KEY_TYPE_RSA_KPK
        * keyIndex  密钥索引(int)，范围：20~39
        * keySize 密钥长度(int)，支持1024/2048为密钥
        * module 密钥模(String)，Hex格式
        * exponent：指数(String)，Hex格式，支持03/010001
        * @return 0：成功，<0：错误码
        */
  public int injectRSAKeyEx(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 保存设备证书
        * @param certIndex 设备证书保存的索引，范围9001-9008
        * @param certData 证书数据
        * @return  0：成功，<0：错误码
        */
  public int setDeviceCertificate(int certIndex, byte[] certData) throws android.os.RemoteException;
  /**
        * 注入明文密钥（白名单程序专用）
        * @param bundle 密钥信息，包含如下key：
        * targetPkgName 目标APP的包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * keyType 密钥类型(int)，范围：KEK TMK PIK TDK MAK REV
        * keyValue 密钥数据(byte[])
        * kcvMode kcv模式(int)
        * kcvMacType kcvMac算法类型(int)
        * kcvInData 用于计算kcv的数据(byte[])
        * checkValue 密钥校验值(byte[])
        * keyAlgType 加密类型(int)，1-3Des 2-AES 3-SM4
        * keyIndex 密钥保存的位置索引(int)
        * @return 0：成功，非0：错误码
        */
  public int injectPlaintextKeyWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 注入密文密钥（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * keyType 密钥类型(int)：KEK TMK PIK TDK MAK REV
        * keyValue 密钥数据(byte[])
        * kcvMode kcv模式(int)
        * kcvMacType kcvMac算法类型(int)
        * kcvInData 用于计算kcv的数据(byte[])
        * checkValue 密钥校验值(byte[])
        * encryptIndex 对密钥进行加密的密钥索引(int)
        * keyAlgType 密钥算法类型(int)，1-3Des 2-AES 3-SM4
        * keyIndex 密钥保存的位置索引(int)
        * keyLength 密钥长度（明文）(int)
        * dataMode 数据模式(int)，范围：ECB/CBC/OFB/CFB
        * iv 初始向量(byte[])
        * @return  0：成功，<0：错误码
        */
  public int injectCiphertextKeyWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 保存DUKPT密钥（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * keyValue 密钥数据(byte[])
        * kcvMode kcv模式(int)
        * kcvMacType kcvMac算法类型(int)
        * kcvInData 用于计算kcv的数据(byte[])
        * checkValue 密钥校验值(byte[])
        * ksn 密钥序列号(byte[])
        * encryptIndex 对密钥进行加密的密钥索引(int)
        * keyAlgType 密钥算法类型(int)，1-3Des 2-AES 3-SM4
        * keyIndex 密钥保存的位置索引(int)
        * isEncrypt 是否密文(bool)
        * keyLength 密钥长度（明文）(int)
        * dataMode 数据模式(int)，范围：ECB/CBCOFB/CFB
        * iv 初始向量(byte[])
        * @return  0：成功，<0：错误码
        */
  public int injectKeyDukptWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 获取已保存密钥的kcv（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
        * keySystem 密钥体系(int)
        * keyIndex 密钥索引(范围为0-9)(int)
        * kcvMode kcv模式(int)
        * @param dataOut 4字节 checkValue
        * @return 0：成功，<0：错误码
        */
  public int getKeyCheckValueWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 删除密钥（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，可为null
        * keySystem 密钥体系(int)
        * keyIndex 密钥索引(int)
        * @return  0：成功，<0：错误码
        */
  public int deleteKeyWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 加密数据
        * @param bundle 入参，包含如下key：
        * keyIndex 密钥索引(int)
        * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
        * dataIn 输入数据，待加密的数据(byte[])
        * encryptionMode 工作模式(int)
        * iv 初始向量(byte[])
        * @param dataOut 计算生成的密文
        * @return 0：成功，非0：错误码
        */
  public int dataEncryptEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 解密数据
        * @param bundle 入参，包含如下key：
        * keyIndex 密钥索引(int)
        * keyLength 密钥长度，0-整个密钥，非0-密钥的前keyLen字节
        * dataIn 输入数据，待解密的数据(byte[])
        * encryptionMode 工作模式(int)
        * iv 初始向量(byte[])
        * @param dataOut 输出数据，解密后的数据
        * @return 0：成功，其他：错误码
        */
  public int dataDecryptEx(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 查询密钥映射记录列表
        * @param list 出参，每条记录包含如下key：
        * pkgName 密钥所属APP的包名(String)
        * signature 密钥所属APP的签名(String)，Hex格式
        * keySystem 密钥体系(String)，范围：SEC_MKSK,SEC_DUKPT,SEC_RSA_KEY,SEC_SM2_KEY,SEC_ECC_KEY,SEC_CERT,SEC_DEVICE_CERT,SEC_MKSK_NOLOST,SEC_RSA_KEY_NOLOST,SEC_ECC_KEY_NOLOST,SEC_CERT_NOLOST,SEC_UNKNOWN
        * keyIndexRaw 原始密钥索引(int)
        * keyIndexMapped 映射后的密钥索引(int)
        * keyType 密钥类型(String)，范围：BASE_KEY,KEK,TMK,PIK,MAK,TDK,REC,DUPKT_BDK,DUPKT_IPEK,KBPK,TADK,RSA_PUK,RSA_PVK,RSA_PUK_KPK,RSA_PVK_KPK,SM2_PUK,SM2_PVK,ECC_PUK,ECC_PVK,RSA_CERT,DEVICE_CERT_PVK,UNKNOWN
        * keyAlgType 密钥的算法类型(String)，范围：ALG_3DES,ALG_AES,ALG_SM4,ALG_UNKNOWN
        * checkValue 密钥的kcv(String)，Hex格式，kcv模式为KCV_MODE_CHK0
        * injectFlag 密钥的注入标志，范围：null,injected,occupied
        * @return 0：成功，其他：错误码
        */
  public int queryKeyMappingRecordListWL(java.util.List<android.os.Bundle> list) throws android.os.RemoteException;
  /**
        * 采用index索引下的证书构建证书令牌（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * certIndex 证书索引(int)，范围：9001-9008
        * @param dataOut 令牌数据(base64格式)，不小于3072B
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int genTR34CredTokenWL(android.os.Bundle bundle, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 构建随机数令牌（白名单程序专用）
        * @param randomSize 随机数的长度，范围：1-64
        * @param dataOut 随机数令牌(base64格式)，不小于113B
        * @return >=0：dataOut中有效数据的长度，<0：错误码
        */
  public int genTR34RandomTokenWL(int randomSize, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 校验后台证书Token，并保存后台证书（白名单程序专用）
        * @param dataIn 后台证书令牌(base64格式)
        * @return 0：成功，其他：错误码
        */
  public int validateTR34CredTokenWL(byte[] dataIn) throws android.os.RemoteException;
  /**
        * 校验后台下发的(TR34 Tow Pass) key Token，并保存Kn(要下发的对称密钥)（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * targetPkgCert 目标APP的开发者证书(String)，HEX格式，不可为null
        * depSKIndex 与加密证书中的公钥对应的私钥，用于临时加密密钥Ke的解密(int)，范围：9001－9008
        * keySystem 密钥体系(int)，kn所属密钥体系，范围：SEC_MKSK, SEC_DUKPT
        * keyType 密钥类型(int)，KEK TMK PIK TDK MAK REC
        * keyAlgType 密钥算法类型，1-3Des, 2-AES, 3-SM4
        * keyIndex 对称密钥（Kn）存放的索引(int)，算法类型：DES/AES
        * dataIn 后台下发的密钥令牌（base64格式）(byte[])
        * @return 0：成功，其他：错误码
        */
  public int validateTR34KeyTokenWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 校验解绑令牌（白名单程序专用）
        * @param bundle 入参，包含如下key：
        * certIndex 证书索引(int)，范围：9001-9008
        * dataIn 解绑令牌（base64格式）(byte[])
        * @return 0：成功，其他：错误码
        */
  public int validateTR34UNBTokenWL(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
        * 查询密钥映射记录列表
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * @param list 出参，每条记录包含如下key：
        * pkgName 密钥所属APP的包名(String)
        * signature 密钥所属APP的签名(String)，Hex格式
        * keySystem 密钥体系(String)，范围：SEC_MKSK,SEC_DUKPT,SEC_RSA_KEY,SEC_SM2_KEY,SEC_ECC_KEY,SEC_CERT,SEC_DEVICE_CERT,SEC_MKSK_NOLOST,SEC_RSA_KEY_NOLOST,SEC_ECC_KEY_NOLOST,SEC_CERT_NOLOST,SEC_UNKNOWN
        * keyIndexRaw 原始密钥索引(int)
        * keyIndexMapped 映射后的密钥索引(int)
        * keyType 密钥类型(String)，范围：BASE_KEY,KEK,TMK,PIK,MAK,TDK,REC,DUPKT_BDK,DUPKT_IPEK,KBPK,TADK,RSA_PUK,RSA_PVK,RSA_PUK_KPK,RSA_PVK_KPK,SM2_PUK,SM2_PVK,ECC_PUK,ECC_PVK,RSA_CERT,DEVICE_CERT_PVK,UNKNOWN
        * keyAlgType 密钥的算法类型(String)，范围：ALG_3DES,ALG_AES,ALG_SM4,ALG_UNKNOWN
        * checkValue 密钥的kcv(String)，Hex格式，kcv模式为KCV_MODE_CHK0
        * injectFlag 密钥的注入标志，范围：null,injected,occupied
        * @return 0：成功，其他：错误码
        */
  public int queryKeyMappingRecordList(android.os.Bundle bundle, java.util.List<android.os.Bundle> list) throws android.os.RemoteException;
  /**
        * 读取SM2公钥信息
        * @param keyIndex 公钥索引，范围：0~9
        * @param keyInfo 出参，包含如下key：
        * keyData：密钥数据（类型：byte[]，长度：64字节）
        * @return 0：成功，<0：错误码
        */
  public int readSM2Key(int keyIndex, android.os.Bundle keyInfo) throws android.os.RemoteException;
  /**
        * 加入Z(ID)值计算SM3哈希值
        * @param keyIndex SM2公钥索引，范围：0~9
        * @param userId userId
        * @param dataIn 输入数据，长度<=896
        * @param dataOut buffer，存放hash数据(32B)
        * @return >=0：dataOut中有效数据的长度，<0：错误
        */
  public int calcSM3HashWithID(int keyIndex, byte[] userId, byte[] dataIn, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 基于Z(ID)的SM3哈希值计算SM2签名
        * @param keyIndex SM2私钥索引，范围：0~9
        * @param hash SM3哈希值，填calcSM3HashWithID()接口的计算结果(32B)
        * @param dataOut buffer，存放Sm2签名数据(64B)
        * @return >=0：dataOut中有效数据的长度，<0：错误
        */
  public int sm2SingleSign(int keyIndex, byte[] hash, byte[] dataOut) throws android.os.RemoteException;
  /**
        * 保存TR31密钥
        * @param bundle 入参，包含如下key：
        * targetPkgName 目标应用包名(String)，不可为null
        * keyValue TR31密钥数据(byte[])
        * kbpkIndex KBPK索引(int)
        * keyIndex 密钥索引(int)
        * @return 0：成功，<0：错误码
        */
  public int injectTR31Key(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
       * 随机注入或生成密钥
       * @param bundle 入参，包含如下key：
       * mode 注入或生成(int)
       * curveParam 曲线参数(String)
       * keyIndex 密钥索引(int)
       * keyLength 密钥长度(int)
       * keyType 密钥用途(int)
       * keyAlgType 密钥算法(int)
       * pubKeyA 密钥数据(byte[])
       * checkValue KCV(byte[])
       * @param pubKeyB 出参，生成的密钥数据
       * @return 0：成功，<0：错误码
       */
  public int hsmExchangeKeyEccEx(android.os.Bundle bundle, byte[] pubKeyB) throws android.os.RemoteException;
}
