package ejercicios

// Ejercicio 21: Saludo Personalizado
fun saludar(nombre: String): String {
    return "¡Hola, $nombre! Bienvenido a Kotlin."
}

// Ejercicio 22: Suma Exprés (función de una sola línea)
fun sumar(a: Int, b: Int) = a + b

// Ejercicio 23: Parámetro por Defecto
fun crearRectangulo(ancho: Int, alto: Int = 10): String {
    return "Rectángulo de ${ancho} x ${alto} (área: ${ancho * alto})"
}

// Ejercicio 25: Conversor de Dólares a Pesos Colombianos
fun convertirDolares(dolares: Double): Double {
    val tasaCambio = 4200.0 // 1 USD ≈ 4200 COP
    return dolares * tasaCambio
}

fun ejecutarBloque5() {
    println("=== BLOQUE 5: FUNCIONES Y PARÁMETROS ===")

    // Ejercicio 21
    println("21. ${saludar("Carlos")}")

    // Ejercicio 22
    val resultadoSuma = sumar(15, 27)
    println("22. Suma exprés de 15 + 27 = $resultadoSuma")

    // Ejercicio 23: con alto por defecto
    println("23. ${crearRectangulo(5)}")
    println("23. ${crearRectangulo(5, 20)}")

    // Ejercicio 24: Argumentos Nombrados - solo especificando ancho
    println("24. ${crearRectangulo(ancho = 8)}")

    // Ejercicio 25
    val dolares = 100.0
    val pesos = convertirDolares(dolares)
    println("25. $dolares USD = $pesos COP (tasa: 4200)")
}