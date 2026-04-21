package ejercicios5Abril

/*
Ejercicio 4 - Imprimir números saltando el 3
Usa forEach con return@forEach para saltar el número 3
e imprimir el resto. Al final imprime "Terminado".

- La lista es: listOf(1, 2, 3, 4, 5)
*/

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    numeros.forEach {
        if (it == 3) return@forEach
        println(it)
    }
    // 1
    // 2
    // 4
    // 5
    // Terminado
}