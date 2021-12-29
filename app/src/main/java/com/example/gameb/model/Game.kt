package com.example.gameb.model

import androidx.annotation.DrawableRes

data class Game(
    @DrawableRes val im_modelID: Int,
    val model: String,
    val description: String,
)

