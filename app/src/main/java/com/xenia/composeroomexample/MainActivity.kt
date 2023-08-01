package com.xenia.composeroomexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")
                ListItem(name = "Naked Science", prof = "Article")

            }
        }
    }
}

@Composable
fun ListItem(name : String, prof: String) {
    var counter = remember {
        mutableStateOf(0)
    }
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .offset(0.dp, 0.dp).pointerInput(Unit) {
                detectDragGesturesAfterLongPress{ change, dragAmount ->
                    Log.d("Tag", "Long click $change $dragAmount")
                }
            }
            .clickable {
                counter.value++
                Log.d("Tag", "click")
            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {
        Box {
            Row (verticalAlignment = Alignment.CenterVertically) {
                Image (painterResource(id = R.drawable.img),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape))
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = counter.value.toString())
                    Text(text = prof)
                }
            }
        }
    }
}
