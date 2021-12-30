package com.example.krasov_burger.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.R
import com.example.krasov_burger.model.ModelProduct

class ProductAdapter(private val newtonList: List<ModelProduct>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameProduct: TextView = itemView.findViewById(R.id.nameProduct)
        var descriptionProduct: TextView = itemView.findViewById(R.id.descriptionProduct)
        var toCard: Button = itemView.findViewById(R.id.toCard)
        var imageProduct: ImageView = itemView.findViewById(R.id.imageProduct)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ProductHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.nameProduct.text = newtonList[position].nameProduct
        holder.descriptionProduct.text = newtonList[position].descriptionProduct
        holder.toCard.text = newtonList[position].toCard
        holder.imageProduct.setImageResource(newtonList[position].idImageProduct)
    }

    override fun getItemCount() = newtonList.size
}