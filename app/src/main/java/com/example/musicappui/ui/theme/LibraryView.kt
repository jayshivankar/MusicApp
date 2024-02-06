package com.example.musicappui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Card
import androidx.compose.material.Text

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.unit.dp
import com.example.musicappui.R

@Composable
fun BrowseScreen() {
    val categories = listOf("Rock", "Pop", "Romance", "Favorites", "Jazz", "Country")
    val grouped = listOf<String>("New Releases", "Favourites", "top Rated").groupBy { it[0] }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        grouped.forEach { (title, items) ->
            // Display the group title
            //Text(text = title, modifier = Modifier.padding(16.dp))

            // Display items in the group
            items(categories) { cat ->
                Browserscreen(
                    cat = cat,
                    drawable = R.drawable.baseline_music_video_24
                )
            }
        }
    }



}
@Composable
fun Browserscreen(cat : String,drawable : Int){
    Card(modifier = Modifier
        .padding(16.dp)
        .size(200.dp),
        border = BorderStroke(3.dp,color = Color.Blue)
    ) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = cat)
            Image(painter = painterResource(id = drawable), contentDescription = cat )

        }

    }

}