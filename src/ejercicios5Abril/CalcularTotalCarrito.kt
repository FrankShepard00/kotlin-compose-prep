package ejercicios5Abril

/*
Ejercicio 4 - Calcular total de carrito
Dada una lista de precios como String, calcula la suma total.
Usa try como expresión para manejar valores inválidos (cuenta como 0.0).
Retorna el total formateado con 2 decimales.

- Recibe: precios: List<String>
- Retorna: String con formato "Total: $[monto]"
*/

fun calcularTotal(precios: List<String>): String {
    val suma = precios.sumOf {
        try {
            it.toDouble()
        } catch (e: NumberFormatException) {
            0.0
        }
    }
    return "Total: $${("%.2f").format(suma)}"
}

fun main() {
    val carrito = listOf("150.0", "abc", "200.5", "xx", "99.9")
    println(calcularTotal(carrito))  // Total: $450.40
}