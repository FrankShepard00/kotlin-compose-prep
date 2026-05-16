package ejercicios6Mayo

/*
Ejercicio 8 - Sistema de puntuaciones
Dado el mapa de puntuaciones, realiza estas operaciones:
1. Agrega a "Pedro" con 75 puntos
2. Actualiza la puntuación de "Ana" a 110
3. Elimina a "Carlos"
4. Imprime el total de puntos de todos los jugadores
*/

fun main() {
    val puntuaciones = mutableMapOf(
        "Ana" to 100,
        "Carlos" to 85,
        "María" to 92
    )

    puntuaciones["Pedro"] = 75
    puntuaciones["Ana"] = 110
    puntuaciones.remove("Carlos")
    println(puntuaciones.values.sum())

}