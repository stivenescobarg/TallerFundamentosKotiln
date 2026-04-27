package ejercicios

fun ejecutarBloque4() {
    println("=== BLOQUE 4: CICLOS Y BUCLES ===")

    // Ejercicio 16: Conteo Simple con for
    print("16. Conteo del 1 al 10: ")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // Ejercicio 17: Cuenta Regresiva con downTo
    print("17. Cuenta regresiva del 10 al 1: ")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    // Ejercicio 18: Saltos de 3 con step
    print("18. Del 1 al 20 saltando de 3 en 3: ")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    // Ejercicio 19: While (casi) infinito
    var energia = 5
    println("19. While con energía:")
    while (energia > 0) {
        println("    Energía restante: $energia")
        energia--
    }
    println("    ¡Sin energía!")

    // Ejercicio 20: Do-While con contraseña simulada
    println("20. Do-While con contraseña simulada:")
    val contrasenasSimuladas = listOf("0000", "abcd", "1234") // la última es correcta
    var intentoIndex = 0
    var contrasena: String
    do {
        contrasena = contrasenasSimuladas[intentoIndex]
        println("    Intento ${intentoIndex + 1}: ingresando \"$contrasena\"")
        intentoIndex++
    } while (contrasena != "1234")
    println("    ¡Contraseña correcta!")
}