package com.example.krasov_burger.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.krasov_burger.CartActivity
import com.example.krasov_burger.R
import com.example.krasov_burger.model.ModelProduct

class CartAdapter(private val modelProduct: List<Pair<ModelProduct, Int>>) : RecyclerView.Adapter<CartAdapter.CartHolder>() {

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
        holder.nameProduct.text = modelProduct[position].first.nameProduct
        holder.imageProduct.setImageResource(modelProduct[position].first.idImageProduct)
        holder.costProduct.text = modelProduct[position].first.costProduct.toString() + "₽"
        holder.countItemProduct.text = modelProduct[position].second.toString()
        holder.buttonMinusProduct.setOnClickListener {
            if (holder.countItemProduct.text.toString().toInt() > 0 && listCart.size > 0) {
                holder.countItemProduct.text =
                    (holder.countItemProduct.text.toString().toInt() - 1).toString()
                listCart.removeAt(position)
            }
        }
        holder.buttonPlusProduct.setOnClickListener {
            if (holder.countItemProduct.text.toString().toInt() < 50) {
                holder.countItemProduct.text =
                    (holder.countItemProduct.text.toString().toInt() + 1).toString()
                listCart.add(ModelProduct(modelProduct[position].first.nameProduct,
                    modelProduct[position].first.descriptionProduct,
                    modelProduct[position].first.costProduct,
                    modelProduct[position].first.idImageProduct))
            }
        }
    }

    override fun getItemCount() = modelProduct.size
}