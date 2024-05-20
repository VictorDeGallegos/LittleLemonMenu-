package com.littlelemon.menu

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductsGrid(context: Context, products: Products, startProductActivity: (ProductItem) -> Unit) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(count = 2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(
            items = products.items,
            itemContent = { productItem: ProductItem ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { startProductActivity(productItem) },
                    elevation = 8.dp
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = productItem.image),
                            contentDescription = productItem.title,
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = productItem.title, style = MaterialTheme.typography.h6)
                        Text(text = "${productItem.price}$", style = MaterialTheme.typography.subtitle1)
                    }
                }
            }
        )
    }
}