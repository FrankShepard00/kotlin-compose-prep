package ejercicios5Abril

/*
Ejercicio 4 - Calcular descuento
Escribe una función que reciba un precio nullable y calcule
el 10% de descuento usando ?.let.
Si el precio es null, retorna 0.0.

- Recibe: precio: Double?
- Retorna: Double
- Usa ?.let con Elvis para el valor por defecto
*/

fun calcularDescuento(precio: Double?): Double {
    return precio?.let { (it * 10.0) / 100 } ?: 0.0
}

fun main() {
    println(calcularDescuento(1500.0))  // 150.0
    println(calcularDescuento(200.0))   // 20.0
    println(calcularDescuento(null))    // 0.0
}