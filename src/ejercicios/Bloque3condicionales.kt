package ejercicios

fun ejecutarBloque3() {
    println("=== BLOQUE 3: CONDICIONALES ===")

    // Ejercicio 11: Mayoría de Edad
    val edad = 20
    if (edad >= 18) {
        println("11. La persona puede votar (edad: $edad)")
    } else {
        println("11. La persona NO puede votar (edad: $edad)")
    }

    // Ejercicio 12: If como Expresión
    val nota = 75
    val resultado = if (nota >= 60) "Aprobado" else "Reprobado"
    println("12. Nota: $nota → $resultado")

    // Ejercicio 13: Semáforo con when
    val color = "Rojo"
    when (color) {
        "Rojo"     -> println("13. Semáforo: Pare")
        "Amarillo" -> println("13. Semáforo: Precaución")
        "Verde"    -> println("13. Semáforo: Siga")
        else       -> println("13. Color desconocido")
    }

    // Ejercicio 14: Rangos en When
    val temperatura = 22
    when {
        temperatura < 15        -> println("14. Temperatura $temperatura°C → Frío")
        temperatura in 15..25   -> println("14. Temperatura $temperatura°C → Templado")
        temperatura > 25        -> println("14. Temperatura $temperatura°C → Calor")
    }

    // Ejercicio 15: Verificación de Tipo con is
    val variable: Any = "Soy un String"
    when (variable) {
        is String -> println("15. La variable es un String: \"$variable\"")
        is Int    -> println("15. La variable es un Int: $variable")
        else      -> println("15. La variable es de otro tipo")
    }
}