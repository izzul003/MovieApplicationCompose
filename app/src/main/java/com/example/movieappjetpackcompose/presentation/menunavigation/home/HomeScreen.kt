package com.example.movieappjetpackcompose.presentation.menunavigation.home

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
private fun PreviewHomeScreen() {
    HomeScreen()
}

@Composable
fun HomeScreen() {
    Text(text = "Home")
}