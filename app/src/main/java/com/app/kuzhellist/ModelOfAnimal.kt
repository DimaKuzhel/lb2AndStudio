package com.app.kuzhellist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class ModelOfAnimal(
    val image:String, val name:String, val type:String, val details:String
): Parcelable {

}
