package ejercicios

// Ejercicio 5: Constantes Reales - objeto Constants con const val
object Constants {
    const val VELOCIDAD_DE_LA_LUZ = 299_792_458 // metros por segundo
}

fun ejecutarBloque1() {
    println("=== BLOQUE 1: VARIABLES Y TIPOS DE DATOS ===")

    // Ejercicio 1: Perfil de Usuario
    val nombre = "Stiven Escobar"
    var ciudad = "Bello"
    println("1. Nombre: $nombre")
    println("1. Ciudad inicial: $ciudad")
    ciudad = "Medellín"
    println("1. Ciudad actualizada: $ciudad")

    // Ejercicio 2: Calculadora de Años
    val anioNacimiento = 2000
    val anioActual = 2025
    val edad = anioActual - anioNacimiento
    println("2. Año de nacimiento: $anioNacimiento | Edad aproximada: $edad años")

    // Ejercicio 3: Tipos Explícitos
    val precioCoche: Double = 25999.99
    val pesoNaranja: Float = 0.2f
    val poblacionMundo: Long = 8_100_000_000L
    println("3. Precio coche: $precioCoche | Peso naranja: $pesoNaranja | Población mundo: $poblacionMundo")

    // Ejercicio 4: Inferencia
    val estaLloviendo = true
    println("4. ¿Está lloviendo? $estaLloviendo (tipo inferido: Boolean)")

    // Ejercicio 5: Constantes Reales
    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_DE_LA_LUZ} m/s")
}