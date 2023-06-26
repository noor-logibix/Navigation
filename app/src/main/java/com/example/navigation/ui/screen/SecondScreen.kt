package com.example.navigation.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigation.ui.component.Screen

@Composable
fun SecondScreen(
    modifier: Modifier = Modifier,
    onNavigate: () -> Unit = {}
) {
    Screen(
        text = "Second", modifier = Modifier.fillMaxSize(),
        onNavigate = onNavigate
    )
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    SecondScreen()
}