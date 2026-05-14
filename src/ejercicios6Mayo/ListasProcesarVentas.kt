package ejercicios6Mayo

/*
Ejercicio 4 - Procesar ventas
Dada una lista de ventas, realiza estas operaciones
encadenando transformaciones:

1. Filtra solo las ventas mayores a 1000.0
2. Ordénalas de mayor a menor
3. Imprime la suma, promedio, máximo y mínimo
   de la lista ORIGINAL (no la filtrada)
*/

fun main() {
    val ventas = listOf(500.0, 1500.0, 800.0, 2000.0, 1200.0, 300.0, 1800.0)

    println("Ventas mayores: ${ventas.filter { it > 1000.0 }.sortedDescending()}")
    println("Mayor: ${ventas.max()} Menor: ${ventas.min()}")

    println("Suma: ${ventas.sum()}")
    println("Promedio ${"%.2f".format(ventas.average())}")
}