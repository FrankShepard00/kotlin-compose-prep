package ejercicios6Mayo

/*
Ejercicio 4 - Inferencia en colecciones
Escribe el código usando inferencia de tipos (sin tipos explícitos).
El compilador debe inferir todo del contexto.
*/

data class Producto(val nombre: String, val precio: Double, val activo: Boolean)

fun main() {
    val productos = listOf(
        Producto("Laptop", 15000.0, true),
        Producto("Mouse", 250.0, false),
        Producto("Teclado", 800.0, true),
        Producto("Monitor", 5000.0, true)
    )

    // 1. Filtra solo los activos
    val activos = productos.filter { it.activo }// Tu código

    // 2. Obtén solo los nombres
    val nombres = productos.map { it.nombre }// Tu código

    // 3. Suma los precios de los activos
    val total = productos.filter { it.activo }.sumOf { it.precio }

    println(activos.size)  // 3
    println(nombres)       // [Laptop, Mouse, Teclado, Monitor]
    println(total)         // 20800.0
}