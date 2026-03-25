package ejercicios4

/*
Ejercicio 5 - Normalizar datos de usuario
Escribe una función llamada `normalizarEmail` que reciba:
- email: String

Y retorne el email en minúsculas y sin espacios al inicio y al final.
*/

fun normalizarEmail(email: String) = email.trim().lowercase()

fun main() {
    println(normalizarEmail("  USUARIO@EMAIL.COM  "))  // usuario@email.com
    println(normalizarEmail("ANA@GMAIL.COM"))          // ana@gmail.com
    val vacio = ""
    println(vacio.uppercase())
    println(vacio.length)
}