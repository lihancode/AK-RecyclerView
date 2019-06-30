package com.lee.recyclerview.ViewHolder

import android.view.View
import kotlinx.android.synthetic.main.level_item.view.*

/**
 * Create by LiHan 2019-06-30
 */


class LevelViewHolder(itemView : View) : ViewHolder(itemView){
    val level = itemView.level
    override fun bindTo() {
        level.text = "103"
    }
}