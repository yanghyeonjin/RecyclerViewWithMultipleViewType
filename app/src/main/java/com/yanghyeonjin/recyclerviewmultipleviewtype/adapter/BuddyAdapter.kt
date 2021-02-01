package com.yanghyeonjin.recyclerviewmultipleviewtype.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yanghyeonjin.recyclerviewmultipleviewtype.databinding.ImageItemLayoutBinding
import com.yanghyeonjin.recyclerviewmultipleviewtype.databinding.TextItemLayoutBinding
import com.yanghyeonjin.recyclerviewmultipleviewtype.model.BuddyModel
import com.yanghyeonjin.recyclerviewmultipleviewtype.util.BUDDY_VIEW_TYPE

class BuddyAdapter(
    private val context: Context,
    private val dataSet: List<BuddyModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == BUDDY_VIEW_TYPE.VIEW_TYPE_TEXT) {
            return TextViewHolder(TextItemLayoutBinding.inflate(LayoutInflater.from(context), parent, false))
        }
        return ImageViewHolder(ImageItemLayoutBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (dataSet[position].viewType) {
            BUDDY_VIEW_TYPE.VIEW_TYPE_TEXT -> {
                (holder as TextViewHolder).bind(position)
            }
            BUDDY_VIEW_TYPE.VIEW_TYPE_IMAGE -> {
                (holder as ImageViewHolder).bind(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun getItemViewType(position: Int): Int {
        return dataSet[position].viewType
    }

    private inner class TextViewHolder(binding: TextItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val buddyName = binding.buddyName
        val buddyTagLine = binding.buddyTagLine

        fun bind(position: Int) {
            val place: BuddyModel = dataSet[position]
            buddyName.text = context.resources.getString(place.buddyNameResourceId)
            buddyTagLine.text = context.resources.getString(place.buddyTagLineResourceId)
        }
    }

    private inner class ImageViewHolder(binding: ImageItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val buddyName = binding.buddyName
        val buddyTagLine = binding.buddyTagLine
        val buddyImg = binding.buddyImg

        fun bind(position: Int) {
            val place: BuddyModel = dataSet[position]
            buddyName.text = context.resources.getString(place.buddyNameResourceId)
            buddyTagLine.text = context.resources.getString(place.buddyTagLineResourceId)
            buddyImg.setImageResource(place.buddyImgResourceId.toInt())
        }
    }
}