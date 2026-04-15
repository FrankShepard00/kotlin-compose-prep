package ejercicios5Abril

fun main() {
    val texto = "Kotlin"
    val lista = listOf(10, 20, 30, 40, 50)
    val vacia = emptyList<Int>()

    println(texto.lastIndex)
    println(texto[texto.lastIndex])
    println(lista.lastIndex)
    println(vacia.lastIndex)
}