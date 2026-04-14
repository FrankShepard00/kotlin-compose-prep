package ejercicios4

/*
Ejercicio 4 - Analizar texto
La función recibe un String y debe retornar un Map
con el conteo de: letras, dígitos, espacios y otros caracteres.

- Recibe: String
- Devuelve: Map<String, Int>
*/

fun analizarTexto(texto: String): Map<String, Int> {
    val letras = texto.count { it.isLetter() }
    val digitos = texto.count { it.isDigit() }
    val espacios = texto.count { it.isWhitespace() }
    val otros = texto.count() - letras - digitos - espacios
    return mapOf(
        "letras" to letras,
        "digitos" to digitos,
        "espacios" to espacios,
        "otros" to otros
    )
}

fun main() {
    val resultado = analizarTexto("Hola Mundo 123!")
    println(resultado)
    // {letras=9, digitos=3, espacios=2, otros=1}
}