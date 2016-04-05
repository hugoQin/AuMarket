package com.au.market.base;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by weiguangyu on 4/2/16.
 */
public class FragmentActivityBase extends FragmentActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    /**
     * 启动activity
     *
     * @param pClass
     */
    protected void appStartActivity(Class<?> pClass) {
        Intent intent = new Intent(this, pClass);
        startActivity(intent);
    }

    /**
     * 根据包名启动应用
     *
     * @param pakge_name
     * @param class_name
     */
    protected void appStartActivity(String pakge_name, String class_name) {
        ComponentName componetName = new ComponentName(
                //这个是另外一个应用程序的包名
                pakge_name,
                //这个参数是要启动的Activity
                class_name);
        Intent intent = new Intent();
        intent.setComponent(componetName);
        startActivity(intent);
    }
}
