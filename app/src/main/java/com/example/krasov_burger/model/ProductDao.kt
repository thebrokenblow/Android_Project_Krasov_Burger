package com.example.krasov_burger.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM ProductRoom")
    fun getAll(): List<ProductRoom>
    @Insert
    fun insertAll(vararg productRoomResult: ProductRoom)
    @Query("DELETE FROM ProductRoom")
    fun dropAll()
}