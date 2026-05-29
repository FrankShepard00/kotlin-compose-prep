package ejercicios6Mayo

/*
Ejercicio 2 - Construir resumen de productos
Dada una lista de productos, usa fold para construir
un String con el siguiente formato exacto:
"Productos: Laptop, Mouse, Teclado"
- Recibe: List<String> con los nombres
- Retorna: String con el formato indicado
- El separador entre productos es ", " (coma + espacio)
- El primer elemento va después de "Productos: " sin separador previo
*/

fun resumenProductos(productos: List<String>): String {
    return productos.fold("Productos:") { acc, s -> "$acc $s," }.dropLast(1)
}

fun main() {
    val productos = listOf("Laptop", "Mouse", "Teclado")
    println(resumenProductos(productos)) // Productos: Laptop, Mouse, Teclado
    println()
    val numeros = listOf(1, 2, 3, 4, 5)
    println(numeros.runningFold(0) { acc, n -> acc + n })
    // [0, 1, 3, 6, 10, 15]


}