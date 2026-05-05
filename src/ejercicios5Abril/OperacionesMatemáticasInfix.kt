package ejercicios5Abril

import kotlin.math.pow

/*
Ejercicio 4 - Operaciones matemáticas legibles
Crea dos funciones infix para operaciones matemáticas:

- Int.elevadoA(exponente: Int): Int → calcula la potencia
- Int.entre(divisor: Int): Double → divide y retorna Double

*/

// Tus funciones infix aquí
infix fun Int.elevadoA(num: Int): Int = this.toDouble().pow(num.toDouble()).toInt()
infix fun Int.entre(num: Int): Double = if (num != 0) this.toDouble() / num else 0.0


fun main() {
    println(2 elevadoA 3)   // 8
    println(10 entre 4)     // 2.5

    // Combinar
    val resultado = (3 elevadoA 2) + (4 elevadoA 2)
    println(resultado)      // 25
}