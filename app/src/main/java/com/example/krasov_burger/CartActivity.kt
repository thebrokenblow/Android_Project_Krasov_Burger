package com.example.krasov_burger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.adapter.CartAdapter
import com.example.krasov_burger.adapter.CartProduct
import com.google.android.material.bottomnavigation.BottomNavigationView

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val bottomNavigationProfile = findViewById<BottomNavigationView>(R.id.bottom_navigation_cart)
        bottomNavigationProfile.selectedItemId = R.id.iconCart

        val cartRecyclerView = findViewById<RecyclerView>(R.id.cartRecyclerView)
        cartRecyclerView.adapter = CartAdapter(CartProduct().listCart)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)
        cartRecyclerView.hasFixedSize()

        findViewById<BottomNavigationView>(R.id.bottom_navigation_cart).setOnNavigationItemSelectedListener {
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