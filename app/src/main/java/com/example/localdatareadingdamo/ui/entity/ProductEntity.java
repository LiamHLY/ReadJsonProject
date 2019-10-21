package com.example.localdatareadingdamo.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author mc
 * @date 2019-03-29
 * @description
 */

public class ProductEntity implements Parcelable {


    public int id = 0;
    @SerializedName("images")
    public String images;
    @SerializedName("name")
    public String name;
    public String gp_score;

    @SerializedName("loan_amount")
    public ArrayList<String> loan_amount;

    @SerializedName("loan_rate")
    public String loan_rate;

    public ArrayList<String> period;
    public String button_content;
    public String promotion_icon;
    @SerializedName("feature")
    public String feature;
    public int loan_type;
    public String passing_rate_score;
    public String loan_speed_score;
    public String handling_fee_score;

    public int change_type;
    public String change_uri;
    public int product_status;
    public int product_type;
    public String loan_time;
    public String loan_time_str;
    public String consumable_amount;
    public String show_loan_amount;

    @SerializedName("currency_unit")
    public String currency_unit;

    @SerializedName("sales_volume")
    public String sales_volume;



/*    public Conditions loan_condition;

    public LoadSteps load_step;

    public GPComments googleplaycomment;

    public ReviewSteps review_step;*/

    public String show_loan_amount_display;//": "Rp1.987.120",
    public int customer_id;//": 1,
    public String channel;//": "",
    public boolean is_display;//": true,
    public String product_detail;//": "<p>sh</p>",
    public int download_type;//": 0,
    public String download_uri;//": "",
    public String shelf_time;//": "1552548000",
    public String obtained_time;//": "1567123200",
    public String loan_currency;//": "IDR",
    public int priority;//": 0,
    public int pay_type;//": 0,

    public ArrayList<Integer> tags;
    @SerializedName("scheme_url")
    public String scheme_url;

    @SerializedName("downloan_scheme_url")
    public String downloan_scheme_url;
    public String switch_next_scheme_url;
    public String loan_rate_display;
    public String loan_time_display;
    public String ad_copy;
    public int display_option = 0; // 0 利率  1 贷款期限

    // 下单数据 不是服务器返回的 本地用与保存数据
    public String re_amount; //下单选择金额
    public String re_period; //下单的周期
    public String re_interest_admin_amount; //利息和管理费
    public String re_actual_amount; //实际到账金额
    public String re_repay_total_amount; //最终还款金额


    public DebitCard re_bank;// 银行卡id


   // public LoanInfo loan_info = null;

    public String re_order_id; //订单号

    public ProductEntity(){

    }
    protected ProductEntity(Parcel in) {
        id = in.readInt();
        images = in.readString();
        name = in.readString();
        gp_score = in.readString();
        loan_amount = in.createStringArrayList();
        loan_rate = in.readString();
        period = in.createStringArrayList();
        button_content = in.readString();
        promotion_icon = in.readString();
        feature = in.readString();
        loan_type = in.readInt();
        passing_rate_score = in.readString();
        loan_speed_score = in.readString();
        handling_fee_score = in.readString();
        change_type = in.readInt();
        change_uri = in.readString();
        product_status = in.readInt();
        product_type = in.readInt();
        loan_time = in.readString();
        loan_time_str = in.readString();
        consumable_amount = in.readString();
        show_loan_amount = in.readString();
        currency_unit = in.readString();
        sales_volume = in.readString();
        show_loan_amount_display = in.readString();
        customer_id = in.readInt();
        channel = in.readString();
        is_display = in.readByte() != 0;
        product_detail = in.readString();
        download_type = in.readInt();
        download_uri = in.readString();
        shelf_time = in.readString();
        obtained_time = in.readString();
        loan_currency = in.readString();
        priority = in.readInt();
        pay_type = in.readInt();
        scheme_url = in.readString();
        downloan_scheme_url = in.readString();
        switch_next_scheme_url = in.readString();
        loan_rate_display = in.readString();
        loan_time_display = in.readString();
        ad_copy = in.readString();
        display_option = in.readInt();

        re_amount = in.readString();
        re_period = in.readString();
        re_interest_admin_amount = in.readString();
        re_actual_amount = in.readString();
        re_repay_total_amount = in.readString();
        re_bank = in.readParcelable(DebitCard.class.getClassLoader());
    }

