package com.lee.recyclerview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lee.recyclerview.R
import com.lee.recyclerview.User
import com.lee.recyclerview.ViewHolder.*
import com.lee.recyclerview.ViewType

/**
 * Create by LiHan 2019-06-30
 */

class ViewAdapter : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        when(getItemViewType(viewType)){
            ViewType.USER.ordinal->{
                return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false))
            }
            ViewType.ICON.ordinal->{
                return IconViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.icon_item,parent,false))
            }
            ViewType.LEVEL.ordinal->{
                return LevelViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.level_item,parent,false))
            }
            ViewType.MONEY.ordinal->{
                return MoneyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.money_item,parent,false))
            }else ->{
                return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false))
            }
        }
    }

    override fun getItemCount(): Int {
        return ViewType.values().size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(getItemViewType(position)){
            ViewType.USER.ordinal->{
                holder.bindTo(User("Jack", "Jack22233@gmail.com"))
            }
            ViewType.ICON.ordinal->{
                holder.bindTo()
            }
            ViewType.LEVEL.ordinal->{
                holder.bindTo()
            }
            ViewType.MONEY.ordinal->{
                holder.bindTo()
            }else ->{
        }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return ViewType.values()[position].ordinal
    }

}