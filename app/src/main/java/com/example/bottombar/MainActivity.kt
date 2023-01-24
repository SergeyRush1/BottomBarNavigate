package com.example.bottombar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.bottombar.navigate.BottomNavigationFun
import com.example.bottombar.navigate.NavigationGraph
import com.example.bottombar.ui.theme.BottombarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            BottombarTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        bottomBar = { BottomNavigationFun(navContoller = navController) }

                    ) {
                        NavigationGraph(navController = navController)
                }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationFun(navContoller = navController) }

    ) {
        NavigationGraph(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottombarTheme {
        Greeting("Android")
    }
}