package ejercicios5Abril

/*
Ejercicio 6 - Ordenar nombres
La función recibe dos nombres y debe retornar
una lista con ambos ordenados alfabéticamente,
ignorando mayúsculas y minúsculas.

- Recibe: dos Strings
- Devuelve: List<String> con los dos nombres ordenados
*/

fun ordenarNombres(nombre1: String, nombre2: String): List<String> {
    return if (nombre1.compareTo(nombre2, ignoreCase = true) <= 0) {
        listOf(nombre1, nombre2)
    } else {
        listOf(nombre2, nombre1)
    }
}

fun main() {
    println(ordenarNombres("Carlos", "ana"))      // [ana, Carlos]
    println(ordenarNombres("BEATRIZ", "alberto")) // [alberto, BEATRIZ]
    println(ordenarNombres("kotlin", "Java"))     // [Java, kotlin]
}