package com.lee.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.user_item.view.*


class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    val username = itemView.user_name
    val useremail = itemView.user_email

    fun bindto(user : User){
        username.text = user.name
        useremail.text = user.email

    }
}