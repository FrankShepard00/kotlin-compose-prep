package ejercicios4

/*
Ejercicio 4 - Capitalizar palabras por índice
La función recibe un String con varias palabras y debe
retornar el mismo String pero con la primera letra de
cada palabra en mayúscula. Usa toCharArray() para modificar
los caracteres necesarios.

- Recibe: String
- Devuelve: String con primera letra de cada palabra en mayúscula
*/

fun capitalizarPalabras(texto: String): String {
    val listaPalabra = texto.split(" ")
    return listaPalabra.joinToString(" ") {
        val palabra = it.toCharArray()
        palabra[0] = palabra[0].uppercaseChar()
        palabra.concatToString()
    }
}

fun main() {
    println(capitalizarPalabras("hola mundo kotlin"))  // Hola Mundo Kotlin
    println(capitalizarPalabras("mi nombre es ana"))   // Mi Nombre Es Ana
}