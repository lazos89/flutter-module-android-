package com.example.testbeldapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testbeldapp.ui.theme.TestBeldAppTheme

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    // No additional code is needed if you want the whole app to be Flutter-based.
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestBeldAppTheme {
        Greeting("Android")
    }
}