    public static final Creator<ProductEntity> CREATOR = new Creator<ProductEntity>() {
        @Override
        public ProductEntity createFromParcel(Parcel in) {
            return new ProductEntity(in);
        }

        @Override
        public ProductEntity[] newArray(int size) {
            return new ProductEntity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(images);
        dest.writeString(name);
        dest.writeString(gp_score);
        dest.writeStringList(loan_amount);
        dest.writeString(loan_rate);
        dest.writeStringList(period);
        dest.writeString(button_content);
        dest.writeString(promotion_icon);
        dest.writeString(feature);
        dest.writeInt(loan_type);
        dest.writeString(passing_rate_score);
        dest.writeString(loan_speed_score);
        dest.writeString(handling_fee_score);
        dest.writeInt(change_type);
        dest.writeString(change_uri);
        dest.writeInt(product_status);
        dest.writeInt(product_type);
        dest.writeString(loan_time);
        dest.writeString(loan_time_str);
        dest.writeString(consumable_amount);
        dest.writeString(show_loan_amount);
        dest.writeString(currency_unit);
        dest.writeString(sales_volume);
        dest.writeString(show_loan_amount_display);
        dest.writeInt(customer_id);
        dest.writeString(channel);
        dest.writeByte((byte) (is_display ? 1 : 0));
        dest.writeString(product_detail);
        dest.writeInt(download_type);
        dest.writeString(download_uri);
        dest.writeString(shelf_time);
        dest.writeString(obtained_time);
        dest.writeString(loan_currency);
        dest.writeInt(priority);
        dest.writeInt(pay_type);
        dest.writeString(scheme_url);
        dest.writeString(downloan_scheme_url);
        dest.writeString(switch_next_scheme_url);
        dest.writeString(loan_rate_display);
        dest.writeString(loan_time_display);
        dest.writeString(ad_copy);
        dest.writeInt(display_option);

        dest.writeString(re_amount);
        dest.writeString(re_period);
        dest.writeString(re_interest_admin_amount);
        dest.writeString(re_actual_amount);
        dest.writeString(re_repay_total_amount);
        dest.writeParcelable(re_bank, flags);
    }

 /*   public static class LoadSteps{
        public int conunt;
        public ArrayList<LoadStepEntity> data;
    }

    public static class GPComments{
        public int count;
        public ArrayList<CommentEntity> data;
    }

    public static class Conditions{
        public int conunt;
        public ArrayList<LoadStepEntity> data;
    }

    public static class ReviewSteps{
        public int conunt;
        public ArrayList<LoadStepEntity> data;
    }*/

    /**
     * 最后的还款金额
     * @param a  金额
     * @param t  时间
     * @return String[]
     */
    public String[] computerPayAmount(String a, String t){
        //  最后还款金额   到手金额   手续费+利息
        String[] result = new String[]{"0","0","0"};
        try{
            // 利率
            float dayRate = Float.valueOf(loan_rate);
            // 贷款天数
            int days = Integer.valueOf(t);
            // 贷款金额
            int amount = Integer.valueOf(a);
            // 利息  =  贷款金额 *  日利率 * 贷款天数 *
            float custom = amount * dayRate * days /10000;
            result[2] = String.valueOf( (int) custom);
            if (1 == loan_type){//预扣利息
                result[1] = String.valueOf( (int) (amount - custom) );
                result[0] = String.valueOf(amount);
            }else if (0 == loan_type){//-常规
                result[1] = String.valueOf(amount);
                result[0] = String.valueOf( (int) (amount + custom) );
            }

        }catch (Exception e){

        }
        return result;
    }

    public String get_loan_rate_display(){
        String result = loan_rate;
        try{
            //double rateInt = Float.parseFloat(result)*100/10000;
            BigDecimal bg = new BigDecimal(loan_rate);
            bg = (bg.multiply(new BigDecimal(100))).divide(new BigDecimal(10000),4, BigDecimal.ROUND_DOWN);
            float f1 = bg.setScale(2, BigDecimal.ROUND_DOWN).floatValue();
            return String.valueOf(f1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
