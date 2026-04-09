package ejercicios4

fun main() {
    val original = "hola mundo"
    val chars = original.toCharArray()

    println(chars)                    // hola mundo
    println(chars::class.simpleName)  // CharArray

    // Modificar un carácter por índice
    chars[0] = chars[0].uppercaseChar()

    val resultado = String(chars)
    println(resultado)                        // Hola mundo
    println(resultado::class.simpleName)      // String

    // Alternativa idiomática para reconstruir el String
    println(chars.concatToString())           // Hola mundo
}