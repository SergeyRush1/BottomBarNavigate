package com.example.bottombar.helplers

import com.example.bottombar.R


sealed class BottomNavItems(var title:String, var icon:Int, var screen_route:String ){
    object Home : BottomNavItems("Home", R.drawable.baseline_home_24,"home")
    object Chat: BottomNavItems("Chat",R.drawable.baseline_chat_24,"chat")
    object Settings : BottomNavItems("Settings",R.drawable.baseline_settings_24,"settings")
}
