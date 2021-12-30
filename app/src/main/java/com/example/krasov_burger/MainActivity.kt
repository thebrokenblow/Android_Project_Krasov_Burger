package com.example.krasov_burger

import android.graphics.Bitmap
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

open class ModelProduct(var nameProduct: String, var descriptionProduct: String, var toCard: String)

class ProductItems (
    var List: List<ModelProduct> = listOf(
        ModelProduct("Индейка в мандаринах",
            "Пастрами из индейки, соус альфредо, мандарины, цитросовый соус, моцарелла, смесь сыров чеддер и пармезан",
            "от 545₽"),
        ModelProduct("Пепперони фреш",
            "Пикантная пепперони, увеличенная порция моцареллы, томаты, томатный соус",
            "от 249₽"),
        ModelProduct("Песто",
            "Цыпленок, соус песто, кубики брынзы, томаты, моцарелла, соус альфредо",
            "от 449₽"),
        ModelProduct("Карбонара",
            "Бекон, сыры чеддер и пармезан, моцарелла, томаты, красный лук, чеснок, соус альфредо, итальянские травы",
            "от 449₽"),
        ModelProduct("Пицца из половинок",
            "Соберите свою пиццу 35 см с двумя разными вкусами",
            "от 630₽"),
        ModelProduct("Додо Микс",
            "Бекон, цыпленок, ветчина, сыр блю чиз, сыры чеддер и пармезан, соус песто, кубики брынзы, томаты, красный лук, моцарелла, соус альфредо, чеснок, итальянские травы",
            "от 499₽"),
    )
)

class NewtonAdapter(private val newtonList: List<ModelProduct>) : RecyclerView.Adapter<NewtonAdapter.NewtonHolder>() {
    class NewtonHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameProduct: TextView = itemView.findViewById(R.id.nameProduct)
        var descriptionProduct: TextView = itemView.findViewById(R.id.descriptionProduct)
        var toCard: Button = itemView.findViewById(R.id.toCard)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewtonHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return NewtonHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewtonHolder, position: Int) {
        holder.nameProduct.text = newtonList[position].nameProduct
        holder.descriptionProduct.text = newtonList[position].descriptionProduct
        holder.toCard.text = newtonList[position].toCard

    }

    override fun getItemCount() = newtonList.size
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsRecyclerView = findViewById<RecyclerView>(R.id.productRecyclerView)
        studentsRecyclerView.adapter = NewtonAdapter(ProductItems().List)
        studentsRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}