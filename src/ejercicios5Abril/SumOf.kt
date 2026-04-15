package ejercicios5Abril

fun main() {
    data class Producto(val nombre: String, val precio: Double, val cantidad: Int)

    val carrito = listOf(
        Producto("Laptop", 15000.0, 1),
        Producto("Mouse", 300.0, 2),
        Producto("Teclado", 800.0, 1)
    )

    // Suma simple de precios
    val totalPrecios = carrito.sumOf { it.precio }
    println("Total precios: $$totalPrecios")  // $16100.0

    // Suma con cálculo — precio por cantidad
    val totalCarrito = carrito.sumOf { it.precio * it.cantidad }
    println("Total carrito: $$totalCarrito")  // $16600.0

    // Suma de cantidades
    val totalArticulos = carrito.sumOf { it.cantidad }
    println("Total artículos: $totalArticulos")  // 4
}