package com.example.krasov_burger

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.adapter.CartAdapter
import com.example.krasov_burger.adapter.listCart
import com.google.android.material.bottomnavigation.BottomNavigationView

class CartActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (listCart.size == 0) {
            setContentView(R.layout.activity_cart_no_items)
            val bottomNavigationProfile =
                findViewById<BottomNavigationView>(R.id.bottomNavigationCart)
            bottomNavigationProfile.selectedItemId = R.id.iconCart

            findViewById<Button>(R.id.buttonToMenu).setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
            }
            findViewById<BottomNavigationView>(R.id.bottomNavigationCart).setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.iconMenu -> startActivity(Intent(this, MainActivity::class.java))
                    R.id.iconProfile -> startActivity(Intent(this, ProfileActivity::class.java))
                    R.id.iconContacts -> startActivity(Intent(this, ContactsActivity::class.java))
                    R.id.iconCart -> startActivity(Intent(this, CartActivity::class.java))
                }
                true
            }
        }
        else {
            setContentView(R.layout.activity_cart)
            val bottomNavigationProfile =
                findViewById<BottomNavigationView>(R.id.bottomNavigationCart)
            bottomNavigationProfile.selectedItemId = R.id.iconCart

            val res = listCart.asSequence().map { it }.groupBy { it }.map{ Pair(it.key, it.value.count())}.toList()

            val cartRecyclerView = findViewById<RecyclerView>(R.id.cartRecyclerView)
            cartRecyclerView.adapter = CartAdapter(res)
            cartRecyclerView.layoutManager = LinearLayoutManager(this)
            cartRecyclerView.hasFixedSize()

            findViewById<BottomNavigationView>(R.id.bottomNavigationCart).setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.iconMenu -> startActivity(Intent(this, MainActivity::class.java))
                    R.id.iconProfile -> startActivity(Intent(this, ProfileActivity::class.java))
                    R.id.iconContacts -> startActivity(Intent(this, ContactsActivity::class.java))
                    R.id.iconCart -> startActivity(Intent(this, CartActivity::class.java))
                }
                true
            }
            val buttonCheckout = findViewById<Button>(R.id.buttonCheckout)
            buttonCheckout.text = "Оформить заказ на ${listCart.sumOf { it.costProduct }}"
            buttonCheckout.setOnClickListener {
            }
        }
    }
}