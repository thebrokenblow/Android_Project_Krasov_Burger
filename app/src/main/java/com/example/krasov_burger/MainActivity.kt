package com.example.krasov_burger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.adapter.ProductAdapter
import com.example.krasov_burger.items.ProductItems
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        

        val productRecyclerView = findViewById<RecyclerView>(R.id.productRecyclerView)
        productRecyclerView.adapter = ProductAdapter(ProductItems().list)
        productRecyclerView.layoutManager = LinearLayoutManager(this)
        productRecyclerView.hasFixedSize()

        findViewById<BottomNavigationView>(R.id.bottom_navigation_menu).setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.iconMenu -> startActivity(Intent(this, MainActivity::class.java))
                R.id.iconProfile -> startActivity(Intent(this, ProfileActivity::class.java))
                R.id.iconContacts -> startActivity(Intent(this, ContactsActivity::class.java))
                R.id.iconCart -> startActivity(Intent(this, CartActivity::class.java))
            }
            true
        }
    }
}