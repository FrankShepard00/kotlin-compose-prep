package ejercicios6Mayo

fun main() {
    val nombres = listOf("Ana", "Alberto", "Beatriz", "Bruno", "Carlos")
    println(nombres.distinctBy { it.first() })
}