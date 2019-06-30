package com.lee.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sign

class MainActivity : AppCompatActivity() {

    lateinit var adapter : UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this@MainActivity)
        val fakeData = FakeDataGenerater().getFakeUsers()
        adapter = UserAdapter(fakeData)
        recycler.adapter = adapter
        itemTouchHelper.attachToRecyclerView(recycler)



    }

    private val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.Callback(){
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
            adapter.notifyItemMoved(fromPos,toPos)
            return true
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
            //step 3 swiped is remove
            val pos = viewHolder.adapterPosition
            adapter.notifyItemRemoved(pos)
        }

    })
}


