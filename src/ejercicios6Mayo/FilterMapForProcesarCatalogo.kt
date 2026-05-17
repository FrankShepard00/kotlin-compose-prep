package ejercicios6Mayo

/*
Ejercicio 2 - Procesar catálogo
Dado el catálogo, en una sola cadena de operaciones:
1. Filtra productos con stock > 0
2. Filtra los que cuestan menos de 5000
3. Transforma cada uno a su nombre en mayúsculas
4. Imprime cada nombre resultante con forEach
*/

data class Producto4(val nombre: String, val precio: Double, val stock: Int)

fun main() {
    val catalogo = listOf(
        Producto4("Laptop", 15000.0, 5),
        Producto4("Mouse", 300.0, 0),
        Producto4("Teclado", 800.0, 10),
        Producto4("Monitor", 5000.0, 3),
        Producto4("Webcam", 1200.0, 7)
    )

    catalogo
        .filter { it.stock > 0 }
        .filter { it.precio < 5000 }
        .map { it.nombre.uppercase() }
        .forEach { println(it) }
}