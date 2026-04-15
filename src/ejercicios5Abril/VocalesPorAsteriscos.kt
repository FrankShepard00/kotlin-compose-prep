package ejercicios5Abril

/*
Ejercicio 4 - Reemplazar vocales por asteriscos
La función recibe un String y debe retornar el mismo String
pero con todas las vocales reemplazadas por '*'.
Usa indices para iterar y construir el resultado.

- Recibe: String
- Devuelve: String
*/

fun censurarVocales(texto: String): String {
    var resultado = ""
    for (i in texto.indices) {
        resultado += if (texto[i].lowercase() in "aeiou") '*' else texto[i]
    }
    return resultado
}

fun main() {
    println(censurarVocales("Hola Mundo"))   // H*l* M*nd*
    println(censurarVocales("Kotlin"))       // K*tl*n
    println(censurarVocales("aeiou"))        // *****
}