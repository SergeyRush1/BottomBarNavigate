package com.example.bottombar.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottombar.helplers.BottomNavItems
import com.example.bottombar.screens.ChatScreen
import com.example.bottombar.screens.HomeScreen
import com.example.bottombar.screens.SettingsScreen

@Composable
fun NavigationGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomNavItems.Home.screen_route ){
        composable(BottomNavItems.Home.screen_route){
            HomeScreen()
        }
        composable(BottomNavItems.Chat.screen_route){
            ChatScreen()
        }
        composable(BottomNavItems.Settings.screen_route){
            SettingsScreen()
        }
    }
}