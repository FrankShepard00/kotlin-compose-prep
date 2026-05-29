package ejercicios6Mayo

fun main() {
    val palabras = listOf("Kotlin", "Java", "Python", "Go", "Swift")
    val resultado = palabras.sortedByDescending { it.length }
    println(resultado)
    println(palabras)

}