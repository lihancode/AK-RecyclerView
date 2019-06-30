package com.lee.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lee.recyclerview.Adapter.ViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var adapter : UserAdapter
        lateinit var adapter : ViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.setHasFixedSize(true)
        recycler.layoutManager = LinearLayoutManager(this@MainActivity)
        val fakeData = FakeDataGenerater().getFakeUsers()
//        adapter = UserAdapter(fakeData)
        adapter = ViewAdapter()
        recycler.adapter = adapter
//        ItemTouchHelper(recycler).itemTouchHelper

    }


}


