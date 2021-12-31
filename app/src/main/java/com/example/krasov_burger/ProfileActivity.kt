package com.example.krasov_burger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val bottomNavigationProfile = findViewById<BottomNavigationView>(R.id.bottom_navigation_profile)
        bottomNavigationProfile.selectedItemId = R.id.iconProfile
        bottomNavigationProfile.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.iconMenu -> startActivity(Intent(this, MainActivity::class.java))
                R.id.iconProfile -> startActivity(Intent(this, ProfileActivity::class.java))
                R.id.iconContacts -> startActivity(Intent(this, ProfileActivity::class.java))
                R.id.iconCart -> startActivity(Intent(this, ProfileActivity::class.java))
            }
            true
        }
    }
}