package ejercicios5Abril

fun main() {
    val grupos = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    val resultado = grupos.map { grupo -> grupo.filter { numero -> numero % 2 == 0 } }
    println(resultado)
}