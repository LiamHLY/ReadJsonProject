package com.example.localdatareadingdamo.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;


public class DebitCard implements Parcelable {
    //持卡人

    String bank_user_name;

    //

    int id;

    //卡号

    String bank_account;

    //开户行

    String opening_bank;


    //银行代码

    String bank_code;

    //银行名称

    String bank_name;

    public DebitCard(){

    }


    protected DebitCard(Parcel in) {
        bank_user_name = in.readString();
        id = in.readInt();
        bank_account = in.readString();
        opening_bank = in.readString();
        bank_code = in.readString();
        bank_name = in.readString();
        selected = in.readByte() != 0;
    }

    public static final Creator<DebitCard> CREATOR = new Creator<DebitCard>() {
        @Override
        public DebitCard createFromParcel(Parcel in) {
            return new DebitCard(in);
        }

        @Override
        public DebitCard[] newArray(int size) {
            return new DebitCard[size];
        }
    };



    public boolean selected = false;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bank_user_name);
        dest.writeInt(id);
        dest.writeString(bank_account);
        dest.writeString(opening_bank);
        dest.writeString(bank_code);
        dest.writeString(bank_name);
        dest.writeByte((byte) (selected ? 1 : 0));
    }
}
