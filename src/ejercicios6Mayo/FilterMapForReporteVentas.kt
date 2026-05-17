package ejercicios6Mayo

/*
Ejercicio 4 - Reporte de ventas
Dado el mapa de ventas por vendedor, usa map y forEach para:
1. Transforma el mapa a una lista de strings con formato:
   "Vendedor: [nombre] | Ventas: $[total]"
2. Imprime cada línea con forEach
3. Imprime el total general al final
*/

fun main() {
    val ventas = mapOf(
        "Ana" to 45000.0,
        "Carlos" to 32000.0,
        "María" to 58000.0,
        "Pedro" to 27000.0
    )

    val logsVentas = ventas.map { (nombre, ventas) -> "Vendedor $nombre | Ventas: $ventas" }
    logsVentas.forEach { println(it) }
    println("Total de ventas: ${ventas.values.sum()}")
}