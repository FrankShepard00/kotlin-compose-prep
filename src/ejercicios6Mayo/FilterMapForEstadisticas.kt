package ejercicios6Mayo

/*
Ejercicio 6 - Estadísticas de estudiantes
Dado el mapa de estudiantes y calificaciones:
1. Filtra los que aprobaron (>= 70)
2. Transforma a strings con formato "[nombre]: [calificación]"
3. Imprime cada uno con forEach
4. Imprime cuántos aprobaron
*/

fun main() {
    val calificaciones = mapOf(
        "Ana" to 85.0,
        "Carlos" to 62.0,
        "María" to 91.0,
        "Pedro" to 55.0,
        "Laura" to 78.0
    )

    val aprobados = calificaciones.filter { it.value >= 70 }
        .map { "${it.key}: ${it.value}" }

    aprobados.forEach { println(it) }

    println(aprobados.size)

}

