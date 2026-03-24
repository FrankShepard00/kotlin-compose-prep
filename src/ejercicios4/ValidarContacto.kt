package ejercicios4

/*
Ejercicio 4 - Validar datos de contacto
Escribe una función llamada `mostrarDatos` que reciba un parámetro:
- texto: String?

Debe retornar:
- La longitud del texto en mayúsculas si texto no es null
  Ejemplo: texto = "hola" → retorna 4
- -1 si texto es null

Usa safe call y Elvis operator.
*/

fun mostrarDatos(texto: String?) = texto?.length ?: -1

fun main() {
    println(mostrarDatos("hola"))     // 4
    println(mostrarDatos("Kotlin"))   // 6
    println(mostrarDatos(null))       // -1


}