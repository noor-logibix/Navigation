package com.example.navigation.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.navigation.ui.component.Screen

@Composable
fun FirstScreen(
    modifier: Modifier = Modifier,
    onNavigate: () -> Unit = {}
) {
    Surface(modifier = modifier) {
        Screen(
            text = "First",
            onNavigate = onNavigate,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    FirstScreen(modifier = Modifier.fillMaxSize())
}