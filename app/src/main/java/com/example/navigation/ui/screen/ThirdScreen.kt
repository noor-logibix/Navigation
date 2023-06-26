package com.example.navigation.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navigation.ui.component.Screen

@Composable
fun ThirdScreen(
    modifier: Modifier = Modifier,
    onNavigate: () -> Unit = {},
    onCancel: () -> Unit = {},
    onReturnToHome: () -> Unit = {}
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Screen(
            text = "Third",
            onNavigate = onNavigate,
            modifier = Modifier.weight(1f)
        )
        OutlinedButton(onClick = onCancel) {
            Text(text = "Cancel")
        }
        Spacer(modifier = Modifier.height(32.dp))
        OutlinedButton(onClick = onReturnToHome) {
            Text(text = "Home")
        }
        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview() {
    ThirdScreen(Modifier.fillMaxSize())
}