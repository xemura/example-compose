package com.xenia.composeroomexample.bottom_navigation

import com.xenia.composeroomexample.R

sealed class BottomItem(
    val title: String,
    val iconId: Int,
    val route: String,
    ) {
    object Screen1 : BottomItem("Screen 1", R.drawable.screen_one, "screen_1")
    object Screen2 : BottomItem("Screen 2", R.drawable.screen_two, "screen_2")
    object Screen3 : BottomItem("Screen 3", R.drawable.screen_three, "screen_3")
    object Screen4 : BottomItem("Screen 4", R.drawable.screen_four, "screen_4")
}
