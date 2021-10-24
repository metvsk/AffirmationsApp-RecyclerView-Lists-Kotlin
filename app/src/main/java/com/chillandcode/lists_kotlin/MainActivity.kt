package com.chillandcode.lists_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.chillandcode.lists_kotlin.adapter.ItemAdapter
import com.chillandcode.lists_kotlin.data.Datasource

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datasource = Datasource()
        val affirmation = datasource.loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerView.adapter = ItemAdapter(this, affirmation)
        recyclerView.setHasFixedSize(true)

    }
}