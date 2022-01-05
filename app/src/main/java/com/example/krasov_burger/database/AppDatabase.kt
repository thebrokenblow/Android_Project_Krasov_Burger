package com.example.krasov_burger.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.krasov_burger.model.ProductDao
import com.example.krasov_burger.model.ProductRoom

@Database(entities = [ProductRoom::class], version = 3)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}