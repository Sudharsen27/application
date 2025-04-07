//package com.example.myapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.myapplication.ui.theme.MyApplicationTheme
//
//// Main activity class that serves as the entry point of the application
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        // Enable edge-to-edge display for immersive experience
//        enableEdgeToEdge()
//        // Set the content using Jetpack Compose
//        setContent {
//            MyApplicationTheme {
//                // Scaffold provides a basic material design layout structure
//                Scaffold(
//                    modifier = Modifier.fillMaxSize()
//                ) { innerPadding ->
//                    // Pass the inner padding to the Greeting composable
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//// Composable function to display a greeting message
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier.padding(16.dp) // Add some padding for better spacing
//    )
//}
//
//// Preview composable to visualize the UI in Android Studio
//@Preview(showBackground = true, backgroundColor = 0xFFF0F0F0)
//@Composable
//fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
//}

package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

// Main activity class that serves as the entry point of the application
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Enable edge-to-edge display for immersive experience
        enableEdgeToEdge()
        // Set the content using Jetpack Compose
        setContent {
            MyApplicationTheme {
                // Scaffold provides a basic material design layout structure
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    // Pass the inner padding to the Greeting composable
                    Greeting(
                        name = "World Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Composable function to display a centered greeting message
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $name!",
            fontSize = 24.sp, // Optional: Adjust font size for visibility
            modifier = Modifier.padding(16.dp) // Maintain some padding
        )
    }
}

// Preview composable to visualize the UI in Android Studio
@Preview(showBackground = true, backgroundColor = 0xFFF0F0F0)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("World Android")
    }
}