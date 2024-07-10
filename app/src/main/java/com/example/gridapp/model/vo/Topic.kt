package com.example.gridapp.model.vo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@StringRes val nameResId: Int, val count: Int, @DrawableRes val photoResId: Int)
