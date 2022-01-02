package com.example.krasov_burger.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.R
import com.example.krasov_burger.model.ModelProduct

class CartAdapter(private val modelProduct: List<ModelProduct>) : RecyclerView.Adapter<CartAdapter.CartHolder>() {

    class CartHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameProduct: TextView = itemView.findViewById(R.id.nameProductTextView)
        var imageProduct: ImageView = itemView.findViewById(R.id.imageProduct)
        var costProduct : TextView = itemView.findViewById(R.id.costItemTextView)
        var countItemProduct : TextView = itemView.findViewById(R.id.countItextTextView)
        var buttonMinusProduct : Button = itemView.findViewById(R.id.buttonMinusProduct)
        var buttonPlusProduct : Button = itemView.findViewById(R.id.buttonPlusProduct)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_cart, parent, false)
        return CartHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CartHolder, position: Int) {
        holder.nameProduct.text = modelProduct[position].nameProduct
        holder.imageProduct.setImageResource(modelProduct[position].idImageProduct)
        holder.costProduct.text = modelProduct[position].costProduct.toString() + "₽"
        holder.countItemProduct.text = listCart.asSequence()
            .map { it }
            .groupBy { it.nameProduct }
            .map{ Pair(it.key, it.value.count()).second}.toSet().first().toString()
        holder.buttonMinusProduct.setOnClickListener {

        }
        holder.buttonPlusProduct.setOnClickListener {

        }
    }

    override fun getItemCount() = modelProduct.size
}