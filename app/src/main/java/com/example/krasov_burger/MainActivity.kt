package com.example.krasov_burger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.adapter.ProductAdapter
import com.example.krasov_burger.databinding.ActivityMainBinding
import com.example.krasov_burger.items.ProductItems
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productRecyclerView = findViewById<RecyclerView>(R.id.productRecyclerView)
        productRecyclerView.adapter = ProductAdapter(ProductItems().List)
        productRecyclerView.layoutManager = LinearLayoutManager(this)
        productRecyclerView.hasFixedSize()

        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.iconMenu -> {
                    Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show()
                }
                R.id.iconProfile -> {
                    Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show()
                }
                R.id.iconContacts -> {
                    Toast.makeText(this, "item3", Toast.LENGTH_SHORT).show()
                }
                R.id.iconCart -> {
                    Toast.makeText(this, "item4", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }
}