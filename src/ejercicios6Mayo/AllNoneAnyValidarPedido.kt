package ejercicios6Mayo

/*
Ejercicio 4 - Validar pedido
Dado un pedido con productos, verifica:
1. ¿Hay algún producto sin stock?
2. ¿Todos los productos tienen precio válido (> 0)?
3. ¿Ningún producto tiene nombre vacío?
Imprime un mensaje descriptivo para cada verificación.
*/

data class Producto5(val nombre: String, val precio: Double, val stock: Int)

fun main() {
    val pedido = listOf(
        Producto5("Laptop", 15000.0, 5),
        Producto5("Mouse", 300.0, 0),
        Producto5("Teclado", 800.0, 10)
    )

    val productoSinStock = pedido.any { it.stock == 0 }
    println("1. ¿Hay algún producto sin stock?\n$productoSinStock")
    val preciosValidos = pedido.all { it.precio > 0 }
    println("2. ¿Todos los productos tienen precio válido (> 0)?\n$preciosValidos")
    val nombreVacio = pedido.none { it.nombre.isBlank() }
    println("3. ¿Ningún producto tiene nombre vacío?\n$nombreVacio")
}
