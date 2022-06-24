package com.example.movieappjetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.movieappjetpackcompose.ui.components.bottomnav.BottomNavMenus

@Composable
internal fun MainScreenNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = BottomNavMenus.Home.route,
    ) {
        composable(route = BottomNavMenus.Home.route){
//            HomeScreen()
        }
        composable(route = BottomNavMenus.Popular.route){
//            PopularScreen()
        }
        composable(route = BottomNavMenus.Favorite.route){
//            PopularScreen()
        }
        composable(route = BottomNavMenus.Location.route){
//            PopularScreen()
        }
    }
}