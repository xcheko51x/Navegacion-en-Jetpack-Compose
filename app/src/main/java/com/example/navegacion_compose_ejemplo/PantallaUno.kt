package com.example.navegacion_compose_ejemplo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun PantallaUno(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Pantalla 1",
                fontSize = 20.sp,
                color = Color.White
            )

            Button(
                onClick = { navController.navigate("pantalla2") }
            ) {
                Text(
                    text = "Ir a pantalla 2"
                )
            }
        }
    }
}