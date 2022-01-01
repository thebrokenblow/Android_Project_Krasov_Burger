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

var listCart: ArrayList<ModelProduct> = arrayListOf()

class ProductAdapter(private val modelProduct: List<ModelProduct>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameProductTextView: TextView = itemView.findViewById(R.id.nameProductTextView)
        var descriptionProductTextView: TextView = itemView.findViewById(R.id.descriptionProductTextView)
        var costProductTextView: TextView = itemView.findViewById(R.id.costProductTextView)
        var toCardButton: Button = itemView.findViewById(R.id.toCartButton)
        var imageProductMenu: ImageView = itemView.findViewById(R.id.imageProductMenu)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_menu, parent, false)
        return ProductHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.nameProductTextView.text = modelProduct[position].nameProduct
        holder.descriptionProductTextView.text = modelProduct[position].descriptionProduct
        holder.costProductTextView.text = modelProduct[position].costProduct.toString() + "₽"
        holder.imageProductMenu.setImageResource(modelProduct[position].idImageProduct)
        holder.toCardButton.setOnClickListener {
           listCart.add(ModelProduct(modelProduct[position].nameProduct,
                modelProduct[position].descriptionProduct,
                modelProduct[position].costProduct,
                modelProduct[position].idImageProduct))
        }
    }

    override fun getItemCount() = modelProduct.size
}