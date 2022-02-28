package com.fumito.learninglog.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
    // change list to  card composable
    val list = listOf("a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c", "a", "b", "c")
    LazyVerticalGrid(
        cells = GridCells.Fixed(7),
    ) {
        items(list) { item ->
            Text(text = item)
        }
    }
}


@Preview(showSystemUi = true, device = Devices.PIXEL_4)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
