package com.example.movieappjetpackcompose.ui.components.bottomnav

import androidx.annotation.DrawableRes
import com.example.movieappjetpackcompose.R

sealed class BottomNavMenus (
    val route: String,
    @DrawableRes val icon : Int
//    val title: String,
//    @DrawableRes val unActiveRes: Int,
//    @DrawableRes val activeRes: Int
) {
    object Home : BottomNavMenus(
        route = "home",
        icon = R.drawable.ic_home
    )

    object Popular : BottomNavMenus(
        route = "popular",
        icon = R.drawable.ic_popular
    )

    object Favorite : BottomNavMenus(
        route = "favorite",
        icon = R.drawable.ic_favorite
    )

    object Location : BottomNavMenus(
        route = "location",
        icon = R.drawable.ic_location
    )
}