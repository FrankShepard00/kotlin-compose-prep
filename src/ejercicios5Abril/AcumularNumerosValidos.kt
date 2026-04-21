package ejercicios5Abril

/*
Ejercicio 4 - Acumular números válidos
Escribe una función que procese una lista de números
usando do-while. Por cada número:
- Si es positivo, agrégalo a la suma
- Si es 0 o negativo, detén el bucle

Retorna la suma de los números positivos procesados.

- Recibe: numeros: List<Int>
- Retorna: Int
- Usa do-while ya que siempre procesas al menos el primer número
*/

fun acumularValidos(numeros: List<Int>): Int {
    var i = 0
    var suma = 0
    do {
        if (numeros[i] > 0) suma += numeros[i] else break
        i++
    } while (i <= numeros.lastIndex)
    return suma
}

fun main() {
    println(acumularValidos(listOf(10, 25, 30, -5, 15)))  // 65
    println(acumularValidos(listOf(-1, 10, 20)))           // 0
    println(acumularValidos(listOf(5, 10, 15)))            // 30
}