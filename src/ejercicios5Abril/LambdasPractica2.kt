package ejercicios5Abril

fun main() {
    val usuarios = mapOf(
        "ana" to 25,
        "carlos" to 17,
        "maria" to 30
    )

    val resultado = usuarios.filter { it.value >= 18 }
    println(resultado)
}