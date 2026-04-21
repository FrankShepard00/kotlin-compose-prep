package ejercicios5Abril

/*
Ejercicio 4 - Calcular suma segura
Escribe una función que reciba una lista nullable de enteros
y retorne su suma. Si la lista es null o está vacía, retorna 0.

- Recibe: numeros: List<Int>?
- Retorna: Int
- Usa safe call + Elvis
*/

fun sumaSegura(numeros: List<Int>?): Int {
    return numeros?.sum() ?: 0
}

fun main() {
    println(sumaSegura(listOf(1, 2, 3, 4, 5)))  // 15
    println(sumaSegura(emptyList()))              // 0
    println(sumaSegura(null))                     // 0
}