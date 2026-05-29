package ejercicios6Mayo

/*
Ejercicio 5 - Ordenar productos
Dada una lista de productos, retorna los nombres de los productos
con stock mayor a 0, ordenados por precio ascendente.
- Recibe: List<Producto>
- Retorna: List<String> con los nombres ordenados por precio
*/

data class Product(val nombre: String, val precio: Double, val stock: Int)

fun productosDisponibles(productos: List<Product>): List<String> {
    return productos.filter { it.stock > 0 }.sortedBy { it.precio }.map { it.nombre }
}

fun main() {
    val productos = listOf(
        Product("Laptop", 15000.0, 3),
        Product("Mouse", 300.0, 0),
        Product("Teclado", 800.0, 8),
        Product("Monitor", 5000.0, 5)
    )
    println(productosDisponibles(productos)) // [Teclado, Monitor, Laptop]
}