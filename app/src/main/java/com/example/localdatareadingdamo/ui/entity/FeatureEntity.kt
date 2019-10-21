package com.example.localdatareadingdamo.ui.entity

/**
 * @date:2019/5/6:17:48
 * @author:renqi(dice)
 * @email:ptqyuio@gmail.com
 */
class FeatureEntity {
    var pop_ad: AdEntity? = null// 弹窗广告
    var splash_screen: AdEntity? = null //闪屏广告
    var a_ad_1: AdEntity? = null//
    var a_ad_2: AdEntity? = null//
    var a_ad_3: AdEntity? = null//

    var b_ad_1: AdEntity? = null//
    var b_ad_2: AdEntity? = null//
    var b_ad_3: AdEntity? = null//

    var scroll_notice : AdEntity? = null//
    var tips: AdEntity? = null//

    var float_chamber:AdEntity? = null//浮标广告

    fun isEmpty():Boolean{
        if (null == a_ad_1 && null == a_ad_2 && null == a_ad_3) return true
        return false
    }
}