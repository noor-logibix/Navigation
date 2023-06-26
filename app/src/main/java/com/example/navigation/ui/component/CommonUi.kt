package com.example.navigation.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen(
    text: String,
    modifier: Modifier = Modifier,
    onNavigate: () -> Unit = {}
) {
    Surface(modifier = modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
        ) {
            Text(text = text, fontSize = 48.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "SCREEN")
            OutlinedButton(onClick = onNavigate) {
                Text(text = "Navigate")
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DisplayPreview() {
    Screen("A")
}
