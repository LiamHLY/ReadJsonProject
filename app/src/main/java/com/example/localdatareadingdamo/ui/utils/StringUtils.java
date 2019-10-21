package com.example.localdatareadingdamo.ui.utils;

import android.content.Context;
import android.graphics.Typeface;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 创建时间： 2018/10/25:11:05
 * 创建人：renqi
 */
public class StringUtils {


    /**
     * 格式化金额后，获取字符串将 "," 去除
     * @param str
     * @return
     */
    public static String transAmount(String str){
        String temp = new StringBuffer(str).toString();
        try {
            String result = temp.replaceAll("[^0-9]","");
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 仿支付宝金额千分位格式化
     * @param p
     * @param halfUp
     * @return
     */
    public static String formatPrice(String p, boolean halfUp){
        try{
            double price = Double.valueOf(p);
            DecimalFormat formater = new DecimalFormat();
            // keep 2 decimal places
            // 设置最大小数位数
            formater.setMaximumFractionDigits(0);
            // 设置分组大小，也就是显示逗号的位置
            formater.setGroupingSize(3);
            // 设置四舍五入的模式
            formater.setRoundingMode(halfUp ? RoundingMode.HALF_UP: RoundingMode.FLOOR);
            return formater.format(price);//.replaceAll(",",".");
        } catch (Exception e){
            e.printStackTrace();
        }
      return p;

    }

    /**
     * 加粗 字体
     * @return
     */
    public static Typeface getMediumTextType(Context context){
        Typeface type = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "Roboto-Medium.ttf");
        return type;
    }

    /**
     * 常规字体
     * @return
     */
    public static Typeface getCashDefaultTextType(Context context){
        Typeface type = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "Roboto-Regular.ttf");
        return type;
    }

    /**
     * 纤细字体
     * @return
     */
    public static Typeface getLightTextType(Context context){
        Typeface type = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "Roboto-Light.ttf");
        return type;
    }


    /**
     * Return whether the string is null or 0-length.
     *
     * @param s The string.
     * @return {@code true}: yes<br> {@code false}: no
     */
    public static boolean isEmpty(final CharSequence s) {
        return s == null || s.length() == 0;
    }

}
