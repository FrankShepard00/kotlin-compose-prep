package ejercicios4

/*
Ejercicio 4 - Procesar entradas
Escribe una función que reciba una lista de Strings
y devuelva solo los que se pueden convertir a Int.
- Recibe: List<String>
- Devuelve: List<Int>
- Usa mapNotNull y toIntOrNull
*/

fun filtrarNumeros(lista: List<String>) = lista.mapNotNull { it.toIntOrNull() }


fun main() {
    val entradas = listOf("1", "abc", "3", "xyz", "5")
    println(filtrarNumeros(entradas))  // [1, 3, 5]
}