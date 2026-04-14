package ejercicios4

fun main() {
    val texto = "Hola Mundo 123"
    val vocales = "aeiouAEIOU"

    println(texto.count())
    println(texto.count { it.isDigit() })
    println(texto.count { it.isWhitespace() })
    println(texto.count { it in vocales })


    // 14
    // 3
    // 2
    // 4
}