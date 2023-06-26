package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.screen.FirstScreen
import com.example.navigation.ui.screen.SecondScreen
import com.example.navigation.ui.screen.ThirdScreen
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationApp()
                }
            }
        }
    }
}

enum class Route {
    First,
    Second,
    Third
}

@Composable
fun NavigationApp(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Route.First.name
    ) {
        composable(Route.First.name) {
            FirstScreen(
                onNavigate = {
                    navController.navigate(Route.Second.name)
                }
            )
        }

        composable(Route.Second.name) {
            SecondScreen(
                onNavigate = {
                    navController.navigate(Route.Third.name)
                }
            )
        }

        composable(Route.Third.name) {
            ThirdScreen(
                onCancel = {
                    navController.navigateUp()
                },

                onReturnToHome = {
                    navController.popBackStack(Route.First.name, false)
                }
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun NavigationAppPreview() {
    NavigationTheme {
        NavigationApp()
    }
}
