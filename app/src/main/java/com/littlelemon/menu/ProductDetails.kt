package com.littlelemon.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProductDetails(productItem: ProductItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = productItem.image),
                contentDescription = productItem.title,
                modifier = Modifier.size(300.dp),

            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = productItem.title, style = MaterialTheme.typography.h5)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Price: $${productItem.price}", style = MaterialTheme.typography.subtitle1)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Category: ${productItem.category}", style = MaterialTheme.typography.subtitle1)
        }
    }
}