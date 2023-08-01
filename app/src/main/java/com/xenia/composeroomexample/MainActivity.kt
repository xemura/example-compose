package com.xenia.composeroomexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
            LazyRow(modifier = Modifier.fillMaxSize()) {
                itemsIndexed(listOf("Hello", "WHAT", "End"))
                { index, item ->
                    Text(
                        text = "Item $index and $item",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(horizontal = 10.dp))
                }
            }

            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize().padding(50.dp)
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
    }
}

@Composable
fun ListItem() {
    val counter = remember {
        mutableStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.LightGray)
    }


    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Button(onClick = {
            when (++counter.value) {
                10 -> {
                    color.value = Color.Magenta
                }
                20 -> color.value = Color.Yellow
            }
        },
            colors = ButtonDefaults.buttonColors(color.value),
            shape = RoundedCornerShape(20.dp))

        {
            Text(text = counter.value.toString(), color = Color.Black)
            Text(text = " click", color = Color.Black)
        }
    }
}
