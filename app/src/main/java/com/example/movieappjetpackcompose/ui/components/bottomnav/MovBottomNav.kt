package com.example.movieappjetpackcompose.ui.components.bottomnav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.movieappjetpackcompose.ui.theme.Neutral5
import com.example.movieappjetpackcompose.ui.theme.Primary1
import com.example.movieappjetpackcompose.ui.theme.White

@Composable
@Preview(showBackground = true)
private fun PreviewMovBottomNav() {
    Row(Modifier.fillMaxWidth()) {
        MovBottomNav()
    }
}

@Composable
fun MovBottomNav(
    navController: NavHostController = rememberNavController(),
    menus: List<BottomNavMenus> = listOf(
        BottomNavMenus.Home,
        BottomNavMenus.Popular,
        BottomNavMenus.Favorite,
        BottomNavMenus.Location
    )
){
    var selectedPos by remember { mutableStateOf(0) }

    Column (
        Modifier
            .fillMaxWidth()
            .background(White)
    ){
        Row(Modifier.fillMaxWidth()) {
            menus.forEachIndexed { index, _ ->
                Divider(
                    modifier = Modifier.weight(1f),
                    color = if (selectedPos == index) Primary1 else White,
                    thickness = 3.dp
                )
            }
        }

         BottomNavigation(backgroundColor = White, elevation = 0.dp) {
             menus.forEachIndexed { index, screen ->
                 val isSelected = selectedPos == index
                 val color = if (isSelected) Primary1 else Neutral5

                 BottomNavigationItem(
                     selected = isSelected,
                     icon = {
                         Icon(
                             painter = painterResource(id = screen.icon),
                             contentDescription = screen.route,
                             tint = color
                         )
                     },
                     onClick = {
                         if (isSelected) return@BottomNavigationItem
                         selectedPos = index
                         navController.navigate(screen.route) {
                             navController.graph.startDestinationRoute?.let {
                                 popUpTo(it) { saveState = true }
                             }
                             launchSingleTop = true
                         }
                     }
                 )
             }
         }
    }
}