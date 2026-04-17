package ejercicios5Abril

/*
Ejercicio 4 - Imprimir vocales con su posición
La función recibe un String y debe imprimir cada vocal
con su índice en formato "Posición X: Y".

- Recibe: String
- No retorna nada, solo imprime
- Usa forEachIndexed
*/

fun imprimirVocales(texto: String) {
    val vocales = "aeiouAEIOU"
    texto.forEachIndexed { i, char -> if (char in vocales) println("Posición $i: $char") }
}

fun main() {
    imprimirVocales("Kotlin")
    // Posición 1: o
    // Posición 4: i

    imprimirVocales("Hola")
    // Posición 1: o
    // Posición 3: a
}