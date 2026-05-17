package ejercicios6Mayo

/*
Ejercicio 8 - Procesar códigos de producto
Dada una lista de códigos como String, intenta convertirlos
a Int. Los que no sean números válidos se ignoran.
Usa mapNotNull para hacerlo en una sola línea.
*/

fun main() {
    val codigos = listOf("1001", "abc", "1002", "xyz", "1003")

    val codigosInt = codigos.mapNotNull { it.toIntOrNull() }
    println("Resultado: $codigosInt")
    // Resultado: [1001, 1002, 1003]
}