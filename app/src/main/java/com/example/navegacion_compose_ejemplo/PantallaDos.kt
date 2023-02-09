package com.example.navegacion_compose_ejemplo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PantallaDos(navController: NavHostController, idUsuario: Int) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Pantalla 2\nTu id de usuario es: $idUsuario",
                fontSize = 20.sp,
                color = Color.White
            )

            Button(
                onClick = { navController.navigate(Routes.PantallaUno.route) }
            ) {
                Text(
                    text = "Ir a pantalla 1"
                )
            }
        }
    }
}