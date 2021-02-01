package com.yanghyeonjin.recyclerviewmultipleviewtype.data

import com.yanghyeonjin.recyclerviewmultipleviewtype.R
import com.yanghyeonjin.recyclerviewmultipleviewtype.model.BuddyModel
import com.yanghyeonjin.recyclerviewmultipleviewtype.util.BUDDY_VIEW_TYPE

class BuddyData {
    fun loadBuddyList(): List<BuddyModel> {
        return listOf(
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_TEXT,
                buddyNameResourceId = R.string.buddy_name_1,
                buddyTagLineResourceId = R.string.buddy_tag_line_1,
                buddyImgResourceId = "null"
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE,
                buddyNameResourceId = R.string.buddy_name_2,
                buddyTagLineResourceId = R.string.buddy_tag_line_2,
                buddyImgResourceId = R.drawable.ic_buddy_profile_1.toString(),
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE,
                buddyNameResourceId = R.string.buddy_name_3,
                buddyTagLineResourceId = R.string.buddy_tag_line_3,
                buddyImgResourceId = R.drawable.ic_buddy_profile_2.toString(),
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_TEXT,
                buddyNameResourceId = R.string.buddy_name_4,
                buddyTagLineResourceId = R.string.buddy_tag_line_4,
                buddyImgResourceId = "null",
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE,
                buddyNameResourceId = R.string.buddy_name_5,
                buddyTagLineResourceId = R.string.buddy_tag_line_5,
                buddyImgResourceId = R.drawable.ic_buddy_profile_3.toString(),
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_TEXT,
                buddyNameResourceId = R.string.buddy_name_6,
                buddyTagLineResourceId = R.string.buddy_tag_line_6,
                buddyImgResourceId = "null",
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_TEXT,
                buddyNameResourceId = R.string.buddy_name_7,
                buddyTagLineResourceId = R.string.buddy_tag_line_7,
                buddyImgResourceId = "null",
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE,
                buddyNameResourceId = R.string.buddy_name_8,
                buddyTagLineResourceId = R.string.buddy_tag_line_8,
                buddyImgResourceId = R.drawable.ic_buddy_profile_4.toString(),
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE,
                buddyNameResourceId = R.string.buddy_name_9,
                buddyTagLineResourceId = R.string.buddy_tag_line_9,
                buddyImgResourceId = R.drawable.ic_buddy_profile_2.toString(),
            ),
            BuddyModel(
                viewType = BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE,
                buddyNameResourceId = R.string.buddy_name_10,
                buddyTagLineResourceId = R.string.buddy_tag_line_10,
                buddyImgResourceId = R.drawable.ic_buddy_profile_1.toString(),
            ),
        )
    }
}