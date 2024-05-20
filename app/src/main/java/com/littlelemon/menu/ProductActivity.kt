package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Obtén los valores de intent
        val title = intent.getStringExtra(KEY_TITLE)
        val price = intent.getDoubleExtra(KEY_PRICE, 0.0)
        val category = intent.getStringExtra(KEY_CATEGORY)
        val image = intent.getIntExtra(KEY_IMAGE, -1)

        // Crea un ProductItem con los valores obtenidos
        val productItem = ProductItem(title ?: "", price, category ?: "", image)

        // Pasa productItem a ProductDetails
        setContent { ProductDetails(productItem) }
    }

    companion object {
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_CATEGORY = "category"
        const val KEY_IMAGE = "image"
    }
}