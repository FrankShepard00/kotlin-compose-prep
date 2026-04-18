package ejercicios5Abril

/*
Ejercicio 2 - Calcular descuento
Escribe una función que calcule el precio final de un producto
aplicando un porcentaje de descuento.

- Recibe: precio: Double, descuentoPorcentaje: Int
- Retorna: Double (precio final después del descuento)
- Ambos parámetros siempre tendrán valor, nunca serán null

Ejemplo: precio 1000.0 con 20% de descuento → 800.0
*/

fun calcularDescuento(precio: Double, descuentoPorcentaje: Int): Double {
    return precio - (precio * descuentoPorcentaje / 100)
}

fun main() {
    println(calcularDescuento(1000.0, 20))  // 800.0
    println(calcularDescuento(500.0, 10))   // 450.0
    println(calcularDescuento(250.0, 0))    // 250.0
}