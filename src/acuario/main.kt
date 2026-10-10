package acuario

fun construirAcuario() {
    // Acuario con dimensiones predeterminadas
    val miAcuario = Acuario()
    miAcuario.imprimirTamano()

    // Solo cambiamos el ancho
    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()

    // Cambiamos el alto y el largo
    val acuario3 = Acuario(alto = 35, largo = 110)
    acuario3.imprimirTamano()

    // Personalizamos todas las dimensiones
    val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    acuario4.imprimirTamano()

    // Acuario 6: constructor secundario para 29 peces
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    // Acuario 7: modificamos el volumen usando set()
    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()

    acuario7.volumen = 70
    acuario7.imprimirTamano()

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    // Prueba de herencia: acuario rectangular
    val acuario9 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario9.imprimirTamano()

    // Prueba de herencia: tanque cilíndrico
    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()

}

fun main() {
    construirAcuario()
}