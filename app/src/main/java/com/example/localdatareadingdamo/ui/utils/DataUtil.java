package com.example.localdatareadingdamo.ui.utils;

import android.content.Context;

import com.example.localdatareadingdamo.R;
import com.example.localdatareadingdamo.ui.entity.HomeEntity;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class DataUtil {

    public static HomeEntity HOME = null;
    public static Map<String,Integer> images =new HashMap<String,Integer>();

    public static void initData(Context context){
        //
        String json = FileUtil.getJson("home-entity.json",context.getApplicationContext());
        HOME =  new Gson().fromJson(json,HomeEntity.class);

        //
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG92.jpeg",R.mipmap.one);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG402.png",R.mipmap.two);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG71.jpeg",R.mipmap.three);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG68.jpeg",R.mipmap.four);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG59.jpeg",R.mipmap.five);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG58.jpeg",R.mipmap.six);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG1459.png",R.mipmap.seven);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG55.jpeg",R.mipmap.eight);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG53.jpeg",R.mipmap.nine);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG49.jpeg",R.mipmap.ten);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG41.jpeg",R.mipmap.eleven);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG490.jpg",R.mipmap.twelve);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG1164.jpeg",R.mipmap.thirteen);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG1159.jpeg",R.mipmap.fourteen);
        images.put("http://media-cash-market-in.oss-ap-southeast-5.aliyuncs.com/media%2Fproducts%2FWechatIMG45.jpeg",R.mipmap.fifteen);
    }
}
