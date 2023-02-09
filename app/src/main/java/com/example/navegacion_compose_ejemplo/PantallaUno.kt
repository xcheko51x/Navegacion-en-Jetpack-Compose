package com.example.navegacion_compose_ejemplo

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

/*@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Extra() {
    PantallaUno(navController = rememberNavController())
} */

@Composable
fun PantallaUno(navController: NavHostController) {

    var idUsuario by remember { mutableStateOf("") }

    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Pantalla 1",
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedTextField(
                value = idUsuario,
                onValueChange = { idUsuario = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                label = { Text(text = "Id usuario") }
            )
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = {
                    if (idUsuario == "") idUsuario = 0.toString()
                    navController.navigate(Routes.PantallaDos.crearRoute(idUsuario.toInt()))
                }
            ) {
                Text(
                    text = "Ir a pantalla 2"
                )
            }
        }
    }
}
