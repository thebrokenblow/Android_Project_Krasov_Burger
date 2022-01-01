package com.example.krasov_burger.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.R
import com.example.krasov_burger.model.ModelProduct

class CartAdapter(private val modelProduct: List<ModelProduct>) : RecyclerView.Adapter<CartAdapter.CartHolder>() {

    class CartHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameProduct: TextView = itemView.findViewById(R.id.nameProduct)
        var descriptionProduct: TextView = itemView.findViewById(R.id.descriptionProduct)
        var imageProduct: ImageView = itemView.findViewById(R.id.imageProduct)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_cart, parent, false)
        return CartHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartHolder, position: Int) {
        holder.nameProduct.text = modelProduct[position].nameProduct
        holder.descriptionProduct.text = modelProduct[position].descriptionProduct
        holder.imageProduct.setImageResource(modelProduct[position].idImageProduct)
    }

    override fun getItemCount() = modelProduct.size
}