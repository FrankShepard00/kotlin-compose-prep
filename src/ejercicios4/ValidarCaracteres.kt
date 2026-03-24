package ejercicios4

/*
Ejercicio 4 - Validador de caracteres
Escribe una función que reciba un Char y devuelva un String indicando
si el carácter es:
- Una letra minúscula (a-z)
- Una letra mayúscula (A-Z)
- Un dígito (0-9)
- Otro carácter

Usa rangos con 'in' para las verificaciones.
*/

fun clasificarChar(letra: Char) = when (letra) {
        in 'a'..'z' -> "Letra minúscula"
        in 'A'..'Z' -> "Letra mayúscula"
        in '0'..'9' -> "Dígito"
        else -> "Otro carácter"
}


fun main() {
    println(clasificarChar('m'))  // "Letra minúscula"
    println(clasificarChar('B'))  // "Letra mayúscula"
    println(clasificarChar('7'))  // "Dígito"
    println(clasificarChar('@'))  // "Otro carácter"

    val rango = 5..20 step 3
    println(rango.toList())
    println(rango.first)
    println(rango.last)
}
