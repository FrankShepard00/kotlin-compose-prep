package ejercicios6Mayo

/*
Ejercicio 2 - Retornar múltiples valores
Escribe una función que reciba una lista de calificaciones
y retorne la calificación mínima y máxima como Pair.
Luego desestructúralo al recibirlo.

- Recibe: calificaciones: List<Int>
- Retorna: Pair<Int, Int> (mínima, máxima)
*/

fun obtenerRango(calificaciones: List<Int>): Pair<Int, Int> {
    return calificaciones.min() to calificaciones.max()
}

fun main() {
    val calificaciones = listOf(85, 92, 78, 95, 60, 88)
    val (minima, maxima) = obtenerRango(calificaciones)
    println("Mínima: $minima, Máxima: $maxima")
    // Mínima: 60, Máxima: 95
}