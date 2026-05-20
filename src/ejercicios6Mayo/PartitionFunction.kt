package ejercicios6Mayo

/*
Ejercicio 4 - Función partition
Dado el inventario, divídelo en dos grupos:
productos disponibles (stock > 0) y agotados.
Imprime cuántos hay en cada grupo y los nombres de los agotados.
*/

data class Producto6(val nombre: String, val precio: Double, val stock: Int)

fun main() {
    val inventario = listOf(
        Producto6("Laptop", 15000.0, 5),
        Producto6("Mouse", 300.0, 0),
        Producto6("Teclado", 800.0, 10),
        Producto6("Monitor", 5000.0, 0),
        Producto6("Webcam", 1200.0, 3)
    )

    val (disponibles, agotados) = inventario.partition { it.stock > 0 }
    println("Número de productos disponibles: ${disponibles.size}")
    println("Número de productos agotados: ${agotados.size}")

    println("Productos agotados: ")
    agotados.forEach { println(it.nombre) }
}