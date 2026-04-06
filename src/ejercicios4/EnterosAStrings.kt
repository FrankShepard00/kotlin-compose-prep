package ejercicios4

/*
Ejercicio 5 - Convertir lista de strings a enteros
La función recibe una lista de Strings que pueden o no ser números válidos
y debe retornar la suma de todos los que sí sean números válidos,
ignorando los inválidos. Usa toIntOrNull() con Elvis operator.

- Recibe: List<String>
- Devuelve: Int con la suma de los válidos
*/

fun sumarValidos(datos: List<String>): Int {
    return datos.sumOf { it.toIntOrNull() ?: 0 }
}

fun main() {
    println(sumarValidos(listOf("10", "abc", "20", "xyz", "30")))  // 60
    println(sumarValidos(listOf("1", "2", "3")))                   // 6
    println(sumarValidos(listOf("abc", "xyz")))                    // 0
}

