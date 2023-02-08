package com.example.navegacion_compose_ejemplo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacion_compose_ejemplo.ui.theme.Navegacion_Compose_EjemploTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Navegacion_Compose_EjemploTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.PantallaUno.route
                    ) {
                        composable(Routes.PantallaUno.route) { PantallaUno(navigationController) }
                        composable(Routes.PantallaDos.route) { PantallaDos(navigationController) }
                        composable(Routes.PantallaTres.route) { PantallaTres(navigationController) }
                    }
                }
            }
        }
    }
}
