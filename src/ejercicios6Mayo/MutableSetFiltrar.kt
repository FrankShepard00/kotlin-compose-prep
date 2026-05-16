package ejercicios6Mayo

/*
Ejercicio 6 - Filtrar participantes activos
Dado un conjunto de participantes, elimina los que
están en la lista de inactivos usando removeAll,
y luego verifica que "Ana" sigue en el conjunto.
*/

fun main() {
    val participantes = mutableSetOf("Ana", "Carlos", "María", "Juan", "Pedro")
    val inactivos = setOf("Carlos", "Juan")

    // Tu código aquí
    // Resultado: [Ana, María, Pedro]
    // Ana sigue activa: true
    participantes.removeAll(inactivos)
    println(participantes)
    println("Ana" in participantes)
}