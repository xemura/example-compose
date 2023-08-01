package com.xenia.composeroomexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListItem()
        }
    }
}

@Composable
fun ListItem() {
    LazyRow(modifier = Modifier.fillMaxWidth().background(Color.LightGray)) {
        itemsIndexed(
            listOf(
                ItemRowModel(R.drawable.img, "WHAT"),
                ItemRowModel(R.drawable.img_1, "WHAT"),
                ItemRowModel(R.drawable.img_2, "WHAT"),
                ItemRowModel(R.drawable.img, "WHAT"),
                ItemRowModel(R.drawable.img_1, "WHAT"),
                ItemRowModel(R.drawable.img_2, "WHAT"),
                )
        ) { index, item ->
            ItemRowFun(item = item)
        }
    }

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
    ) {
        itemsIndexed(listOf("Hello", "WHAT", "End"))
        { index, item ->
            Text(
                text = "Item $index and $item",
                fontSize = 30.sp,
                modifier = Modifier.padding(vertical = 10.dp))
        }
    }
}
