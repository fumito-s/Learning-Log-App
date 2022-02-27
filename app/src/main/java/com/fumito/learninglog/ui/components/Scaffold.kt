package com.fumito.learninglog.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LearningLogScaffold(
    modifier: Modifier = Modifier,
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    floatingActionButton: @Composable (() -> Unit) = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    isFloatingActionButtonDocked: Boolean = false,
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier,
        scaffoldState = scaffoldState,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = floatingActionButtonPosition,
        isFloatingActionButtonDocked = isFloatingActionButtonDocked,
        content = content
    )
}
