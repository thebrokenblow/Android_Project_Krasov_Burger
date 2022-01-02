package com.example.krasov_burger.items

import com.example.krasov_burger.R
import com.example.krasov_burger.model.ModelProduct

class ProductItems (
    var list: List<ModelProduct> = listOf(
        ModelProduct("The most delicious single",
            "The most delicious burger! And this is not a joke.", 499.0, R.drawable.burger1),
        ModelProduct("BBQ L",
            "You haven't tried such a delicious BBQ yet! Burger with homemade bun, juicy beef patty. ", 439.0, R.drawable.burger2),
        ModelProduct("Mushroom l",
            "A fragrant burger with a signature black bun, fried mushrooms with onions in demiglas sauce", 395.0, R.drawable.burger3),
        ModelProduct("Classic l",
            "A classic that will appeal to everyone. A signature burger with a homemade bun, juicy. ", 395.0, R.drawable.burger4),
        ModelProduct("Fishburger l",
            "Especially for those who love fish, we have prepared a signature burger with a fluffy white.", 395.0, R.drawable.burger5)
    )
)