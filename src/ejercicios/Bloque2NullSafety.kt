package ejercicios

fun ejecutarBloque2() {
    println("=== BLOQUE 2: NULL SAFETY ===")

    // Ejercicio 6: El Opcional
    val apodo: String? = null
    println("6. Apodo: $apodo")

    // Ejercicio 7: Operador Elvis
    val apodoMostrado = apodo ?: "Sin apodo"
    println("7. Apodo con Elvis: $apodoMostrado")

    // Ejercicio 8: Llamada Segura
    val texto: String? = "Hola Kotlin"
    println("8. Longitud con llamada segura: ${texto?.length}")

    val textoNulo: String? = null
    println("8. Longitud de nulo con llamada segura: ${textoNulo?.length}")

    // Ejercicio 9: Uso de Let
    val correo: String? = "usuario@email.com"
    correo?.let {
        println("9. Correo enviado a $it")
    }

    val correoNulo: String? = null
    correoNulo?.let {
        println("9. Este mensaje no se imprime si es nulo")
    }
    if (correoNulo == null) {
        println("9. El correo es nulo, no se ejecutó el let")
    }

    // Ejercicio 10: Aserción No Nula (!!)
    // !! fuerza el valor, lanza NullPointerException si es null
    val valorNulable: String? = "Kotlin"
    val longitud = valorNulable!!.length
    println("10. Longitud con !!: $longitud (¡cuidado con el crash si fuera null!)")
}
