package com.okanaydin.hipoandroidinterviewexercise.model

import com.google.gson.annotations.SerializedName

data class Recent(

    @SerializedName("photos")
    val photos: Photos?,

    @SerializedName("stat")
    val stat: String?
)