package com.example.localdatareadingdamo.ui.entity;

import com.example.localdatareadingdamo.BuildConfig;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author renqi
 * @date 2019-03-29
 * @description
 */
public class HomeEntity {

    public Tags tags = new Tags();
    @SerializedName("products")
    public Products products = new Products();
    public Banners banners = new Banners();
    public Version version;
    public int code;
    public int size;
    public String currency_unit = "";// 货币单位

   /* public FeatureEntity feature;*/

    public static class Tags {

        public int count;
        public List<TagData> data;

        public static class TagData implements Serializable {
            /**
             * name : 利率低
             * id : 2
             */
            public String name;
            public String id;
            public String scheme_url;

            public String allId;

            public TagData(){

            }
            public TagData(String name, String allId){
                this.name = name;
                this.allId = allId;
            }
        }
    }

    public static class Products {
        public int count;
        @SerializedName("data")
        public List<ProductEntity> data = new ArrayList<>();
        public int size;
    }

    public static class Banners {
        /**
         * count : 3
         * data : [{"id":1,"images":{"count":1,"data":[{"uri":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=4&spn=0&di=7920&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1460696575%2C3051101544&os=844600274%2C3204490043&simid=0%2C0&adpicid=0&lpn=0&ln=203&fr=&fmq=1553757349484_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171215%2F05f9fd93dfe34c0698f162530f94df2c.jpeg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf5i7_z%26e3Bv54AzdH3FwAzdH3Fd8a0aa8m0_9ccd0c&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined"}]},"tags":["斜杆青年"],"link":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=4&spn=0&di=7920&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ist","created_time":"1553757381","title":"banner001","summary":"banner001","type":0,"link_type":1,"channel":"default"},{"id":2,"images":{"count":1,"data":[{"uri":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=55&spn=0&di=27170&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=532922749%2C3843915936&os=3752975354%2C1628745154&simid=3318276239%2C345717000&adpicid=0&lpn=0&ln=203&fr=&fmq=1553757349484_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg.hisupplier.com%2Fvar%2FuserImages%2F2011-07%2F08%2F140423081_Traxxas_Slash_2WD_Kawasaki_Special_Edition_s.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bitf7rrstj6_z%26e3Bv54AzdH3Fr6517vp-0m9ddm-T6wxxwf-Sswfi-dWD-Kwowfwht-Srjvtws-E1tpt5gAzdH3F&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined"}]},"tags":["汽车"],"link":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=55&spn=0&di=27170&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&i","created_time":"1553757443","title":"banner002","summary":"banner002","type":0,"link_type":2,"channel":"default"},{"id":3,"images":{"count":1,"data":[{"uri":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=79&spn=0&di=22140&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=2840673819%2C865007300&os=1279060222%2C3713148866&simid=2840673819%2C865007300&adpicid=0&lpn=0&ln=203&fr=&fmq=1553757349484_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=11&oriquery=&objurl=http%3A%2F%2Ffmn.rrimg.com%2Ffmn058%2Fxiaozhan%2F20121029%2F2240%2Fp%2Fm2w500hq85lt_original_AEBR_103b0000b723118c.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fziwg_z%26e3B6jg6jg_z%26e3Bv54AzdH3Fdlcfswfiuwgvs7k%3F22t1%3Dnm09l9malda0dmclnma&gsm=1e&rpstart=0&rpnum=0&islist=&querylist=&force=undefined"}]},"tags":["电话"],"link":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=79&spn=0&di=22140&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&i","created_time":"1553757491","title":"banner003","summary":"是","type":0,"link_type":2,"channel":"default"}]
         */

        public int count;
        public List<BannerData> data;

        public static class BannerData {

            public int id;
            public String images;
            public String link;
            public String created_time;
            public String title;
            public String summary;
            public int type;
            public int link_type;
            public String channel;
            public List<String> tags;
            public String scheme_url;

            public static class BannerImages {
                /**
                 * count : 1
                 * data : [{"uri":"https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=4&spn=0&di=7920&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1460696575%2C3051101544&os=844600274%2C3204490043&simid=0%2C0&adpicid=0&lpn=0&ln=203&fr=&fmq=1553757349484_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171215%2F05f9fd93dfe34c0698f162530f94df2c.jpeg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf5i7_z%26e3Bv54AzdH3FwAzdH3Fd8a0aa8m0_9ccd0c&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined"}]
                 */

                public int count;
                public List<BannerImageData> data;

                public static class BannerImageData {
                    /**
                     * uri : https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=You%20called%20this%20URL%20via%20POST%2C%20but%20the%20URL%20doesn%27t%20end%20in%20a%20slash%20and%20you%20ha&step_word=&hs=0&pn=4&spn=0&di=7920&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=1460696575%2C3051101544&os=844600274%2C3204490043&simid=0%2C0&adpicid=0&lpn=0&ln=203&fr=&fmq=1553757349484_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171215%2F05f9fd93dfe34c0698f162530f94df2c.jpeg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bf5i7_z%26e3Bv54AzdH3FwAzdH3Fd8a0aa8m0_9ccd0c&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined
                     */

                    public String uri;
                }
            }
        }
    }

    public static class Version {
        /**
         * min_version :
         * max_version :
         * url :
         * type : null
         * description :
         */

        public String min_version;
        public String max_version;
        public String url;
        public int type;
        public String description;
        public String name;
        public int code;
        public int min_version_code;
        public int max_version_code;

        /**
         * 是否需要更新
         * @return
         */
        public boolean isNeedUpdate(){
            if (BuildConfig.VERSION_CODE < max_version_code) return true;
            return false;
        }

        /**
         * 是否必须更新
         * @return
         */
        public boolean isMustUpdate(){
            if (BuildConfig.VERSION_CODE < min_version_code) return true;
            return false;
        }
    }

}
