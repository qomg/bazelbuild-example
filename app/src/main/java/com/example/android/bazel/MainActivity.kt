package com.example.android.bazel

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        window?.navigationBarColor = Color.TRANSPARENT
        setContent {
            HelloWorld("Jetpack Compose")
        }
    }

    @Preview
    @Composable
    fun HelloWorld(name: String) {
        MaterialTheme {
            Scaffold {
                Box(
                    modifier = Modifier//.windowInsetsPadding(WindowInsets(0))
                        .safeDrawingPadding()
                        .fillMaxSize()
                        .padding(it),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = "Hello $name",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp
                    )
                }
            }
        }
    }
}