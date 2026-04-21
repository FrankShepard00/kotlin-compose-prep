package ejercicios5Abril

/*
Ejercicio 4 - Buscar primer producto agotado
Dada una lista de productos, encuentra el primero
con stock 0 e imprime su nombre. Una vez encontrado,
detén la búsqueda con break.

- Recibe: productos: List<Producto>
- Retorna: Unit
*/

data class Producto3(val nombre: String, val stock: Int)

fun buscarAgotado(productos: List<Producto3>) {
    for (producto in productos) {
        if (producto.stock <= 0) {
            println("Producto Agotado: ${producto.nombre}")
            break
        }
    }
}

fun main() {
    val productos = listOf(
        Producto3("Laptop", 5),
        Producto3("Mouse", 0),
        Producto3("Teclado", 10),
        Producto3("Monitor", 0)
    )
    buscarAgotado(productos)
    // Producto agotado: Mouse
}