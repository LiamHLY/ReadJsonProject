package com.example.localdatareadingdamo.ui.utils

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri

/**
 *
 * @author renqi
 *
 * @date 2019-04-03
 *
 * @description
 */
object SchemeHelper{

    var SCHEME_PRODUCTS_LIST = "${Constants.SCHEME}://product_list"

    /**
     * 目前仅用于 自身app更新
     */
    fun scheme(context: Context?,scheme:String?,dismissListener:DialogInterface.OnDismissListener?,finish: Boolean,source:String){
        try {
            var apkScheme = "${Constants.SCHEME}_apk:"
            if (scheme?.startsWith(apkScheme)!!){
                var downloadUrl = scheme.replaceFirst(apkScheme,"")
                downloadApk(context!!,downloadUrl,dismissListener,finish)
                return
            }
            SimpleLogUtils.d("app_acheme $scheme")
            var uri =  Uri.parse(scheme)
            var isInnerH5 = scheme.startsWith("${Constants.SCHEME}_h5")
            if (isInnerH5){
                var newScheme = scheme
                var innerUriString = newScheme.substring(scheme.indexOf(":").plus(1))
                if (hasSource(innerUriString)){
                    var innerUrl = Uri.parse(innerUriString).buildUpon().appendQueryParameter("source",source).build()
                    uri = Uri.parse("${Constants.SCHEME}_h5:${innerUrl.toString()}")
                    SimpleLogUtils.i("innerH5|${uri.toString()},params:"+innerUrl.getQueryParameter("source"))
                }
            }else{
                if (hasSource(uri.toString())){
                    uri = uri.buildUpon().appendQueryParameter("source",source).build()
                    SimpleLogUtils.i("${uri.toString()},params:"+uri.getQueryParameter("source"))
                }
            }
            var intent = Intent(Intent.ACTION_VIEW,uri)
            context?.startActivity(intent)
        }catch (e: ActivityNotFoundException){
            SimpleLogUtils.e("scheme:${scheme} 无法找到目标页面")
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    /**
     * 目前仅用于 自身app更新
     */
    fun getSchemePendingIntent(context: Context?,scheme:String?,source: String):Intent?{
        try {
            var apkScheme = "${Constants.SCHEME}_apk:"
            if (scheme?.startsWith(apkScheme)!!){
                return null
            }
            SimpleLogUtils.d("app_acheme $scheme")
            var uri =  Uri.parse(scheme)
            var isInnerH5 = scheme.startsWith("${Constants.SCHEME}_h5")
            if (isInnerH5){
                var newScheme = scheme
                var innerUriString = newScheme.substring(scheme.indexOf(":").plus(1))
                if (hasSource(innerUriString)){
                    var innerUrl = Uri.parse(innerUriString).buildUpon().appendQueryParameter("source",source).build()
                    uri = Uri.parse("${Constants.SCHEME}_h5:${innerUrl.toString()}")
                    SimpleLogUtils.i("innerH5|${uri.toString()},params:"+innerUrl.getQueryParameter("source"))
                }
            }else{
                if (hasSource(uri.toString())){
                    uri = uri.buildUpon().appendQueryParameter("source",source).build()
                    SimpleLogUtils.i("${uri.toString()},params:"+uri.getQueryParameter("source"))
                }
            }
            var intent = Intent(Intent.ACTION_VIEW,uri)
            return intent
        }catch (e: ActivityNotFoundException){
            SimpleLogUtils.e("scheme:${scheme} 无法找到目标页面")
            return null
        }catch (e:Exception){
            e.printStackTrace()
            return null
        }
        return null
    }

    fun scheme(context: Context?,scheme:String?,source: String){
        if (null == scheme || "" == scheme) return
        scheme(context,scheme,null,false,source)
    }
    fun downloadApk(context:Context,downloadUrl:String?,dismissListener:DialogInterface.OnDismissListener?,finish:Boolean){

    }

    private  fun hasSource(uriStr: String):Boolean{
        try {
            var tempUri = Uri.parse(uriStr)
            var linkType = tempUri.getQueryParameter("has_source")
            if (null != linkType && "1" == linkType) {
                return true
            }
            if (uriStr.startsWith("${Constants.SCHEME}:")){
                return true
            }
        }catch (e:Exception){
            SimpleLogUtils.e("服务器连接 获取has_source失败:$uriStr")
        }
        return false
    }

    /**
     *  截取scheme的 productId
     *  @param scheme
     */
    open fun getAdProductId(scheme:String?):String{
        var productId = "0"
        try {
            var data = Uri.parse(scheme)
            var host = data?.host
            if ("products" == host){
                productId = data.path?.replace("/","")!!
                SimpleLogUtils.i("埋点上包时获取的ad_product_id是$productId")
                return productId!!
            }
        }catch (e:Exception){
            SimpleLogUtils.e("根据scheme 获取 ad_product_id 失败")
            return "0"
        }
        SimpleLogUtils.e("根据不是产品详情 ad_product_id=0")
        return productId
    }
}
