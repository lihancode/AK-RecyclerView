package com.lee.recyclerview

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView

/**
 * Create by LiHan 2019-06-30
 */

class ItemTouchHelper(recyclerView: RecyclerView){

    val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback(){
        override fun getMovementFlags(recyclerView: RecyclerView,
                                      viewHolder: RecyclerView.ViewHolder): Int {

            // step 1
            val dragFlags = ItemTouchHelper.UP or ItemTouchHelper.DOWN
            val swipe = ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
            return makeMovementFlags(dragFlags, swipe)
        }
        override fun onMove(
            recyclerView: RecyclerView,
            viewHolder: RecyclerView.ViewHolder,
            target: RecyclerView.ViewHolder
        ): Boolean {
            //step 2 onMove is drag
            val fromPos = viewHolder.adapterPosition
            val toPos  = target.adapterPosition
            recyclerView.adapter.let {
                it!!.notifyItemMoved(fromPos,toPos)
            }
            return true
        }
        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            //step 3 swiped is remove
            val pos = viewHolder.adapterPosition
            recyclerView.adapter.let {
                it!!.notifyItemRemoved(pos)
            }
        }


    }).attachToRecyclerView(recyclerView)

}