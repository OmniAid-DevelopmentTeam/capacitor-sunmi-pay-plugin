package sunmi.paylib;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by tomcat on 2017/3/15.
 */

 class UIUtils {

    protected static final int SYSTEM_UI_FLAG_SUNMI_SEC = 0x00000008;

    /**
     * 屏幕独占 禁用底部导航栏和SystemUI下拉框
     */
    public static void setSunmiSecStatusBar(View view) {
        int systemUiVisibility = view.getSystemUiVisibility();
        int flags = SYSTEM_UI_FLAG_SUNMI_SEC;
        systemUiVisibility |= flags;
        view.setSystemUiVisibility(systemUiVisibility);
    }

    public static void banPowerKey(Window window) {
        if (window != null) {
            window.setFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND, WindowManager.LayoutParams.FLAG_BLUR_BEHIND);//禁用PowerKey
        }
    }

    public static void banVolumeKey(Dialog dialog) {
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
            @Override
            public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                String tag = "onKeyDown";
                if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
                    Log.e(tag, "KEYCODE_VOLUME_DOWN");
                    return true;
                } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
                    Log.e(tag, "KEYCODE_VOLUME_UP");
                    return true;
                }
                return false;
            }
        });
    }

    public static void screenMonopoly(Window window) {
        banPowerKey(window);
        setSunmiSecStatusBar(window.getDecorView());
        // 应用运行时，保持屏幕高亮，不锁屏
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }


    public static void screenMonopoly(Dialog dialog) {
        Window window = dialog.getWindow();
        // 应用运行时，保持屏幕高亮，不锁屏
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        banPowerKey(window);
        setSunmiSecStatusBar(window.getDecorView());
        banVolumeKey(dialog);
    }

    /**
     * 设置当前界面亮度
     * 需要注意其中的context的类型是Activity，不能是Context。
     * 这种方式的特点，是**只在当前设置的界面生效**，离开此界面后，屏幕亮度受亮度自动调节的开关控制。
     * 换句话说，用这种方式设置当前界面的亮度时，会使亮度自动调节失效。
     * 只有离开此界面，亮度自动调节继续生效。这种方式适用某些特殊的，需要高亮显示界面。
     *
     * @param context
     * @param brightness
     */
    public static void setLight(Activity context, int brightness) {
        WindowManager.LayoutParams lp = context.getWindow().getAttributes();
        lp.screenBrightness = Float.valueOf(brightness) * (1f / 255f);
        context.getWindow().setAttributes(lp);
    }

}
