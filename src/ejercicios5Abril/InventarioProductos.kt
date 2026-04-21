package ejercicios5Abril

/*
Ejercicio 2 - Inventario de productos
Dada una lista de productos, imprímelos numerados usando
withIndex() para obtener el índice y el elemento al mismo tiempo.

- Recibe: productos: List<String>
- Retorna: Unit
- El formato debe ser: "1. Laptop", "2. Mouse", etc.
*/

fun mostrarInventario(productos: List<String>) {
    for ((indice, producto) in productos.withIndex()) {
        println("${indice + 1}. $producto")
    }
}

fun main() {
    val productos = listOf("Laptop", "Mouse", "Teclado", "Monitor")
    mostrarInventario(productos)
    // 1. Laptop
    // 2. Mouse
    // 3. Teclado
    // 4. Monitor
}