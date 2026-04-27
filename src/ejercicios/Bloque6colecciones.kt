package ejercicios

// Ejercicio 29: Extensión de Int
fun Int.esNegativo(): Boolean = this < 0

// Ejercicio 30: Extensión de String
fun String.quitarEspacios(): String = this.replace(" ", "")

fun ejecutarBloque6() {
    println("=== BLOQUE 6: COLECCIONES Y EXTENSIONES ===")

    // Ejercicio 26: Lista de Compras
    val listaCompras = mutableListOf("Manzanas", "Leche", "Pan")
    println("26. Lista inicial: $listaCompras")
    listaCompras.add("Huevos")
    println("26. Después de añadir: $listaCompras")
    listaCompras.removeAt(1) // elimina el segundo elemento (índice 1 = "Leche")
    println("26. Después de eliminar el segundo: $listaCompras")

    // Ejercicio 27: Filtro de Precios
    val precios = listOf(15.0, 60.0, 30.0, 120.0, 45.0, 8.0, 99.0)
    val preciosMenoresA50 = precios.filter { it < 50 }
    println("27. Precios originales: $precios")
    println("27. Precios menores a 50: $preciosMenoresA50")

    // Ejercicio 28: Buscador con find
    val amigos = listOf("Bruno", "Alejandra", "Carlos", "Ana", "Miguel", "Andrés")
    val primerConA = amigos.find { it.startsWith("A") }
    println("28. Lista de amigos: $amigos")
    println("28. Primer nombre que empieza con 'A': $primerConA")

    // Ejercicio 29: Extensión de Int
    val numero1 = -5
    val numero2 = 8
    println("29. ¿$numero1 es negativo? ${numero1.esNegativo()}")
    println("29. ¿$numero2 es negativo? ${numero2.esNegativo()}")

    // Ejercicio 30: Extensión de String
    val textoConEspacios = "Hola Mundo desde Kotlin"
    println("30. Original: \"$textoConEspacios\"")
    println("30. Sin espacios: \"${textoConEspacios.quitarEspacios()}\"")
}