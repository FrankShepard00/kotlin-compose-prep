package ejercicios4

/*
Ejercicio 5 - Agregar comentario de bloque
El siguiente archivo no tiene documentación.
Agrega:
- Una cabecera de archivo con nombre, propósito y autor
- Un comentario de bloque explicando qué hace la función
*/

/*
* Nombre: Calculadora circúlo
* Propósito: Calcular el área de un circúlo
* Autor: Frank
* */

fun calcularAreaCirculo(radio: Double): Double {
    return 3.1416 * radio * radio
}

fun main() {
    println(calcularAreaCirculo(5.0))
}