package com.lee.recyclerview.ViewHolder

import android.view.View
import kotlinx.android.synthetic.main.money_item.view.*

/**
 * Create by LiHan 2019-06-30
 */

class MoneyViewHolder (itemView : View) : ViewHolder(itemView){

    val money = itemView.money
    override fun bindTo() {
        money.text = "302240"
    }
}