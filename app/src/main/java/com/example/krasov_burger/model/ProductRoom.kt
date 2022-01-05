package com.example.krasov_burger.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProductRoom(
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "sort_description") val sortDescription: String,
    @ColumnInfo(name = "full_description") val fullDescription: String,
    @ColumnInfo(name = "cost") val cost: Double,
    @ColumnInfo(name = "kilocalories") val kilocalories: Double,
    @ColumnInfo(name = "fats") val fats: Double,
    @ColumnInfo(name = "carbohydrates") val carbohydrates: Double,
    @ColumnInfo(name = "protein") val protein: Double,
    @ColumnInfo(name = "weight") val weight: Double,
    @ColumnInfo(name = "photo") val photo: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}