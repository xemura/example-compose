package com.xenia.composeroomexample

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row (modifier = Modifier.background(Color.Yellow).fillMaxWidth().fillMaxHeight(0.5f)) {
                Row (modifier = Modifier.background(Color.Green).fillMaxWidth(0.5f).fillMaxHeight()) {
                    Text(text = "hello there!")
                    Text(text = "Text!")
                    Text(text = "hello there!")
                }
                Column (modifier = Modifier.background(Color.Blue).fillMaxHeight().fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "One!")
                    Text(text = "Two!")
                    Text(text = "Three!")
                }
            }
        }
    }
}
