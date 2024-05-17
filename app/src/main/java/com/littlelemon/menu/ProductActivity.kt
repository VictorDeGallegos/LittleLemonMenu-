package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val title = intent.getStringExtra("title")
        val price = intent.getDoubleExtra("price", 0.0)
        val category = intent.getStringExtra("category")
        val image = intent.getIntExtra("image", -1)
        val productItem = ProductItem(title ?: "", price, category ?: "", image)
        setContent { ProductDetails(productItem) }
    }
}