package ejercicios5Abril

/*
Ejercicio 3 - Invertir string manualmente
La función recibe un String y debe retornarlo invertido
usando lastIndex para iterar desde el final hacia el inicio.

- Recibe: String
- Devuelve: String invertido
*/

fun invertirString(texto: String): String {
    var resultado = ""
    for (i in texto.lastIndex downTo 0) {
        resultado += texto[i]
    }
    return resultado
}

fun main() {
    println(invertirString("Hola"))    // aloH
    println(invertirString("Kotlin"))  // niltok
    println(invertirString(""))        // (vacío)
}