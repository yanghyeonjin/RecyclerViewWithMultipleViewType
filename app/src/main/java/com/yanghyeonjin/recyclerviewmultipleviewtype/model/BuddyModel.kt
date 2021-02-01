package com.yanghyeonjin.recyclerviewmultipleviewtype.model

import androidx.annotation.StringRes

data class BuddyModel(
    val viewType: Int,
    @StringRes val buddyNameResourceId: Int,
    @StringRes val buddyTagLineResourceId: Int,
    val buddyImgResourceId: String
)
