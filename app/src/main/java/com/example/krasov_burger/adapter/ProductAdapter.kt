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
class CartProduct {
    val listCart: ArrayList<ModelProduct> = arrayListOf(ModelProduct("The most delicious single",
        "The most delicious burger! And this is not a joke. Brioche bun, juicy beef patty, fresh tomatoes, " +
                "lettuce leaves, pickled cucumbers.",
        "from 450₽", R.drawable.burger1))

}

class ProductAdapter(private val modelProduct: List<ModelProduct>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameProduct: TextView = itemView.findViewById(R.id.nameProduct)
        var descriptionProduct: TextView = itemView.findViewById(R.id.descriptionProduct)
        var toCard: Button = itemView.findViewById(R.id.toCart)
        var imageProduct: ImageView = itemView.findViewById(R.id.imageProduct)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list_menu, parent, false)
        return ProductHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.nameProduct.text = modelProduct[position].nameProduct
        holder.descriptionProduct.text = modelProduct[position].descriptionProduct
        holder.toCard.text = modelProduct[position].toCard
        holder.imageProduct.setImageResource(modelProduct[position].idImageProduct)
        holder.toCard.setOnClickListener {
           CartProduct().listCart.add(ModelProduct(modelProduct[position].nameProduct,
                modelProduct[position].descriptionProduct,
                modelProduct[position].toCard,
                modelProduct[position].idImageProduct))
        }
    }

    override fun getItemCount() = modelProduct.size
}