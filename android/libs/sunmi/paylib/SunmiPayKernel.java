package sunmi.paylib;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;

import com.sunmi.pay.hardware.aidl.DeviceProvide;
import com.sunmi.pay.hardware.aidl.emv.EMVOpt;
import com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt;
import com.sunmi.pay.hardware.aidl.print.PrinterOpt;
import com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt;
import com.sunmi.pay.hardware.aidl.security.SecurityOpt;
import com.sunmi.pay.hardware.aidl.system.BasicOpt;
import com.sunmi.pay.hardware.aidl.tax.TaxOpt;
import com.sunmi.pay.hardware.aidlv2.emv.EMVOptV2;
import com.sunmi.pay.hardware.aidlv2.etc.ETCOptV2;
import com.sunmi.pay.hardware.aidlv2.hce.HCEManagerV2;
import com.sunmi.pay.hardware.aidlv2.pinpad.PinPadOptV2;
import com.sunmi.pay.hardware.aidlv2.print.PrinterOptV2;
import com.sunmi.pay.hardware.aidlv2.readcard.ReadCardOptV2;
import com.sunmi.pay.hardware.aidlv2.rfid.RFIDOptV2;
import com.sunmi.pay.hardware.aidlv2.security.BiometricManagerV2;
import com.sunmi.pay.hardware.aidlv2.security.DevCertManagerV2;
import com.sunmi.pay.hardware.aidlv2.security.NoLostKeyManagerV2;
import com.sunmi.pay.hardware.aidlv2.security.SecurityOptV2;
import com.sunmi.pay.hardware.aidlv2.system.BasicOptV2;
import com.sunmi.pay.hardware.aidlv2.tax.TaxOptV2;
import com.sunmi.pay.hardware.aidlv2.test.TestOptV2;
import com.sunmi.pay.hardware.wrapper.HCEManagerV2Wrapper;
import com.sunmi.paylib.BuildConfig;

import java.lang.reflect.Method;
import java.util.List;

/** 连接SDK ADIL服务 */
public class SunmiPayKernel {
    private static final String TAG = "SunmiPayKernel";
    /** 基础操作模块 */
    @Deprecated
    public BasicOpt mBasicOpt;
    /** 读卡模块 */
    @Deprecated
    public ReadCardOpt mReadCardOpt;
    /** PinPad操作模块 */
    @Deprecated
    public PinPadOpt mPinPadOpt;
    /** EMV操作模块 */
    @Deprecated
    public EMVOpt mEMVOpt;
    /** 安全加密模块 */
    @Deprecated
    public SecurityOpt mSecurityOpt;
    /** 打印模块 */
    @Deprecated
    public PrinterOpt mPrinterOpt;
    /** 税控模块 */
    @Deprecated
    public TaxOpt mTaxOpt;

    /** 基础操作模块(V2版本) */
    public BasicOptV2 mBasicOptV2;
    /** 读卡模块(V2版本) */
    public ReadCardOptV2 mReadCardOptV2;
    /** PinPad操作模块(V2版本) */
    public PinPadOptV2 mPinPadOptV2;
    /** EMV操作模块(V2版本) */
    public EMVOptV2 mEMVOptV2;
    /** 安全加密模块(V2版本) */
    public SecurityOptV2 mSecurityOptV2;
    /** 打印模块(V2版本) */
    public PrinterOptV2 mPrinterOptV2;
    /** 税控模块(V2版本) */
    public TaxOptV2 mTaxOptV2;
    /** ETC模块(V2版本) */
    public ETCOptV2 mETCOptV2;
    /** Test模块(V2版本) */
    public TestOptV2 mTestOptV2;
    /** 设备证书模块 */
    public DevCertManagerV2 mDevCertManagerV2;
    /** NoLostKey模块 */
    public NoLostKeyManagerV2 mNoLostKeyManagerV2;
    /** BiometricManagerV2模块 */
    public BiometricManagerV2 mBiometricManagerV2;
    /** HCE操作模块 */
    public HCEManagerV2Wrapper mHCEManagerV2Wrapper;
    /** RFID操作模块（非金融） */
    public RFIDOptV2 mRFIDOptV2;
    /** SDK连接回调 */
    private ConnCallback mConnCallback;
    /** SDK连接回调(V2版本) */
    private ConnectCallback mConnCallbackV2;

    /** 支付service是否已经绑定 */
    private boolean isBind = false;
    private Context appContext;
    private boolean emvl2Split;
    @SuppressLint("StaticFieldLeak")
    private static final SunmiPayKernel INSTANCE = new SunmiPayKernel();

    private SunmiPayKernel() {
    }

    public static SunmiPayKernel getInstance() {
        return INSTANCE;
    }

    /** Get ApplicationContext */
    public Context getAppContext() {
        return appContext;
    }

    /** Set ApplicationContext */
    public void setAppContext(Context appContext) {
        this.appContext = appContext;
    }

    /** Get this PayLib version */
    public String getPayLibVersion() {
        return BuildConfig.versionName;
    }

