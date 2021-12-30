package com.example.krasov_burger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.adapter.ProductAdapter
import com.example.krasov_burger.items.ProductItems

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productRecyclerView = findViewById<RecyclerView>(R.id.productRecyclerView)
        productRecyclerView.adapter = ProductAdapter(ProductItems().List)
        productRecyclerView.layoutManager = LinearLayoutManager(this)
        productRecyclerView.hasFixedSize()
    }
}