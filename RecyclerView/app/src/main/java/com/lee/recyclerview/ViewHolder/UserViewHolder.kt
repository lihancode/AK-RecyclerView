package com.lee.recyclerview.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lee.recyclerview.User
import kotlinx.android.synthetic.main.user_item.view.*


class UserViewHolder(itemView : View) : ViewHolder(itemView){

    val username = itemView.user_name
    val useremail = itemView.user_email

    override fun bindTo(user: User) {
        username.text = user.name
        useremail.text = user.email

    }


}