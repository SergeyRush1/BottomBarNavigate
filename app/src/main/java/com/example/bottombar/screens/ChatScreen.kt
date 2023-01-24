package com.example.bottombar.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ChatScreen(){
    val content = 56
    LazyColumn(){
        items(content){
            Text(text = it.toString())
        }
    }
}