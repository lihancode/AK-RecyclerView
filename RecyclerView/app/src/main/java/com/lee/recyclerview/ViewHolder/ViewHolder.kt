package com.lee.recyclerview.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lee.recyclerview.User

/**
 * Create by LiHan 2019-06-30
 */

open class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    open fun bindTo(){

    }

    open fun bindTo(user : User){

    }
}