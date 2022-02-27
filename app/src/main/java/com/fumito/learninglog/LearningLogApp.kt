package com.fumito.learninglog

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.fumito.learninglog.ui.components.LearningLogScaffold
import com.fumito.learninglog.ui.theme.LearningLogTheme

@Composable
fun LearningLogApp() {
    LearningLogTheme {
        LearningLogScaffold {
            Greeting("Droid")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
