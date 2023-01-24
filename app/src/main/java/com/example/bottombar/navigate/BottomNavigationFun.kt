package com.example.bottombar.navigate

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.bottombar.helplers.BottomNavItems

@Composable
fun BottomNavigationFun(navContoller:NavController) {
    val items = listOf(
        BottomNavItems.Settings,
        BottomNavItems.Home,
        BottomNavItems.Chat
    )
    BottomNavigation(
        backgroundColor = Color.Blue,
        contentColor = Color.Black) {
        val navBackStackEntry by navContoller.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach{  item ->
            BottomNavigationItem(selected = currentRoute== item.screen_route,
                icon = { Icon(painter = painterResource(id = item.icon) , contentDescription = item.title )},
                label = { Text(text = item.title, fontSize = 14.sp)},
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                onClick = { navContoller.navigate(item.screen_route){
                    navContoller.graph.startDestinationRoute?.let { screen_route ->
                        popUpTo(screen_route){
                        saveState = true}
                    }
                    launchSingleTop = true
                    restoreState = true
                } }
            )
        }
    }

}

