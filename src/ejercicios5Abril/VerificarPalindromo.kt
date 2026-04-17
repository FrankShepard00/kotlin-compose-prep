package ejercicios5Abril

/*
Ejercicio 5 - Verificar palíndromo
La función recibe un String y debe retornar true si es
palíndromo (se lee igual al derecho y al revés),
ignorando espacios y mayúsculas.
Usa iteración con rangos y lastIndex.

- Recibe: String
- Devuelve: Boolean
*/

fun esPalindromo(texto: String): Boolean {
    val textoLimpio = texto.filter { it.isLetterOrDigit() }.lowercase()
    var textoAlrevez = ""
    for (i in textoLimpio.lastIndex downTo 0) {
        textoAlrevez += textoLimpio[i]
    }
    return textoLimpio == textoAlrevez
}

fun main() {
    println(esPalindromo("Anita lava la tina"))  // true
    println(esPalindromo("Hola"))                // false
    println(esPalindromo("reconocer"))           // true
}