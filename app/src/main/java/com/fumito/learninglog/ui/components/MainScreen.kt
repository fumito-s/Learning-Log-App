@file:OptIn(ExperimentalFoundationApi::class)

package com.fumito.learninglog.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.*

@Composable
fun MainScreen() {
    LogGraph()
}

@Composable
fun LogGraph() {
    val list = List(365) { LogItem() }
    LazyVerticalGrid(
        cells = GridCells.Fixed(7),
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp)
    ) {
        items(list) { item ->
            LogCell(item = item)
        }
    }
}

@Composable
fun LogCell(item: LogItem) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .border(
                width = 2.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(10.dp)
            )
            .size(50.dp)
            .background(color = Color.White),
    ) {
        Text(text = item.commit.toString())
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

// あとで移す
data class LogItem(
    val date: Date = Date(),
    val commit: Int = 1
)
