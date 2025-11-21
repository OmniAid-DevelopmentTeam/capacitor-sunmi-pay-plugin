package com.sunmi.pay.hardware.aidlv2;

import android.app.Application;

import com.sunmi.pay.hardware.aidl.AidlErrorCode;
import com.sunmi.paylib.R;

import java.lang.reflect.Method;


/**
 * L1应用层错误码定义
 */
public enum AidlErrorCodeV2 {
    AIDL_ERROR(Integer.MIN_VALUE, getString(R.string.unknown));

    private int code;
    private String msg;

    AidlErrorCodeV2(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static AidlErrorCodeV2 valueOf(int errCode) {
        AidlErrorCode error = AidlErrorCode.valueOf(errCode);
        AIDL_ERROR.code = error.getCode();
        AIDL_ERROR.msg = error.getMsg();
        return AIDL_ERROR;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
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
