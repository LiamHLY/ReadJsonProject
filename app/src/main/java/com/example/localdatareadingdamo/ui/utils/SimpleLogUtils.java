package com.example.localdatareadingdamo.ui.utils;

import android.util.Log;

/**
 *
 */
public class SimpleLogUtils {

    public static void i(String msg){
        if (Constants.SHOW_LOG)
            Log.i(Constants.TAG,msg);
    }

    public static void w(String msg){
        if (Constants.SHOW_LOG)
            Log.w(Constants.TAG,msg);
    }

    public static void e(String msg){
        if (Constants.SHOW_LOG)
            Log.e(Constants.TAG,msg);
    }

    public static void d(String msg){
        if (Constants.SHOW_LOG)
            Log.d(Constants.TAG,msg);
    }
}
