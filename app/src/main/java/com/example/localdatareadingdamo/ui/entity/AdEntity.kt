package com.example.localdatareadingdamo.ui.entity

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable
/**
 * @date:2019/5/6:17:38
 * @author:renqi(dice)
 * @email:ptqyuio@gmail.com
 */
class AdEntity() : Parcelable {
    var id:Int = 0
    var images:String = ""
    var scheme_url:String = ""
    var channel:String = ""
    var summary:String = ""

    constructor(parcel: Parcel) : this() {
        id = parcel.readInt()
        images = parcel.readString().toString()
        scheme_url = parcel.readString().toString()
        channel = parcel.readString()!!
        summary = parcel.readString()!!
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(images)
        parcel.writeString(scheme_url)
        parcel.writeString(channel)
        parcel.writeString(summary)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AdEntity> {
        override fun createFromParcel(parcel: Parcel): AdEntity {
            return AdEntity(parcel)
        }

        override fun newArray(size: Int): Array<AdEntity?> {
            return arrayOfNulls(size)
        }
    }
}