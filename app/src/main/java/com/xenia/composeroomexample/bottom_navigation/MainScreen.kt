package com.xenia.composeroomexample.bottom_navigation

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(context: Context) {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        snackbarHost = { host ->
                       androidx.compose.material.SnackbarHost(hostState = host) { data ->
                           Snackbar(
                               snackbarData = data,
                               backgroundColor = Color.White,
                               shape = RoundedCornerShape(20.dp),
                               contentColor = Color.Green,
                               modifier = Modifier.padding(bottom = 100.dp)
                           )
                       }
        },
        topBar =
        {
            TopAppBar(
                title = {
                    Text(text = "Menu")
                },
                backgroundColor = Color.White,
                navigationIcon = {
                    IconButton(
                        onClick = {
                            Toast.makeText(context,"menu", Toast.LENGTH_SHORT).show()
                        }
                    ) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(
                        onClick = {
                            coroutineScope.launch {
                                val result = scaffoldState.snackbarHostState.showSnackbar(
                                    message = "Item deleted",
                                    actionLabel = "Undone"
                                )
                                if (result == SnackbarResult.ActionPerformed) {
                                    Toast.makeText(context, "item recovered", Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                    ) {
                        Icon(imageVector = Icons.Filled.Delete, contentDescription = null)
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(imageVector = Icons.Filled.Share, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {BottomNavigation(navController = navController)}
    ) {
        NavGraph(navHostController = navController)
    }
}