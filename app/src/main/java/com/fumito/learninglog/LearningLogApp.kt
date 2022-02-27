package com.fumito.learninglog

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fumito.learninglog.ui.components.LearningLogScaffold
import com.fumito.learninglog.ui.theme.LearningLogTheme

@Composable
fun LearningLogApp() {
    val navController = rememberNavController()

    LearningLogTheme {
        LearningLogScaffold {
            NavHost(navController, startDestination = "main") {
                composable("main") {
                    Greeting("Droid")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
