package ejercicios5Abril

/*
Ejercicio 4 - Contar vocales
Escribe una función que reciba un String y cuente cuántas
vocales tiene, iterando sobre cada carácter con for.

- Recibe: texto: String
- Retorna: Int (número de vocales)
- Considera vocales: a, e, i, o, u (sin importar mayúsculas)
*/

fun contarVocales(texto: String): Int {
    var contador = 0
    for (letra in texto.lowercase()) if (letra in "aeiou") contador++
    return contador
}

fun main() {
    println(contarVocales("Kotlin"))      // 2
    println(contarVocales("Hola Mundo"))  // 4
    println(contarVocales("xyz"))         // 0
}