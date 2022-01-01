package com.example.krasov_burger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        val bottomNavigationProfile = findViewById<BottomNavigationView>(R.id.bottom_navigation_contacts)
        bottomNavigationProfile.selectedItemId = R.id.iconContacts

        bottomNavigationProfile.setOnNavigationItemSelectedListener {
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