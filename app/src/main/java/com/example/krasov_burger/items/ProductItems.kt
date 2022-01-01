package com.example.krasov_burger.items

import com.example.krasov_burger.R
import com.example.krasov_burger.model.ModelProduct

class ProductItems (
    var list: List<ModelProduct> = listOf(

        ModelProduct("The most delicious single",
            "The most delicious burger! And this is not a joke. Brioche bun, juicy beef patty, fresh tomatoes, " +
                    "lettuce leaves, pickled cucumbers.",
            "from 450₽", R.drawable.burger1),
        ModelProduct("BBQ L",
            "You haven't tried such a delicious BBQ yet! Burger with homemade bun, juicy beef patty, " +
                    "stretching Cheddar cheese, fried onions and fresh iceberg lettuce.",
            "from 450₽", R.drawable.burger2),
        ModelProduct("Mushroom l",
            "A fragrant burger with a signature black bun, fried mushrooms with onions in demiglas sauce, " +
                    "juicy beef patty, crispy turkey chips, fresh lettuce leaves and tomatoes.",
            "from 430₽", R.drawable.burger3),
        ModelProduct("Classic l",
            "A classic that will appeal to everyone. A signature burger with a homemade bun, juicy " +
                    "beef patty with slices of cheddar cheese, which perfectly complement fresh lettuce leaves.",
            "from 385₽", R.drawable.burger4),
        ModelProduct("Fishburger l",
            "Especially for those who love fish, we have prepared a signature burger with a fluffy white " +
                    "bun and juicy fish fillet, cucumbers, pickled onions and fresh lettuce leaves, seasoned with tartar sauce.",
            "from 385₽", R.drawable.burger5),
        ModelProduct("Mega burger",
            "Huge, juicy, powerful burger Classic weighing 1 kilogram",
            "from 685₽", R.drawable.burger6),
        ModelProduct("The bachelor burger",
            "Homemade bun, signature sauce with truffle oil, mozzarella cheese, crispy turkey chips, " +
                    "primbif marbled beef patty, caesar salad, tomatoes, Moscow salad. 380 g.",
            "from 385₽", R.drawable.burger7),
        ModelProduct("Italian l",
            "Enjoy the refined and balanced taste of our Italian burger. With homemade bun, juicy beef patty, " +
                    "iceberg salad, seasoned with caesar sauce and parmesan.",
            "from 500₽", R.drawable.burger8),
    )
)