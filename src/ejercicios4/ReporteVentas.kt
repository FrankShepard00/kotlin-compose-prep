package ejercicios4

/*
Ejercicio 7 - Generar reporte de ventas
La función recibe una lista de pares (producto, ventas) y debe
imprimir un reporte con el siguiente formato:
- Encabezado con columnas: PRODUCTO (20 chars, izquierda) y VENTAS (10 chars, derecha)
- Separador de 30 guiones
- Cada fila con el producto alineado a la izquierda y las ventas
  con 2 decimales alineadas a la derecha
- No retorna nada, solo imprime
*/

fun imprimirReporte(ventas: List<Pair<String, Double>>) {
    println("Producto".padEnd(20) + "Ventas".padEnd(10))
    println("-".repeat(30))
    ventas.forEach { (producto, venta) ->
        println("${"%-20s".format(producto)} ${"%10.2f".format(venta)}")
    }
}

fun main() {
    val ventas = listOf(
        "Laptop" to 15000.50,
        "Mouse" to 300.0,
        "Teclado" to 1200.75
    )
    imprimirReporte(ventas)
    // PRODUCTO             VENTAS
    // ------------------------------
    // Laptop                15000.50
    // Mouse                   300.00
    // Teclado                1200.75
}