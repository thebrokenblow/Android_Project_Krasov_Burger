package com.example.krasov_burger.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.R

class CategoriesAdapter(private val modelCategory : List<String>) : RecyclerView.Adapter<CategoriesAdapter.CategoriesHolder>() {
    class CategoriesHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var buttonCategory: Button = itemView.findViewById(R.id.buttonCategory)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_categories, parent, false)
        return CategoriesHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoriesHolder, position: Int) {
        holder.buttonCategory.text = modelCategory[position]
    }

    override fun getItemCount() = modelCategory.size
}