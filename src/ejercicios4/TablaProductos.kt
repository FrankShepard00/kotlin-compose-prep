package ejercicios4

/*
Ejercicio 6 - Generar tabla de productos
La función recibe una lista de pares (nombre, precio) y debe
imprimir una tabla alineada donde:
- El nombre ocupa 20 caracteres alineado a la izquierda (padEnd)
- El precio ocupa 10 caracteres alineado a la derecha (padStart)
  formateado con 2 decimales

- Recibe: List<Pair<String, Double>>
- No retorna nada, solo imprime
*/

fun imprimirTabla(productos: List<Pair<String, Double>>) {
    productos.forEach { (producto, precio) ->
        println("${producto.padEnd(20)}${"%.2f".format(precio).padStart(10)}")
    }
}

fun main() {
    val productos = listOf(
        "Laptop" to 15000.0,
        "Mouse" to 300.0,
        "Teclado" to 1200.0
    )
    imprimirTabla(productos)
    // Laptop               15000.00
    // Mouse                  300.00
    // Teclado               1200.00
}