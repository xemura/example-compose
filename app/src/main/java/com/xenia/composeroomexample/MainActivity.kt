package com.xenia.composeroomexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListItem()
        }
    }
}

fun getList(): List<ItemRowModel> {
    return listOf(
        ItemRowModel(R.drawable.img, "WHAT", "I only noticed her when passing down the corridor, because of her really remarkable plainness. She was rather a large, awkward woman of about thirty-five with a big, red nose, and large spectacles."),
        ItemRowModel(R.drawable.img_1, "WHAT", "I think we may have exchanged half a dozen words at dinner, when passing one another the sugar or the bread. But they were certainly all we exchanged, and after we left the dining-car, I did not see Miss Bradley again until we reached Calais Maritime."),
        ItemRowModel(R.drawable.img_2, "WHAT", "And then our acquaintance really began, and it began entirely on my initiative. There were plenty of porters, and I called one without difficulty from the window of the train. But as I got off, I saw Miss Bradley standing on the platform with two large very old suit-cases. The porters were passing her by."),
        ItemRowModel(R.drawable.img, "WHAT", "I am quite sure that had she been an even slightly attractive woman, I should not have gone up to her, but she was so ugly, and looked so helpless that I approached her, and said: \"My porter has a barrow. Would you like him to put your cases on it too?\" Miss Bradley turned and looked at me."),
        ItemRowModel(R.drawable.img_1, "WHAT", "Before the boat had been under way for ten minutes, I realized that Miss Bradley was a remarkable bore. Shyly and hesitantly she kept on talking about nothing, and made no remark worth taking notice of."),
        ItemRowModel(R.drawable.img_2, "WHAT", "Normally, passengers for the Golden Arrow are dealt with by the customs first, as the train leaves twenty minutes before the ordinary boat train. When the boy asked if we were going on the Golden Arrow, I hesitated and then said \"Yes\"."),
        ItemRowModel(R.drawable.img, "WHAT", "As we went towards the Customs Hall, I explained carefully to her that my train left before hers, but that I would see her through the customs; the boy would then take the luggage to our trains, and she could sit comfortably in hers till it left. Miss Bradley said, \"Oh, thank you very much.\""),
        ItemRowModel(R.drawable.img_1, "WHAT", "The boy, of course, had put our suit-cases together on the counter, and Miss Bradley and I went and stood before them. In due course the customs examiner reached us, looked at the four suitcases in that human X-ray manner which customs examiners must practise night and morning, and said, \"This is all yours?\""),
        ItemRowModel(R.drawable.img_2, "WHAT", "I pointed my cases out. I had nothing to declare, and declared it. Without asking me to open them, the examiner chalked the cases and then, instead of moving to my left and dealing with Miss Bradley, moved to the right, and began X-raying somebody else's luggage."),
        ItemRowModel(R.drawable.img, "WHAT", "\"Well, I'll say good-bye now, and go and find my train. I expect the examiner will come back and do you next. The porter will stay and bring our luggage up to the trains when you're through. Good-bye.\""),
        ItemRowModel(R.drawable.img_1, "WHAT", "It must have been about twenty minutes later that I suddenly realized the train was due to leave in five minutes and that the porter had not yet brought my luggage. I was just going to look for him when he appeared, breathing heavily, with my suit-cases. I asked him rather what he had been doing."),
        ItemRowModel(R.drawable.img_2, "WHAT", "I have often wondered whether, when Miss Bradley stood so helplessly on the platform at Calais, she had already chosen me as the person to come to her rescue, or whether she was just sure that somebody would."),
    )
}

@Composable
fun ListItem() {
    LazyRow(modifier = Modifier.fillMaxWidth().background(Color.LightGray)) {
        itemsIndexed(
            getList()
        ) { _, item ->
            ItemRowFun(item = item)
        }
    }

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp).background(Color.LightGray)
    ) {
        itemsIndexed(getList())
        { _, item ->
            ItemColumnFun(item = item)
        }
    }
}
