package ejercicios5Abril

/*
Ejercicio 2 - Buscar producto por ID
Escribe una función que reciba un ID (Int) y busque el nombre del producto
en el siguiente mapa. Si el producto existe, debe retornar su nombre.
Si no existe, debe retornar null.

- Recibe: id: Int
- Retorna: String? (el nombre del producto o null)
*/


val productos = mapOf(
    1 to "Laptop",
    2 to "Teclado",
    3 to "Monitor"
)

fun buscarProducto(id: Int): String? = productos[id]


fun main() {
    println(buscarProducto(1))  // Laptop
    println(buscarProducto(3))  // Monitor
    println(buscarProducto(9))  // null
}