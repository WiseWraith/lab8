package com.example.gameb.model

import androidx.annotation.DrawableRes

data class Shop(
    @DrawableRes val im_shopID:Int,
    val shopName : String,
    val price : String,
    val available : String,
    val discount : String
)