    /** set emvl2 split enable or not */
    public void setEmvL2Split(boolean enable) {
        emvl2Split = enable;
    }

    /**
     * Get emvl2 split enable status
     *
     * @return true-enable, false-disable
     */
    public boolean getEmvl2split() {
        return emvl2Split;
    }

    /**
     * Get pay sdk version which matched this PayLib,
     * for backward compatibility, the installed sdk version
     * should great or equal this method returned value
     */
    public String getMatchedPaySDKVersion() {
        try {
            if (appContext == null) {
                return null;
            }
            PackageManager pkgMgr = appContext.getPackageManager();
            PackageInfo info = pkgMgr.getPackageInfo("com.sunmi.pay.hardware_v3", 0);
            if (info == null || TextUtils.isEmpty(info.versionName)) {
                return null;
            }
            if (info.versionName.startsWith("v5")) {
                return "v5.0.16";
            } else {
                return "v3.3.310";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 绑定支付SDK
     *
     * @param context      Context对象
     * @param connCallback 绑定操作回调对象
     */
    @Deprecated
    public void connectPayService(Context context, ConnCallback connCallback) {
        mConnCallback = connCallback;
        Intent intent = new Intent("sunmi.intent.action.PAY_HARDWARE");
        intent.setPackage("com.sunmi.pay.hardware_v3");
        appContext = context.getApplicationContext();
        PackageManager pkgManager = appContext.getPackageManager();
        List<ResolveInfo> infos = pkgManager.queryIntentServices(intent, 0);
        if (infos != null && !infos.isEmpty()) {
            checkPayHardwareServiceVersion();
            appContext.startService(intent);
            isBind = appContext.bindService(intent, mServiceConnection, Context.BIND_NOT_FOREGROUND);
        } else {
            Log.e(TAG, "bind PayHardwareService failed: service not found");
        }
    }

    /**
     * Bind to payment SDK
     *
     * @param context  Context对象
     * @param callback 绑定操作回调对象
     * @return 绑定Service是否成功，true-成功，false-失败
     */
    public boolean initPaySDK(Context context, ConnectCallback callback) {
        isBind = false;
        mConnCallbackV2 = callback;
        Intent intent = new Intent("sunmi.intent.action.PAY_HARDWARE");
        intent.setPackage("com.sunmi.pay.hardware_v3");
        appContext = context.getApplicationContext();
        PackageManager pkgManager = appContext.getPackageManager();
        List<ResolveInfo> infos = pkgManager.queryIntentServices(intent, 0);
        if (infos != null && !infos.isEmpty()) {
            checkPayHardwareServiceVersion();
            appContext.startService(intent);
            isBind = appContext.bindService(intent, mServiceConnection, Context.BIND_NOT_FOREGROUND);
        } else {
            Log.e(TAG, "bind PayHardwareService failed: service not found");
        }
        return isBind;
    }

    /**
     * unbind to payment SDK
     *
     * @param context Context对象
     */
    @Deprecated
    public void unbindPayService(Context context) {
        if (isBind) {
            context.getApplicationContext().unbindService(mServiceConnection);
            isBind = false;
        }
    }

    /** unbind to payment SDK */
    public void destroyPaySDK() {
        if (isBind) {
            appContext.unbindService(mServiceConnection);
            isBind = false;
        }
    }

    /** check PayHardwareService version */
    private void checkPayHardwareServiceVersion() {
        try {
            PackageManager pkgMgr = appContext.getPackageManager();
            PackageInfo info = pkgMgr.getPackageInfo("com.sunmi.pay.hardware_v3", 0);
            int versionCode = info.versionCode;
            String versionName = info.versionName;
            Log.e(TAG, "PayHardwareService pkg info: versionCode:" + versionCode + ",versionName:" + versionName);
            if (versionCode < 1000) {//L1版本低
                Log.e(TAG, "Low PayHardwareService version, please upgrade to v3.3.300+ version");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Callback of binding payment SDK Service */
    private final ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            try {
                DeviceProvide provider = DeviceProvide.Stub.asInterface(service);
                if (!setBinder(provider)) {
                    return;
                }
                mBasicOpt = BasicOpt.class.cast(provider.getBasicOpt());
                mReadCardOpt = ReadCardOpt.class.cast(provider.getReadCardOpt());
                mPinPadOpt = PinPadOpt.class.cast(provider.getPinPadOpt());
                mEMVOpt = EMVOpt.class.cast(provider.getEMVOpt());
                mSecurityOpt = SecurityOpt.class.cast(provider.getSecurityOpt());
                mPrinterOpt = PrinterOpt.class.cast(provider.getPrinterOpt());
                mTaxOpt = TaxOpt.class.cast(provider.getTaxOpt());
                mBasicOptV2 = getBasicOptV2(provider);
                mReadCardOptV2 = ReadCardOptV2.class.cast(provider.getReadCardOptV2());
                mPinPadOptV2 = PinPadOptV2.class.cast(provider.getPinPadOptV2());
                mEMVOptV2 = getEmvOptV2(provider);
                mSecurityOptV2 = SecurityOptV2.class.cast(provider.getSecurityOptV2());
                mPrinterOptV2 = PrinterOptV2.class.cast(provider.getPrinterOptV2());
                mTaxOptV2 = TaxOptV2.class.cast(provider.getTaxOptV2());
                mETCOptV2 = ETCOptV2.class.cast(provider.getETCOptV2());
                mTestOptV2 = TestOptV2.class.cast(provider.getTestOptV2());
                mDevCertManagerV2 = DevCertManagerV2.class.cast(provider.getDevCertManagerV2());
                mNoLostKeyManagerV2 = NoLostKeyManagerV2.Stub.asInterface(provider.getOptBinderV2("NoLostKeyManagerV2"));
                mBiometricManagerV2 = BiometricManagerV2.Stub.asInterface(provider.getOptBinderV2("BiometricManagerV2"));
                mHCEManagerV2Wrapper = getHceManagerWrapper(provider);
                mRFIDOptV2 = RFIDOptV2.Stub.asInterface(provider.getOptBinderV2("RFIDOptV2"));
                setClientParam();
                if (mConnCallback != null) {
                    mConnCallback.onServiceConnected();
                }
                if (mConnCallbackV2 != null) {
                    mConnCallbackV2.onConnectPaySDK();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(TAG, "bind SunmiPayHardwareService exception:" + e);
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            if (mConnCallback != null) {
                mConnCallback.onServiceDisconnected();
            }
            if (mConnCallbackV2 != null) {
                mConnCallbackV2.onDisconnectPaySDK();
            }
        }

        /** 设置Binder，Service端根据此Binder监测client端进程是否死掉 */
        private boolean setBinder(DeviceProvide provider) {
            try {
                return provider.setBinder(new Binder()) >= 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }

        /** set client param */
        private void setClientParam() {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("payLibVersionCode", BuildConfig.versionCode);
                bundle.putString("payLibVersionName", BuildConfig.versionName);
                mTestOptV2.setParam(bundle);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /** Get wrapped BasicOptV2 instance */
        private BasicOptV2 getBasicOptV2(DeviceProvide provider) {
            try {
                final BasicOptV2 proxy = BasicOptV2.class.cast(provider.getBasicOptV2());
                if (emvl2Split && getPaySDKVersionCode() >= 50000) {
                    Class<?> cls = Class.forName("com.sunmi.emv.l2.basic.Basicl2Splitter");
                    Method m = cls.getDeclaredMethod("getInstance", BasicOptV2.class);
                    return (BasicOptV2) m.invoke(null, proxy);
                }
                return proxy;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /** Get wrapped EMVOptV2 instance */
        private EMVOptV2 getEmvOptV2(DeviceProvide provider) {
            try {
                final EMVOptV2 proxy = EMVOptV2.class.cast(provider.getEMVOptV2());
                if (emvl2Split && getPaySDKVersionCode() >= 50000) {
                    Class<?> cls = Class.forName("com.sunmi.emv.l2.emv.Emvl2Splitter");
                    Method m1 = cls.getDeclaredMethod("getInstance", EMVOptV2.class);
                    Method m2 = cls.getDeclaredMethod("initEmvl2Split", (Class<?>[]) null);
                    EMVOptV2 instance = (EMVOptV2) m1.invoke(null, proxy);
                    m2.invoke(instance, (Object[]) null);
                    return instance;
                }
                return proxy;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        /** Create HCEManagerV2Wrapper object */
        private HCEManagerV2Wrapper getHceManagerWrapper(DeviceProvide provider) {
            try {
                final HCEManagerV2 proxy = HCEManagerV2.Stub.asInterface(provider.getOptBinderV2("HCEManagerV2"));
                return new HCEManagerV2Wrapper(proxy);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    };

    /** Get pay sdk version code */
    private int getPaySDKVersionCode() {
        try {
            if (appContext != null) {
                PackageInfo pkgInfo = appContext.getPackageManager().getPackageInfo("com.sunmi.pay.hardware_v3", 0);
                return pkgInfo.versionCode;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /** 屏幕独占 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键 */
    @Deprecated
    public static void screenMonopoly(Window window) {
        UIUtils.screenMonopoly(window);
    }

    /**
     * Dialog弹出时调用此函数可实现屏幕独占
     * 禁用底部导航栏和SystemUI下拉框、保持屏幕高亮，不锁屏、禁用音量键
     */
    @Deprecated
    public static void screenMonopoly(Dialog dialog) {
        UIUtils.screenMonopoly(dialog);
    }

    /** 支付SDK绑定结果回调 */
    @Deprecated
    public interface ConnCallback {
        /** 连接成功 */
        void onServiceConnected();

        /** 连接断开 */
        void onServiceDisconnected();
    }

    /** 连接支付SDK回调接口 */
    public interface ConnectCallback {
        /** 连接成功 */
        void onConnectPaySDK();

        /** 连接断开 */
        void onDisconnectPaySDK();
    }
}
