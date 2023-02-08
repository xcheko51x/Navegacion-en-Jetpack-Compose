package com.example.navegacion_compose_ejemplo

sealed class Routes(val route: String) {
    object PantallaUno: Routes("pantalla1")
    object PantallaDos: Routes("pantalla2")
    object PantallaTres: Routes("pantalla3")
}