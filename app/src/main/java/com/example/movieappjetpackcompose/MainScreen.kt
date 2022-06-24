package com.example.movieappjetpackcompose

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.movieappjetpackcompose.ui.components.bottomnav.MovBottomNav

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            MovBottomNav(navController = navController)
        }
    ) {

    }
}