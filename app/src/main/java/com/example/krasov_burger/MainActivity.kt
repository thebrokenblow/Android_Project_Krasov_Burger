package com.example.krasov_burger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

import com.example.krasov_burger.adapter.ProductAdapter
import com.example.krasov_burger.database.AppDatabase

@DelicateCoroutinesApi
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "krasov_burger").fallbackToDestructiveMigrationFrom(1, 2).build()
        val productDao = db.productDao()

        GlobalScope.launch(Dispatchers.IO) {
            val listProduct = productDao.getAll()
            launch(Dispatchers.Main) {
                val productRecyclerView = findViewById<RecyclerView>(R.id.productRecyclerView)
                    productRecyclerView.adapter = ProductAdapter(listProduct)
                    productRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
                    productRecyclerView.hasFixedSize()
            }
        }

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