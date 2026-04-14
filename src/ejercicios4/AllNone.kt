package ejercicios4

fun main() {
    val numeros = listOf(2, 4, 6, 8, 10)
    val vacia = emptyList<Int>()

    println(numeros.all { it % 2 == 0 }) // true
    println(numeros.all { it > 5 }) // false
    println(numeros.none { it % 2 != 0 }) // true
    println(numeros.none { it > 5 }) // false
    println(vacia.all { it > 100 }) // true
    println(vacia.none()) // true

}